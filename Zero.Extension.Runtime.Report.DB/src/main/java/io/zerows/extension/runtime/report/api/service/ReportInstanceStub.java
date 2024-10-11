package io.zerows.extension.runtime.report.api.service;

import io.vertx.core.Future;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.json.JsonObject;

/**
 * @author lang : 2024-10-11
 */
public interface ReportInstanceStub {

    Future<JsonObject> searchPaged(JsonObject query);

    Future<JsonObject> generateAsync(JsonObject query);

    Future<Buffer> exportAsync(String key);
}
