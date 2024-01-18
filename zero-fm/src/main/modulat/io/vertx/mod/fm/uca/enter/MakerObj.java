package io.vertx.mod.fm.uca.enter;

import cn.vertxup.fm.domain.tables.pojos.FBill;
import cn.vertxup.fm.domain.tables.pojos.FBillItem;
import cn.vertxup.fm.domain.tables.pojos.FSettlement;
import cn.vertxup.fm.domain.tables.pojos.FTrans;
import io.horizon.annotations.Memory;
import io.horizon.uca.cache.Cc;
import io.vertx.core.json.JsonObject;

import java.util.List;

@SuppressWarnings("all")
interface POOL {
    @Memory(Maker.class)
    Cc<String, Maker> CCT_MAKER = Cc.openThread();
}

/**
 * @author lang : 2024-01-18
 */
@SuppressWarnings("all")
public final class MakerObj {
    private MakerObj() {
    }

    // --------------- 创建新的 -------------------
    public static Maker<String, FBill> ofB() {
        return (Maker<String, FBill>) POOL.CCT_MAKER.pick(MakerB::new, MakerB.class.getName());
    }

    public static Maker<String, FSettlement> ofST() {
        return (Maker<String, FSettlement>) POOL.CCT_MAKER.pick(MakerST::new, MakerST.class.getName());
    }

    public static Maker<List<FBillItem>, FBillItem> ofBIT() {
        return (Maker<List<FBillItem>, FBillItem>) POOL.CCT_MAKER.pick(MakerBIT::new, MakerBIT.class.getName());
    }

    public static Maker<JsonObject, FBillItem> ofBI() {
        return (Maker<JsonObject, FBillItem>) POOL.CCT_MAKER.pick(MakerBI::new, MakerBI.class.getName());
    }

    public static Maker<String, FTrans> ofT() {
        return (Maker<String, FTrans>) POOL.CCT_MAKER.pick(MakerT::new, MakerT.class.getName());
    }

    // --------------- 更新专用 -------------------
    public static Maker<String, FBillItem> upBI() {
        return (Maker<String, FBillItem>) POOL.CCT_MAKER.pick(UpdaterBI::new, UpdaterBI.class.getName());
    }
}
