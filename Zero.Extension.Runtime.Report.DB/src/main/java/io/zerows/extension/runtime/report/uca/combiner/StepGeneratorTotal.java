package io.zerows.extension.runtime.report.uca.combiner;

import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import io.zerows.extension.runtime.report.atom.RGeneration;
import io.zerows.extension.runtime.report.domain.tables.pojos.KpFeature;
import io.zerows.extension.runtime.report.domain.tables.pojos.KpReport;
import io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance;
import io.zerows.extension.runtime.report.eon.em.EmReport;
import io.zerows.extension.runtime.report.refine.Rp;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Yu : 2024-12-31
 */
public class StepGeneratorTotal extends AbstractStepGenerator {
    StepGeneratorTotal(final RGeneration generation) {
        super(generation);
    }

    /**
     * 在最底部添加合计行,根据对应的配置进行公式计算
     * @param instance
     * @param request
     * @param sourceData
     * @return
     */
    @Override
    public Future<KpReportInstance> build(KpReportInstance instance, JsonObject request, JsonArray sourceData) {
        final KpReport report = this.metadata().reportMeta();
        final RGeneration metadata = this.metadata();
        final List<KpFeature> features = metadata.featureData();
        final JsonObject reportConfig = Ut.toJObject(report.getReportConfig());
        final JsonObject bottomTotal = Ut.valueJObject(reportConfig, "total");
        final JsonObject totalCount = Ut.valueJObject(reportConfig, "totalCount");
        final JsonObject reportContent = new JsonObject(instance.getReportContent());
        final JsonArray data = reportContent.getJsonArray("data");
        final JsonArray children = new JsonArray();
        data.forEach(item -> {
            final JsonObject entries = Ux.toJson(item);
            final JsonArray jsonArray = entries.getJsonArray(KName.CHILDREN);
            jsonArray.forEach(children::add);
        });
        final ConcurrentHashMap<String, String> total = new ConcurrentHashMap<>();
        bottomTotal.fieldNames().forEach(dimFeature -> {
            // 提取 Feature
            final KpFeature feature = Ut.elementFind(features, item -> item.getName().equals(dimFeature));
            final EmReport.FeatureType featureType = Ut.toEnum(feature.getType(), EmReport.FeatureType.class, EmReport.FeatureType.NONE);
            if (EmReport.FeatureType.AGGR == featureType) {
                children.forEach(item -> {
                    JsonObject entries = Ux.toJson(item);
                    String string = entries.getString(feature.getName());
                    // 使用 BigDecimal.valueOf 保留两位小数
                    BigDecimal value = (string == null || string.isEmpty()) ? BigDecimal.ZERO : BigDecimal.valueOf(Double.parseDouble(string)).setScale(2, RoundingMode.HALF_UP);
                    // 转换为字符串，确保两位小数
                    String valueString = value.toString();
                    // 使用 compute 方法累加值
                    total.compute(feature.getName(), (key, current) -> {
                        if (current == null) {
                            return valueString; // 如果该键没有值，直接使用当前值
                        } else {
                            // 将当前值和新值转换为 BigDecimal，进行累加
                            BigDecimal currentValue = new BigDecimal(current);
                            BigDecimal newValue = new BigDecimal(valueString);
                            BigDecimal sum = currentValue.add(newValue).setScale(2, RoundingMode.HALF_UP);
                            return sum.toString(); // 返回累加后的值
                        }
                    });
                });
            }
        });
        if (totalCount != null) {
            totalCount.fieldNames().forEach(count -> {
                final String formula = totalCount.getString(count);
                final String result = Rp.calculateFormula(formula, total);
                total.put(count, result);
            });
        }
        final JsonObject entries = Ux.toJson(total);
        entries.put("key", UUID.randomUUID().toString());
        bottomTotal.fieldNames().forEach(item -> {
            boolean b = total.containsKey(item);
            if (!b) {
                entries.put(item, bottomTotal.getString(item));
            }
        });
        final JsonArray add = data.add(entries);
        reportContent.put("data", add);
        instance.setReportContent(reportContent.toString());
        return Ux.future(instance);
    }
}
