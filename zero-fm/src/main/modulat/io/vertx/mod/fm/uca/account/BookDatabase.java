package io.vertx.mod.fm.uca.account;

import cn.vertxup.fm.domain.tables.daos.FBookDao;
import cn.vertxup.fm.domain.tables.pojos.FBill;
import cn.vertxup.fm.domain.tables.pojos.FBillItem;
import cn.vertxup.fm.domain.tables.pojos.FBook;
import io.horizon.atom.program.KRef;
import io.vertx.core.Future;
import io.vertx.mod.fm.cv.FmCv;
import io.vertx.mod.ke.refine.Ke;
import io.vertx.up.eon.KName;
import io.vertx.up.uca.jooq.UxJooq;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

/**
 * @author lang : 2024-01-19
 */
class BookDatabase implements Book {
    @Override
    public Future<Boolean> income(final FBill bill, final List<FBillItem> items) {
        final UxJooq jq = Ux.Jooq.on(FBookDao.class);
        return jq.<FBook>fetchByIdAsync(bill.getBookId())
            .compose(book -> Ux.future(BookAction.doAmount(book, bill, items)))
            .compose(jq::updateAsync)
            .compose(nil -> Ux.futureT());
    }

    @Override
    public Future<Boolean> income(final List<FBillItem> items, final Set<String> keysClosed) {
        final KRef refBMap = new KRef();
        return BookAction.mapBills(items).compose(refBMap::future)
            .compose(mapBill -> {
                final Set<String> keys = mapBill.keySet();
                return BookAction.mapBook(keys);
            })
            .compose(mapBooks -> {
                final ConcurrentMap<String, List<FBill>> mapBill = refBMap.get();
                /*
                 * 账本：key = FBook
                 * 账单：key = List<FBill>
                 * 输入：createdBy, updatedBy 从 item 中提取
                 * 关闭账本：bookKeys
                 */
                final List<FBook> bookList = new ArrayList<>();
                final Set<String> bookKeys = new HashSet<>(keysClosed);
                final FBillItem item = items.iterator().next();


                final UxJooq bookJq = Ux.Jooq.on(FBookDao.class);

                mapBooks.forEach((key, book) -> {
                    final List<FBill> billEach = mapBill.get(key);
                    billEach.forEach(billItem -> {
                        final FBook updatedBook = BookAction.doAmount(book, billItem, items);
                        if (keysClosed.contains(updatedBook.getKey())) {
                            /*
                             * It means that this book has been finished
                             * All finished book couldn't do any other things
                             */
                            updatedBook.setStatus(FmCv.Status.FINISHED);
                            Ke.umCreated(updatedBook, item);
                            bookKeys.remove(updatedBook.getKey());
                        }
                        bookList.add(updatedBook);
                    });
                });

                if (bookKeys.isEmpty()) {
                    return bookJq.updateAsync(bookList);
                } else {
                    return bookJq.<FBook>fetchInAsync(KName.KEY, Ut.toJArray(bookKeys)).compose(mBooks -> {
                        mBooks.forEach(book -> {
                            book.setStatus(FmCv.Status.FINISHED);
                            Ke.umCreated(book, item);
                            bookList.add(book);
                        });
                        return bookJq.updateAsync(bookList);
                    });
                }
            }).compose(nil -> Ux.futureT());
    }
}
