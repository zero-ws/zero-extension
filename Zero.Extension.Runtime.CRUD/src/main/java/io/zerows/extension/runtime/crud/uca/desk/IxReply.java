package io.zerows.extension.runtime.crud.uca.desk;

import io.horizon.eon.em.web.HttpStatusCode;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import io.zerows.core.feature.web.mbse.atom.specification.KModule;
import io.zerows.core.web.model.commune.Envelop;
import io.zerows.extension.runtime.crud.util.Ix;

import java.util.List;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
@SuppressWarnings("all")
public final class IxReply {

    private static String STATUS = "$STATUS$";
    private static String RESULT = "$RESULT$";

    /* STATUS Code */
    public static Future<Envelop> successPost(final JsonObject input) {
        final HttpStatusCode statusCode = getStatus(input, true);
        return Ux.future(Envelop.success(input, statusCode));
    }

    public static Future<Envelop> successPostB(final JsonObject input) {
        final HttpStatusCode statusCode = getStatus(input, true);
        final Boolean result = input.getBoolean(RESULT, Boolean.FALSE);
        return Ux.future(Envelop.success(result, statusCode));
    }

    public static HttpStatusCode getStatus(final JsonObject input, final boolean isEnd) {
        if (Ut.isNil(input)) {
            /*
             * isEnd = true
             * 证明此处是 404 的情况，无法在系统中找到记录信息
             * isEnd = false
             * 证明此处可能是第二子记录无法找到，这种情况直接返回 204 即可
             */
            return isEnd ? HttpStatusCode.NOT_FOUND : HttpStatusCode.NO_CONTENT;
        }
        final HttpStatusCode statusCode;
        if (input.containsKey(STATUS)) {
            final int status = input.getInteger(STATUS);
            statusCode = HttpStatusCode.fromCode(status);
            input.remove(STATUS);
        } else {
            statusCode = HttpStatusCode.OK;
        }
        return statusCode;
    }

    public static <T> Future<JsonObject> success201Pre(final T input, final KModule module) {
        return successJ(input, module).compose(item -> {
            item.put(STATUS, 201);
            return Ux.future(item);
        });
    }

    public static <T> Future<JsonObject> success204Pre() {
        return Ux.future(new JsonObject().put(STATUS, 204));
    }

    public static <T> Future<JsonObject> success404Pre() {
        return Ux.future(new JsonObject().put(STATUS, 404));
    }

    public static Future<JsonObject> success200Pre(final boolean result) {
        return Ux.future(new JsonObject().put(STATUS, 200).put(RESULT, result));
    }

    public static Future<JsonObject> success204Pre(final boolean result) {
        return Ux.future(new JsonObject().put(STATUS, 204).put(RESULT, result));
    }

    /*
     *  Tool -> JsonObject based by module
     */
    public static <T> Future<JsonObject> successJ(final T input, final KModule module) {
        return Ux.future(Ix.serializeJ(input, module));
    }

    public static <T> Future<JsonArray> successA(final List<T> input, final KModule module) {
        return Ux.future(Ix.serializeA(input, module));
    }

    public static Future<JsonArray> ignoreA(final JsonObject input, final IxMod in) {
        return Ux.futureA();
    }
}
