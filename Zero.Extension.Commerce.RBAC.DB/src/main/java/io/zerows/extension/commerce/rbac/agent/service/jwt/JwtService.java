package io.zerows.extension.commerce.rbac.agent.service.jwt;

import io.horizon.eon.VValue;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.up.unity.Ux;
import io.zerows.extension.commerce.rbac.domain.tables.daos.OAccessTokenDao;
import io.zerows.extension.commerce.rbac.domain.tables.pojos.OAccessToken;
import io.zerows.extension.commerce.rbac.uca.logged.ScUser;
import io.zerows.extension.commerce.rbac.util.Sc;

/*
 * Jwt WebToken Service for:
 * 1) Stored token information into jwt token
 * 2) Verify token based on stored access_token in database.
 */
public class JwtService implements JwtStub {
    @Override
    public Future<JsonObject> store(final String userKey, final JsonObject data) {
        /*
         * Jwt WebToken response building
         */
        final JsonObject response = Sc.jwtToken(data);
        /*
         * Jwt OAccessToken
         */
        final OAccessToken accessToken = Sc.jwtToken(response, userKey);
        /*
         * The data structure:
         * {
         *      "user": "X_USER key field, client key/user id here",
         *      "role": [
         *          {
         *              "roleId": "X_ROLE key field",
         *              "priority": 0
         *          }
         *      ],
         *      "group":[
         *          {
         *              "groupId": "X_GROUP key field",
         *              "priority": 0
         *          }
         *      ],
         *      "habitus": "128 bit random string",
         *      "session": "session id that vert.x generated"
         * }
         */
        return Ux.Jooq.on(OAccessTokenDao.class)
            .insertAsync(accessToken)
            .compose(item -> ScUser.login(data))
            .compose(logged -> Ux.future(response));
    }

    @Override
    public Future<Boolean> verify(final String userKey, final String token) {
        return Ux.Jooq.on(OAccessTokenDao.class)
            .<OAccessToken>fetchAsync("token", token.getBytes(VValue.DFT.CHARSET))
            .compose(tokens -> Sc.jwtToken(tokens, userKey));
    }
}
