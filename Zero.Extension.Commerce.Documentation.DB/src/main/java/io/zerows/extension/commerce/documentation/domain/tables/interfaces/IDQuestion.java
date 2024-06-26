/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.documentation.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.setOrThrow;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public interface IDQuestion extends VertxPojo, Serializable {

    /**
     * Getter for <code>ZDB.D_QUESTION.KEY</code>. 「key」- 问题主键
     */
    public String getKey();

    /**
     * Setter for <code>ZDB.D_QUESTION.KEY</code>. 「key」- 问题主键
     */
    public IDQuestion setKey(String value);

    /**
     * Getter for <code>ZDB.D_QUESTION.CODE</code>. 「code」- 问题编号
     */
    public String getCode();

    /**
     * Setter for <code>ZDB.D_QUESTION.CODE</code>. 「code」- 问题编号
     */
    public IDQuestion setCode(String value);

    /**
     * Getter for <code>ZDB.D_QUESTION.TYPE</code>. 「type」- 题目类型
     */
    public String getType();

    /**
     * Setter for <code>ZDB.D_QUESTION.TYPE</code>. 「type」- 题目类型
     */
    public IDQuestion setType(String value);

    /**
     * Getter for <code>ZDB.D_QUESTION.SORT</code>. 「sort」- 题目排序（题库中题目顺序）
     */
    public Integer getSort();

    /**
     * Setter for <code>ZDB.D_QUESTION.SORT</code>. 「sort」- 题目排序（题库中题目顺序）
     */
    public IDQuestion setSort(Integer value);

    /**
     * Getter for <code>ZDB.D_QUESTION.NAME</code>. 「name」- 题干
     */
    public String getName();

    /**
     * Setter for <code>ZDB.D_QUESTION.NAME</code>. 「name」- 题干
     */
    public IDQuestion setName(String value);

    /**
     * Getter for <code>ZDB.D_QUESTION.BRIEF</code>. 「brief」- 题目描述信息
     */
    public String getBrief();

    /**
     * Setter for <code>ZDB.D_QUESTION.BRIEF</code>. 「brief」- 题目描述信息
     */
    public IDQuestion setBrief(String value);

    /**
     * Getter for <code>ZDB.D_QUESTION.TIP</code>. 「tip」- 题目提示信息
     */
    public String getTip();

    /**
     * Setter for <code>ZDB.D_QUESTION.TIP</code>. 「tip」- 题目提示信息
     */
    public IDQuestion setTip(String value);

    /**
     * Getter for <code>ZDB.D_QUESTION.MATERIAL</code>. 「material」- 题目的特殊材料
     */
    public String getMaterial();

    /**
     * Setter for <code>ZDB.D_QUESTION.MATERIAL</code>. 「material」- 题目的特殊材料
     */
    public IDQuestion setMaterial(String value);

    /**
     * Getter for <code>ZDB.D_QUESTION.MATERIAL_FILES</code>. 「materialFiles」-
     * 材料文件
     */
    public String getMaterialFiles();

    /**
     * Setter for <code>ZDB.D_QUESTION.MATERIAL_FILES</code>. 「materialFiles」-
     * 材料文件
     */
    public IDQuestion setMaterialFiles(String value);

    /**
     * Getter for <code>ZDB.D_QUESTION.SCORE</code>. 「score」- 题目分值
     */
    public BigDecimal getScore();

    /**
     * Setter for <code>ZDB.D_QUESTION.SCORE</code>. 「score」- 题目分值
     */
    public IDQuestion setScore(BigDecimal value);

    /**
     * Getter for <code>ZDB.D_QUESTION.LEVEL</code>. 「level」- 题目等级（难度）
     */
    public Integer getLevel();

    /**
     * Setter for <code>ZDB.D_QUESTION.LEVEL</code>. 「level」- 题目等级（难度）
     */
    public IDQuestion setLevel(Integer value);

    /**
     * Getter for <code>ZDB.D_QUESTION.LEVEL_CONTENT</code>. 「levelContent」-
     * 题目等级描述信息
     */
    public String getLevelContent();

    /**
     * Setter for <code>ZDB.D_QUESTION.LEVEL_CONTENT</code>. 「levelContent」-
     * 题目等级描述信息
     */
    public IDQuestion setLevelContent(String value);

    /**
     * Getter for <code>ZDB.D_QUESTION.ANSWER_DEFINE</code>. 「answerDefine」-
     * 答题描述
     */
    public String getAnswerDefine();

    /**
     * Setter for <code>ZDB.D_QUESTION.ANSWER_DEFINE</code>. 「answerDefine」-
     * 答题描述
     */
    public IDQuestion setAnswerDefine(String value);

    /**
     * Getter for <code>ZDB.D_QUESTION.STORE_ID</code>. 「storeId」- 所属题库
     */
    public String getStoreId();

    /**
     * Setter for <code>ZDB.D_QUESTION.STORE_ID</code>. 「storeId」- 所属题库
     */
    public IDQuestion setStoreId(String value);

    /**
     * Getter for <code>ZDB.D_QUESTION.MODEL_ID</code>. 「modelId」-
     * 关联的模型identifier，用于描述
     */
    public String getModelId();

    /**
     * Setter for <code>ZDB.D_QUESTION.MODEL_ID</code>. 「modelId」-
     * 关联的模型identifier，用于描述
     */
    public IDQuestion setModelId(String value);

    /**
     * Getter for <code>ZDB.D_QUESTION.MODEL_KEY</code>. 「modelKey」-
     * 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    public String getModelKey();

    /**
     * Setter for <code>ZDB.D_QUESTION.MODEL_KEY</code>. 「modelKey」-
     * 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    public IDQuestion setModelKey(String value);

    /**
     * Getter for <code>ZDB.D_QUESTION.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>ZDB.D_QUESTION.SIGMA</code>. 「sigma」- 统一标识
     */
    public IDQuestion setSigma(String value);

    /**
     * Getter for <code>ZDB.D_QUESTION.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>ZDB.D_QUESTION.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IDQuestion setLanguage(String value);

    /**
     * Getter for <code>ZDB.D_QUESTION.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>ZDB.D_QUESTION.ACTIVE</code>. 「active」- 是否启用
     */
    public IDQuestion setActive(Boolean value);

    /**
     * Getter for <code>ZDB.D_QUESTION.METADATA</code>. 「metadata」- 附加配置数据
     */
    public String getMetadata();

    /**
     * Setter for <code>ZDB.D_QUESTION.METADATA</code>. 「metadata」- 附加配置数据
     */
    public IDQuestion setMetadata(String value);

    /**
     * Getter for <code>ZDB.D_QUESTION.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>ZDB.D_QUESTION.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IDQuestion setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.D_QUESTION.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>ZDB.D_QUESTION.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IDQuestion setCreatedBy(String value);

    /**
     * Getter for <code>ZDB.D_QUESTION.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>ZDB.D_QUESTION.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IDQuestion setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.D_QUESTION.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    /**
     * Setter for <code>ZDB.D_QUESTION.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IDQuestion setUpdatedBy(String value);

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IDQuestion
     */
    public void from(IDQuestion from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IDQuestion
     */
    public <E extends IDQuestion> E into(E into);

    @Override
    public default IDQuestion fromJson(io.vertx.core.json.JsonObject json) {
        setOrThrow(this::setKey, json::getString, "KEY", "java.lang.String");
        setOrThrow(this::setCode, json::getString, "CODE", "java.lang.String");
        setOrThrow(this::setType, json::getString, "TYPE", "java.lang.String");
        setOrThrow(this::setSort, json::getInteger, "SORT", "java.lang.Integer");
        setOrThrow(this::setName, json::getString, "NAME", "java.lang.String");
        setOrThrow(this::setBrief, json::getString, "BRIEF", "java.lang.String");
        setOrThrow(this::setTip, json::getString, "TIP", "java.lang.String");
        setOrThrow(this::setMaterial, json::getString, "MATERIAL", "java.lang.String");
        setOrThrow(this::setMaterialFiles, json::getString, "MATERIAL_FILES", "java.lang.String");
        setOrThrow(this::setScore, key -> {
            String s = json.getString(key);
            return s == null ? null : new java.math.BigDecimal(s);
        }, "SCORE", "java.math.BigDecimal");
        setOrThrow(this::setLevel, json::getInteger, "LEVEL", "java.lang.Integer");
        setOrThrow(this::setLevelContent, json::getString, "LEVEL_CONTENT", "java.lang.String");
        setOrThrow(this::setAnswerDefine, json::getString, "ANSWER_DEFINE", "java.lang.String");
        setOrThrow(this::setStoreId, json::getString, "STORE_ID", "java.lang.String");
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
        json.put("TYPE", getType());
        json.put("SORT", getSort());
        json.put("NAME", getName());
        json.put("BRIEF", getBrief());
        json.put("TIP", getTip());
        json.put("MATERIAL", getMaterial());
        json.put("MATERIAL_FILES", getMaterialFiles());
        json.put("SCORE", getScore() == null ? null : getScore().toString());
        json.put("LEVEL", getLevel());
        json.put("LEVEL_CONTENT", getLevelContent());
        json.put("ANSWER_DEFINE", getAnswerDefine());
        json.put("STORE_ID", getStoreId());
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
