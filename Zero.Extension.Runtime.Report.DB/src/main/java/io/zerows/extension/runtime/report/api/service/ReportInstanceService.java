package io.zerows.extension.runtime.report.api.service;

import io.vertx.core.Future;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.json.JsonObject;
import io.vertx.up.unity.Ux;
import io.zerows.extension.runtime.report.domain.tables.daos.KpReportInstanceDao;

/**
 * @author lang : 2024-10-11
 */
public class ReportInstanceService implements ReportInstanceStub {
    @Override
    public Future<JsonObject> searchPaged(JsonObject query) {
        return Ux.Jooq.on(KpReportInstanceDao.class)
            .searchAsync(query);
    }

    @Override
    public Future<JsonObject> generateAsync(JsonObject query) {
        return null;
    }

    @Override
    public Future<Buffer> exportAsync(String key) {
        return null;
    }
}
