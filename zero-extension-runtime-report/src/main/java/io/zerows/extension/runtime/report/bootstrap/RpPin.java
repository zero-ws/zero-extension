package io.zerows.extension.runtime.report.bootstrap;

import io.macrocosm.specification.app.HAmbient;
import io.macrocosm.specification.app.HRegistry;
import io.vertx.core.Vertx;
import io.zerows.extension.runtime.skeleton.refine.Ke;

/**
 * @author lang : 2024-07-25
 */
public class RpPin implements HRegistry.Mod<Vertx> {

    @Override
    public Boolean configure(final Vertx container, final HAmbient ambient) {
        Ke.banner("「Έντυπο αναφοράς」- Reporting ( Rp )");
        return true;
    }
}
