package io.vertx.mod.crud.uca.input.file;

import io.aeon.experiment.specification.KModule;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.crud.uca.desk.IxMod;
import io.vertx.mod.crud.uca.input.Pre;
import io.vertx.mod.ke.refine.Ke;
import io.vertx.up.atom.shape.KField;
import io.vertx.up.unity.Ux;

import java.util.Objects;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * 附件的添加、删除、查询、修改等核心方法，不同子类实现不同的附件方法，抽象类中包含了和
 * 附件相关的通用编排方法，实现附件本身的增删改
 *
 * @author lang : 2023-08-04
 */
abstract class FileAction implements Pre {
    /**
     * 将原始的 Ix 中的 fileFn 直接抽象出来，实现独立的附件管理相关方法
     *
     * @param in     IxMod
     * @param fileFn BiFunction<JsonObject, JsonArray, Future<JsonArray>>
     *
     * @return {@link Function}
     */
    protected Function<JsonObject, Future<JsonObject>> actionFn(
        final IxMod in,
        final BiFunction<JsonObject, JsonArray, Future<JsonArray>> fileFn) {
        return data -> {
            final KModule module = in.module();
            final KField field = module.getField();
            if (Objects.isNull(field)) {
                /*
                 * KField of new attachment:
                 * {
                 *      "attachment": [
                 *          {
                 *              "field": "model field name",
                 *              "condition": {
                 *                  "field1": "value1",
                 *                  "field2": "value2"
                 *              }
                 *          }
                 *      ]
                 * }
                 */
                return Ux.future(data);
            }
            final ConcurrentMap<String, JsonObject> attachmentMap = field.fieldFile();
            return Ke.mapFn(attachmentMap, fileFn).apply(data);
        };
    }
}
