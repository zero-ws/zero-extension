package io.vertx.mod.fm.uca.enter;

import cn.vertxup.fm.domain.tables.pojos.FSettlement;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.ke.refine.Ke;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

import java.util.Objects;

/**
 * <pre><code>
 *     单个结算单的初始化流程
 *     From: {@link JsonObject}
 *     To: {@link FSettlement}
 * </code></pre>
 *
 * @author lang : 2024-01-18
 */
class MakerST implements Maker<String, FSettlement> {
    /**
     * 「结算」
     * 初始化结算单，序号配置直接从 indent 中提取，此处的 data 数据结构如：
     * <pre><code>
     *     {
     *         "indent": "X_NUMBER 中的 code 定义"
     *     }
     * </code></pre>
     * 结算单生成过程中会检查 finished 相关数据，如果 finished 为 true，则还会设置
     * 结算单的 finishedAt，这种情况一般是现结的情况。
     * 最终生成的序号存储在 code / serial 中，内置调用
     *
     * @param data   输入数据
     * @param indent 序号
     *
     * @return {@link FSettlement}
     */
    @Override
    public Future<FSettlement> buildAsync(final JsonObject data, final String indent) {
        Objects.requireNonNull(indent);
        final FSettlement settlement = Ux.fromJson(data, FSettlement.class);

        // 生成结算单的单号
        return Ke.umIndent(settlement, settlement.getSigma(), indent, FSettlement::setSerial).compose(generated -> {
            if (Objects.isNull(generated.getCode())) {
                generated.setCode(generated.getSerial());
            }
            return Ux.future(generated);
        });
    }

    @Override
    public Future<FSettlement> buildFastAsync(final JsonObject data) {
        final String indent = Ut.valueString(data, KName.INDENT);
        return this.buildAsync(data, indent);
    }
}
