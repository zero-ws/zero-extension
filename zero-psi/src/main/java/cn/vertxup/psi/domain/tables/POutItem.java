/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.psi.domain.tables;


import cn.vertxup.psi.domain.Db;
import cn.vertxup.psi.domain.Keys;
import cn.vertxup.psi.domain.tables.records.POutItemRecord;
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
public class POutItem extends TableImpl<POutItemRecord> {

    /**
     * The reference instance of <code>DB_ETERNAL.P_OUT_ITEM</code>
     */
    public static final POutItem P_OUT_ITEM = new POutItem();
    private static final long serialVersionUID = 1L;
    /**
     * The column <code>DB_ETERNAL.P_OUT_ITEM.KEY</code>. 「key」- 出库明细主键
     */
    public final TableField<POutItemRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 出库明细主键");
    /**
     * The column <code>DB_ETERNAL.P_OUT_ITEM.SERIAL</code>. 「serial」-
     * 出库明细号（系统可用，直接计算）
     */
    public final TableField<POutItemRecord, String> SERIAL = createField(DSL.name("SERIAL"), SQLDataType.VARCHAR(255), this, "「serial」- 出库明细号（系统可用，直接计算）");
    /**
     * The column <code>DB_ETERNAL.P_OUT_ITEM.STATUS</code>. 「status」- 明细状态
     */
    public final TableField<POutItemRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(36), this, "「status」- 明细状态");
    /**
     * The column <code>DB_ETERNAL.P_OUT_ITEM.COMMODITY_ID</code>.
     * 「commodityId」- 商品ID
     */
    public final TableField<POutItemRecord, String> COMMODITY_ID = createField(DSL.name("COMMODITY_ID"), SQLDataType.VARCHAR(36), this, "「commodityId」- 商品ID");
    /**
     * The column <code>DB_ETERNAL.P_OUT_ITEM.COMMODITY_CODE</code>.
     * 「commodityCode」- 商品编码
     */
    public final TableField<POutItemRecord, String> COMMODITY_CODE = createField(DSL.name("COMMODITY_CODE"), SQLDataType.VARCHAR(255), this, "「commodityCode」- 商品编码");
    /**
     * The column <code>DB_ETERNAL.P_OUT_ITEM.COMMODITY_NAME</code>.
     * 「commodityName」- 商品名称
     */
    public final TableField<POutItemRecord, String> COMMODITY_NAME = createField(DSL.name("COMMODITY_NAME"), SQLDataType.VARCHAR(255), this, "「commodityName」- 商品名称");
    /**
     * The column <code>DB_ETERNAL.P_OUT_ITEM.COMMODITY_LOGO</code>.
     * 「commodityLogo」- 商品Logo
     */
    public final TableField<POutItemRecord, String> COMMODITY_LOGO = createField(DSL.name("COMMODITY_LOGO"), SQLDataType.VARCHAR(255), this, "「commodityLogo」- 商品Logo");
    /**
     * The column <code>DB_ETERNAL.P_OUT_ITEM.CUSTOMER_ID</code>. 「customerId」-
     * 供应商
     */
    public final TableField<POutItemRecord, String> CUSTOMER_ID = createField(DSL.name("CUSTOMER_ID"), SQLDataType.VARCHAR(36), this, "「customerId」- 供应商");
    /**
     * The column <code>DB_ETERNAL.P_OUT_ITEM.FROM_NAME</code>. 「fromName」-
     * 供应商商品名称
     */
    public final TableField<POutItemRecord, String> FROM_NAME = createField(DSL.name("FROM_NAME"), SQLDataType.VARCHAR(255), this, "「fromName」- 供应商商品名称");
    /**
     * The column <code>DB_ETERNAL.P_OUT_ITEM.FROM_CODE</code>. 「fromCode」-
     * 供应商商品编码
     */
    public final TableField<POutItemRecord, String> FROM_CODE = createField(DSL.name("FROM_CODE"), SQLDataType.VARCHAR(255), this, "「fromCode」- 供应商商品编码");
    /**
     * The column <code>DB_ETERNAL.P_OUT_ITEM.TICKET_ID</code>. 「ticketId」-
     * 出库单ID
     */
    public final TableField<POutItemRecord, String> TICKET_ID = createField(DSL.name("TICKET_ID"), SQLDataType.VARCHAR(36), this, "「ticketId」- 出库单ID");
    /**
     * The column <code>DB_ETERNAL.P_OUT_ITEM.WH_ID</code>. 「whId」- 实际出库仓库
     */
    public final TableField<POutItemRecord, String> WH_ID = createField(DSL.name("WH_ID"), SQLDataType.VARCHAR(36), this, "「whId」- 实际出库仓库");
    /**
     * The column <code>DB_ETERNAL.P_OUT_ITEM.NUM</code>. 「num」- 实际出库数量
     */
    public final TableField<POutItemRecord, Integer> NUM = createField(DSL.name("NUM"), SQLDataType.INTEGER, this, "「num」- 实际出库数量");
    /**
     * The column <code>DB_ETERNAL.P_OUT_ITEM.AMOUNT</code>. 「amount」-
     * 销售总价（订单总价）
     */
    public final TableField<POutItemRecord, BigDecimal> AMOUNT = createField(DSL.name("AMOUNT"), SQLDataType.DECIMAL(18, 2), this, "「amount」- 销售总价（订单总价）");
    /**
     * The column <code>DB_ETERNAL.P_OUT_ITEM.PRICE</code>. 「price」- 销售单价（销售价）
     */
    public final TableField<POutItemRecord, BigDecimal> PRICE = createField(DSL.name("PRICE"), SQLDataType.DECIMAL(18, 2), this, "「price」- 销售单价（销售价）");
    /**
     * The column <code>DB_ETERNAL.P_OUT_ITEM.COMMENT</code>. 「comment」- 商品行备注
     */
    public final TableField<POutItemRecord, String> COMMENT = createField(DSL.name("COMMENT"), SQLDataType.CLOB, this, "「comment」- 商品行备注");
    /**
     * The column <code>DB_ETERNAL.P_OUT_ITEM.COST_PER_BASIS</code>.
     * 「costPerBasis」- 基本单位成本
     */
    public final TableField<POutItemRecord, BigDecimal> COST_PER_BASIS = createField(DSL.name("COST_PER_BASIS"), SQLDataType.DECIMAL(18, 2), this, "「costPerBasis」- 基本单位成本");
    /**
     * The column <code>DB_ETERNAL.P_OUT_ITEM.COST_PER</code>. 「costPer」- 单位成本
     */
    public final TableField<POutItemRecord, BigDecimal> COST_PER = createField(DSL.name("COST_PER"), SQLDataType.DECIMAL(18, 2), this, "「costPer」- 单位成本");
    /**
     * The column <code>DB_ETERNAL.P_OUT_ITEM.COST_AMOUNT</code>. 「costAmount」-
     * 出库成本
     */
    public final TableField<POutItemRecord, BigDecimal> COST_AMOUNT = createField(DSL.name("COST_AMOUNT"), SQLDataType.DECIMAL(18, 2), this, "「costAmount」- 出库成本");
    /**
     * The column <code>DB_ETERNAL.P_OUT_ITEM.DISCOUNT_AMOUNT</code>.
     * 「discountAmount」- 折扣金额
     */
    public final TableField<POutItemRecord, BigDecimal> DISCOUNT_AMOUNT = createField(DSL.name("DISCOUNT_AMOUNT"), SQLDataType.DECIMAL(18, 2), this, "「discountAmount」- 折扣金额");
    /**
     * The column <code>DB_ETERNAL.P_OUT_ITEM.DISCOUNT_RATE</code>.
     * 「discountRate」- 折扣率
     */
    public final TableField<POutItemRecord, BigDecimal> DISCOUNT_RATE = createField(DSL.name("DISCOUNT_RATE"), SQLDataType.DECIMAL(10, 2), this, "「discountRate」- 折扣率");
    /**
     * The column <code>DB_ETERNAL.P_OUT_ITEM.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<POutItemRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>DB_ETERNAL.P_OUT_ITEM.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<POutItemRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");
    /**
     * The column <code>DB_ETERNAL.P_OUT_ITEM.METADATA</code>. 「metadata」- 附加配置
     */
    public final TableField<POutItemRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置");
    /**
     * The column <code>DB_ETERNAL.P_OUT_ITEM.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<POutItemRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(8), this, "「language」- 使用的语言");
    /**
     * The column <code>DB_ETERNAL.P_OUT_ITEM.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    public final TableField<POutItemRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");
    /**
     * The column <code>DB_ETERNAL.P_OUT_ITEM.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    public final TableField<POutItemRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");
    /**
     * The column <code>DB_ETERNAL.P_OUT_ITEM.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    public final TableField<POutItemRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");
    /**
     * The column <code>DB_ETERNAL.P_OUT_ITEM.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    public final TableField<POutItemRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private POutItem(Name alias, Table<POutItemRecord> aliased) {
        this(alias, aliased, null);
    }

    private POutItem(Name alias, Table<POutItemRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>DB_ETERNAL.P_OUT_ITEM</code> table reference
     */
    public POutItem(String alias) {
        this(DSL.name(alias), P_OUT_ITEM);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.P_OUT_ITEM</code> table reference
     */
    public POutItem(Name alias) {
        this(alias, P_OUT_ITEM);
    }

    /**
     * Create a <code>DB_ETERNAL.P_OUT_ITEM</code> table reference
     */
    public POutItem() {
        this(DSL.name("P_OUT_ITEM"), null);
    }

    public <O extends Record> POutItem(Table<O> child, ForeignKey<O, POutItemRecord> key) {
        super(child, key, P_OUT_ITEM);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<POutItemRecord> getRecordType() {
        return POutItemRecord.class;
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Db.DB_ETERNAL;
    }

    @Override
    public UniqueKey<POutItemRecord> getPrimaryKey() {
        return Keys.KEY_P_OUT_ITEM_PRIMARY;
    }

    @Override
    public List<UniqueKey<POutItemRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_P_OUT_ITEM_SERIAL);
    }

    @Override
    public POutItem as(String alias) {
        return new POutItem(DSL.name(alias), this);
    }

    @Override
    public POutItem as(Name alias) {
        return new POutItem(alias, this);
    }

    @Override
    public POutItem as(Table<?> alias) {
        return new POutItem(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public POutItem rename(String name) {
        return new POutItem(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public POutItem rename(Name name) {
        return new POutItem(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public POutItem rename(Table<?> name) {
        return new POutItem(name.getQualifiedName(), null);
    }
}
