package io.zerows.extension.commerce.rbac.util;

import io.horizon.eon.VString;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.RoutingContext;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import io.zerows.core.feature.web.cache.Rapid;
import io.zerows.core.metadata.uca.environment.DevEnv;
import io.zerows.extension.commerce.rbac.atom.ScConfig;
import io.zerows.extension.commerce.rbac.bootstrap.ScPin;
import io.zerows.extension.commerce.rbac.domain.tables.pojos.SPath;
import io.zerows.extension.commerce.rbac.eon.ScConstant;
import io.zerows.extension.commerce.rbac.uca.logged.ScUser;
import io.zerows.extension.runtime.skeleton.refine.Ke;

import java.util.Objects;
import java.util.function.Function;

class ScCache {
    private static final ScConfig CONFIG = ScPin.getConfig();

    /*
     * Pool configured default parameters
     * - codePool
     * - codeExpired
     * This pool is for /oauth/authorize
     * key = user id
     * - S_USER ( key )
     * - O_USER ( client_id )
     * value = requested code ( String )
     *
     * The code feature:
     * 1. When you add the code in Pool, it will be expired in 30s
     * 2. When you fetch the code, it will be removed ( Once )
     */
    @SuppressWarnings("all")
    static <V> Future<V> code(final String key) {
        return Rapid.<String, V>t(ScConstant.POOL_CODE).clear(key);
    }

    static <V> Future<V> message(final String key) {
        return Rapid.<String, V>t(ScConstant.POOL_CODE_SMS).clear(key);
    }

    static <V> Future<V> code(final String key, final V value) {
        final Integer codeExpired = CONFIG.getCodeExpired();
        return Rapid.<String, V>t(ScConstant.POOL_CODE, codeExpired).write(key, value);
    }

    static <V> Future<V> message(final String key, final V value) {
        return Rapid.<String, V>t(ScConstant.POOL_CODE_SMS, 120).write(key, value);
    }


    static <R> Future<R> admitPath(final SPath path, final Function<SPath, Future<R>> executor, final String suffix) {
        if (DevEnv.cacheAdmit()) {
            // Cache Enabled for Default
            final String admitPool = ScConstant.POOL_ADMIN;
            // Each sigma has been mapped to single pool
            final String poolName = admitPool + VString.SLASH + path.getSigma() + VString.SLASH + suffix;
            final Rapid<String, R> rapid = Rapid.t(poolName, 3600);
            return rapid.cached(path.getKey(), () -> executor.apply(path));
        } else {
            return executor.apply(path);
        }
    }

    static Future<JsonObject> view(final RoutingContext context, final String habitus) {
        // habitus 为 Zero Framework 的专用 Session（内置业务会话标识）
        if (Ut.isNil(habitus)) {
            /*
             * Empty bound in current interface instead of other
             * -- Maybe the user has not been logged
             * */
            return Ux.futureJ();
        }

        final String viewKey = Ke.keyView(context);
        final ScUser scUser = ScUser.login(habitus);
        /*
         * 此处需要针对缓存中的 matrix 执行拷贝，后续流程中会直接执行如下流程
         * cache matrix -> Before + Visitant -> 影响 matrix
         *              -> After  + Visitant -> 影响 matrix
         * DataRegion中消费的 matrix 在新版本中会直接被 Cosmo 组件变更，而造成最终的影响
         * 所以读取出来的视图矩阵在此处执行拷贝
         */
        return scUser.view(viewKey)
            .compose(matrix -> Ux.future(Objects.isNull(matrix) ? null : matrix.copy()));
    }
}
