package io.zerows.extension.runtime.skeleton.eon.em;

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
        MESSAGE,
    }
}
