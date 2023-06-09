package io.vertx.mod.rbac.init;

import io.macrocosm.specification.app.HAmbient;
import io.macrocosm.specification.app.HRegistry;
import io.vertx.core.Vertx;
import io.vertx.mod.ke.refine.Ke;
import io.vertx.mod.rbac.atom.ScConfig;

import static io.vertx.mod.rbac.refine.Sc.LOG;

/*
 * Init Infusion for `initAsync` static life
 */
public class ScPin implements HRegistry.Mod<Vertx> {


    public static ScConfig getConfig() {
        return ScConfiguration.getConfig();
    }

    /* 新版模块注册器 */
    @Override
    public Boolean configure(final Vertx vertx, final HAmbient ambient) {
        Ke.banner("「Ακριβώς」- Rbac ( Sc )");
        LOG.Init.info(ScPin.class, "ScConfiguration...");
        ScConfiguration.registry(ambient);
        return Boolean.TRUE;
    }
}
