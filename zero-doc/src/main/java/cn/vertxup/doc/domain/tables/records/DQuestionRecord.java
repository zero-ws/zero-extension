/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.doc.domain.tables.records;


import cn.vertxup.doc.domain.tables.DQuestion;
import cn.vertxup.doc.domain.tables.interfaces.IDQuestion;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DQuestionRecord extends UpdatableRecordImpl<DQuestionRecord> implements VertxPojo, IDQuestion {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>ZDB.D_QUESTION.KEY</code>. 「key」- 问题主键
     */
    @Override
    public DQuestionRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.KEY</code>. 「key」- 问题主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.CODE</code>. 「code」- 问题编号
     */
    @Override
    public DQuestionRecord setCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.CODE</code>. 「code」- 问题编号
     */
    @Override
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.TYPE</code>. 「type」- 题目类型
     */
    @Override
    public DQuestionRecord setType(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.TYPE</code>. 「type」- 题目类型
     */
    @Override
    public String getType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.SORT</code>. 「sort」- 题目排序（题库中题目顺序）
     */
    @Override
    public DQuestionRecord setSort(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.SORT</code>. 「sort」- 题目排序（题库中题目顺序）
     */
    @Override
    public Integer getSort() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.NAME</code>. 「name」- 题干
     */
    @Override
    public DQuestionRecord setName(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.NAME</code>. 「name」- 题干
     */
    @Override
    public String getName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.BRIEF</code>. 「brief」- 题目描述信息
     */
    @Override
    public DQuestionRecord setBrief(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.BRIEF</code>. 「brief」- 题目描述信息
     */
    @Override
    public String getBrief() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.TIP</code>. 「tip」- 题目提示信息
     */
    @Override
    public DQuestionRecord setTip(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.TIP</code>. 「tip」- 题目提示信息
     */
    @Override
    public String getTip() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.MATERIAL</code>. 「material」- 题目的特殊材料
     */
    @Override
    public DQuestionRecord setMaterial(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.MATERIAL</code>. 「material」- 题目的特殊材料
     */
    @Override
    public String getMaterial() {
        return (String) get(7);
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.MATERIAL_FILES</code>. 「materialFiles」-
     * 材料文件
     */
    @Override
    public DQuestionRecord setMaterialFiles(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.MATERIAL_FILES</code>. 「materialFiles」-
     * 材料文件
     */
    @Override
    public String getMaterialFiles() {
        return (String) get(8);
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.SCORE</code>. 「score」- 题目分值
     */
    @Override
    public DQuestionRecord setScore(BigDecimal value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.SCORE</code>. 「score」- 题目分值
     */
    @Override
    public BigDecimal getScore() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.LEVEL</code>. 「level」- 题目等级（难度）
     */
    @Override
    public DQuestionRecord setLevel(Integer value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.LEVEL</code>. 「level」- 题目等级（难度）
     */
    @Override
    public Integer getLevel() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.LEVEL_CONTENT</code>. 「levelContent」-
     * 题目等级描述信息
     */
    @Override
    public DQuestionRecord setLevelContent(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.LEVEL_CONTENT</code>. 「levelContent」-
     * 题目等级描述信息
     */
    @Override
    public String getLevelContent() {
        return (String) get(11);
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.ANSWER_DEFINE</code>. 「answerDefine」-
     * 答题描述
     */
    @Override
    public DQuestionRecord setAnswerDefine(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.ANSWER_DEFINE</code>. 「answerDefine」-
     * 答题描述
     */
    @Override
    public String getAnswerDefine() {
        return (String) get(12);
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.STORE_ID</code>. 「storeId」- 所属题库
     */
    @Override
    public DQuestionRecord setStoreId(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.STORE_ID</code>. 「storeId」- 所属题库
     */
    @Override
    public String getStoreId() {
        return (String) get(13);
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.MODEL_ID</code>. 「modelId」-
     * 关联的模型identifier，用于描述
     */
    @Override
    public DQuestionRecord setModelId(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.MODEL_ID</code>. 「modelId」-
     * 关联的模型identifier，用于描述
     */
    @Override
    public String getModelId() {
        return (String) get(14);
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.MODEL_KEY</code>. 「modelKey」-
     * 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    @Override
    public DQuestionRecord setModelKey(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.MODEL_KEY</code>. 「modelKey」-
     * 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    @Override
    public String getModelKey() {
        return (String) get(15);
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public DQuestionRecord setSigma(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(16);
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public DQuestionRecord setLanguage(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(17);
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public DQuestionRecord setActive(Boolean value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(18);
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public DQuestionRecord setMetadata(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return (String) get(19);
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public DQuestionRecord setCreatedAt(LocalDateTime value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(20);
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public DQuestionRecord setCreatedBy(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(21);
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public DQuestionRecord setUpdatedAt(LocalDateTime value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(22);
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public DQuestionRecord setUpdatedBy(String value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(23);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IDQuestion from) {
        setKey(from.getKey());
        setCode(from.getCode());
        setType(from.getType());
        setSort(from.getSort());
        setName(from.getName());
        setBrief(from.getBrief());
        setTip(from.getTip());
        setMaterial(from.getMaterial());
        setMaterialFiles(from.getMaterialFiles());
        setScore(from.getScore());
        setLevel(from.getLevel());
        setLevelContent(from.getLevelContent());
        setAnswerDefine(from.getAnswerDefine());
        setStoreId(from.getStoreId());
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
        resetChangedOnNotNull();
    }

    @Override
    public <E extends IDQuestion> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DQuestionRecord
     */
    public DQuestionRecord() {
        super(DQuestion.D_QUESTION);
    }

    /**
     * Create a detached, initialised DQuestionRecord
     */
    public DQuestionRecord(String key, String code, String type, Integer sort, String name, String brief, String tip, String material, String materialFiles, BigDecimal score, Integer level, String levelContent, String answerDefine, String storeId, String modelId, String modelKey, String sigma, String language, Boolean active, String metadata, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(DQuestion.D_QUESTION);

        setKey(key);
        setCode(code);
        setType(type);
        setSort(sort);
        setName(name);
        setBrief(brief);
        setTip(tip);
        setMaterial(material);
        setMaterialFiles(materialFiles);
        setScore(score);
        setLevel(level);
        setLevelContent(levelContent);
        setAnswerDefine(answerDefine);
        setStoreId(storeId);
        setModelId(modelId);
        setModelKey(modelKey);
        setSigma(sigma);
        setLanguage(language);
        setActive(active);
        setMetadata(metadata);
        setCreatedAt(createdAt);
        setCreatedBy(createdBy);
        setUpdatedAt(updatedAt);
        setUpdatedBy(updatedBy);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised DQuestionRecord
     */
    public DQuestionRecord(cn.vertxup.doc.domain.tables.pojos.DQuestion value) {
        super(DQuestion.D_QUESTION);

        if (value != null) {
            setKey(value.getKey());
            setCode(value.getCode());
            setType(value.getType());
            setSort(value.getSort());
            setName(value.getName());
            setBrief(value.getBrief());
            setTip(value.getTip());
            setMaterial(value.getMaterial());
            setMaterialFiles(value.getMaterialFiles());
            setScore(value.getScore());
            setLevel(value.getLevel());
            setLevelContent(value.getLevelContent());
            setAnswerDefine(value.getAnswerDefine());
            setStoreId(value.getStoreId());
            setModelId(value.getModelId());
            setModelKey(value.getModelKey());
            setSigma(value.getSigma());
            setLanguage(value.getLanguage());
            setActive(value.getActive());
            setMetadata(value.getMetadata());
            setCreatedAt(value.getCreatedAt());
            setCreatedBy(value.getCreatedBy());
            setUpdatedAt(value.getUpdatedAt());
            setUpdatedBy(value.getUpdatedBy());
            resetChangedOnNotNull();
        }
    }

        public DQuestionRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
