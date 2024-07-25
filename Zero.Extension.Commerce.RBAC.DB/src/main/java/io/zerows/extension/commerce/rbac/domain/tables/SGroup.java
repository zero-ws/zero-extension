/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.rbac.domain.tables;


import io.zerows.extension.commerce.rbac.domain.Keys;
import io.zerows.extension.commerce.rbac.domain.Zdb;
import io.zerows.extension.commerce.rbac.domain.tables.records.SGroupRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function15;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row15;
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
public class SGroup extends TableImpl<SGroupRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ZDB.S_GROUP</code>
     */
    public static final SGroup S_GROUP = new SGroup();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SGroupRecord> getRecordType() {
        return SGroupRecord.class;
    }

    /**
     * The column <code>ZDB.S_GROUP.KEY</code>. 「key」- 组ID
     */
    public final TableField<SGroupRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 组ID");

    /**
     * The column <code>ZDB.S_GROUP.NAME</code>. 「name」- 组名称
     */
    public final TableField<SGroupRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(255), this, "「name」- 组名称");

    /**
     * The column <code>ZDB.S_GROUP.CODE</code>. 「code」- 组系统码
     */
    public final TableField<SGroupRecord, String> CODE = createField(DSL.name("CODE"), SQLDataType.VARCHAR(255), this, "「code」- 组系统码");

    /**
     * The column <code>ZDB.S_GROUP.PARENT_ID</code>. 「parentId」-
     * 父组ID（组支持树形结构，角色平行结构）
     */
    public final TableField<SGroupRecord, String> PARENT_ID = createField(DSL.name("PARENT_ID"), SQLDataType.VARCHAR(36), this, "「parentId」- 父组ID（组支持树形结构，角色平行结构）");

    /**
     * The column <code>ZDB.S_GROUP.MODEL_ID</code>. 「modelId」-
     * 组所关联的模型identifier，用于描述
     */
    public final TableField<SGroupRecord, String> MODEL_ID = createField(DSL.name("MODEL_ID"), SQLDataType.VARCHAR(255), this, "「modelId」- 组所关联的模型identifier，用于描述");

    /**
     * The column <code>ZDB.S_GROUP.MODEL_KEY</code>. 「modelKey」-
     * 组所关联的模型记录ID，用于描述哪一个Model中的记录
     */
    public final TableField<SGroupRecord, String> MODEL_KEY = createField(DSL.name("MODEL_KEY"), SQLDataType.VARCHAR(36), this, "「modelKey」- 组所关联的模型记录ID，用于描述哪一个Model中的记录");

    /**
     * The column <code>ZDB.S_GROUP.CATEGORY</code>. 「category」- 组类型
     */
    public final TableField<SGroupRecord, String> CATEGORY = createField(DSL.name("CATEGORY"), SQLDataType.VARCHAR(36), this, "「category」- 组类型");

    /**
     * The column <code>ZDB.S_GROUP.SIGMA</code>. 「sigma」- 用户组绑定的统一标识
     */
    public final TableField<SGroupRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(128), this, "「sigma」- 用户组绑定的统一标识");

    /**
     * The column <code>ZDB.S_GROUP.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<SGroupRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");

    /**
     * The column <code>ZDB.S_GROUP.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<SGroupRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");

    /**
     * The column <code>ZDB.S_GROUP.METADATA</code>. 「metadata」- 附加配置数据
     */
    public final TableField<SGroupRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置数据");

    /**
     * The column <code>ZDB.S_GROUP.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<SGroupRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");

    /**
     * The column <code>ZDB.S_GROUP.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<SGroupRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");

    /**
     * The column <code>ZDB.S_GROUP.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<SGroupRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");

    /**
     * The column <code>ZDB.S_GROUP.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<SGroupRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private SGroup(Name alias, Table<SGroupRecord> aliased) {
        this(alias, aliased, null);
    }

    private SGroup(Name alias, Table<SGroupRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.S_GROUP</code> table reference
     */
    public SGroup(String alias) {
        this(DSL.name(alias), S_GROUP);
    }

    /**
     * Create an aliased <code>ZDB.S_GROUP</code> table reference
     */
    public SGroup(Name alias) {
        this(alias, S_GROUP);
    }

    /**
     * Create a <code>ZDB.S_GROUP</code> table reference
     */
    public SGroup() {
        this(DSL.name("S_GROUP"), null);
    }

    public <O extends Record> SGroup(Table<O> child, ForeignKey<O, SGroupRecord> key) {
        super(child, key, S_GROUP);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public UniqueKey<SGroupRecord> getPrimaryKey() {
        return Keys.KEY_S_GROUP_PRIMARY;
    }

    @Override
    public List<UniqueKey<SGroupRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_S_GROUP_CODE);
    }

    @Override
    public SGroup as(String alias) {
        return new SGroup(DSL.name(alias), this);
    }

    @Override
    public SGroup as(Name alias) {
        return new SGroup(alias, this);
    }

    @Override
    public SGroup as(Table<?> alias) {
        return new SGroup(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public SGroup rename(String name) {
        return new SGroup(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SGroup rename(Name name) {
        return new SGroup(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public SGroup rename(Table<?> name) {
        return new SGroup(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row15 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row15<String, String, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function15<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super LocalDateTime, ? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function15<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super LocalDateTime, ? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
