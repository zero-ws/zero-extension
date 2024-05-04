package io.vertx.mod.atom.init;

import io.macrocosm.specification.app.HAmbient;
import io.macrocosm.specification.app.HRegistry;
import io.vertx.core.Vertx;
import io.vertx.mod.atom.modeling.config.AoConfig;
import io.zerows.extension.runtime.refine.Ke;

import static io.vertx.mod.atom.refine.Ao.LOG;

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
