package cn.vertxup.fm.api.end;

import io.vertx.core.json.JsonObject;
import io.vertx.mod.fm.cv.Addr;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.EndPoint;
import io.vertx.up.eon.KName;
import jakarta.ws.rs.*;

/**
 * @author lang : 2024-01-11
 */
@EndPoint
@Path("/api")
public interface VarietyAgent {
    /*
     * settlementId for payment creation
     * {
     *      "cross":"true / false",
     *      "payment": []
     * }
     * payment + payment items
     * 1: 1 ( cross = true, size = 1)
     * 1: N ( cross = false, size > 1)
     */
    @Path("/payment/create")
    @POST
    @Address(Addr.Settle.PAY_CREATE)
    JsonObject paymentCreate(@BodyParam JsonObject payment);

    @Path("/payment/cascade/:key")
    @DELETE
    @Address(Addr.Settle.PAY_DELETE)
    JsonObject paymentDelete(@PathParam(KName.KEY) String key);
}
