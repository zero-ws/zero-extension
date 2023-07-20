/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.fm.domain.tables;


import cn.vertxup.fm.domain.Keys;
import cn.vertxup.fm.domain.Zdb;
import cn.vertxup.fm.domain.tables.records.FPayTermRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function19;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row19;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FPayTerm extends TableImpl<FPayTermRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ZDB.F_PAY_TERM</code>
     */
    public static final FPayTerm F_PAY_TERM = new FPayTerm();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FPayTermRecord> getRecordType() {
        return FPayTermRecord.class;
    }

    /**
     * The column <code>ZDB.F_PAY_TERM.KEY</code>. 「key」- 账单项
     */
    public final TableField<FPayTermRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 账单项");

    /**
     * The column <code>ZDB.F_PAY_TERM.NAME</code>. 「name」- 账单项名称
     */
    public final TableField<FPayTermRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(32).nullable(false), this, "「name」- 账单项名称");

    /**
     * The column <code>ZDB.F_PAY_TERM.CODE</code>. 「code」- 账单项编号
     */
    public final TableField<FPayTermRecord, String> CODE = createField(DSL.name("CODE"), SQLDataType.VARCHAR(255).nullable(false), this, "「code」- 账单项编号");

    /**
     * The column <code>ZDB.F_PAY_TERM.TYPE</code>. 「type」- 账单项类型：付款类/消费类
     */
    public final TableField<FPayTermRecord, String> TYPE = createField(DSL.name("TYPE"), SQLDataType.VARCHAR(36).nullable(false), this, "「type」- 账单项类型：付款类/消费类");

    /**
     * The column <code>ZDB.F_PAY_TERM.CATEGORY</code>. 「category」- 账单项类别
     */
    public final TableField<FPayTermRecord, String> CATEGORY = createField(DSL.name("CATEGORY"), SQLDataType.VARCHAR(36).nullable(false), this, "「category」- 账单项类别");

    /**
     * The column <code>ZDB.F_PAY_TERM.HELP_CODE</code>. 「helpCode」- 助记码
     */
    public final TableField<FPayTermRecord, String> HELP_CODE = createField(DSL.name("HELP_CODE"), SQLDataType.VARCHAR(32), this, "「helpCode」- 助记码");

    /**
     * The column <code>ZDB.F_PAY_TERM.LEAF</code>. 「leaf」- 是否明细
     */
    public final TableField<FPayTermRecord, Boolean> LEAF = createField(DSL.name("LEAF"), SQLDataType.BIT, this, "「leaf」- 是否明细");

    /**
     * The column <code>ZDB.F_PAY_TERM.COMMENT</code>. 「comment」 - 账单项备注
     */
    public final TableField<FPayTermRecord, String> COMMENT = createField(DSL.name("COMMENT"), SQLDataType.CLOB, this, "「comment」 - 账单项备注");

    /**
     * The column <code>ZDB.F_PAY_TERM.PARENT_ID</code>. 「parentId」- 父账单项
     */
    public final TableField<FPayTermRecord, String> PARENT_ID = createField(DSL.name("PARENT_ID"), SQLDataType.VARCHAR(36), this, "「parentId」- 父账单项");

    /**
     * The column <code>ZDB.F_PAY_TERM.SUBJECT_ID</code>. 「subjectId」- 会计科目关联ID
     */
    public final TableField<FPayTermRecord, String> SUBJECT_ID = createField(DSL.name("SUBJECT_ID"), SQLDataType.VARCHAR(36), this, "「subjectId」- 会计科目关联ID");

    /**
     * The column <code>ZDB.F_PAY_TERM.LOCKED</code>. 「locked」- 是否锁定
     */
    public final TableField<FPayTermRecord, Boolean> LOCKED = createField(DSL.name("LOCKED"), SQLDataType.BIT, this, "「locked」- 是否锁定");

    /**
     * The column <code>ZDB.F_PAY_TERM.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<FPayTermRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");

    /**
     * The column <code>ZDB.F_PAY_TERM.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<FPayTermRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");

    /**
     * The column <code>ZDB.F_PAY_TERM.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<FPayTermRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");

    /**
     * The column <code>ZDB.F_PAY_TERM.METADATA</code>. 「metadata」- 附加配置数据
     */
    public final TableField<FPayTermRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置数据");

    /**
     * The column <code>ZDB.F_PAY_TERM.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<FPayTermRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");

    /**
     * The column <code>ZDB.F_PAY_TERM.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<FPayTermRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");

    /**
     * The column <code>ZDB.F_PAY_TERM.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<FPayTermRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");

    /**
     * The column <code>ZDB.F_PAY_TERM.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<FPayTermRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private FPayTerm(Name alias, Table<FPayTermRecord> aliased) {
        this(alias, aliased, null);
    }

    private FPayTerm(Name alias, Table<FPayTermRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.F_PAY_TERM</code> table reference
     */
    public FPayTerm(String alias) {
        this(DSL.name(alias), F_PAY_TERM);
    }

    /**
     * Create an aliased <code>ZDB.F_PAY_TERM</code> table reference
     */
    public FPayTerm(Name alias) {
        this(alias, F_PAY_TERM);
    }

    /**
     * Create a <code>ZDB.F_PAY_TERM</code> table reference
     */
    public FPayTerm() {
        this(DSL.name("F_PAY_TERM"), null);
    }

    public <O extends Record> FPayTerm(Table<O> child, ForeignKey<O, FPayTermRecord> key) {
        super(child, key, F_PAY_TERM);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public UniqueKey<FPayTermRecord> getPrimaryKey() {
        return Keys.KEY_F_PAY_TERM_PRIMARY;
    }

    @Override
    public List<UniqueKey<FPayTermRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_F_PAY_TERM_NAME, Keys.KEY_F_PAY_TERM_CODE);
    }

    @Override
    public FPayTerm as(String alias) {
        return new FPayTerm(DSL.name(alias), this);
    }

    @Override
    public FPayTerm as(Name alias) {
        return new FPayTerm(alias, this);
    }

    @Override
    public FPayTerm as(Table<?> alias) {
        return new FPayTerm(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public FPayTerm rename(String name) {
        return new FPayTerm(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FPayTerm rename(Name name) {
        return new FPayTerm(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public FPayTerm rename(Table<?> name) {
        return new FPayTerm(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row19 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row19<String, String, String, String, String, String, Boolean, String, String, String, Boolean, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function19<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super String, ? super Boolean, ? super String, ? super LocalDateTime, ? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function19<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super String, ? super Boolean, ? super String, ? super LocalDateTime, ? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
