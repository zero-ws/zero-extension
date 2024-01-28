package cn.vertxup.fm.service.end;

import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

import java.util.Set;
import java.util.concurrent.ConcurrentMap;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public interface QrStub {

    // Fetch Book with income and items
    Future<JsonObject> fetchSettlement(JsonArray keys);

    // Fetch Debt
    Future<JsonObject> fetchDebt(JsonArray keys);

    Future<ConcurrentMap<String, String>> statusSettlement(Set<String> keys);
}
