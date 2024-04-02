package cn.vertxup.integration.service;

import cn.vertxup.integration.domain.tables.daos.IMessageDao;
import cn.vertxup.integration.domain.tables.pojos.IMessage;
import io.horizon.uca.qr.Sorter;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.is.cv.em.EmMessage;
import io.vertx.up.eon.KName;
import io.vertx.up.uca.jooq.UxJooq;
import io.vertx.up.unity.Ux;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author lang : 2024-04-02
 */
public class MessageService implements MessageStub {

    @Override
    public Future<List<IMessage>> fetchTyped(final EmMessage.Type type, final JsonObject condition) {
        condition.put(KName.TYPE, type.name());
        return Ux.Jooq.on(IMessageDao.class).fetchAsync(condition,
            Sorter.create(KName.CREATED_AT, Boolean.FALSE));
    }

    @Override
    public Future<IMessage> updateStatus(final String key, final EmMessage.Status status, final String user) {
        final UxJooq jq = Ux.Jooq.on(IMessageDao.class);
        return jq.<IMessage>fetchByIdAsync(key).compose(message -> {
            message.setStatus(status.name());
            message.setUpdatedBy(user);
            message.setUpdatedAt(LocalDateTime.now());
            return jq.updateAsync(message);
        });
    }
}
