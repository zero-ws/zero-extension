package io.mature.stellar;

import io.horizon.atom.datamation.KFabric;
import io.horizon.eon.em.Environment;
import io.horizon.exception.internal.BootIoMissingException;
import io.horizon.spi.BootIo;
import io.horizon.uca.boot.KConfigurer;
import io.horizon.uca.boot.KEnvironment;
import io.horizon.uca.cache.Cc;
import io.horizon.util.HUt;
import io.macrocosm.specification.config.HConfig;
import io.macrocosm.specification.config.HEnergy;
import io.mature.stellar.owner.DevelopmentA;
import io.mature.stellar.owner.MockitoA;
import io.mature.stellar.owner.OkA;
import io.mature.stellar.owner.ProductionA;
import io.mature.stellar.vendor.OkB;
import io.vertx.boot.supply.Electy;
import io.vertx.core.Future;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import io.vertx.up.annotations.Up;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import io.zerows.extension.mbse.basement.atom.builtin.DataAtom;
import io.zerows.extension.mbse.basement.exception._417DataAtomNullException;

import java.util.Objects;
import java.util.function.Supplier;

/**
 * @author lang : 2023-06-13
 */
@Up
public class Ok {

    private static final Cc<Environment, Future<OkA>> CC_A = Cc.openA();

    public static Future<KFabric> fabric(final DataAtom atom, final String nameB) {
        if (Objects.isNull(atom)) {
            return Ut.Bnd.failOut(_417DataAtomNullException.class, Ok.class);
        }
        return of(Environment.Production).compose(okA -> {
            final OkB partyB = okA.partyB(nameB);
            return partyB.fabric(atom.identifier()).compose(fabric -> {
                fabric.mapping().bind(atom.type());
                return Ux.future(fabric);
            });
        });
    }

    public static Future<OkA> of(final Environment environment) {
        return of(Ux.nativeVertx(), environment).otherwise(Ux.otherwise(null));
    }

    public static Future<OkA> of(final Vertx vertx, final Environment environment) {
        return switch (environment) {
            case Mockito -> CC_A.pick(() -> of(vertx, MockitoA::new), Environment.Mockito);
            case Production -> CC_A.pick(() -> of(vertx, ProductionA::new), Environment.Production);
            case Development -> CC_A.pick(() -> of(vertx, DevelopmentA::new), Environment.Development);
        };
    }

    private static Future<OkA> of(final Vertx vertx, final Supplier<OkA> supplier) {
        final KConfigurer<Vertx> configurer = configurer();
        final Promise<OkA> promise = Promise.promise();
        // 触发 Pre
        final HConfig config = configurer.onConfig();
        configurer.preExecute(vertx, config);
        // whenInstruction 中会执行应用注册，得到最终的 HAmbient 信息
        Electy.whenInstruction((vertxRef, configRef) -> {
            final OkA okA = supplier.get();
            promise.complete(okA);
        }).accept(vertx, configurer.onConfig());
        return promise.future();
    }

    private static KConfigurer<Vertx> configurer() {
        /*  提取SPI部分，严格模式  */
        final BootIo io = HUt.service(BootIo.class);
        if (Objects.isNull(io)) {
            throw new BootIoMissingException(Ok.class);
        }
        final HEnergy energy = io.energy(Ok.class, new String[]{});


        /*
         * 环境提取，此处环境变量提取为非容器启动环境，而是单纯的模拟环境处理，这样的处理模式之下
         * 环境变量为测试 Mock 提供了第一模拟环境，来完成环境变量基础注入流程
         **/
        KEnvironment.initialize();

        return KConfigurer.of(energy);
    }
}
