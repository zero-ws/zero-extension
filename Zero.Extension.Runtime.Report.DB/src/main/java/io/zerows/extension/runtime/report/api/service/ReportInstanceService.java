package io.zerows.extension.runtime.report.api.service;

import io.horizon.atom.program.Kv;
import io.vertx.core.Future;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.KName;
import io.vertx.up.fn.Fn;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import io.zerows.extension.runtime.report.atom.RGeneration;
import io.zerows.extension.runtime.report.domain.tables.daos.KpReportInstanceDao;
import io.zerows.extension.runtime.report.domain.tables.pojos.KpFeature;
import io.zerows.extension.runtime.report.domain.tables.pojos.KpReport;
import io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance;
import io.zerows.extension.runtime.report.uca.pull.DataInput;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author lang : 2024-10-11
 */
public class ReportInstanceService implements ReportInstanceStub {
    @Override
    public Future<JsonObject> searchPaged(final JsonObject query) {
        return Ux.Jooq.on(KpReportInstanceDao.class)
            .searchAsync(query);
    }

    @Override
    public Future<Buffer> exportAsync(final String key) {
        return null;
    }

    /**
     * 生成报表基础格式，基本内容甄别
     * <pre><code>
     *     每一项数据的来源分析
     *     key:    主键，每次生成时没有主键，生成之后保存完成后会有主键
     *     name:   NAME + TIME
     *     status: ACTIVE
     *     type:   CODE
     *
     *     下边属性是为了呈现
     *     title:           根据表达式计算
     *     subtitle:        region 部分 -> 左上角
     *     extra:           extra 不分 -> 右上角
     *     description:     （保留）
     *
     *     modeExpr:        （保留）
     *
     *     reportId:        关联报表 ID
     *     reportContent:   报表生成内容 2维矩阵（唯一需要计算的部分）
     *     reportData:      报表原始数据
     *
     *     // 其他信息在保存时使用
     *     reportBy:
     *     reportAt:
     * </code></pre>
     *
     * @param data       数据部分
     * @param params     参数部分
     * @param generation 生成配置
     *
     * @return 生成好的报表实例
     */
    @Override
    public Future<KpReportInstance> buildAsync(final JsonArray data, final JsonObject params,
                                               final RGeneration generation) {
        // 参数准备
        return this.parameterPrepare(params, generation).compose(paramMap -> {

            return null;
        });
    }

    /**
     * 参数提取不依赖数据源，配置格式如
     * <pre><code>
     *     {
     *         "pShift": {
     *             "type": "FEATURE",
     *             "name": "pShift",
     *             "output": "pShift"
     *         },
     *         "pRegion": {
     *             "type": "FEATURE",
     *             "name": "pRegion",
     *             "output": "pRegion"
     *         },
     *         "pAt": {
     *             "output": "pAt",
     *             "input": "reportAt"
     *         }
     *     }
     * </code></pre>
     *
     * @param params     参数
     * @param generation 生成配置
     *
     * @return 所有参数信息做输入处理
     */
    private Future<ConcurrentMap<String, Object>> parameterPrepare(final JsonObject params,
                                                                   final RGeneration generation) {
        final KpReport report = generation.reportMeta();
        JsonObject parameterJ = Ut.toJObject(report.getReportParam());
        parameterJ = this.parameterDefault(parameterJ);

        final List<Future<Kv<String, Object>>> futures = new ArrayList<>();
        Ut.<JsonObject>itJObject(parameterJ).forEach(entry -> {
            final DataInput input = DataInput.of();
            final JsonObject configureJ = entry.getValue();
            // 特征提取，会访问已经配置好的特征信息
            final String featureName = Ut.valueString(configureJ, KName.NAME);
            final KpFeature feature = generation.featureGlobal(featureName);
            futures.add(input.prepare(params, configureJ, feature));
        });
        return Fn.combineT(futures).compose(processed -> {
            final ConcurrentMap<String, Object> paramMap = new ConcurrentHashMap<>();
            processed.forEach(kv -> {
                if (paramMap.containsKey(kv.key())) {
                    Ut.Log.service(this.getClass()).info("Key: {0} has been duplicated in parameter configuration.", kv.key());
                }
                paramMap.put(kv.key(), kv.value());
            });
            return Ux.future(paramMap);
        });
    }

    private JsonObject parameterDefault(final JsonObject parameterJ) {
        final JsonObject normalized = new JsonObject();
        Ut.<JsonObject>itJObject(parameterJ).forEach(entry -> {
            /*
             * {
             *     "type": "FEATURE",
             *     "name": "???",
             *     "output": "???"
             * }
             */
            final JsonObject configureJ = entry.getValue().copy();
            final String parameterName = entry.getKey();

            if (!configureJ.containsKey(KName.NAME)) {
                configureJ.put(KName.NAME, parameterName);
            }

            if (!configureJ.containsKey(KName.OUTPUT)) {
                configureJ.put(KName.OUTPUT, parameterName);
            }
            normalized.put(entry.getKey(), configureJ);
        });
        return normalized;
    }

    /**
     * <pre><code>
     *     key
     *     name
     *     status
     *     type
     *     title
     *     subtitle
     *     extra
     *     description
     * </code></pre>
     *
     * @param report   报表定义
     * @param instance 新报表实例
     */
    private void fillBasic(final KpReport report, final KpReportInstance instance, final JsonObject params) {
        instance.setReportId(report.getKey());
    }
}
