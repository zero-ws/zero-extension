package cn.vertxup.doc.api;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.doc.cv.Addr;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Queue;

/**
 * @author lang : 2023-09-15
 */
@Queue
public class TokenActor {

    @Address(Addr.TOKEN_REQUEST)
    public Future<JsonObject> tokenRequest(final JsonObject config) {
        return Future.succeededFuture(config);
    }
}
