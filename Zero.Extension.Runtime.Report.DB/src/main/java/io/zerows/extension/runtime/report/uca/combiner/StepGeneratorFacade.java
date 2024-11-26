package io.zerows.extension.runtime.report.uca.combiner;

import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.up.unity.Ux;
import io.zerows.extension.runtime.report.atom.RGeneration;
import io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance;

/**
 * @author lang : 2024-11-25
 */
class StepGeneratorFacade extends AbstractStepGenerator {

    private final StepGenerator generatorNorm;
    private final StepGenerator generatorBelong;
    private final StepGenerator generatorAudit;
    private final StepGenerator generatorData;


    StepGeneratorFacade(final RGeneration generation) {
        super(generation);
        this.generatorNorm = of(generation, StepGeneratorNorm.class);
        this.generatorBelong = of(generation, StepGeneratorBelong.class);
        this.generatorAudit = of(generation, StepGeneratorAudit.class);
        this.generatorData = of(generation, StepGeneratorData.class);
    }

    @Override
    public Future<KpReportInstance> build(final KpReportInstance instance, final JsonObject params,
                                          final JsonArray sourceData) {
        return Ux.future(instance)
            /*
             *     name
             *     status
             *     type
             *     title
             *     subtitle
             *     extra
             *     description
             */
            .compose(processed -> this.generatorNorm.build(processed, params, sourceData))
            /*
             *     reportId
             *     reportBy
             *     reportAt
             *     refType
             *     refId
             */
            .compose(processed -> this.generatorBelong.build(processed, params, sourceData))
            /*
             *     active
             *     sigma
             *     language
             *     metadata
             */
            .compose(processed -> this.generatorAudit.build(processed, params, sourceData))
            /*
             *     reportData
             *     reportContent
             */
            .compose(processed -> this.generatorData.build(processed, params, sourceData));
    }
}
