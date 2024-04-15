package io.vertx.mod.fm.uca.notification;

import io.vertx.core.json.JsonObject;
import io.vertx.up.commune.config.XHeader;
import io.vertx.up.eon.KName;

import java.util.Objects;

/**
 * @author lang : 2024-04-04
 */
class NotifyReversalParam {

    static JsonObject normalized(final JsonObject input, final XHeader header) {
        final JsonObject params = new JsonObject();
        if (Objects.nonNull(header)) {
            params.put(KName.SIGMA, header.getSigma());
            params.put(KName.APP_ID, header.getAppId());
        }
        params.put(KName.DATA, input);
        return params;
    }

    static JsonObject response(final JsonObject message, final JsonObject input) {
        final JsonObject response = message.copy();
        response.put("request", input);
        return response;
    }
}
