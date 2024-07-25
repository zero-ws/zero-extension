/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.rbac.domain.tables;


import io.zerows.extension.commerce.rbac.domain.Keys;
import io.zerows.extension.commerce.rbac.domain.Zdb;
import io.zerows.extension.commerce.rbac.domain.tables.records.SResourceRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
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
public class SResource extends TableImpl<SResourceRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ZDB.S_RESOURCE</code>
     */
    public static final SResource S_RESOURCE = new SResource();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SResourceRecord> getRecordType() {
        return SResourceRecord.class;
    }

    /**
     * The column <code>ZDB.S_RESOURCE.KEY</code>. 「key」- 资源对应的ID
     */
    public final TableField<SResourceRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 资源对应的ID");

    /**
     * The column <code>ZDB.S_RESOURCE.CODE</code>. 「code」- 资源编号
     */
    public final TableField<SResourceRecord, String> CODE = createField(DSL.name("CODE"), SQLDataType.VARCHAR(255), this, "「code」- 资源编号");

    /**
     * The column <code>ZDB.S_RESOURCE.NAME</code>. 「name」- 资源名称
     */
    public final TableField<SResourceRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(255), this, "「name」- 资源名称");

    /**
     * The column <code>ZDB.S_RESOURCE.TYPE</code>. 「type」- 资源分类
     */
    public final TableField<SResourceRecord, String> TYPE = createField(DSL.name("TYPE"), SQLDataType.VARCHAR(60), this, "「type」- 资源分类");

    /**
     * The column <code>ZDB.S_RESOURCE.IDENTIFIER</code>. 「identifier」-
     * 当前资源所属的Model的标识
     */
    public final TableField<SResourceRecord, String> IDENTIFIER = createField(DSL.name("IDENTIFIER"), SQLDataType.VARCHAR(255), this, "「identifier」- 当前资源所属的Model的标识");

    /**
     * The column <code>ZDB.S_RESOURCE.COMMENT</code>. 「comment」- 备注信息
     */
    public final TableField<SResourceRecord, String> COMMENT = createField(DSL.name("COMMENT"), SQLDataType.CLOB, this, "「comment」- 备注信息");

    /**
     * The column <code>ZDB.S_RESOURCE.LEVEL</code>. 「level」- 资源需求级别
     */
    public final TableField<SResourceRecord, Integer> LEVEL = createField(DSL.name("LEVEL"), SQLDataType.INTEGER, this, "「level」- 资源需求级别");

    /**
     * The column <code>ZDB.S_RESOURCE.MODE_ROLE</code>. 「modeRole」- 该资源查找角色的模式
     */
    public final TableField<SResourceRecord, String> MODE_ROLE = createField(DSL.name("MODE_ROLE"), SQLDataType.VARCHAR(32), this, "「modeRole」- 该资源查找角色的模式");

    /**
     * The column <code>ZDB.S_RESOURCE.MODE_GROUP</code>. 「modeGroup」- 该资源查找组的模式
     */
    public final TableField<SResourceRecord, String> MODE_GROUP = createField(DSL.name("MODE_GROUP"), SQLDataType.VARCHAR(32), this, "「modeGroup」- 该资源查找组的模式");

    /**
     * The column <code>ZDB.S_RESOURCE.MODE_TREE</code>. 「modeTree」-
     * 该资源处理树（用户组）的模式
     */
    public final TableField<SResourceRecord, String> MODE_TREE = createField(DSL.name("MODE_TREE"), SQLDataType.VARCHAR(32), this, "「modeTree」- 该资源处理树（用户组）的模式");

    /**
     * The column <code>ZDB.S_RESOURCE.VIRTUAL</code>. 「virtual」- 虚拟资源
     */
    public final TableField<SResourceRecord, Boolean> VIRTUAL = createField(DSL.name("VIRTUAL"), SQLDataType.BIT, this, "「virtual」- 虚拟资源");

    /**
     * The column <code>ZDB.S_RESOURCE.SEEK_SYNTAX</code>. 「seekSyntax」- 访问者语法
     */
    public final TableField<SResourceRecord, String> SEEK_SYNTAX = createField(DSL.name("SEEK_SYNTAX"), SQLDataType.CLOB, this, "「seekSyntax」- 访问者语法");

    /**
     * The column <code>ZDB.S_RESOURCE.SEEK_CONFIG</code>. 「seekConfig」- 访问者配置
     */
    public final TableField<SResourceRecord, String> SEEK_CONFIG = createField(DSL.name("SEEK_CONFIG"), SQLDataType.CLOB, this, "「seekConfig」- 访问者配置");

    /**
     * The column <code>ZDB.S_RESOURCE.SEEK_COMPONENT</code>. 「seekComponent」-
     * 访问者组件
     */
    public final TableField<SResourceRecord, String> SEEK_COMPONENT = createField(DSL.name("SEEK_COMPONENT"), SQLDataType.VARCHAR(255), this, "「seekComponent」- 访问者组件");

    /**
     * The column <code>ZDB.S_RESOURCE.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<SResourceRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");

    /**
     * The column <code>ZDB.S_RESOURCE.CATEGORY</code>. 「category」- 资源分类
     */
    public final TableField<SResourceRecord, String> CATEGORY = createField(DSL.name("CATEGORY"), SQLDataType.VARCHAR(36), this, "「category」- 资源分类");

    /**
     * The column <code>ZDB.S_RESOURCE.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<SResourceRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");

    /**
     * The column <code>ZDB.S_RESOURCE.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<SResourceRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");

    /**
     * The column <code>ZDB.S_RESOURCE.METADATA</code>. 「metadata」- 附加配置数据
     */
    public final TableField<SResourceRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置数据");

    /**
     * The column <code>ZDB.S_RESOURCE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<SResourceRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");

    /**
     * The column <code>ZDB.S_RESOURCE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<SResourceRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");

    /**
     * The column <code>ZDB.S_RESOURCE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<SResourceRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");

    /**
     * The column <code>ZDB.S_RESOURCE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<SResourceRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private SResource(Name alias, Table<SResourceRecord> aliased) {
        this(alias, aliased, null);
    }

    private SResource(Name alias, Table<SResourceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.S_RESOURCE</code> table reference
     */
    public SResource(String alias) {
        this(DSL.name(alias), S_RESOURCE);
    }

    /**
     * Create an aliased <code>ZDB.S_RESOURCE</code> table reference
     */
    public SResource(Name alias) {
        this(alias, S_RESOURCE);
    }

    /**
     * Create a <code>ZDB.S_RESOURCE</code> table reference
     */
    public SResource() {
        this(DSL.name("S_RESOURCE"), null);
    }

    public <O extends Record> SResource(Table<O> child, ForeignKey<O, SResourceRecord> key) {
        super(child, key, S_RESOURCE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public UniqueKey<SResourceRecord> getPrimaryKey() {
        return Keys.KEY_S_RESOURCE_PRIMARY;
    }

    @Override
    public List<UniqueKey<SResourceRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_S_RESOURCE_CODE);
    }

    @Override
    public SResource as(String alias) {
        return new SResource(DSL.name(alias), this);
    }

    @Override
    public SResource as(Name alias) {
        return new SResource(alias, this);
    }

    @Override
    public SResource as(Table<?> alias) {
        return new SResource(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public SResource rename(String name) {
        return new SResource(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SResource rename(Name name) {
        return new SResource(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public SResource rename(Table<?> name) {
        return new SResource(name.getQualifiedName(), null);
    }
}
