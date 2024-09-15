package io.zerows.extension.commerce.rbac.uca.timer;

import io.vertx.up.util.Ut;
import io.zerows.extension.commerce.rbac.atom.ScToken;
import org.osgi.framework.Bundle;

/**
 * @author lang : 2024-09-14
 */
public final class ClockFactory {

    private ClockFactory() {
    }

    public static ScClock<ScToken> ofToken() {
        return ofToken(null);
    }

    public static ScClock<String> ofCode() {
        return ofCode(null);
    }

    public static ScClock<String> ofSms() {
        return ofSms(null);
    }

    @SuppressWarnings("unchecked")
    public static ScClock<ScToken> ofToken(final Bundle bundle) {
        final String cacheKey = Ut.Bnd.keyCache(bundle, ScClockToken.class);
        return (ScClock<ScToken>) ScClock.CC_SKELETON.pick(() -> new ScClockToken(bundle), cacheKey);
    }

    @SuppressWarnings("unchecked")
    public static ScClock<String> ofCode(final Bundle bundle) {
        final String cacheKey = Ut.Bnd.keyCache(bundle, ScClockCode.class);
        return (ScClock<String>) ScClock.CC_SKELETON.pick(() -> new ScClockCode(bundle), cacheKey);
    }

    @SuppressWarnings("unchecked")
    public static ScClock<String> ofSms(final Bundle bundle) {
        final String cacheKey = Ut.Bnd.keyCache(bundle, ScClockSMS.class);
        return (ScClock<String>) ScClock.CC_SKELETON.pick(() -> new ScClockSMS(bundle), cacheKey);
    }
}
