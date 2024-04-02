package cn.vertxup.integration.api;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.is.cv.Addr;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.EndPoint;
import io.vertx.up.eon.KName;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

/**
 * 站内信提取器
 *
 * @author lang : 2024-04-02
 */
@EndPoint
@Path("/api")
public interface MessageAgent {


    @Path("/message/by/:type")
    @GET
    @Address(Addr.Message.FETCH_TYPED)
    JsonArray fetchTyped(@PathParam(KName.TYPE) String type);

    @Path("/message/:key/:status")
    @PUT
    @Address(Addr.Message.UPDATE_STATUS)
    JsonObject readMessage(@PathParam(KName.KEY) String key,
                           @PathParam(KName.STATUS) String status);
}
