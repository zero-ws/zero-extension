package cn.vertxup.fm.api.income;

import cn.vertxup.fm.service.income.CancelStub;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.fm.cv.Addr;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Me;
import io.vertx.up.annotations.Queue;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import jakarta.inject.Inject;

/**
 * @author lang : 2024-01-11
 */
@Queue
public class CancelActor {
    @Inject
    private transient CancelStub cancelStub;

    @Me
    @Address(Addr.BillItem.UP_CANCEL)
    public Future<Boolean> upCancel(final String type, final JsonObject data) {
        final JsonArray keys = data.getJsonArray(KName.KEYS);
        if ("item".equals(type)) {
            // Cancel all
            return this.cancelStub.cancelAsync(keys, data);
        } else if ("divide".equals(type)) {
            // Cancel divide
            final String key = data.getString(KName.KEY);
            return this.cancelStub.cancelAsync(keys, key, data);
        } else {
            // Undo
            return Ux.futureT();
        }
    }
}
