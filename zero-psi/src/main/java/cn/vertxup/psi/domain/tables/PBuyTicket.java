/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.psi.domain.tables;


import cn.vertxup.psi.domain.Keys;
import cn.vertxup.psi.domain.Zdb;
import cn.vertxup.psi.domain.tables.records.PBuyTicketRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class PBuyTicket extends TableImpl<PBuyTicketRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ZDB.P_BUY_TICKET</code>
     */
    public static final PBuyTicket P_BUY_TICKET = new PBuyTicket();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PBuyTicketRecord> getRecordType() {
        return PBuyTicketRecord.class;
    }

    /**
     * The column <code>ZDB.P_BUY_TICKET.KEY</code>. 「key」- 采购申请主键
     */
    public final TableField<PBuyTicketRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 采购申请主键");

    /**
     * The column <code>ZDB.P_BUY_TICKET.SERIAL</code>. 「serial」- 采购单号（系统可用）
     */
    public final TableField<PBuyTicketRecord, String> SERIAL = createField(DSL.name("SERIAL"), SQLDataType.VARCHAR(255), this, "「serial」- 采购单号（系统可用）");

    /**
     * The column <code>ZDB.P_BUY_TICKET.TYPE</code>. 「type」- 单据类型
     */
    public final TableField<PBuyTicketRecord, String> TYPE = createField(DSL.name("TYPE"), SQLDataType.VARCHAR(36), this, "「type」- 单据类型");

    /**
     * The column <code>ZDB.P_BUY_TICKET.STATUS</code>. 「status」- 单据状态
     */
    public final TableField<PBuyTicketRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(36), this, "「status」- 单据状态");

    /**
     * The column <code>ZDB.P_BUY_TICKET.OP_AT</code>. 「opAt」- 申请时间（单据日期）
     */
    public final TableField<PBuyTicketRecord, LocalDateTime> OP_AT = createField(DSL.name("OP_AT"), SQLDataType.LOCALDATETIME(0), this, "「opAt」- 申请时间（单据日期）");

    /**
     * The column <code>ZDB.P_BUY_TICKET.OP_BY</code>. 「opBy」- 申请人
     */
    public final TableField<PBuyTicketRecord, String> OP_BY = createField(DSL.name("OP_BY"), SQLDataType.VARCHAR(36), this, "「opBy」- 申请人");

    /**
     * The column <code>ZDB.P_BUY_TICKET.OP_DEPT</code>. 「opDept」- 申请部门
     */
    public final TableField<PBuyTicketRecord, String> OP_DEPT = createField(DSL.name("OP_DEPT"), SQLDataType.VARCHAR(255), this, "「opDept」- 申请部门");

    /**
     * The column <code>ZDB.P_BUY_TICKET.SOURCE</code>. 「source」- 单据来源
     */
    public final TableField<PBuyTicketRecord, String> SOURCE = createField(DSL.name("SOURCE"), SQLDataType.VARCHAR(36), this, "「source」- 单据来源");

    /**
     * The column <code>ZDB.P_BUY_TICKET.CUSTOMER_ID</code>. 「customerId」- 建议供应商
     */
    public final TableField<PBuyTicketRecord, String> CUSTOMER_ID = createField(DSL.name("CUSTOMER_ID"), SQLDataType.VARCHAR(36), this, "「customerId」- 建议供应商");

    /**
     * The column <code>ZDB.P_BUY_TICKET.CURRENCY_ID</code>. 「currencyId」- 币种
     */
    public final TableField<PBuyTicketRecord, String> CURRENCY_ID = createField(DSL.name("CURRENCY_ID"), SQLDataType.VARCHAR(36), this, "「currencyId」- 币种");

    /**
     * The column <code>ZDB.P_BUY_TICKET.COMPANY_ID</code>. 「companyId」- 所属公司
     */
    public final TableField<PBuyTicketRecord, String> COMPANY_ID = createField(DSL.name("COMPANY_ID"), SQLDataType.VARCHAR(36), this, "「companyId」- 所属公司");

    /**
     * The column <code>ZDB.P_BUY_TICKET.APPROVED_BY</code>. 「approvedBy」- 审核人
     */
    public final TableField<PBuyTicketRecord, String> APPROVED_BY = createField(DSL.name("APPROVED_BY"), SQLDataType.VARCHAR(36), this, "「approvedBy」- 审核人");

    /**
     * The column <code>ZDB.P_BUY_TICKET.APPROVED_AT</code>. 「approvedAt」- 审核时间
     */
    public final TableField<PBuyTicketRecord, LocalDateTime> APPROVED_AT = createField(DSL.name("APPROVED_AT"), SQLDataType.LOCALDATETIME(0), this, "「approvedAt」- 审核时间");

    /**
     * The column <code>ZDB.P_BUY_TICKET.TO_ID</code>. 「toId」- 收货地址ID
     */
    public final TableField<PBuyTicketRecord, String> TO_ID = createField(DSL.name("TO_ID"), SQLDataType.VARCHAR(36), this, "「toId」- 收货地址ID");

    /**
     * The column <code>ZDB.P_BUY_TICKET.TO_ADDRESS</code>. 「toAddress」- 收货地址
     */
    public final TableField<PBuyTicketRecord, String> TO_ADDRESS = createField(DSL.name("TO_ADDRESS"), SQLDataType.CLOB, this, "「toAddress」- 收货地址");

    /**
     * The column <code>ZDB.P_BUY_TICKET.TAGS</code>. 「tags」- 单据标签
     */
    public final TableField<PBuyTicketRecord, String> TAGS = createField(DSL.name("TAGS"), SQLDataType.CLOB, this, "「tags」- 单据标签");

    /**
     * The column <code>ZDB.P_BUY_TICKET.COMMENT</code>. 「comment」- 单据备注
     */
    public final TableField<PBuyTicketRecord, String> COMMENT = createField(DSL.name("COMMENT"), SQLDataType.CLOB, this, "「comment」- 单据备注");

    /**
     * The column <code>ZDB.P_BUY_TICKET.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<PBuyTicketRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");

    /**
     * The column <code>ZDB.P_BUY_TICKET.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<PBuyTicketRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");

    /**
     * The column <code>ZDB.P_BUY_TICKET.METADATA</code>. 「metadata」- 附加配置
     */
    public final TableField<PBuyTicketRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置");

    /**
     * The column <code>ZDB.P_BUY_TICKET.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<PBuyTicketRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(8), this, "「language」- 使用的语言");

    /**
     * The column <code>ZDB.P_BUY_TICKET.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<PBuyTicketRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");

    /**
     * The column <code>ZDB.P_BUY_TICKET.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<PBuyTicketRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");

    /**
     * The column <code>ZDB.P_BUY_TICKET.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<PBuyTicketRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");

    /**
     * The column <code>ZDB.P_BUY_TICKET.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<PBuyTicketRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private PBuyTicket(Name alias, Table<PBuyTicketRecord> aliased) {
        this(alias, aliased, null);
    }

    private PBuyTicket(Name alias, Table<PBuyTicketRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.P_BUY_TICKET</code> table reference
     */
    public PBuyTicket(String alias) {
        this(DSL.name(alias), P_BUY_TICKET);
    }

    /**
     * Create an aliased <code>ZDB.P_BUY_TICKET</code> table reference
     */
    public PBuyTicket(Name alias) {
        this(alias, P_BUY_TICKET);
    }

    /**
     * Create a <code>ZDB.P_BUY_TICKET</code> table reference
     */
    public PBuyTicket() {
        this(DSL.name("P_BUY_TICKET"), null);
    }

    public <O extends Record> PBuyTicket(Table<O> child, ForeignKey<O, PBuyTicketRecord> key) {
        super(child, key, P_BUY_TICKET);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public UniqueKey<PBuyTicketRecord> getPrimaryKey() {
        return Keys.KEY_P_BUY_TICKET_PRIMARY;
    }

    @Override
    public List<UniqueKey<PBuyTicketRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_P_BUY_TICKET_SERIAL);
    }

    @Override
    public PBuyTicket as(String alias) {
        return new PBuyTicket(DSL.name(alias), this);
    }

    @Override
    public PBuyTicket as(Name alias) {
        return new PBuyTicket(alias, this);
    }

    @Override
    public PBuyTicket as(Table<?> alias) {
        return new PBuyTicket(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PBuyTicket rename(String name) {
        return new PBuyTicket(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PBuyTicket rename(Name name) {
        return new PBuyTicket(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PBuyTicket rename(Table<?> name) {
        return new PBuyTicket(name.getQualifiedName(), null);
    }
}
