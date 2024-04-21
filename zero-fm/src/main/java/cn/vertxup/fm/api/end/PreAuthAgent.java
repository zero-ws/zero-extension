package cn.vertxup.fm.api.end;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.fm.cv.Addr;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.EndPoint;
import io.zerows.core.web.io.annotations.BodyParam;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;

/**
 * 预授权解锁处理
 *
 * @author lang : 2024-01-11
 */
@EndPoint
@Path("/api")
public interface PreAuthAgent {

    /*
     * Unlock Authorize when settlement on `status`
     * From `Pending` to `Finished`
     */
    @PUT
    @Path("/settle/authorize/unlock")
    @Address(Addr.Settle.UNLOCK_AUTHORIZE)
    JsonObject unlockAuthorize(@BodyParam JsonArray authorize);
}
