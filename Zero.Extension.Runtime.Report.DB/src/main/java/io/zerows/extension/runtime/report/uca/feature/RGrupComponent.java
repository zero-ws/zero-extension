package io.zerows.extension.runtime.report.uca.feature;

import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

import java.util.concurrent.ConcurrentMap;

public interface RGrupComponent {

    Future<ConcurrentMap<String, JsonArray>> dataAsync(ConcurrentMap<String, JsonArray> map, String params);
}
