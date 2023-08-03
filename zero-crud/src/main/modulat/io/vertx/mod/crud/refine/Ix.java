package io.vertx.mod.crud.refine;

import io.aeon.experiment.specification.KModule;
import io.horizon.atom.program.Kv;
import io.horizon.uca.aop.Aspect;
import io.horizon.uca.log.Log;
import io.horizon.uca.log.LogModule;
import io.modello.specification.meta.HMetaAtom;
import io.vertx.core.Future;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.crud.uca.desk.IxMod;
import io.vertx.up.atom.shape.KField;
import io.vertx.up.uca.jooq.UxJooq;
import io.vertx.up.unity.Ux;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Ix {
    // --------------------------------- New Version

    /**
     * 主要针对 auditor 的四个核心字段
     * <pre><code>
     *     1. createdBy / createdAt
     *     2. updatedBy / updatedAt
     * </code></pre>
     * 该API方法设置的时候，是分组设置的，即添加（created）、更新（updated）分别设置，其中 `by` 会设置成当前用户ID，`at` 会设置成当前时间戳
     *
     * @param data   被设置的对象数据
     * @param config 被设置的配置数据
     * @param userId 被设置的用户ID
     */
    public static void onAuditor(final JsonObject data, final JsonObject config, final String userId) {
        IxData.audit(data, config, userId);
    }

    /**
     * 列解析器，直接根据提供的值解析列，主要针对 metadata 格式的列处理，如
     * <pre><code>
     *     1. 字符串格式：`name,名称`
     *        最终会解析成 `name = 名称`
     *     2. 若是 {@link JsonObject}，根据 `key` 和 `value` 解析
     *        带 metadata 的解析，格式如字符串格式
     *        否则直接使用原生态格式
     * </code></pre>
     *
     * @param value 被解析的列值
     *
     * @return {@link Kv} 列解析结果
     */
    public static Kv<String, String> onColumn(final Object value) {
        return IxData.field(value);
    }


    /**
     * 保存视图时受影响的URI计算，目前受到影响的URI主要如下：
     * <pre><code>
     *     1. 针对视图执行缓存更新时，会影响查询视图的相关信息
     *     2. 现阶段的查询视图影响包含：
     *        /api/{0}/search
     * </code></pre>
     *
     * @param in {@link IxMod} 模型对象
     *
     * @return {@link Kv} 影响的URI信息
     */
    public static Kv<String, HttpMethod> onImpact(final IxMod in) {
        return IxData.impact(in);
    }

    /**
     * 标识规则的解析器，二维矩阵专用解析器，针对配置
     * <pre><code>
     *     {
     *         "unique": [
     *             []
     *         ]
     *     }
     * </code></pre>
     * 分组标识规则，分成若干组，第一位表示每一组的属性集
     *
     * @param field {@link KField} 字段定义信息
     *
     * @return {@link JsonArray} 解析结果
     */
    public static JsonArray onMatrix(final KField field) {
        return IxData.matrix(field);
    }

    /**
     * 参数解析器，特殊参数解析流程，解析当前模块所需的参数，主要用于填充 module 参数
     * <pre><code>
     *     当前版本中，参数解析按如下流程处理：
     *     1. 检查参数中是否有 module 参数，没有 module 参数时触发
     *     2. 若 connect 存在，则 module 填充的是 connect 被连接模块的 identifier
     *        否则 connect 不存在，则 module 填充的是当前模块的 identifier
     * </code></pre>
     *
     * @param in {@link IxMod} 模型对象
     *
     * @return {@link JsonObject} 解析结果
     */
    public static JsonObject onParameters(final IxMod in) {
        return IxData.parameters(in);
    }

    /**
     * 根据当前激活的模块，计算所需的 {@link HMetaAtom} 的元元模型对象
     *
     * @param active  当前激活的模块
     * @param columns 当前激活的模块的列信息
     *
     * @return {@link HMetaAtom} 计算结果
     */
    public static HMetaAtom onAtom(final IxMod active, final JsonArray columns) {
        return IxData.atom(active, columns);
    }

    // --------------------------------- Function Part

    public static <T> BiFunction<Supplier<T>, BiFunction<UxJooq, JsonObject, Future<T>>, Future<T>> seekFn(final IxMod in, final Object json) {
        return IxFn.seekFn(in, json);
    }

    public static Function<JsonObject, Future<JsonObject>> fileFn(final IxMod in, final BiFunction<JsonObject, JsonArray, Future<JsonArray>> fileFn) {
        return IxFn.fileFn(in, fileFn);
    }

    // JqTool
    @SafeVarargs
    public static <T> Future<T> passion(final T input, final IxMod in, final BiFunction<T, IxMod, Future<T>>... executors) {
        return IxFn.passion(input, in, executors);
    }

    public static <T> Function<T, Future<T>> wrap(
        final KModule module, final BiFunction<Aspect, Function<T, Future<T>>, Function<T, Future<T>>> aopFn,
        final Function<T, Future<T>> executor) {
        return IxFn.wrap(module, aopFn, executor);
    }

    // --------------------------------- Serialization / Deserialization System
    public static <T> Future<T> deserializeT(final JsonObject data, final KModule config) {
        final T reference = IxSerialize.deserializeT(data, config);
        return Ux.future(reference);
    }

    public static <T> Future<List<T>> deserializeT(final JsonArray data, final KModule config) {
        return Ux.future(IxSerialize.deserializeT(data, config));
    }

    public static <T> JsonObject serializeJ(final T input, final KModule config) {
        return IxSerialize.serializeJ(input, config);
    }

    public static <T> JsonArray serializeA(final List<T> input, final KModule config) {
        return IxSerialize.serializeA(input, config);
    }

    public static JsonObject serializeP(final JsonObject pageData, final KModule active, final KModule standBy) {
        return IxSerialize.serializeP(pageData, active, standBy);
    }

    // --------------------------------- Logger Part
    public interface LOG {

        String MODULE = "Εκδήλωση";

        LogModule Filter = Log.modulat(MODULE).extension("Filter");
        LogModule Init = Log.modulat(MODULE).extension("Init");
        LogModule Rest = Log.modulat(MODULE).extension("Rest");
        LogModule Web = Log.modulat(MODULE).extension("Web");
        LogModule Dao = Log.modulat(MODULE).extension("Dao");
        LogModule Verify = Log.modulat(MODULE).extension("Verify");
    }
}
