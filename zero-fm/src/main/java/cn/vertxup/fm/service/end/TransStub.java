package cn.vertxup.fm.service.end;

import cn.vertxup.fm.domain.tables.pojos.FSettlement;
import cn.vertxup.fm.domain.tables.pojos.FTrans;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.fm.atom.TranData;
import io.vertx.mod.fm.cv.em.EmTran;

import java.util.List;
import java.util.Set;

/**
 * 交易步骤
 *
 * @author lang : 2024-01-24
 */
public interface TransStub {

    Future<FTrans> createAsync(JsonObject data, FSettlement settlement);

    Future<List<TranData>> fetchAsync(Set<String> keys, Set<EmTran.Type> typeSet);
}