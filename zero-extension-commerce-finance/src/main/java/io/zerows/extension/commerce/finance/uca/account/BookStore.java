package io.zerows.extension.commerce.finance.uca.account;

import io.zerows.core.uca.cache.Cc;
import io.zerows.agreed.annotations.Memory;

/**
 * @author lang : 2024-01-19
 */
interface BookStore {
    @Memory(Book.class)
    Cc<String, Book> CCT_BOOK = Cc.openThread();
}
