/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.runtime.integration.domain.tables;


import io.zerows.extension.runtime.integration.domain.Keys;
import io.zerows.extension.runtime.integration.domain.Zdb;
import io.zerows.extension.runtime.integration.domain.tables.records.IDirectoryRecord;
import org.jooq.Record;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class IDirectory extends TableImpl<IDirectoryRecord> {

    /**
     * The reference instance of <code>ZDB.I_DIRECTORY</code>
     */
    public static final IDirectory I_DIRECTORY = new IDirectory();
    private static final long serialVersionUID = 1L;
    /**
     * The column <code>ZDB.I_DIRECTORY.KEY</code>. 「key」- 目录主键
     */
    public final TableField<IDirectoryRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 目录主键");
    /**
     * The column <code>ZDB.I_DIRECTORY.NAME</code>. 「name」- 目录名称
     */
    public final TableField<IDirectoryRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(255).nullable(false), this, "「name」- 目录名称");
    /**
     * The column <code>ZDB.I_DIRECTORY.CODE</code>. 「code」- 目录编号
     */
    public final TableField<IDirectoryRecord, String> CODE = createField(DSL.name("CODE"), SQLDataType.VARCHAR(255).nullable(false), this, "「code」- 目录编号");
    /**
     * The column <code>ZDB.I_DIRECTORY.STORE_PATH</code>. 「storePath」- 目录相对路径
     */
    public final TableField<IDirectoryRecord, String> STORE_PATH = createField(DSL.name("STORE_PATH"), SQLDataType.VARCHAR(512), this, "「storePath」- 目录相对路径");
    /**
     * The column <code>ZDB.I_DIRECTORY.LINKED_PATH</code>. 「linkedPath」-
     * 链接路径，type = LINK 时专用
     */
    public final TableField<IDirectoryRecord, String> LINKED_PATH = createField(DSL.name("LINKED_PATH"), SQLDataType.VARCHAR(512), this, "「linkedPath」- 链接路径，type = LINK 时专用");
    /**
     * The column <code>ZDB.I_DIRECTORY.PARENT_ID</code>. 「parentId」- 父目录ID
     */
    public final TableField<IDirectoryRecord, String> PARENT_ID = createField(DSL.name("PARENT_ID"), SQLDataType.VARCHAR(36), this, "「parentId」- 父目录ID");
    /**
     * The column <code>ZDB.I_DIRECTORY.CATEGORY</code>. 「category」- 目录连接的类型树
     */
    public final TableField<IDirectoryRecord, String> CATEGORY = createField(DSL.name("CATEGORY"), SQLDataType.VARCHAR(36), this, "「category」- 目录连接的类型树");
    /**
     * The column <code>ZDB.I_DIRECTORY.TYPE</code>. 「type」- 目录类型：INTEGRATION /
     * STORE / LINK
     */
    public final TableField<IDirectoryRecord, String> TYPE = createField(DSL.name("TYPE"), SQLDataType.VARCHAR(36).nullable(false), this, "「type」- 目录类型：INTEGRATION / STORE / LINK");
    /**
     * The column <code>ZDB.I_DIRECTORY.OWNER</code>. 「owner」- 目录访问人
     */
    public final TableField<IDirectoryRecord, String> OWNER = createField(DSL.name("OWNER"), SQLDataType.VARCHAR(36), this, "「owner」- 目录访问人");
    /**
     * The column <code>ZDB.I_DIRECTORY.INTEGRATION_ID</code>. 「integrationId」-
     * 该目录关联的 KIntegration，不关联则不转存
     */
    public final TableField<IDirectoryRecord, String> INTEGRATION_ID = createField(DSL.name("INTEGRATION_ID"), SQLDataType.VARCHAR(36), this, "「integrationId」- 该目录关联的 KIntegration，不关联则不转存");
    /**
     * The column <code>ZDB.I_DIRECTORY.RUN_COMPONENT</code>. 「runComponent」-
     * 目录执行组件，抓文件专用
     */
    public final TableField<IDirectoryRecord, String> RUN_COMPONENT = createField(DSL.name("RUN_COMPONENT"), SQLDataType.CLOB, this, "「runComponent」- 目录执行组件，抓文件专用");
    /**
     * The column <code>ZDB.I_DIRECTORY.VISIT</code>. 「visit」- 公有 / 私有
     */
    public final TableField<IDirectoryRecord, Boolean> VISIT = createField(DSL.name("VISIT"), SQLDataType.BIT, this, "「visit」- 公有 / 私有");
    /**
     * The column <code>ZDB.I_DIRECTORY.VISIT_MODE</code>. 「visitMode」- 目录模式：只读
     * / 可写，以后扩展为其他
     */
    public final TableField<IDirectoryRecord, String> VISIT_MODE = createField(DSL.name("VISIT_MODE"), SQLDataType.VARCHAR(36), this, "「visitMode」- 目录模式：只读 / 可写，以后扩展为其他");
    /**
     * The column <code>ZDB.I_DIRECTORY.VISIT_ROLE</code>. 「visitRole」- 目录访问角色
     */
    public final TableField<IDirectoryRecord, String> VISIT_ROLE = createField(DSL.name("VISIT_ROLE"), SQLDataType.CLOB, this, "「visitRole」- 目录访问角色");
    /**
     * The column <code>ZDB.I_DIRECTORY.VISIT_GROUP</code>. 「visitGroup」- 目录访问组
     */
    public final TableField<IDirectoryRecord, String> VISIT_GROUP = createField(DSL.name("VISIT_GROUP"), SQLDataType.CLOB, this, "「visitGroup」- 目录访问组");
    /**
     * The column <code>ZDB.I_DIRECTORY.VISIT_COMPONENT</code>.
     * 「visitComponent」- 目录访问控制专用组件
     */
    public final TableField<IDirectoryRecord, String> VISIT_COMPONENT = createField(DSL.name("VISIT_COMPONENT"), SQLDataType.CLOB, this, "「visitComponent」- 目录访问控制专用组件");
    /**
     * The column <code>ZDB.I_DIRECTORY.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<IDirectoryRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");
    /**
     * The column <code>ZDB.I_DIRECTORY.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<IDirectoryRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");
    /**
     * The column <code>ZDB.I_DIRECTORY.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<IDirectoryRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>ZDB.I_DIRECTORY.METADATA</code>. 「metadata」- 附加配置数据
     */
    public final TableField<IDirectoryRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置数据");
    /**
     * The column <code>ZDB.I_DIRECTORY.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<IDirectoryRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");
    /**
     * The column <code>ZDB.I_DIRECTORY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<IDirectoryRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");
    /**
     * The column <code>ZDB.I_DIRECTORY.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<IDirectoryRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");
    /**
     * The column <code>ZDB.I_DIRECTORY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<IDirectoryRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private IDirectory(Name alias, Table<IDirectoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private IDirectory(Name alias, Table<IDirectoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.I_DIRECTORY</code> table reference
     */
    public IDirectory(String alias) {
        this(DSL.name(alias), I_DIRECTORY);
    }

    /**
     * Create an aliased <code>ZDB.I_DIRECTORY</code> table reference
     */
    public IDirectory(Name alias) {
        this(alias, I_DIRECTORY);
    }

    /**
     * Create a <code>ZDB.I_DIRECTORY</code> table reference
     */
    public IDirectory() {
        this(DSL.name("I_DIRECTORY"), null);
    }

    public <O extends Record> IDirectory(Table<O> child, ForeignKey<O, IDirectoryRecord> key) {
        super(child, key, I_DIRECTORY);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<IDirectoryRecord> getRecordType() {
        return IDirectoryRecord.class;
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public UniqueKey<IDirectoryRecord> getPrimaryKey() {
        return Keys.KEY_I_DIRECTORY_PRIMARY;
    }

    @Override
    public List<UniqueKey<IDirectoryRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_I_DIRECTORY_NAME, Keys.KEY_I_DIRECTORY_CODE, Keys.KEY_I_DIRECTORY_STORE_PATH);
    }

    @Override
    public IDirectory as(String alias) {
        return new IDirectory(DSL.name(alias), this);
    }

    @Override
    public IDirectory as(Name alias) {
        return new IDirectory(alias, this);
    }

    @Override
    public IDirectory as(Table<?> alias) {
        return new IDirectory(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public IDirectory rename(String name) {
        return new IDirectory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public IDirectory rename(Name name) {
        return new IDirectory(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public IDirectory rename(Table<?> name) {
        return new IDirectory(name.getQualifiedName(), null);
    }
}
