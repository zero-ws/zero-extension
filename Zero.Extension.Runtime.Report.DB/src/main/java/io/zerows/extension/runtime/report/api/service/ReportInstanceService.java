package io.zerows.extension.runtime.report.api.service;

import io.vertx.core.Future;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.up.unity.Ux;
import io.zerows.extension.runtime.report.atom.RGeneration;
import io.zerows.extension.runtime.report.domain.tables.daos.KpReportInstanceDao;
import io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance;

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
     * 生成报表基础格式
     *
     * @param data       数据部分
     * @param generation 生成配置
     *
     * @return 生成好的报表实例
     */
    @Override
    public Future<KpReportInstance> buildAsync(final JsonArray data, final RGeneration generation) {

        return null;
    }
}
