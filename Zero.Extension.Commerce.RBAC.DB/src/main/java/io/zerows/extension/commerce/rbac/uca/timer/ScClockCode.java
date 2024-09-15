package io.zerows.extension.commerce.rbac.uca.timer;

import io.horizon.exception.web._501NotSupportException;
import io.vertx.core.json.JsonObject;
import io.vertx.up.util.Ut;
import io.zerows.extension.commerce.rbac.atom.ScConfig;
import io.zerows.extension.commerce.rbac.bootstrap.ScPin;
import io.zerows.extension.commerce.rbac.eon.ScConstant;
import org.osgi.framework.Bundle;

/**
 * 带计时器的数据池，用于保存授权码相关信息
 * <pre><code>
 *     1. 授权码的超时时间在 {@link ScConfig#getCodeExpired()} 可配置，默认 30s
 *     2. 授权码的长度在 {@link ScConfig#getCodeLength()} 配置，默认 4
 *     3. 缓存池的名称 POOL_CODE
 *     4. 键：sessionId
 * </code></pre>
 *
 * @author lang : 2024-09-14
 */
class ScClockCode extends AbstractClock<String> {
    private static final ScConfig CONFIG = ScPin.getConfig();

    ScClockCode(final Bundle bundle) {
        super(bundle, ScConstant.POOL_CODE);
    }

    @Override
    public String generate() {
        final int length = CONFIG.getCodeLength();
        final String code = Ut.randomString(length);
        this.logger().info("Generated Authorization Code: {}", code);
        return code;
    }

    @Override
    public String generate(final JsonObject config) {
        throw Ut.Bnd.failureWeb(_501NotSupportException.class, this.getClass());
    }


    @Override
    protected int getTtl() {
        return CONFIG.getCodeExpired();
    }
}
