package io.zerows.extension.runtime.report.uca.feature;

import io.horizon.uca.cache.Cc;
import io.vertx.core.Future;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.KName;
import io.vertx.up.util.Ut;
import io.zerows.extension.runtime.report.domain.tables.pojos.KpDataSet;
import io.zerows.extension.runtime.report.domain.tables.pojos.KpFeature;

import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author lang : 2024-11-27
 */
class ODataClass implements OData {

    private static final Cc<String, RDataComponent> CC_OUT = Cc.openThread();


    @Override
    public Future<JsonArray> dataAsync(JsonArray dataSource, JsonObject params, KpDataSet dataSet) {
        final String dataComponent = dataSet.getDataComponent();
        if (Ut.isNil(dataComponent)) {
            return Ut.future(dataSource);
        }
        final RDataComponent outComponent = CC_OUT.pick(() -> Ut.instance(dataComponent), dataComponent);
        if (Objects.isNull(outComponent)) {
            return Ut.future(dataSource);
        }

        final JsonObject parameters = new JsonObject();
        parameters.put(KName.INPUT, params);
        return outComponent.dataAsync(dataSource, parameters).compose(result -> {
            if (Objects.isNull(result)) {
                return Ut.future(dataSource);
            }
            return Ut.future(result);
        });
    }
}
