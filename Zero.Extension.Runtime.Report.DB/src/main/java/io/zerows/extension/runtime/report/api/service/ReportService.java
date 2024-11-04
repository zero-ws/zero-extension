package io.zerows.extension.runtime.report.api.service;

import io.horizon.atom.program.KRef;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import io.zerows.extension.runtime.report.atom.RDimension;
import io.zerows.extension.runtime.report.atom.RGeneration;
import io.zerows.extension.runtime.report.domain.tables.daos.KpDataSetDao;
import io.zerows.extension.runtime.report.domain.tables.daos.KpDimensionDao;
import io.zerows.extension.runtime.report.domain.tables.daos.KpFeatureDao;
import io.zerows.extension.runtime.report.domain.tables.daos.KpReportDao;
import io.zerows.extension.runtime.report.domain.tables.pojos.KpDataSet;
import io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension;
import io.zerows.extension.runtime.report.domain.tables.pojos.KpFeature;
import io.zerows.extension.runtime.report.domain.tables.pojos.KpReport;
import io.zerows.extension.runtime.report.eon.em.EmReport;
import io.zerows.extension.runtime.report.exception._400ReportDataSetException;
import io.zerows.extension.runtime.report.exception._404ReportMissingException;
import io.zerows.extension.runtime.report.uca.process.DimProc;
import io.zerows.extension.runtime.report.uca.pull.DataSet;
import jakarta.inject.Inject;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author lang : 2024-10-08
 */
public class ReportService implements ReportStub {
    @Inject
    private ReportInstanceStub instanceStub;

    @Override
    public Future<JsonArray> fetchReports(final String appId) {
        final JsonObject qr = Ux.whereAnd();
        qr.put(KName.APP_ID, appId);
        qr.put(KName.ACTIVE, Boolean.TRUE);
        return Ux.Jooq.on(KpReportDao.class).fetchJAndAsync(qr);
    }

    @Override
    public Future<JsonObject> generateAsync(final String reportId, final JsonObject params) {
        final RGeneration refGen = new RGeneration();
        final KRef refData = new KRef();
        return Ux.Jooq.on(KpReportDao.class).<KpReport>fetchByIdAsync(reportId)
            .compose(refGen::setReport).compose(report -> {
                if (Objects.isNull(report)) {
                    // ERR-80701
                    return Ut.Bnd.failOut(_404ReportMissingException.class, this.getClass(), reportId);
                }
                // 主数据源
                return this.reportOfData(report, params);
            }).compose(refData::future).compose(data -> {
                // 维度数据源
                final KpReport report = refGen.reportDefinition();
                return this.reportOfDim(report, params);
            }).compose(refGen::setDimension).compose(dimensions -> {
                // 提取特征
                final KpReport report = refGen.reportDefinition();
                return this.featureOfDim(report, params);
            }).compose(refGen::setFeatures)
            .compose(this::featureOfGlobal).compose(refGen::setGlobalFeatures)
            .compose(nil -> {
                final JsonArray data = refData.get();
                return this.instanceStub.buildAsync(data, refGen);
            }).compose(Ux::futureJ);
    }

    private Future<ConcurrentMap<String, KpFeature>> featureOfGlobal(final List<KpFeature> featureList) {
        final ConcurrentMap<String, KpFeature> featureGlobal = new ConcurrentHashMap<>();
        featureList.stream().filter(item -> {
            final EmReport.FeatureType featureType = Ut.toEnum(item.getType(), EmReport.FeatureType.class, null);
            if (Objects.isNull(featureType)) {
                return false;
            }
            return EmReport.FeatureType.GLOBAL == featureType;
        }).forEach(feature -> featureGlobal.put(feature.getName(), feature));
        return Ux.future(featureGlobal);
    }

    /**
     * 特征提取
     *
     * @param report 报表定义
     * @param params 参数设置
     *
     * @return 返回列表
     */
    private Future<List<KpFeature>> featureOfDim(final KpReport report, final JsonObject params) {
        final JsonObject whereJ = Ux.whereAnd();
        whereJ.put("reportId", report.getKey());
        return Ux.Jooq.on(KpFeatureDao.class).<KpFeature>fetchAsync(whereJ).compose(featureList -> {
            final JsonObject reportConfig = Ut.toJObject(report.getReportConfig());
            final JsonArray featureA = Ut.valueJArray(reportConfig, "feature");
            final ConcurrentMap<String, KpFeature> featureMap = Ut.elementMap(featureList, KpFeature::getName);
            Ut.itJArray(featureA, String.class).forEach(featureName -> {
                if (!featureMap.containsKey(featureName)) {
                    final KpFeature feature = featureMap.getOrDefault(featureName, null);
                    if (Objects.nonNull(feature)) {
                        featureList.add(feature);
                    }
                }
            });
            return Ux.future(featureList);
        });
    }


    /**
     * 维度处理
     *
     * @param report 报表定义
     * @param params 参
     *
     * @return 返回 Map
     */
    private Future<ConcurrentMap<String, RDimension>> reportOfDim(final KpReport report, final JsonObject params) {
        final JsonObject whereJ = Ux.whereAnd();
        whereJ.put("reportId", report.getKey());
        return Ux.Jooq.on(KpDimensionDao.class).<KpDimension>fetchAsync(whereJ).compose(dimensions -> {
            final DimProc processor = DimProc.of();
            return processor.dimAsync(params, dimensions);
        }).compose(dimensions -> {
            final ConcurrentMap<String, RDimension> result = Ut.elementMap(dimensions, RDimension::key);
            return Ux.future(result);
        });
    }

    /**
     * 读取主数据源
     *
     * @param report 报表定义
     * @param params 参数
     *
     * @return 数据源
     */
    private Future<JsonArray> reportOfData(final KpReport report, final JsonObject params) {
        final String reportId = report.getKey();
        final String dsId = report.getDataSetId();
        if (Ut.isNil(dsId)) {
            // ERR-80702
            return Ut.Bnd.failOut(_400ReportDataSetException.class, this.getClass(), reportId);
        }
        return Ux.Jooq.on(KpDataSetDao.class).<KpDataSet>fetchByIdAsync(dsId).compose(dataSet -> {
            if (Objects.isNull(dataSet)) {
                // ERR-80702
                return Ut.Bnd.failOut(_400ReportDataSetException.class, this.getClass(), reportId);
            }
            return DataSet.Tool.outputArray(params, dataSet);
        });
    }
}
