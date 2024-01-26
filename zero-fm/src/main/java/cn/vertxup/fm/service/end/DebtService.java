package cn.vertxup.fm.service.end;

import cn.vertxup.fm.domain.tables.pojos.FDebt;
import cn.vertxup.fm.domain.tables.pojos.FSettlement;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.fm.uca.trans.Trade;

import java.util.List;

/**
 * @author lang : 2024-01-24
 */
public class DebtService implements DebtStub {
    @Override
    public Future<FDebt> createAsync(final JsonObject data, final FSettlement settlement) {
        final List<FSettlement> settlements = List.of(settlement);
        return Trade.step05D().flatter(data, settlements);
    }
}
