package cn.vertxup.fm.api.end;

import cn.vertxup.fm.service.end.TransStub;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.fm.cv.Addr;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Me;
import io.vertx.up.annotations.Queue;
import jakarta.inject.Inject;

/**
 * @author lang : 2024-01-11
 */
@Queue
public class VarietyActor {

    @Inject
    private transient TransStub transStub;

    @Me
    @Address(Addr.Settle.PAY_CREATE)
    public Future<JsonObject> paymentCreate(final JsonObject data) {
        return this.transStub.createAsync(data);
    }

    @Address(Addr.Settle.PAY_DELETE)
    public Future<Boolean> paymentDelete(final String key) {
        return this.transStub.deleteByItem(key);
    }
}
