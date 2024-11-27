package io.zerows.extension.runtime.report.atom;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.up.util.Ut;
import io.zerows.extension.runtime.report.eon.RpConstant;
import io.zerows.extension.runtime.report.eon.em.EmDim;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Stream;

/**
 * 维度定义专用处理
 * <pre><code>
 *     KP_DIMENSION
 *     - DATA_FIELD：直接针对数据源中的数据执行计算
 *       1. 分组计算
 *       2. 排序计算 -> 维度属于大排序
 *     - DATA_GROUP：分组计算中枚举所需的聚集计算
 * </code></pre>
 *
 * @author lang : 2024-10-28
 */
public class RDimension implements Serializable {

    private final String key;
    private final JsonArray data = new JsonArray();
    private final ConcurrentMap<String, RAggregator> rule = new ConcurrentHashMap<>();

    public RDimension(final String key) {
        this.key = key;
    }

    public String key() {
        return this.key;
    }

    public JsonArray data() {
        return this.data;
    }

    public RDimension data(final JsonArray data) {
        this.data.addAll(data);
        return this;
    }

    /**
     * 有序的维度键集合
     *
     * @return 有序的维度键集合
     */
    public Set<String> dateKeys() {
        final Set<String> keySet = new LinkedHashSet<>();
        Ut.itJArray(this.data).forEach(item -> keySet.add(Ut.valueString(item, "dimKey")));
        return keySet;
    }

    public JsonObject data(final String key) {
        return Objects.requireNonNull(Ut.itJArray(this.data)
            .filter(item -> key.equals(Ut.valueString(item, RpConstant.DimField.KEY)))
            .findFirst().orElse(null));
    }

    public RDimension rule(final String field, final RAggregator rule) {
        this.rule.put(field, rule);
        return this;
    }

    public Object runRule(final String outField, final JsonArray sourceData) {
        if (sourceData.isEmpty()) {
            return null;
        }
        final RAggregator aggregator = this.rule.get(outField);
        if (Objects.isNull(aggregator)) {
            return null;
        }

        final EmDim.Aggregator type = aggregator.aggregator();
        if (EmDim.Aggregator.COUNT == type) {
            return sourceData.size();
        }
        final Stream<Double> waiting = Ut.itJArray(sourceData)
            .map(item -> item.getValue(aggregator.field()))
            .filter(Objects::nonNull)
            .map(Object::toString)
            .filter(Ut::isDecimal)
            .map(Double::parseDouble);
        if (EmDim.Aggregator.SUM == type) {
            return waiting.reduce(Double::sum).orElse(0.0);
        }
        if (EmDim.Aggregator.AVG == type) {
            return waiting.reduce(Double::sum).orElse(0.0) / sourceData.size();
        }
        if (EmDim.Aggregator.MAX == type) {
            return waiting.reduce(Double::max).orElse(0.0);
        }
        if (EmDim.Aggregator.MIN == type) {
            return waiting.reduce(Double::min).orElse(0.0);
        }
        return null;
    }
}
