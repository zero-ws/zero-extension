package io.zerows.extension.runtime.crud.uca.dao;

import io.zerows.core.uca.cache.Cc;
import io.zerows.agreed.annotations.Memory;


@SuppressWarnings("all")
interface POOL {

    @Memory(Operate.class)
    Cc<String, Operate> CCT_OPERATE = Cc.openThread();
}
