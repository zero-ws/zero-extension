/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.psi.domain.tables.pojos;


import cn.vertxup.psi.domain.tables.interfaces.IPBuyOrder;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.math.BigDecimal;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PBuyOrder implements VertxPojo, IPBuyOrder {

    private static final long serialVersionUID = 1L;

    private String key;
    private String serial;
    private String type;
    private String status;
    private String whId;
    private String customerId;
    private LocalDateTime payedAt;
    private Integer payedDay;
    private LocalDateTime opAt;
    private String opBy;
    private String opDept;
    private String tags;
    private String comment;
    private String statusSend;
    private String reason;
    private BigDecimal amount;
    private BigDecimal amountWait;
    private BigDecimal amountDebt;
    private BigDecimal amountPlan;
    private BigDecimal amountYes;
    private BigDecimal discountAmount;
    private BigDecimal discountRate;
    private Boolean discount;
    private String approvedBy;
    private LocalDateTime approvedAt;
    private String toId;
    private String toAddress;
    private String fromId;
    private String fromAddress;
    private String currencyId;
    private String companyId;
    private Boolean active;
    private String sigma;
    private String metadata;
    private String language;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public PBuyOrder() {}

    public PBuyOrder(IPBuyOrder value) {
        this.key = value.getKey();
        this.serial = value.getSerial();
        this.type = value.getType();
        this.status = value.getStatus();
        this.whId = value.getWhId();
        this.customerId = value.getCustomerId();
        this.payedAt = value.getPayedAt();
        this.payedDay = value.getPayedDay();
        this.opAt = value.getOpAt();
        this.opBy = value.getOpBy();
        this.opDept = value.getOpDept();
        this.tags = value.getTags();
        this.comment = value.getComment();
        this.statusSend = value.getStatusSend();
        this.reason = value.getReason();
        this.amount = value.getAmount();
        this.amountWait = value.getAmountWait();
        this.amountDebt = value.getAmountDebt();
        this.amountPlan = value.getAmountPlan();
        this.amountYes = value.getAmountYes();
        this.discountAmount = value.getDiscountAmount();
        this.discountRate = value.getDiscountRate();
        this.discount = value.getDiscount();
        this.approvedBy = value.getApprovedBy();
        this.approvedAt = value.getApprovedAt();
        this.toId = value.getToId();
        this.toAddress = value.getToAddress();
        this.fromId = value.getFromId();
        this.fromAddress = value.getFromAddress();
        this.currencyId = value.getCurrencyId();
        this.companyId = value.getCompanyId();
        this.active = value.getActive();
        this.sigma = value.getSigma();
        this.metadata = value.getMetadata();
        this.language = value.getLanguage();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public PBuyOrder(
        String key,
        String serial,
        String type,
        String status,
        String whId,
        String customerId,
        LocalDateTime payedAt,
        Integer payedDay,
        LocalDateTime opAt,
        String opBy,
        String opDept,
        String tags,
        String comment,
        String statusSend,
        String reason,
        BigDecimal amount,
        BigDecimal amountWait,
        BigDecimal amountDebt,
        BigDecimal amountPlan,
        BigDecimal amountYes,
        BigDecimal discountAmount,
        BigDecimal discountRate,
        Boolean discount,
        String approvedBy,
        LocalDateTime approvedAt,
        String toId,
        String toAddress,
        String fromId,
        String fromAddress,
        String currencyId,
        String companyId,
        Boolean active,
        String sigma,
        String metadata,
        String language,
        LocalDateTime createdAt,
        String createdBy,
        LocalDateTime updatedAt,
        String updatedBy
    ) {
        this.key = key;
        this.serial = serial;
        this.type = type;
        this.status = status;
        this.whId = whId;
        this.customerId = customerId;
        this.payedAt = payedAt;
        this.payedDay = payedDay;
        this.opAt = opAt;
        this.opBy = opBy;
        this.opDept = opDept;
        this.tags = tags;
        this.comment = comment;
        this.statusSend = statusSend;
        this.reason = reason;
        this.amount = amount;
        this.amountWait = amountWait;
        this.amountDebt = amountDebt;
        this.amountPlan = amountPlan;
        this.amountYes = amountYes;
        this.discountAmount = discountAmount;
        this.discountRate = discountRate;
        this.discount = discount;
        this.approvedBy = approvedBy;
        this.approvedAt = approvedAt;
        this.toId = toId;
        this.toAddress = toAddress;
        this.fromId = fromId;
        this.fromAddress = fromAddress;
        this.currencyId = currencyId;
        this.companyId = companyId;
        this.active = active;
        this.sigma = sigma;
        this.metadata = metadata;
        this.language = language;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public PBuyOrder(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>ZDB.P_BUY_ORDER.KEY</code>. 「key」- 采购订单主键
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>ZDB.P_BUY_ORDER.KEY</code>. 「key」- 采购订单主键
     */
    @Override
    public PBuyOrder setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_BUY_ORDER.SERIAL</code>. 「serial」-
     * 采购订单号（系统可用，直接计算）
     */
    @Override
    public String getSerial() {
        return this.serial;
    }

    /**
     * Setter for <code>ZDB.P_BUY_ORDER.SERIAL</code>. 「serial」-
     * 采购订单号（系统可用，直接计算）
     */
    @Override
    public PBuyOrder setSerial(String serial) {
        this.serial = serial;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_BUY_ORDER.TYPE</code>. 「type」- 单据类型
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>ZDB.P_BUY_ORDER.TYPE</code>. 「type」- 单据类型
     */
    @Override
    public PBuyOrder setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_BUY_ORDER.STATUS</code>. 「status」- 订单状态
     */
    @Override
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>ZDB.P_BUY_ORDER.STATUS</code>. 「status」- 订单状态
     */
    @Override
    public PBuyOrder setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_BUY_ORDER.WH_ID</code>. 「whId」- 建议入库仓库
     */
    @Override
    public String getWhId() {
        return this.whId;
    }

    /**
     * Setter for <code>ZDB.P_BUY_ORDER.WH_ID</code>. 「whId」- 建议入库仓库
     */
    @Override
    public PBuyOrder setWhId(String whId) {
        this.whId = whId;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_BUY_ORDER.CUSTOMER_ID</code>. 「customerId」- 采购供应商
     */
    @Override
    public String getCustomerId() {
        return this.customerId;
    }

    /**
     * Setter for <code>ZDB.P_BUY_ORDER.CUSTOMER_ID</code>. 「customerId」- 采购供应商
     */
    @Override
    public PBuyOrder setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_BUY_ORDER.PAYED_AT</code>. 「payedAt」- 结算日期
     */
    @Override
    public LocalDateTime getPayedAt() {
        return this.payedAt;
    }

    /**
     * Setter for <code>ZDB.P_BUY_ORDER.PAYED_AT</code>. 「payedAt」- 结算日期
     */
    @Override
    public PBuyOrder setPayedAt(LocalDateTime payedAt) {
        this.payedAt = payedAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_BUY_ORDER.PAYED_DAY</code>. 「payedDay」- 采购期限
     */
    @Override
    public Integer getPayedDay() {
        return this.payedDay;
    }

    /**
     * Setter for <code>ZDB.P_BUY_ORDER.PAYED_DAY</code>. 「payedDay」- 采购期限
     */
    @Override
    public PBuyOrder setPayedDay(Integer payedDay) {
        this.payedDay = payedDay;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_BUY_ORDER.OP_AT</code>. 「opAt」- 单据日期
     */
    @Override
    public LocalDateTime getOpAt() {
        return this.opAt;
    }

    /**
     * Setter for <code>ZDB.P_BUY_ORDER.OP_AT</code>. 「opAt」- 单据日期
     */
    @Override
    public PBuyOrder setOpAt(LocalDateTime opAt) {
        this.opAt = opAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_BUY_ORDER.OP_BY</code>. 「opBy」- 业务员
     */
    @Override
    public String getOpBy() {
        return this.opBy;
    }

    /**
     * Setter for <code>ZDB.P_BUY_ORDER.OP_BY</code>. 「opBy」- 业务员
     */
    @Override
    public PBuyOrder setOpBy(String opBy) {
        this.opBy = opBy;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_BUY_ORDER.OP_DEPT</code>. 「opDept」- 业务部门
     */
    @Override
    public String getOpDept() {
        return this.opDept;
    }

    /**
     * Setter for <code>ZDB.P_BUY_ORDER.OP_DEPT</code>. 「opDept」- 业务部门
     */
    @Override
    public PBuyOrder setOpDept(String opDept) {
        this.opDept = opDept;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_BUY_ORDER.TAGS</code>. 「tags」- 单据标签
     */
    @Override
    public String getTags() {
        return this.tags;
    }

    /**
     * Setter for <code>ZDB.P_BUY_ORDER.TAGS</code>. 「tags」- 单据标签
     */
    @Override
    public PBuyOrder setTags(String tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_BUY_ORDER.COMMENT</code>. 「comment」- 单据备注
     */
    @Override
    public String getComment() {
        return this.comment;
    }

    /**
     * Setter for <code>ZDB.P_BUY_ORDER.COMMENT</code>. 「comment」- 单据备注
     */
    @Override
    public PBuyOrder setComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_BUY_ORDER.STATUS_SEND</code>. 「statusSend」- 发送状态
     */
    @Override
    public String getStatusSend() {
        return this.statusSend;
    }

    /**
     * Setter for <code>ZDB.P_BUY_ORDER.STATUS_SEND</code>. 「statusSend」- 发送状态
     */
    @Override
    public PBuyOrder setStatusSend(String statusSend) {
        this.statusSend = statusSend;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_BUY_ORDER.REASON</code>. 「reason」- 发送失败原因
     */
    @Override
    public String getReason() {
        return this.reason;
    }

    /**
     * Setter for <code>ZDB.P_BUY_ORDER.REASON</code>. 「reason」- 发送失败原因
     */
    @Override
    public PBuyOrder setReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_BUY_ORDER.AMOUNT</code>. 「amount」- 订单总额
     */
    @Override
    public BigDecimal getAmount() {
        return this.amount;
    }

    /**
     * Setter for <code>ZDB.P_BUY_ORDER.AMOUNT</code>. 「amount」- 订单总额
     */
    @Override
    public PBuyOrder setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_BUY_ORDER.AMOUNT_WAIT</code>. 「amountWait」- 应付余额
     */
    @Override
    public BigDecimal getAmountWait() {
        return this.amountWait;
    }

    /**
     * Setter for <code>ZDB.P_BUY_ORDER.AMOUNT_WAIT</code>. 「amountWait」- 应付余额
     */
    @Override
    public PBuyOrder setAmountWait(BigDecimal amountWait) {
        this.amountWait = amountWait;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_BUY_ORDER.AMOUNT_DEBT</code>. 「amountDebt」- 上次欠款
     */
    @Override
    public BigDecimal getAmountDebt() {
        return this.amountDebt;
    }

    /**
     * Setter for <code>ZDB.P_BUY_ORDER.AMOUNT_DEBT</code>. 「amountDebt」- 上次欠款
     */
    @Override
    public PBuyOrder setAmountDebt(BigDecimal amountDebt) {
        this.amountDebt = amountDebt;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_BUY_ORDER.AMOUNT_PLAN</code>. 「amountPlan」- 预计采购费用
     */
    @Override
    public BigDecimal getAmountPlan() {
        return this.amountPlan;
    }

    /**
     * Setter for <code>ZDB.P_BUY_ORDER.AMOUNT_PLAN</code>. 「amountPlan」- 预计采购费用
     */
    @Override
    public PBuyOrder setAmountPlan(BigDecimal amountPlan) {
        this.amountPlan = amountPlan;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_BUY_ORDER.AMOUNT_YES</code>. 「amountYes」- 成交金额
     */
    @Override
    public BigDecimal getAmountYes() {
        return this.amountYes;
    }

    /**
     * Setter for <code>ZDB.P_BUY_ORDER.AMOUNT_YES</code>. 「amountYes」- 成交金额
     */
    @Override
    public PBuyOrder setAmountYes(BigDecimal amountYes) {
        this.amountYes = amountYes;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_BUY_ORDER.DISCOUNT_AMOUNT</code>.
     * 「discountAmount」- 整单折扣额
     */
    @Override
    public BigDecimal getDiscountAmount() {
        return this.discountAmount;
    }

    /**
     * Setter for <code>ZDB.P_BUY_ORDER.DISCOUNT_AMOUNT</code>.
     * 「discountAmount」- 整单折扣额
     */
    @Override
    public PBuyOrder setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_BUY_ORDER.DISCOUNT_RATE</code>. 「discountRate」-
     * 折扣率
     */
    @Override
    public BigDecimal getDiscountRate() {
        return this.discountRate;
    }

    /**
     * Setter for <code>ZDB.P_BUY_ORDER.DISCOUNT_RATE</code>. 「discountRate」-
     * 折扣率
     */
    @Override
    public PBuyOrder setDiscountRate(BigDecimal discountRate) {
        this.discountRate = discountRate;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_BUY_ORDER.DISCOUNT</code>. 「discount」- 定向折扣
     */
    @Override
    public Boolean getDiscount() {
        return this.discount;
    }

    /**
     * Setter for <code>ZDB.P_BUY_ORDER.DISCOUNT</code>. 「discount」- 定向折扣
     */
    @Override
    public PBuyOrder setDiscount(Boolean discount) {
        this.discount = discount;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_BUY_ORDER.APPROVED_BY</code>. 「approvedBy」- 审核人
     */
    @Override
    public String getApprovedBy() {
        return this.approvedBy;
    }

    /**
     * Setter for <code>ZDB.P_BUY_ORDER.APPROVED_BY</code>. 「approvedBy」- 审核人
     */
    @Override
    public PBuyOrder setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_BUY_ORDER.APPROVED_AT</code>. 「approvedAt」- 审核时间
     */
    @Override
    public LocalDateTime getApprovedAt() {
        return this.approvedAt;
    }

    /**
     * Setter for <code>ZDB.P_BUY_ORDER.APPROVED_AT</code>. 「approvedAt」- 审核时间
     */
    @Override
    public PBuyOrder setApprovedAt(LocalDateTime approvedAt) {
        this.approvedAt = approvedAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_BUY_ORDER.TO_ID</code>. 「toId」- 收货地址ID
     */
    @Override
    public String getToId() {
        return this.toId;
    }

    /**
     * Setter for <code>ZDB.P_BUY_ORDER.TO_ID</code>. 「toId」- 收货地址ID
     */
    @Override
    public PBuyOrder setToId(String toId) {
        this.toId = toId;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_BUY_ORDER.TO_ADDRESS</code>. 「toAddress」- 收货地址
     */
    @Override
    public String getToAddress() {
        return this.toAddress;
    }

    /**
     * Setter for <code>ZDB.P_BUY_ORDER.TO_ADDRESS</code>. 「toAddress」- 收货地址
     */
    @Override
    public PBuyOrder setToAddress(String toAddress) {
        this.toAddress = toAddress;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_BUY_ORDER.FROM_ID</code>. 「fromId」- 发货地址ID
     */
    @Override
    public String getFromId() {
        return this.fromId;
    }

    /**
     * Setter for <code>ZDB.P_BUY_ORDER.FROM_ID</code>. 「fromId」- 发货地址ID
     */
    @Override
    public PBuyOrder setFromId(String fromId) {
        this.fromId = fromId;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_BUY_ORDER.FROM_ADDRESS</code>. 「fromAddress」- 发货地址
     */
    @Override
    public String getFromAddress() {
        return this.fromAddress;
    }

    /**
     * Setter for <code>ZDB.P_BUY_ORDER.FROM_ADDRESS</code>. 「fromAddress」- 发货地址
     */
    @Override
    public PBuyOrder setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_BUY_ORDER.CURRENCY_ID</code>. 「currencyId」- 币种
     */
    @Override
    public String getCurrencyId() {
        return this.currencyId;
    }

    /**
     * Setter for <code>ZDB.P_BUY_ORDER.CURRENCY_ID</code>. 「currencyId」- 币种
     */
    @Override
    public PBuyOrder setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_BUY_ORDER.COMPANY_ID</code>. 「companyId」- 所属公司
     */
    @Override
    public String getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for <code>ZDB.P_BUY_ORDER.COMPANY_ID</code>. 「companyId」- 所属公司
     */
    @Override
    public PBuyOrder setCompanyId(String companyId) {
        this.companyId = companyId;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_BUY_ORDER.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>ZDB.P_BUY_ORDER.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public PBuyOrder setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_BUY_ORDER.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>ZDB.P_BUY_ORDER.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public PBuyOrder setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_BUY_ORDER.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>ZDB.P_BUY_ORDER.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public PBuyOrder setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_BUY_ORDER.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>ZDB.P_BUY_ORDER.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public PBuyOrder setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_BUY_ORDER.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>ZDB.P_BUY_ORDER.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public PBuyOrder setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_BUY_ORDER.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>ZDB.P_BUY_ORDER.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public PBuyOrder setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_BUY_ORDER.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>ZDB.P_BUY_ORDER.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public PBuyOrder setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_BUY_ORDER.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>ZDB.P_BUY_ORDER.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public PBuyOrder setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PBuyOrder other = (PBuyOrder) obj;
        if (this.key == null) {
            if (other.key != null)
                return false;
        }
        else if (!this.key.equals(other.key))
            return false;
        if (this.serial == null) {
            if (other.serial != null)
                return false;
        }
        else if (!this.serial.equals(other.serial))
            return false;
        if (this.type == null) {
            if (other.type != null)
                return false;
        }
        else if (!this.type.equals(other.type))
            return false;
        if (this.status == null) {
            if (other.status != null)
                return false;
        }
        else if (!this.status.equals(other.status))
            return false;
        if (this.whId == null) {
            if (other.whId != null)
                return false;
        }
        else if (!this.whId.equals(other.whId))
            return false;
        if (this.customerId == null) {
            if (other.customerId != null)
                return false;
        }
        else if (!this.customerId.equals(other.customerId))
            return false;
        if (this.payedAt == null) {
            if (other.payedAt != null)
                return false;
        }
        else if (!this.payedAt.equals(other.payedAt))
            return false;
        if (this.payedDay == null) {
            if (other.payedDay != null)
                return false;
        }
        else if (!this.payedDay.equals(other.payedDay))
            return false;
        if (this.opAt == null) {
            if (other.opAt != null)
                return false;
        }
        else if (!this.opAt.equals(other.opAt))
            return false;
        if (this.opBy == null) {
            if (other.opBy != null)
                return false;
        }
        else if (!this.opBy.equals(other.opBy))
            return false;
        if (this.opDept == null) {
            if (other.opDept != null)
                return false;
        }
        else if (!this.opDept.equals(other.opDept))
            return false;
        if (this.tags == null) {
            if (other.tags != null)
                return false;
        }
        else if (!this.tags.equals(other.tags))
            return false;
        if (this.comment == null) {
            if (other.comment != null)
                return false;
        }
        else if (!this.comment.equals(other.comment))
            return false;
        if (this.statusSend == null) {
            if (other.statusSend != null)
                return false;
        }
        else if (!this.statusSend.equals(other.statusSend))
            return false;
        if (this.reason == null) {
            if (other.reason != null)
                return false;
        }
        else if (!this.reason.equals(other.reason))
            return false;
        if (this.amount == null) {
            if (other.amount != null)
                return false;
        }
        else if (!this.amount.equals(other.amount))
            return false;
        if (this.amountWait == null) {
            if (other.amountWait != null)
                return false;
        }
        else if (!this.amountWait.equals(other.amountWait))
            return false;
        if (this.amountDebt == null) {
            if (other.amountDebt != null)
                return false;
        }
        else if (!this.amountDebt.equals(other.amountDebt))
            return false;
        if (this.amountPlan == null) {
            if (other.amountPlan != null)
                return false;
        }
        else if (!this.amountPlan.equals(other.amountPlan))
            return false;
        if (this.amountYes == null) {
            if (other.amountYes != null)
                return false;
        }
        else if (!this.amountYes.equals(other.amountYes))
            return false;
        if (this.discountAmount == null) {
            if (other.discountAmount != null)
                return false;
        }
        else if (!this.discountAmount.equals(other.discountAmount))
            return false;
        if (this.discountRate == null) {
            if (other.discountRate != null)
                return false;
        }
        else if (!this.discountRate.equals(other.discountRate))
            return false;
        if (this.discount == null) {
            if (other.discount != null)
                return false;
        }
        else if (!this.discount.equals(other.discount))
            return false;
        if (this.approvedBy == null) {
            if (other.approvedBy != null)
                return false;
        }
        else if (!this.approvedBy.equals(other.approvedBy))
            return false;
        if (this.approvedAt == null) {
            if (other.approvedAt != null)
                return false;
        }
        else if (!this.approvedAt.equals(other.approvedAt))
            return false;
        if (this.toId == null) {
            if (other.toId != null)
                return false;
        }
        else if (!this.toId.equals(other.toId))
            return false;
        if (this.toAddress == null) {
            if (other.toAddress != null)
                return false;
        }
        else if (!this.toAddress.equals(other.toAddress))
            return false;
        if (this.fromId == null) {
            if (other.fromId != null)
                return false;
        }
        else if (!this.fromId.equals(other.fromId))
            return false;
        if (this.fromAddress == null) {
            if (other.fromAddress != null)
                return false;
        }
        else if (!this.fromAddress.equals(other.fromAddress))
            return false;
        if (this.currencyId == null) {
            if (other.currencyId != null)
                return false;
        }
        else if (!this.currencyId.equals(other.currencyId))
            return false;
        if (this.companyId == null) {
            if (other.companyId != null)
                return false;
        }
        else if (!this.companyId.equals(other.companyId))
            return false;
        if (this.active == null) {
            if (other.active != null)
                return false;
        }
        else if (!this.active.equals(other.active))
            return false;
        if (this.sigma == null) {
            if (other.sigma != null)
                return false;
        }
        else if (!this.sigma.equals(other.sigma))
            return false;
        if (this.metadata == null) {
            if (other.metadata != null)
                return false;
        }
        else if (!this.metadata.equals(other.metadata))
            return false;
        if (this.language == null) {
            if (other.language != null)
                return false;
        }
        else if (!this.language.equals(other.language))
            return false;
        if (this.createdAt == null) {
            if (other.createdAt != null)
                return false;
        }
        else if (!this.createdAt.equals(other.createdAt))
            return false;
        if (this.createdBy == null) {
            if (other.createdBy != null)
                return false;
        }
        else if (!this.createdBy.equals(other.createdBy))
            return false;
        if (this.updatedAt == null) {
            if (other.updatedAt != null)
                return false;
        }
        else if (!this.updatedAt.equals(other.updatedAt))
            return false;
        if (this.updatedBy == null) {
            if (other.updatedBy != null)
                return false;
        }
        else if (!this.updatedBy.equals(other.updatedBy))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.key == null) ? 0 : this.key.hashCode());
        result = prime * result + ((this.serial == null) ? 0 : this.serial.hashCode());
        result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.whId == null) ? 0 : this.whId.hashCode());
        result = prime * result + ((this.customerId == null) ? 0 : this.customerId.hashCode());
        result = prime * result + ((this.payedAt == null) ? 0 : this.payedAt.hashCode());
        result = prime * result + ((this.payedDay == null) ? 0 : this.payedDay.hashCode());
        result = prime * result + ((this.opAt == null) ? 0 : this.opAt.hashCode());
        result = prime * result + ((this.opBy == null) ? 0 : this.opBy.hashCode());
        result = prime * result + ((this.opDept == null) ? 0 : this.opDept.hashCode());
        result = prime * result + ((this.tags == null) ? 0 : this.tags.hashCode());
        result = prime * result + ((this.comment == null) ? 0 : this.comment.hashCode());
        result = prime * result + ((this.statusSend == null) ? 0 : this.statusSend.hashCode());
        result = prime * result + ((this.reason == null) ? 0 : this.reason.hashCode());
        result = prime * result + ((this.amount == null) ? 0 : this.amount.hashCode());
        result = prime * result + ((this.amountWait == null) ? 0 : this.amountWait.hashCode());
        result = prime * result + ((this.amountDebt == null) ? 0 : this.amountDebt.hashCode());
        result = prime * result + ((this.amountPlan == null) ? 0 : this.amountPlan.hashCode());
        result = prime * result + ((this.amountYes == null) ? 0 : this.amountYes.hashCode());
        result = prime * result + ((this.discountAmount == null) ? 0 : this.discountAmount.hashCode());
        result = prime * result + ((this.discountRate == null) ? 0 : this.discountRate.hashCode());
        result = prime * result + ((this.discount == null) ? 0 : this.discount.hashCode());
        result = prime * result + ((this.approvedBy == null) ? 0 : this.approvedBy.hashCode());
        result = prime * result + ((this.approvedAt == null) ? 0 : this.approvedAt.hashCode());
        result = prime * result + ((this.toId == null) ? 0 : this.toId.hashCode());
        result = prime * result + ((this.toAddress == null) ? 0 : this.toAddress.hashCode());
        result = prime * result + ((this.fromId == null) ? 0 : this.fromId.hashCode());
        result = prime * result + ((this.fromAddress == null) ? 0 : this.fromAddress.hashCode());
        result = prime * result + ((this.currencyId == null) ? 0 : this.currencyId.hashCode());
        result = prime * result + ((this.companyId == null) ? 0 : this.companyId.hashCode());
        result = prime * result + ((this.active == null) ? 0 : this.active.hashCode());
        result = prime * result + ((this.sigma == null) ? 0 : this.sigma.hashCode());
        result = prime * result + ((this.metadata == null) ? 0 : this.metadata.hashCode());
        result = prime * result + ((this.language == null) ? 0 : this.language.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.updatedAt == null) ? 0 : this.updatedAt.hashCode());
        result = prime * result + ((this.updatedBy == null) ? 0 : this.updatedBy.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PBuyOrder (");

        sb.append(key);
        sb.append(", ").append(serial);
        sb.append(", ").append(type);
        sb.append(", ").append(status);
        sb.append(", ").append(whId);
        sb.append(", ").append(customerId);
        sb.append(", ").append(payedAt);
        sb.append(", ").append(payedDay);
        sb.append(", ").append(opAt);
        sb.append(", ").append(opBy);
        sb.append(", ").append(opDept);
        sb.append(", ").append(tags);
        sb.append(", ").append(comment);
        sb.append(", ").append(statusSend);
        sb.append(", ").append(reason);
        sb.append(", ").append(amount);
        sb.append(", ").append(amountWait);
        sb.append(", ").append(amountDebt);
        sb.append(", ").append(amountPlan);
        sb.append(", ").append(amountYes);
        sb.append(", ").append(discountAmount);
        sb.append(", ").append(discountRate);
        sb.append(", ").append(discount);
        sb.append(", ").append(approvedBy);
        sb.append(", ").append(approvedAt);
        sb.append(", ").append(toId);
        sb.append(", ").append(toAddress);
        sb.append(", ").append(fromId);
        sb.append(", ").append(fromAddress);
        sb.append(", ").append(currencyId);
        sb.append(", ").append(companyId);
        sb.append(", ").append(active);
        sb.append(", ").append(sigma);
        sb.append(", ").append(metadata);
        sb.append(", ").append(language);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(updatedAt);
        sb.append(", ").append(updatedBy);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IPBuyOrder from) {
        setKey(from.getKey());
        setSerial(from.getSerial());
        setType(from.getType());
        setStatus(from.getStatus());
        setWhId(from.getWhId());
        setCustomerId(from.getCustomerId());
        setPayedAt(from.getPayedAt());
        setPayedDay(from.getPayedDay());
        setOpAt(from.getOpAt());
        setOpBy(from.getOpBy());
        setOpDept(from.getOpDept());
        setTags(from.getTags());
        setComment(from.getComment());
        setStatusSend(from.getStatusSend());
        setReason(from.getReason());
        setAmount(from.getAmount());
        setAmountWait(from.getAmountWait());
        setAmountDebt(from.getAmountDebt());
        setAmountPlan(from.getAmountPlan());
        setAmountYes(from.getAmountYes());
        setDiscountAmount(from.getDiscountAmount());
        setDiscountRate(from.getDiscountRate());
        setDiscount(from.getDiscount());
        setApprovedBy(from.getApprovedBy());
        setApprovedAt(from.getApprovedAt());
        setToId(from.getToId());
        setToAddress(from.getToAddress());
        setFromId(from.getFromId());
        setFromAddress(from.getFromAddress());
        setCurrencyId(from.getCurrencyId());
        setCompanyId(from.getCompanyId());
        setActive(from.getActive());
        setSigma(from.getSigma());
        setMetadata(from.getMetadata());
        setLanguage(from.getLanguage());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    @Override
    public <E extends IPBuyOrder> E into(E into) {
        into.from(this);
        return into;
    }
}
