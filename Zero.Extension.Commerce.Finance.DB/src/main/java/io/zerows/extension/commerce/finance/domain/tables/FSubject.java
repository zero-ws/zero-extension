/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.finance.domain.tables;


import io.zerows.extension.commerce.finance.domain.Keys;
import io.zerows.extension.commerce.finance.domain.Zdb;
import io.zerows.extension.commerce.finance.domain.tables.records.FSubjectRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function18;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row18;
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
public class FSubject extends TableImpl<FSubjectRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ZDB.F_SUBJECT</code>
     */
    public static final FSubject F_SUBJECT = new FSubject();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FSubjectRecord> getRecordType() {
        return FSubjectRecord.class;
    }

    /**
     * The column <code>ZDB.F_SUBJECT.KEY</code>. 「key」- 会计科目ID
     */
    public final TableField<FSubjectRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 会计科目ID");

    /**
     * The column <code>ZDB.F_SUBJECT.NAME</code>. 「name」 -  会计科目名称
     */
    public final TableField<FSubjectRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(255).nullable(false), this, "「name」 -  会计科目名称");

    /**
     * The column <code>ZDB.F_SUBJECT.CODE</code>. 「code」 - 会计科目系统编号
     */
    public final TableField<FSubjectRecord, String> CODE = createField(DSL.name("CODE"), SQLDataType.VARCHAR(255), this, "「code」 - 会计科目系统编号");

    /**
     * The column <code>ZDB.F_SUBJECT.SERIAL</code>. 「serial」 - 会计科目编号
     */
    public final TableField<FSubjectRecord, String> SERIAL = createField(DSL.name("SERIAL"), SQLDataType.VARCHAR(128), this, "「serial」 - 会计科目编号");

    /**
     * The column <code>ZDB.F_SUBJECT.CATEGORY</code>. 「category」 -
     * 会计科目关联类别，直接对接类型树
     */
    public final TableField<FSubjectRecord, String> CATEGORY = createField(DSL.name("CATEGORY"), SQLDataType.VARCHAR(36), this, "「category」 - 会计科目关联类别，直接对接类型树");

    /**
     * The column <code>ZDB.F_SUBJECT.HELP_CODE</code>. 「helpCode」- 会计科目助记码
     */
    public final TableField<FSubjectRecord, String> HELP_CODE = createField(DSL.name("HELP_CODE"), SQLDataType.VARCHAR(32), this, "「helpCode」- 会计科目助记码");

    /**
     * The column <code>ZDB.F_SUBJECT.COMMENT</code>. 「comment」 - 会计科目备注
     */
    public final TableField<FSubjectRecord, String> COMMENT = createField(DSL.name("COMMENT"), SQLDataType.CLOB, this, "「comment」 - 会计科目备注");

    /**
     * The column <code>ZDB.F_SUBJECT.OWNER</code>. 「owner」- 科目方向：OUT-借方 / IN-贷方
     */
    public final TableField<FSubjectRecord, String> OWNER = createField(DSL.name("OWNER"), SQLDataType.VARCHAR(32), this, "「owner」- 科目方向：OUT-借方 / IN-贷方");

    /**
     * The column <code>ZDB.F_SUBJECT.COMPANY_ID</code>. 「companyId」- 会计科目所属公司
     */
    public final TableField<FSubjectRecord, String> COMPANY_ID = createField(DSL.name("COMPANY_ID"), SQLDataType.VARCHAR(36), this, "「companyId」- 会计科目所属公司");

    /**
     * The column <code>ZDB.F_SUBJECT.PARENT_ID</code>. 「parentId」- 会计科目父科目
     */
    public final TableField<FSubjectRecord, String> PARENT_ID = createField(DSL.name("PARENT_ID"), SQLDataType.VARCHAR(36), this, "「parentId」- 会计科目父科目");

    /**
     * The column <code>ZDB.F_SUBJECT.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<FSubjectRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");

    /**
     * The column <code>ZDB.F_SUBJECT.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<FSubjectRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");

    /**
     * The column <code>ZDB.F_SUBJECT.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<FSubjectRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");

    /**
     * The column <code>ZDB.F_SUBJECT.METADATA</code>. 「metadata」- 附加配置数据
     */
    public final TableField<FSubjectRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置数据");

    /**
     * The column <code>ZDB.F_SUBJECT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<FSubjectRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");

    /**
     * The column <code>ZDB.F_SUBJECT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<FSubjectRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");

    /**
     * The column <code>ZDB.F_SUBJECT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<FSubjectRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");

    /**
     * The column <code>ZDB.F_SUBJECT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<FSubjectRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private FSubject(Name alias, Table<FSubjectRecord> aliased) {
        this(alias, aliased, null);
    }

    private FSubject(Name alias, Table<FSubjectRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.F_SUBJECT</code> table reference
     */
    public FSubject(String alias) {
        this(DSL.name(alias), F_SUBJECT);
    }

    /**
     * Create an aliased <code>ZDB.F_SUBJECT</code> table reference
     */
    public FSubject(Name alias) {
        this(alias, F_SUBJECT);
    }

    /**
     * Create a <code>ZDB.F_SUBJECT</code> table reference
     */
    public FSubject() {
        this(DSL.name("F_SUBJECT"), null);
    }

    public <O extends Record> FSubject(Table<O> child, ForeignKey<O, FSubjectRecord> key) {
        super(child, key, F_SUBJECT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public UniqueKey<FSubjectRecord> getPrimaryKey() {
        return Keys.KEY_F_SUBJECT_PRIMARY;
    }

    @Override
    public List<UniqueKey<FSubjectRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_F_SUBJECT_CODE);
    }

    @Override
    public FSubject as(String alias) {
        return new FSubject(DSL.name(alias), this);
    }

    @Override
    public FSubject as(Name alias) {
        return new FSubject(alias, this);
    }

    @Override
    public FSubject as(Table<?> alias) {
        return new FSubject(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public FSubject rename(String name) {
        return new FSubject(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FSubject rename(Name name) {
        return new FSubject(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public FSubject rename(Table<?> name) {
        return new FSubject(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row18 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row18<String, String, String, String, String, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function18<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super LocalDateTime, ? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function18<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super LocalDateTime, ? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
