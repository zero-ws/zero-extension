package cn.vertxup.battery.api;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.battery.cv.Addr;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.EndPoint;
import io.vertx.up.eon.KWeb;
import io.zerows.annotations.jakarta.BodyParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
@EndPoint
@Path("/api")
public interface BagAgent {
    /*
     * Fetch all bags in current application
     */
    @GET
    @Path("/bag")
    @Address(Addr.Module.FETCH)
    JsonArray bag(@HeaderParam(KWeb.HEADER.X_APP_ID) String appId);

    /*
     * Fetch all bags that type = "EXTENSION" only, it will show
     * on the front page of `/system/setting` here.
     *
     */
    @GET
    @Path("/bag/extension")
    @Address(Addr.Module.BY_EXTENSION)
    JsonArray bagByApp(@HeaderParam(KWeb.HEADER.X_APP_ID) String appId);

    /*
     * {
     *      "key": "Block Key",
     *      "status": "DISABLED | ENABLED"
     * }
     */
    @POST
    @Path("/block/process")
    @Address(Addr.Module.UP_PROCESS)
    Boolean process(@BodyParam JsonObject body);

    /*
     * {
     *      "key": "Block Key",
     *      "license": [{
     *          "license files"
     *      }]
     * }
     */
    @POST
    @Path("/block/authorize")
    @Address(Addr.Module.UP_AUTHORIZE)
    Boolean authorize(@BodyParam JsonObject body);
}
