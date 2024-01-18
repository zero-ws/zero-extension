package io.vertx.mod.fm.uca.enter;

import cn.vertxup.fm.domain.tables.pojos.*;
import io.horizon.annotations.Memory;
import io.horizon.exception.web._501NotImplementException;
import io.horizon.uca.cache.Cc;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

import java.util.List;

/**
 * 对象构造器，直接根据数据构造对象
 * <pre><code>
 *     1. 单对象构造
 *     2. 多对象构造
 * </code></pre>
 *
 * @author lang : 2024-01-18
 */
@SuppressWarnings("all")
public interface Maker<H, T> {


    // --------------- 创建新的 -------------------
    static Maker<String, FBill> ofB() {
        return (Maker<String, FBill>) POOL.CCT_MAKER.pick(MakerB::new, MakerB.class.getName());
    }

    static Maker<String, FSettlement> ofST() {
        return (Maker<String, FSettlement>) POOL.CCT_MAKER.pick(MakerST::new, MakerST.class.getName());
    }

    static Maker<List<FBillItem>, FBillItem> ofBIT() {
        return (Maker<List<FBillItem>, FBillItem>) POOL.CCT_MAKER.pick(MakerBIT::new, MakerBIT.class.getName());
    }

    public static Maker<JsonObject, FBillItem> ofBI() {
        return (Maker<JsonObject, FBillItem>) POOL.CCT_MAKER.pick(MakerBI::new, MakerBI.class.getName());
    }

    static Maker<String, FTrans> ofT() {
        return (Maker<String, FTrans>) POOL.CCT_MAKER.pick(MakerT::new, MakerT.class.getName());
    }

    // --------------- 更新专用 -------------------
    static Maker<String, FBillItem> upBI() {
        return (Maker<String, FBillItem>) POOL.CCT_MAKER.pick(UpdaterBI::new, UpdaterBI.class.getName());
    }

    static Maker<FSettlement, FSettlementItem> upSTI() {
        return (Maker<FSettlement, FSettlementItem>) POOL.CCT_MAKER.pick(UpdaterSTI::new, UpdaterSTI.class.getName());
    }

    // --------------- 实例方法 -------------------
    default Future<T> buildFastAsync(final JsonObject data) {
        throw new _501NotImplementException(this.getClass());
    }

    default Future<T> buildAsync(final JsonObject data, final H assist) {
        throw new _501NotImplementException(this.getClass());
    }

    default Future<List<T>> buildAsync(final JsonArray data, final H assist) {
        throw new _501NotImplementException(this.getClass());
    }
}

@SuppressWarnings("all")
interface POOL {
    @Memory(Maker.class)
    Cc<String, Maker> CCT_MAKER = Cc.openThread();
}
