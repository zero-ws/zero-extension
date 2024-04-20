package io.vertx.mod.jet.uca.aim;

import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.eventbus.DeliveryOptions;
import io.vertx.core.eventbus.EventBus;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.RoutingContext;
import io.vertx.mod.jet.atom.JtUri;
import io.vertx.mod.jet.monitor.JtMonitor;
import io.zerows.core.configuration.atom.NodeNetwork;
import io.zerows.core.configuration.store.ONodeCache;
import io.zerows.core.web.metadata.commune.Envelop;
import io.zerows.extension.dot.PluginExtension;
import io.zerows.launcher.backbone.hunt.Answer;

import java.util.Objects;

public class SendAim implements JtAim {

    private transient final JtMonitor monitor = JtMonitor.create(this.getClass());

    @Override
    public Handler<RoutingContext> attack(final JtUri uri) {
        /*
         * 「Booting Life Cycle」
         *  Code Area
         */
        return context -> {
            /*
             * 「Request Life Cycle」
             */
            final Envelop request = Answer.previous(context);
            /*
             * Set id here, consumer will extract api data in worker
             */
            request.key(uri.key());
            /*
             * Mount the same extension / plug-in in web request
             */
            final Future<Envelop> future = PluginExtension.Flower.next(context, request);
            future.onComplete(res -> {
                if (res.succeeded()) {
                    final Envelop normalized = res.result();
                    final JsonObject data = normalized.data();
                    final String address = uri.worker().getWorkerAddress(); // Address
                    /*
                     * Monitor data and address
                     */
                    this.monitor.aimSend(data, address);

                    final Vertx vertx = context.vertx();
                    final EventBus event = vertx.eventBus();

                    final NodeNetwork network = ONodeCache.of().network();
                    final DeliveryOptions deliveryOptions = network.get().optionDelivery();
                    event.<Envelop>request(address, normalized, deliveryOptions, handler -> {
                        if (handler.succeeded()) {
                            /*
                             * 「Success」
                             */
                            final Message<Envelop> result = handler.result();
                            Answer.reply(context, result.body(), uri::producesMime);
                        } else {
                            /*
                             * 「Failure」
                             */
                            final Envelop error = Envelop.failure(handler.cause());
                            Answer.reply(context, error);
                        }
                    });
                } else {
                    if (Objects.nonNull(res.cause())) {
                        res.cause().printStackTrace();
                    }
                }
            });

        };
    }
}
