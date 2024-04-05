package cn.vertxup.integration.api;

import cn.vertxup.integration.service.MessageStub;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.auth.User;
import io.vertx.mod.is.cv.Addr;
import io.vertx.mod.is.cv.em.EmMessage;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Queue;
import io.vertx.up.commune.config.XHeader;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import jakarta.inject.Inject;

/**
 * @author lang : 2024-04-02
 */
@Queue
public class MessageActor {

    @Inject
    private MessageStub messageStub;

    @Address(Addr.Message.FETCH_TYPED)
    public Future<JsonArray> fetchTyped(final String typeStr,
                                        final XHeader header,
                                        final User user) {
        final JsonObject condition = Ux.whereAnd();
        condition.put("to", Ux.keyUser(user));
        condition.put(KName.APP_ID, header.getAppId());

        final EmMessage.Type type = Ut.toEnum(typeStr, EmMessage.Type.class);
        return this.messageStub.fetchTyped(type, condition)
            .compose(Ux::futureA);
    }


    @Address(Addr.Message.UPDATE_STATUS)
    public Future<JsonObject> updateStatus(final String key,
                                           final String statusStr,
                                           final User user) {
        final EmMessage.Status status = Ut.toEnum(statusStr, EmMessage.Status.class);
        return this.messageStub.updateStatus(key, status, Ux.keyUser(user))
            .compose(Ux::futureJ);
    }
}
