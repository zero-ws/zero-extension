package cn.vertxup.integration.service;

import cn.vertxup.integration.domain.tables.pojos.IMessage;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.ke.cv.em.EmMessage;

import java.util.List;

/**
 * @author lang : 2024-04-02
 */
public interface MessageStub {

    Future<List<IMessage>> fetchTyped(EmMessage.Type type, JsonObject params);

    Future<IMessage> updateStatus(String key, EmMessage.Status status, String user);
}
