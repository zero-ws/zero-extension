package io.vertx.mod.crud.uca.dao;

import io.horizon.annotations.Memory;
import io.horizon.uca.cache.Cc;


@SuppressWarnings("all")
interface POOL {

    @Memory(Operate.class)
    Cc<String, Operate> CCT_OPERATE = Cc.openThread();
}
