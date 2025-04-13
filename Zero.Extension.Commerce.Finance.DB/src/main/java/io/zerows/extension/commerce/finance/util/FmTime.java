package io.zerows.extension.commerce.finance.util;

import io.horizon.uca.cache.Cc;
import io.vertx.up.unity.Ux;
import io.zerows.core.feature.web.cache.Rapid;
import io.vertx.core.Future;
import io.zerows.extension.commerce.finance.domain.tables.daos.FBillDao;

import java.time.LocalDateTime;

import java.util.function.Supplier;

public class FmTime {

    private static final Rapid<String, LocalDateTime> TIME_CACHE = Rapid.object("fmTimeCache");

    private FmTime() {

    }

     static LocalDateTime selectTime() {
         // 缓存键
         String key = "pTimeRunning";
         // 尝试从缓存中读取值
         LocalDateTime cachedValue = TIME_CACHE.read(key).result();
         if (cachedValue != null) {
             return cachedValue;
         } else {
             // 如果缓存不存在，则通过 Supplier 创建并缓存
             LocalDateTime newValue = LocalDateTime.now();
             TIME_CACHE.write(key, newValue);
             return newValue;
         }
    }
    /**
     * 设置缓存值
     *
     * @param key   缓存键
     * @param value 缓存值
     * @return Future<Void>
     */
    public static Future<LocalDateTime> setCachedValue(String key, LocalDateTime value) {
        return TIME_CACHE.write(key, value)
                .onSuccess(result -> System.out.println("缓存设置成功: " + key + " -> " + value))
                .onFailure(err -> System.err.println("缓存设置失败: " + err.getMessage()));
    }

    /**
     * 获取缓存值
     *
     * @param key      缓存键
     * @param supplier 缓存值提供者（如果缓存不存在）
     * @return Future<LocalDateTime>
     */
    public static Future<LocalDateTime> getCachedValue(String key, Supplier<LocalDateTime> supplier) {
        return TIME_CACHE.read(key)
                .compose(cachedValue -> {
                    if (cachedValue != null) {
                        return Future.succeededFuture(cachedValue);
                    } else {
                        LocalDateTime newValue = supplier.get();
                        return setCachedValue(key, newValue).map(newValue);
                    }
                });
    }

    /**
     * 清除缓存值
     *
     * @param key 缓存键
     * @return Future<Void>
     */
    public static Future<LocalDateTime> clearCachedValue(String key) {
        return TIME_CACHE.clear(key)
                .onSuccess(result -> System.out.println("缓存清除成功: " + key))
                .onFailure(err -> System.err.println("缓存清除失败: " + err.getMessage()));
    }

}
