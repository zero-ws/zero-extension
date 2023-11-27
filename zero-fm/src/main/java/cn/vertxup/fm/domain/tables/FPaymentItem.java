/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.fm.domain.tables;


import cn.vertxup.fm.domain.Indexes;
import cn.vertxup.fm.domain.Keys;
import cn.vertxup.fm.domain.Zdb;
import cn.vertxup.fm.domain.tables.records.FPaymentItemRecord;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function21;
import org.jooq.Index;
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
public class FPaymentItem extends TableImpl<FPaymentItemRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ZDB.F_PAYMENT_ITEM</code>
     */
    public static final FPaymentItem F_PAYMENT_ITEM = new FPaymentItem();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FPaymentItemRecord> getRecordType() {
        return FPaymentItemRecord.class;
    }

    /**
     * The column <code>ZDB.F_PAYMENT_ITEM.KEY</code>. 「key」- 收款明细账单主键ID
     */
    public final TableField<FPaymentItemRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 收款明细账单主键ID");

    /**
     * The column <code>ZDB.F_PAYMENT_ITEM.NAME</code>. 「name」 - 收款明细单标题
     */
    public final TableField<FPaymentItemRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(255), this, "「name」 - 收款明细单标题");

    /**
     * The column <code>ZDB.F_PAYMENT_ITEM.CODE</code>. 「code」 - 收款明细单编号
     */
    public final TableField<FPaymentItemRecord, String> CODE = createField(DSL.name("CODE"), SQLDataType.VARCHAR(255).nullable(false), this, "「code」 - 收款明细单编号");

    /**
     * The column <code>ZDB.F_PAYMENT_ITEM.SERIAL</code>. 「serial」 - 收款明细单据号
     */
    public final TableField<FPaymentItemRecord, String> SERIAL = createField(DSL.name("SERIAL"), SQLDataType.VARCHAR(36).nullable(false), this, "「serial」 - 收款明细单据号");

    /**
     * The column <code>ZDB.F_PAYMENT_ITEM.AMOUNT</code>.
     * 「amount」——价税合计，所有明细对应的实际结算金额
     */
    public final TableField<FPaymentItemRecord, BigDecimal> AMOUNT = createField(DSL.name("AMOUNT"), SQLDataType.DECIMAL(18, 2).nullable(false), this, "「amount」——价税合计，所有明细对应的实际结算金额");

    /**
     * The column <code>ZDB.F_PAYMENT_ITEM.AMOUNT_PRE</code>. 「amountPre」预付金额
     */
    public final TableField<FPaymentItemRecord, BigDecimal> AMOUNT_PRE = createField(DSL.name("AMOUNT_PRE"), SQLDataType.DECIMAL(18, 2), this, "「amountPre」预付金额");

    /**
     * The column <code>ZDB.F_PAYMENT_ITEM.OBJECT_ID</code>. 「objectId」付款对象ID
     */
    public final TableField<FPaymentItemRecord, String> OBJECT_ID = createField(DSL.name("OBJECT_ID"), SQLDataType.VARCHAR(36), this, "「objectId」付款对象ID");

    /**
     * The column <code>ZDB.F_PAYMENT_ITEM.OBJECT_TYPE</code>.
     * 「objectType」付款对象类型
     */
    public final TableField<FPaymentItemRecord, String> OBJECT_TYPE = createField(DSL.name("OBJECT_TYPE"), SQLDataType.VARCHAR(128), this, "「objectType」付款对象类型");

    /**
     * The column <code>ZDB.F_PAYMENT_ITEM.PAYMENT_ID</code>. 「paymentId」收款单ID
     */
    public final TableField<FPaymentItemRecord, String> PAYMENT_ID = createField(DSL.name("PAYMENT_ID"), SQLDataType.VARCHAR(36), this, "「paymentId」收款单ID");

    /**
     * The column <code>ZDB.F_PAYMENT_ITEM.PAY_NAME</code>. 「payName」打款人姓名
     */
    public final TableField<FPaymentItemRecord, String> PAY_NAME = createField(DSL.name("PAY_NAME"), SQLDataType.VARCHAR(128), this, "「payName」打款人姓名");

    /**
     * The column <code>ZDB.F_PAYMENT_ITEM.PAY_MOBILE</code>. 「payMobile」打款人电话
     */
    public final TableField<FPaymentItemRecord, String> PAY_MOBILE = createField(DSL.name("PAY_MOBILE"), SQLDataType.VARCHAR(128), this, "「payMobile」打款人电话");

    /**
     * The column <code>ZDB.F_PAYMENT_ITEM.PAY_METHOD</code>. 「payMethod」付款方式
     */
    public final TableField<FPaymentItemRecord, String> PAY_METHOD = createField(DSL.name("PAY_METHOD"), SQLDataType.VARCHAR(255), this, "「payMethod」付款方式");

    /**
     * The column <code>ZDB.F_PAYMENT_ITEM.PAY_ID</code>. 「payId」付款账号
     */
    public final TableField<FPaymentItemRecord, String> PAY_ID = createField(DSL.name("PAY_ID"), SQLDataType.VARCHAR(255), this, "「payId」付款账号");

    /**
     * The column <code>ZDB.F_PAYMENT_ITEM.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<FPaymentItemRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");

    /**
     * The column <code>ZDB.F_PAYMENT_ITEM.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<FPaymentItemRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");

    /**
     * The column <code>ZDB.F_PAYMENT_ITEM.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<FPaymentItemRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");

    /**
     * The column <code>ZDB.F_PAYMENT_ITEM.METADATA</code>. 「metadata」- 附加配置数据
     */
    public final TableField<FPaymentItemRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置数据");

    /**
     * The column <code>ZDB.F_PAYMENT_ITEM.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<FPaymentItemRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");

    /**
     * The column <code>ZDB.F_PAYMENT_ITEM.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<FPaymentItemRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");

    /**
     * The column <code>ZDB.F_PAYMENT_ITEM.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<FPaymentItemRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");

    /**
     * The column <code>ZDB.F_PAYMENT_ITEM.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<FPaymentItemRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private FPaymentItem(Name alias, Table<FPaymentItemRecord> aliased) {
        this(alias, aliased, null);
    }

    private FPaymentItem(Name alias, Table<FPaymentItemRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.F_PAYMENT_ITEM</code> table reference
     */
    public FPaymentItem(String alias) {
        this(DSL.name(alias), F_PAYMENT_ITEM);
    }

    /**
     * Create an aliased <code>ZDB.F_PAYMENT_ITEM</code> table reference
     */
    public FPaymentItem(Name alias) {
        this(alias, F_PAYMENT_ITEM);
    }

    /**
     * Create a <code>ZDB.F_PAYMENT_ITEM</code> table reference
     */
    public FPaymentItem() {
        this(DSL.name("F_PAYMENT_ITEM"), null);
    }

    public <O extends Record> FPaymentItem(Table<O> child, ForeignKey<O, FPaymentItemRecord> key) {
        super(child, key, F_PAYMENT_ITEM);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.F_PAYMENT_ITEM_IDX_F_PAYMENT_ITEM_PAYMENT_ID, Indexes.F_PAYMENT_ITEM_IDX_F_PAYMENT_ITEM_SETTLEMENT_ID);
    }

    @Override
    public UniqueKey<FPaymentItemRecord> getPrimaryKey() {
        return Keys.KEY_F_PAYMENT_ITEM_PRIMARY;
    }

    @Override
    public List<UniqueKey<FPaymentItemRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_F_PAYMENT_ITEM_CODE, Keys.KEY_F_PAYMENT_ITEM_SERIAL);
    }

    @Override
    public FPaymentItem as(String alias) {
        return new FPaymentItem(DSL.name(alias), this);
    }

    @Override
    public FPaymentItem as(Name alias) {
        return new FPaymentItem(alias, this);
    }

    @Override
    public FPaymentItem as(Table<?> alias) {
        return new FPaymentItem(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public FPaymentItem rename(String name) {
        return new FPaymentItem(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FPaymentItem rename(Name name) {
        return new FPaymentItem(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public FPaymentItem rename(Table<?> name) {
        return new FPaymentItem(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row21 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row21<String, String, String, String, BigDecimal, BigDecimal, String, String, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function21<? super String, ? super String, ? super String, ? super String, ? super BigDecimal, ? super BigDecimal, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super LocalDateTime, ? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function21<? super String, ? super String, ? super String, ? super String, ? super BigDecimal, ? super BigDecimal, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super LocalDateTime, ? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
