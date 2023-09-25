package cn.vertxup.doc.api.annotate;

import io.vertx.core.json.JsonArray;
import io.vertx.mod.doc.cv.Addr;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.EndPoint;
import io.vertx.up.eon.KName;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

/**
 * @author lang : 2023-09-25
 */
@EndPoint
@Path("/api")
public interface NodeApi {

    @GET
    @Path("/comment/m/:identifier/:key")
    @Address(Addr.Comment.BY_MODEL)
    JsonArray fetchByModel(@PathParam(KName.IDENTIFIER) String modelId,
                           @PathParam(KName.KEY) String modelKey);
}
