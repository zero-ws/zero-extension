package cn.vertxup.fm.service.end;

import cn.vertxup.fm.domain.tables.pojos.FDebt;
import cn.vertxup.fm.domain.tables.pojos.FSettlement;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

import java.util.List;

/**
 * @author lang : 2024-01-24
 */
public interface DebtStub {

    Future<FDebt> createAsync(JsonObject data, FSettlement settlement);

    Future<FDebt> createAsync(JsonObject data, List<FSettlement> settlements);

    // Fetch Debt
    Future<JsonObject> fetchDebt(JsonArray keys);
}
