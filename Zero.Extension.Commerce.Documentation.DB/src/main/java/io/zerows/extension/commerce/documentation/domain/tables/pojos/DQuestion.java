/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.documentation.domain.tables.pojos;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.zerows.extension.commerce.documentation.domain.tables.interfaces.IDQuestion;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class DQuestion implements VertxPojo, IDQuestion {

    private static final long serialVersionUID = 1L;

    private String key;
    private String code;
    private String type;
    private Integer sort;
    private String name;
    private String brief;
    private String tip;
    private String material;
    private String materialFiles;
    private BigDecimal score;
    private Integer level;
    private String levelContent;
    private String answerDefine;
    private String storeId;
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

    public DQuestion() {
    }

    public DQuestion(IDQuestion value) {
        this.key = value.getKey();
        this.code = value.getCode();
        this.type = value.getType();
        this.sort = value.getSort();
        this.name = value.getName();
        this.brief = value.getBrief();
        this.tip = value.getTip();
        this.material = value.getMaterial();
        this.materialFiles = value.getMaterialFiles();
        this.score = value.getScore();
        this.level = value.getLevel();
        this.levelContent = value.getLevelContent();
        this.answerDefine = value.getAnswerDefine();
        this.storeId = value.getStoreId();
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

    public DQuestion(
        String key,
        String code,
        String type,
        Integer sort,
        String name,
        String brief,
        String tip,
        String material,
        String materialFiles,
        BigDecimal score,
        Integer level,
        String levelContent,
        String answerDefine,
        String storeId,
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
        this.code = code;
        this.type = type;
        this.sort = sort;
        this.name = name;
        this.brief = brief;
        this.tip = tip;
        this.material = material;
        this.materialFiles = materialFiles;
        this.score = score;
        this.level = level;
        this.levelContent = levelContent;
        this.answerDefine = answerDefine;
        this.storeId = storeId;
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

    public DQuestion(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.KEY</code>. 「key」- 问题主键
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.KEY</code>. 「key」- 问题主键
     */
    @Override
    public DQuestion setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.CODE</code>. 「code」- 问题编号
     */
    @Override
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.CODE</code>. 「code」- 问题编号
     */
    @Override
    public DQuestion setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.TYPE</code>. 「type」- 题目类型
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.TYPE</code>. 「type」- 题目类型
     */
    @Override
    public DQuestion setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.SORT</code>. 「sort」- 题目排序（题库中题目顺序）
     */
    @Override
    public Integer getSort() {
        return this.sort;
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.SORT</code>. 「sort」- 题目排序（题库中题目顺序）
     */
    @Override
    public DQuestion setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.NAME</code>. 「name」- 题干
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.NAME</code>. 「name」- 题干
     */
    @Override
    public DQuestion setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.BRIEF</code>. 「brief」- 题目描述信息
     */
    @Override
    public String getBrief() {
        return this.brief;
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.BRIEF</code>. 「brief」- 题目描述信息
     */
    @Override
    public DQuestion setBrief(String brief) {
        this.brief = brief;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.TIP</code>. 「tip」- 题目提示信息
     */
    @Override
    public String getTip() {
        return this.tip;
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.TIP</code>. 「tip」- 题目提示信息
     */
    @Override
    public DQuestion setTip(String tip) {
        this.tip = tip;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.MATERIAL</code>. 「material」- 题目的特殊材料
     */
    @Override
    public String getMaterial() {
        return this.material;
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.MATERIAL</code>. 「material」- 题目的特殊材料
     */
    @Override
    public DQuestion setMaterial(String material) {
        this.material = material;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.MATERIAL_FILES</code>. 「materialFiles」-
     * 材料文件
     */
    @Override
    public String getMaterialFiles() {
        return this.materialFiles;
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.MATERIAL_FILES</code>. 「materialFiles」-
     * 材料文件
     */
    @Override
    public DQuestion setMaterialFiles(String materialFiles) {
        this.materialFiles = materialFiles;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.SCORE</code>. 「score」- 题目分值
     */
    @Override
    public BigDecimal getScore() {
        return this.score;
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.SCORE</code>. 「score」- 题目分值
     */
    @Override
    public DQuestion setScore(BigDecimal score) {
        this.score = score;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.LEVEL</code>. 「level」- 题目等级（难度）
     */
    @Override
    public Integer getLevel() {
        return this.level;
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.LEVEL</code>. 「level」- 题目等级（难度）
     */
    @Override
    public DQuestion setLevel(Integer level) {
        this.level = level;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.LEVEL_CONTENT</code>. 「levelContent」-
     * 题目等级描述信息
     */
    @Override
    public String getLevelContent() {
        return this.levelContent;
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.LEVEL_CONTENT</code>. 「levelContent」-
     * 题目等级描述信息
     */
    @Override
    public DQuestion setLevelContent(String levelContent) {
        this.levelContent = levelContent;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.ANSWER_DEFINE</code>. 「answerDefine」-
     * 答题描述
     */
    @Override
    public String getAnswerDefine() {
        return this.answerDefine;
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.ANSWER_DEFINE</code>. 「answerDefine」-
     * 答题描述
     */
    @Override
    public DQuestion setAnswerDefine(String answerDefine) {
        this.answerDefine = answerDefine;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.STORE_ID</code>. 「storeId」- 所属题库
     */
    @Override
    public String getStoreId() {
        return this.storeId;
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.STORE_ID</code>. 「storeId」- 所属题库
     */
    @Override
    public DQuestion setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.MODEL_ID</code>. 「modelId」-
     * 关联的模型identifier，用于描述
     */
    @Override
    public String getModelId() {
        return this.modelId;
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.MODEL_ID</code>. 「modelId」-
     * 关联的模型identifier，用于描述
     */
    @Override
    public DQuestion setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.MODEL_KEY</code>. 「modelKey」-
     * 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    @Override
    public String getModelKey() {
        return this.modelKey;
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.MODEL_KEY</code>. 「modelKey」-
     * 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    @Override
    public DQuestion setModelKey(String modelKey) {
        this.modelKey = modelKey;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public DQuestion setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public DQuestion setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public DQuestion setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public DQuestion setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public DQuestion setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public DQuestion setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public DQuestion setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QUESTION.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>ZDB.D_QUESTION.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public DQuestion setUpdatedBy(String updatedBy) {
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
        final DQuestion other = (DQuestion) obj;
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
        if (this.type == null) {
            if (other.type != null)
                return false;
        } else if (!this.type.equals(other.type))
            return false;
        if (this.sort == null) {
            if (other.sort != null)
                return false;
        } else if (!this.sort.equals(other.sort))
            return false;
        if (this.name == null) {
            if (other.name != null)
                return false;
        } else if (!this.name.equals(other.name))
            return false;
        if (this.brief == null) {
            if (other.brief != null)
                return false;
        } else if (!this.brief.equals(other.brief))
            return false;
        if (this.tip == null) {
            if (other.tip != null)
                return false;
        } else if (!this.tip.equals(other.tip))
            return false;
        if (this.material == null) {
            if (other.material != null)
                return false;
        } else if (!this.material.equals(other.material))
            return false;
        if (this.materialFiles == null) {
            if (other.materialFiles != null)
                return false;
        } else if (!this.materialFiles.equals(other.materialFiles))
            return false;
        if (this.score == null) {
            if (other.score != null)
                return false;
        } else if (!this.score.equals(other.score))
            return false;
        if (this.level == null) {
            if (other.level != null)
                return false;
        } else if (!this.level.equals(other.level))
            return false;
        if (this.levelContent == null) {
            if (other.levelContent != null)
                return false;
        } else if (!this.levelContent.equals(other.levelContent))
            return false;
        if (this.answerDefine == null) {
            if (other.answerDefine != null)
                return false;
        } else if (!this.answerDefine.equals(other.answerDefine))
            return false;
        if (this.storeId == null) {
            if (other.storeId != null)
                return false;
        } else if (!this.storeId.equals(other.storeId))
            return false;
        if (this.modelId == null) {
            if (other.modelId != null)
                return false;
        } else if (!this.modelId.equals(other.modelId))
            return false;
        if (this.modelKey == null) {
            if (other.modelKey != null)
                return false;
        } else if (!this.modelKey.equals(other.modelKey))
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
        result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
        result = prime * result + ((this.sort == null) ? 0 : this.sort.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.brief == null) ? 0 : this.brief.hashCode());
        result = prime * result + ((this.tip == null) ? 0 : this.tip.hashCode());
        result = prime * result + ((this.material == null) ? 0 : this.material.hashCode());
        result = prime * result + ((this.materialFiles == null) ? 0 : this.materialFiles.hashCode());
        result = prime * result + ((this.score == null) ? 0 : this.score.hashCode());
        result = prime * result + ((this.level == null) ? 0 : this.level.hashCode());
        result = prime * result + ((this.levelContent == null) ? 0 : this.levelContent.hashCode());
        result = prime * result + ((this.answerDefine == null) ? 0 : this.answerDefine.hashCode());
        result = prime * result + ((this.storeId == null) ? 0 : this.storeId.hashCode());
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
        StringBuilder sb = new StringBuilder("DQuestion (");

        sb.append(key);
        sb.append(", ").append(code);
        sb.append(", ").append(type);
        sb.append(", ").append(sort);
        sb.append(", ").append(name);
        sb.append(", ").append(brief);
        sb.append(", ").append(tip);
        sb.append(", ").append(material);
        sb.append(", ").append(materialFiles);
        sb.append(", ").append(score);
        sb.append(", ").append(level);
        sb.append(", ").append(levelContent);
        sb.append(", ").append(answerDefine);
        sb.append(", ").append(storeId);
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
    }

    @Override
    public <E extends IDQuestion> E into(E into) {
        into.from(this);
        return into;
    }
}