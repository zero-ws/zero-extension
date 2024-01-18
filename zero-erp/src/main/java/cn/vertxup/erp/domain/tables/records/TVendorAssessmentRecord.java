/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.records;


import cn.vertxup.erp.domain.tables.TVendorAssessment;
import cn.vertxup.erp.domain.tables.interfaces.ITVendorAssessment;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
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
public class TVendorAssessmentRecord extends UpdatableRecordImpl<TVendorAssessmentRecord> implements VertxPojo, Record11<String, String, String, LocalDateTime, LocalDateTime, Integer, String, Integer, String, String, String>, ITVendorAssessment {

    private static final long serialVersionUID = 1L;

    /**
     * Create a detached TVendorAssessmentRecord
     */
    public TVendorAssessmentRecord() {
        super(TVendorAssessment.T_VENDOR_ASSESSMENT);
    }

    /**
     * Create a detached, initialised TVendorAssessmentRecord
     */
    public TVendorAssessmentRecord(String key, String commentExtension, String classification, LocalDateTime startAt, LocalDateTime endAt, Integer days, String assessOn, Integer assessScore, String commentDept, String commentAssess, String commentLeader) {
        super(TVendorAssessment.T_VENDOR_ASSESSMENT);

        setKey(key);
        setCommentExtension(commentExtension);
        setClassification(classification);
        setStartAt(startAt);
        setEndAt(endAt);
        setDays(days);
        setAssessOn(assessOn);
        setAssessScore(assessScore);
        setCommentDept(commentDept);
        setCommentAssess(commentAssess);
        setCommentLeader(commentLeader);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised TVendorAssessmentRecord
     */
    public TVendorAssessmentRecord(cn.vertxup.erp.domain.tables.pojos.TVendorAssessment value) {
        super(TVendorAssessment.T_VENDOR_ASSESSMENT);

        if (value != null) {
            setKey(value.getKey());
            setCommentExtension(value.getCommentExtension());
            setClassification(value.getClassification());
            setStartAt(value.getStartAt());
            setEndAt(value.getEndAt());
            setDays(value.getDays());
            setAssessOn(value.getAssessOn());
            setAssessScore(value.getAssessScore());
            setCommentDept(value.getCommentDept());
            setCommentAssess(value.getCommentAssess());
            setCommentLeader(value.getCommentLeader());
            resetChangedOnNotNull();
        }
    }

    public TVendorAssessmentRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    /**
     * Getter for <code>ZDB.T_VENDOR_ASSESSMENT.KEY</code>. 「key」- Ticket
     * Primary Key
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>ZDB.T_VENDOR_ASSESSMENT.KEY</code>. 「key」- Ticket
     * Primary Key
     */
    @Override
    public TVendorAssessmentRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.T_VENDOR_ASSESSMENT.COMMENT_EXTENSION</code>.
     * 「commentExtension」- Extension Comment
     */
    @Override
    public String getCommentExtension() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ZDB.T_VENDOR_ASSESSMENT.COMMENT_EXTENSION</code>.
     * 「commentExtension」- Extension Comment
     */
    @Override
    public TVendorAssessmentRecord setCommentExtension(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.T_VENDOR_ASSESSMENT.CLASSIFICATION</code>.
     * 「classification」- The ticket related income type
     */
    @Override
    public String getClassification() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ZDB.T_VENDOR_ASSESSMENT.CLASSIFICATION</code>.
     * 「classification」- The ticket related income type
     */
    @Override
    public TVendorAssessmentRecord setClassification(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.T_VENDOR_ASSESSMENT.START_AT</code>. 「startAt」- From
     */
    @Override
    public LocalDateTime getStartAt() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>ZDB.T_VENDOR_ASSESSMENT.START_AT</code>. 「startAt」- From
     */
    @Override
    public TVendorAssessmentRecord setStartAt(LocalDateTime value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.T_VENDOR_ASSESSMENT.END_AT</code>. 「endAt」- To
     */
    @Override
    public LocalDateTime getEndAt() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>ZDB.T_VENDOR_ASSESSMENT.END_AT</code>. 「endAt」- To
     */
    @Override
    public TVendorAssessmentRecord setEndAt(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.T_VENDOR_ASSESSMENT.DAYS</code>. 「days」- Duration
     */
    @Override
    public Integer getDays() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>ZDB.T_VENDOR_ASSESSMENT.DAYS</code>. 「days」- Duration
     */
    @Override
    public TVendorAssessmentRecord setDays(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.T_VENDOR_ASSESSMENT.ASSESS_ON</code>. 「assessOn」-
     * The user that will be assessed
     */
    @Override
    public String getAssessOn() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ZDB.T_VENDOR_ASSESSMENT.ASSESS_ON</code>. 「assessOn」-
     * The user that will be assessed
     */
    @Override
    public TVendorAssessmentRecord setAssessOn(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.T_VENDOR_ASSESSMENT.ASSESS_SCORE</code>.
     * 「assessScore」- The score of the user
     */
    @Override
    public Integer getAssessScore() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>ZDB.T_VENDOR_ASSESSMENT.ASSESS_SCORE</code>.
     * 「assessScore」- The score of the user
     */
    @Override
    public TVendorAssessmentRecord setAssessScore(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.T_VENDOR_ASSESSMENT.COMMENT_DEPT</code>.
     * 「commentDept」- from department
     */
    @Override
    public String getCommentDept() {
        return (String) get(8);
    }

    /**
     * Setter for <code>ZDB.T_VENDOR_ASSESSMENT.COMMENT_DEPT</code>.
     * 「commentDept」- from department
     */
    @Override
    public TVendorAssessmentRecord setCommentDept(String value) {
        set(8, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>ZDB.T_VENDOR_ASSESSMENT.COMMENT_ASSESS</code>.
     * 「commentAssess」- from assess
     */
    @Override
    public String getCommentAssess() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>ZDB.T_VENDOR_ASSESSMENT.COMMENT_ASSESS</code>.
     * 「commentAssess」- from assess
     */
    @Override
    public TVendorAssessmentRecord setCommentAssess(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.T_VENDOR_ASSESSMENT.COMMENT_LEADER</code>.
     * 「commentLeader」- from leader of project
     */
    @Override
    public String getCommentLeader() {
        return (String) get(10);
    }

    /**
     * Setter for <code>ZDB.T_VENDOR_ASSESSMENT.COMMENT_LEADER</code>.
     * 「commentLeader」- from leader of project
     */
    @Override
    public TVendorAssessmentRecord setCommentLeader(String value) {
        set(10, value);
        return this;
    }

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    @Override
    public Row11<String, String, String, LocalDateTime, LocalDateTime, Integer, String, Integer, String, String, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<String, String, String, LocalDateTime, LocalDateTime, Integer, String, Integer, String, String, String> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return TVendorAssessment.T_VENDOR_ASSESSMENT.KEY;
    }

    @Override
    public Field<String> field2() {
        return TVendorAssessment.T_VENDOR_ASSESSMENT.COMMENT_EXTENSION;
    }

    @Override
    public Field<String> field3() {
        return TVendorAssessment.T_VENDOR_ASSESSMENT.CLASSIFICATION;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return TVendorAssessment.T_VENDOR_ASSESSMENT.START_AT;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return TVendorAssessment.T_VENDOR_ASSESSMENT.END_AT;
    }

    @Override
    public Field<Integer> field6() {
        return TVendorAssessment.T_VENDOR_ASSESSMENT.DAYS;
    }

    @Override
    public Field<String> field7() {
        return TVendorAssessment.T_VENDOR_ASSESSMENT.ASSESS_ON;
    }

    @Override
    public Field<Integer> field8() {
        return TVendorAssessment.T_VENDOR_ASSESSMENT.ASSESS_SCORE;
    }

    @Override
    public Field<String> field9() {
        return TVendorAssessment.T_VENDOR_ASSESSMENT.COMMENT_DEPT;
    }

    @Override
    public Field<String> field10() {
        return TVendorAssessment.T_VENDOR_ASSESSMENT.COMMENT_ASSESS;
    }

    @Override
    public Field<String> field11() {
        return TVendorAssessment.T_VENDOR_ASSESSMENT.COMMENT_LEADER;
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
        return getAssessOn();
    }

    @Override
    public Integer component8() {
        return getAssessScore();
    }

    @Override
    public String component9() {
        return getCommentDept();
    }

    @Override
    public String component10() {
        return getCommentAssess();
    }

    @Override
    public String component11() {
        return getCommentLeader();
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
        return getAssessOn();
    }

    @Override
    public Integer value8() {
        return getAssessScore();
    }

    @Override
    public String value9() {
        return getCommentDept();
    }

    @Override
    public String value10() {
        return getCommentAssess();
    }

    @Override
    public String value11() {
        return getCommentLeader();
    }

    @Override
    public TVendorAssessmentRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public TVendorAssessmentRecord value2(String value) {
        setCommentExtension(value);
        return this;
    }

    @Override
    public TVendorAssessmentRecord value3(String value) {
        setClassification(value);
        return this;
    }

    @Override
    public TVendorAssessmentRecord value4(LocalDateTime value) {
        setStartAt(value);
        return this;
    }

    @Override
    public TVendorAssessmentRecord value5(LocalDateTime value) {
        setEndAt(value);
        return this;
    }

    @Override
    public TVendorAssessmentRecord value6(Integer value) {
        setDays(value);
        return this;
    }

    @Override
    public TVendorAssessmentRecord value7(String value) {
        setAssessOn(value);
        return this;
    }

    @Override
    public TVendorAssessmentRecord value8(Integer value) {
        setAssessScore(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public TVendorAssessmentRecord value9(String value) {
        setCommentDept(value);
        return this;
    }

    @Override
    public TVendorAssessmentRecord value10(String value) {
        setCommentAssess(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    @Override
    public TVendorAssessmentRecord value11(String value) {
        setCommentLeader(value);
        return this;
    }

    @Override
    public TVendorAssessmentRecord values(String value1, String value2, String value3, LocalDateTime value4, LocalDateTime value5, Integer value6, String value7, Integer value8, String value9, String value10, String value11) {
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
    public void from(ITVendorAssessment from) {
        setKey(from.getKey());
        setCommentExtension(from.getCommentExtension());
        setClassification(from.getClassification());
        setStartAt(from.getStartAt());
        setEndAt(from.getEndAt());
        setDays(from.getDays());
        setAssessOn(from.getAssessOn());
        setAssessScore(from.getAssessScore());
        setCommentDept(from.getCommentDept());
        setCommentAssess(from.getCommentAssess());
        setCommentLeader(from.getCommentLeader());
        resetChangedOnNotNull();
    }

    @Override
    public <E extends ITVendorAssessment> E into(E into) {
        into.from(this);
        return into;
    }
}
