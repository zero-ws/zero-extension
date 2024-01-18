package cn.vertxup.fm.service.settle;

import cn.vertxup.fm.domain.tables.pojos.FSettlement;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;

import java.util.List;
import java.util.Objects;

/**
 * @author lang : 2024-01-18
 */
public class NumService implements NumStub {
    @Override
    public Future<List<FSettlement>> settleDelay(final String indent, final JsonArray data) {
        return null;
    }

    @Override
    public Future<List<FSettlement>> settleDone(final String indent, final JsonArray data) {
        return null;
    }

    private Future<List<FSettlement>> settleAsync(final String indent, final boolean finished,
                                                  final JsonArray data) {
        Objects.requireNonNull(indent);
        // 生成结算单单号
        return null;
    }
}
