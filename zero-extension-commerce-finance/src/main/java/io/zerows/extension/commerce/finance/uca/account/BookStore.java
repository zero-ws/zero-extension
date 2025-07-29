package io.zerows.extension.commerce.finance.uca.account;

import io.horizon.annotations.Memory;
import io.horizon.uca.cache.Cc;

/**
 * @author lang : 2024-01-19
 */
interface BookStore {
    @Memory(Book.class)
    Cc<String, Book> CCT_BOOK = Cc.openThread();
}
