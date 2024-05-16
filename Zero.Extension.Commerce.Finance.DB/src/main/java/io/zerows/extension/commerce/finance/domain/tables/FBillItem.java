/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.finance.domain.tables;


import io.zerows.extension.commerce.finance.domain.Indexes;
import io.zerows.extension.commerce.finance.domain.Keys;
import io.zerows.extension.commerce.finance.domain.Zdb;
import io.zerows.extension.commerce.finance.domain.tables.records.FBillItemRecord;
import org.jooq.Record;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class FBillItem extends TableImpl<FBillItemRecord> {

    /**
     * The reference instance of <code>ZDB.F_BILL_ITEM</code>
     */
    public static final FBillItem F_BILL_ITEM = new FBillItem();
    private static final long serialVersionUID = 1L;
    /**
     * The column <code>ZDB.F_BILL_ITEM.KEY</code>. 「key」- 账单明细主键
     */
    public final TableField<FBillItemRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 账单明细主键");
    /**
     * The column <code>ZDB.F_BILL_ITEM.NAME</code>. 「name」 -  明细名称
     */
    public final TableField<FBillItemRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(255).nullable(false), this, "「name」 -  明细名称");
    /**
     * The column <code>ZDB.F_BILL_ITEM.CODE</code>. 「code」 - 明细系统代码
     */
    public final TableField<FBillItemRecord, String> CODE = createField(DSL.name("CODE"), SQLDataType.VARCHAR(255).nullable(false), this, "「code」 - 明细系统代码");
    /**
     * The column <code>ZDB.F_BILL_ITEM.SERIAL</code>. 「serial」 - 明细编号
     */
    public final TableField<FBillItemRecord, String> SERIAL = createField(DSL.name("SERIAL"), SQLDataType.VARCHAR(255).nullable(false), this, "「serial」 - 明细编号");
    /**
     * The column <code>ZDB.F_BILL_ITEM.INCOME</code>. 「income」- true =
     * 消费类，false = 付款类
     */
    public final TableField<FBillItemRecord, Boolean> INCOME = createField(DSL.name("INCOME"), SQLDataType.BIT, this, "「income」- true = 消费类，false = 付款类");
    /**
     * The column <code>ZDB.F_BILL_ITEM.TYPE</code>. 「type」- 明细类型
     */
    public final TableField<FBillItemRecord, String> TYPE = createField(DSL.name("TYPE"), SQLDataType.VARCHAR(36).nullable(false), this, "「type」- 明细类型");
    /**
     * The column <code>ZDB.F_BILL_ITEM.STATUS</code>. 「status」- 明细状态
     */
    public final TableField<FBillItemRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(36).nullable(false), this, "「status」- 明细状态");
    /**
     * The column <code>ZDB.F_BILL_ITEM.AMOUNT</code>.
     * 「amount」——价税合计，实际付款结果，有可能父项
     */
    public final TableField<FBillItemRecord, BigDecimal> AMOUNT = createField(DSL.name("AMOUNT"), SQLDataType.DECIMAL(18, 2), this, "「amount」——价税合计，实际付款结果，有可能父项");
    /**
     * The column <code>ZDB.F_BILL_ITEM.COMMENT</code>. 「comment」 - 明细备注
     */
    public final TableField<FBillItemRecord, String> COMMENT = createField(DSL.name("COMMENT"), SQLDataType.CLOB, this, "「comment」 - 明细备注");
    /**
     * The column <code>ZDB.F_BILL_ITEM.MANUAL_NO</code>. 「manualNo」 -
     * 手工单号（线下单号专用）
     */
    public final TableField<FBillItemRecord, String> MANUAL_NO = createField(DSL.name("MANUAL_NO"), SQLDataType.VARCHAR(255), this, "「manualNo」 - 手工单号（线下单号专用）");
    /**
     * The column <code>ZDB.F_BILL_ITEM.UNIT</code>. 「unit」- 计量单位
     */
    public final TableField<FBillItemRecord, String> UNIT = createField(DSL.name("UNIT"), SQLDataType.VARCHAR(36), this, "「unit」- 计量单位");
    /**
     * The column <code>ZDB.F_BILL_ITEM.PRICE</code>. 「price」- 商品单价
     */
    public final TableField<FBillItemRecord, BigDecimal> PRICE = createField(DSL.name("PRICE"), SQLDataType.DECIMAL(18, 2).nullable(false), this, "「price」- 商品单价");
    /**
     * The column <code>ZDB.F_BILL_ITEM.QUANTITY</code>. 「quantity」- 商品数量
     */
    public final TableField<FBillItemRecord, Integer> QUANTITY = createField(DSL.name("QUANTITY"), SQLDataType.INTEGER.nullable(false), this, "「quantity」- 商品数量");
    /**
     * The column <code>ZDB.F_BILL_ITEM.AMOUNT_TOTAL</code>.
     * 「amountTotal」——总价，理论计算结果
     */
    public final TableField<FBillItemRecord, BigDecimal> AMOUNT_TOTAL = createField(DSL.name("AMOUNT_TOTAL"), SQLDataType.DECIMAL(18, 2).nullable(false), this, "「amountTotal」——总价，理论计算结果");
    /**
     * The column <code>ZDB.F_BILL_ITEM.OP_BY</code>. 「opBy」- 操作人员，关联员工ID
     */
    public final TableField<FBillItemRecord, String> OP_BY = createField(DSL.name("OP_BY"), SQLDataType.VARCHAR(36), this, "「opBy」- 操作人员，关联员工ID");
    /**
     * The column <code>ZDB.F_BILL_ITEM.OP_NUMBER</code>. 「opNumber」- 操作人员工号
     */
    public final TableField<FBillItemRecord, String> OP_NUMBER = createField(DSL.name("OP_NUMBER"), SQLDataType.VARCHAR(36), this, "「opNumber」- 操作人员工号");
    /**
     * The column <code>ZDB.F_BILL_ITEM.OP_SHIFT</code>. 「opShift」- 操作班次（对接排班系统）
     */
    public final TableField<FBillItemRecord, String> OP_SHIFT = createField(DSL.name("OP_SHIFT"), SQLDataType.VARCHAR(128), this, "「opShift」- 操作班次（对接排班系统）");
    /**
     * The column <code>ZDB.F_BILL_ITEM.OP_AT</code>. 「opAt」- 操作时间
     */
    public final TableField<FBillItemRecord, LocalDateTime> OP_AT = createField(DSL.name("OP_AT"), SQLDataType.LOCALDATETIME(0), this, "「opAt」- 操作时间");
    /**
     * The column <code>ZDB.F_BILL_ITEM.RELATED_ID</code>. 「relatedId」-
     * 关联ID（保留，原系统存在）
     */
    public final TableField<FBillItemRecord, String> RELATED_ID = createField(DSL.name("RELATED_ID"), SQLDataType.VARCHAR(36), this, "「relatedId」- 关联ID（保留，原系统存在）");
    /**
     * The column <code>ZDB.F_BILL_ITEM.SETTLEMENT_ID</code>. 「settlementId」-
     * 结算单ID，该字段有值标识已经结算
     */
    public final TableField<FBillItemRecord, String> SETTLEMENT_ID = createField(DSL.name("SETTLEMENT_ID"), SQLDataType.VARCHAR(36), this, "「settlementId」- 结算单ID，该字段有值标识已经结算");
    /**
     * The column <code>ZDB.F_BILL_ITEM.BILL_ID</code>. 「billId」- 所属账单ID
     */
    public final TableField<FBillItemRecord, String> BILL_ID = createField(DSL.name("BILL_ID"), SQLDataType.VARCHAR(36).nullable(false), this, "「billId」- 所属账单ID");
    /**
     * The column <code>ZDB.F_BILL_ITEM.SUBJECT_ID</code>. 「subjectId」-
     * 会计科目ID，依赖账单项选择结果
     */
    public final TableField<FBillItemRecord, String> SUBJECT_ID = createField(DSL.name("SUBJECT_ID"), SQLDataType.VARCHAR(36), this, "「subjectId」- 会计科目ID，依赖账单项选择结果");
    /**
     * The column <code>ZDB.F_BILL_ITEM.PAY_TERM_ID</code>. 「payTermId」- 账单项ID
     */
    public final TableField<FBillItemRecord, String> PAY_TERM_ID = createField(DSL.name("PAY_TERM_ID"), SQLDataType.VARCHAR(36).nullable(false), this, "「payTermId」- 账单项ID");
    /**
     * The column <code>ZDB.F_BILL_ITEM.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<FBillItemRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");
    /**
     * The column <code>ZDB.F_BILL_ITEM.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<FBillItemRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");
    /**
     * The column <code>ZDB.F_BILL_ITEM.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<FBillItemRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>ZDB.F_BILL_ITEM.METADATA</code>. 「metadata」- 附加配置数据
     */
    public final TableField<FBillItemRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置数据");
    /**
     * The column <code>ZDB.F_BILL_ITEM.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<FBillItemRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");
    /**
     * The column <code>ZDB.F_BILL_ITEM.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<FBillItemRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");
    /**
     * The column <code>ZDB.F_BILL_ITEM.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<FBillItemRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");
    /**
     * The column <code>ZDB.F_BILL_ITEM.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<FBillItemRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private FBillItem(Name alias, Table<FBillItemRecord> aliased) {
        this(alias, aliased, null);
    }

    private FBillItem(Name alias, Table<FBillItemRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.F_BILL_ITEM</code> table reference
     */
    public FBillItem(String alias) {
        this(DSL.name(alias), F_BILL_ITEM);
    }

    /**
     * Create an aliased <code>ZDB.F_BILL_ITEM</code> table reference
     */
    public FBillItem(Name alias) {
        this(alias, F_BILL_ITEM);
    }

    /**
     * Create a <code>ZDB.F_BILL_ITEM</code> table reference
     */
    public FBillItem() {
        this(DSL.name("F_BILL_ITEM"), null);
    }

    public <O extends Record> FBillItem(Table<O> child, ForeignKey<O, FBillItemRecord> key) {
        super(child, key, F_BILL_ITEM);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FBillItemRecord> getRecordType() {
        return FBillItemRecord.class;
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.F_BILL_ITEM_IDX_F_BILL_ITEM_BILL_ID, Indexes.F_BILL_ITEM_IDX_F_BILL_ITEM_SETTLEMENT_ID);
    }

    @Override
    public UniqueKey<FBillItemRecord> getPrimaryKey() {
        return Keys.KEY_F_BILL_ITEM_PRIMARY;
    }

    @Override
    public List<UniqueKey<FBillItemRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_F_BILL_ITEM_CODE, Keys.KEY_F_BILL_ITEM_SERIAL);
    }

    @Override
    public FBillItem as(String alias) {
        return new FBillItem(DSL.name(alias), this);
    }

    @Override
    public FBillItem as(Name alias) {
        return new FBillItem(alias, this);
    }

    @Override
    public FBillItem as(Table<?> alias) {
        return new FBillItem(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public FBillItem rename(String name) {
        return new FBillItem(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FBillItem rename(Name name) {
        return new FBillItem(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public FBillItem rename(Table<?> name) {
        return new FBillItem(name.getQualifiedName(), null);
    }
}