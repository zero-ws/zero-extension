package io.zerows.extension.commerce.rbac.uca.timer;

import io.horizon.uca.cache.Cc;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.up.util.Ut;
import io.zerows.core.feature.web.cache.Rapid;
import io.zerows.core.metadata.uca.logging.OLog;

/**
 * 操作
 * <pre><code>
 *     1. 生成对应的值，两种生成方式
 *        - 带配置生成
 *        - 不带配置生成
 *     2. 存储对应的值
 *     3. 获取对应的值
 *     4. 强制删除
 * </code></pre>
 * 操作对象
 * <pre><code>
 *     1. 授权码
 *     2. 短信码
 *     3. 令牌
 * </code></pre>
 * 没有统一归口的部分：用户、组、角色、图片验证码、ACL管理部分
 *
 * @author lang : 2024-09-14
 */
public interface ScClock<T> {

    Cc<String, ScClock<?>> CC_SKELETON = Cc.open();

    default T generate() {
        return this.generate(null);
    }

    T generate(JsonObject config);

    /**
     * 仅读取，不删除，标准方式（只要在时间范围内一定可以读取到）
     *
     * @param key    键
     * @param isOnce 是否一次性读取
     *
     * @return 读取结果
     */
    Future<T> get(String key, boolean isOnce);

    Future<T> put(String key, T value, String... moreKeys);

    Rapid<String, T> ofCache();

    default OLog logger() {
        return Ut.Log.security(this.getClass());
    }
}
