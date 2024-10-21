package io.zerows.extension.runtime.report.api.service;

import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import io.zerows.extension.runtime.report.domain.tables.daos.KpDataSetDao;
import io.zerows.extension.runtime.report.domain.tables.daos.KpReportDao;
import io.zerows.extension.runtime.report.domain.tables.pojos.KpDataSet;
import io.zerows.extension.runtime.report.domain.tables.pojos.KpReport;
import io.zerows.extension.runtime.report.exception._400ReportDataSetException;
import io.zerows.extension.runtime.report.exception._404ReportMissingException;
import io.zerows.extension.runtime.report.uca.pull.DataSet;

import java.util.Objects;

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
    public Future<JsonObject> generateAsync(final String reportId, final JsonObject query) {
        return Ux.Jooq.on(KpReportDao.class).<KpReport>fetchByIdAsync(reportId).compose(report -> {
            if (Objects.isNull(report)) {
                // ERR-80701
                return Ut.Bnd.failOut(_404ReportMissingException.class, this.getClass(), reportId);
            }
            final String dsId = report.getDataSetId();
            if (Ut.isNil(dsId)) {
                // ERR-80702
                return Ut.Bnd.failOut(_400ReportDataSetException.class, this.getClass(), reportId);
            }
            return Ux.Jooq.on(KpDataSetDao.class).<KpDataSet>fetchByIdAsync(dsId);
        }).compose(dataSet -> {
            if (Objects.isNull(dataSet)) {
                // ERR-80702
                return Ut.Bnd.failOut(_400ReportDataSetException.class, this.getClass(), reportId);
            }
            final DataSet executor = DataSet.of(dataSet);
            return executor.loadAsync(query);
        }).compose(data -> {
            
            return null;
        });
    }
}
