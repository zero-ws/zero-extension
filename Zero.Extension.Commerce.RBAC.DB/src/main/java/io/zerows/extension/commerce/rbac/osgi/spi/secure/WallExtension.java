package io.zerows.extension.commerce.rbac.osgi.spi.secure;

import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.auth.authentication.AuthenticationProvider;
import io.vertx.ext.auth.authorization.AuthorizationProvider;
import io.vertx.ext.web.handler.AuthenticationHandler;
import io.vertx.ext.web.handler.AuthorizationHandler;
import io.vertx.up.eon.em.EmSecure;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import io.zerows.core.security.atom.Aegis;
import io.zerows.core.security.atom.AegisItem;
import io.zerows.core.security.zdk.LeeBuiltIn;
import io.zerows.core.security.zdk.LeeExtension;
import io.zerows.extension.commerce.rbac.plugins.authorization.ProfileProvider;
import io.zerows.extension.commerce.rbac.plugins.authorization.ProfileResource;
import io.zerows.plugins.common.security.authorization.AuthorizationBuiltInHandler;
import io.zerows.plugins.common.security.authorization.AuthorizationResource;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class WallExtension implements LeeExtension {
    /*
     * 401 call internal workflow
     */
    @Override
    public AuthenticationHandler authenticate(final Vertx vertx, final Aegis config) {
        final LeeBuiltIn internal = Ut.service(LeeBuiltIn.class);
        final Aegis copy = config.copy().setType(EmSecure.AuthWall.JWT);
        return internal.authenticate(vertx, copy);
    }

    @Override
    public AuthenticationProvider provider(final Vertx vertx, final Aegis config) {
        final LeeBuiltIn internal = Ut.service(LeeBuiltIn.class);
        final Aegis copy = config.copy().setType(EmSecure.AuthWall.JWT);
        return internal.provider(vertx, copy);
    }

    @Override
    public AuthorizationHandler authorization(final Vertx vertx, final Aegis config) {
        // Ignore handler class mode
        final AuthorizationResource resource = ProfileResource.create(config);
        final AuthorizationHandler handler = AuthorizationBuiltInHandler.create(resource);
        final AuthorizationProvider provider = ProfileProvider.provider(config);
        handler.addAuthorizationProvider(provider);
        // Ignore defined
        return handler;
    }

    @Override
    public String encode(final JsonObject data, final AegisItem config) {
        return Ux.Jwt.token(data);
    }

    @Override
    public JsonObject decode(final String token, final AegisItem config) {
        return Ux.Jwt.extract(token);
    }
}
