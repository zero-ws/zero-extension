/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.finance.domain.tables.pojos;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.zerows.extension.commerce.finance.domain.tables.interfaces.IFDebt;

import java.math.BigDecimal;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FDebt implements VertxPojo, IFDebt {

    private static final long serialVersionUID = 1L;

    private String key;
    private String name;
    private String code;
    private String serial;
    private String type;
    private BigDecimal amount;
    private BigDecimal amountBalance;
    private Boolean finished;
    private LocalDateTime finishedAt;
    private String signName;
    private String signMobile;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private String groupBy;
    private String comment;
    private String customerId;
    private String sigma;
    private String language;
    private Boolean active;
    private String metadata;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public FDebt() {}

    public FDebt(IFDebt value) {
        this.key = value.getKey();
        this.name = value.getName();
        this.code = value.getCode();
        this.serial = value.getSerial();
        this.type = value.getType();
        this.amount = value.getAmount();
        this.amountBalance = value.getAmountBalance();
        this.finished = value.getFinished();
        this.finishedAt = value.getFinishedAt();
        this.signName = value.getSignName();
        this.signMobile = value.getSignMobile();
        this.startAt = value.getStartAt();
        this.endAt = value.getEndAt();
        this.groupBy = value.getGroupBy();
        this.comment = value.getComment();
        this.customerId = value.getCustomerId();
        this.sigma = value.getSigma();
        this.language = value.getLanguage();
        this.active = value.getActive();
        this.metadata = value.getMetadata();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public FDebt(
        String key,
        String name,
        String code,
        String serial,
        String type,
        BigDecimal amount,
        BigDecimal amountBalance,
        Boolean finished,
        LocalDateTime finishedAt,
        String signName,
        String signMobile,
        LocalDateTime startAt,
        LocalDateTime endAt,
        String groupBy,
        String comment,
        String customerId,
        String sigma,
        String language,
        Boolean active,
        String metadata,
        LocalDateTime createdAt,
        String createdBy,
        LocalDateTime updatedAt,
        String updatedBy
    ) {
        this.key = key;
        this.name = name;
        this.code = code;
        this.serial = serial;
        this.type = type;
        this.amount = amount;
        this.amountBalance = amountBalance;
        this.finished = finished;
        this.finishedAt = finishedAt;
        this.signName = signName;
        this.signMobile = signMobile;
        this.startAt = startAt;
        this.endAt = endAt;
        this.groupBy = groupBy;
        this.comment = comment;
        this.customerId = customerId;
        this.sigma = sigma;
        this.language = language;
        this.active = active;
        this.metadata = metadata;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public FDebt(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>ZDB.F_DEBT.KEY</code>. 「key」- 应收账单主键ID
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>ZDB.F_DEBT.KEY</code>. 「key」- 应收账单主键ID
     */
    @Override
    public FDebt setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_DEBT.NAME</code>. 「name」 - 应收单标题
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>ZDB.F_DEBT.NAME</code>. 「name」 - 应收单标题
     */
    @Override
    public FDebt setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_DEBT.CODE</code>. 「code」 - 应收单编号
     */
    @Override
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>ZDB.F_DEBT.CODE</code>. 「code」 - 应收单编号
     */
    @Override
    public FDebt setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_DEBT.SERIAL</code>. 「serial」 - 应收单据号
     */
    @Override
    public String getSerial() {
        return this.serial;
    }

    /**
     * Setter for <code>ZDB.F_DEBT.SERIAL</code>. 「serial」 - 应收单据号
     */
    @Override
    public FDebt setSerial(String serial) {
        this.serial = serial;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_DEBT.TYPE</code>. 「type」- 类型
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>ZDB.F_DEBT.TYPE</code>. 「type」- 类型
     */
    @Override
    public FDebt setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_DEBT.AMOUNT</code>. 「amount」——价税合计，所有明细对应的实际结算金额
     */
    @Override
    public BigDecimal getAmount() {
        return this.amount;
    }

    /**
     * Setter for <code>ZDB.F_DEBT.AMOUNT</code>. 「amount」——价税合计，所有明细对应的实际结算金额
     */
    @Override
    public FDebt setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_DEBT.AMOUNT_BALANCE</code>. 「amountBalance」——剩余金额
     */
    @Override
    public BigDecimal getAmountBalance() {
        return this.amountBalance;
    }

    /**
     * Setter for <code>ZDB.F_DEBT.AMOUNT_BALANCE</code>. 「amountBalance」——剩余金额
     */
    @Override
    public FDebt setAmountBalance(BigDecimal amountBalance) {
        this.amountBalance = amountBalance;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_DEBT.FINISHED</code>. 「finished」- 是否完成
     */
    @Override
    public Boolean getFinished() {
        return this.finished;
    }

    /**
     * Setter for <code>ZDB.F_DEBT.FINISHED</code>. 「finished」- 是否完成
     */
    @Override
    public FDebt setFinished(Boolean finished) {
        this.finished = finished;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_DEBT.FINISHED_AT</code>. 「createdAt」- 完成时间
     */
    @Override
    public LocalDateTime getFinishedAt() {
        return this.finishedAt;
    }

    /**
     * Setter for <code>ZDB.F_DEBT.FINISHED_AT</code>. 「createdAt」- 完成时间
     */
    @Override
    public FDebt setFinishedAt(LocalDateTime finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_DEBT.SIGN_NAME</code>. 「signName」签单人姓名
     */
    @Override
    public String getSignName() {
        return this.signName;
    }

    /**
     * Setter for <code>ZDB.F_DEBT.SIGN_NAME</code>. 「signName」签单人姓名
     */
    @Override
    public FDebt setSignName(String signName) {
        this.signName = signName;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_DEBT.SIGN_MOBILE</code>. 「signMobile」签单人电话
     */
    @Override
    public String getSignMobile() {
        return this.signMobile;
    }

    /**
     * Setter for <code>ZDB.F_DEBT.SIGN_MOBILE</code>. 「signMobile」签单人电话
     */
    @Override
    public FDebt setSignMobile(String signMobile) {
        this.signMobile = signMobile;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_DEBT.START_AT</code>. 「startAt」- 开始时间
     */
    @Override
    public LocalDateTime getStartAt() {
        return this.startAt;
    }

    /**
     * Setter for <code>ZDB.F_DEBT.START_AT</code>. 「startAt」- 开始时间
     */
    @Override
    public FDebt setStartAt(LocalDateTime startAt) {
        this.startAt = startAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_DEBT.END_AT</code>. 「endAt」- 结束时间
     */
    @Override
    public LocalDateTime getEndAt() {
        return this.endAt;
    }

    /**
     * Setter for <code>ZDB.F_DEBT.END_AT</code>. 「endAt」- 结束时间
     */
    @Override
    public FDebt setEndAt(LocalDateTime endAt) {
        this.endAt = endAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_DEBT.GROUP_BY</code>. 「groupBy」- 分组
     */
    @Override
    public String getGroupBy() {
        return this.groupBy;
    }

    /**
     * Setter for <code>ZDB.F_DEBT.GROUP_BY</code>. 「groupBy」- 分组
     */
    @Override
    public FDebt setGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_DEBT.COMMENT</code>. 「comment」 - 备注
     */
    @Override
    public String getComment() {
        return this.comment;
    }

    /**
     * Setter for <code>ZDB.F_DEBT.COMMENT</code>. 「comment」 - 备注
     */
    @Override
    public FDebt setComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_DEBT.CUSTOMER_ID</code>. 「customerId」结算对象（单位ID）
     */
    @Override
    public String getCustomerId() {
        return this.customerId;
    }

    /**
     * Setter for <code>ZDB.F_DEBT.CUSTOMER_ID</code>. 「customerId」结算对象（单位ID）
     */
    @Override
    public FDebt setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_DEBT.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>ZDB.F_DEBT.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public FDebt setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_DEBT.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>ZDB.F_DEBT.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public FDebt setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_DEBT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>ZDB.F_DEBT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public FDebt setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_DEBT.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>ZDB.F_DEBT.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public FDebt setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_DEBT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>ZDB.F_DEBT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public FDebt setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_DEBT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>ZDB.F_DEBT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public FDebt setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_DEBT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>ZDB.F_DEBT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public FDebt setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_DEBT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>ZDB.F_DEBT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public FDebt setUpdatedBy(String updatedBy) {
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
        final FDebt other = (FDebt) obj;
        if (this.key == null) {
            if (other.key != null)
                return false;
        }
        else if (!this.key.equals(other.key))
            return false;
        if (this.name == null) {
            if (other.name != null)
                return false;
        }
        else if (!this.name.equals(other.name))
            return false;
        if (this.code == null) {
            if (other.code != null)
                return false;
        }
        else if (!this.code.equals(other.code))
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
        if (this.amount == null) {
            if (other.amount != null)
                return false;
        }
        else if (!this.amount.equals(other.amount))
            return false;
        if (this.amountBalance == null) {
            if (other.amountBalance != null)
                return false;
        }
        else if (!this.amountBalance.equals(other.amountBalance))
            return false;
        if (this.finished == null) {
            if (other.finished != null)
                return false;
        }
        else if (!this.finished.equals(other.finished))
            return false;
        if (this.finishedAt == null) {
            if (other.finishedAt != null)
                return false;
        }
        else if (!this.finishedAt.equals(other.finishedAt))
            return false;
        if (this.signName == null) {
            if (other.signName != null)
                return false;
        }
        else if (!this.signName.equals(other.signName))
            return false;
        if (this.signMobile == null) {
            if (other.signMobile != null)
                return false;
        }
        else if (!this.signMobile.equals(other.signMobile))
            return false;
        if (this.startAt == null) {
            if (other.startAt != null)
                return false;
        }
        else if (!this.startAt.equals(other.startAt))
            return false;
        if (this.endAt == null) {
            if (other.endAt != null)
                return false;
        }
        else if (!this.endAt.equals(other.endAt))
            return false;
        if (this.groupBy == null) {
            if (other.groupBy != null)
                return false;
        }
        else if (!this.groupBy.equals(other.groupBy))
            return false;
        if (this.comment == null) {
            if (other.comment != null)
                return false;
        }
        else if (!this.comment.equals(other.comment))
            return false;
        if (this.customerId == null) {
            if (other.customerId != null)
                return false;
        }
        else if (!this.customerId.equals(other.customerId))
            return false;
        if (this.sigma == null) {
            if (other.sigma != null)
                return false;
        }
        else if (!this.sigma.equals(other.sigma))
            return false;
        if (this.language == null) {
            if (other.language != null)
                return false;
        }
        else if (!this.language.equals(other.language))
            return false;
        if (this.active == null) {
            if (other.active != null)
                return false;
        }
        else if (!this.active.equals(other.active))
            return false;
        if (this.metadata == null) {
            if (other.metadata != null)
                return false;
        }
        else if (!this.metadata.equals(other.metadata))
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
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.code == null) ? 0 : this.code.hashCode());
        result = prime * result + ((this.serial == null) ? 0 : this.serial.hashCode());
        result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
        result = prime * result + ((this.amount == null) ? 0 : this.amount.hashCode());
        result = prime * result + ((this.amountBalance == null) ? 0 : this.amountBalance.hashCode());
        result = prime * result + ((this.finished == null) ? 0 : this.finished.hashCode());
        result = prime * result + ((this.finishedAt == null) ? 0 : this.finishedAt.hashCode());
        result = prime * result + ((this.signName == null) ? 0 : this.signName.hashCode());
        result = prime * result + ((this.signMobile == null) ? 0 : this.signMobile.hashCode());
        result = prime * result + ((this.startAt == null) ? 0 : this.startAt.hashCode());
        result = prime * result + ((this.endAt == null) ? 0 : this.endAt.hashCode());
        result = prime * result + ((this.groupBy == null) ? 0 : this.groupBy.hashCode());
        result = prime * result + ((this.comment == null) ? 0 : this.comment.hashCode());
        result = prime * result + ((this.customerId == null) ? 0 : this.customerId.hashCode());
        result = prime * result + ((this.sigma == null) ? 0 : this.sigma.hashCode());
        result = prime * result + ((this.language == null) ? 0 : this.language.hashCode());
        result = prime * result + ((this.active == null) ? 0 : this.active.hashCode());
        result = prime * result + ((this.metadata == null) ? 0 : this.metadata.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.updatedAt == null) ? 0 : this.updatedAt.hashCode());
        result = prime * result + ((this.updatedBy == null) ? 0 : this.updatedBy.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("FDebt (");

        sb.append(key);
        sb.append(", ").append(name);
        sb.append(", ").append(code);
        sb.append(", ").append(serial);
        sb.append(", ").append(type);
        sb.append(", ").append(amount);
        sb.append(", ").append(amountBalance);
        sb.append(", ").append(finished);
        sb.append(", ").append(finishedAt);
        sb.append(", ").append(signName);
        sb.append(", ").append(signMobile);
        sb.append(", ").append(startAt);
        sb.append(", ").append(endAt);
        sb.append(", ").append(groupBy);
        sb.append(", ").append(comment);
        sb.append(", ").append(customerId);
        sb.append(", ").append(sigma);
        sb.append(", ").append(language);
        sb.append(", ").append(active);
        sb.append(", ").append(metadata);
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
    public void from(IFDebt from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setSerial(from.getSerial());
        setType(from.getType());
        setAmount(from.getAmount());
        setAmountBalance(from.getAmountBalance());
        setFinished(from.getFinished());
        setFinishedAt(from.getFinishedAt());
        setSignName(from.getSignName());
        setSignMobile(from.getSignMobile());
        setStartAt(from.getStartAt());
        setEndAt(from.getEndAt());
        setGroupBy(from.getGroupBy());
        setComment(from.getComment());
        setCustomerId(from.getCustomerId());
        setSigma(from.getSigma());
        setLanguage(from.getLanguage());
        setActive(from.getActive());
        setMetadata(from.getMetadata());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    @Override
    public <E extends IFDebt> E into(E into) {
        into.from(this);
        return into;
    }
}
