/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables;


import cn.vertxup.erp.domain.Keys;
import cn.vertxup.erp.domain.Zdb;
import cn.vertxup.erp.domain.tables.records.TVendorAssessmentRecord;
import org.jooq.Record;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import java.time.LocalDateTime;
import java.util.function.Function;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class TVendorAssessment extends TableImpl<TVendorAssessmentRecord> {

    /**
     * The reference instance of <code>ZDB.T_VENDOR_ASSESSMENT</code>
     */
    public static final TVendorAssessment T_VENDOR_ASSESSMENT = new TVendorAssessment();
    private static final long serialVersionUID = 1L;
    /**
     * The column <code>ZDB.T_VENDOR_ASSESSMENT.KEY</code>. 「key」- Ticket
     * Primary Key
     */
    public final TableField<TVendorAssessmentRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- Ticket Primary Key");
    /**
     * The column <code>ZDB.T_VENDOR_ASSESSMENT.COMMENT_EXTENSION</code>.
     * 「commentExtension」- Extension Comment
     */
    public final TableField<TVendorAssessmentRecord, String> COMMENT_EXTENSION = createField(DSL.name("COMMENT_EXTENSION"), SQLDataType.CLOB, this, "「commentExtension」- Extension Comment");
    /**
     * The column <code>ZDB.T_VENDOR_ASSESSMENT.CLASSIFICATION</code>.
     * 「classification」- The ticket related income type
     */
    public final TableField<TVendorAssessmentRecord, String> CLASSIFICATION = createField(DSL.name("CLASSIFICATION"), SQLDataType.VARCHAR(64), this, "「classification」- The ticket related income type");
    /**
     * The column <code>ZDB.T_VENDOR_ASSESSMENT.START_AT</code>. 「startAt」- From
     */
    public final TableField<TVendorAssessmentRecord, LocalDateTime> START_AT = createField(DSL.name("START_AT"), SQLDataType.LOCALDATETIME(0), this, "「startAt」- From");
    /**
     * The column <code>ZDB.T_VENDOR_ASSESSMENT.END_AT</code>. 「endAt」- To
     */
    public final TableField<TVendorAssessmentRecord, LocalDateTime> END_AT = createField(DSL.name("END_AT"), SQLDataType.LOCALDATETIME(0), this, "「endAt」- To");
    /**
     * The column <code>ZDB.T_VENDOR_ASSESSMENT.DAYS</code>. 「days」- Duration
     */
    public final TableField<TVendorAssessmentRecord, Integer> DAYS = createField(DSL.name("DAYS"), SQLDataType.INTEGER, this, "「days」- Duration");
    /**
     * The column <code>ZDB.T_VENDOR_ASSESSMENT.ASSESS_ON</code>. 「assessOn」-
     * The user that will be assessed
     */
    public final TableField<TVendorAssessmentRecord, String> ASSESS_ON = createField(DSL.name("ASSESS_ON"), SQLDataType.VARCHAR(36), this, "「assessOn」- The user that will be assessed");
    /**
     * The column <code>ZDB.T_VENDOR_ASSESSMENT.ASSESS_SCORE</code>.
     * 「assessScore」- The score of the user
     */
    public final TableField<TVendorAssessmentRecord, Integer> ASSESS_SCORE = createField(DSL.name("ASSESS_SCORE"), SQLDataType.INTEGER, this, "「assessScore」- The score of the user");
    /**
     * The column <code>ZDB.T_VENDOR_ASSESSMENT.COMMENT_DEPT</code>.
     * 「commentDept」- from department
     */
    public final TableField<TVendorAssessmentRecord, String> COMMENT_DEPT = createField(DSL.name("COMMENT_DEPT"), SQLDataType.CLOB, this, "「commentDept」- from department");
    /**
     * The column <code>ZDB.T_VENDOR_ASSESSMENT.COMMENT_ASSESS</code>.
     * 「commentAssess」- from assess
     */
    public final TableField<TVendorAssessmentRecord, String> COMMENT_ASSESS = createField(DSL.name("COMMENT_ASSESS"), SQLDataType.CLOB, this, "「commentAssess」- from assess");
    /**
     * The column <code>ZDB.T_VENDOR_ASSESSMENT.COMMENT_LEADER</code>.
     * 「commentLeader」- from leader of project
     */
    public final TableField<TVendorAssessmentRecord, String> COMMENT_LEADER = createField(DSL.name("COMMENT_LEADER"), SQLDataType.CLOB, this, "「commentLeader」- from leader of project");

    private TVendorAssessment(Name alias, Table<TVendorAssessmentRecord> aliased) {
        this(alias, aliased, null);
    }

    private TVendorAssessment(Name alias, Table<TVendorAssessmentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.T_VENDOR_ASSESSMENT</code> table reference
     */
    public TVendorAssessment(String alias) {
        this(DSL.name(alias), T_VENDOR_ASSESSMENT);
    }

    /**
     * Create an aliased <code>ZDB.T_VENDOR_ASSESSMENT</code> table reference
     */
    public TVendorAssessment(Name alias) {
        this(alias, T_VENDOR_ASSESSMENT);
    }

    /**
     * Create a <code>ZDB.T_VENDOR_ASSESSMENT</code> table reference
     */
    public TVendorAssessment() {
        this(DSL.name("T_VENDOR_ASSESSMENT"), null);
    }

    public <O extends Record> TVendorAssessment(Table<O> child, ForeignKey<O, TVendorAssessmentRecord> key) {
        super(child, key, T_VENDOR_ASSESSMENT);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TVendorAssessmentRecord> getRecordType() {
        return TVendorAssessmentRecord.class;
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public UniqueKey<TVendorAssessmentRecord> getPrimaryKey() {
        return Keys.KEY_T_VENDOR_ASSESSMENT_PRIMARY;
    }

    @Override
    public TVendorAssessment as(String alias) {
        return new TVendorAssessment(DSL.name(alias), this);
    }

    @Override
    public TVendorAssessment as(Name alias) {
        return new TVendorAssessment(alias, this);
    }

    @Override
    public TVendorAssessment as(Table<?> alias) {
        return new TVendorAssessment(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public TVendorAssessment rename(String name) {
        return new TVendorAssessment(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TVendorAssessment rename(Name name) {
        return new TVendorAssessment(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public TVendorAssessment rename(Table<?> name) {
        return new TVendorAssessment(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<String, String, String, LocalDateTime, LocalDateTime, Integer, String, Integer, String, String, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function11<? super String, ? super String, ? super String, ? super LocalDateTime, ? super LocalDateTime, ? super Integer, ? super String, ? super Integer, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function11<? super String, ? super String, ? super String, ? super LocalDateTime, ? super LocalDateTime, ? super Integer, ? super String, ? super Integer, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
