package io.zerows.extension.runtime.exception;

import io.horizon.eon.em.web.HttpStatusCode;
import io.horizon.exception.WebException;

/**
 * @author lang : 2023-06-12
 */
public class _417LoadingNotReadyException extends WebException {

    public _417LoadingNotReadyException(final Class<?> target, final String key) {
        super(target, key);
    }

    @Override
    public int getCode() {
        return -80218;
    }

    @Override
    public HttpStatusCode getStatus() {
        return HttpStatusCode.EXPECTATION_FAILED;
    }
}
