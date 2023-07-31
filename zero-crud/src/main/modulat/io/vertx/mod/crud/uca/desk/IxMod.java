package io.vertx.mod.crud.uca.desk;

import io.aeon.experiment.specification.KModule;
import io.horizon.exception.WebException;
import io.horizon.exception.web._500InternalServerException;
import io.modello.eon.em.EmModel;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.crud.error._404ModuleMissingException;
import io.vertx.mod.crud.init.IxPin;
import io.vertx.mod.crud.refine.Ix;
import io.vertx.up.atom.shape.KJoin;
import io.vertx.up.atom.shape.KPoint;
import io.vertx.up.commune.Envelop;
import io.vertx.up.eon.KName;
import io.vertx.up.fn.Fn;
import io.vertx.up.uca.destine.Hymn;
import io.vertx.up.util.Ut;

import java.util.Objects;
import java.util.function.BiFunction;

/**
 * Wrap `envelop` here as request params
 *
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class IxMod {
    private final transient JsonObject parameters = new JsonObject();
    private transient Envelop envelop;
    private transient KModule module;
    private transient KModule connect;
    private transient WebException error;

    private IxMod(final String actor) {
        final KModule module;
        try {
            /* 2. IxModule extracting by `actor` */
            module = IxPin.getActor(actor);
            Fn.out(Objects.isNull(module), _404ModuleMissingException.class, this.getClass(), actor);
            this.module = module;
        } catch (final WebException error) {
            error.printStackTrace();
            this.error = error;
        } catch (final Throwable error) {
            error.printStackTrace();
            this.error = new _500InternalServerException(this.getClass(), error.getMessage());
        }
    }

    public static IxMod create(final String actor) {
        return new IxMod(actor);
    }

    // ------------------ 元数据定义 ----------------

    public KModule module() {
        return this.module;
    }

    public KJoin connect() {
        return this.module.getConnect();
    }

    public String connectId() {
        if (this.canJoin()) {
            return this.connect.identifier();
        } else {
            return null;
        }
    }

    public KModule connected() {
        return this.connect;
    }

    public String cached() {
        final StringBuilder key = new StringBuilder();
        key.append(this.module.identifier());
        if (this.canJoin()) {
            key.append(this.connect.identifier());
        }
        return key.toString();
    }

    // ------------------ 数据定义 ------------------
    public IxMod envelop(final Envelop envelop) {
        this.envelop = envelop;

        // 参数处理
        final JsonObject headers = envelop.headersX();
        this.parameters.mergeIn(headers, true);
        final JsonObject parameters = envelop.body();
        if (Ut.isNotNil(parameters)) {
            this.parameters.mergeIn(parameters, true);
        }
        return this;
    }

    public Envelop envelop() {
        return this.envelop;
    }

    public JsonObject parameters() {
        return this.parameters.copy();
    }

    // ------------------ 判断函数 ------------------
    public boolean canJoin() {
        return Objects.nonNull(this.connect);
    }

    public boolean canTransform() {
        return Objects.nonNull(this.module.getTransform());
    }

    public IxMod connecting(final Object input) {
        if (Objects.isNull(input)) {
            return null;
        }
        /*
         * This statement must execute before connect checking to avoid
         * Returned
         */
        if (input instanceof String) {
            this.parameters.put(KName.MODULE, (String) input);
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
        final KJoin connect = this.module.getConnect();
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
            final IxMod standBy = IxMod.create(target.getCrud()).envelop(this.envelop);
            this.connect = standBy.module;
            return standBy;
        }
        return null;
    }

    @SafeVarargs
    public final <T> Future<T> ready(
        final T input,
        final BiFunction<T, IxMod, Future<T>>... executors) {
        // Error Checking for request building
        if (Objects.nonNull(this.error)) {
            return Future.failedFuture(this.error);
        }
        return Ix.passion(input, this, executors);
    }
}
