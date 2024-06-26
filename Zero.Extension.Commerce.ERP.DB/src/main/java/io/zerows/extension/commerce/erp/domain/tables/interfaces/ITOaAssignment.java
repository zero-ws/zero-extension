/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.erp.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.time.LocalDateTime;

import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.setOrThrow;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public interface ITOaAssignment extends VertxPojo, Serializable {

    /**
     * Getter for <code>ZDB.T_OA_ASSIGNMENT.KEY</code>. 「key」- Ticket Primary
     * Key
     */
    public String getKey();

    /**
     * Setter for <code>ZDB.T_OA_ASSIGNMENT.KEY</code>. 「key」- Ticket Primary
     * Key
     */
    public ITOaAssignment setKey(String value);

    /**
     * Getter for <code>ZDB.T_OA_ASSIGNMENT.COMMENT_EXTENSION</code>.
     * 「commentExtension」- Extension Comment
     */
    public String getCommentExtension();

    /**
     * Setter for <code>ZDB.T_OA_ASSIGNMENT.COMMENT_EXTENSION</code>.
     * 「commentExtension」- Extension Comment
     */
    public ITOaAssignment setCommentExtension(String value);

    /**
     * Getter for <code>ZDB.T_OA_ASSIGNMENT.REQUEST_BY</code>. 「requestBy」-
     * Request User
     */
    public String getRequestBy();

    /**
     * Setter for <code>ZDB.T_OA_ASSIGNMENT.REQUEST_BY</code>. 「requestBy」-
     * Request User
     */
    public ITOaAssignment setRequestBy(String value);

    /**
     * Getter for <code>ZDB.T_OA_ASSIGNMENT.START_AT</code>. 「startAt」- From
     */
    public LocalDateTime getStartAt();

    /**
     * Setter for <code>ZDB.T_OA_ASSIGNMENT.START_AT</code>. 「startAt」- From
     */
    public ITOaAssignment setStartAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.T_OA_ASSIGNMENT.END_AT</code>. 「endAt」- To
     */
    public LocalDateTime getEndAt();

    /**
     * Setter for <code>ZDB.T_OA_ASSIGNMENT.END_AT</code>. 「endAt」- To
     */
    public ITOaAssignment setEndAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.T_OA_ASSIGNMENT.DAYS</code>. 「days」- Duration
     */
    public Integer getDays();

    /**
     * Setter for <code>ZDB.T_OA_ASSIGNMENT.DAYS</code>. 「days」- Duration
     */
    public ITOaAssignment setDays(Integer value);

    /**
     * Getter for <code>ZDB.T_OA_ASSIGNMENT.REASON</code>. 「reason」- The reason
     * to be done
     */
    public String getReason();

    /**
     * Setter for <code>ZDB.T_OA_ASSIGNMENT.REASON</code>. 「reason」- The reason
     * to be done
     */
    public ITOaAssignment setReason(String value);

    /**
     * Getter for <code>ZDB.T_OA_ASSIGNMENT.WORK_CONTENT</code>. 「workContent」-
     * Working Assignment Content
     */
    public String getWorkContent();

    /**
     * Setter for <code>ZDB.T_OA_ASSIGNMENT.WORK_CONTENT</code>. 「workContent」-
     * Working Assignment Content
     */
    public ITOaAssignment setWorkContent(String value);

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface ITOaAssignment
     */
    public void from(ITOaAssignment from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface ITOaAssignment
     */
    public <E extends ITOaAssignment> E into(E into);

    @Override
    public default ITOaAssignment fromJson(io.vertx.core.json.JsonObject json) {
        setOrThrow(this::setKey, json::getString, "KEY", "java.lang.String");
        setOrThrow(this::setCommentExtension, json::getString, "COMMENT_EXTENSION", "java.lang.String");
        setOrThrow(this::setRequestBy, json::getString, "REQUEST_BY", "java.lang.String");
        setOrThrow(this::setStartAt, key -> {
            String s = json.getString(key);
            return s == null ? null : java.time.LocalDateTime.parse(s);
        }, "START_AT", "java.time.LocalDateTime");
        setOrThrow(this::setEndAt, key -> {
            String s = json.getString(key);
            return s == null ? null : java.time.LocalDateTime.parse(s);
        }, "END_AT", "java.time.LocalDateTime");
        setOrThrow(this::setDays, json::getInteger, "DAYS", "java.lang.Integer");
        setOrThrow(this::setReason, json::getString, "REASON", "java.lang.String");
        setOrThrow(this::setWorkContent, json::getString, "WORK_CONTENT", "java.lang.String");
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("KEY", getKey());
        json.put("COMMENT_EXTENSION", getCommentExtension());
        json.put("REQUEST_BY", getRequestBy());
        json.put("START_AT", getStartAt() == null ? null : getStartAt().toString());
        json.put("END_AT", getEndAt() == null ? null : getEndAt().toString());
        json.put("DAYS", getDays());
        json.put("REASON", getReason());
        json.put("WORK_CONTENT", getWorkContent());
        return json;
    }

}
