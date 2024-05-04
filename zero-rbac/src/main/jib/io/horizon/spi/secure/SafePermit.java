package io.horizon.spi.secure;

import cn.vertxup.rbac.domain.tables.daos.OAccessTokenDao;
import cn.vertxup.rbac.domain.tables.pojos.OAccessToken;
import io.horizon.eon.VValue;
import io.zerows.extension.runtime.skeleton.osgi.spi.environment.Permit;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.rbac.refine.Sc;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

/**
 * @author lang : 2023-09-15
 */
public class SafePermit implements Permit {
    @Override
    public Future<Boolean> token(final String token) {
        // 处理令牌相关信息
        if (Ut.isNil(token)) {
            return Ux.futureF();
        }
        // 拆分出来的 token 信息
        final JsonObject extract = Ux.Jwt.extract(token);

        // token / user
        final String user = extract.getString(KName.USER);

        // 验证 accessToken 是否存在
        return Ux.Jooq.on(OAccessTokenDao.class)
            .<OAccessToken>fetchAsync(KName.TOKEN, token.getBytes(VValue.DFT.CHARSET))
            .compose(tokens -> Sc.jwtToken(tokens, user));
    }
}
