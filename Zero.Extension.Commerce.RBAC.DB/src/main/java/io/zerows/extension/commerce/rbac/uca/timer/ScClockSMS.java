package io.zerows.extension.commerce.rbac.uca.timer;

import io.horizon.exception.web._501NotSupportException;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import io.zerows.extension.commerce.rbac.atom.ScConfig;
import io.zerows.extension.commerce.rbac.bootstrap.ScPin;
import io.zerows.extension.commerce.rbac.eon.ScConstant;
import io.zerows.extension.commerce.rbac.exception._401SmsCodeExpiredException;
import io.zerows.extension.commerce.rbac.exception._401SmsCodeWrongException;
import org.osgi.framework.Bundle;

import java.util.Objects;

/**
 * 带计时器的数据池，用于保存短信码相关信息
 * <pre><code>
 *     1. 短信码的超时时间默认 60s
 *     2. 短信码的长度在 {@link ScConfig#getCodeLength()} 配置，默认 4
 *     3. 缓存池的名称 POOL_CODE_SMS
 *     4. 键：sessionId
 * </code></pre>
 *
 * @author lang : 2024-09-14
 */
class ScClockSMS extends AbstractClock<String> {
    private static final ScConfig CONFIG = ScPin.getConfig();

    ScClockSMS(final Bundle bundle) {
        super(bundle, ScConstant.POOL_CODE_SMS);
    }

    @Override
    public String generate() {
        final int length = CONFIG.getMessageLength();
        final String code = Ut.randomString(length);
        this.logger().info("Generated Mobile SMS Code: {}", code);
        return code;
    }

    @Override
    public String generate(final JsonObject config) {
        throw Ut.Bnd.failWeb(_501NotSupportException.class, this.getClass());
    }


    @Override
    public int configTtl() {
        return CONFIG.getMessageExpired();
    }

    /**
     * 异常说明
     * <pre><code>
     *     {@link _401SmsCodeExpiredException} 短信码过期异常
     *     {@link _401SmsCodeWrongException} 短信码错误不匹配
     * </code></pre>
     *
     * @param stored   缓存中存储的值
     * @param waiting  等待验证的值（字面量）
     * @param identity 验证标识
     *
     * @return 验证结果
     */
    @Override
    @SuppressWarnings("unchecked")
    public Future<String> verify(final String stored, final String waiting, final String identity) {
        // identity = sessionId
        if (Objects.isNull(stored)) {
            // 401: Authorization Code Expired, The item is null, it means that code is expired
            return Ut.Bnd.failOut(_401SmsCodeExpiredException.class, this.getClass(), identity, waiting);
        }
        if (!waiting.equals(stored)) {
            // 401: Wrong code provided ( Api Client )
            return Ut.Bnd.failOut(_401SmsCodeWrongException.class, this.getClass(), waiting);
        }
        return Ux.future(identity);
    }
}
