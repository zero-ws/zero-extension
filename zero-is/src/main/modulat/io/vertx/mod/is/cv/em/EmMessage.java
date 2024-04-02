package io.vertx.mod.is.cv.em;

/**
 * @author lang : 2024-04-02
 */
public final class EmMessage {

    public enum Status {
        PENDING,
        SENT,
        HISTORY
    }

    public enum Type {
        EMAIL,
        SMS,
        SITE,
    }
}
