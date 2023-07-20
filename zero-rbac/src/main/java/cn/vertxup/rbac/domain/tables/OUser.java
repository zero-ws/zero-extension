/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.rbac.domain.tables;


import cn.vertxup.rbac.domain.Indexes;
import cn.vertxup.rbac.domain.Keys;
import cn.vertxup.rbac.domain.Zdb;
import cn.vertxup.rbac.domain.tables.records.OUserRecord;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function11;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row11;
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
public class OUser extends TableImpl<OUserRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ZDB.O_USER</code>
     */
    public static final OUser O_USER = new OUser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OUserRecord> getRecordType() {
        return OUserRecord.class;
    }

    /**
     * The column <code>ZDB.O_USER.KEY</code>. 「key」- OAuth用户ID
     */
    public final TableField<OUserRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- OAuth用户ID");

    /**
     * The column <code>ZDB.O_USER.REDIRECT_URI</code>. 「redirectUri」- 回调重定向地址
     */
    public final TableField<OUserRecord, String> REDIRECT_URI = createField(DSL.name("REDIRECT_URI"), SQLDataType.CLOB, this, "「redirectUri」- 回调重定向地址");

    /**
     * The column <code>ZDB.O_USER.CODE</code>. 「code」- 系统编号
     */
    public final TableField<OUserRecord, String> CODE = createField(DSL.name("CODE"), SQLDataType.VARCHAR(36), this, "「code」- 系统编号");

    /**
     * The column <code>ZDB.O_USER.CLIENT_SECRET</code>. 「clientSecret」- 客户端密钥
     */
    public final TableField<OUserRecord, String> CLIENT_SECRET = createField(DSL.name("CLIENT_SECRET"), SQLDataType.VARCHAR(64), this, "「clientSecret」- 客户端密钥");

    /**
     * The column <code>ZDB.O_USER.CLIENT_ID</code>. 「clientId」- 客户端ID
     */
    public final TableField<OUserRecord, String> CLIENT_ID = createField(DSL.name("CLIENT_ID"), SQLDataType.VARCHAR(36), this, "「clientId」- 客户端ID");

    /**
     * The column <code>ZDB.O_USER.GRANT_TYPE</code>. 「grantType」- 认证方式
     */
    public final TableField<OUserRecord, String> GRANT_TYPE = createField(DSL.name("GRANT_TYPE"), SQLDataType.VARCHAR(32), this, "「grantType」- 认证方式");

    /**
     * The column <code>ZDB.O_USER.SCOPE</code>. 「scope」- 对应名空间，以应用为中心
     */
    public final TableField<OUserRecord, String> SCOPE = createField(DSL.name("SCOPE"), SQLDataType.VARCHAR(64), this, "「scope」- 对应名空间，以应用为中心");

    /**
     * The column <code>ZDB.O_USER.STATE</code>. 「state」- 客户端状态
     */
    public final TableField<OUserRecord, String> STATE = createField(DSL.name("STATE"), SQLDataType.VARCHAR(128), this, "「state」- 客户端状态");

    /**
     * The column <code>ZDB.O_USER.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<OUserRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");

    /**
     * The column <code>ZDB.O_USER.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<OUserRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");

    /**
     * The column <code>ZDB.O_USER.METADATA</code>. 「metadata」- 附加配置数据
     */
    public final TableField<OUserRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置数据");

    private OUser(Name alias, Table<OUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private OUser(Name alias, Table<OUserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.O_USER</code> table reference
     */
    public OUser(String alias) {
        this(DSL.name(alias), O_USER);
    }

    /**
     * Create an aliased <code>ZDB.O_USER</code> table reference
     */
    public OUser(Name alias) {
        this(alias, O_USER);
    }

    /**
     * Create a <code>ZDB.O_USER</code> table reference
     */
    public OUser() {
        this(DSL.name("O_USER"), null);
    }

    public <O extends Record> OUser(Table<O> child, ForeignKey<O, OUserRecord> key) {
        super(child, key, O_USER);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.O_USER_IDXM_O_USER_OAUTH_AUTHORIZE_APP, Indexes.O_USER_IDXM_O_USER_OAUTH_AUTHORIZE_FULL);
    }

    @Override
    public UniqueKey<OUserRecord> getPrimaryKey() {
        return Keys.KEY_O_USER_PRIMARY;
    }

    @Override
    public List<UniqueKey<OUserRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_O_USER_CLIENT_SECRET, Keys.KEY_O_USER_CLIENT_ID);
    }

    @Override
    public OUser as(String alias) {
        return new OUser(DSL.name(alias), this);
    }

    @Override
    public OUser as(Name alias) {
        return new OUser(alias, this);
    }

    @Override
    public OUser as(Table<?> alias) {
        return new OUser(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public OUser rename(String name) {
        return new OUser(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OUser rename(Name name) {
        return new OUser(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public OUser rename(Table<?> name) {
        return new OUser(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<String, String, String, String, String, String, String, String, String, Boolean, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function11<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function11<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
