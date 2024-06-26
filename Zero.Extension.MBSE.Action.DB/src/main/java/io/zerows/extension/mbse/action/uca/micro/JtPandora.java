package io.zerows.extension.mbse.action.uca.micro;

import io.horizon.atom.program.KRef;
import io.horizon.eon.em.web.EmTraffic;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.up.fn.Fn;
import io.vertx.up.util.Ut;
import io.zerows.core.web.model.commune.Envelop;
import io.zerows.core.web.model.zdk.Commercial;
import io.zerows.core.web.scheduler.atom.Mission;
import io.zerows.extension.mbse.action.exception._424ChannelConflictException;
import io.zerows.extension.mbse.action.exception._424ChannelDefineException;
import io.zerows.extension.mbse.action.exception._424ChannelDefinitionException;
import io.zerows.extension.mbse.action.osgi.spi.jet.JtChannel;
import io.zerows.extension.mbse.action.uca.monitor.JtMonitor;
import io.zerows.extension.mbse.action.uca.tunnel.ActorChannel;
import io.zerows.extension.mbse.action.uca.tunnel.AdaptorChannel;
import io.zerows.extension.mbse.action.uca.tunnel.ConnectorChannel;
import io.zerows.extension.mbse.action.uca.tunnel.DirectorChannel;

import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

/*
 * Channel uniform interface call
 */
class JtPandora {

    private static final ConcurrentMap<EmTraffic.Channel, Class<?>> EXPECTED_MAP =
        new ConcurrentHashMap<EmTraffic.Channel, Class<?>>() {
            {
                this.put(EmTraffic.Channel.ADAPTOR, AdaptorChannel.class);
                this.put(EmTraffic.Channel.CONNECTOR, ConnectorChannel.class);
                this.put(EmTraffic.Channel.DIRECTOR, DirectorChannel.class);
                this.put(EmTraffic.Channel.ACTOR, ActorChannel.class);
            }
        };

    static Future<Envelop> async(final Envelop envelop,
                                 final Commercial commercial,
                                 final Mission mission,
                                 final KRef refer,
                                 final JtMonitor monitor) {
        /* Channel class for current consumer thread */
        final Class<?> channelClass = getChannel(commercial);

        /* Initialization for channel */
        final JtChannel channel = Ut.instance(channelClass);

        /* Find the target Field */
        Ut.contract(channel, Commercial.class, commercial);
        Ut.contract(channel, Mission.class, mission);

        /* Dictionary */
        if (Objects.nonNull(refer)) {
            final ConcurrentMap<String, JsonArray> dict = refer.get();
            if (Objects.nonNull(dict)) {
                Ut.contract(channel, ConcurrentMap.class, dict);
            }
        }

        monitor.channelHit(channelClass);
        /* Transfer the `Envelop` request data into channel and let channel do next works */
        return channel.transferAsync(envelop);
    }

    /*
     * Http Web request entrance
     * 1 - Envelop: default zero data request that has been wrapper
     * 2 - Commercial: The default metadata that defined Api here.
     */
    static Future<Envelop> async(final Envelop envelop, final Commercial commercial,
                                 final JtMonitor monitor) {
        /*
         * KRef is only OK when Job
         * 1) KIncome / Component / Outcome Shared KRef
         * 2) In Api mode, it's not needed
         */
        return async(envelop, commercial, null, null, monitor);
    }

    private static Class<?> getChannel(final Commercial commercial) {
        /*
         * Channel class for current consumer thread
         */
        final Class<?> channelClass = commercial.channelComponent();
        final EmTraffic.Channel channelType = commercial.channelType();
        /*
         * Super class definitions
         */
        if (EmTraffic.Channel.DEFINE == channelType) {
            Fn.out(!Ut.isImplement(channelClass, JtChannel.class),
                _424ChannelDefineException.class, JtPandora.class,
                channelClass.getName());
        } else {
            /*
             * The channelClass must be in EXPECTED_MAP
             */
            Fn.out(!EXPECTED_MAP.containsValue(channelClass),
                _424ChannelDefinitionException.class, JtPandora.class,
                Ut.fromJoin(EXPECTED_MAP.values().stream().map(Class::getSimpleName).collect(Collectors.toSet())),
                channelClass);
            /*
             * The channel type must match the target class specification.
             */
            final Class<?> expectedClass = EXPECTED_MAP.get(channelType);
            Fn.out(expectedClass != channelClass,
                _424ChannelConflictException.class, JtPandora.class,
                channelClass.getName(), channelType);
        }
        /*
         * Channel class extract here.
         */
        return channelClass;
    }

}
