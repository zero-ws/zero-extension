package io.zerows.extension.runtime.skeleton.refine;

import io.horizon.eon.VString;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.KName;
import io.vertx.up.eon.configure.YmlCore;
import io.vertx.up.fn.Fn;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import io.zerows.core.feature.database.atom.Database;
import io.zerows.core.feature.database.cp.zdk.DataPool;
import io.zerows.core.metadata.store.OZeroStore;
import org.jooq.Configuration;

import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiFunction;

class KeTool {

    private static String DATABASE;

    static String getCatalog() {
        if (Ut.isNil(DATABASE)) {
            final JsonObject config = OZeroStore.option(YmlCore.jooq.__KEY);
            DATABASE = Ut.visitString(config, "provider", "catalog");
        }
        return DATABASE;
    }

    static Configuration getConfiguration() {
        final Database database = Database.getCurrent();
        final DataPool pool = DataPool.create(database);
        return pool.getExecutor().configuration();
    }

    static Future<JsonObject> map(final JsonObject data, final String field,
                                  final ConcurrentMap<String, JsonObject> attachmentMap,
                                  final BiFunction<JsonObject, JsonArray, Future<JsonArray>> fileFn) {
        /*
         * Here call add only
         */
        final String key = data.getString(field);
        Objects.requireNonNull(key);
        final ConcurrentMap<String, Future<JsonArray>> futures = new ConcurrentHashMap<>();
        attachmentMap.forEach((fieldF, condition) -> {
            /*
             * Put `key` of data into `modelKey`
             */
            final JsonObject criteria = condition.copy();
            if (Ut.isNotNil(criteria)) {
                criteria.put(VString.EMPTY, Boolean.TRUE);
                criteria.put(KName.MODEL_KEY, key);
                /*
                 * JsonArray normalize
                 */
                final JsonArray dataArray = Ut.valueJArray(data, fieldF);
                Ut.itJArray(dataArray).forEach(json -> json.put(KName.MODEL_KEY, key));
                futures.put(fieldF, fileFn.apply(criteria, dataArray));
            } else {
                /*
                 * Log
                 */
                Ke.LOG.Turnel.warn(KeTool.class, "Criteria must be not empty");
            }
        });
        return Fn.combineM(futures).compose(mapData -> {
            mapData.forEach(data::put);
            return Ux.future(data);
        });
    }

    static void banner(final String module) {
        System.out.println("-------------------------------------------------------------");
        System.out.println("|                                                           |");
        System.out.println("|     Zero Extension:  " + module);
        System.out.println("|                                                           |");
        System.out.println("-------------------------------------------------------------");
    }
}
