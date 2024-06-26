/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.documentation.domain.tables.pojos;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.zerows.extension.commerce.documentation.domain.tables.interfaces.IDQrule;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class DQrule implements VertxPojo, IDQrule {

    private static final long serialVersionUID = 1L;

    private String refId;
    private String answerId;
    private String paperId;
    private String type;
    private String questionId;
    private Boolean isRequired;
    private Boolean isAttached;
    private Boolean isProof;
    private String ruleSet;
    private String ruleConfig;
    private String ruleComponent;

    public DQrule() {
    }

    public DQrule(IDQrule value) {
        this.refId = value.getRefId();
        this.answerId = value.getAnswerId();
        this.paperId = value.getPaperId();
        this.type = value.getType();
        this.questionId = value.getQuestionId();
        this.isRequired = value.getIsRequired();
        this.isAttached = value.getIsAttached();
        this.isProof = value.getIsProof();
        this.ruleSet = value.getRuleSet();
        this.ruleConfig = value.getRuleConfig();
        this.ruleComponent = value.getRuleComponent();
    }

    public DQrule(
        String refId,
        String answerId,
        String paperId,
        String type,
        String questionId,
        Boolean isRequired,
        Boolean isAttached,
        Boolean isProof,
        String ruleSet,
        String ruleConfig,
        String ruleComponent
    ) {
        this.refId = refId;
        this.answerId = answerId;
        this.paperId = paperId;
        this.type = type;
        this.questionId = questionId;
        this.isRequired = isRequired;
        this.isAttached = isAttached;
        this.isProof = isProof;
        this.ruleSet = ruleSet;
        this.ruleConfig = ruleConfig;
        this.ruleComponent = ruleComponent;
    }

    public DQrule(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    /**
     * Getter for <code>ZDB.D_QRULE.REF_ID</code>. 「refId」- 关联考卷中问题实例，对应
     * D_PAPER_REF 表中内容
     */
    @Override
    public String getRefId() {
        return this.refId;
    }

    /**
     * Setter for <code>ZDB.D_QRULE.REF_ID</code>. 「refId」- 关联考卷中问题实例，对应
     * D_PAPER_REF 表中内容
     */
    @Override
    public DQrule setRefId(String refId) {
        this.refId = refId;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QRULE.ANSWER_ID</code>. 「answerId」- 考卷ID
     */
    @Override
    public String getAnswerId() {
        return this.answerId;
    }

    /**
     * Setter for <code>ZDB.D_QRULE.ANSWER_ID</code>. 「answerId」- 考卷ID
     */
    @Override
    public DQrule setAnswerId(String answerId) {
        this.answerId = answerId;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QRULE.PAPER_ID</code>. 「paperId」- 规则所属考卷ID
     */
    @Override
    public String getPaperId() {
        return this.paperId;
    }

    /**
     * Setter for <code>ZDB.D_QRULE.PAPER_ID</code>. 「paperId」- 规则所属考卷ID
     */
    @Override
    public DQrule setPaperId(String paperId) {
        this.paperId = paperId;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QRULE.TYPE</code>. 「type」- 规则类型
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>ZDB.D_QRULE.TYPE</code>. 「type」- 规则类型
     */
    @Override
    public DQrule setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QRULE.QUESTION_ID</code>. 「questionId」- 问题ID
     */
    @Override
    public String getQuestionId() {
        return this.questionId;
    }

    /**
     * Setter for <code>ZDB.D_QRULE.QUESTION_ID</code>. 「questionId」- 问题ID
     */
    @Override
    public DQrule setQuestionId(String questionId) {
        this.questionId = questionId;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QRULE.IS_REQUIRED</code>. 「isRequired」- 必答题
     */
    @Override
    public Boolean getIsRequired() {
        return this.isRequired;
    }

    /**
     * Setter for <code>ZDB.D_QRULE.IS_REQUIRED</code>. 「isRequired」- 必答题
     */
    @Override
    public DQrule setIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QRULE.IS_ATTACHED</code>. 「isAttached」- 附件必须
     */
    @Override
    public Boolean getIsAttached() {
        return this.isAttached;
    }

    /**
     * Setter for <code>ZDB.D_QRULE.IS_ATTACHED</code>. 「isAttached」- 附件必须
     */
    @Override
    public DQrule setIsAttached(Boolean isAttached) {
        this.isAttached = isAttached;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QRULE.IS_PROOF</code>. 「isProof」- 证据必须
     */
    @Override
    public Boolean getIsProof() {
        return this.isProof;
    }

    /**
     * Setter for <code>ZDB.D_QRULE.IS_PROOF</code>. 「isProof」- 证据必须
     */
    @Override
    public DQrule setIsProof(Boolean isProof) {
        this.isProof = isProof;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QRULE.RULE_SET</code>. 「ruleSet」- 规则分批执行
     */
    @Override
    public String getRuleSet() {
        return this.ruleSet;
    }

    /**
     * Setter for <code>ZDB.D_QRULE.RULE_SET</code>. 「ruleSet」- 规则分批执行
     */
    @Override
    public DQrule setRuleSet(String ruleSet) {
        this.ruleSet = ruleSet;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QRULE.RULE_CONFIG</code>. 「ruleConfig」- 规则相关配置
     */
    @Override
    public String getRuleConfig() {
        return this.ruleConfig;
    }

    /**
     * Setter for <code>ZDB.D_QRULE.RULE_CONFIG</code>. 「ruleConfig」- 规则相关配置
     */
    @Override
    public DQrule setRuleConfig(String ruleConfig) {
        this.ruleConfig = ruleConfig;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QRULE.RULE_COMPONENT</code>. 「ruleComponent」-
     * 规则执行组件（扩展用）
     */
    @Override
    public String getRuleComponent() {
        return this.ruleComponent;
    }

    /**
     * Setter for <code>ZDB.D_QRULE.RULE_COMPONENT</code>. 「ruleComponent」-
     * 规则执行组件（扩展用）
     */
    @Override
    public DQrule setRuleComponent(String ruleComponent) {
        this.ruleComponent = ruleComponent;
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
        final DQrule other = (DQrule) obj;
        if (this.refId == null) {
            if (other.refId != null)
                return false;
        } else if (!this.refId.equals(other.refId))
            return false;
        if (this.answerId == null) {
            if (other.answerId != null)
                return false;
        } else if (!this.answerId.equals(other.answerId))
            return false;
        if (this.paperId == null) {
            if (other.paperId != null)
                return false;
        } else if (!this.paperId.equals(other.paperId))
            return false;
        if (this.type == null) {
            if (other.type != null)
                return false;
        } else if (!this.type.equals(other.type))
            return false;
        if (this.questionId == null) {
            if (other.questionId != null)
                return false;
        } else if (!this.questionId.equals(other.questionId))
            return false;
        if (this.isRequired == null) {
            if (other.isRequired != null)
                return false;
        } else if (!this.isRequired.equals(other.isRequired))
            return false;
        if (this.isAttached == null) {
            if (other.isAttached != null)
                return false;
        } else if (!this.isAttached.equals(other.isAttached))
            return false;
        if (this.isProof == null) {
            if (other.isProof != null)
                return false;
        } else if (!this.isProof.equals(other.isProof))
            return false;
        if (this.ruleSet == null) {
            if (other.ruleSet != null)
                return false;
        } else if (!this.ruleSet.equals(other.ruleSet))
            return false;
        if (this.ruleConfig == null) {
            if (other.ruleConfig != null)
                return false;
        } else if (!this.ruleConfig.equals(other.ruleConfig))
            return false;
        if (this.ruleComponent == null) {
            if (other.ruleComponent != null)
                return false;
        } else if (!this.ruleComponent.equals(other.ruleComponent))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.refId == null) ? 0 : this.refId.hashCode());
        result = prime * result + ((this.answerId == null) ? 0 : this.answerId.hashCode());
        result = prime * result + ((this.paperId == null) ? 0 : this.paperId.hashCode());
        result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
        result = prime * result + ((this.questionId == null) ? 0 : this.questionId.hashCode());
        result = prime * result + ((this.isRequired == null) ? 0 : this.isRequired.hashCode());
        result = prime * result + ((this.isAttached == null) ? 0 : this.isAttached.hashCode());
        result = prime * result + ((this.isProof == null) ? 0 : this.isProof.hashCode());
        result = prime * result + ((this.ruleSet == null) ? 0 : this.ruleSet.hashCode());
        result = prime * result + ((this.ruleConfig == null) ? 0 : this.ruleConfig.hashCode());
        result = prime * result + ((this.ruleComponent == null) ? 0 : this.ruleComponent.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DQrule (");

        sb.append(refId);
        sb.append(", ").append(answerId);
        sb.append(", ").append(paperId);
        sb.append(", ").append(type);
        sb.append(", ").append(questionId);
        sb.append(", ").append(isRequired);
        sb.append(", ").append(isAttached);
        sb.append(", ").append(isProof);
        sb.append(", ").append(ruleSet);
        sb.append(", ").append(ruleConfig);
        sb.append(", ").append(ruleComponent);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IDQrule from) {
        setRefId(from.getRefId());
        setAnswerId(from.getAnswerId());
        setPaperId(from.getPaperId());
        setType(from.getType());
        setQuestionId(from.getQuestionId());
        setIsRequired(from.getIsRequired());
        setIsAttached(from.getIsAttached());
        setIsProof(from.getIsProof());
        setRuleSet(from.getRuleSet());
        setRuleConfig(from.getRuleConfig());
        setRuleComponent(from.getRuleComponent());
    }

    @Override
    public <E extends IDQrule> E into(E into) {
        into.from(this);
        return into;
    }
}
