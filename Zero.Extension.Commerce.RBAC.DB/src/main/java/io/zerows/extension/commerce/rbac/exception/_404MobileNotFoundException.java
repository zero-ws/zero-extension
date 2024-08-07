package io.zerows.extension.commerce.rbac.exception;

import io.horizon.eon.em.web.HttpStatusCode;
import io.horizon.exception.WebException;

/**
 * @author lang : 2024-07-12
 */
public class _404MobileNotFoundException extends WebException {
    public _404MobileNotFoundException(final Class<?> target, final String mobile) {
        super(target, mobile);
    }

    @Override
    public int getCode() {
        return -80227;
    }

    @Override
    public HttpStatusCode getStatus() {
        return HttpStatusCode.NOT_FOUND;
    }
}
