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
}
