package io.zerows.extension.runtime.report.uca.process;

import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;

/**
 * 维度处理器，用于设置分组维度
 *
 * @author lang : 2024-10-21
 */
public interface DimGroup {

    Future<JsonArray> dimAsync(JsonArray source);
}
