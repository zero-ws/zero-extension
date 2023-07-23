/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.doc.domain.tables.pojos;


import cn.vertxup.doc.domain.tables.interfaces.IDQanswer;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DQanswer implements VertxPojo, IDQanswer {

    private static final long serialVersionUID = 1L;

    private String key;
    private String code;
    private String name;
    private String brief;
    private String uiConfig;
    private String questionId;
    private String sigma;
    private String language;
    private Boolean active;
    private String metadata;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public DQanswer() {}

    public DQanswer(IDQanswer value) {
        this.key = value.getKey();
        this.code = value.getCode();
        this.name = value.getName();
        this.brief = value.getBrief();
        this.uiConfig = value.getUiConfig();
        this.questionId = value.getQuestionId();
        this.sigma = value.getSigma();
        this.language = value.getLanguage();
        this.active = value.getActive();
        this.metadata = value.getMetadata();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public DQanswer(
        String key,
        String code,
        String name,
        String brief,
        String uiConfig,
        String questionId,
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
        this.name = name;
        this.brief = brief;
        this.uiConfig = uiConfig;
        this.questionId = questionId;
        this.sigma = sigma;
        this.language = language;
        this.active = active;
        this.metadata = metadata;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public DQanswer(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>ZDB.D_QANSWER.KEY</code>. 「key」- 答题主键
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>ZDB.D_QANSWER.KEY</code>. 「key」- 答题主键
     */
    @Override
    public DQanswer setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QANSWER.CODE</code>. 「code」- 答案编号
     */
    @Override
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>ZDB.D_QANSWER.CODE</code>. 「code」- 答案编号
     */
    @Override
    public DQanswer setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QANSWER.NAME</code>. 「name」- 答案内容
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>ZDB.D_QANSWER.NAME</code>. 「name」- 答案内容
     */
    @Override
    public DQanswer setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QANSWER.BRIEF</code>. 「brief」- 答案详细描述
     */
    @Override
    public String getBrief() {
        return this.brief;
    }

    /**
     * Setter for <code>ZDB.D_QANSWER.BRIEF</code>. 「brief」- 答案详细描述
     */
    @Override
    public DQanswer setBrief(String brief) {
        this.brief = brief;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QANSWER.UI_CONFIG</code>. 「uiConfig」- 答案呈现模式
     */
    @Override
    public String getUiConfig() {
        return this.uiConfig;
    }

    /**
     * Setter for <code>ZDB.D_QANSWER.UI_CONFIG</code>. 「uiConfig」- 答案呈现模式
     */
    @Override
    public DQanswer setUiConfig(String uiConfig) {
        this.uiConfig = uiConfig;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QANSWER.QUESTION_ID</code>. 「questionId」- 所属问题
     */
    @Override
    public String getQuestionId() {
        return this.questionId;
    }

    /**
     * Setter for <code>ZDB.D_QANSWER.QUESTION_ID</code>. 「questionId」- 所属问题
     */
    @Override
    public DQanswer setQuestionId(String questionId) {
        this.questionId = questionId;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QANSWER.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>ZDB.D_QANSWER.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public DQanswer setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QANSWER.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>ZDB.D_QANSWER.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public DQanswer setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QANSWER.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>ZDB.D_QANSWER.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public DQanswer setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QANSWER.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>ZDB.D_QANSWER.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public DQanswer setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QANSWER.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>ZDB.D_QANSWER.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public DQanswer setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QANSWER.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>ZDB.D_QANSWER.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public DQanswer setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QANSWER.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>ZDB.D_QANSWER.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public DQanswer setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QANSWER.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>ZDB.D_QANSWER.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public DQanswer setUpdatedBy(String updatedBy) {
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
        final DQanswer other = (DQanswer) obj;
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
        if (this.name == null) {
            if (other.name != null)
                return false;
        }
        else if (!this.name.equals(other.name))
            return false;
        if (this.brief == null) {
            if (other.brief != null)
                return false;
        }
        else if (!this.brief.equals(other.brief))
            return false;
        if (this.uiConfig == null) {
            if (other.uiConfig != null)
                return false;
        }
        else if (!this.uiConfig.equals(other.uiConfig))
            return false;
        if (this.questionId == null) {
            if (other.questionId != null)
                return false;
        }
        else if (!this.questionId.equals(other.questionId))
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
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.brief == null) ? 0 : this.brief.hashCode());
        result = prime * result + ((this.uiConfig == null) ? 0 : this.uiConfig.hashCode());
        result = prime * result + ((this.questionId == null) ? 0 : this.questionId.hashCode());
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
        StringBuilder sb = new StringBuilder("DQanswer (");

        sb.append(key);
        sb.append(", ").append(code);
        sb.append(", ").append(name);
        sb.append(", ").append(brief);
        sb.append(", ").append(uiConfig);
        sb.append(", ").append(questionId);
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
    public void from(IDQanswer from) {
        setKey(from.getKey());
        setCode(from.getCode());
        setName(from.getName());
        setBrief(from.getBrief());
        setUiConfig(from.getUiConfig());
        setQuestionId(from.getQuestionId());
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
    public <E extends IDQanswer> E into(E into) {
        into.from(this);
        return into;
    }
}
