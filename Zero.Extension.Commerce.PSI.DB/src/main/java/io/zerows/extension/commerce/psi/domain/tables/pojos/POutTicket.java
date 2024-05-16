/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.psi.domain.tables.pojos;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.zerows.extension.commerce.psi.domain.tables.interfaces.IPOutTicket;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class POutTicket implements VertxPojo, IPOutTicket {

    private static final long serialVersionUID = 1L;

    private String key;
    private String serial;
    private String type;
    private String typeBusiness;
    private String status;
    private String whId;
    private String customerId;
    private String customerInfo;
    private LocalDateTime opAt;
    private String opBy;
    private String opDept;
    private String tags;
    private String comment;
    private BigDecimal amount;
    private String approvedBy;
    private LocalDateTime approvedAt;
    private String toId;
    private String toAddress;
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

    public POutTicket() {
    }

    public POutTicket(IPOutTicket value) {
        this.key = value.getKey();
        this.serial = value.getSerial();
        this.type = value.getType();
        this.typeBusiness = value.getTypeBusiness();
        this.status = value.getStatus();
        this.whId = value.getWhId();
        this.customerId = value.getCustomerId();
        this.customerInfo = value.getCustomerInfo();
        this.opAt = value.getOpAt();
        this.opBy = value.getOpBy();
        this.opDept = value.getOpDept();
        this.tags = value.getTags();
        this.comment = value.getComment();
        this.amount = value.getAmount();
        this.approvedBy = value.getApprovedBy();
        this.approvedAt = value.getApprovedAt();
        this.toId = value.getToId();
        this.toAddress = value.getToAddress();
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

    public POutTicket(
        String key,
        String serial,
        String type,
        String typeBusiness,
        String status,
        String whId,
        String customerId,
        String customerInfo,
        LocalDateTime opAt,
        String opBy,
        String opDept,
        String tags,
        String comment,
        BigDecimal amount,
        String approvedBy,
        LocalDateTime approvedAt,
        String toId,
        String toAddress,
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
        this.typeBusiness = typeBusiness;
        this.status = status;
        this.whId = whId;
        this.customerId = customerId;
        this.customerInfo = customerInfo;
        this.opAt = opAt;
        this.opBy = opBy;
        this.opDept = opDept;
        this.tags = tags;
        this.comment = comment;
        this.amount = amount;
        this.approvedBy = approvedBy;
        this.approvedAt = approvedAt;
        this.toId = toId;
        this.toAddress = toAddress;
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

    public POutTicket(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    /**
     * Getter for <code>ZDB.P_OUT_TICKET.KEY</code>. 「key」- 出库单主键
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>ZDB.P_OUT_TICKET.KEY</code>. 「key」- 出库单主键
     */
    @Override
    public POutTicket setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_OUT_TICKET.SERIAL</code>. 「serial」-
     * 出库单号（系统可用，直接计算）
     */
    @Override
    public String getSerial() {
        return this.serial;
    }

    /**
     * Setter for <code>ZDB.P_OUT_TICKET.SERIAL</code>. 「serial」-
     * 出库单号（系统可用，直接计算）
     */
    @Override
    public POutTicket setSerial(String serial) {
        this.serial = serial;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_OUT_TICKET.TYPE</code>. 「type」- 单据类型
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>ZDB.P_OUT_TICKET.TYPE</code>. 「type」- 单据类型
     */
    @Override
    public POutTicket setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_OUT_TICKET.TYPE_BUSINESS</code>. 「typeBusiness」-
     * 业务类型
     */
    @Override
    public String getTypeBusiness() {
        return this.typeBusiness;
    }

    /**
     * Setter for <code>ZDB.P_OUT_TICKET.TYPE_BUSINESS</code>. 「typeBusiness」-
     * 业务类型
     */
    @Override
    public POutTicket setTypeBusiness(String typeBusiness) {
        this.typeBusiness = typeBusiness;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_OUT_TICKET.STATUS</code>. 「status」- 订单状态
     */
    @Override
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>ZDB.P_OUT_TICKET.STATUS</code>. 「status」- 订单状态
     */
    @Override
    public POutTicket setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_OUT_TICKET.WH_ID</code>. 「whId」- 出库仓库
     */
    @Override
    public String getWhId() {
        return this.whId;
    }

    /**
     * Setter for <code>ZDB.P_OUT_TICKET.WH_ID</code>. 「whId」- 出库仓库
     */
    @Override
    public POutTicket setWhId(String whId) {
        this.whId = whId;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_OUT_TICKET.CUSTOMER_ID</code>. 「customerId」- 客户ID
     */
    @Override
    public String getCustomerId() {
        return this.customerId;
    }

    /**
     * Setter for <code>ZDB.P_OUT_TICKET.CUSTOMER_ID</code>. 「customerId」- 客户ID
     */
    @Override
    public POutTicket setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_OUT_TICKET.CUSTOMER_INFO</code>. 「customerInfo」-
     * 客户联系信息
     */
    @Override
    public String getCustomerInfo() {
        return this.customerInfo;
    }

    /**
     * Setter for <code>ZDB.P_OUT_TICKET.CUSTOMER_INFO</code>. 「customerInfo」-
     * 客户联系信息
     */
    @Override
    public POutTicket setCustomerInfo(String customerInfo) {
        this.customerInfo = customerInfo;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_OUT_TICKET.OP_AT</code>. 「opAt」- 单据日期
     */
    @Override
    public LocalDateTime getOpAt() {
        return this.opAt;
    }

    /**
     * Setter for <code>ZDB.P_OUT_TICKET.OP_AT</code>. 「opAt」- 单据日期
     */
    @Override
    public POutTicket setOpAt(LocalDateTime opAt) {
        this.opAt = opAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_OUT_TICKET.OP_BY</code>. 「opBy」- 业务员
     */
    @Override
    public String getOpBy() {
        return this.opBy;
    }

    /**
     * Setter for <code>ZDB.P_OUT_TICKET.OP_BY</code>. 「opBy」- 业务员
     */
    @Override
    public POutTicket setOpBy(String opBy) {
        this.opBy = opBy;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_OUT_TICKET.OP_DEPT</code>. 「opDept」- 业务部门
     */
    @Override
    public String getOpDept() {
        return this.opDept;
    }

    /**
     * Setter for <code>ZDB.P_OUT_TICKET.OP_DEPT</code>. 「opDept」- 业务部门
     */
    @Override
    public POutTicket setOpDept(String opDept) {
        this.opDept = opDept;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_OUT_TICKET.TAGS</code>. 「tags」- 单据标签
     */
    @Override
    public String getTags() {
        return this.tags;
    }

    /**
     * Setter for <code>ZDB.P_OUT_TICKET.TAGS</code>. 「tags」- 单据标签
     */
    @Override
    public POutTicket setTags(String tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_OUT_TICKET.COMMENT</code>. 「comment」- 单据备注
     */
    @Override
    public String getComment() {
        return this.comment;
    }

    /**
     * Setter for <code>ZDB.P_OUT_TICKET.COMMENT</code>. 「comment」- 单据备注
     */
    @Override
    public POutTicket setComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_OUT_TICKET.AMOUNT</code>. 「amount」- 出库单总额
     */
    @Override
    public BigDecimal getAmount() {
        return this.amount;
    }

    /**
     * Setter for <code>ZDB.P_OUT_TICKET.AMOUNT</code>. 「amount」- 出库单总额
     */
    @Override
    public POutTicket setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_OUT_TICKET.APPROVED_BY</code>. 「approvedBy」- 审核人
     */
    @Override
    public String getApprovedBy() {
        return this.approvedBy;
    }

    /**
     * Setter for <code>ZDB.P_OUT_TICKET.APPROVED_BY</code>. 「approvedBy」- 审核人
     */
    @Override
    public POutTicket setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_OUT_TICKET.APPROVED_AT</code>. 「approvedAt」- 审核时间
     */
    @Override
    public LocalDateTime getApprovedAt() {
        return this.approvedAt;
    }

    /**
     * Setter for <code>ZDB.P_OUT_TICKET.APPROVED_AT</code>. 「approvedAt」- 审核时间
     */
    @Override
    public POutTicket setApprovedAt(LocalDateTime approvedAt) {
        this.approvedAt = approvedAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_OUT_TICKET.TO_ID</code>. 「toId」- 收货地址ID
     */
    @Override
    public String getToId() {
        return this.toId;
    }

    /**
     * Setter for <code>ZDB.P_OUT_TICKET.TO_ID</code>. 「toId」- 收货地址ID
     */
    @Override
    public POutTicket setToId(String toId) {
        this.toId = toId;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_OUT_TICKET.TO_ADDRESS</code>. 「toAddress」- 收货地址
     */
    @Override
    public String getToAddress() {
        return this.toAddress;
    }

    /**
     * Setter for <code>ZDB.P_OUT_TICKET.TO_ADDRESS</code>. 「toAddress」- 收货地址
     */
    @Override
    public POutTicket setToAddress(String toAddress) {
        this.toAddress = toAddress;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_OUT_TICKET.CURRENCY_ID</code>. 「currencyId」- 币种
     */
    @Override
    public String getCurrencyId() {
        return this.currencyId;
    }

    /**
     * Setter for <code>ZDB.P_OUT_TICKET.CURRENCY_ID</code>. 「currencyId」- 币种
     */
    @Override
    public POutTicket setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_OUT_TICKET.COMPANY_ID</code>. 「companyId」- 所属公司
     */
    @Override
    public String getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for <code>ZDB.P_OUT_TICKET.COMPANY_ID</code>. 「companyId」- 所属公司
     */
    @Override
    public POutTicket setCompanyId(String companyId) {
        this.companyId = companyId;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_OUT_TICKET.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>ZDB.P_OUT_TICKET.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public POutTicket setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_OUT_TICKET.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>ZDB.P_OUT_TICKET.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public POutTicket setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_OUT_TICKET.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>ZDB.P_OUT_TICKET.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public POutTicket setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_OUT_TICKET.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>ZDB.P_OUT_TICKET.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public POutTicket setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_OUT_TICKET.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>ZDB.P_OUT_TICKET.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public POutTicket setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_OUT_TICKET.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>ZDB.P_OUT_TICKET.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public POutTicket setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_OUT_TICKET.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>ZDB.P_OUT_TICKET.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public POutTicket setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.P_OUT_TICKET.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>ZDB.P_OUT_TICKET.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public POutTicket setUpdatedBy(String updatedBy) {
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
        final POutTicket other = (POutTicket) obj;
        if (this.key == null) {
            if (other.key != null)
                return false;
        } else if (!this.key.equals(other.key))
            return false;
        if (this.serial == null) {
            if (other.serial != null)
                return false;
        } else if (!this.serial.equals(other.serial))
            return false;
        if (this.type == null) {
            if (other.type != null)
                return false;
        } else if (!this.type.equals(other.type))
            return false;
        if (this.typeBusiness == null) {
            if (other.typeBusiness != null)
                return false;
        } else if (!this.typeBusiness.equals(other.typeBusiness))
            return false;
        if (this.status == null) {
            if (other.status != null)
                return false;
        } else if (!this.status.equals(other.status))
            return false;
        if (this.whId == null) {
            if (other.whId != null)
                return false;
        } else if (!this.whId.equals(other.whId))
            return false;
        if (this.customerId == null) {
            if (other.customerId != null)
                return false;
        } else if (!this.customerId.equals(other.customerId))
            return false;
        if (this.customerInfo == null) {
            if (other.customerInfo != null)
                return false;
        } else if (!this.customerInfo.equals(other.customerInfo))
            return false;
        if (this.opAt == null) {
            if (other.opAt != null)
                return false;
        } else if (!this.opAt.equals(other.opAt))
            return false;
        if (this.opBy == null) {
            if (other.opBy != null)
                return false;
        } else if (!this.opBy.equals(other.opBy))
            return false;
        if (this.opDept == null) {
            if (other.opDept != null)
                return false;
        } else if (!this.opDept.equals(other.opDept))
            return false;
        if (this.tags == null) {
            if (other.tags != null)
                return false;
        } else if (!this.tags.equals(other.tags))
            return false;
        if (this.comment == null) {
            if (other.comment != null)
                return false;
        } else if (!this.comment.equals(other.comment))
            return false;
        if (this.amount == null) {
            if (other.amount != null)
                return false;
        } else if (!this.amount.equals(other.amount))
            return false;
        if (this.approvedBy == null) {
            if (other.approvedBy != null)
                return false;
        } else if (!this.approvedBy.equals(other.approvedBy))
            return false;
        if (this.approvedAt == null) {
            if (other.approvedAt != null)
                return false;
        } else if (!this.approvedAt.equals(other.approvedAt))
            return false;
        if (this.toId == null) {
            if (other.toId != null)
                return false;
        } else if (!this.toId.equals(other.toId))
            return false;
        if (this.toAddress == null) {
            if (other.toAddress != null)
                return false;
        } else if (!this.toAddress.equals(other.toAddress))
            return false;
        if (this.currencyId == null) {
            if (other.currencyId != null)
                return false;
        } else if (!this.currencyId.equals(other.currencyId))
            return false;
        if (this.companyId == null) {
            if (other.companyId != null)
                return false;
        } else if (!this.companyId.equals(other.companyId))
            return false;
        if (this.active == null) {
            if (other.active != null)
                return false;
        } else if (!this.active.equals(other.active))
            return false;
        if (this.sigma == null) {
            if (other.sigma != null)
                return false;
        } else if (!this.sigma.equals(other.sigma))
            return false;
        if (this.metadata == null) {
            if (other.metadata != null)
                return false;
        } else if (!this.metadata.equals(other.metadata))
            return false;
        if (this.language == null) {
            if (other.language != null)
                return false;
        } else if (!this.language.equals(other.language))
            return false;
        if (this.createdAt == null) {
            if (other.createdAt != null)
                return false;
        } else if (!this.createdAt.equals(other.createdAt))
            return false;
        if (this.createdBy == null) {
            if (other.createdBy != null)
                return false;
        } else if (!this.createdBy.equals(other.createdBy))
            return false;
        if (this.updatedAt == null) {
            if (other.updatedAt != null)
                return false;
        } else if (!this.updatedAt.equals(other.updatedAt))
            return false;
        if (this.updatedBy == null) {
            if (other.updatedBy != null)
                return false;
        } else if (!this.updatedBy.equals(other.updatedBy))
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
        result = prime * result + ((this.typeBusiness == null) ? 0 : this.typeBusiness.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.whId == null) ? 0 : this.whId.hashCode());
        result = prime * result + ((this.customerId == null) ? 0 : this.customerId.hashCode());
        result = prime * result + ((this.customerInfo == null) ? 0 : this.customerInfo.hashCode());
        result = prime * result + ((this.opAt == null) ? 0 : this.opAt.hashCode());
        result = prime * result + ((this.opBy == null) ? 0 : this.opBy.hashCode());
        result = prime * result + ((this.opDept == null) ? 0 : this.opDept.hashCode());
        result = prime * result + ((this.tags == null) ? 0 : this.tags.hashCode());
        result = prime * result + ((this.comment == null) ? 0 : this.comment.hashCode());
        result = prime * result + ((this.amount == null) ? 0 : this.amount.hashCode());
        result = prime * result + ((this.approvedBy == null) ? 0 : this.approvedBy.hashCode());
        result = prime * result + ((this.approvedAt == null) ? 0 : this.approvedAt.hashCode());
        result = prime * result + ((this.toId == null) ? 0 : this.toId.hashCode());
        result = prime * result + ((this.toAddress == null) ? 0 : this.toAddress.hashCode());
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
        StringBuilder sb = new StringBuilder("POutTicket (");

        sb.append(key);
        sb.append(", ").append(serial);
        sb.append(", ").append(type);
        sb.append(", ").append(typeBusiness);
        sb.append(", ").append(status);
        sb.append(", ").append(whId);
        sb.append(", ").append(customerId);
        sb.append(", ").append(customerInfo);
        sb.append(", ").append(opAt);
        sb.append(", ").append(opBy);
        sb.append(", ").append(opDept);
        sb.append(", ").append(tags);
        sb.append(", ").append(comment);
        sb.append(", ").append(amount);
        sb.append(", ").append(approvedBy);
        sb.append(", ").append(approvedAt);
        sb.append(", ").append(toId);
        sb.append(", ").append(toAddress);
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
    public void from(IPOutTicket from) {
        setKey(from.getKey());
        setSerial(from.getSerial());
        setType(from.getType());
        setTypeBusiness(from.getTypeBusiness());
        setStatus(from.getStatus());
        setWhId(from.getWhId());
        setCustomerId(from.getCustomerId());
        setCustomerInfo(from.getCustomerInfo());
        setOpAt(from.getOpAt());
        setOpBy(from.getOpBy());
        setOpDept(from.getOpDept());
        setTags(from.getTags());
        setComment(from.getComment());
        setAmount(from.getAmount());
        setApprovedBy(from.getApprovedBy());
        setApprovedAt(from.getApprovedAt());
        setToId(from.getToId());
        setToAddress(from.getToAddress());
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
    public <E extends IPOutTicket> E into(E into) {
        into.from(this);
        return into;
    }
}