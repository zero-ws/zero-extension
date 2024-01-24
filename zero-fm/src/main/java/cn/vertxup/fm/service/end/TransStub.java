package cn.vertxup.fm.service.end;

import cn.vertxup.fm.domain.tables.pojos.FSettlement;
import cn.vertxup.fm.domain.tables.pojos.FTrans;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

/**
 * 交易步骤
 *
 * @author lang : 2024-01-24
 */
public interface TransStub {

    Future<FTrans> createAsync(JsonObject data, FSettlement settlement);
}
