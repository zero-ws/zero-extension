package io.zerows.extension.commerce.rbac.util;

import io.horizon.eon.VValue;
import io.vertx.core.Future;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import io.zerows.core.metadata.uca.logging.OLog;
import io.zerows.extension.commerce.rbac.atom.ScToken;
import io.zerows.extension.commerce.rbac.eon.AuthMsg;
import io.zerows.extension.commerce.rbac.exception._401TokenCounterException;
import io.zerows.extension.commerce.rbac.exception._401TokenExpiredException;
import io.zerows.extension.commerce.rbac.exception._401TokenInvalidException;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

/**
 * 新的工具类
 *
 * @author lang : 2024-09-14
 */
class ScSession {

    private static OLog ofLogger(final Class<?> caller) {
        return Ut.Log.security(caller);
    }

    /**
     * Token 验证
     *
     * @param scToken 存储的 Token
     * @param userKey 传入的 客户端 ID
     * @param token   传入的 Token
     * @param caller  调用者
     *
     * @return 正确与否
     */
    static Future<Boolean> tokenVerify(final ScToken scToken, final String userKey,
                                       final String token, final Class<?> caller) {
        // 无法找到 Token
        if (Objects.isNull(scToken)) {
            // WebToken size
            ofLogger(caller).info(AuthMsg.TOKEN_SIZE_NULL, null, userKey);
            return Future.failedFuture(
                Ut.Bnd.failureWeb(_401TokenCounterException.class, caller, 0, userKey));
        }


        // Token 不匹配
        final byte[] authBytes = token.getBytes(VValue.DFT.CHARSET);
        if (!Arrays.equals(authBytes, scToken.authToken())) {
            // WebToken invalid
            ofLogger(caller).info(AuthMsg.TOKEN_INVALID, token);
            return Future.failedFuture(
                Ut.Bnd.failureWeb(_401TokenInvalidException.class, caller, token)
            );
        }


        // Token 超时
        final long currentAt = new Date().getTime();
        final long expiredAt = scToken.expiredAt();
        if (expiredAt < currentAt) {
            ofLogger(caller).info(AuthMsg.TOKEN_EXPIRED, token, expiredAt);
            return Future.failedFuture(
                Ut.Bnd.failureWeb(_401TokenExpiredException.class, caller, token)
            );
        }

        return Ux.futureT();
    }
}
