package cn.vertxup.fm.service.end;

import cn.vertxup.fm.domain.tables.pojos.FSettlement;
import cn.vertxup.fm.domain.tables.pojos.FTrans;
import cn.vertxup.fm.domain.tables.pojos.FTransItem;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;

/**
 * 交易步骤
 *
 * @author lang : 2024-01-24
 */
public interface TransStub {

    Future<FTrans> createAsync(JsonObject data, FSettlement settlement);

    Future<List<FTransItem>> fetchBySettle(List<FSettlement> settlements);
}
