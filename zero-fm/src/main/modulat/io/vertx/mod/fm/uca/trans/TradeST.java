package io.vertx.mod.fm.uca.trans;

import cn.vertxup.fm.domain.tables.daos.FSettlementDao;
import cn.vertxup.fm.domain.tables.pojos.FSettlement;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.fm.cv.em.EmPay;
import io.vertx.mod.fm.uca.enter.Maker;
import io.vertx.up.unity.Ux;

import java.time.LocalDateTime;

/**
 * 单结算单处理流程（原始流程），完整步骤：
 * <pre><code>
 *     1. 生成单号
 *     2. 根据是否延迟设定延迟相关信息
 *     3. 批量插入结算单
 * </code></pre>
 *
 * @author lang : 2024-01-19
 */
class TradeST implements Trade<EmPay.Type, FSettlement> {
    @Override
    public Future<FSettlement> execute(final JsonObject data, final EmPay.Type type) {
        /*
         * 结算单创建时会生成单号，编号规则存储在模型的赔账 `numbers` 中，且支持多字段配置
         * Zero Extension 模块会直接根据 `X_NUMBER` 中的定义来生成相关编号，执行完成后
         * 会赋值给此处的 FSettlement 对象。
         */
        return Maker.ofST().buildFastAsync(data)


            /*
             * 根据传入的执行类型来判断当前的结算单是否完成，如果是延迟结算，则不完成
             * 如果是非延迟结算就是完成，注意直接转应收也算是结算完成，而开启了应收处理
             * 流程
             */
            .compose(generated -> {
                if (EmPay.Type.DELAY == type) {
                    generated.setFinished(Boolean.FALSE);
                } else {
                    generated.setFinished(Boolean.TRUE);
                    generated.setFinishedAt(LocalDateTime.now());
                }
                return Ux.future(generated);
            })


            /*
             * 将构造好的 FSettlement 对象直接插入到数据库中，并且以
             * FSettlement 的方式返回上层
             */
            .compose(Ux.Jooq.on(FSettlementDao.class)::insertAsync);
    }
}
