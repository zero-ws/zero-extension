package cn.vertxup.fm.service.settle;

import cn.vertxup.fm.domain.tables.pojos.FSettlement;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;

import java.util.List;

/**
 * 序号生成器专用接口（结算专用）
 *
 * @author lang : 2024-01-18
 */
public interface NumStub {
    /**
     * 延迟结算单序号生成，直接根据 data 的长度来判断 {@link JsonArray#size()}
     * <pre><code>
     *     finished = false
     *     finishedAt = null
     * </code></pre>
     *
     * @param indent 序号定义
     * @param data   结算单数据
     *
     * @return 结算单列表
     */
    Future<List<FSettlement>> settleDelay(String indent, JsonArray data);

    /**
     * 即时结算单序号生成，直接根据 data 的长度来判断 {@link JsonArray#size()}
     * <pre><code>
     *     finished = true
     *     finishedAt = （当前时间）
     * </code></pre>
     *
     * @param indent 序号定义
     * @param data   结算单数据
     *
     * @return 结算单列表
     */
    Future<List<FSettlement>> settleDone(String indent, JsonArray data);
}
