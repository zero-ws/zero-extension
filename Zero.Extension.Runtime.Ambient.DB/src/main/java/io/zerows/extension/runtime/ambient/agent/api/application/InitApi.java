package io.zerows.extension.runtime.ambient.agent.api.application;

import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.EndPoint;
import io.vertx.up.eon.KWeb;
import io.zerows.core.web.io.annotations.BodyParam;
import io.zerows.extension.runtime.ambient.eon.Addr;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@EndPoint
@Path("/api")
public interface InitApi {

    @Path("/app/init")
    @POST
    @Address(Addr.Init.INIT)
    JsonObject init(@HeaderParam(KWeb.HEADER.X_APP_ID) String appId,
                    @BodyParam JsonObject body);

    @Path("/app/prepare/{name}")
    @POST
    @Address(Addr.Init.PREPARE)
    JsonObject prepare(@PathParam("name") String name);

    @Path("/app/connect")
    @POST
    @Address(Addr.Init.CONNECT)
    String connect(@BodyParam JsonObject body);
}
