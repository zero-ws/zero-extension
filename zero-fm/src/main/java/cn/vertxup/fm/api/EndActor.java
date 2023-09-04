package cn.vertxup.fm.api;

import cn.vertxup.fm.domain.tables.daos.FBookDao;
import cn.vertxup.fm.domain.tables.daos.FPreAuthorizeDao;
import cn.vertxup.fm.domain.tables.pojos.FBook;
import cn.vertxup.fm.domain.tables.pojos.FPreAuthorize;
import cn.vertxup.fm.service.end.PayStub;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.auth.User;
import io.vertx.mod.fm.cv.Addr;
import io.vertx.mod.fm.cv.FmCv;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Me;
import io.vertx.up.annotations.Queue;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import jakarta.inject.Inject;

import java.time.Instant;
import java.util.List;

/**
 * @author lang : 2023-09-04
 */
@Queue
public class EndActor {

    @Inject
    private transient PayStub payStub;

    @Address(Addr.Settle.UNLOCK_AUTHORIZE)
    public Future<JsonArray> unlockAuthorize(final JsonArray authorized, final User user) {
        // Authorized Modification
        final String userKey = Ux.keyUser(user);
        Ut.itJArray(authorized).forEach(json -> {
            json.put(KName.UPDATED_AT, Instant.now());
            json.put(KName.UPDATED_BY, userKey);
            json.put(KName.STATUS, FmCv.Status.FINISHED);
        });
        final List<FPreAuthorize> authorizeList = Ux.fromJson(authorized, FPreAuthorize.class);
        return Ux.Jooq.on(FPreAuthorizeDao.class).updateAsync(authorizeList).compose(Ux::futureA);
    }

    @Address(Addr.Settle.UP_BOOK)
    public Future<JsonArray> finalizeBook(final JsonArray books, final User user) {
        // Book Finalize ( Not Settlement )
        final String userKey = Ux.keyUser(user);
        Ut.itJArray(books).forEach(json -> {
            json.put(KName.UPDATED_AT, Instant.now());
            json.put(KName.UPDATED_BY, userKey);
        });
        final List<FBook> bookList = Ux.fromJson(books, FBook.class);
        return Ux.Jooq.on(FBookDao.class).updateAsync(bookList).compose(Ux::futureA);
    }

    @Me
    @Address(Addr.Settle.PAY_CREATE)
    public Future<JsonObject> paymentCreate(final JsonObject data) {
        return this.payStub.createAsync(data);
    }

    @Address(Addr.Settle.PAY_DELETE)
    public Future<Boolean> paymentDelete(final String key) {
        return this.payStub.deleteByItem(key);
    }
}
