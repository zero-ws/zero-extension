package io.zerows.extension.runtime.report.api.agent;

import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Queue;
import io.zerows.extension.runtime.report.api.service.ReportStub;
import io.zerows.extension.runtime.report.eon.Addr;
import jakarta.inject.Inject;

/**
 * @author lang : 2024-10-08
 */
@Queue
public class ReportActor {
    @Inject
    private ReportStub reportStub;

    @Address(Addr.Report.QUERY_ALL)
    public Future<JsonArray> fetchAllReports(final String appId){
        return this.reportStub.fetchReports(appId);
    }
}
