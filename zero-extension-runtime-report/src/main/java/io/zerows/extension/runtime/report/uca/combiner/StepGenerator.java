package io.zerows.extension.runtime.report.uca.combiner;

import io.horizon.uca.cache.Cc;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.up.util.Ut;
import io.zerows.core.metadata.uca.logging.OLog;
import io.zerows.extension.runtime.report.atom.RGeneration;
import io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance;

/**
 * @author lang : 2024-11-25
 */
public interface StepGenerator {

    Cc<String, StepGenerator> CC_SKELETON = Cc.openThread();

    static StepGenerator of(final RGeneration generation) {
        return AbstractStepGenerator.of(generation, StepGeneratorFacade.class);
    }

    Future<KpReportInstance> build(KpReportInstance instance, JsonObject request, JsonArray sourceData);

    default OLog logger() {
        return Ut.Log.data(getClass());
    }
}
