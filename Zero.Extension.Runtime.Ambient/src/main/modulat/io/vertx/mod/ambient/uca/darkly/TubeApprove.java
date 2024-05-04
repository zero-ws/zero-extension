package io.vertx.mod.ambient.uca.darkly;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.ambient.cv.em.TubeType;
import io.vertx.up.eon.KName;
import io.zerows.extension.runtime.ambient.domain.tables.pojos.XActivityRule;

public class TubeApprove extends AbstractTube {
    @Override
    public Future<JsonObject> traceAsync(final JsonObject data, final XActivityRule rule) {
        return this.diffAsync(data, rule, KName.PHASE, () -> {
            /*
             * Approval Processing
             */
            final Tube tube = Tube.instance(TubeType.EXPRESSION);
            return tube.traceAsync(data, rule);
        });
    }
}
