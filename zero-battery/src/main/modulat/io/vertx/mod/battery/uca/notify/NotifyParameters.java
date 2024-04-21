package io.vertx.mod.battery.uca.notify;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.battery.cv.Addr;
import io.vertx.up.annotations.Address;
import io.zerows.core.feature.web.websocket.annotations.Subscribe;

/**
 * @author lang : 2024-04-09
 */
public class NotifyParameters {

    @Subscribe("block-configure")
    @Address(Addr.Notify.BLOCK_CONFIGURE_UP)
    public Future<JsonObject> sendBack(final JsonObject parameters) {
        return Future.succeededFuture(parameters);
    }
}
