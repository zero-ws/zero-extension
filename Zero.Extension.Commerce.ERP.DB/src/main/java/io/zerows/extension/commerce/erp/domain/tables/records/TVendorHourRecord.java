/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.erp.domain.tables.records;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.zerows.extension.commerce.erp.domain.tables.TVendorHour;
import io.zerows.extension.commerce.erp.domain.tables.interfaces.ITVendorHour;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;

import java.time.LocalDateTime;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class TVendorHourRecord extends UpdatableRecordImpl<TVendorHourRecord> implements VertxPojo, Record11<String, String, String, LocalDateTime, LocalDateTime, Integer, String, String, LocalDateTime, String, LocalDateTime>, ITVendorHour {

    private static final long serialVersionUID = 1L;

    /**
     * Create a detached TVendorHourRecord
     */
    public TVendorHourRecord() {
        super(TVendorHour.T_VENDOR_HOUR);
    }

    /**
     * Create a detached, initialised TVendorHourRecord
     */
    public TVendorHourRecord(String key, String commentExtension, String classification, LocalDateTime startAt, LocalDateTime endAt, Integer days, String requestType, String fromType, LocalDateTime fromAt, String toType, LocalDateTime toAt) {
        super(TVendorHour.T_VENDOR_HOUR);

        setKey(key);
        setCommentExtension(commentExtension);
        setClassification(classification);
        setStartAt(startAt);
        setEndAt(endAt);
        setDays(days);
        setRequestType(requestType);
        setFromType(fromType);
        setFromAt(fromAt);
        setToType(toType);
        setToAt(toAt);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised TVendorHourRecord
     */
    public TVendorHourRecord(io.zerows.extension.commerce.erp.domain.tables.pojos.TVendorHour value) {
        super(TVendorHour.T_VENDOR_HOUR);

        if (value != null) {
            setKey(value.getKey());
            setCommentExtension(value.getCommentExtension());
            setClassification(value.getClassification());
            setStartAt(value.getStartAt());
            setEndAt(value.getEndAt());
            setDays(value.getDays());
            setRequestType(value.getRequestType());
            setFromType(value.getFromType());
            setFromAt(value.getFromAt());
            setToType(value.getToType());
            setToAt(value.getToAt());
            resetChangedOnNotNull();
        }
    }

    public TVendorHourRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    /**
     * Getter for <code>ZDB.T_VENDOR_HOUR.KEY</code>. 「key」- Ticket Primary Key
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>ZDB.T_VENDOR_HOUR.KEY</code>. 「key」- Ticket Primary Key
     */
    @Override
    public TVendorHourRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.T_VENDOR_HOUR.COMMENT_EXTENSION</code>.
     * 「commentExtension」- Extension Comment
     */
    @Override
    public String getCommentExtension() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ZDB.T_VENDOR_HOUR.COMMENT_EXTENSION</code>.
     * 「commentExtension」- Extension Comment
     */
    @Override
    public TVendorHourRecord setCommentExtension(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.T_VENDOR_HOUR.CLASSIFICATION</code>.
     * 「classification」- The ticket related income type
     */
    @Override
    public String getClassification() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ZDB.T_VENDOR_HOUR.CLASSIFICATION</code>.
     * 「classification」- The ticket related income type
     */
    @Override
    public TVendorHourRecord setClassification(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.T_VENDOR_HOUR.START_AT</code>. 「startAt」- From
     */
    @Override
    public LocalDateTime getStartAt() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>ZDB.T_VENDOR_HOUR.START_AT</code>. 「startAt」- From
     */
    @Override
    public TVendorHourRecord setStartAt(LocalDateTime value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.T_VENDOR_HOUR.END_AT</code>. 「endAt」- To
     */
    @Override
    public LocalDateTime getEndAt() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>ZDB.T_VENDOR_HOUR.END_AT</code>. 「endAt」- To
     */
    @Override
    public TVendorHourRecord setEndAt(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.T_VENDOR_HOUR.DAYS</code>. 「days」- Duration
     */
    @Override
    public Integer getDays() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>ZDB.T_VENDOR_HOUR.DAYS</code>. 「days」- Duration
     */
    @Override
    public TVendorHourRecord setDays(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.T_VENDOR_HOUR.REQUEST_TYPE</code>. 「requestType」-
     * Request type of hour
     */
    @Override
    public String getRequestType() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ZDB.T_VENDOR_HOUR.REQUEST_TYPE</code>. 「requestType」-
     * Request type of hour
     */
    @Override
    public TVendorHourRecord setRequestType(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.T_VENDOR_HOUR.FROM_TYPE</code>. 「fromType」
     */
    @Override
    public String getFromType() {
        return (String) get(7);
    }

    /**
     * Setter for <code>ZDB.T_VENDOR_HOUR.FROM_TYPE</code>. 「fromType」
     */
    @Override
    public TVendorHourRecord setFromType(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.T_VENDOR_HOUR.FROM_AT</code>. 「fromAt」
     */
    @Override
    public LocalDateTime getFromAt() {
        return (LocalDateTime) get(8);
    }

    /**
     * Setter for <code>ZDB.T_VENDOR_HOUR.FROM_AT</code>. 「fromAt」
     */
    @Override
    public TVendorHourRecord setFromAt(LocalDateTime value) {
        set(8, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>ZDB.T_VENDOR_HOUR.TO_TYPE</code>. 「toType」
     */
    @Override
    public String getToType() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>ZDB.T_VENDOR_HOUR.TO_TYPE</code>. 「toType」
     */
    @Override
    public TVendorHourRecord setToType(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.T_VENDOR_HOUR.TO_AT</code>. 「toAt」
     */
    @Override
    public LocalDateTime getToAt() {
        return (LocalDateTime) get(10);
    }

    /**
     * Setter for <code>ZDB.T_VENDOR_HOUR.TO_AT</code>. 「toAt」
     */
    @Override
    public TVendorHourRecord setToAt(LocalDateTime value) {
        set(10, value);
        return this;
    }

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    @Override
    public Row11<String, String, String, LocalDateTime, LocalDateTime, Integer, String, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<String, String, String, LocalDateTime, LocalDateTime, Integer, String, String, LocalDateTime, String, LocalDateTime> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return TVendorHour.T_VENDOR_HOUR.KEY;
    }

    @Override
    public Field<String> field2() {
        return TVendorHour.T_VENDOR_HOUR.COMMENT_EXTENSION;
    }

    @Override
    public Field<String> field3() {
        return TVendorHour.T_VENDOR_HOUR.CLASSIFICATION;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return TVendorHour.T_VENDOR_HOUR.START_AT;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return TVendorHour.T_VENDOR_HOUR.END_AT;
    }

    @Override
    public Field<Integer> field6() {
        return TVendorHour.T_VENDOR_HOUR.DAYS;
    }

    @Override
    public Field<String> field7() {
        return TVendorHour.T_VENDOR_HOUR.REQUEST_TYPE;
    }

    @Override
    public Field<String> field8() {
        return TVendorHour.T_VENDOR_HOUR.FROM_TYPE;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return TVendorHour.T_VENDOR_HOUR.FROM_AT;
    }

    @Override
    public Field<String> field10() {
        return TVendorHour.T_VENDOR_HOUR.TO_TYPE;
    }

    @Override
    public Field<LocalDateTime> field11() {
        return TVendorHour.T_VENDOR_HOUR.TO_AT;
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
    public String component7() {
        return getRequestType();
    }

    @Override
    public String component8() {
        return getFromType();
    }

    @Override
    public LocalDateTime component9() {
        return getFromAt();
    }

    @Override
    public String component10() {
        return getToType();
    }

    @Override
    public LocalDateTime component11() {
        return getToAt();
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
    public String value7() {
        return getRequestType();
    }

    @Override
    public String value8() {
        return getFromType();
    }

    @Override
    public LocalDateTime value9() {
        return getFromAt();
    }

    @Override
    public String value10() {
        return getToType();
    }

    @Override
    public LocalDateTime value11() {
        return getToAt();
    }

    @Override
    public TVendorHourRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public TVendorHourRecord value2(String value) {
        setCommentExtension(value);
        return this;
    }

    @Override
    public TVendorHourRecord value3(String value) {
        setClassification(value);
        return this;
    }

    @Override
    public TVendorHourRecord value4(LocalDateTime value) {
        setStartAt(value);
        return this;
    }

    @Override
    public TVendorHourRecord value5(LocalDateTime value) {
        setEndAt(value);
        return this;
    }

    @Override
    public TVendorHourRecord value6(Integer value) {
        setDays(value);
        return this;
    }

    @Override
    public TVendorHourRecord value7(String value) {
        setRequestType(value);
        return this;
    }

    @Override
    public TVendorHourRecord value8(String value) {
        setFromType(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public TVendorHourRecord value9(LocalDateTime value) {
        setFromAt(value);
        return this;
    }

    @Override
    public TVendorHourRecord value10(String value) {
        setToType(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    @Override
    public TVendorHourRecord value11(LocalDateTime value) {
        setToAt(value);
        return this;
    }

    @Override
    public TVendorHourRecord values(String value1, String value2, String value3, LocalDateTime value4, LocalDateTime value5, Integer value6, String value7, String value8, LocalDateTime value9, String value10, LocalDateTime value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    @Override
    public void from(ITVendorHour from) {
        setKey(from.getKey());
        setCommentExtension(from.getCommentExtension());
        setClassification(from.getClassification());
        setStartAt(from.getStartAt());
        setEndAt(from.getEndAt());
        setDays(from.getDays());
        setRequestType(from.getRequestType());
        setFromType(from.getFromType());
        setFromAt(from.getFromAt());
        setToType(from.getToType());
        setToAt(from.getToAt());
        resetChangedOnNotNull();
    }

    @Override
    public <E extends ITVendorHour> E into(E into) {
        into.from(this);
        return into;
    }
}