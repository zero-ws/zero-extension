/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.documentation.domain.tables;


import io.zerows.extension.commerce.documentation.domain.Keys;
import io.zerows.extension.commerce.documentation.domain.Zdb;
import io.zerows.extension.commerce.documentation.domain.tables.records.DPaperRefRecord;
import org.jooq.Record;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import java.util.function.Function;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class DPaperRef extends TableImpl<DPaperRefRecord> {

    /**
     * The reference instance of <code>ZDB.D_PAPER_REF</code>
     */
    public static final DPaperRef D_PAPER_REF = new DPaperRef();
    private static final long serialVersionUID = 1L;
    /**
     * The column <code>ZDB.D_PAPER_REF.PAPER_ID</code>. 「paperId」- 考卷ID
     */
    public final TableField<DPaperRefRecord, String> PAPER_ID = createField(DSL.name("PAPER_ID"), SQLDataType.VARCHAR(36).nullable(false), this, "「paperId」- 考卷ID");
    /**
     * The column <code>ZDB.D_PAPER_REF.QUESTION_ID</code>. 「questionId」- 问题ID
     */
    public final TableField<DPaperRefRecord, String> QUESTION_ID = createField(DSL.name("QUESTION_ID"), SQLDataType.VARCHAR(36).nullable(false), this, "「questionId」- 问题ID");
    /**
     * The column <code>ZDB.D_PAPER_REF.SORT</code>. 「sort」- 问题排序
     */
    public final TableField<DPaperRefRecord, Integer> SORT = createField(DSL.name("SORT"), SQLDataType.INTEGER, this, "「sort」- 问题排序");
    /**
     * The column <code>ZDB.D_PAPER_REF.REQUIRED</code>. 「required」- 必答题
     */
    public final TableField<DPaperRefRecord, Boolean> REQUIRED = createField(DSL.name("REQUIRED"), SQLDataType.BIT, this, "「required」- 必答题");
    /**
     * The column <code>ZDB.D_PAPER_REF.RULE_COMPONENT</code>. 「ruleComponent」-
     * 关联执行组件（扩展用）
     */
    public final TableField<DPaperRefRecord, String> RULE_COMPONENT = createField(DSL.name("RULE_COMPONENT"), SQLDataType.VARCHAR(255), this, "「ruleComponent」- 关联执行组件（扩展用）");

    private DPaperRef(Name alias, Table<DPaperRefRecord> aliased) {
        this(alias, aliased, null);
    }

    private DPaperRef(Name alias, Table<DPaperRefRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.D_PAPER_REF</code> table reference
     */
    public DPaperRef(String alias) {
        this(DSL.name(alias), D_PAPER_REF);
    }

    /**
     * Create an aliased <code>ZDB.D_PAPER_REF</code> table reference
     */
    public DPaperRef(Name alias) {
        this(alias, D_PAPER_REF);
    }

    /**
     * Create a <code>ZDB.D_PAPER_REF</code> table reference
     */
    public DPaperRef() {
        this(DSL.name("D_PAPER_REF"), null);
    }

    public <O extends Record> DPaperRef(Table<O> child, ForeignKey<O, DPaperRefRecord> key) {
        super(child, key, D_PAPER_REF);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DPaperRefRecord> getRecordType() {
        return DPaperRefRecord.class;
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public UniqueKey<DPaperRefRecord> getPrimaryKey() {
        return Keys.KEY_D_PAPER_REF_PRIMARY;
    }

    @Override
    public DPaperRef as(String alias) {
        return new DPaperRef(DSL.name(alias), this);
    }

    @Override
    public DPaperRef as(Name alias) {
        return new DPaperRef(alias, this);
    }

    @Override
    public DPaperRef as(Table<?> alias) {
        return new DPaperRef(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public DPaperRef rename(String name) {
        return new DPaperRef(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DPaperRef rename(Name name) {
        return new DPaperRef(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public DPaperRef rename(Table<?> name) {
        return new DPaperRef(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, Integer, Boolean, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function5<? super String, ? super String, ? super Integer, ? super Boolean, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function5<? super String, ? super String, ? super Integer, ? super Boolean, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
