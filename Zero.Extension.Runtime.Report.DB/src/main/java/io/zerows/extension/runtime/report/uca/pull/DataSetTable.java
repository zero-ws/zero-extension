package io.zerows.extension.runtime.report.uca.pull;

import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.zerows.extension.runtime.report.domain.tables.pojos.KpDataSet;

/**
 * 最常见的数据源读取器，直接读取表格数据，也可以作为其他类的基类，其他模式直接从此处继承
 * <pre><code>
 *     内置包含 {@link KpDataSet} 的引用，用于处理报表的数据加载
 * </code></pre>
 *
 * @author lang : 2024-10-12
 */
class DataSetTable implements DataSet {
    protected final KpDataSet dataSet;

    DataSetTable(final KpDataSet dataSet) {
        this.dataSet = dataSet;
    }

    @Override
    public Future<JsonArray> loadAsync(final JsonObject params) {
        return null;
    }
}
