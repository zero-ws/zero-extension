package cn.vertxup.doc.api;

import io.vertx.core.json.JsonObject;
import io.vertx.mod.doc.cv.Addr;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.EndPoint;
import io.zerows.core.web.request.annotations.BodyParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

/**
 * @author lang : 2023-09-14
 */
@EndPoint
@Path("/api")
public interface TokenApi {

    @Path("/doc/token")
    @POST
    @Address(Addr.TOKEN_REQUEST)
    JsonObject tokenRequest(@BodyParam JsonObject body);
}
