package io.mature.extension.migration;

import io.horizon.eon.em.Environment;
import io.macrocosm.specification.app.HApp;
import io.macrocosm.specification.program.HArk;
import io.mature.extension.refine.Ox;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.KName;
import io.vertx.up.fn.Fn;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import io.zerows.core.feature.database.cp.zdk.DataPool;
import io.zerows.core.feature.database.jooq.operation.UxJooq;

import java.util.Objects;

public class Around {
    private final transient Environment environment;
    private transient HArk ark;

    private Around(final Environment environment) {
        this.environment = environment;
    }

    public static Around create(final Environment environment) {
        return new Around(environment);
    }

    public Around bind(final HArk ark) {
        this.ark = ark;
        return this;
    }

    /*
     * 配置层专用处理，注意合约模式
     */
    public Future<JsonObject> aspectAsync(final JsonObject config, final String key) {
        final JsonObject configData = Ut.valueJObject(config);
        final JsonObject component = Ut.valueJObject(configData.getJsonObject(key));
        if (Ut.isNil(component)) {
            /*
             * 为空，直接过
             */
            return Ux.future(config);
        } else {
            /*
             * 提取类名和配置
             */
            final Class<?> componentCls = Ut.clazz(component.getString("component"), null);
            if (Objects.isNull(componentCls)) {
                return Ux.future(config);
            } else {
                /*
                 * 组件配置
                 */
                final JsonObject componentConfig = Ut.valueJObject(component.getJsonObject("config"));
                return this.captureAsync(componentCls, componentConfig).compose(Fn.ifNil(
                    () -> config,
                    step -> step.procAsync(config))
                );
            }
        }
    }

    private Future<MigrateStep> captureAsync(final Class<?> clazz, final JsonObject config) {
        final Class<?> daoCls = Ut.clazz(config.getString("dao"), null);
        if (Objects.isNull(daoCls)) {
            return Ux.future();
        } else {
            return this.captureAsync(config).compose(ds -> {
                final UxJooq jooq = Ux.Jooq.on(daoCls, ds);
                final MigrateStep step = Ut.instance(clazz, this.environment);
                Ut.contract(step, UxJooq.class, jooq);
                Ut.contract(step, Class.class, daoCls);
                Ut.contract(step, String.class, config.getString("folder"));
                step.bind(this.ark);        // 绑定 App
                return Ux.future(step);
            });
        }
    }

    private Future<DataPool> captureAsync(final JsonObject config) {
        final String source = config.getString(KName.SOURCE);
        if ("DYNAMIC".equals(source)) {
            final HApp app = this.ark.app();
            return Ox.runDs(app.option(KName.SIGMA),
                DataPool::create,
                Ux::future
            );
        } else {
            return Ux.future(DataPool.create());
        }
    }
}
