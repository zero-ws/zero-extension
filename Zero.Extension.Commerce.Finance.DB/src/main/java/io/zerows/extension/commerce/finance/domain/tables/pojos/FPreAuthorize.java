/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.finance.domain.tables.pojos;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.zerows.extension.commerce.finance.domain.tables.interfaces.IFPreAuthorize;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class FPreAuthorize implements VertxPojo, IFPreAuthorize {

    private static final long serialVersionUID = 1L;

    private String key;
    private String code;
    private String serial;
    private String status;
    private BigDecimal amount;
    private String comment;
    private LocalDateTime expiredAt;
    private String bankName;
    private String bankCard;
    private String orderId;
    private String billId;
    private String bookId;
    private String sigma;
    private String language;
    private Boolean active;
    private String metadata;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public FPreAuthorize() {
    }

    public FPreAuthorize(IFPreAuthorize value) {
        this.key = value.getKey();
        this.code = value.getCode();
        this.serial = value.getSerial();
        this.status = value.getStatus();
        this.amount = value.getAmount();
        this.comment = value.getComment();
        this.expiredAt = value.getExpiredAt();
        this.bankName = value.getBankName();
        this.bankCard = value.getBankCard();
        this.orderId = value.getOrderId();
        this.billId = value.getBillId();
        this.bookId = value.getBookId();
        this.sigma = value.getSigma();
        this.language = value.getLanguage();
        this.active = value.getActive();
        this.metadata = value.getMetadata();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public FPreAuthorize(
        String key,
        String code,
        String serial,
        String status,
        BigDecimal amount,
        String comment,
        LocalDateTime expiredAt,
        String bankName,
        String bankCard,
        String orderId,
        String billId,
        String bookId,
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
        this.status = status;
        this.amount = amount;
        this.comment = comment;
        this.expiredAt = expiredAt;
        this.bankName = bankName;
        this.bankCard = bankCard;
        this.orderId = orderId;
        this.billId = billId;
        this.bookId = bookId;
        this.sigma = sigma;
        this.language = language;
        this.active = active;
        this.metadata = metadata;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public FPreAuthorize(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    /**
     * Getter for <code>ZDB.F_PRE_AUTHORIZE.KEY</code>. 「key」- 预授权ID
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>ZDB.F_PRE_AUTHORIZE.KEY</code>. 「key」- 预授权ID
     */
    @Override
    public FPreAuthorize setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_PRE_AUTHORIZE.CODE</code>. 「code」 - 预授权系统编号
     */
    @Override
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>ZDB.F_PRE_AUTHORIZE.CODE</code>. 「code」 - 预授权系统编号
     */
    @Override
    public FPreAuthorize setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_PRE_AUTHORIZE.SERIAL</code>. 「serial」 - 预授权单据号
     */
    @Override
    public String getSerial() {
        return this.serial;
    }

    /**
     * Setter for <code>ZDB.F_PRE_AUTHORIZE.SERIAL</code>. 「serial」 - 预授权单据号
     */
    @Override
    public FPreAuthorize setSerial(String serial) {
        this.serial = serial;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_PRE_AUTHORIZE.STATUS</code>. 「status」 -
     * 预授权状态，Lock/Unlock
     */
    @Override
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>ZDB.F_PRE_AUTHORIZE.STATUS</code>. 「status」 -
     * 预授权状态，Lock/Unlock
     */
    @Override
    public FPreAuthorize setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_PRE_AUTHORIZE.AMOUNT</code>. 「amount」- 当前预授权刷单金额
     */
    @Override
    public BigDecimal getAmount() {
        return this.amount;
    }

    /**
     * Setter for <code>ZDB.F_PRE_AUTHORIZE.AMOUNT</code>. 「amount」- 当前预授权刷单金额
     */
    @Override
    public FPreAuthorize setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_PRE_AUTHORIZE.COMMENT</code>. 「comment」 - 预授权备注
     */
    @Override
    public String getComment() {
        return this.comment;
    }

    /**
     * Setter for <code>ZDB.F_PRE_AUTHORIZE.COMMENT</code>. 「comment」 - 预授权备注
     */
    @Override
    public FPreAuthorize setComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_PRE_AUTHORIZE.EXPIRED_AT</code>.
     * 「expiredAt」——预授权有效期
     */
    @Override
    public LocalDateTime getExpiredAt() {
        return this.expiredAt;
    }

    /**
     * Setter for <code>ZDB.F_PRE_AUTHORIZE.EXPIRED_AT</code>.
     * 「expiredAt」——预授权有效期
     */
    @Override
    public FPreAuthorize setExpiredAt(LocalDateTime expiredAt) {
        this.expiredAt = expiredAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_PRE_AUTHORIZE.BANK_NAME</code>. 「bankName」-
     * 预授权银行名称
     */
    @Override
    public String getBankName() {
        return this.bankName;
    }

    /**
     * Setter for <code>ZDB.F_PRE_AUTHORIZE.BANK_NAME</code>. 「bankName」-
     * 预授权银行名称
     */
    @Override
    public FPreAuthorize setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_PRE_AUTHORIZE.BANK_CARD</code>. 「bankCard」-
     * 刷预授权的银行卡号
     */
    @Override
    public String getBankCard() {
        return this.bankCard;
    }

    /**
     * Setter for <code>ZDB.F_PRE_AUTHORIZE.BANK_CARD</code>. 「bankCard」-
     * 刷预授权的银行卡号
     */
    @Override
    public FPreAuthorize setBankCard(String bankCard) {
        this.bankCard = bankCard;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_PRE_AUTHORIZE.ORDER_ID</code>. 「orderId」-
     * 预授权所属订单ID
     */
    @Override
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * Setter for <code>ZDB.F_PRE_AUTHORIZE.ORDER_ID</code>. 「orderId」-
     * 预授权所属订单ID
     */
    @Override
    public FPreAuthorize setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_PRE_AUTHORIZE.BILL_ID</code>. 「billId」- 预授权所属账单ID
     */
    @Override
    public String getBillId() {
        return this.billId;
    }

    /**
     * Setter for <code>ZDB.F_PRE_AUTHORIZE.BILL_ID</code>. 「billId」- 预授权所属账单ID
     */
    @Override
    public FPreAuthorize setBillId(String billId) {
        this.billId = billId;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_PRE_AUTHORIZE.BOOK_ID</code>. 「bookId」- 所属账本ID
     */
    @Override
    public String getBookId() {
        return this.bookId;
    }

    /**
     * Setter for <code>ZDB.F_PRE_AUTHORIZE.BOOK_ID</code>. 「bookId」- 所属账本ID
     */
    @Override
    public FPreAuthorize setBookId(String bookId) {
        this.bookId = bookId;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_PRE_AUTHORIZE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>ZDB.F_PRE_AUTHORIZE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public FPreAuthorize setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_PRE_AUTHORIZE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>ZDB.F_PRE_AUTHORIZE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public FPreAuthorize setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_PRE_AUTHORIZE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>ZDB.F_PRE_AUTHORIZE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public FPreAuthorize setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_PRE_AUTHORIZE.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>ZDB.F_PRE_AUTHORIZE.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public FPreAuthorize setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_PRE_AUTHORIZE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>ZDB.F_PRE_AUTHORIZE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public FPreAuthorize setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_PRE_AUTHORIZE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>ZDB.F_PRE_AUTHORIZE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public FPreAuthorize setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_PRE_AUTHORIZE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>ZDB.F_PRE_AUTHORIZE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public FPreAuthorize setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_PRE_AUTHORIZE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>ZDB.F_PRE_AUTHORIZE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public FPreAuthorize setUpdatedBy(String updatedBy) {
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
        final FPreAuthorize other = (FPreAuthorize) obj;
        if (this.key == null) {
            if (other.key != null)
                return false;
        } else if (!this.key.equals(other.key))
            return false;
        if (this.code == null) {
            if (other.code != null)
                return false;
        } else if (!this.code.equals(other.code))
            return false;
        if (this.serial == null) {
            if (other.serial != null)
                return false;
        } else if (!this.serial.equals(other.serial))
            return false;
        if (this.status == null) {
            if (other.status != null)
                return false;
        } else if (!this.status.equals(other.status))
            return false;
        if (this.amount == null) {
            if (other.amount != null)
                return false;
        } else if (!this.amount.equals(other.amount))
            return false;
        if (this.comment == null) {
            if (other.comment != null)
                return false;
        } else if (!this.comment.equals(other.comment))
            return false;
        if (this.expiredAt == null) {
            if (other.expiredAt != null)
                return false;
        } else if (!this.expiredAt.equals(other.expiredAt))
            return false;
        if (this.bankName == null) {
            if (other.bankName != null)
                return false;
        } else if (!this.bankName.equals(other.bankName))
            return false;
        if (this.bankCard == null) {
            if (other.bankCard != null)
                return false;
        } else if (!this.bankCard.equals(other.bankCard))
            return false;
        if (this.orderId == null) {
            if (other.orderId != null)
                return false;
        } else if (!this.orderId.equals(other.orderId))
            return false;
        if (this.billId == null) {
            if (other.billId != null)
                return false;
        } else if (!this.billId.equals(other.billId))
            return false;
        if (this.bookId == null) {
            if (other.bookId != null)
                return false;
        } else if (!this.bookId.equals(other.bookId))
            return false;
        if (this.sigma == null) {
            if (other.sigma != null)
                return false;
        } else if (!this.sigma.equals(other.sigma))
            return false;
        if (this.language == null) {
            if (other.language != null)
                return false;
        } else if (!this.language.equals(other.language))
            return false;
        if (this.active == null) {
            if (other.active != null)
                return false;
        } else if (!this.active.equals(other.active))
            return false;
        if (this.metadata == null) {
            if (other.metadata != null)
                return false;
        } else if (!this.metadata.equals(other.metadata))
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
        result = prime * result + ((this.code == null) ? 0 : this.code.hashCode());
        result = prime * result + ((this.serial == null) ? 0 : this.serial.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.amount == null) ? 0 : this.amount.hashCode());
        result = prime * result + ((this.comment == null) ? 0 : this.comment.hashCode());
        result = prime * result + ((this.expiredAt == null) ? 0 : this.expiredAt.hashCode());
        result = prime * result + ((this.bankName == null) ? 0 : this.bankName.hashCode());
        result = prime * result + ((this.bankCard == null) ? 0 : this.bankCard.hashCode());
        result = prime * result + ((this.orderId == null) ? 0 : this.orderId.hashCode());
        result = prime * result + ((this.billId == null) ? 0 : this.billId.hashCode());
        result = prime * result + ((this.bookId == null) ? 0 : this.bookId.hashCode());
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
        StringBuilder sb = new StringBuilder("FPreAuthorize (");

        sb.append(key);
        sb.append(", ").append(code);
        sb.append(", ").append(serial);
        sb.append(", ").append(status);
        sb.append(", ").append(amount);
        sb.append(", ").append(comment);
        sb.append(", ").append(expiredAt);
        sb.append(", ").append(bankName);
        sb.append(", ").append(bankCard);
        sb.append(", ").append(orderId);
        sb.append(", ").append(billId);
        sb.append(", ").append(bookId);
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
    public void from(IFPreAuthorize from) {
        setKey(from.getKey());
        setCode(from.getCode());
        setSerial(from.getSerial());
        setStatus(from.getStatus());
        setAmount(from.getAmount());
        setComment(from.getComment());
        setExpiredAt(from.getExpiredAt());
        setBankName(from.getBankName());
        setBankCard(from.getBankCard());
        setOrderId(from.getOrderId());
        setBillId(from.getBillId());
        setBookId(from.getBookId());
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
    public <E extends IFPreAuthorize> E into(E into) {
        into.from(this);
        return into;
    }
}