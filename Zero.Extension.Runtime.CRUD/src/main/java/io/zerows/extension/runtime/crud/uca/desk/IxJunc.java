package io.zerows.extension.runtime.crud.uca.desk;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.zerows.extension.runtime.crud.uca.destine.Probe;
import io.vertx.up.eon.KName;
import io.vertx.up.eon.em.EmPRI;
import io.zerows.core.domain.atom.specification.KJoin;
import io.zerows.core.domain.atom.specification.KPoint;
import io.zerows.core.domain.uca.destine.Hymn;
import io.zerows.core.feature.web.mbse.atom.specification.KModule;
import io.zerows.extension.runtime.crud.eon.Pooled;

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

        final KModule module = this.mod.module();
        final KJoin connect = module.getConnect();
        /*
         * 若 KJoin 无法提取，则证明当前模型不支持连接模型
         * 1. 不支持子模型 sub-module
         * 2. 不支持引用模型 refer-module
         * 这种场景下可以完全不用考虑
         */
        if (Objects.isNull(connect)) {
            return null;
        }


        if (EmPRI.Connect.PARENT_STANDBY == connect.refer()) {
            // 父从表：引用模型，引用模型不依赖输入信息
            return this.connectRefer(connect);
        } else {
            // 父主表：子模型
            return this.connectJoined(connect, input);
        }
    }

    private IxMod connectRefer(final KJoin connect) {
        final KPoint target = connect.getReference();
        if (Objects.isNull(target)) {
            return null;
        }
        final Probe probe = Probe.of(target.modeTarget());
        if (Objects.isNull(probe)) {
            return null;
        }
        return probe.create(target, this.mod);
    }


    private IxMod connectJoined(final KJoin connect, final Object input) {
        /*
         * 一旦调用了此方法，证明启用了连接模式处理，这种场景下，需要启用连接模式，这种场景中会直接
         * 设置
         * module = input
         */
        if (input instanceof String) {
            this.mod.parameters().put(KName.MODULE, input);
        }
        /*
         * 执行添加和删除 ADD / UPDATE
         *    1.1. P1：module 参数是第一优先级，根据此参数执行提取得到连接点
         *    1.2. P2：若 module 没有提供，此处会执行一个 SMART 流程对 Body 进行解析和分析
         *    1.3. P3：默认流程执行
         * 其他情况
         *    2.1. P1：同上 P2
         *    2.2. P2：同上 P3
         */
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

        if (Objects.isNull(target)) {
            return null;
        }
        final Probe probe = Probe.of(target.modeTarget());
        if (Objects.isNull(probe)) {
            return null;
        }
        return probe.create(target, this.mod);
    }
}
