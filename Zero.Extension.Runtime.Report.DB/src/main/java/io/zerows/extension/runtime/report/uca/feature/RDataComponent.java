package io.zerows.extension.runtime.report.uca.feature;

import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

import java.util.concurrent.ConcurrentMap;

/**
 * @author lang : 2024-11-04
 */
public interface RDataComponent {

    Future<JsonArray> dataAsync(JsonArray dataSource, JsonObject parameters);
}
