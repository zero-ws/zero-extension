package io.vertx.mod.jet.uca.tunnel;

import io.horizon.spi.jet.JtComponent;
import io.modello.atom.app.KIntegration;
import io.vertx.core.Future;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import io.zerows.core.feature.database.atom.Database;
import io.zerows.mbse.atom.worker.Mission;
import io.zerows.mbse.commune.ActIn;

public class ActorChannel extends AbstractChannel {
    /*
     * Adaptor is pure to access dynamic database here, the specification is as:
     * Step 1:
     * - The component defined Database reference, it could be initialized
     * Step 2:
     * - The component defined KIntegration reference, it could be initialized
     * Step 3:
     * - The component defined Mission reference, it could be initialized
     */
    @Override
    public Future<Boolean> initAsync(final JtComponent component, final ActIn request) {
        return Ux.future(this.commercial())
            /*
             * Database initialized, Mount database to `JtComponent`
             */
            .compose(Anagogic::databaseAsync)
            .compose(database -> Ut.contractAsync(component, Database.class, database))
            /*
             * KIntegration inited, mount to `JtComponent`
             */
            .compose(dbed -> Ux.future(this.commercial().integration()))
            .compose(integration -> Ut.contractAsync(component, KIntegration.class, integration))
            /*
             * Mission inited, mount to `JtComponent`
             */
            .compose(dbed -> Ux.future(this.mission()))
            .compose(mission -> Ut.contractAsync(component, Mission.class, mission));
    }
}
