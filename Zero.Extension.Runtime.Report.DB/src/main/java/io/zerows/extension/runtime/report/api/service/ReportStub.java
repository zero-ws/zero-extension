package io.zerows.extension.runtime.report.api.service;

import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;

/**
 * @author lang : 2024-10-08
 */
public interface ReportStub {

    Future<JsonArray> fetchReports(String appId);
}
