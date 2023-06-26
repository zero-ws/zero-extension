/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.records;


import cn.vertxup.erp.domain.tables.TVendorCheckIn;
import cn.vertxup.erp.domain.tables.interfaces.ITVendorCheckIn;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TVendorCheckInRecord extends UpdatableRecordImpl<TVendorCheckInRecord> implements VertxPojo, Record7<String, String, String, LocalDateTime, LocalDateTime, Integer, LocalDateTime>, ITVendorCheckIn {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>DB_ETERNAL.T_VENDOR_CHECK_IN.KEY</code>. 「key」- Ticket
     * Primary Key
     */
    @Override
    public TVendorCheckInRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_VENDOR_CHECK_IN.KEY</code>. 「key」- Ticket
     * Primary Key
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.T_VENDOR_CHECK_IN.COMMENT_EXTENSION</code>.
     * 「commentExtension」- Extension Comment
     */
    @Override
    public TVendorCheckInRecord setCommentExtension(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_VENDOR_CHECK_IN.COMMENT_EXTENSION</code>.
     * 「commentExtension」- Extension Comment
     */
    @Override
    public String getCommentExtension() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.T_VENDOR_CHECK_IN.CLASSIFICATION</code>.
     * 「classification」- The ticket related business type
     */
    @Override
    public TVendorCheckInRecord setClassification(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_VENDOR_CHECK_IN.CLASSIFICATION</code>.
     * 「classification」- The ticket related business type
     */
    @Override
    public String getClassification() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.T_VENDOR_CHECK_IN.START_AT</code>. 「startAt」-
     * From
     */
    @Override
    public TVendorCheckInRecord setStartAt(LocalDateTime value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_VENDOR_CHECK_IN.START_AT</code>. 「startAt」-
     * From
     */
    @Override
    public LocalDateTime getStartAt() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.T_VENDOR_CHECK_IN.END_AT</code>. 「endAt」- To
     */
    @Override
    public TVendorCheckInRecord setEndAt(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_VENDOR_CHECK_IN.END_AT</code>. 「endAt」- To
     */
    @Override
    public LocalDateTime getEndAt() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.T_VENDOR_CHECK_IN.DAYS</code>. 「days」-
     * Duration
     */
    @Override
    public TVendorCheckInRecord setDays(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_VENDOR_CHECK_IN.DAYS</code>. 「days」-
     * Duration
     */
    @Override
    public Integer getDays() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.T_VENDOR_CHECK_IN.ONBOARD_AT</code>.
     * 「onboardAt」- To
     */
    @Override
    public TVendorCheckInRecord setOnboardAt(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_VENDOR_CHECK_IN.ONBOARD_AT</code>.
     * 「onboardAt」- To
     */
    @Override
    public LocalDateTime getOnboardAt() {
        return (LocalDateTime) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, LocalDateTime, LocalDateTime, Integer, LocalDateTime> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<String, String, String, LocalDateTime, LocalDateTime, Integer, LocalDateTime> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return TVendorCheckIn.T_VENDOR_CHECK_IN.KEY;
    }

    @Override
    public Field<String> field2() {
        return TVendorCheckIn.T_VENDOR_CHECK_IN.COMMENT_EXTENSION;
    }

    @Override
    public Field<String> field3() {
        return TVendorCheckIn.T_VENDOR_CHECK_IN.CLASSIFICATION;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return TVendorCheckIn.T_VENDOR_CHECK_IN.START_AT;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return TVendorCheckIn.T_VENDOR_CHECK_IN.END_AT;
    }

    @Override
    public Field<Integer> field6() {
        return TVendorCheckIn.T_VENDOR_CHECK_IN.DAYS;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return TVendorCheckIn.T_VENDOR_CHECK_IN.ONBOARD_AT;
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
        return getOnboardAt();
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
        return getOnboardAt();
    }

    @Override
    public TVendorCheckInRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public TVendorCheckInRecord value2(String value) {
        setCommentExtension(value);
        return this;
    }

    @Override
    public TVendorCheckInRecord value3(String value) {
        setClassification(value);
        return this;
    }

    @Override
    public TVendorCheckInRecord value4(LocalDateTime value) {
        setStartAt(value);
        return this;
    }

    @Override
    public TVendorCheckInRecord value5(LocalDateTime value) {
        setEndAt(value);
        return this;
    }

    @Override
    public TVendorCheckInRecord value6(Integer value) {
        setDays(value);
        return this;
    }

    @Override
    public TVendorCheckInRecord value7(LocalDateTime value) {
        setOnboardAt(value);
        return this;
    }

    @Override
    public TVendorCheckInRecord values(String value1, String value2, String value3, LocalDateTime value4, LocalDateTime value5, Integer value6, LocalDateTime value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(ITVendorCheckIn from) {
        setKey(from.getKey());
        setCommentExtension(from.getCommentExtension());
        setClassification(from.getClassification());
        setStartAt(from.getStartAt());
        setEndAt(from.getEndAt());
        setDays(from.getDays());
        setOnboardAt(from.getOnboardAt());
        resetChangedOnNotNull();
    }

    @Override
    public <E extends ITVendorCheckIn> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TVendorCheckInRecord
     */
    public TVendorCheckInRecord() {
        super(TVendorCheckIn.T_VENDOR_CHECK_IN);
    }

    /**
     * Create a detached, initialised TVendorCheckInRecord
     */
    public TVendorCheckInRecord(String key, String commentExtension, String classification, LocalDateTime startAt, LocalDateTime endAt, Integer days, LocalDateTime onboardAt) {
        super(TVendorCheckIn.T_VENDOR_CHECK_IN);

        setKey(key);
        setCommentExtension(commentExtension);
        setClassification(classification);
        setStartAt(startAt);
        setEndAt(endAt);
        setDays(days);
        setOnboardAt(onboardAt);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised TVendorCheckInRecord
     */
    public TVendorCheckInRecord(cn.vertxup.erp.domain.tables.pojos.TVendorCheckIn value) {
        super(TVendorCheckIn.T_VENDOR_CHECK_IN);

        if (value != null) {
            setKey(value.getKey());
            setCommentExtension(value.getCommentExtension());
            setClassification(value.getClassification());
            setStartAt(value.getStartAt());
            setEndAt(value.getEndAt());
            setDays(value.getDays());
            setOnboardAt(value.getOnboardAt());
            resetChangedOnNotNull();
        }
    }

        public TVendorCheckInRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
