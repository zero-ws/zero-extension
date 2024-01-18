package io.vertx.mod.fm.uca.replica;

import cn.vertxup.fm.domain.tables.pojos.*;
import io.horizon.annotations.Memory;
import io.horizon.uca.cache.Cc;
import io.vertx.core.json.JsonObject;

import java.util.List;

@SuppressWarnings("all")
interface POOL {
    @Memory(IkWay.class)
    Cc<String, IkWay> CCT_IKWAY = Cc.openThread();
}

/**
 * @author lang : 2024-01-18
 */
public final class IkWayObj {
    private IkWayObj() {
    }

    @SuppressWarnings("all")
    public static IkWay<FBill, FBillItem> ofB2BI() {
        // Bill -> BillItem, Bill -> List<BillItem>
        return (IkWay<FBill, FBillItem>) POOL.CCT_IKWAY.pick(IkWayB2BI::new, IkWayB2BI.class.getName());
    }

    @SuppressWarnings("all")
    public static IkWay<FBill, FPreAuthorize> ofB2A() {
        // Bill -> PreAuthorize
        return (IkWay<FBill, FPreAuthorize>) POOL.CCT_IKWAY.pick(IkWayB2A::new, IkWayB2A.class.getName());
    }

    @SuppressWarnings("all")
    public static IkWay<FBillItem, FBillItem> ofBIS() {
        // BillItem -> BillItem
        return (IkWay<FBillItem, FBillItem>) POOL.CCT_IKWAY.pick(IkWayBIS::new, IkWayBIS.class.getName());
    }

    @SuppressWarnings("all")
    public static IkWay<FBillItem, FBillItem> ofBIR() {
        // BillItem -> BillItem
        return (IkWay<FBillItem, FBillItem>) POOL.CCT_IKWAY.pick(IkWayBIR::new, IkWayBIR.class.getName());
    }

    @SuppressWarnings("all")
    public static IkWay<List<FBillItem>, FBillItem> ofBIT() {
        // BillItem -> BillItem
        return (IkWay<List<FBillItem>, FBillItem>) POOL.CCT_IKWAY.pick(IkWayBIT::new, IkWayBIT.class.getName());
    }

    @SuppressWarnings("all")
    public static IkWay<FBook, FBill> ofBKT() {
        // Book -> Bill
        return (IkWay<FBook, FBill>) POOL.CCT_IKWAY.pick(IkWayBkT::new, IkWayBkT.class.getName());
    }

    @SuppressWarnings("all")
    public static IkWay<FBillItem, JsonObject> ofBIC() {
        // BillItem -> JsonObject
        return (IkWay<FBillItem, JsonObject>) POOL.CCT_IKWAY.pick(IkWayBIC::new, IkWayBIC.class.getName());
    }

    @SuppressWarnings("all")
    public static IkWay<FSettlement, FBillItem> ofST2BI() {
        // Settlement -> BillItem
        return (IkWay<FSettlement, FBillItem>) POOL.CCT_IKWAY.pick(IkWayST2BI::new, IkWayST2BI.class.getName());
    }

    @SuppressWarnings("all")
    public static IkWay<FSettlement, FDebt> ofST2D() {
        // Settlement -> Debt
        return (IkWay<FSettlement, FDebt>) POOL.CCT_IKWAY.pick(IkWayST2D::new, IkWayST2D.class.getName());
    }

    @SuppressWarnings("all")
    public static IkWay<FSettlement, FTransItem> ofST2TI() {
        // Settlement -> TransItem
        return (IkWay<FSettlement, FTransItem>) POOL.CCT_IKWAY.pick(IkWayST2TI::new, IkWayST2TI.class.getName());
    }

    @SuppressWarnings("all")
    public static IkWay<FTrans, FTransItem> ofT2TI() {
        // Trans -> TransItem
        return (IkWay<FTrans, FTransItem>) POOL.CCT_IKWAY.pick(IkWayT2TI::new, IkWayT2TI.class.getName());
    }
}
