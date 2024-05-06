package io.zerows.extension.runtime.crud.agent.api;

import io.vertx.core.json.JsonArray;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Adjust;
import io.vertx.up.annotations.EndPoint;
import io.vertx.up.eon.KName;
import io.vertx.up.eon.KWeb;
import io.zerows.core.web.io.annotations.BodyParam;
import io.zerows.extension.runtime.crud.eon.Addr;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

/*
 * Http Method: DELETE
 */
@EndPoint
@Path("/api")
public interface DeleteAgent {
    @DELETE
    @Path("/{actor}/{key}")
    @Address(Addr.Delete.BY_ID)
    @Adjust(KWeb.ORDER.MODULE)
    Boolean delete(@PathParam("actor") String actor,
                   @PathParam(KName.KEY) String key);

    @DELETE
    @Path("/batch/{actor}/delete")
    @Address(Addr.Delete.BATCH)
    @Adjust(KWeb.ORDER.MODULE)
    Boolean deleteBatch(@PathParam("actor") String actor,
                        @BodyParam JsonArray data);
}
