package cn.vertxup.fm.api.end;

import io.vertx.core.json.JsonObject;
import io.vertx.mod.fm.cv.Addr;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.EndPoint;
import jakarta.ws.rs.BodyParam;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;

/**
 * @author lang : 2024-02-20
 */
@EndPoint
@Path("/api")
public interface TransAgent {

    @Path("/trans-proc/standard")
    @PUT
    @Address(Addr.Trans.END_TRANS)
    JsonObject finishAsync(@BodyParam JsonObject body);

    @Path("/trans-proc/debt")
    @PUT
    @Address(Addr.Trans.END_DEBT)
    JsonObject debtAsync(@BodyParam JsonObject body);
}
