package io.zerows.extension.mbse.basement.osgi.spi.ambient;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.up.unity.Ux;
import io.zerows.extension.runtime.skeleton.osgi.spi.extension.Init;

import java.util.function.Function;

public class ApplicationInitializer implements Init {

    @Override
    public Function<JsonObject, Future<JsonObject>> apply() {
        return appJson -> Ux.future(appJson)
            /* 合并初始化Schema信息，包括表更新/表创建 */
            .compose(AoRefine.combine().apply())
            /* M_ENTITY, M_FIELD, M_KEY, M_INDEX */
            .compose(AoRefine.schema().apply())
            /* M_MODEL, M_ATTRIBUTE, M_NEXUS */
            .compose(AoRefine.model().apply());
    }
}
