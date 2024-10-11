package io.zerows.extension.runtime.report.exception;

import io.horizon.eon.em.web.HttpStatusCode;
import io.horizon.exception.WebException;

/**
 * @author lang : 2024-10-11
 */
public class _404ReportMissingException extends WebException {
    public _404ReportMissingException(final Class<?> target) {
        super(target);
    }

    @Override
    public int getCode() {
        return -80701;
    }

    @Override
    public HttpStatusCode getStatus() {
        return HttpStatusCode.NOT_FOUND;
    }
}
