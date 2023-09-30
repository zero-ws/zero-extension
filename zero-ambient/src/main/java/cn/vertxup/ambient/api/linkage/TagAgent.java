package cn.vertxup.ambient.api.linkage;

import io.vertx.core.json.JsonObject;
import io.vertx.mod.ambient.cv.Addr;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.EndPoint;
import io.vertx.up.eon.KName;
import jakarta.ws.rs.*;

/**
 * @author lang : 2023-09-28
 */
@EndPoint
@Path("/api")
public interface TagAgent {

    @POST
    @Path("/x-tag")
    @Address(Addr.Tag.SYNC_SAVE)
    JsonObject saveTag(@BodyParam JsonObject body);

    @DELETE
    @Path("/x-tag/:key")
    @Address(Addr.Tag.SYNC_DELETE)
    JsonObject deleteTag(@PathParam(KName.KEY) String key);

    @DELETE
    @Path("/x-tag/m/:identifier/:key/:tid")
    @Address(Addr.Tag.REMOVE_BY_MODEL)
    JsonObject unlinkAsync(@PathParam(KName.IDENTIFIER) String modelId,
                           @PathParam(KName.KEY) String modelKey,
                           @PathParam("tid") String tagId);

    @GET
    @Path("/x-tag/m/:identifier/:key")
    @Address(Addr.Tag.FETCH_BY_MODEL)
    JsonObject fetchByModel(@PathParam(KName.IDENTIFIER) String modelId,
                            @PathParam(KName.KEY) String modelKey);
}
