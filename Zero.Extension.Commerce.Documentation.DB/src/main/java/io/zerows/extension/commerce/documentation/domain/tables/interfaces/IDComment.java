/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.documentation.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.time.LocalDateTime;

import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.setOrThrow;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public interface IDComment extends VertxPojo, Serializable {

    /**
     * Getter for <code>ZDB.D_COMMENT.KEY</code>. 「key」- 解读主键
     */
    public String getKey();

    /**
     * Setter for <code>ZDB.D_COMMENT.KEY</code>. 「key」- 解读主键
     */
    public IDComment setKey(String value);

    /**
     * Getter for <code>ZDB.D_COMMENT.CODE</code>. 「code」- 备注编号
     */
    public String getCode();

    /**
     * Setter for <code>ZDB.D_COMMENT.CODE</code>. 「code」- 备注编号
     */
    public IDComment setCode(String value);

    /**
     * Getter for <code>ZDB.D_COMMENT.NAME</code>. 「name」- 备注标题
     */
    public String getName();

    /**
     * Setter for <code>ZDB.D_COMMENT.NAME</code>. 「name」- 备注标题
     */
    public IDComment setName(String value);

    /**
     * Getter for <code>ZDB.D_COMMENT.CONTENT</code>. 「content」- 备注内容、解读内容
     */
    public String getContent();

    /**
     * Setter for <code>ZDB.D_COMMENT.CONTENT</code>. 「content」- 备注内容、解读内容
     */
    public IDComment setContent(String value);

    /**
     * Getter for <code>ZDB.D_COMMENT.MADE_NAME</code>. 「madeName」- 备注人姓名
     */
    public String getMadeName();

    /**
     * Setter for <code>ZDB.D_COMMENT.MADE_NAME</code>. 「madeName」- 备注人姓名
     */
    public IDComment setMadeName(String value);

    /**
     * Getter for <code>ZDB.D_COMMENT.MADE_AT</code>. 「madeAt」- 备注时间
     */
    public LocalDateTime getMadeAt();

    /**
     * Setter for <code>ZDB.D_COMMENT.MADE_AT</code>. 「madeAt」- 备注时间
     */
    public IDComment setMadeAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.D_COMMENT.TYPE</code>. 「type」- 备注类型
     */
    public String getType();

    /**
     * Setter for <code>ZDB.D_COMMENT.TYPE</code>. 「type」- 备注类型
     */
    public IDComment setType(String value);

    /**
     * Getter for <code>ZDB.D_COMMENT.SORT</code>. 「sort」- 备注排序
     */
    public Integer getSort();

    /**
     * Setter for <code>ZDB.D_COMMENT.SORT</code>. 「sort」- 备注排序
     */
    public IDComment setSort(Integer value);

    /**
     * Getter for <code>ZDB.D_COMMENT.MODEL_ID</code>. 「modelId」-
     * 关联的模型identifier，用于描述
     */
    public String getModelId();

    /**
     * Setter for <code>ZDB.D_COMMENT.MODEL_ID</code>. 「modelId」-
     * 关联的模型identifier，用于描述
     */
    public IDComment setModelId(String value);

    /**
     * Getter for <code>ZDB.D_COMMENT.MODEL_KEY</code>. 「modelKey」-
     * 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    public String getModelKey();

    /**
     * Setter for <code>ZDB.D_COMMENT.MODEL_KEY</code>. 「modelKey」-
     * 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    public IDComment setModelKey(String value);

    /**
     * Getter for <code>ZDB.D_COMMENT.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>ZDB.D_COMMENT.SIGMA</code>. 「sigma」- 统一标识
     */
    public IDComment setSigma(String value);

    /**
     * Getter for <code>ZDB.D_COMMENT.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>ZDB.D_COMMENT.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IDComment setLanguage(String value);

    /**
     * Getter for <code>ZDB.D_COMMENT.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>ZDB.D_COMMENT.ACTIVE</code>. 「active」- 是否启用
     */
    public IDComment setActive(Boolean value);

    /**
     * Getter for <code>ZDB.D_COMMENT.METADATA</code>. 「metadata」- 附加配置数据
     */
    public String getMetadata();

    /**
     * Setter for <code>ZDB.D_COMMENT.METADATA</code>. 「metadata」- 附加配置数据
     */
    public IDComment setMetadata(String value);

    /**
     * Getter for <code>ZDB.D_COMMENT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>ZDB.D_COMMENT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IDComment setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.D_COMMENT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>ZDB.D_COMMENT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IDComment setCreatedBy(String value);

    /**
     * Getter for <code>ZDB.D_COMMENT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>ZDB.D_COMMENT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IDComment setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.D_COMMENT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    /**
     * Setter for <code>ZDB.D_COMMENT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IDComment setUpdatedBy(String value);

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IDComment
     */
    public void from(IDComment from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IDComment
     */
    public <E extends IDComment> E into(E into);

    @Override
    public default IDComment fromJson(io.vertx.core.json.JsonObject json) {
        setOrThrow(this::setKey, json::getString, "KEY", "java.lang.String");
        setOrThrow(this::setCode, json::getString, "CODE", "java.lang.String");
        setOrThrow(this::setName, json::getString, "NAME", "java.lang.String");
        setOrThrow(this::setContent, json::getString, "CONTENT", "java.lang.String");
        setOrThrow(this::setMadeName, json::getString, "MADE_NAME", "java.lang.String");
        setOrThrow(this::setMadeAt, key -> {
            String s = json.getString(key);
            return s == null ? null : java.time.LocalDateTime.parse(s);
        }, "MADE_AT", "java.time.LocalDateTime");
        setOrThrow(this::setType, json::getString, "TYPE", "java.lang.String");
        setOrThrow(this::setSort, json::getInteger, "SORT", "java.lang.Integer");
        setOrThrow(this::setModelId, json::getString, "MODEL_ID", "java.lang.String");
        setOrThrow(this::setModelKey, json::getString, "MODEL_KEY", "java.lang.String");
        setOrThrow(this::setSigma, json::getString, "SIGMA", "java.lang.String");
        setOrThrow(this::setLanguage, json::getString, "LANGUAGE", "java.lang.String");
        setOrThrow(this::setActive, json::getBoolean, "ACTIVE", "java.lang.Boolean");
        setOrThrow(this::setMetadata, json::getString, "METADATA", "java.lang.String");
        setOrThrow(this::setCreatedAt, key -> {
            String s = json.getString(key);
            return s == null ? null : java.time.LocalDateTime.parse(s);
        }, "CREATED_AT", "java.time.LocalDateTime");
        setOrThrow(this::setCreatedBy, json::getString, "CREATED_BY", "java.lang.String");
        setOrThrow(this::setUpdatedAt, key -> {
            String s = json.getString(key);
            return s == null ? null : java.time.LocalDateTime.parse(s);
        }, "UPDATED_AT", "java.time.LocalDateTime");
        setOrThrow(this::setUpdatedBy, json::getString, "UPDATED_BY", "java.lang.String");
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("KEY", getKey());
        json.put("CODE", getCode());
        json.put("NAME", getName());
        json.put("CONTENT", getContent());
        json.put("MADE_NAME", getMadeName());
        json.put("MADE_AT", getMadeAt() == null ? null : getMadeAt().toString());
        json.put("TYPE", getType());
        json.put("SORT", getSort());
        json.put("MODEL_ID", getModelId());
        json.put("MODEL_KEY", getModelKey());
        json.put("SIGMA", getSigma());
        json.put("LANGUAGE", getLanguage());
        json.put("ACTIVE", getActive());
        json.put("METADATA", getMetadata());
        json.put("CREATED_AT", getCreatedAt() == null ? null : getCreatedAt().toString());
        json.put("CREATED_BY", getCreatedBy());
        json.put("UPDATED_AT", getUpdatedAt() == null ? null : getUpdatedAt().toString());
        json.put("UPDATED_BY", getUpdatedBy());
        return json;
    }

}
