/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.runtime.ambient.domain.tables;


import io.zerows.extension.runtime.ambient.domain.Keys;
import io.zerows.extension.runtime.ambient.domain.Zdb;
import io.zerows.extension.runtime.ambient.domain.tables.records.XSourceRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function21;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row21;
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
public class XSource extends TableImpl<XSourceRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ZDB.X_SOURCE</code>
     */
    public static final XSource X_SOURCE = new XSource();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<XSourceRecord> getRecordType() {
        return XSourceRecord.class;
    }

    /**
     * The column <code>ZDB.X_SOURCE.KEY</code>. 「key」- 数据源主键
     */
    public final TableField<XSourceRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 数据源主键");

    /**
     * The column <code>ZDB.X_SOURCE.IP_V4</code>. 「ipV4」- IP v4地址
     */
    public final TableField<XSourceRecord, String> IP_V4 = createField(DSL.name("IP_V4"), SQLDataType.VARCHAR(15), this, "「ipV4」- IP v4地址");

    /**
     * The column <code>ZDB.X_SOURCE.IP_V6</code>. 「ipV6」- IP v6地址
     */
    public final TableField<XSourceRecord, String> IP_V6 = createField(DSL.name("IP_V6"), SQLDataType.VARCHAR(40), this, "「ipV6」- IP v6地址");

    /**
     * The column <code>ZDB.X_SOURCE.HOSTNAME</code>. 「hostname」- 主机地址
     */
    public final TableField<XSourceRecord, String> HOSTNAME = createField(DSL.name("HOSTNAME"), SQLDataType.VARCHAR(255), this, "「hostname」- 主机地址");

    /**
     * The column <code>ZDB.X_SOURCE.PORT</code>. 「port」- 端口号
     */
    public final TableField<XSourceRecord, Integer> PORT = createField(DSL.name("PORT"), SQLDataType.INTEGER, this, "「port」- 端口号");

    /**
     * The column <code>ZDB.X_SOURCE.CATEGORY</code>. 「category」- 数据库类型
     */
    public final TableField<XSourceRecord, String> CATEGORY = createField(DSL.name("CATEGORY"), SQLDataType.VARCHAR(32), this, "「category」- 数据库类型");

    /**
     * The column <code>ZDB.X_SOURCE.DRIVER_CLASS_NAME</code>.
     * 「driverClassName」- 数据库驱动指定，JDBC4之前
     */
    public final TableField<XSourceRecord, String> DRIVER_CLASS_NAME = createField(DSL.name("DRIVER_CLASS_NAME"), SQLDataType.VARCHAR(255), this, "「driverClassName」- 数据库驱动指定，JDBC4之前");

    /**
     * The column <code>ZDB.X_SOURCE.JDBC_URL</code>. 「jdbcUrl」- JDBC连接字符串
     */
    public final TableField<XSourceRecord, String> JDBC_URL = createField(DSL.name("JDBC_URL"), SQLDataType.VARCHAR(1024), this, "「jdbcUrl」- JDBC连接字符串");

    /**
     * The column <code>ZDB.X_SOURCE.JDBC_CONFIG</code>. 「jdbcConfig」-
     * 连接字符串中的配置key=value
     */
    public final TableField<XSourceRecord, String> JDBC_CONFIG = createField(DSL.name("JDBC_CONFIG"), SQLDataType.CLOB, this, "「jdbcConfig」- 连接字符串中的配置key=value");

    /**
     * The column <code>ZDB.X_SOURCE.INSTANCE</code>. 「instance」- 实例名称
     */
    public final TableField<XSourceRecord, String> INSTANCE = createField(DSL.name("INSTANCE"), SQLDataType.VARCHAR(255), this, "「instance」- 实例名称");

    /**
     * The column <code>ZDB.X_SOURCE.USERNAME</code>. 「username」- 账号
     */
    public final TableField<XSourceRecord, String> USERNAME = createField(DSL.name("USERNAME"), SQLDataType.VARCHAR(255), this, "「username」- 账号");

    /**
     * The column <code>ZDB.X_SOURCE.PASSWORD</code>. 「password」- 密码
     */
    public final TableField<XSourceRecord, String> PASSWORD = createField(DSL.name("PASSWORD"), SQLDataType.VARCHAR(255), this, "「password」- 密码");

    /**
     * The column <code>ZDB.X_SOURCE.APP_ID</code>. 「appId」- 关联的应用程序ID
     */
    public final TableField<XSourceRecord, String> APP_ID = createField(DSL.name("APP_ID"), SQLDataType.VARCHAR(255), this, "「appId」- 关联的应用程序ID");

    /**
     * The column <code>ZDB.X_SOURCE.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<XSourceRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");

    /**
     * The column <code>ZDB.X_SOURCE.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<XSourceRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");

    /**
     * The column <code>ZDB.X_SOURCE.METADATA</code>. 「metadata」- 附加配置
     */
    public final TableField<XSourceRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置");

    /**
     * The column <code>ZDB.X_SOURCE.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<XSourceRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(8), this, "「language」- 使用的语言");

    /**
     * The column <code>ZDB.X_SOURCE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<XSourceRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");

    /**
     * The column <code>ZDB.X_SOURCE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<XSourceRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");

    /**
     * The column <code>ZDB.X_SOURCE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<XSourceRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");

    /**
     * The column <code>ZDB.X_SOURCE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<XSourceRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private XSource(Name alias, Table<XSourceRecord> aliased) {
        this(alias, aliased, null);
    }

    private XSource(Name alias, Table<XSourceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.X_SOURCE</code> table reference
     */
    public XSource(String alias) {
        this(DSL.name(alias), X_SOURCE);
    }

    /**
     * Create an aliased <code>ZDB.X_SOURCE</code> table reference
     */
    public XSource(Name alias) {
        this(alias, X_SOURCE);
    }

    /**
     * Create a <code>ZDB.X_SOURCE</code> table reference
     */
    public XSource() {
        this(DSL.name("X_SOURCE"), null);
    }

    public <O extends Record> XSource(Table<O> child, ForeignKey<O, XSourceRecord> key) {
        super(child, key, X_SOURCE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public UniqueKey<XSourceRecord> getPrimaryKey() {
        return Keys.KEY_X_SOURCE_PRIMARY;
    }

    @Override
    public List<UniqueKey<XSourceRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_X_SOURCE_APP_ID);
    }

    @Override
    public XSource as(String alias) {
        return new XSource(DSL.name(alias), this);
    }

    @Override
    public XSource as(Name alias) {
        return new XSource(alias, this);
    }

    @Override
    public XSource as(Table<?> alias) {
        return new XSource(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public XSource rename(String name) {
        return new XSource(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public XSource rename(Name name) {
        return new XSource(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public XSource rename(Table<?> name) {
        return new XSource(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row21 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row21<String, String, String, String, Integer, String, String, String, String, String, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function21<? super String, ? super String, ? super String, ? super String, ? super Integer, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super String, ? super String, ? super LocalDateTime, ? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function21<? super String, ? super String, ? super String, ? super String, ? super Integer, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super String, ? super String, ? super LocalDateTime, ? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
