package io.zerows.extension.commerce.finance.util;

import io.horizon.eon.VString;
import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.KName;
import io.vertx.up.util.Ut;
import io.zerows.core.domain.atom.specification.KNaming;
import io.zerows.extension.commerce.finance.domain.tables.pojos.FBook;
import io.zerows.extension.commerce.finance.eon.FmConstant;
import io.zerows.extension.runtime.skeleton.refine.Ke;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import static io.zerows.extension.commerce.finance.util.Fm.LOG;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
class FmBook {

    static List<FBook> umBook(final KNaming spec, final List<FBook> books) {
        Objects.requireNonNull(books);
        // Read the major book
        final FBook found = books.stream().filter(FBook::getMajor).findFirst().orElse(null);
        if (Objects.isNull(found)) {
            // The major book does not exist
            LOG.Book.warn(FmBook.class, "Book major could not be found, check workflow! ");
            return new ArrayList<>();
        } else {
            // Sub Book Building
            final List<FBook> subBooks = new ArrayList<>();
            int start;
            if (1 < books.size()) {
                start = books.size();
            } else {
                // Main book has been created once, there is major book in `books`
                start = 1;
                subBooks.add(found);
            }
            // Calculate the left books
            final Set<String> existing = books.stream()
                .filter(book -> !book.getMajor())
                .map(FBook::getModelKey).collect(Collectors.toSet());
            final Set<String> created = Ut.elementDiff(spec.getQrKeys(), existing);
            // Set sub book serial number start point
            for (final String modelKey : created) {
                final String serial = found.getSerial() + "-" + start;
                final FBook book = umBook(found, serial);
                book.setModelKey(modelKey);
                // Append
                subBooks.add(book);
                start++;
            }
            return subBooks;
        }
    }

    private static FBook umBook(final FBook book, final String serial) {
        final FBook created = new FBook();
        Ke.umCreated(created, book);
        /*
         * type
         * modelId
         * orderId
         */
        created.setType(book.getType());
        created.setModelId(book.getModelId());
        created.setOrderId(book.getOrderId());
        created.setAmount(BigDecimal.ZERO);
        created.setMajor(Boolean.FALSE);
        created.setParentId(book.getKey());
        // serial, code
        created.setSerial(serial);
        created.setCode(serial);
        created.setStatus(FmConstant.Status.PENDING);
        return created;
    }

    static FBook umBook(final KNaming spec) {
        final FBook created = new FBook();
        Ke.umCreated(created, spec);
        /*
         * type
         * modelId
         * modelKey     - null
         * orderId      - reference
         * name         - The name for current book
         */
        created.setType(spec.getType());
        created.setModelId(spec.getIdentifier());
        created.setOrderId(spec.getReference());
        created.setName(spec.getName());
        /*
         * code, serial
         */
        created.setSerial(spec.getSerial());
        created.setCode(spec.getCode());
        created.setAmount(BigDecimal.ZERO);
        created.setMajor(Boolean.TRUE);
        created.setStatus(FmConstant.Status.PENDING);
        return created;
    }

    static JsonObject qrBook(final KNaming spec) {
        final JsonObject condition = new JsonObject();
        condition.put(KName.TYPE, spec.getType());
        condition.put(KName.MODEL_ID, spec.getIdentifier());
        if (spec.multiple()) {
            condition.put(KName.MODEL_KEY + ",i", Ut.toJArray(spec.getQrKeys()));
        } else {
            condition.put(KName.MODEL_KEY, spec.getModelKey());
        }
        condition.put("orderId", spec.getReference());
        /*
         * Fix Issue:
         * Here missed the condition of book fetching
         */
        condition.put(VString.EMPTY, Boolean.TRUE);
        return condition;
    }
}
