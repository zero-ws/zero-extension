package cn.vertxup.fm.api.end;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.fm.cv.Addr;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Me;
import io.vertx.up.annotations.Queue;

/**
 * @author lang : 2024-01-11
 */
@Queue
public class VarietyActor {


    @Me
    @Address(Addr.Settle.PAY_CREATE)
    public Future<JsonObject> paymentCreate(final JsonObject data) {
        return null;
    }

    @Address(Addr.Settle.PAY_DELETE)
    public Future<Boolean> paymentDelete(final String key) {
        return null;
    }
}
