package io.vertx.mod.crud.uca.op;

import io.aeon.experiment.specification.KModule;
import io.horizon.spi.feature.Trash;
import io.horizon.uca.aop.Aspect;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.crud.init.IxPin;
import io.vertx.mod.crud.refine.Ix;
import io.vertx.mod.crud.uca.dao.Operate;
import io.vertx.mod.crud.uca.desk.IxMod;
import io.vertx.mod.crud.uca.desk.IxReply;
import io.vertx.mod.crud.uca.input.Pre;
import io.vertx.up.uca.jooq.UxJooq;
import io.vertx.up.unity.Ux;

import java.util.Objects;
import java.util.function.Function;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
class StepDelete implements Agonic {
    @Override
    public Future<JsonObject> runJAsync(final JsonObject criteria, final IxMod in) {
        final UxJooq jooq = IxPin.jooq(in);
        return jooq.fetchOneAsync(criteria).compose(queried -> {
            if (Objects.isNull(queried)) {
                /*
                 * 截断返回，直接返回 204 的正常响应，实际就是 {}
                 * {
                 *     "status": 204,
                 *     "result": true
                 * }
                 */
                return IxReply.success204Pre(Boolean.TRUE);
            }

            final KModule module = in.module();
            final JsonObject json = Ix.serializeJ(queried, module);

            // 附件移除
            return Pre.fileOut().inJAsync(json, in)

                // 如果打开了 Trash 功能，则执行 Trash 的备份
                .compose(removed -> Ux.channelA(Trash.class, () -> Ux.future(removed),
                    (stub) -> stub.backupAsync(module.identifier(), removed)))

                // 「AOP」带 AOP 的核心删除执行逻辑
                .compose(this.deleteFnJ(in, criteria));
        });
    }

    private Function<JsonObject, Future<JsonObject>> deleteFnJ(
        final IxMod in, final JsonObject criteria) {
        final KModule module = in.module();
        final UxJooq jooq = IxPin.jooq(in);
        return Ix.aop(module, Aspect::wrapJDelete,
            // AOP中的核心逻辑函数
            aopJ -> {
                final Operate<Object, Boolean> operate = Operate.ofDelete();
                return operate.annexFn(in).apply(aopJ)                  // 先删除关联记录
                    .compose(nil -> jooq.deleteByAsync(criteria))       // 再删除当前记录
                    .compose(IxReply::success200Pre);
            }
        );
    }

    @Override
    public Future<JsonArray> runJAAsync(final JsonObject criteria, final IxMod in) {
        final UxJooq jooq = IxPin.jooq(in);
        return jooq.fetchAsync(criteria).compose(queried -> {
            if (Objects.isNull(queried) || queried.isEmpty()) {
                return Ux.futureA();
            }

            final KModule module = in.module();
            final JsonArray array = Ix.serializeA(queried, module);

            // 附件移除
            return Pre.fileOut().inAAsync(array, in)


                // 如果打开了 Trash 功能，则执行 Trash 的备份
                .compose(removed -> Ux.channelA(Trash.class, () -> Ux.future(array),
                    stub -> stub.backupAsync(module.identifier(), array)))


                // 「AOP」带 AOP 的核心删除执行逻辑
                .compose(this.deleteFnA(in, criteria))
                .compose(nil -> Ux.future(array));
        });
    }

    private Function<JsonArray, Future<JsonArray>> deleteFnA(
        final IxMod in, final JsonObject criteria) {
        final KModule module = in.module();
        final UxJooq jooq = IxPin.jooq(in);
        return Ix.aop(module, Aspect::wrapADelete,
            // AOP中的核心逻辑函数
            aopJ -> {
                final Operate<Object, Boolean> operate = Operate.ofDelete();
                return operate.annexFn(in).apply(aopJ)                  // 先删除关联记录
                    .compose(nil -> jooq.deleteByAsync(criteria))       // 再删除当前记录
                    .compose(nil -> Ux.futureA());
            }
        );
    }
}
