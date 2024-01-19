package io.vertx.mod.fm.uca.account;

import cn.vertxup.fm.domain.tables.daos.FBillDao;
import cn.vertxup.fm.domain.tables.daos.FBookDao;
import cn.vertxup.fm.domain.tables.pojos.FBill;
import cn.vertxup.fm.domain.tables.pojos.FBillItem;
import cn.vertxup.fm.domain.tables.pojos.FBook;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.fm.cv.FmCv;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

/**
 * @author lang : 2024-01-19
 */
class BookAction {
    // 账本金额修正（可重用，所以独立）
    static FBook doAmount(final FBook book, final FBill bill, final List<FBillItem> items) {
        items.forEach(item -> {
            BigDecimal bookDecimal = Objects.requireNonNull(book.getAmount());
            // Bill for `income` checking
            final BigDecimal adjust = Objects.requireNonNull(item.getAmount());
            if (bill.getIncome()) {
                if (FmCv.Status.INVALID.equals(item.getStatus()) || FmCv.Status.FINISHED.equals(item.getStatus())) {
                    // Move out, Consume, -
                    bookDecimal = bookDecimal.subtract(adjust);
                } else {
                    // Move in, Consume, +
                    bookDecimal = bookDecimal.add(adjust);
                }
            } else {
                if (FmCv.Status.INVALID.equals(item.getStatus()) || FmCv.Status.FINISHED.equals(item.getStatus())) {
                    // Move out, Pay, +
                    bookDecimal = bookDecimal.add(adjust);
                } else {
                    // Move in, Pay, -
                    bookDecimal = bookDecimal.subtract(adjust);
                }
            }
            book.setUpdatedAt(LocalDateTime.now());
            book.setUpdatedBy(item.getUpdatedBy());
            book.setAmount(bookDecimal);
        });
        return book;
    }

    static Future<ConcurrentMap<String, List<FBill>>> mapBills(final List<FBillItem> items) {
        final Set<String> billKeys = items.stream()
            .map(FBillItem::getBillId)
            .filter(Objects::nonNull)
            .collect(Collectors.toSet());
        final JsonObject condition = new JsonObject();
        condition.put("key,i", Ut.toJArray(billKeys));
        return Ux.Jooq.on(FBillDao.class).<FBill>fetchAsync(condition).compose(bills -> {
            if (bills.isEmpty()) {
                return Ux.future(new ConcurrentHashMap<>());
            }
            return Ux.future(Ut.elementGroup(bills, FBill::getBookId, bill -> bill));
        });
    }

    static Future<ConcurrentMap<String, FBook>> mapBook(final Set<String> billKeys) {
        final JsonObject criteria = new JsonObject();
        criteria.put("key,i", Ut.toJArray(billKeys));
        return Ux.Jooq.on(FBookDao.class).<FBook>fetchAsync(criteria).compose(books -> {
            if (books.isEmpty()) {
                return Ux.future(new ConcurrentHashMap<>());
            }
            return Ux.future(Ut.elementMap(books, FBook::getKey));
        });
    }
}