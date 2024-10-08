package io.zerows.extension.runtime.report.api.service;

import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.zerows.extension.runtime.report.domain.tables.daos.KpReportDao;

/**
 * @author lang : 2024-10-08
 */
public class ReportService implements ReportStub{
    @Override
    public Future<JsonArray> fetchReports(String appId) {
        final JsonObject qr = Ux.whereAnd();
        qr.put(KName.APP_ID, appId);
        qr.put(KName.ACTIVE, Boolean.TRUE);
        return Ux.Jooq.on(KpReportDao.class).fetchJAndAsync(qr);
    }
}
