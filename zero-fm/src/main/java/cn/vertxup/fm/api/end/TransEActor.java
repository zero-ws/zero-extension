package cn.vertxup.fm.api.end;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.fm.cv.Addr;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Me;
import io.vertx.up.annotations.Queue;
import io.vertx.up.unity.Ux;

/**
 * @author lang : 2024-01-17
 */
@Queue
public class TransEActor {

    @Me
    @Address(Addr.Trans.END_TRANS)
    public Future<JsonObject> endTrans(final JsonObject body) {
        return Ux.futureJ();
    }

    @Me
    @Address(Addr.Trans.END_DEBT)
    public Future<JsonObject> endDebt(final JsonObject body) {
        return Ux.futureJ();
    }
}
