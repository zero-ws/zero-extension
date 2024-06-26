package io.zerows.extension.mbse.action.agent.api;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Queue;
import io.zerows.core.web.container.store.uri.UriAeon;
import io.zerows.extension.mbse.action.eon.JtAddr;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
@Queue
public class UriActor {

    @Address(JtAddr.Aeon.NEW_ROUTE)
    public Future<Boolean> createUri(final JsonObject body) {
        UriAeon.mountRoute(body);
        return Future.succeededFuture(Boolean.TRUE);
    }
}
