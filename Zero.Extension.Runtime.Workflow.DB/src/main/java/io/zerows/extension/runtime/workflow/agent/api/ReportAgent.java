package io.zerows.extension.runtime.workflow.agent.api;

import io.zerows.extension.runtime.workflow.eon.HighWay;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.EndPoint;
import io.zerows.core.web.io.annotations.BodyParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

/**
 * KRef actor part to get data format
 *
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
@EndPoint
@Path("/api")
public interface ReportAgent {
    // Testing Passed ---------------------------
    @POST
    @Path("/up/report/list")
    @Address(HighWay.Report.TICKET_LIST)
    JsonObject list(@BodyParam JsonObject body);

    @POST
    @Path("/up/report/activity")
    @Address(HighWay.Report.TICKET_ACTIVITY)
    JsonArray fetchActivity(@BodyParam JsonObject body);
}
