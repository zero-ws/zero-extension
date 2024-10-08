package io.zerows.extension.runtime.report.api.agent;

import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.EndPoint;
import io.zerows.extension.runtime.report.eon.Addr;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.Path;

/**
 * @author lang : 2024-10-08
 */
@EndPoint
@Path("/api")
public interface ReportAgent {

    @GET
    @Path("/report/query-all")
    @Address(Addr.Report.QUERY_ALL)
    Future<JsonArray> fetchAllReports(@HeaderParam("X-App-Id") final String appId);
}
