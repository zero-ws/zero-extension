package io.zerows.extension.mbse.basement.bootstrap;

import io.macrocosm.specification.app.HAmbient;
import io.macrocosm.specification.app.HRegistry;
import io.vertx.core.Vertx;
import io.zerows.extension.mbse.basement.atom.config.AoConfig;
import io.zerows.extension.runtime.skeleton.refine.Ke;

import static io.zerows.extension.mbse.basement.util.Ao.LOG;

public class AoPin implements HRegistry.Mod<Vertx> {
    public static AoConfig getConfig() {
        return AoConfiguration.getConfig();
    }

    /** 模块注册器 */
    @Override
    public Boolean configure(final Vertx container, final HAmbient ambient) {
        Ke.banner("「διαμορφωτής」- Atom ( Ao )");
        LOG.Init.info(AoPin.class, "AoConfiguration...");
        AoConfiguration.registry(ambient);
        return true;
    }
}
