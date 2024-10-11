package io.zerows.extension.runtime.report.api.agent;

import io.horizon.uca.qr.syntax.Ir;
import io.vertx.core.Future;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Queue;
import io.vertx.up.util.Ut;
import io.zerows.extension.runtime.report.api.service.ReportInstanceStub;
import io.zerows.extension.runtime.report.api.service.ReportStub;
import io.zerows.extension.runtime.report.eon.Addr;
import io.zerows.extension.runtime.report.exception._400QueryParameterException;
import io.zerows.extension.runtime.report.exception._404ReportMissingException;
import jakarta.inject.Inject;

/**
 * @author lang : 2024-10-08
 */
@Queue
public class ReportActor {
    @Inject
    private ReportStub reportStub;

    @Inject
    private ReportInstanceStub instanceStub;

    @Address(Addr.Report.QUERY_ALL)
    public Future<JsonArray> fetchAllReports(final String appId) {
        return this.reportStub.fetchReports(appId);
    }

    @Address(Addr.Report.QUERY_PAGE)
    public Future<JsonObject> instancePaged(final JsonObject query) {
        final JsonObject criteriaJ = Ut.valueJObject(query, Ir.KEY_CRITERIA);
        if (Ut.isNil(criteriaJ)) {
            // ERR-80700
            return Ut.Bnd.failOut(_400QueryParameterException.class, this.getClass(), query);
        }
        return this.instanceStub.searchPaged(query);
    }

    @Address(Addr.Report.SINGLE_GENERATE)
    public Future<JsonObject> instanceGenerate(final String reportId,
                                               final JsonObject query) {
        if (Ut.isNil(reportId)) {
            // ERR-80701
            return Ut.Bnd.failOut(_404ReportMissingException.class, this.getClass());
        }
        return this.instanceStub.generateAsync(query);
    }

    @Address(Addr.Report.SINGLE_EXPORT)
    public Future<Buffer> instanceExport(final String instanceId) {
        return this.instanceStub.exportAsync(instanceId);
    }
}
