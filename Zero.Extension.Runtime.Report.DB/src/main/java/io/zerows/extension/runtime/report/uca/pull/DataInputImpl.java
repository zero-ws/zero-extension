package io.zerows.extension.runtime.report.uca.pull;

import io.horizon.atom.program.Kv;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.zerows.extension.runtime.report.domain.tables.pojos.KpFeature;

/**
 * @author lang : 2024-11-04
 */
class DataInputImpl implements DataInput {
    /**
     * 参数要求
     * <pre><code>
     *     {
     *         "reportAt"
     *     }
     * </code></pre>
     * 上述参数必须存在，如此才可以执行 region 操作
     *
     * @param params     参数
     * @param configureJ 配置
     * @param feature    特征
     *
     * @return 返回值
     */
    @Override
    public Future<Kv<String, Object>> prepare(final JsonObject params, final JsonObject configureJ, final KpFeature feature) {
        // 执行器类型分析
        return null;
    }
}
