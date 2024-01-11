package cn.vertxup.fm.api.income;

import cn.vertxup.fm.domain.tables.daos.FBookDao;
import cn.vertxup.fm.domain.tables.pojos.FBillItem;
import cn.vertxup.fm.domain.tables.pojos.FBook;
import cn.vertxup.fm.service.business.VarietyStub;
import cn.vertxup.fm.service.pre.IndentStub;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.fm.cv.Addr;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Me;
import io.vertx.up.annotations.Queue;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import jakarta.inject.Inject;

import java.util.List;
import java.util.Objects;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
@Queue
public class VarietyActor {

    @Inject
    private transient VarietyStub varietyStub;

    @Inject
    private transient IndentStub indentStub;

    @Me
    @Address(Addr.BillItem.UP_SPLIT)
    public Future<JsonObject> upSplit(final String key, final JsonObject data) {
        return this.indentStub.itemAsync(key, data).compose(item -> {
            final List<FBillItem> items = Ux.fromJson(data.getJsonArray(KName.ITEMS), FBillItem.class);
            return this.varietyStub.splitAsync(item, items);
        });
    }

    @Me
    @Address(Addr.BillItem.UP_REVERT)
    public Future<JsonObject> upRevert(final String key, final JsonObject data) {
        return this.indentStub.itemAsync(key, data).compose(item -> {
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
            } else {
                final JsonObject normalized = data.copy();
                normalized.remove(KName.ITEMS);
                return this.indentStub.itemAsync(data.getJsonArray(KName.ITEMS), normalized)
                    .compose(map -> this.varietyStub.transferAsync(map, book, normalized));
            }
        });
    }
}
