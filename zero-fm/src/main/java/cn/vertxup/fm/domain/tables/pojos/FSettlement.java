/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.fm.domain.tables.pojos;


import cn.vertxup.fm.domain.tables.interfaces.IFSettlement;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.math.BigDecimal;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FSettlement implements VertxPojo, IFSettlement {

    private static final long serialVersionUID = 1L;

    private String key;
    private String code;
    private String serial;
    private BigDecimal amount;
    private String comment;
    private String rounded;
    private Boolean finished;
    private LocalDateTime finishedAt;
    private String signName;
    private String signMobile;
    private String customerId;
    private String relatedId;
    private String sigma;
    private String language;
    private Boolean active;
    private String metadata;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public FSettlement() {}

    public FSettlement(IFSettlement value) {
        this.key = value.getKey();
        this.code = value.getCode();
        this.serial = value.getSerial();
        this.amount = value.getAmount();
        this.comment = value.getComment();
        this.rounded = value.getRounded();
        this.finished = value.getFinished();
        this.finishedAt = value.getFinishedAt();
        this.signName = value.getSignName();
        this.signMobile = value.getSignMobile();
        this.customerId = value.getCustomerId();
        this.relatedId = value.getRelatedId();
        this.sigma = value.getSigma();
        this.language = value.getLanguage();
        this.active = value.getActive();
        this.metadata = value.getMetadata();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public FSettlement(
        String key,
        String code,
        String serial,
        BigDecimal amount,
        String comment,
        String rounded,
        Boolean finished,
        LocalDateTime finishedAt,
        String signName,
        String signMobile,
        String customerId,
        String relatedId,
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
        this.code = code;
        this.serial = serial;
        this.amount = amount;
        this.comment = comment;
        this.rounded = rounded;
        this.finished = finished;
        this.finishedAt = finishedAt;
        this.signName = signName;
        this.signMobile = signMobile;
        this.customerId = customerId;
        this.relatedId = relatedId;
        this.sigma = sigma;
        this.language = language;
        this.active = active;
        this.metadata = metadata;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public FSettlement(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>ZDB.F_SETTLEMENT.KEY</code>. 「key」- 结算单主键
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>ZDB.F_SETTLEMENT.KEY</code>. 「key」- 结算单主键
     */
    @Override
    public FSettlement setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_SETTLEMENT.CODE</code>. 「code」 - 结算单编号
     */
    @Override
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>ZDB.F_SETTLEMENT.CODE</code>. 「code」 - 结算单编号
     */
    @Override
    public FSettlement setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_SETTLEMENT.SERIAL</code>. 「serial」 - 结算单据号
     */
    @Override
    public String getSerial() {
        return this.serial;
    }

    /**
     * Setter for <code>ZDB.F_SETTLEMENT.SERIAL</code>. 「serial」 - 结算单据号
     */
    @Override
    public FSettlement setSerial(String serial) {
        this.serial = serial;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_SETTLEMENT.AMOUNT</code>.
     * 「amount」——价税合计，所有明细对应的实际结算金额
     */
    @Override
    public BigDecimal getAmount() {
        return this.amount;
    }

    /**
     * Setter for <code>ZDB.F_SETTLEMENT.AMOUNT</code>.
     * 「amount」——价税合计，所有明细对应的实际结算金额
     */
    @Override
    public FSettlement setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_SETTLEMENT.COMMENT</code>. 「comment」 - 结算单备注
     */
    @Override
    public String getComment() {
        return this.comment;
    }

    /**
     * Setter for <code>ZDB.F_SETTLEMENT.COMMENT</code>. 「comment」 - 结算单备注
     */
    @Override
    public FSettlement setComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_SETTLEMENT.ROUNDED</code>. 「rounded」抹零方式：四舍五入,
     * HALF：零头舍掉, FLOOR, 零头入进, CEIL
     */
    @Override
    public String getRounded() {
        return this.rounded;
    }

    /**
     * Setter for <code>ZDB.F_SETTLEMENT.ROUNDED</code>. 「rounded」抹零方式：四舍五入,
     * HALF：零头舍掉, FLOOR, 零头入进, CEIL
     */
    @Override
    public FSettlement setRounded(String rounded) {
        this.rounded = rounded;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_SETTLEMENT.FINISHED</code>. 「finished」- 是否完成
     */
    @Override
    public Boolean getFinished() {
        return this.finished;
    }

    /**
     * Setter for <code>ZDB.F_SETTLEMENT.FINISHED</code>. 「finished」- 是否完成
     */
    @Override
    public FSettlement setFinished(Boolean finished) {
        this.finished = finished;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_SETTLEMENT.FINISHED_AT</code>. 「createdAt」- 完成时间
     */
    @Override
    public LocalDateTime getFinishedAt() {
        return this.finishedAt;
    }

    /**
     * Setter for <code>ZDB.F_SETTLEMENT.FINISHED_AT</code>. 「createdAt」- 完成时间
     */
    @Override
    public FSettlement setFinishedAt(LocalDateTime finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_SETTLEMENT.SIGN_NAME</code>. 「signName」签单人姓名
     */
    @Override
    public String getSignName() {
        return this.signName;
    }

    /**
     * Setter for <code>ZDB.F_SETTLEMENT.SIGN_NAME</code>. 「signName」签单人姓名
     */
    @Override
    public FSettlement setSignName(String signName) {
        this.signName = signName;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_SETTLEMENT.SIGN_MOBILE</code>. 「signMobile」签单人电话
     */
    @Override
    public String getSignMobile() {
        return this.signMobile;
    }

    /**
     * Setter for <code>ZDB.F_SETTLEMENT.SIGN_MOBILE</code>. 「signMobile」签单人电话
     */
    @Override
    public FSettlement setSignMobile(String signMobile) {
        this.signMobile = signMobile;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_SETTLEMENT.CUSTOMER_ID</code>.
     * 「customerId」结算对象（单位ID）
     */
    @Override
    public String getCustomerId() {
        return this.customerId;
    }

    /**
     * Setter for <code>ZDB.F_SETTLEMENT.CUSTOMER_ID</code>.
     * 「customerId」结算对象（单位ID）
     */
    @Override
    public FSettlement setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_SETTLEMENT.RELATED_ID</code>.
     * 「relatedId」关联ID（批次、订单、其他）
     */
    @Override
    public String getRelatedId() {
        return this.relatedId;
    }

    /**
     * Setter for <code>ZDB.F_SETTLEMENT.RELATED_ID</code>.
     * 「relatedId」关联ID（批次、订单、其他）
     */
    @Override
    public FSettlement setRelatedId(String relatedId) {
        this.relatedId = relatedId;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_SETTLEMENT.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>ZDB.F_SETTLEMENT.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public FSettlement setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_SETTLEMENT.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>ZDB.F_SETTLEMENT.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public FSettlement setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_SETTLEMENT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>ZDB.F_SETTLEMENT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public FSettlement setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_SETTLEMENT.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>ZDB.F_SETTLEMENT.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public FSettlement setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_SETTLEMENT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>ZDB.F_SETTLEMENT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public FSettlement setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_SETTLEMENT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>ZDB.F_SETTLEMENT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public FSettlement setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_SETTLEMENT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>ZDB.F_SETTLEMENT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public FSettlement setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_SETTLEMENT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>ZDB.F_SETTLEMENT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public FSettlement setUpdatedBy(String updatedBy) {
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
        final FSettlement other = (FSettlement) obj;
        if (this.key == null) {
            if (other.key != null)
                return false;
        }
        else if (!this.key.equals(other.key))
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
        if (this.amount == null) {
            if (other.amount != null)
                return false;
        }
        else if (!this.amount.equals(other.amount))
            return false;
        if (this.comment == null) {
            if (other.comment != null)
                return false;
        }
        else if (!this.comment.equals(other.comment))
            return false;
        if (this.rounded == null) {
            if (other.rounded != null)
                return false;
        }
        else if (!this.rounded.equals(other.rounded))
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
        if (this.customerId == null) {
            if (other.customerId != null)
                return false;
        }
        else if (!this.customerId.equals(other.customerId))
            return false;
        if (this.relatedId == null) {
            if (other.relatedId != null)
                return false;
        }
        else if (!this.relatedId.equals(other.relatedId))
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
        result = prime * result + ((this.code == null) ? 0 : this.code.hashCode());
        result = prime * result + ((this.serial == null) ? 0 : this.serial.hashCode());
        result = prime * result + ((this.amount == null) ? 0 : this.amount.hashCode());
        result = prime * result + ((this.comment == null) ? 0 : this.comment.hashCode());
        result = prime * result + ((this.rounded == null) ? 0 : this.rounded.hashCode());
        result = prime * result + ((this.finished == null) ? 0 : this.finished.hashCode());
        result = prime * result + ((this.finishedAt == null) ? 0 : this.finishedAt.hashCode());
        result = prime * result + ((this.signName == null) ? 0 : this.signName.hashCode());
        result = prime * result + ((this.signMobile == null) ? 0 : this.signMobile.hashCode());
        result = prime * result + ((this.customerId == null) ? 0 : this.customerId.hashCode());
        result = prime * result + ((this.relatedId == null) ? 0 : this.relatedId.hashCode());
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
        StringBuilder sb = new StringBuilder("FSettlement (");

        sb.append(key);
        sb.append(", ").append(code);
        sb.append(", ").append(serial);
        sb.append(", ").append(amount);
        sb.append(", ").append(comment);
        sb.append(", ").append(rounded);
        sb.append(", ").append(finished);
        sb.append(", ").append(finishedAt);
        sb.append(", ").append(signName);
        sb.append(", ").append(signMobile);
        sb.append(", ").append(customerId);
        sb.append(", ").append(relatedId);
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
    public void from(IFSettlement from) {
        setKey(from.getKey());
        setCode(from.getCode());
        setSerial(from.getSerial());
        setAmount(from.getAmount());
        setComment(from.getComment());
        setRounded(from.getRounded());
        setFinished(from.getFinished());
        setFinishedAt(from.getFinishedAt());
        setSignName(from.getSignName());
        setSignMobile(from.getSignMobile());
        setCustomerId(from.getCustomerId());
        setRelatedId(from.getRelatedId());
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
    public <E extends IFSettlement> E into(E into) {
        into.from(this);
        return into;
    }
}
