package io.vertx.mod.jet.init;

import io.macrocosm.specification.app.HAmbient;
import io.macrocosm.specification.app.HRegistry;
import io.vertx.core.Future;
import io.vertx.core.Vertx;
import io.vertx.mod.jet.atom.JtConfig;
import io.vertx.mod.ke.refine.Ke;

import java.util.concurrent.ConcurrentMap;

import static io.vertx.mod.jet.refine.Jt.LOG;

/*
 * Configuration of zero here
 * This extension configuration is different from other extension
 * The json config must be set in `vertx-jet.yml` or other tp extension
 */
public class JtPin implements HRegistry.Mod<Vertx> {

    public static JtConfig getConfig() {
        return JtConfiguration.getConfig();
    }

    public static ConcurrentMap<String, ServiceEnvironment> serviceEnvironment() {
        return JtConfiguration.serviceEnvironment();
    }

    @Override
    public Future<Boolean> configureAsync(final Vertx container, final HAmbient ambient) {
        Ke.banner("「Πίδακας δρομολογητή」- ( Api )");
        LOG.Init.info(this.getClass(), "JtConfiguration...");
        JtConfiguration.registry(ambient);
        LOG.Init.info(this.getClass(), "HAmbient Environment Start...");
        return JtConfiguration.init(container, ambient);
    }
}
