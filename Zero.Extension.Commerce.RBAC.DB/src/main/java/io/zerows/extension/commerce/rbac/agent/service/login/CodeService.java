package io.zerows.extension.commerce.rbac.agent.service.login;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.up.fn.Fn;
import io.vertx.up.unity.Ux;
import io.zerows.core.domain.atom.typed.UObject;
import io.zerows.extension.commerce.rbac.eon.AuthKey;
import io.zerows.extension.commerce.rbac.exception._401CodeExpiredException;
import io.zerows.extension.commerce.rbac.exception._401CodeWrongException;
import io.zerows.extension.commerce.rbac.uca.timer.ClockFactory;
import io.zerows.extension.commerce.rbac.uca.timer.ScClock;

import java.util.Objects;

public class CodeService implements CodeStub {
    private final ScClock<String> cache;

    public CodeService() {
        this.cache = ClockFactory.ofCode();
    }

    @Override
    public Future<JsonObject> authorize(final String clientId) {
        // Generate random authorization code
        final String authCode = this.cache.generate();

        // Whether existing state
        final JsonObject response = new JsonObject();
        // Enable SharedClient to store authCode
        return this.cache.put(clientId, authCode).compose(item -> UObject.create(response)
            .append(AuthKey.AUTH_CODE, item)
            .toFuture());
    }

    @Override
    @SuppressWarnings("all")
    public Future<String> verify(final String clientId, final String code) {
        // Shared code in pool here to get code
        return this.cache.get(clientId, true).compose(item -> {
            if (Objects.isNull(item)) {
                // 401: Authorization Code Expired, The item is null, it means that code is expired
                return Fn.outWeb(_401CodeExpiredException.class, this.getClass(), clientId, code);
            }
            if (!code.equals(item)) {
                // 401: Wrong code provided ( Api Client )
                return Fn.outWeb(_401CodeWrongException.class, this.getClass(), code);
            }
            // Successfully
            return Ux.future(clientId);
        });
    }
}
