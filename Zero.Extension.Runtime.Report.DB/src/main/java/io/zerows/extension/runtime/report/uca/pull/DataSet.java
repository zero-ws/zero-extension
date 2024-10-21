package io.zerows.extension.runtime.report.uca.pull;

import io.horizon.uca.cache.Cc;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.KName;
import io.vertx.up.util.Ut;
import io.zerows.extension.runtime.report.domain.tables.pojos.KpDataSet;
import io.zerows.extension.runtime.report.domain.tables.pojos.KpReport;
import io.zerows.extension.runtime.report.eon.em.SourceType;

import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;

/**
 * 数据源加载器，用于处理 dataSource 字段定义的数据源的相关信息加载，主要依赖
 * <pre><code>
 *     - dataSource 配置
 *     - dataQuery 配置
 * </code></pre>
 * 为报表专用处理器，用于处理数据源的加载
 * @author lang : 2024-10-12
 */
public interface DataSet {

    Cc<String, DataSet> CC_SKELETON = Cc.openThread();

    ConcurrentMap<SourceType, Function<KpDataSet, DataSet>> FN_EXECUTORS = new ConcurrentHashMap<>(){
        {
            this.put(SourceType.TABLE, DataSetTable::new);
        }
    };

    static DataSet of(final KpDataSet dataSet){
        Objects.requireNonNull(dataSet);
        final JsonObject dataSource = Ut.toJObject(dataSet.getDataSource());
        final SourceType sourceType = Ut.toEnum(
            () -> Ut.valueString(dataSource, "sourceType"), SourceType.class, SourceType.TABLE);
        return CC_SKELETON.pick(
            () -> FN_EXECUTORS.getOrDefault(sourceType, DataSetTable::new).apply(dataSet),
            dataSet.getKey()
        );
    }
    /**
     * 直接根据报表定义读取相关配置
     * @param params 读取参数
     * @return 返回读取的数据
     */
    Future<JsonArray> loadAsync(JsonObject params);
}
