/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.lbs.domain.tables;


import cn.vertxup.lbs.domain.Keys;
import cn.vertxup.lbs.domain.Zdb;
import cn.vertxup.lbs.domain.tables.records.LCountryRecord;

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
public class LCountry extends TableImpl<LCountryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ZDB.L_COUNTRY</code>
     */
    public static final LCountry L_COUNTRY = new LCountry();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LCountryRecord> getRecordType() {
        return LCountryRecord.class;
    }

    /**
     * The column <code>ZDB.L_COUNTRY.KEY</code>. 「key」- 国家主键
     */
    public final TableField<LCountryRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 国家主键");

    /**
     * The column <code>ZDB.L_COUNTRY.NAME</code>. 「name」- 国家名称
     */
    public final TableField<LCountryRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(32).nullable(false), this, "「name」- 国家名称");

    /**
     * The column <code>ZDB.L_COUNTRY.CODE</code>. 「code」- 国家编号
     */
    public final TableField<LCountryRecord, String> CODE = createField(DSL.name("CODE"), SQLDataType.VARCHAR(36), this, "「code」- 国家编号");

    /**
     * The column <code>ZDB.L_COUNTRY.FLAG</code>. 「flag」- 国旗
     */
    public final TableField<LCountryRecord, String> FLAG = createField(DSL.name("FLAG"), SQLDataType.VARCHAR(8).nullable(false), this, "「flag」- 国旗");

    /**
     * The column <code>ZDB.L_COUNTRY.PHONE_PREFIX</code>. 「phonePrefix」- 电话前缀
     */
    public final TableField<LCountryRecord, String> PHONE_PREFIX = createField(DSL.name("PHONE_PREFIX"), SQLDataType.VARCHAR(8).nullable(false), this, "「phonePrefix」- 电话前缀");

    /**
     * The column <code>ZDB.L_COUNTRY.CURRENCY</code>. 「currency」- 使用货币
     */
    public final TableField<LCountryRecord, String> CURRENCY = createField(DSL.name("CURRENCY"), SQLDataType.VARCHAR(36), this, "「currency」- 使用货币");

    /**
     * The column <code>ZDB.L_COUNTRY.METADATA</code>. 「metadata」- 附加配置
     */
    public final TableField<LCountryRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置");

    /**
     * The column <code>ZDB.L_COUNTRY.ORDER</code>. 「order」- 排序
     */
    public final TableField<LCountryRecord, Integer> ORDER = createField(DSL.name("ORDER"), SQLDataType.INTEGER, this, "「order」- 排序");

    /**
     * The column <code>ZDB.L_COUNTRY.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<LCountryRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");

    /**
     * The column <code>ZDB.L_COUNTRY.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<LCountryRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");

    /**
     * The column <code>ZDB.L_COUNTRY.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<LCountryRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(8), this, "「language」- 使用的语言");

    /**
     * The column <code>ZDB.L_COUNTRY.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<LCountryRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");

    /**
     * The column <code>ZDB.L_COUNTRY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<LCountryRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");

    /**
     * The column <code>ZDB.L_COUNTRY.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<LCountryRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");

    /**
     * The column <code>ZDB.L_COUNTRY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<LCountryRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private LCountry(Name alias, Table<LCountryRecord> aliased) {
        this(alias, aliased, null);
    }

    private LCountry(Name alias, Table<LCountryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.L_COUNTRY</code> table reference
     */
    public LCountry(String alias) {
        this(DSL.name(alias), L_COUNTRY);
    }

    /**
     * Create an aliased <code>ZDB.L_COUNTRY</code> table reference
     */
    public LCountry(Name alias) {
        this(alias, L_COUNTRY);
    }

    /**
     * Create a <code>ZDB.L_COUNTRY</code> table reference
     */
    public LCountry() {
        this(DSL.name("L_COUNTRY"), null);
    }

    public <O extends Record> LCountry(Table<O> child, ForeignKey<O, LCountryRecord> key) {
        super(child, key, L_COUNTRY);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public UniqueKey<LCountryRecord> getPrimaryKey() {
        return Keys.KEY_L_COUNTRY_PRIMARY;
    }

    @Override
    public List<UniqueKey<LCountryRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_L_COUNTRY_CODE, Keys.KEY_L_COUNTRY_PHONE_PREFIX);
    }

    @Override
    public LCountry as(String alias) {
        return new LCountry(DSL.name(alias), this);
    }

    @Override
    public LCountry as(Name alias) {
        return new LCountry(alias, this);
    }

    @Override
    public LCountry as(Table<?> alias) {
        return new LCountry(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public LCountry rename(String name) {
        return new LCountry(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LCountry rename(Name name) {
        return new LCountry(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public LCountry rename(Table<?> name) {
        return new LCountry(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row15 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row15<String, String, String, String, String, String, String, Integer, Boolean, String, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function15<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Integer, ? super Boolean, ? super String, ? super String, ? super LocalDateTime, ? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function15<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Integer, ? super Boolean, ? super String, ? super String, ? super LocalDateTime, ? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
