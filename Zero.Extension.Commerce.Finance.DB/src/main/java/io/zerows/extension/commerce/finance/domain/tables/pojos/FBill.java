/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.finance.domain.tables.pojos;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.zerows.extension.commerce.finance.domain.tables.interfaces.IFBill;

import java.math.BigDecimal;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FBill implements VertxPojo, IFBill {

    private static final long serialVersionUID = 1L;

    private String key;
    private String name;
    private String code;
    private String serial;
    private String type;
    private String category;
    private BigDecimal amount;
    private Boolean income;
    private String comment;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private String groupBy;
    private String orderId;
    private String bookId;
    private String modelId;
    private String modelKey;
    private String sigma;
    private String language;
    private Boolean active;
    private String metadata;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public FBill() {}

    public FBill(IFBill value) {
        this.key = value.getKey();
        this.name = value.getName();
        this.code = value.getCode();
        this.serial = value.getSerial();
        this.type = value.getType();
        this.category = value.getCategory();
        this.amount = value.getAmount();
        this.income = value.getIncome();
        this.comment = value.getComment();
        this.startAt = value.getStartAt();
        this.endAt = value.getEndAt();
        this.groupBy = value.getGroupBy();
        this.orderId = value.getOrderId();
        this.bookId = value.getBookId();
        this.modelId = value.getModelId();
        this.modelKey = value.getModelKey();
        this.sigma = value.getSigma();
        this.language = value.getLanguage();
        this.active = value.getActive();
        this.metadata = value.getMetadata();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public FBill(
        String key,
        String name,
        String code,
        String serial,
        String type,
        String category,
        BigDecimal amount,
        Boolean income,
        String comment,
        LocalDateTime startAt,
        LocalDateTime endAt,
        String groupBy,
        String orderId,
        String bookId,
        String modelId,
        String modelKey,
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
        this.category = category;
        this.amount = amount;
        this.income = income;
        this.comment = comment;
        this.startAt = startAt;
        this.endAt = endAt;
        this.groupBy = groupBy;
        this.orderId = orderId;
        this.bookId = bookId;
        this.modelId = modelId;
        this.modelKey = modelKey;
        this.sigma = sigma;
        this.language = language;
        this.active = active;
        this.metadata = metadata;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public FBill(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>ZDB.F_BILL.KEY</code>. 「key」- 账单主键
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>ZDB.F_BILL.KEY</code>. 「key」- 账单主键
     */
    @Override
    public FBill setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BILL.NAME</code>. 「name」- 账单标题
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>ZDB.F_BILL.NAME</code>. 「name」- 账单标题
     */
    @Override
    public FBill setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BILL.CODE</code>. 「code」- 账单系统编号
     */
    @Override
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>ZDB.F_BILL.CODE</code>. 「code」- 账单系统编号
     */
    @Override
    public FBill setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BILL.SERIAL</code>. 「serial」- 账单流水线号
     */
    @Override
    public String getSerial() {
        return this.serial;
    }

    /**
     * Setter for <code>ZDB.F_BILL.SERIAL</code>. 「serial」- 账单流水线号
     */
    @Override
    public FBill setSerial(String serial) {
        this.serial = serial;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BILL.TYPE</code>. 「type」- 账单类型
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>ZDB.F_BILL.TYPE</code>. 「type」- 账单类型
     */
    @Override
    public FBill setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BILL.CATEGORY</code>. 「category」- 账单类别
     */
    @Override
    public String getCategory() {
        return this.category;
    }

    /**
     * Setter for <code>ZDB.F_BILL.CATEGORY</code>. 「category」- 账单类别
     */
    @Override
    public FBill setCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BILL.AMOUNT</code>. 「amount」- 账单金额
     */
    @Override
    public BigDecimal getAmount() {
        return this.amount;
    }

    /**
     * Setter for <code>ZDB.F_BILL.AMOUNT</code>. 「amount」- 账单金额
     */
    @Override
    public FBill setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BILL.INCOME</code>. 「income」- true = 消费类，false =
     * 付款类
     */
    @Override
    public Boolean getIncome() {
        return this.income;
    }

    /**
     * Setter for <code>ZDB.F_BILL.INCOME</code>. 「income」- true = 消费类，false =
     * 付款类
     */
    @Override
    public FBill setIncome(Boolean income) {
        this.income = income;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BILL.COMMENT</code>. 「comment」 - 账单备注
     */
    @Override
    public String getComment() {
        return this.comment;
    }

    /**
     * Setter for <code>ZDB.F_BILL.COMMENT</code>. 「comment」 - 账单备注
     */
    @Override
    public FBill setComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BILL.START_AT</code>. 「startAt」- 开始时间
     */
    @Override
    public LocalDateTime getStartAt() {
        return this.startAt;
    }

    /**
     * Setter for <code>ZDB.F_BILL.START_AT</code>. 「startAt」- 开始时间
     */
    @Override
    public FBill setStartAt(LocalDateTime startAt) {
        this.startAt = startAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BILL.END_AT</code>. 「endAt」- 结束时间
     */
    @Override
    public LocalDateTime getEndAt() {
        return this.endAt;
    }

    /**
     * Setter for <code>ZDB.F_BILL.END_AT</code>. 「endAt」- 结束时间
     */
    @Override
    public FBill setEndAt(LocalDateTime endAt) {
        this.endAt = endAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BILL.GROUP_BY</code>. 「groupBy」- 分组
     */
    @Override
    public String getGroupBy() {
        return this.groupBy;
    }

    /**
     * Setter for <code>ZDB.F_BILL.GROUP_BY</code>. 「groupBy」- 分组
     */
    @Override
    public FBill setGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BILL.ORDER_ID</code>. 「orderId」- 订单对应的订单ID
     */
    @Override
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * Setter for <code>ZDB.F_BILL.ORDER_ID</code>. 「orderId」- 订单对应的订单ID
     */
    @Override
    public FBill setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BILL.BOOK_ID</code>. 「bookId」- 关联账本ID
     */
    @Override
    public String getBookId() {
        return this.bookId;
    }

    /**
     * Setter for <code>ZDB.F_BILL.BOOK_ID</code>. 「bookId」- 关联账本ID
     */
    @Override
    public FBill setBookId(String bookId) {
        this.bookId = bookId;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BILL.MODEL_ID</code>. 「modelId」-
     * 关联的模型identifier，用于描述
     */
    @Override
    public String getModelId() {
        return this.modelId;
    }

    /**
     * Setter for <code>ZDB.F_BILL.MODEL_ID</code>. 「modelId」-
     * 关联的模型identifier，用于描述
     */
    @Override
    public FBill setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BILL.MODEL_KEY</code>. 「modelKey」-
     * 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    @Override
    public String getModelKey() {
        return this.modelKey;
    }

    /**
     * Setter for <code>ZDB.F_BILL.MODEL_KEY</code>. 「modelKey」-
     * 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    @Override
    public FBill setModelKey(String modelKey) {
        this.modelKey = modelKey;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BILL.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>ZDB.F_BILL.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public FBill setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BILL.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>ZDB.F_BILL.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public FBill setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BILL.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>ZDB.F_BILL.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public FBill setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BILL.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>ZDB.F_BILL.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public FBill setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BILL.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>ZDB.F_BILL.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public FBill setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BILL.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>ZDB.F_BILL.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public FBill setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BILL.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>ZDB.F_BILL.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public FBill setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BILL.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>ZDB.F_BILL.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public FBill setUpdatedBy(String updatedBy) {
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
        final FBill other = (FBill) obj;
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
        if (this.category == null) {
            if (other.category != null)
                return false;
        }
        else if (!this.category.equals(other.category))
            return false;
        if (this.amount == null) {
            if (other.amount != null)
                return false;
        }
        else if (!this.amount.equals(other.amount))
            return false;
        if (this.income == null) {
            if (other.income != null)
                return false;
        }
        else if (!this.income.equals(other.income))
            return false;
        if (this.comment == null) {
            if (other.comment != null)
                return false;
        }
        else if (!this.comment.equals(other.comment))
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
        if (this.orderId == null) {
            if (other.orderId != null)
                return false;
        }
        else if (!this.orderId.equals(other.orderId))
            return false;
        if (this.bookId == null) {
            if (other.bookId != null)
                return false;
        }
        else if (!this.bookId.equals(other.bookId))
            return false;
        if (this.modelId == null) {
            if (other.modelId != null)
                return false;
        }
        else if (!this.modelId.equals(other.modelId))
            return false;
        if (this.modelKey == null) {
            if (other.modelKey != null)
                return false;
        }
        else if (!this.modelKey.equals(other.modelKey))
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
        result = prime * result + ((this.category == null) ? 0 : this.category.hashCode());
        result = prime * result + ((this.amount == null) ? 0 : this.amount.hashCode());
        result = prime * result + ((this.income == null) ? 0 : this.income.hashCode());
        result = prime * result + ((this.comment == null) ? 0 : this.comment.hashCode());
        result = prime * result + ((this.startAt == null) ? 0 : this.startAt.hashCode());
        result = prime * result + ((this.endAt == null) ? 0 : this.endAt.hashCode());
        result = prime * result + ((this.groupBy == null) ? 0 : this.groupBy.hashCode());
        result = prime * result + ((this.orderId == null) ? 0 : this.orderId.hashCode());
        result = prime * result + ((this.bookId == null) ? 0 : this.bookId.hashCode());
        result = prime * result + ((this.modelId == null) ? 0 : this.modelId.hashCode());
        result = prime * result + ((this.modelKey == null) ? 0 : this.modelKey.hashCode());
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
        StringBuilder sb = new StringBuilder("FBill (");

        sb.append(key);
        sb.append(", ").append(name);
        sb.append(", ").append(code);
        sb.append(", ").append(serial);
        sb.append(", ").append(type);
        sb.append(", ").append(category);
        sb.append(", ").append(amount);
        sb.append(", ").append(income);
        sb.append(", ").append(comment);
        sb.append(", ").append(startAt);
        sb.append(", ").append(endAt);
        sb.append(", ").append(groupBy);
        sb.append(", ").append(orderId);
        sb.append(", ").append(bookId);
        sb.append(", ").append(modelId);
        sb.append(", ").append(modelKey);
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
    public void from(IFBill from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setSerial(from.getSerial());
        setType(from.getType());
        setCategory(from.getCategory());
        setAmount(from.getAmount());
        setIncome(from.getIncome());
        setComment(from.getComment());
        setStartAt(from.getStartAt());
        setEndAt(from.getEndAt());
        setGroupBy(from.getGroupBy());
        setOrderId(from.getOrderId());
        setBookId(from.getBookId());
        setModelId(from.getModelId());
        setModelKey(from.getModelKey());
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
    public <E extends IFBill> E into(E into) {
        into.from(this);
        return into;
    }
}
