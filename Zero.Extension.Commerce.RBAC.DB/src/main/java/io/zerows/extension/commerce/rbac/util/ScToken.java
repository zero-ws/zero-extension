package io.zerows.extension.commerce.rbac.util;

import io.horizon.eon.VValue;
import io.horizon.exception.WebException;
import io.horizon.uca.log.Annal;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.up.unity.Ux;
import io.zerows.core.domain.atom.typed.UObject;
import io.zerows.extension.commerce.rbac.atom.ScConfig;
import io.zerows.extension.commerce.rbac.bootstrap.ScPin;
import io.zerows.extension.commerce.rbac.domain.tables.pojos.OAccessToken;
import io.zerows.extension.commerce.rbac.eon.AuthKey;
import io.zerows.extension.commerce.rbac.eon.AuthMsg;
import io.zerows.extension.commerce.rbac.exception._401TokenCounterException;
import io.zerows.extension.commerce.rbac.exception._401TokenExpiredException;
import io.zerows.extension.commerce.rbac.exception._401TokenInvalidException;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import static io.zerows.extension.commerce.rbac.util.Sc.LOG;

class ScToken {
    private static final Annal LOGGER = Annal.get(ScToken.class);
    private static final ScConfig CONFIG = ScPin.getConfig();

    /*
     * Normalize Jwt WebToken data
     */
    static Future<Boolean> jwtToken(final List<OAccessToken> item, final String userId) {
        WebException error = null;
        if (null == item) {
            // WebToken Size
            LOG.Auth.info(LOGGER, AuthMsg.TOKEN_SIZE_NULL, item, userId);
            error = new _401TokenCounterException(ScToken.class, 0, userId);
        } else {
            if (item.isEmpty()) {
                // WebToken Size
                LOG.Auth.info(LOGGER, AuthMsg.TOKEN_SIZE_EMPTY, item, userId);
                error = new _401TokenCounterException(ScToken.class, 0, userId);
            } else if (1 < item.size()) {
                // WebToken Size
                LOG.Auth.info(LOGGER, AuthMsg.TOKEN_SIZE_MULTI, item, userId);
                error = new _401TokenCounterException(ScToken.class, item.size(), userId);
            } else {
                final OAccessToken token = item.get(VValue.IDX);
                final String tokenString = new String(token.getToken(), io.horizon.eon.VValue.DFT.CHARSET);
                final byte[] authBytes = userId.getBytes(io.horizon.eon.VValue.DFT.CHARSET);
                if (Arrays.equals(authBytes, token.getAuth())) {
                    // WebToken expired
                    final long currentTime = new Date().getTime();
                    final long tokenTime = token.getExpiredTime();
                    if (tokenTime < currentTime) {
                        LOG.Auth.info(LOGGER, AuthMsg.TOKEN_EXPIRED, tokenString, tokenTime);
                        error = new _401TokenExpiredException(ScToken.class, tokenString);
                    }
                } else {
                    // WebToken invalid
                    LOG.Auth.info(LOGGER, AuthMsg.TOKEN_INVALID, tokenString);
                    error = new _401TokenInvalidException(ScToken.class, tokenString);
                }
            }
        }
        if (null == error) {
            return Ux.future(Boolean.TRUE);
        } else {
            return Future.failedFuture(error);
        }
    }

    static JsonObject jwtToken(final JsonObject data) {
        /* WebToken Data Extract */
        final JsonObject tokenData = UObject.create(data.copy())
            .remove("role", "group").to();
        LOG.Auth.info(LOGGER, AuthMsg.TOKEN_JWT, tokenData.encode());
        /* WebToken */
        final String token = Ux.Jwt.token(tokenData);

        /* Response */
        final JsonObject response = new JsonObject();
        response.put(AuthKey.ACCESS_TOKEN, token);

        /* Refresh WebToken */
        final String refreshToken = Ux.Jwt.token(response.copy());
        response.put(AuthKey.REFRESH_TOKEN, refreshToken);

        /* WebToken Expired */
        final Long iat = new Date().getTime() + CONFIG.getTokenExpired();
        response.put(AuthKey.IAT, iat);
        return response;
    }

    static OAccessToken jwtToken(final JsonObject jwt, final String userKey) {
        /* WebToken byte[] */
        final byte[] token = jwt.getString(AuthKey.ACCESS_TOKEN).getBytes(io.horizon.eon.VValue.DFT.CHARSET);
        /* Refresh WebToken byte[] */
        final byte[] refreshToken = jwt.getString(AuthKey.REFRESH_TOKEN).getBytes(io.horizon.eon.VValue.DFT.CHARSET);
        final Long iat = jwt.getLong(AuthKey.IAT);
        return new OAccessToken()
            .setKey(UUID.randomUUID().toString())
            .setAuth(userKey.getBytes(io.horizon.eon.VValue.DFT.CHARSET))

            /* Created Auditor */
            .setCreatedBy(userKey)
            .setCreatedAt(LocalDateTime.now())

            /* WebToken Info */
            .setToken(token)
            .setRefreshToken(refreshToken)
            .setExpiredTime(iat)

            /* Active */
            .setActive(Boolean.TRUE);
    }
}
