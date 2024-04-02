package cn.vertxup.tpl.api;

import cn.vertxup.tpl.service.NotifyStub;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.auth.User;
import io.vertx.mod.ke.cv.em.OwnerType;
import io.vertx.mod.tpl.cv.Addr;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Queue;
import io.vertx.up.commune.config.XHeader;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import jakarta.inject.Inject;

/**
 * @author lang : 2024-04-02
 */
@Queue
public class NotifyActor {

    @Inject
    private NotifyStub notifyStub;


    @Address(Addr.Notify.MY_FETCH)
    public Future<JsonObject> saveNotify(final JsonObject data,
                                         final User user, final XHeader header) {
        final String userKey = Ux.keyUser(user);
        final String appId = header.getAppId();
        data.put(KName.APP_ID, appId);
        return this.notifyStub.saveNotify(OwnerType.USER, userKey, data)
            .compose(Ux::futureJ);
    }
}
