package io.zerows.extension.runtime.report.api.service;

import io.horizon.atom.program.KRef;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import io.zerows.extension.runtime.report.atom.RDimension;
import io.zerows.extension.runtime.report.domain.tables.daos.KpDataSetDao;
import io.zerows.extension.runtime.report.domain.tables.daos.KpDimensionDao;
import io.zerows.extension.runtime.report.domain.tables.daos.KpReportDao;
import io.zerows.extension.runtime.report.domain.tables.pojos.KpDataSet;
import io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension;
import io.zerows.extension.runtime.report.domain.tables.pojos.KpReport;
import io.zerows.extension.runtime.report.exception._400ReportDataSetException;
import io.zerows.extension.runtime.report.exception._404ReportMissingException;
import io.zerows.extension.runtime.report.uca.process.DimProc;
import io.zerows.extension.runtime.report.uca.pull.DataSet;

import java.util.Objects;
import java.util.concurrent.ConcurrentMap;

/**
 * @author lang : 2024-10-08
 */
public class ReportService implements ReportStub {
    @Override
    public Future<JsonArray> fetchReports(final String appId) {
        final JsonObject qr = Ux.whereAnd();
        qr.put(KName.APP_ID, appId);
        qr.put(KName.ACTIVE, Boolean.TRUE);
        return Ux.Jooq.on(KpReportDao.class).fetchJAndAsync(qr);
    }

    @Override
    public Future<JsonObject> generateAsync(final String reportId, final JsonObject params) {
        final KRef refRp = new KRef();
        final KRef refDim = new KRef();
        return Ux.Jooq.on(KpReportDao.class).<KpReport>fetchByIdAsync(reportId)
            .compose(refRp::future).compose(report -> {
                if (Objects.isNull(report)) {
                    // ERR-80701
                    return Ut.Bnd.failOut(_404ReportMissingException.class, this.getClass(), reportId);
                }
                // 主数据源
                return this.reportOfData(report, params);
            }).compose(data -> {
                // 维度数据源
                final KpReport report = refRp.get();
                return this.reportOfDim(report, params);
            }).compose(refDim::future).compose(dimensions -> {
                // 提取特征
                return null;
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
        final JsonObject where = Ux.whereAnd();
        where.put("reportId", report.getKey());
        return Ux.Jooq.on(KpDimensionDao.class).<KpDimension>fetchAsync(where).compose(dimensions -> {
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
