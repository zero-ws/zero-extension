package cn.vertxup.fm.service.business;

import cn.vertxup.fm.domain.tables.pojos.FBillItem;
import cn.vertxup.fm.domain.tables.pojos.FBook;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.concurrent.ConcurrentMap;

/**
 * @author lang : 2024-01-11
 */
public interface VarietyStub {
    Future<JsonObject> splitAsync(FBillItem item, List<FBillItem> items);

    Future<JsonObject> revertAsync(FBillItem item, FBillItem to);

    Future<JsonObject> transferAsync(ConcurrentMap<Boolean, List<FBillItem>> fromTo, FBook book, JsonObject params);
}
