/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.runtime.ambient.domain.tables;


import io.zerows.extension.runtime.ambient.domain.Indexes;
import io.zerows.extension.runtime.ambient.domain.Keys;
import io.zerows.extension.runtime.ambient.domain.Zdb;
import io.zerows.extension.runtime.ambient.domain.tables.records.XAppRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
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
public class XApp extends TableImpl<XAppRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ZDB.X_APP</code>
     */
    public static final XApp X_APP = new XApp();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<XAppRecord> getRecordType() {
        return XAppRecord.class;
    }

    /**
     * The column <code>ZDB.X_APP.KEY</code>. 「key」- 应用程序主键
     */
    public final TableField<XAppRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 应用程序主键");

    /**
     * The column <code>ZDB.X_APP.NAME</code>. 「name」- 应用程序名称
     */
    public final TableField<XAppRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(255), this, "「name」- 应用程序名称");

    /**
     * The column <code>ZDB.X_APP.CODE</code>. 「code」- 应用程序编码
     */
    public final TableField<XAppRecord, String> CODE = createField(DSL.name("CODE"), SQLDataType.VARCHAR(36), this, "「code」- 应用程序编码");

    /**
     * The column <code>ZDB.X_APP.TITLE</code>. 「title」- 应用程序标题
     */
    public final TableField<XAppRecord, String> TITLE = createField(DSL.name("TITLE"), SQLDataType.VARCHAR(64), this, "「title」- 应用程序标题");

    /**
     * The column <code>ZDB.X_APP.LOGO</code>. 「logo」- 应用程序图标
     */
    public final TableField<XAppRecord, String> LOGO = createField(DSL.name("LOGO"), SQLDataType.CLOB, this, "「logo」- 应用程序图标");

    /**
     * The column <code>ZDB.X_APP.ICP</code>. 「icp」- ICP备案号
     */
    public final TableField<XAppRecord, String> ICP = createField(DSL.name("ICP"), SQLDataType.VARCHAR(64), this, "「icp」- ICP备案号");

    /**
     * The column <code>ZDB.X_APP.COPY_RIGHT</code>. 「copyRight」- CopyRight版权信息
     */
    public final TableField<XAppRecord, String> COPY_RIGHT = createField(DSL.name("COPY_RIGHT"), SQLDataType.VARCHAR(255), this, "「copyRight」- CopyRight版权信息");

    /**
     * The column <code>ZDB.X_APP.EMAIL</code>. 「email」- 应用Email信息
     */
    public final TableField<XAppRecord, String> EMAIL = createField(DSL.name("EMAIL"), SQLDataType.VARCHAR(255), this, "「email」- 应用Email信息");

    /**
     * The column <code>ZDB.X_APP.DOMAIN</code>. 「domain」- 应用程序所在域
     */
    public final TableField<XAppRecord, String> DOMAIN = createField(DSL.name("DOMAIN"), SQLDataType.VARCHAR(255), this, "「domain」- 应用程序所在域");

    /**
     * The column <code>ZDB.X_APP.APP_PORT</code>. 「appPort」-
     * 应用程序端口号，和SOURCE的端口号区别开
     */
    public final TableField<XAppRecord, Integer> APP_PORT = createField(DSL.name("APP_PORT"), SQLDataType.INTEGER, this, "「appPort」- 应用程序端口号，和SOURCE的端口号区别开");

    /**
     * The column <code>ZDB.X_APP.URL_ENTRY</code>. 「urlEntry」— 应用程序入口页面（登录页）
     */
    public final TableField<XAppRecord, String> URL_ENTRY = createField(DSL.name("URL_ENTRY"), SQLDataType.VARCHAR(255), this, "「urlEntry」— 应用程序入口页面（登录页）");

    /**
     * The column <code>ZDB.X_APP.URL_MAIN</code>. 「urlMain」- 应用程序内置主页（带安全）
     */
    public final TableField<XAppRecord, String> URL_MAIN = createField(DSL.name("URL_MAIN"), SQLDataType.VARCHAR(255), this, "「urlMain」- 应用程序内置主页（带安全）");

    /**
     * The column <code>ZDB.X_APP.PATH</code>. 「path」- 应用程序路径
     */
    public final TableField<XAppRecord, String> PATH = createField(DSL.name("PATH"), SQLDataType.VARCHAR(255), this, "「path」- 应用程序路径");

    /**
     * The column <code>ZDB.X_APP.ROUTE</code>. 「route」- 后端API的根路径，启动时需要
     */
    public final TableField<XAppRecord, String> ROUTE = createField(DSL.name("ROUTE"), SQLDataType.VARCHAR(255), this, "「route」- 后端API的根路径，启动时需要");

    /**
     * The column <code>ZDB.X_APP.APP_KEY</code>. 「appKey」- 应用程序专用唯一hashKey
     */
    public final TableField<XAppRecord, String> APP_KEY = createField(DSL.name("APP_KEY"), SQLDataType.VARCHAR(128), this, "「appKey」- 应用程序专用唯一hashKey");

    /**
     * The column <code>ZDB.X_APP.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<XAppRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");

    /**
     * The column <code>ZDB.X_APP.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<XAppRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");

    /**
     * The column <code>ZDB.X_APP.METADATA</code>. 「metadata」- 附加配置
     */
    public final TableField<XAppRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置");

    /**
     * The column <code>ZDB.X_APP.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<XAppRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(8), this, "「language」- 使用的语言");

    /**
     * The column <code>ZDB.X_APP.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<XAppRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");

    /**
     * The column <code>ZDB.X_APP.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<XAppRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");

    /**
     * The column <code>ZDB.X_APP.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<XAppRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");

    /**
     * The column <code>ZDB.X_APP.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<XAppRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private XApp(Name alias, Table<XAppRecord> aliased) {
        this(alias, aliased, null);
    }

    private XApp(Name alias, Table<XAppRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.X_APP</code> table reference
     */
    public XApp(String alias) {
        this(DSL.name(alias), X_APP);
    }

    /**
     * Create an aliased <code>ZDB.X_APP</code> table reference
     */
    public XApp(Name alias) {
        this(alias, X_APP);
    }

    /**
     * Create a <code>ZDB.X_APP</code> table reference
     */
    public XApp() {
        this(DSL.name("X_APP"), null);
    }

    public <O extends Record> XApp(Table<O> child, ForeignKey<O, XAppRecord> key) {
        super(child, key, X_APP);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.X_APP_IDX_X_APP_NAME);
    }

    @Override
    public UniqueKey<XAppRecord> getPrimaryKey() {
        return Keys.KEY_X_APP_PRIMARY;
    }

    @Override
    public List<UniqueKey<XAppRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_X_APP_NAME, Keys.KEY_X_APP_CODE, Keys.KEY_X_APP_PATH, Keys.KEY_X_APP_PATH_2);
    }

    @Override
    public XApp as(String alias) {
        return new XApp(DSL.name(alias), this);
    }

    @Override
    public XApp as(Name alias) {
        return new XApp(alias, this);
    }

    @Override
    public XApp as(Table<?> alias) {
        return new XApp(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public XApp rename(String name) {
        return new XApp(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public XApp rename(Name name) {
        return new XApp(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public XApp rename(Table<?> name) {
        return new XApp(name.getQualifiedName(), null);
    }
}