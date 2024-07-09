package io.zerows.extension.mbse.modulat.atom;

import io.horizon.uca.cache.Cc;
import io.macrocosm.specification.app.HMod;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import io.zerows.extension.mbse.modulat.store.OCacheMod;
import io.zerows.extension.runtime.skeleton.osgi.spi.modeler.Modulat;

import java.util.Objects;

/**
 * 新版去掉原来繁琐的流程，构造新流程处理
 * <pre><code>
 *     1. 根据 appId 从环境中提取 {@link OCacheMod} 的缓存信息
 *     2. 每个缓存信息中都会包含 mName = {@link HMod} 的基本信息
 * </code></pre>
 *
 * @author lang : 2024-07-08
 */
public class PowerApp {

    private static final Cc<String, Future<PowerApp>> CC_APP = Cc.open();
    private final OCacheMod modReference;

    public PowerApp(final String appId) {
        // 抓取应用关键的引用
        this.modReference = OCacheMod.of(appId);
    }

    public static Future<PowerApp> getOrCreate(final String appId) {
        Objects.requireNonNull(appId);
        return CC_APP.pick(() -> Ux.channel(Modulat.class, JsonObject::new, modulat -> modulat.extension(appId)).compose(storedJ -> {
            final String configApp = Ut.valueString(storedJ, KName.KEY);
            if (appId.equals(configApp)) {
                // 抓取应用相关的 HMod 缓存
                final PowerApp app = new PowerApp(appId);


                /*
                 * 移除 bags / key
                 */
                final JsonObject configAppJ = storedJ.copy();
                configAppJ.remove(KName.KEY);
                configAppJ.remove(KName.App.BAGS);
                Ut.itJObject(configAppJ, JsonObject.class)
                    .map(entry -> new PowerMod(entry.getKey(), entry.getValue()))
                    .forEach(app::add);
                return Ux.future(app);
            }
            return Ux.future(null);
        }), appId);
    }

    public static Future<PowerApp> getLatest(final String appId) {
        CC_APP.remove(appId);
        return getOrCreate(appId);
    }

    public PowerApp add(final HMod mod) {
        this.modReference.add(mod);
        return this;
    }

    public HMod block(final String name) {
        return this.modReference.valueGet(name);
    }
}
