/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.records;


import cn.vertxup.erp.domain.tables.TVendorCheckOut;
import cn.vertxup.erp.domain.tables.interfaces.ITVendorCheckOut;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TVendorCheckOutRecord extends UpdatableRecordImpl<TVendorCheckOutRecord> implements VertxPojo, Record8<String, String, String, LocalDateTime, LocalDateTime, Integer, LocalDateTime, String>, ITVendorCheckOut {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>DB_ETERNAL.T_VENDOR_CHECK_OUT.KEY</code>. 「key」- Ticket
     * Primary Key
     */
    @Override
    public TVendorCheckOutRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_VENDOR_CHECK_OUT.KEY</code>. 「key」- Ticket
     * Primary Key
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.T_VENDOR_CHECK_OUT.COMMENT_EXTENSION</code>.
     * 「commentExtension」- Extension Comment
     */
    @Override
    public TVendorCheckOutRecord setCommentExtension(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_VENDOR_CHECK_OUT.COMMENT_EXTENSION</code>.
     * 「commentExtension」- Extension Comment
     */
    @Override
    public String getCommentExtension() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.T_VENDOR_CHECK_OUT.CLASSIFICATION</code>.
     * 「classification」- The ticket related business type
     */
    @Override
    public TVendorCheckOutRecord setClassification(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_VENDOR_CHECK_OUT.CLASSIFICATION</code>.
     * 「classification」- The ticket related business type
     */
    @Override
    public String getClassification() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.T_VENDOR_CHECK_OUT.START_AT</code>.
     * 「startAt」- From
     */
    @Override
    public TVendorCheckOutRecord setStartAt(LocalDateTime value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_VENDOR_CHECK_OUT.START_AT</code>.
     * 「startAt」- From
     */
    @Override
    public LocalDateTime getStartAt() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.T_VENDOR_CHECK_OUT.END_AT</code>. 「endAt」- To
     */
    @Override
    public TVendorCheckOutRecord setEndAt(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_VENDOR_CHECK_OUT.END_AT</code>. 「endAt」- To
     */
    @Override
    public LocalDateTime getEndAt() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.T_VENDOR_CHECK_OUT.DAYS</code>. 「days」-
     * Duration
     */
    @Override
    public TVendorCheckOutRecord setDays(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_VENDOR_CHECK_OUT.DAYS</code>. 「days」-
     * Duration
     */
    @Override
    public Integer getDays() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.T_VENDOR_CHECK_OUT.LEAVE_AT</code>.
     * 「leaveAt」- To
     */
    @Override
    public TVendorCheckOutRecord setLeaveAt(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_VENDOR_CHECK_OUT.LEAVE_AT</code>.
     * 「leaveAt」- To
     */
    @Override
    public LocalDateTime getLeaveAt() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.T_VENDOR_CHECK_OUT.REASON</code>. 「reason」-
     * The reason to be done
     */
    @Override
    public TVendorCheckOutRecord setReason(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_VENDOR_CHECK_OUT.REASON</code>. 「reason」-
     * The reason to be done
     */
    @Override
    public String getReason() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<String, String, String, LocalDateTime, LocalDateTime, Integer, LocalDateTime, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<String, String, String, LocalDateTime, LocalDateTime, Integer, LocalDateTime, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return TVendorCheckOut.T_VENDOR_CHECK_OUT.KEY;
    }

    @Override
    public Field<String> field2() {
        return TVendorCheckOut.T_VENDOR_CHECK_OUT.COMMENT_EXTENSION;
    }

    @Override
    public Field<String> field3() {
        return TVendorCheckOut.T_VENDOR_CHECK_OUT.CLASSIFICATION;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return TVendorCheckOut.T_VENDOR_CHECK_OUT.START_AT;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return TVendorCheckOut.T_VENDOR_CHECK_OUT.END_AT;
    }

    @Override
    public Field<Integer> field6() {
        return TVendorCheckOut.T_VENDOR_CHECK_OUT.DAYS;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return TVendorCheckOut.T_VENDOR_CHECK_OUT.LEAVE_AT;
    }

    @Override
    public Field<String> field8() {
        return TVendorCheckOut.T_VENDOR_CHECK_OUT.REASON;
    }

    @Override
    public String component1() {
        return getKey();
    }

    @Override
    public String component2() {
        return getCommentExtension();
    }

    @Override
    public String component3() {
        return getClassification();
    }

    @Override
    public LocalDateTime component4() {
        return getStartAt();
    }

    @Override
    public LocalDateTime component5() {
        return getEndAt();
    }

    @Override
    public Integer component6() {
        return getDays();
    }

    @Override
    public LocalDateTime component7() {
        return getLeaveAt();
    }

    @Override
    public String component8() {
        return getReason();
    }

    @Override
    public String value1() {
        return getKey();
    }

    @Override
    public String value2() {
        return getCommentExtension();
    }

    @Override
    public String value3() {
        return getClassification();
    }

    @Override
    public LocalDateTime value4() {
        return getStartAt();
    }

    @Override
    public LocalDateTime value5() {
        return getEndAt();
    }

    @Override
    public Integer value6() {
        return getDays();
    }

    @Override
    public LocalDateTime value7() {
        return getLeaveAt();
    }

    @Override
    public String value8() {
        return getReason();
    }

    @Override
    public TVendorCheckOutRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public TVendorCheckOutRecord value2(String value) {
        setCommentExtension(value);
        return this;
    }

    @Override
    public TVendorCheckOutRecord value3(String value) {
        setClassification(value);
        return this;
    }

    @Override
    public TVendorCheckOutRecord value4(LocalDateTime value) {
        setStartAt(value);
        return this;
    }

    @Override
    public TVendorCheckOutRecord value5(LocalDateTime value) {
        setEndAt(value);
        return this;
    }

    @Override
    public TVendorCheckOutRecord value6(Integer value) {
        setDays(value);
        return this;
    }

    @Override
    public TVendorCheckOutRecord value7(LocalDateTime value) {
        setLeaveAt(value);
        return this;
    }

    @Override
    public TVendorCheckOutRecord value8(String value) {
        setReason(value);
        return this;
    }

    @Override
    public TVendorCheckOutRecord values(String value1, String value2, String value3, LocalDateTime value4, LocalDateTime value5, Integer value6, LocalDateTime value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(ITVendorCheckOut from) {
        setKey(from.getKey());
        setCommentExtension(from.getCommentExtension());
        setClassification(from.getClassification());
        setStartAt(from.getStartAt());
        setEndAt(from.getEndAt());
        setDays(from.getDays());
        setLeaveAt(from.getLeaveAt());
        setReason(from.getReason());
        resetChangedOnNotNull();
    }

    @Override
    public <E extends ITVendorCheckOut> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TVendorCheckOutRecord
     */
    public TVendorCheckOutRecord() {
        super(TVendorCheckOut.T_VENDOR_CHECK_OUT);
    }

    /**
     * Create a detached, initialised TVendorCheckOutRecord
     */
    public TVendorCheckOutRecord(String key, String commentExtension, String classification, LocalDateTime startAt, LocalDateTime endAt, Integer days, LocalDateTime leaveAt, String reason) {
        super(TVendorCheckOut.T_VENDOR_CHECK_OUT);

        setKey(key);
        setCommentExtension(commentExtension);
        setClassification(classification);
        setStartAt(startAt);
        setEndAt(endAt);
        setDays(days);
        setLeaveAt(leaveAt);
        setReason(reason);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised TVendorCheckOutRecord
     */
    public TVendorCheckOutRecord(cn.vertxup.erp.domain.tables.pojos.TVendorCheckOut value) {
        super(TVendorCheckOut.T_VENDOR_CHECK_OUT);

        if (value != null) {
            setKey(value.getKey());
            setCommentExtension(value.getCommentExtension());
            setClassification(value.getClassification());
            setStartAt(value.getStartAt());
            setEndAt(value.getEndAt());
            setDays(value.getDays());
            setLeaveAt(value.getLeaveAt());
            setReason(value.getReason());
            resetChangedOnNotNull();
        }
    }

        public TVendorCheckOutRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
