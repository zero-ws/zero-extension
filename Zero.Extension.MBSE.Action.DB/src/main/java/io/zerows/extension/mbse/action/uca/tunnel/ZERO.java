package io.zerows.extension.mbse.action.uca.tunnel;

import io.zerows.core.cloud.zdk.spi.Dictionary;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

interface Pool {
    ConcurrentMap<Integer, Dictionary> POOL_DICT_SERVICE =
        new ConcurrentHashMap<>();
}
