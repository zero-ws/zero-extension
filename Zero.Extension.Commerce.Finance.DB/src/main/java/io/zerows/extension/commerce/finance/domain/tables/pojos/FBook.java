/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.finance.domain.tables.pojos;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.zerows.extension.commerce.finance.domain.tables.interfaces.IFBook;

import java.math.BigDecimal;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FBook implements VertxPojo, IFBook {

    private static final long serialVersionUID = 1L;

    private String key;
    private String name;
    private String code;
    private String serial;
    private String type;
    private String status;
    private Boolean major;
    private BigDecimal amount;
    private String comment;
    private Boolean checked;
    private String checkedDesc;
    private Boolean exceed;
    private String exceedDesc;
    private String modelId;
    private String modelKey;
    private String parentId;
    private String orderId;
    private String sigma;
    private String language;
    private Boolean active;
    private String metadata;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public FBook() {}

    public FBook(IFBook value) {
        this.key = value.getKey();
        this.name = value.getName();
        this.code = value.getCode();
        this.serial = value.getSerial();
        this.type = value.getType();
        this.status = value.getStatus();
        this.major = value.getMajor();
        this.amount = value.getAmount();
        this.comment = value.getComment();
        this.checked = value.getChecked();
        this.checkedDesc = value.getCheckedDesc();
        this.exceed = value.getExceed();
        this.exceedDesc = value.getExceedDesc();
        this.modelId = value.getModelId();
        this.modelKey = value.getModelKey();
        this.parentId = value.getParentId();
        this.orderId = value.getOrderId();
        this.sigma = value.getSigma();
        this.language = value.getLanguage();
        this.active = value.getActive();
        this.metadata = value.getMetadata();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public FBook(
        String key,
        String name,
        String code,
        String serial,
        String type,
        String status,
        Boolean major,
        BigDecimal amount,
        String comment,
        Boolean checked,
        String checkedDesc,
        Boolean exceed,
        String exceedDesc,
        String modelId,
        String modelKey,
        String parentId,
        String orderId,
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
        this.status = status;
        this.major = major;
        this.amount = amount;
        this.comment = comment;
        this.checked = checked;
        this.checkedDesc = checkedDesc;
        this.exceed = exceed;
        this.exceedDesc = exceedDesc;
        this.modelId = modelId;
        this.modelKey = modelKey;
        this.parentId = parentId;
        this.orderId = orderId;
        this.sigma = sigma;
        this.language = language;
        this.active = active;
        this.metadata = metadata;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public FBook(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>ZDB.F_BOOK.KEY</code>. 「key」- 账本主键ID
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>ZDB.F_BOOK.KEY</code>. 「key」- 账本主键ID
     */
    @Override
    public FBook setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BOOK.NAME</code>. 「name」 - 账本名称
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>ZDB.F_BOOK.NAME</code>. 「name」 - 账本名称
     */
    @Override
    public FBook setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BOOK.CODE</code>. 「code」 - 账本的系统编号
     */
    @Override
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>ZDB.F_BOOK.CODE</code>. 「code」 - 账本的系统编号
     */
    @Override
    public FBook setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BOOK.SERIAL</code>. 「serial」 - 财务系统账本编号
     */
    @Override
    public String getSerial() {
        return this.serial;
    }

    /**
     * Setter for <code>ZDB.F_BOOK.SERIAL</code>. 「serial」 - 财务系统账本编号
     */
    @Override
    public FBook setSerial(String serial) {
        this.serial = serial;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BOOK.TYPE</code>. 「type」 - 账本类型
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>ZDB.F_BOOK.TYPE</code>. 「type」 - 账本类型
     */
    @Override
    public FBook setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BOOK.STATUS</code>. 「status」 - 账本状态
     */
    @Override
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>ZDB.F_BOOK.STATUS</code>. 「status」 - 账本状态
     */
    @Override
    public FBook setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BOOK.MAJOR</code>. 「major」- 主账本标识
     */
    @Override
    public Boolean getMajor() {
        return this.major;
    }

    /**
     * Setter for <code>ZDB.F_BOOK.MAJOR</code>. 「major」- 主账本标识
     */
    @Override
    public FBook setMajor(Boolean major) {
        this.major = major;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BOOK.AMOUNT</code>. 「amount」-
     * 交易金额，正数：应收，负数：应退，最终计算总金额
     */
    @Override
    public BigDecimal getAmount() {
        return this.amount;
    }

    /**
     * Setter for <code>ZDB.F_BOOK.AMOUNT</code>. 「amount」-
     * 交易金额，正数：应收，负数：应退，最终计算总金额
     */
    @Override
    public FBook setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BOOK.COMMENT</code>. 「comment」 - 账本备注
     */
    @Override
    public String getComment() {
        return this.comment;
    }

    /**
     * Setter for <code>ZDB.F_BOOK.COMMENT</code>. 「comment」 - 账本备注
     */
    @Override
    public FBook setComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BOOK.CHECKED</code>. 「checked」- 是否检查
     */
    @Override
    public Boolean getChecked() {
        return this.checked;
    }

    /**
     * Setter for <code>ZDB.F_BOOK.CHECKED</code>. 「checked」- 是否检查
     */
    @Override
    public FBook setChecked(Boolean checked) {
        this.checked = checked;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BOOK.CHECKED_DESC</code>. 「checkedDesc」 - 账本检查描述信息
     */
    @Override
    public String getCheckedDesc() {
        return this.checkedDesc;
    }

    /**
     * Setter for <code>ZDB.F_BOOK.CHECKED_DESC</code>. 「checkedDesc」 - 账本检查描述信息
     */
    @Override
    public FBook setCheckedDesc(String checkedDesc) {
        this.checkedDesc = checkedDesc;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BOOK.EXCEED</code>. 「exceed」- 是否加收
     */
    @Override
    public Boolean getExceed() {
        return this.exceed;
    }

    /**
     * Setter for <code>ZDB.F_BOOK.EXCEED</code>. 「exceed」- 是否加收
     */
    @Override
    public FBook setExceed(Boolean exceed) {
        this.exceed = exceed;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BOOK.EXCEED_DESC</code>. 「exceedDesc」 - 账本加收描述信息
     */
    @Override
    public String getExceedDesc() {
        return this.exceedDesc;
    }

    /**
     * Setter for <code>ZDB.F_BOOK.EXCEED_DESC</code>. 「exceedDesc」 - 账本加收描述信息
     */
    @Override
    public FBook setExceedDesc(String exceedDesc) {
        this.exceedDesc = exceedDesc;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BOOK.MODEL_ID</code>. 「modelId」-
     * 关联的模型identifier，用于描述
     */
    @Override
    public String getModelId() {
        return this.modelId;
    }

    /**
     * Setter for <code>ZDB.F_BOOK.MODEL_ID</code>. 「modelId」-
     * 关联的模型identifier，用于描述
     */
    @Override
    public FBook setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BOOK.MODEL_KEY</code>. 「modelKey」-
     * 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    @Override
    public String getModelKey() {
        return this.modelKey;
    }

    /**
     * Setter for <code>ZDB.F_BOOK.MODEL_KEY</code>. 「modelKey」-
     * 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    @Override
    public FBook setModelKey(String modelKey) {
        this.modelKey = modelKey;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BOOK.PARENT_ID</code>. 「parentId」- 子账本专用，引用父账本ID
     */
    @Override
    public String getParentId() {
        return this.parentId;
    }

    /**
     * Setter for <code>ZDB.F_BOOK.PARENT_ID</code>. 「parentId」- 子账本专用，引用父账本ID
     */
    @Override
    public FBook setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BOOK.ORDER_ID</code>. 「orderId」- 订单对应的订单ID
     */
    @Override
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * Setter for <code>ZDB.F_BOOK.ORDER_ID</code>. 「orderId」- 订单对应的订单ID
     */
    @Override
    public FBook setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BOOK.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>ZDB.F_BOOK.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public FBook setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BOOK.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>ZDB.F_BOOK.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public FBook setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BOOK.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>ZDB.F_BOOK.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public FBook setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BOOK.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>ZDB.F_BOOK.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public FBook setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BOOK.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>ZDB.F_BOOK.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public FBook setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BOOK.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>ZDB.F_BOOK.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public FBook setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BOOK.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>ZDB.F_BOOK.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public FBook setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.F_BOOK.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>ZDB.F_BOOK.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public FBook setUpdatedBy(String updatedBy) {
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
        final FBook other = (FBook) obj;
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
        if (this.status == null) {
            if (other.status != null)
                return false;
        }
        else if (!this.status.equals(other.status))
            return false;
        if (this.major == null) {
            if (other.major != null)
                return false;
        }
        else if (!this.major.equals(other.major))
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
        if (this.checked == null) {
            if (other.checked != null)
                return false;
        }
        else if (!this.checked.equals(other.checked))
            return false;
        if (this.checkedDesc == null) {
            if (other.checkedDesc != null)
                return false;
        }
        else if (!this.checkedDesc.equals(other.checkedDesc))
            return false;
        if (this.exceed == null) {
            if (other.exceed != null)
                return false;
        }
        else if (!this.exceed.equals(other.exceed))
            return false;
        if (this.exceedDesc == null) {
            if (other.exceedDesc != null)
                return false;
        }
        else if (!this.exceedDesc.equals(other.exceedDesc))
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
        if (this.parentId == null) {
            if (other.parentId != null)
                return false;
        }
        else if (!this.parentId.equals(other.parentId))
            return false;
        if (this.orderId == null) {
            if (other.orderId != null)
                return false;
        }
        else if (!this.orderId.equals(other.orderId))
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
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.major == null) ? 0 : this.major.hashCode());
        result = prime * result + ((this.amount == null) ? 0 : this.amount.hashCode());
        result = prime * result + ((this.comment == null) ? 0 : this.comment.hashCode());
        result = prime * result + ((this.checked == null) ? 0 : this.checked.hashCode());
        result = prime * result + ((this.checkedDesc == null) ? 0 : this.checkedDesc.hashCode());
        result = prime * result + ((this.exceed == null) ? 0 : this.exceed.hashCode());
        result = prime * result + ((this.exceedDesc == null) ? 0 : this.exceedDesc.hashCode());
        result = prime * result + ((this.modelId == null) ? 0 : this.modelId.hashCode());
        result = prime * result + ((this.modelKey == null) ? 0 : this.modelKey.hashCode());
        result = prime * result + ((this.parentId == null) ? 0 : this.parentId.hashCode());
        result = prime * result + ((this.orderId == null) ? 0 : this.orderId.hashCode());
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
        StringBuilder sb = new StringBuilder("FBook (");

        sb.append(key);
        sb.append(", ").append(name);
        sb.append(", ").append(code);
        sb.append(", ").append(serial);
        sb.append(", ").append(type);
        sb.append(", ").append(status);
        sb.append(", ").append(major);
        sb.append(", ").append(amount);
        sb.append(", ").append(comment);
        sb.append(", ").append(checked);
        sb.append(", ").append(checkedDesc);
        sb.append(", ").append(exceed);
        sb.append(", ").append(exceedDesc);
        sb.append(", ").append(modelId);
        sb.append(", ").append(modelKey);
        sb.append(", ").append(parentId);
        sb.append(", ").append(orderId);
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
    public void from(IFBook from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setSerial(from.getSerial());
        setType(from.getType());
        setStatus(from.getStatus());
        setMajor(from.getMajor());
        setAmount(from.getAmount());
        setComment(from.getComment());
        setChecked(from.getChecked());
        setCheckedDesc(from.getCheckedDesc());
        setExceed(from.getExceed());
        setExceedDesc(from.getExceedDesc());
        setModelId(from.getModelId());
        setModelKey(from.getModelKey());
        setParentId(from.getParentId());
        setOrderId(from.getOrderId());
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
    public <E extends IFBook> E into(E into) {
        into.from(this);
        return into;
    }
}
