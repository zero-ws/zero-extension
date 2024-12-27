package io.zerows.extension.runtime.report.uca.feature;

import io.horizon.uca.cache.Cc;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.KName;
import io.vertx.up.util.Ut;
import io.zerows.extension.runtime.report.domain.tables.pojos.KpDataSet;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.concurrent.ConcurrentMap;

public interface OGroup {
    Cc<String, OGroup> CC_SKELETON = Cc.openThread();

    static OGroup of(final String valuePath) {
        Objects.requireNonNull(valuePath);
        return CC_SKELETON.pick(OGroupClass::new, valuePath);

    }

    /**
     * <pre><code>
     *     params -> data 数据
     *               input 输入参数
     * </code></pre>
     *
     * @return 计算的值
     */
    Future<ConcurrentMap<String, JsonArray>> dataAsync(ConcurrentMap<String, JsonArray> map, String params);

    interface T {

        static Object formatValue(final Object value, final JsonObject valueConfig) {
            final Object valueResult;
            if (Ut.isNotNil(valueConfig) && valueConfig.containsKey(KName.FORMAT)) {
                final String pattern = Ut.valueString(valueConfig, KName.FORMAT);
                // 时间格式
                if (value instanceof final Instant valueInstant) {
                    final LocalDateTime parsed = Ut.toDateTime(valueInstant);
                    valueResult = Ut.fromDate(parsed, pattern);
                } else {
                    final LocalDateTime parsed = Ut.toDateTime(Ut.parseFull(value.toString()));
                    valueResult = Ut.fromDate(parsed, pattern);
                }
            } else {
                valueResult = value;
            }
            return valueResult;
        }
    }
}
