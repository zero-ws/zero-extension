package io.vertx.mod.crud.refine;

import io.aeon.experiment.specification.KModule;
import io.horizon.exception.WebException;
import io.horizon.uca.aop.Aspect;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.crud.uca.desk.IxMod;
import io.vertx.up.util.Ut;

import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
class IxFn {

    // JqFn
    @SafeVarargs
    static <T> Future<T> pass(final T input, final IxMod in,
                              final BiFunction<T, IxMod, Future<T>>... executors) {
        // Sequence for future management
        Future<T> future = Future.succeededFuture(input);
        for (final BiFunction<T, IxMod, Future<T>> executor : executors) {
            if (Objects.nonNull(executor)) {
                future = future.compose(data -> executor.apply(data, in));
            }
        }
        return future;
    }

    @SafeVarargs
    static <T> Future<T> park(final T input, final IxMod in,
                              final BiFunction<T, IxMod, Future<T>>... executors) {
        // 先检查异常
        final WebException error = in.error();
        if (Objects.nonNull(error)) {
            return Future.failedFuture(error);
        }
        return pass(input, in, executors);
    }


    static <T> Function<T, Future<T>> aop(
        final KModule module, final BiFunction<Aspect, Function<T, Future<T>>, Function<T, Future<T>>> aopFn,
        final Function<T, Future<T>> executor) {
        return input -> {
            final JsonObject aop = module.getAop();
            if (Ut.isNil(aop)) {
                return executor.apply(input);
            } else {
                final Aspect aspect = Aspect.create(aop);
                return aopFn.apply(aspect, executor).apply(input);
            }
        };
    }
}
