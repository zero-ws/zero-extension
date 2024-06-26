/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.psi.domain.tables;


import io.zerows.extension.commerce.psi.domain.Keys;
import io.zerows.extension.commerce.psi.domain.Zdb;
import io.zerows.extension.commerce.psi.domain.tables.records.PBuyOrderRecord;
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
public class PBuyOrder extends TableImpl<PBuyOrderRecord> {

    /**
     * The reference instance of <code>ZDB.P_BUY_ORDER</code>
     */
    public static final PBuyOrder P_BUY_ORDER = new PBuyOrder();
    private static final long serialVersionUID = 1L;
    /**
     * The column <code>ZDB.P_BUY_ORDER.KEY</code>. 「key」- 采购订单主键
     */
    public final TableField<PBuyOrderRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 采购订单主键");
    /**
     * The column <code>ZDB.P_BUY_ORDER.SERIAL</code>. 「serial」-
     * 采购订单号（系统可用，直接计算）
     */
    public final TableField<PBuyOrderRecord, String> SERIAL = createField(DSL.name("SERIAL"), SQLDataType.VARCHAR(255), this, "「serial」- 采购订单号（系统可用，直接计算）");
    /**
     * The column <code>ZDB.P_BUY_ORDER.TYPE</code>. 「type」- 单据类型
     */
    public final TableField<PBuyOrderRecord, String> TYPE = createField(DSL.name("TYPE"), SQLDataType.VARCHAR(36), this, "「type」- 单据类型");
    /**
     * The column <code>ZDB.P_BUY_ORDER.STATUS</code>. 「status」- 订单状态
     */
    public final TableField<PBuyOrderRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(36), this, "「status」- 订单状态");
    /**
     * The column <code>ZDB.P_BUY_ORDER.WH_ID</code>. 「whId」- 建议入库仓库
     */
    public final TableField<PBuyOrderRecord, String> WH_ID = createField(DSL.name("WH_ID"), SQLDataType.VARCHAR(36), this, "「whId」- 建议入库仓库");
    /**
     * The column <code>ZDB.P_BUY_ORDER.CUSTOMER_ID</code>. 「customerId」- 采购供应商
     */
    public final TableField<PBuyOrderRecord, String> CUSTOMER_ID = createField(DSL.name("CUSTOMER_ID"), SQLDataType.VARCHAR(36), this, "「customerId」- 采购供应商");
    /**
     * The column <code>ZDB.P_BUY_ORDER.PAYED_AT</code>. 「payedAt」- 结算日期
     */
    public final TableField<PBuyOrderRecord, LocalDateTime> PAYED_AT = createField(DSL.name("PAYED_AT"), SQLDataType.LOCALDATETIME(0), this, "「payedAt」- 结算日期");
    /**
     * The column <code>ZDB.P_BUY_ORDER.PAYED_DAY</code>. 「payedDay」- 采购期限
     */
    public final TableField<PBuyOrderRecord, Integer> PAYED_DAY = createField(DSL.name("PAYED_DAY"), SQLDataType.INTEGER, this, "「payedDay」- 采购期限");
    /**
     * The column <code>ZDB.P_BUY_ORDER.OP_AT</code>. 「opAt」- 单据日期
     */
    public final TableField<PBuyOrderRecord, LocalDateTime> OP_AT = createField(DSL.name("OP_AT"), SQLDataType.LOCALDATETIME(0), this, "「opAt」- 单据日期");
    /**
     * The column <code>ZDB.P_BUY_ORDER.OP_BY</code>. 「opBy」- 业务员
     */
    public final TableField<PBuyOrderRecord, String> OP_BY = createField(DSL.name("OP_BY"), SQLDataType.VARCHAR(36), this, "「opBy」- 业务员");
    /**
     * The column <code>ZDB.P_BUY_ORDER.OP_DEPT</code>. 「opDept」- 业务部门
     */
    public final TableField<PBuyOrderRecord, String> OP_DEPT = createField(DSL.name("OP_DEPT"), SQLDataType.VARCHAR(255), this, "「opDept」- 业务部门");
    /**
     * The column <code>ZDB.P_BUY_ORDER.TAGS</code>. 「tags」- 单据标签
     */
    public final TableField<PBuyOrderRecord, String> TAGS = createField(DSL.name("TAGS"), SQLDataType.CLOB, this, "「tags」- 单据标签");
    /**
     * The column <code>ZDB.P_BUY_ORDER.COMMENT</code>. 「comment」- 单据备注
     */
    public final TableField<PBuyOrderRecord, String> COMMENT = createField(DSL.name("COMMENT"), SQLDataType.CLOB, this, "「comment」- 单据备注");
    /**
     * The column <code>ZDB.P_BUY_ORDER.STATUS_SEND</code>. 「statusSend」- 发送状态
     */
    public final TableField<PBuyOrderRecord, String> STATUS_SEND = createField(DSL.name("STATUS_SEND"), SQLDataType.VARCHAR(36), this, "「statusSend」- 发送状态");
    /**
     * The column <code>ZDB.P_BUY_ORDER.REASON</code>. 「reason」- 发送失败原因
     */
    public final TableField<PBuyOrderRecord, String> REASON = createField(DSL.name("REASON"), SQLDataType.CLOB, this, "「reason」- 发送失败原因");
    /**
     * The column <code>ZDB.P_BUY_ORDER.AMOUNT</code>. 「amount」- 订单总额
     */
    public final TableField<PBuyOrderRecord, BigDecimal> AMOUNT = createField(DSL.name("AMOUNT"), SQLDataType.DECIMAL(18, 2), this, "「amount」- 订单总额");
    /**
     * The column <code>ZDB.P_BUY_ORDER.AMOUNT_WAIT</code>. 「amountWait」- 应付余额
     */
    public final TableField<PBuyOrderRecord, BigDecimal> AMOUNT_WAIT = createField(DSL.name("AMOUNT_WAIT"), SQLDataType.DECIMAL(18, 2), this, "「amountWait」- 应付余额");
    /**
     * The column <code>ZDB.P_BUY_ORDER.AMOUNT_DEBT</code>. 「amountDebt」- 上次欠款
     */
    public final TableField<PBuyOrderRecord, BigDecimal> AMOUNT_DEBT = createField(DSL.name("AMOUNT_DEBT"), SQLDataType.DECIMAL(18, 2), this, "「amountDebt」- 上次欠款");
    /**
     * The column <code>ZDB.P_BUY_ORDER.AMOUNT_PLAN</code>. 「amountPlan」- 预计采购费用
     */
    public final TableField<PBuyOrderRecord, BigDecimal> AMOUNT_PLAN = createField(DSL.name("AMOUNT_PLAN"), SQLDataType.DECIMAL(18, 2), this, "「amountPlan」- 预计采购费用");
    /**
     * The column <code>ZDB.P_BUY_ORDER.AMOUNT_YES</code>. 「amountYes」- 成交金额
     */
    public final TableField<PBuyOrderRecord, BigDecimal> AMOUNT_YES = createField(DSL.name("AMOUNT_YES"), SQLDataType.DECIMAL(18, 2), this, "「amountYes」- 成交金额");
    /**
     * The column <code>ZDB.P_BUY_ORDER.DISCOUNT_AMOUNT</code>.
     * 「discountAmount」- 整单折扣额
     */
    public final TableField<PBuyOrderRecord, BigDecimal> DISCOUNT_AMOUNT = createField(DSL.name("DISCOUNT_AMOUNT"), SQLDataType.DECIMAL(18, 2), this, "「discountAmount」- 整单折扣额");
    /**
     * The column <code>ZDB.P_BUY_ORDER.DISCOUNT_RATE</code>. 「discountRate」-
     * 折扣率
     */
    public final TableField<PBuyOrderRecord, BigDecimal> DISCOUNT_RATE = createField(DSL.name("DISCOUNT_RATE"), SQLDataType.DECIMAL(10, 2), this, "「discountRate」- 折扣率");
    /**
     * The column <code>ZDB.P_BUY_ORDER.DISCOUNT</code>. 「discount」- 定向折扣
     */
    public final TableField<PBuyOrderRecord, Boolean> DISCOUNT = createField(DSL.name("DISCOUNT"), SQLDataType.BIT, this, "「discount」- 定向折扣");
    /**
     * The column <code>ZDB.P_BUY_ORDER.APPROVED_BY</code>. 「approvedBy」- 审核人
     */
    public final TableField<PBuyOrderRecord, String> APPROVED_BY = createField(DSL.name("APPROVED_BY"), SQLDataType.VARCHAR(36), this, "「approvedBy」- 审核人");
    /**
     * The column <code>ZDB.P_BUY_ORDER.APPROVED_AT</code>. 「approvedAt」- 审核时间
     */
    public final TableField<PBuyOrderRecord, LocalDateTime> APPROVED_AT = createField(DSL.name("APPROVED_AT"), SQLDataType.LOCALDATETIME(0), this, "「approvedAt」- 审核时间");
    /**
     * The column <code>ZDB.P_BUY_ORDER.TO_ID</code>. 「toId」- 收货地址ID
     */
    public final TableField<PBuyOrderRecord, String> TO_ID = createField(DSL.name("TO_ID"), SQLDataType.VARCHAR(36), this, "「toId」- 收货地址ID");
    /**
     * The column <code>ZDB.P_BUY_ORDER.TO_ADDRESS</code>. 「toAddress」- 收货地址
     */
    public final TableField<PBuyOrderRecord, String> TO_ADDRESS = createField(DSL.name("TO_ADDRESS"), SQLDataType.CLOB, this, "「toAddress」- 收货地址");
    /**
     * The column <code>ZDB.P_BUY_ORDER.FROM_ID</code>. 「fromId」- 发货地址ID
     */
    public final TableField<PBuyOrderRecord, String> FROM_ID = createField(DSL.name("FROM_ID"), SQLDataType.VARCHAR(36), this, "「fromId」- 发货地址ID");
    /**
     * The column <code>ZDB.P_BUY_ORDER.FROM_ADDRESS</code>. 「fromAddress」- 发货地址
     */
    public final TableField<PBuyOrderRecord, String> FROM_ADDRESS = createField(DSL.name("FROM_ADDRESS"), SQLDataType.CLOB, this, "「fromAddress」- 发货地址");
    /**
     * The column <code>ZDB.P_BUY_ORDER.CURRENCY_ID</code>. 「currencyId」- 币种
     */
    public final TableField<PBuyOrderRecord, String> CURRENCY_ID = createField(DSL.name("CURRENCY_ID"), SQLDataType.VARCHAR(36), this, "「currencyId」- 币种");
    /**
     * The column <code>ZDB.P_BUY_ORDER.COMPANY_ID</code>. 「companyId」- 所属公司
     */
    public final TableField<PBuyOrderRecord, String> COMPANY_ID = createField(DSL.name("COMPANY_ID"), SQLDataType.VARCHAR(36), this, "「companyId」- 所属公司");
    /**
     * The column <code>ZDB.P_BUY_ORDER.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<PBuyOrderRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>ZDB.P_BUY_ORDER.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<PBuyOrderRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");
    /**
     * The column <code>ZDB.P_BUY_ORDER.METADATA</code>. 「metadata」- 附加配置
     */
    public final TableField<PBuyOrderRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置");
    /**
     * The column <code>ZDB.P_BUY_ORDER.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<PBuyOrderRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(8), this, "「language」- 使用的语言");
    /**
     * The column <code>ZDB.P_BUY_ORDER.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<PBuyOrderRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");
    /**
     * The column <code>ZDB.P_BUY_ORDER.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<PBuyOrderRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");
    /**
     * The column <code>ZDB.P_BUY_ORDER.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<PBuyOrderRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");
    /**
     * The column <code>ZDB.P_BUY_ORDER.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<PBuyOrderRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private PBuyOrder(Name alias, Table<PBuyOrderRecord> aliased) {
        this(alias, aliased, null);
    }

    private PBuyOrder(Name alias, Table<PBuyOrderRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.P_BUY_ORDER</code> table reference
     */
    public PBuyOrder(String alias) {
        this(DSL.name(alias), P_BUY_ORDER);
    }

    /**
     * Create an aliased <code>ZDB.P_BUY_ORDER</code> table reference
     */
    public PBuyOrder(Name alias) {
        this(alias, P_BUY_ORDER);
    }

    /**
     * Create a <code>ZDB.P_BUY_ORDER</code> table reference
     */
    public PBuyOrder() {
        this(DSL.name("P_BUY_ORDER"), null);
    }

    public <O extends Record> PBuyOrder(Table<O> child, ForeignKey<O, PBuyOrderRecord> key) {
        super(child, key, P_BUY_ORDER);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PBuyOrderRecord> getRecordType() {
        return PBuyOrderRecord.class;
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public UniqueKey<PBuyOrderRecord> getPrimaryKey() {
        return Keys.KEY_P_BUY_ORDER_PRIMARY;
    }

    @Override
    public List<UniqueKey<PBuyOrderRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_P_BUY_ORDER_SERIAL);
    }

    @Override
    public PBuyOrder as(String alias) {
        return new PBuyOrder(DSL.name(alias), this);
    }

    @Override
    public PBuyOrder as(Name alias) {
        return new PBuyOrder(alias, this);
    }

    @Override
    public PBuyOrder as(Table<?> alias) {
        return new PBuyOrder(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PBuyOrder rename(String name) {
        return new PBuyOrder(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PBuyOrder rename(Name name) {
        return new PBuyOrder(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PBuyOrder rename(Table<?> name) {
        return new PBuyOrder(name.getQualifiedName(), null);
    }
}
