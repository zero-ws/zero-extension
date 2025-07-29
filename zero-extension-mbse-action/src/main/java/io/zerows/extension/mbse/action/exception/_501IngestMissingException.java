package io.zerows.extension.mbse.action.exception;

import io.horizon.eon.em.web.HttpStatusCode;
import io.horizon.exception.WebException;

public class _501IngestMissingException extends WebException {

    public _501IngestMissingException(final Class<?> clazz) {
        super(clazz);
    }

    @Override
    public int getCode() {
        return -80401;
    }

    @Override
    public HttpStatusCode getStatus() {
        return HttpStatusCode.NOT_IMPLEMENTED;
    }
}
