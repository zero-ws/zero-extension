package io.zerows.extension.commerce.finance.agent.api.end;

import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.ext.auth.User;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Queue;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import io.zerows.extension.commerce.finance.domain.tables.daos.FPreAuthorizeDao;
import io.zerows.extension.commerce.finance.domain.tables.pojos.FPreAuthorize;
import io.zerows.extension.commerce.finance.eon.Addr;
import io.zerows.extension.commerce.finance.eon.FmConstant;

import java.time.Instant;
import java.util.List;

/**
 * @author lang : 2024-01-11
 */
@Queue
public class PreAuthActor {

    @Address(Addr.Settle.UNLOCK_AUTHORIZE)
    public Future<JsonArray> unlockAuthorize(final JsonArray authorized, final User user) {
        // Authorized Modification
        final String userKey = Ux.keyUser(user);
        Ut.itJArray(authorized).forEach(json -> {
            json.put(KName.UPDATED_AT, Instant.now());
            json.put(KName.UPDATED_BY, userKey);
            json.put(KName.STATUS, FmConstant.Status.FINISHED);
        });
        final List<FPreAuthorize> authorizeList = Ux.fromJson(authorized, FPreAuthorize.class);
        return Ux.Jooq.on(FPreAuthorizeDao.class).updateAsync(authorizeList).compose(Ux::futureA);
    }
}
