package io.vertx.mod.fm.uca.trans;

import cn.vertxup.fm.domain.tables.pojos.FBillItem;
import cn.vertxup.fm.domain.tables.pojos.FDebt;
import cn.vertxup.fm.domain.tables.pojos.FSettlement;
import cn.vertxup.fm.domain.tables.pojos.FSettlementItem;
import io.horizon.annotations.Memory;
import io.horizon.exception.web._501NotImplementException;
import io.horizon.uca.cache.Cc;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.fm.cv.em.EmPay;

import java.util.List;

/**
 * 交易专用接口，处理账单之后的结算部分
 * <pre><code>
 *     1. 三种结算方式的处理
 *        - 直接结算
 *        - 延迟结算
 *        - 直接转应收
 *     2. 结算管理
 *     3. 应收、退款处理
 *     4. 开票处理
 * </code></pre>
 *
 * @author lang : 2024-01-19
 */
public interface Trade<IN, OUT> {

    @SuppressWarnings("unchecked")
    static Trade<EmPay.Type, FSettlement> step01ST() {
        return (Trade<EmPay.Type, FSettlement>) POOL.CCT_TRADE.pick(Step01ST::new, Step01ST.class.getName());
    }

    @SuppressWarnings("unchecked")
    static Trade<FSettlement, FBillItem> step02BI() {
        return (Trade<FSettlement, FBillItem>) POOL.CCT_TRADE.pick(Step02BI::new, Step02BI.class.getName());
    }

    @SuppressWarnings("unchecked")
    static Trade<List<FBillItem>, FBillItem> step03B() {
        return (Trade<List<FBillItem>, FBillItem>) POOL.CCT_TRADE.pick(Step03B::new, Step03B.class.getName());
    }

    @SuppressWarnings("unchecked")
    static Trade<FSettlement, FSettlementItem> step04SI() {
        return (Trade<FSettlement, FSettlementItem>) POOL.CCT_TRADE.pick(Step04SI::new, Step04SI.class.getName());
    }

    @SuppressWarnings("unchecked")
    static Trade<List<FSettlement>, FDebt> step05D() {
        return (Trade<List<FSettlement>, FDebt>) POOL.CCT_TRADE.pick(Step05D::new, Step05D.class.getName());
    }

    /*
     * 标准接口
     * - IN -> OUT               单到单
     * - List<IN> -> List<OUT>   多到多    （多到多会包含散开的情况）
     */
    default Future<OUT> flatter(final JsonObject data, final IN assist) {
        throw new _501NotImplementException(this.getClass());
    }

    default Future<List<OUT>> flatter(final JsonArray data, final List<IN> assist) {
        throw new _501NotImplementException(this.getClass());
    }

    /*
     * 散开接口
     * - IN -> List<OUT>         单到多的散开接口
     */
    default Future<List<OUT>> scatter(final JsonObject data, final IN assist) {
        throw new _501NotImplementException(this.getClass());
    }

    default Future<List<OUT>> scatter(final JsonArray data, final IN assist) {
        throw new _501NotImplementException(this.getClass());
    }
}

@SuppressWarnings("all")
interface POOL {
    @Memory(Trade.class)
    Cc<String, Trade> CCT_TRADE = Cc.openThread();
}
