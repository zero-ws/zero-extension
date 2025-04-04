package io.mature.stellar.vendor;

import io.horizon.atom.datamation.KDictConfig;
import io.horizon.atom.datamation.KFabric;
import io.macrocosm.specification.program.HArk;
import io.mature.boot.supply.Envoy;
import io.mature.stellar.owner.OkA;
import io.vertx.core.Future;
import io.vertx.core.MultiMap;
import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.KName;
import io.vertx.up.eon.KWeb;
import io.vertx.up.unity.Ux;
import io.zerows.core.feature.database.atom.Database;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public abstract class AbstractPartyB implements OkB {
    protected final transient OkA partyA;

    protected AbstractPartyB(final OkA partyA) {
        this.partyA = partyA;
    }

    /**
     * 获取数据库对象默认实现
     * > 「RD」桥梁模式扩展。
     *
     * @return {@link Database}
     */
    @Override
    public Database configDatabase() {
        return this.partyA.configDatabase();
    }

    /**
     * 获取应用配置对象默认实现
     * > 「RD」桥梁模式扩展
     *
     * @return {@link io.macrocosm.specification.program.HArk}
     */
    @Override
    public HArk configArk() {
        return this.partyA.configArk();
    }

    /**
     * 「Async」根据统一标识符异步构造某一个模型的字典翻译器
     *
     * @param identifier {@link String} 传入的模型统一标识符
     *
     * @return `{@link Future}<{@link KFabric}>`
     */
    @Override
    public Future<KFabric> fabric(final String identifier) {
        final MultiMap params = this.input(identifier);
        params.add(KName.CACHE_KEY, KWeb.CACHE.JOB_DIRECTORY);
        final KDictConfig dict = this.configDict();
        return Ux.dictAtom(dict, params, this.map(), identifier);
    }

    /**
     * 根据传入的模型统一标识符构造统一的参数哈希表:
     * ```json
     * // <pre><code class="json">
     * {
     *     "identifier": "模型标识符",
     *     "sigma": "统一标识符",
     *     "appId": "应用主键，对应X_APP中的key值"
     * }
     * // </code></pre>
     * ```
     *
     * @param identifier {@link String} 模型统一标识符
     *
     * @return {@link MultiMap} 返回参数哈希表
     */
    private MultiMap input(final String identifier) {
        return Envoy.input(this.partyA, identifier);
    }

    protected JsonObject inputQr() {
        return Envoy.inputQr(this.partyA);
    }
}
