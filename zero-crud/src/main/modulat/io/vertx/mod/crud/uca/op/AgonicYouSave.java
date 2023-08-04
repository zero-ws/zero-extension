package io.vertx.mod.crud.uca.op;

import io.aeon.experiment.specification.KModule;
import io.horizon.uca.aop.Aspect;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.crud.init.IxPin;
import io.vertx.mod.crud.refine.Ix;
import io.vertx.mod.crud.uca.desk.IxMod;
import io.vertx.mod.crud.uca.desk.IxReply;
import io.vertx.mod.crud.uca.input.Pre;
import io.vertx.up.atom.shape.KJoin;
import io.vertx.up.atom.shape.KPoint;
import io.vertx.up.uca.destine.Conflate;
import io.vertx.up.uca.destine.Hymn;
import io.vertx.up.uca.jooq.UxJooq;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

import java.util.Objects;

import static io.vertx.mod.crud.refine.Ix.LOG;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
class AgonicYouSave extends BaseFetch {
    private final transient IxMod module;

    AgonicYouSave(final IxMod module) {
        this.module = module;
    }

    @Override
    public Future<JsonObject> runJAsync(final JsonObject input, final IxMod in) {
        final Conflate<JsonObject, JsonObject> conflate =
            Conflate.ofQr(this.module.connect(), false);
        final JsonObject condition = conflate.treat(input, this.module.connectId());
        final KModule standBy = in.module();
        final UxJooq jooq = IxPin.jooq(in);
        return this.runUnique(condition, in,
            this::fetchBy
        ).compose(json -> {
            // Avoid overwrite primary key here
            final JsonObject inputJson = input.copy();
            inputJson.remove(standBy.getField().getKey());
            if (Ut.isNil(json)) {
                // Not Found ( Insert )
                return Ix.pass(inputJson, in,
                        Pre.key(true)::inJAsync,                // UUID Generated
                        Pre.serial()::inJAsync,                 // Serial/Number
                        Pre.audit(true)::inJAsync,              // createdAt, createdBy
                        Pre.audit(false)::inJAsync              // updatedAt, updatedBy
                    )


                    // 「AOP」Wrap JsonObject create
                    .compose(Ix.aop(standBy, Aspect::wrapJCreate, wrapData -> Ux.future(wrapData)
                        .compose(processed -> Ix.deserializeT(processed, standBy))
                        .compose(jooq::insertAsync)
                        .compose(updated -> IxReply.successJ(updated, standBy))
                    ));
            } else {
                // Found ( Update )
                final JsonObject merged = json.copy().mergeIn(inputJson, true);
                return Ix.pass(merged, in,
                        Pre.audit(false)::inJAsync         // updatedAt, updatedBy
                    )

                    // 「AOP」Wrap JsonArray update
                    .compose(Ix.aop(standBy, Aspect::wrapJUpdate, wrapData -> Ux.future(wrapData)
                        .compose(processed -> Ix.deserializeT(processed, standBy))
                        .compose(jooq::updateAsync)
                        .compose(updated -> IxReply.successJ(updated, standBy))
                    ));
            }
        });
    }

    /*
     * Fix:
     */
    @Override
    public Future<JsonArray> runAAsync(final JsonArray input, final IxMod in) {
        final Conflate<JsonArray, JsonObject> conflate =
            Conflate.ofQr(this.module.connect(), true);
        final JsonObject condition = conflate.treat(input, this.module.connectId());

        LOG.Filter.info(this.getClass(), "( Batch ) By Joined: identifier: {0}, condition: {1}", in.module().identifier(), condition);
        final KModule standBy = in.module();
        final UxJooq jooq = IxPin.jooq(in);
        return jooq.fetchJAsync(condition).compose(queried -> {
            final KJoin join = this.module.connect();
            if (Objects.isNull(join)) {
                return Ux.future(input);
            }
            final Hymn<String> hymn = Hymn.ofString(join);
            final KPoint point = hymn.pointer(this.module.connectId());
            if (Objects.isNull(point)) {
                return Ux.future(input);
            }
            final String joinedKey = point.getKeyJoin();
            final JsonArray combined = Ux.updateJ(queried, input, joinedKey);

            // Update Combine Json Data
            return Ix.pass(combined, in,
                    Pre.audit(false)::inAAsync                  // updatedAt, updatedBy
                )


                // 「AOP」Wrap JsonArray update
                .compose(Ix.aop(standBy, Aspect::wrapAUpdate, wrapData -> Ux.future(wrapData)
                    .compose(processed -> Ix.deserializeT(processed, standBy))
                    .compose(jooq::updateAsync)
                    .compose(updated -> IxReply.successA(updated, standBy))
                ));
        });
    }
}
