package cn.vertxup.fm.service.end;

import cn.vertxup.fm.domain.tables.pojos.FSettlement;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

import java.util.List;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public interface SettleRStub {

    // Fetch Book with income and items
    Future<JsonObject> fetchSettlement(JsonArray keys);

    // Fetch Settlements by transaction id
    Future<JsonArray> fetchByTran(String transId);

    // Mount Status to settlements
    Future<JsonArray> statusSettlement(JsonArray settlements);

    Future<JsonArray> statusSettlement(List<FSettlement> settlements);
}
