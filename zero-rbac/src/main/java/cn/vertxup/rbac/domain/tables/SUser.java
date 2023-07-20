/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.rbac.domain.tables;


import cn.vertxup.rbac.domain.Indexes;
import cn.vertxup.rbac.domain.Keys;
import cn.vertxup.rbac.domain.Zdb;
import cn.vertxup.rbac.domain.tables.records.SUserRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function18;
import org.jooq.Index;
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
public class SUser extends TableImpl<SUserRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ZDB.S_USER</code>
     */
    public static final SUser S_USER = new SUser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SUserRecord> getRecordType() {
        return SUserRecord.class;
    }

    /**
     * The column <code>ZDB.S_USER.KEY</code>. 「key」- 用户ID
     */
    public final TableField<SUserRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 用户ID");

    /**
     * The column <code>ZDB.S_USER.USERNAME</code>. 「username」- 用户登录账号
     */
    public final TableField<SUserRecord, String> USERNAME = createField(DSL.name("USERNAME"), SQLDataType.VARCHAR(255), this, "「username」- 用户登录账号");

    /**
     * The column <code>ZDB.S_USER.REALNAME</code>. 「realname」- 用户真实姓名
     */
    public final TableField<SUserRecord, String> REALNAME = createField(DSL.name("REALNAME"), SQLDataType.VARCHAR(255), this, "「realname」- 用户真实姓名");

    /**
     * The column <code>ZDB.S_USER.ALIAS</code>. 「alias」- 用户昵称
     */
    public final TableField<SUserRecord, String> ALIAS = createField(DSL.name("ALIAS"), SQLDataType.VARCHAR(255), this, "「alias」- 用户昵称");

    /**
     * The column <code>ZDB.S_USER.MOBILE</code>. 「mobile」- 用户登录手机
     */
    public final TableField<SUserRecord, String> MOBILE = createField(DSL.name("MOBILE"), SQLDataType.VARCHAR(255), this, "「mobile」- 用户登录手机");

    /**
     * The column <code>ZDB.S_USER.EMAIL</code>. 「email」- 用户登录EMAIL地址
     */
    public final TableField<SUserRecord, String> EMAIL = createField(DSL.name("EMAIL"), SQLDataType.VARCHAR(255), this, "「email」- 用户登录EMAIL地址");

    /**
     * The column <code>ZDB.S_USER.PASSWORD</code>. 「password」- 用户登录密码
     */
    public final TableField<SUserRecord, String> PASSWORD = createField(DSL.name("PASSWORD"), SQLDataType.VARCHAR(255), this, "「password」- 用户登录密码");

    /**
     * The column <code>ZDB.S_USER.MODEL_ID</code>. 「modelId」-
     * 组所关联的模型identifier，用于描述
     */
    public final TableField<SUserRecord, String> MODEL_ID = createField(DSL.name("MODEL_ID"), SQLDataType.VARCHAR(255), this, "「modelId」- 组所关联的模型identifier，用于描述");

    /**
     * The column <code>ZDB.S_USER.MODEL_KEY</code>. 「modelKey」-
     * 组所关联的模型记录ID，用于描述哪一个Model中的记录
     */
    public final TableField<SUserRecord, String> MODEL_KEY = createField(DSL.name("MODEL_KEY"), SQLDataType.VARCHAR(36), this, "「modelKey」- 组所关联的模型记录ID，用于描述哪一个Model中的记录");

    /**
     * The column <code>ZDB.S_USER.CATEGORY</code>. 「category」- 用户分类
     */
    public final TableField<SUserRecord, String> CATEGORY = createField(DSL.name("CATEGORY"), SQLDataType.VARCHAR(36), this, "「category」- 用户分类");

    /**
     * The column <code>ZDB.S_USER.SIGMA</code>. 「sigma」- 用户绑定的统一标识
     */
    public final TableField<SUserRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 用户绑定的统一标识");

    /**
     * The column <code>ZDB.S_USER.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<SUserRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");

    /**
     * The column <code>ZDB.S_USER.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<SUserRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");

    /**
     * The column <code>ZDB.S_USER.METADATA</code>. 「metadata」- 附加配置数据
     */
    public final TableField<SUserRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置数据");

    /**
     * The column <code>ZDB.S_USER.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<SUserRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");

    /**
     * The column <code>ZDB.S_USER.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<SUserRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");

    /**
     * The column <code>ZDB.S_USER.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<SUserRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");

    /**
     * The column <code>ZDB.S_USER.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<SUserRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private SUser(Name alias, Table<SUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private SUser(Name alias, Table<SUserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.S_USER</code> table reference
     */
    public SUser(String alias) {
        this(DSL.name(alias), S_USER);
    }

    /**
     * Create an aliased <code>ZDB.S_USER</code> table reference
     */
    public SUser(Name alias) {
        this(alias, S_USER);
    }

    /**
     * Create a <code>ZDB.S_USER</code> table reference
     */
    public SUser() {
        this(DSL.name("S_USER"), null);
    }

    public <O extends Record> SUser(Table<O> child, ForeignKey<O, SUserRecord> key) {
        super(child, key, S_USER);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.S_USER_IDX_S_USER_MODEL_KEY, Indexes.S_USER_IDX_S_USER_USERNAME);
    }

    @Override
    public UniqueKey<SUserRecord> getPrimaryKey() {
        return Keys.KEY_S_USER_PRIMARY;
    }

    @Override
    public List<UniqueKey<SUserRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_S_USER_USERNAME);
    }

    @Override
    public SUser as(String alias) {
        return new SUser(DSL.name(alias), this);
    }

    @Override
    public SUser as(Name alias) {
        return new SUser(alias, this);
    }

    @Override
    public SUser as(Table<?> alias) {
        return new SUser(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public SUser rename(String name) {
        return new SUser(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SUser rename(Name name) {
        return new SUser(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public SUser rename(Table<?> name) {
        return new SUser(name.getQualifiedName(), null);
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
