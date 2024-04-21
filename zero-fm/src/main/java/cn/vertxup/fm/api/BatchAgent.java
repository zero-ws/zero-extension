package cn.vertxup.fm.api;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.fm.cv.Addr;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.EndPoint;
import io.zerows.core.web.request.annotations.BodyParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

/**
 * @author lang : 2024-01-25
 */
@EndPoint
@Path("/api")
public interface BatchAgent {

    @POST
    @Path("/settlement/batch")
    @Address(Addr.Settle.FETCH_BY_KEY)
    JsonObject fetchSettlement(@BodyParam JsonArray keys);

    @POST
    @Path("/settlement/search")
    @Address(Addr.Settle.FETCH_BY_QR)
    JsonObject searchSettles(@BodyParam JsonObject qr);

    @POST
    @Path("/debt/batch")
    @Address(Addr.Settle.FETCH_DEBT)
    JsonObject fetchDebt(@BodyParam JsonArray keys);
}
