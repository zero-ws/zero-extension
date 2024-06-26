package io.zerows.extension.runtime.skeleton.osgi.spi.feature;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

/**
 * 消息处理器，主要对接 zero-tpl 来实现消息的构造流程
 *
 * @author lang : 2024-04-04
 */
public interface Transit {
    /*
     * 根据参数构造消息相关信息，此处的消息必须包含
     * {
     *     "sigma": "统一标识",
     *     "appId": "应用标识",
     *     "data": {},
     *     "message": "TPL_MESSAGE 中的 code"
     * }
     * 响应格式
     * {
     *     "message": "",
     *     "subject": "",
     *     "status": "",
     *     "type": "",
     *     ”request": {}
     * }
     */
    Future<JsonObject> message(JsonObject input);
}
