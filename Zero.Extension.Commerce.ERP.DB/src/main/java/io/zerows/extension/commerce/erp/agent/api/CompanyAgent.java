package io.zerows.extension.commerce.erp.agent.api;

import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.EndPoint;
import io.zerows.extension.commerce.erp.eon.Addr;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

/*
 * Company Api information
 */
@EndPoint
@Path("/api")
public interface CompanyAgent {
    /*
     * /api/company/employee/:eid
     * Request: get company information by user id
     */
    @GET
    @Path("company/employee/:eid")
    @Address(Addr.Company.INFORMATION)
    JsonObject company(@PathParam("eid") String eid);
}
