package cn.vertxup.integration.service;

import cn.vertxup.integration.domain.tables.pojos.IMessage;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.zerows.extension.runtime.skeleton.eon.em.EmMessage;

import java.util.List;

/**
 * @author lang : 2024-04-02
 */
public interface MessageStub {

    Future<List<IMessage>> fetchTyped(EmMessage.Type type, JsonObject params);

    Future<List<IMessage>> updateStatus(JsonArray keys, EmMessage.Status status, String user);

    Future<IMessage> addMessage(JsonObject body, String user);

    Future<Boolean> deleteMessage(JsonArray keys);
}
