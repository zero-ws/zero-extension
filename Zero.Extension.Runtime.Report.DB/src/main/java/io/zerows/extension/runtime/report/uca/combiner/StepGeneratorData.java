package io.zerows.extension.runtime.report.uca.combiner;

import io.horizon.eon.VValue;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.up.util.Ut;
import io.zerows.extension.runtime.report.atom.RDimension;
import io.zerows.extension.runtime.report.atom.RGeneration;
import io.zerows.extension.runtime.report.domain.tables.pojos.KpFeature;
import io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

/**
 * @author lang : 2024-11-26
 */
class StepGeneratorData extends AbstractStepGenerator {

    StepGeneratorData(final RGeneration generation) {
        super(generation);
    }

    /**
     * <pre><code>
     *     reportData
     *     reportContent，数据结构如下
     *     {
     *         "feature": [
     *             {
     *                 "name": "feature01 / dataIndex",
     *                 "head": "feature01Title / title",
     *                 "combine": "????"
     *             }
     *         ],
     *         "data": [
     *             {
     *                 "feature01": "xxx",
     *                 "feature02": "xxx"
     *             }
     *         ]
     *     }
     * </code></pre>
     *
     * @param instance   新报表实例
     * @param request    请求数据
     * @param sourceData 源数据
     *
     * @return 处理后的报表实例
     */
    @Override
    public Future<KpReportInstance> build(final KpReportInstance instance, final JsonObject request, final JsonArray sourceData) {
        // reportData
        instance.setReportData(sourceData.encode());
        /*
         * 计算 reportContent
         */
        final JsonArray dataProcessed = this.calculateContent(sourceData);
        return null;
    }

    private JsonArray calculateContent(final JsonArray sourceData) {
        final RGeneration generation = this.metadata();
        final List<KpFeature> featureDim = generation.featureDim();
        if (VValue.ONE != featureDim.size()) {
            // TODO: 多维度计算
            this.logger().warn("Current Version Does not support. key = {}", generation.key());
            return new JsonArray();

        }


        final JsonArray processed = new JsonArray();
        /*
         * 单个维度特征才执行此操作
         *  - 此处的 dimension 是已经计算过的维度数据信息
         */
        final RDimension dimension = generation.dimension();
        final KpFeature feature = featureDim.get(VValue.ZERO);
        if (Objects.isNull(dimension) || Objects.isNull(feature)) {
            this.logger().warn("The dimension definition is null. key = {}", generation.key());
            return new JsonArray();
        }


        /*
         * 直接计算 sourceData ->
         * {
         *     "dimField": "???",
         *     "dimDisplay": "",
         *     "dimData": {
         *     },
         *     "dimDetail": []
         * }
         */
        final Set<String> groupSet = dimension.dimSet();
        final ConcurrentMap<String, JsonArray> groupData = Ut.elementGroup(sourceData, feature.getName());
        return processed;
    }
}
