package io.zerows.extension.commerce.rbac.exception;

import io.horizon.eon.em.web.HttpStatusCode;
import io.horizon.exception.WebException;
import io.zerows.extension.commerce.rbac.uca.logged.ProfileType;

public class _403ProfileConflictException extends WebException {

    public _403ProfileConflictException(final Class<?> clazz,
                                        final ProfileType expected,
                                        final ProfileType current) {
        super(clazz, expected.toString(), current.toString());
    }

    @Override
    public int getCode() {
        return -80205;
    }

    @Override
    public HttpStatusCode getStatus() {
        return HttpStatusCode.FORBIDDEN;
    }
}
