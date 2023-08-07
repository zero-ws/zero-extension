package io.vertx.mod.crud.uca.desk;

import io.aeon.experiment.specification.KModule;
import io.modello.eon.em.EmModel;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.crud.cv.Pooled;
import io.vertx.up.atom.shape.KJoin;
import io.vertx.up.atom.shape.KPoint;
import io.vertx.up.commune.Envelop;
import io.vertx.up.eon.KName;
import io.vertx.up.uca.destine.Hymn;

import java.util.Objects;

/**
 * 从 {@link IxMod} 中切割分离的连接点计算专用函数，替换原始的 connecting 方法专用，用于双向分析连接点专用
 * 计算连接点的必备内容。
 *
 * @author lang : 2023-08-08
 */
public class IxJunc {

    private final IxMod mod;

    private IxJunc(final IxMod mod) {
        this.mod = mod;
    }

    public static IxJunc of(final IxMod mod) {
        return Pooled.CCT_JUNC.pick(() -> new IxJunc(mod), String.valueOf(mod.hashCode()));
    }

    public IxMod connect(final Object input) {
        if (Objects.isNull(input)) {
            return null;
        }
        /*
         * This statement must execute before connect checking to avoid
         * Returned
         */
        if (input instanceof String) {
            this.mod.parameters().put(KName.MODULE, input);
        }
        /*
         * 1. When ADD / UPDATE
         *    1.1. P1: `module` parameter is the first priority
         *    1.2. P2: When `module` has not been provided, here should be SMART processing on BODY
         *    1.3. P3: The default workflow
         *
         * 2. Other situations
         *    2.1. P1: `module` parameter is the first priority
         *    2.2. P2: The default workflow
         */
        final KModule module = this.mod.module();
        final KJoin connect = module.getConnect();
        /*
         * When `KJoin` is null, it means that current module does not support any
         * extension for sub-modules, in this situation, clear the module parameters
         * because it's useless.
         */
        if (Objects.isNull(connect)) {
            return null;
        }
        KPoint target = null;
        if (input instanceof final String inputS) {
            /*
             * Connected by `module` parameters
             */
            final Hymn<String> hymn = Hymn.ofString(connect);
            target = hymn.pointer(inputS); // connect.point(module);
        } else if (input instanceof final JsonObject inputJ) {
            /*
             * Connected by `JsonObject` parameters
             */

            final Hymn<JsonObject> hymn = Hymn.ofJObject(connect);
            target = hymn.pointer(inputJ); // connect.point((JsonObject) input);
        } else if (input instanceof final JsonArray inputA) {
            /*
             * Connected by `JsonArray` parameters
             */
            final Hymn<JsonArray> hymn = Hymn.ofJArray(connect);
            target = hymn.pointer(inputA); // connect.point((JsonArray) input);
        }
        if (Objects.nonNull(target) && EmModel.Join.CRUD == target.modeTarget()) {
            final Envelop envelop = this.mod.envelop();
            final IxMod standBy = IxMod.create(target.getCrud()).envelop(envelop);
            this.mod.connected(standBy);
            return standBy;
        }
        return null;
    }
}
