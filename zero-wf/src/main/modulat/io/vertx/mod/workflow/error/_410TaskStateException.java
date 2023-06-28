package io.vertx.mod.workflow.error;

import io.horizon.eon.em.web.HttpStatusCode;
import io.horizon.exception.WebException;

/**
 * @author lang : 2023-06-29
 */
public class _410TaskStateException extends WebException {

    public _410TaskStateException(final Class<?> clazz,
                                  final String id) {
        super(clazz, id);
    }

    @Override
    public HttpStatusCode getStatus() {
        return HttpStatusCode.GONE;
    }

    @Override
    public int getCode() {
        return -80611;
    }
}
