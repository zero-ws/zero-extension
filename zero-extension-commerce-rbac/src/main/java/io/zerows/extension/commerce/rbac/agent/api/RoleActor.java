package io.zerows.extension.commerce.rbac.agent.api;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.EndPoint;
import io.vertx.up.eon.KName;
import io.zerows.core.domain.atom.commune.Vis;
import io.zerows.core.web.io.annotations.BodyParam;
import io.zerows.core.web.io.annotations.PointParam;
import io.zerows.extension.commerce.rbac.eon.Addr;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@EndPoint
@Path("/api")
public interface RoleActor {

    @POST
    @Path("/role")
    @Address(Addr.Role.ROLE_SAVE)
    Future<JsonObject> roleSave(@BodyParam JsonObject region);
}
