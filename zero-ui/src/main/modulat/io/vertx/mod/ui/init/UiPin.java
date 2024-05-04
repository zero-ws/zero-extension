package io.vertx.mod.ui.init;

import io.macrocosm.specification.app.HAmbient;
import io.macrocosm.specification.app.HRegistry;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonArray;
import io.zerows.extension.runtime.skeleton.refine.Ke;

import static io.vertx.mod.ui.refine.Ui.LOG;

public class UiPin implements HRegistry.Mod<Vertx> {

    public static JsonArray getOp() {
        return UiConfiguration.getOp();
    }

    public static JsonArray getColumn(final String identifier) {
        return UiConfiguration.getColumn(identifier);
    }

    public static JsonArray attributes(final String identifier) {
        return UiConfiguration.attributes(identifier);
    }

    public static String keyControl() {
        return UiConfiguration.keyControl();
    }

    public static String keyOps() {
        return UiConfiguration.keyOps();
    }

    public static int keyExpired() {
        return UiConfiguration.getConfig().getCacheExpired();
    }

    @Override
    public Boolean configure(final Vertx vertx, final HAmbient ambient) {
        Ke.banner("「Διασύνδεση χρήστη」- ( Ui )");
        LOG.Init.info(UiPin.class, "UiConfiguration...");
        UiConfiguration.registry(ambient);
        return Boolean.TRUE;
    }
}
