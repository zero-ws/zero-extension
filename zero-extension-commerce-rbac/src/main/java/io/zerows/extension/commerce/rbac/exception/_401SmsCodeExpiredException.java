package io.zerows.extension.commerce.rbac.exception;

import io.horizon.eon.em.web.HttpStatusCode;
import io.horizon.exception.WebException;

public class _401SmsCodeExpiredException extends WebException {

    public _401SmsCodeExpiredException(final Class<?> clazz,
                                       final String clientId,
                                       final String code) {
        super(clazz, clientId, code);
    }

    @Override
    public int getCode() {
        return -80230;
    }

    @Override
    public HttpStatusCode getStatus() {
        return HttpStatusCode.UNAUTHORIZED;
    }
}
