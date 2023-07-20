/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.fm.domain.tables;


import cn.vertxup.fm.domain.Keys;
import cn.vertxup.fm.domain.Zdb;
import cn.vertxup.fm.domain.tables.records.FDebtRecord;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function20;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row20;
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
public class FDebt extends TableImpl<FDebtRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ZDB.F_DEBT</code>
     */
    public static final FDebt F_DEBT = new FDebt();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FDebtRecord> getRecordType() {
        return FDebtRecord.class;
    }

    /**
     * The column <code>ZDB.F_DEBT.KEY</code>. 「key」- 应收账单主键ID
     */
    public final TableField<FDebtRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 应收账单主键ID");

    /**
     * The column <code>ZDB.F_DEBT.NAME</code>. 「name」 - 应收单标题
     */
    public final TableField<FDebtRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(255), this, "「name」 - 应收单标题");

    /**
     * The column <code>ZDB.F_DEBT.CODE</code>. 「code」 - 应收单编号
     */
    public final TableField<FDebtRecord, String> CODE = createField(DSL.name("CODE"), SQLDataType.VARCHAR(255).nullable(false), this, "「code」 - 应收单编号");

    /**
     * The column <code>ZDB.F_DEBT.SERIAL</code>. 「serial」 - 应收单据号
     */
    public final TableField<FDebtRecord, String> SERIAL = createField(DSL.name("SERIAL"), SQLDataType.VARCHAR(36).nullable(false), this, "「serial」 - 应收单据号");

    /**
     * The column <code>ZDB.F_DEBT.AMOUNT</code>. 「amount」——价税合计，所有明细对应的实际结算金额
     */
    public final TableField<FDebtRecord, BigDecimal> AMOUNT = createField(DSL.name("AMOUNT"), SQLDataType.DECIMAL(18, 2).nullable(false), this, "「amount」——价税合计，所有明细对应的实际结算金额");

    /**
     * The column <code>ZDB.F_DEBT.SIGN_NAME</code>. 「signName」签单人姓名
     */
    public final TableField<FDebtRecord, String> SIGN_NAME = createField(DSL.name("SIGN_NAME"), SQLDataType.VARCHAR(128), this, "「signName」签单人姓名");

    /**
     * The column <code>ZDB.F_DEBT.SIGN_MOBILE</code>. 「signMobile」签单人电话
     */
    public final TableField<FDebtRecord, String> SIGN_MOBILE = createField(DSL.name("SIGN_MOBILE"), SQLDataType.VARCHAR(128), this, "「signMobile」签单人电话");

    /**
     * The column <code>ZDB.F_DEBT.FINISHED</code>. 「finished」- 是否完成
     */
    public final TableField<FDebtRecord, Boolean> FINISHED = createField(DSL.name("FINISHED"), SQLDataType.BIT, this, "「finished」- 是否完成");

    /**
     * The column <code>ZDB.F_DEBT.FINISHED_AT</code>. 「createdAt」- 完成时间
     */
    public final TableField<FDebtRecord, LocalDateTime> FINISHED_AT = createField(DSL.name("FINISHED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 完成时间");

    /**
     * The column <code>ZDB.F_DEBT.COMMENT</code>. 「comment」 - 备注
     */
    public final TableField<FDebtRecord, String> COMMENT = createField(DSL.name("COMMENT"), SQLDataType.CLOB, this, "「comment」 - 备注");

    /**
     * The column <code>ZDB.F_DEBT.CUSTOMER_ID</code>. 「customerId」结算对象（单位ID）
     */
    public final TableField<FDebtRecord, String> CUSTOMER_ID = createField(DSL.name("CUSTOMER_ID"), SQLDataType.VARCHAR(36), this, "「customerId」结算对象（单位ID）");

    /**
     * The column <code>ZDB.F_DEBT.SETTLEMENT_ID</code>. 「settlementId」-
     * 结算单ID，该字段有值标识已经结算
     */
    public final TableField<FDebtRecord, String> SETTLEMENT_ID = createField(DSL.name("SETTLEMENT_ID"), SQLDataType.VARCHAR(36), this, "「settlementId」- 结算单ID，该字段有值标识已经结算");

    /**
     * The column <code>ZDB.F_DEBT.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<FDebtRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");

    /**
     * The column <code>ZDB.F_DEBT.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<FDebtRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");

    /**
     * The column <code>ZDB.F_DEBT.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<FDebtRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");

    /**
     * The column <code>ZDB.F_DEBT.METADATA</code>. 「metadata」- 附加配置数据
     */
    public final TableField<FDebtRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置数据");

    /**
     * The column <code>ZDB.F_DEBT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<FDebtRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");

    /**
     * The column <code>ZDB.F_DEBT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<FDebtRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");

    /**
     * The column <code>ZDB.F_DEBT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<FDebtRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");

    /**
     * The column <code>ZDB.F_DEBT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<FDebtRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private FDebt(Name alias, Table<FDebtRecord> aliased) {
        this(alias, aliased, null);
    }

    private FDebt(Name alias, Table<FDebtRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.F_DEBT</code> table reference
     */
    public FDebt(String alias) {
        this(DSL.name(alias), F_DEBT);
    }

    /**
     * Create an aliased <code>ZDB.F_DEBT</code> table reference
     */
    public FDebt(Name alias) {
        this(alias, F_DEBT);
    }

    /**
     * Create a <code>ZDB.F_DEBT</code> table reference
     */
    public FDebt() {
        this(DSL.name("F_DEBT"), null);
    }

    public <O extends Record> FDebt(Table<O> child, ForeignKey<O, FDebtRecord> key) {
        super(child, key, F_DEBT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public UniqueKey<FDebtRecord> getPrimaryKey() {
        return Keys.KEY_F_DEBT_PRIMARY;
    }

    @Override
    public List<UniqueKey<FDebtRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_F_DEBT_CODE, Keys.KEY_F_DEBT_SERIAL, Keys.KEY_F_DEBT_SETTLEMENT_ID, Keys.KEY_F_DEBT_SETTLEMENT_ID_2);
    }

    @Override
    public FDebt as(String alias) {
        return new FDebt(DSL.name(alias), this);
    }

    @Override
    public FDebt as(Name alias) {
        return new FDebt(alias, this);
    }

    @Override
    public FDebt as(Table<?> alias) {
        return new FDebt(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public FDebt rename(String name) {
        return new FDebt(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FDebt rename(Name name) {
        return new FDebt(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public FDebt rename(Table<?> name) {
        return new FDebt(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row20 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row20<String, String, String, String, BigDecimal, String, String, Boolean, LocalDateTime, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row20) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function20<? super String, ? super String, ? super String, ? super String, ? super BigDecimal, ? super String, ? super String, ? super Boolean, ? super LocalDateTime, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super LocalDateTime, ? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function20<? super String, ? super String, ? super String, ? super String, ? super BigDecimal, ? super String, ? super String, ? super Boolean, ? super LocalDateTime, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super LocalDateTime, ? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
