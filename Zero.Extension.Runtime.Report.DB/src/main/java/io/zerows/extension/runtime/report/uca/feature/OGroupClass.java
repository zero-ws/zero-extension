package io.zerows.extension.runtime.report.uca.feature;

import io.horizon.uca.cache.Cc;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.KName;
import io.vertx.up.util.Ut;
import io.zerows.extension.runtime.report.domain.tables.pojos.KpDataSet;

import java.util.Objects;
import java.util.concurrent.ConcurrentMap;

public class OGroupClass implements OGroup{

    private static final Cc<String, RGrupComponent> CC_OUT = Cc.openThread();

    @Override
    public Future<ConcurrentMap<String, JsonArray>> dataAsync(ConcurrentMap<String, JsonArray> map, String params) {
        final RGrupComponent outComponent = CC_OUT.pick(() -> Ut.instance(params), params);
        return outComponent.dataAsync(map, params).compose(result -> {
            if (Objects.isNull(result)) {
                return Ut.future(map);
            }
            return Ut.future(result);
        });
    }
}
