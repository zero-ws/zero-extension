package io.zerows.extension.runtime.ambient.uca.dict;

import io.horizon.atom.datamation.KDictSource;
import io.vertx.core.Future;
import io.vertx.core.MultiMap;
import io.vertx.core.json.JsonArray;
import io.vertx.up.eon.KName;
import io.vertx.up.eon.KWeb;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import io.zerows.core.cloud.zdk.spi.DictionaryPlugin;
import io.zerows.core.feature.web.cache.Rapid;

import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * ## `Assist` Dict
 *
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class DpmAssist implements Dpm {
    @Override
    public Future<ConcurrentMap<String, JsonArray>> fetchAsync(final KDictSource source, final MultiMap params) {
        final ConcurrentMap<String, JsonArray> uniqueMap = new ConcurrentHashMap<>();
        final DictionaryPlugin plugin = source.getPlugin();
        if (Objects.isNull(plugin) || Ut.isNil(source.getKey())) {
            return Ux.future(uniqueMap);
        } else {
            return Rapid.<String, JsonArray>object(Ut.isNil(params.get(KName.CACHE_KEY)) ? KWeb.CACHE.DIRECTORY : params.get(KName.CACHE_KEY), KWeb.ARGS.V_DATA_EXPIRED)
                .cached(source.getKey(), () -> {
                    plugin.configuration(source.getPluginConfig());
                    return plugin.fetchAsync(source, params);
                }).compose(result -> {
                    uniqueMap.put(source.getKey(), result);
                    return Ux.future(uniqueMap);
                });
        }
    }

    @Override
    public ConcurrentMap<String, JsonArray> fetch(final KDictSource source, final MultiMap params) {
        final ConcurrentMap<String, JsonArray> uniqueMap = new ConcurrentHashMap<>();
        final DictionaryPlugin plugin = source.getPlugin();
        if (Objects.isNull(plugin) || Ut.isNil(source.getKey())) {
            return uniqueMap;
        } else {
            plugin.configuration(source.getPluginConfig());
            final JsonArray result = plugin.fetch(source, params);
            uniqueMap.put(source.getKey(), result);
            return uniqueMap;
        }
    }
}
