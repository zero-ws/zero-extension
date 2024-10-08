package io.zerows.extension.commerce.rbac.plugins;

import io.horizon.uca.log.Annal;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.auth.User;
import io.vertx.up.eon.KName;
import io.zerows.core.security.annotations.Authenticate;
import io.zerows.core.security.annotations.Authorized;
import io.zerows.core.security.annotations.AuthorizedResource;
import io.zerows.core.security.annotations.Wall;
import io.zerows.extension.commerce.rbac.agent.service.accredit.AccreditStub;
import io.zerows.extension.commerce.rbac.agent.service.login.jwt.JwtStub;
import io.zerows.extension.commerce.rbac.eon.AuthMsg;
import jakarta.inject.Inject;

import static io.zerows.extension.commerce.rbac.util.Sc.LOG;

/**
 * Interface defined for component
 */
@Wall(value = "extension", path = "/api/*")
public class RbacWall {
    private static final Annal LOGGER = Annal.get(RbacWall.class);
    @Inject
    private transient JwtStub jwtStub;
    @Inject
    private transient AccreditStub accredit;

    @Authenticate
    public Future<Boolean> authenticate(final JsonObject data) {
        final String token = data.getString(KName.ACCESS_TOKEN);
        final String user = data.getString(KName.USER);
        // No Cache
        LOG.Auth.info(LOGGER, AuthMsg.TOKEN_INPUT, token, user);
        return this.jwtStub.verify(user, token);
    }

    @Authorized
    public Future<JsonObject> authorize(final User user) {
        return this.accredit.profile(user);
    }

    @AuthorizedResource
    public Future<JsonObject> resource(final JsonObject params) {
        return this.accredit.resource(params);
    }
}
