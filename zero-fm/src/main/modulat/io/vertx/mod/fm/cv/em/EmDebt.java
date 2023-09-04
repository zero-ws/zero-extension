package io.vertx.mod.fm.cv.em;

/**
 * @author lang : 2023-09-01
 */
public class EmDebt {
    /*
     * 对应新的单据类型
     * Debt 单据的类型，可以表示应收单，也可以表示退款单
     * */
    public enum Type {
        DEBT,       // 应收单
        REFUND,     // 退款单
    }

    /*
     * linked 属性专用值，主要包含四个值
     */
    public enum Linked {
        // 已结算3种
        DEBT,       // 应收
        REFUND,     // 退款
        DONE,       // 已结算

        // 未结算
        PENDING,    // 待结算
    }
}
