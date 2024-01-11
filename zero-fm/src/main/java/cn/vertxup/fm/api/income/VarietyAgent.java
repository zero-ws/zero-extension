package cn.vertxup.fm.api.income;

import io.vertx.core.json.JsonObject;
import io.vertx.mod.fm.cv.Addr;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.EndPoint;
import io.vertx.up.eon.KName;
import jakarta.ws.rs.BodyParam;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

/**
 * 拆、冲、转
 *
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
@EndPoint
@Path("/api")
public interface VarietyAgent {

    @PUT
    @Path("/income-item/split/:key")
    @Address(Addr.BillItem.UP_SPLIT)
    JsonObject upSplit(@PathParam(KName.KEY) String key, @BodyParam JsonObject data);

    @PUT
    @Path("/income-item/revert/:key")
    @Address(Addr.BillItem.UP_REVERT)
    JsonObject upRevert(@PathParam(KName.KEY) String key, @BodyParam JsonObject data);

    @PUT
    @Path("/income-item/transfer/:key")
    @Address(Addr.Bill.UP_TRANSFER)
    JsonObject upTransfer(@PathParam(KName.KEY) String bookId, @BodyParam JsonObject data);
}
