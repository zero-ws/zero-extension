package io.vertx.mod.crud.uca.next;

import io.aeon.experiment.specification.KModule;
import io.horizon.eon.em.web.HttpStatusCode;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.crud.uca.desk.IxMod;
import io.vertx.mod.crud.uca.desk.IxReply;
import io.vertx.up.atom.shape.KJoin;
import io.vertx.up.atom.shape.KPoint;
import io.vertx.up.uca.destine.Conflate;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

import java.util.Objects;

import static io.vertx.mod.crud.refine.Ix.LOG;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
class NtJData implements Co<JsonObject, JsonObject, JsonObject, JsonObject> {

    private transient final IxMod in;

    NtJData(final IxMod in) {
        this.in = in;
    }

    @Override
    public Future<JsonObject> next(final JsonObject input, final JsonObject active) {
        if (this.in.canJoin()) {
            final Conflate<JsonObject, JsonObject> conflate =
                Conflate.ofJObject(this.in.connect(), false);

            final JsonObject dataSt = conflate.treat(active, input, this.in.connectId());

            // 引用处理
            this.processReference(dataSt);
            
            LOG.Web.info(this.getClass(), "Data In: {0}", dataSt.encode());
            return Ux.future(dataSt);
        } else {
            // There is no joined module on current
            return Ux.future(active.copy());
        }
    }

    private void processReference(final JsonObject dataSt) {
        final KModule module = this.in.module();
        final KJoin join = module.getConnect();
        Objects.requireNonNull(join);
        final String keyField = module.getField().getKey();
        final KPoint source = join.getSource();
        if (Objects.isNull(source)) {
            // 未定义，使用默认值
            dataSt.remove(keyField);
            return;
        }

        final String keyJoin = source.getKeyJoin();
        if (Ut.isNil(keyJoin) || keyJoin.equals(keyField)) {
            // keyJoin = keyField
            dataSt.remove(keyJoin);
            return;
        }

        // keyJoin != keyField
        final String valueJoin = dataSt.getString(keyJoin);
        if (Ut.isNotNil(valueJoin)) {
            dataSt.put(keyField, valueJoin);
        }
    }

    @Override
    public Future<JsonObject> ok(final JsonObject active, final JsonObject standBy) {
        final HttpStatusCode status = IxReply.getStatus(standBy);
        if (HttpStatusCode.NO_CONTENT == status) {
            /*
             * Major table contain value but the sub-table has no record
             */
            return Ux.future(active);
        }
        if (this.in.canJoin()) {
            final Conflate<JsonObject, JsonObject> conflate =
                Conflate.ofJObject(this.in.connect(), true);

            final JsonObject dataSt = conflate.treat(active, standBy, this.in.connectId());
            LOG.Web.info(this.getClass(), "Data Out: {0}", dataSt.encode());
            return Ux.future(dataSt);
        } else {
            // There is no joined module on current
            return Ux.future(active.copy());
        }
    }
}
