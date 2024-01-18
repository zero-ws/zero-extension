package cn.vertxup.fm.api.income;

import cn.vertxup.fm.domain.tables.daos.FBookDao;
import cn.vertxup.fm.domain.tables.pojos.FBillItem;
import cn.vertxup.fm.domain.tables.pojos.FBook;
import cn.vertxup.fm.service.business.VarietyStub;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.fm.cv.Addr;
import io.vertx.mod.fm.uca.enter.MakerObj;
import io.vertx.mod.fm.uca.replica.IkWayObj;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Me;
import io.vertx.up.annotations.Queue;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import jakarta.inject.Inject;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
@Queue
public class VarietyActor {

    @Inject
    private transient VarietyStub varietyStub;

    @Me
    @Address(Addr.BillItem.UP_SPLIT)
    public Future<JsonObject> upSplit(final String key, final JsonObject data) {
        return MakerObj.upBI().buildAsync(data, key).compose(item -> {
            final List<FBillItem> items = Ux.fromJson(data.getJsonArray(KName.ITEMS), FBillItem.class);
            return this.varietyStub.splitAsync(item, items);
        });
    }

    @Me
    @Address(Addr.BillItem.UP_REVERT)
    public Future<JsonObject> upRevert(final String key, final JsonObject data) {
        return MakerObj.upBI().buildAsync(data, key).compose(item -> {
            final FBillItem to = Ux.fromJson(data.getJsonObject("item"), FBillItem.class);
            return this.varietyStub.revertAsync(item, to);
        });
    }

    @Me
    @Address(Addr.Bill.UP_TRANSFER)
    public Future<JsonObject> upTransfer(final String bookId, final JsonObject data) {
        return Ux.Jooq.on(FBookDao.class).<FBook>fetchByIdAsync(bookId).compose(book -> {
            if (Objects.isNull(book)) {
                return Ux.future();
            }
            final JsonObject normalized = data.copy();
            normalized.remove(KName.ITEMS);
            // 更新旧的数据
            final List<FBillItem> itemFrom = Ux.fromJson(data.getJsonArray(KName.ITEMS), FBillItem.class);
            itemFrom.forEach(item -> {
                item.setUpdatedBy(data.getString(KName.UPDATED_BY));
                item.setUpdatedAt(LocalDateTime.now());
            });

            // 新数据构造
            return MakerObj.ofBIT().buildAsync((JsonArray) null, itemFrom)
                .compose(itemTo -> {
                    // UCA
                    IkWayObj.ofBIT().transfer(itemFrom, itemTo);
                    // 填充 true, false
                    final ConcurrentMap<Boolean, List<FBillItem>> map = new ConcurrentHashMap<>();
                    map.put(Boolean.FALSE, itemFrom);
                    map.put(Boolean.TRUE, itemTo);
                    return Ux.future(map);
                })
                .compose(map -> this.varietyStub.transferAsync(map, book, normalized));
        });
    }
}
