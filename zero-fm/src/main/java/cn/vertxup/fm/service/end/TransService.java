package cn.vertxup.fm.service.end;

import cn.vertxup.fm.domain.tables.pojos.FSettlement;
import cn.vertxup.fm.domain.tables.pojos.FTrans;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.fm.cv.FmCv;
import io.vertx.up.util.Ut;

/**
 * @author lang : 2024-01-24
 */
public class TransService implements TransStub {
    @Override
    public Future<FTrans> createAsync(final JsonObject data, final FSettlement settlement) {
        final JsonArray transItems = Ut.valueJArray(data, FmCv.ID.PAYMENT);
        
        return null;
    }
}
