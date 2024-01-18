package io.vertx.mod.fm.uca.replica;

import cn.vertxup.fm.domain.tables.pojos.FBill;
import cn.vertxup.fm.domain.tables.pojos.FBillItem;
import cn.vertxup.fm.domain.tables.pojos.FPreAuthorize;
import io.horizon.annotations.Memory;
import io.horizon.uca.cache.Cc;

@SuppressWarnings("all")
interface POOL {
    @Memory(IkWay.class)
    Cc<String, IkWay> CCT_IKWAY = Cc.openThread();
}

/**
 * @author lang : 2024-01-18
 */
public final class IkWayOf {
    private IkWayOf() {
    }

    @SuppressWarnings("all")
    public static IkWay<FBill, FBillItem> b2bi() {
        // Bill -> BillItem, Bill -> List<BillItem>
        return (IkWay<FBill, FBillItem>) POOL.CCT_IKWAY.pick(IkWayB2BI::new, IkWayB2BI.class.getName());
    }

    @SuppressWarnings("all")
    public static IkWay<FBill, FPreAuthorize> b2a() {
        // Bill -> PreAuthorize
        return (IkWay<FBill, FPreAuthorize>) POOL.CCT_IKWAY.pick(IkWayB2A::new, IkWayB2A.class.getName());
    }

    @SuppressWarnings("all")
    public static IkWay<FBillItem, FBillItem> bis() {
        // BillItem -> BillItem
        return (IkWay<FBillItem, FBillItem>) POOL.CCT_IKWAY.pick(IkWayBIS::new, IkWayBIS.class.getName());
    }
    
    @SuppressWarnings("all")
    public static IkWay<FBillItem, FBillItem> bir() {
        // BillItem -> BillItem
        return (IkWay<FBillItem, FBillItem>) POOL.CCT_IKWAY.pick(IkWayBIR::new, IkWayBIR.class.getName());
    }
}
