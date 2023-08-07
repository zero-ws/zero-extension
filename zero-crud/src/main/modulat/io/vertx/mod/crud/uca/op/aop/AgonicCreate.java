package io.vertx.mod.crud.uca.op.aop;

import io.aeon.experiment.specification.KModule;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.crud.cv.em.QrType;
import io.vertx.mod.crud.init.IxPin;
import io.vertx.mod.crud.refine.Ix;
import io.vertx.mod.crud.uca.desk.IxMod;
import io.vertx.mod.crud.uca.desk.IxReply;
import io.vertx.mod.crud.uca.input.Pre;
import io.vertx.mod.crud.uca.op.Agonic;
import io.vertx.mod.crud.uca.trans.Tran;
import io.vertx.up.uca.jooq.UxJooq;
import io.vertx.up.util.Ut;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
class AgonicCreate implements Agonic {
    @Override
    public Future<JsonObject> runJAsync(final JsonObject input, final IxMod in) {
        final KModule module = in.module();
        return this.uniqueJAsync(input, in).compose(json -> {
            if (Ut.isNil(json)) {
                // 数据本身存在，返回 201 Created 响应，此处 201 针对业务标识
                return IxReply.success201Pre(json, module);
            }


            return Ix.pass(input, in,
                    Pre.key(true)::inJAsync,                        // UUID Generated
                    Pre.serial()::inJAsync,                               // Serial/Number
                    Pre.audit(true)::inJAsync,                    // createdAt, createdBy
                    Pre.audit(false)::inJAsync,                   // updatedAt, updatedBy
                    Pre.fileIn(true)::inJAsync                  // File: Attachment creating
                )


                // 「AOP」带 AOP 的核心添加执行函数
                .compose(AgonicJq.createFnJ(in));
        });
    }

    /**
     * 提取数据记录专用函数，由于是添加逻辑，所以不可能依赖主键的模式来提取数据，此处只能从业务上使用
     * 唯一键来处理数据记录并进行提取。
     *
     * @param input 输入的数据信息，查询条件
     * @param in    {@link IxMod} 模型信息
     *
     * @return {@link Future} 异步记录结果集
     */
    private Future<JsonObject> uniqueJAsync(final JsonObject input, final IxMod in) {
        final UxJooq jooq = IxPin.jooq(in);
        return Pre.qr(QrType.BY_UK).inJAsync(input, in)
            .compose(jooq::fetchJOneAsync);
    }

    @Override
    public Future<JsonArray> runAAsync(final JsonArray input, final IxMod in) {
        return Ix.pass(input, in,
                Pre.key(true)::inAAsync,                        // UUID Generated
                Tran.tree(true)::inAAsync,                      // After GUID
                Pre.serial()::inAAsync,                                // Serial/Number
                Pre.audit(true)::inAAsync,                      // createdAt, createdBy
                Pre.audit(false)::inAAsync                      // updatedAt, updatedBy
            )


            // 「AOP」带 AOP 的核心添加执行函数
            .compose(AgonicJq.createFnA(in));
    }
}
