/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.doc.domain.tables.pojos;


import cn.vertxup.doc.domain.tables.interfaces.IDReply;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.math.BigDecimal;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DReply implements VertxPojo, IDReply {

    private static final long serialVersionUID = 1L;

    private String key;
    private String code;
    private String userId;
    private String userName;
    private String userNo;
    private String identityIdc;
    private String identityId;
    private String examId;
    private String paperId;
    private String modelId;
    private String modelKey;
    private BigDecimal score;
    private String grade;
    private Boolean passed;
    private Integer qTotal;
    private Integer qReply;
    private Integer qOk;
    private String sigma;
    private String language;
    private Boolean active;
    private String metadata;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public DReply() {}

    public DReply(IDReply value) {
        this.key = value.getKey();
        this.code = value.getCode();
        this.userId = value.getUserId();
        this.userName = value.getUserName();
        this.userNo = value.getUserNo();
        this.identityIdc = value.getIdentityIdc();
        this.identityId = value.getIdentityId();
        this.examId = value.getExamId();
        this.paperId = value.getPaperId();
        this.modelId = value.getModelId();
        this.modelKey = value.getModelKey();
        this.score = value.getScore();
        this.grade = value.getGrade();
        this.passed = value.getPassed();
        this.qTotal = value.getQTotal();
        this.qReply = value.getQReply();
        this.qOk = value.getQOk();
        this.sigma = value.getSigma();
        this.language = value.getLanguage();
        this.active = value.getActive();
        this.metadata = value.getMetadata();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public DReply(
        String key,
        String code,
        String userId,
        String userName,
        String userNo,
        String identityIdc,
        String identityId,
        String examId,
        String paperId,
        String modelId,
        String modelKey,
        BigDecimal score,
        String grade,
        Boolean passed,
        Integer qTotal,
        Integer qReply,
        Integer qOk,
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
        this.userId = userId;
        this.userName = userName;
        this.userNo = userNo;
        this.identityIdc = identityIdc;
        this.identityId = identityId;
        this.examId = examId;
        this.paperId = paperId;
        this.modelId = modelId;
        this.modelKey = modelKey;
        this.score = score;
        this.grade = grade;
        this.passed = passed;
        this.qTotal = qTotal;
        this.qReply = qReply;
        this.qOk = qOk;
        this.sigma = sigma;
        this.language = language;
        this.active = active;
        this.metadata = metadata;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public DReply(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>ZDB.D_REPLY.KEY</code>. 「key」- 答题卡主键
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>ZDB.D_REPLY.KEY</code>. 「key」- 答题卡主键
     */
    @Override
    public DReply setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_REPLY.CODE</code>. 「code」- 答题卡编号
     */
    @Override
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>ZDB.D_REPLY.CODE</code>. 「code」- 答题卡编号
     */
    @Override
    public DReply setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_REPLY.USER_ID</code>. 「userId」- 考生ID
     */
    @Override
    public String getUserId() {
        return this.userId;
    }

    /**
     * Setter for <code>ZDB.D_REPLY.USER_ID</code>. 「userId」- 考生ID
     */
    @Override
    public DReply setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_REPLY.USER_NAME</code>. 「userName」- 考生姓名
     */
    @Override
    public String getUserName() {
        return this.userName;
    }

    /**
     * Setter for <code>ZDB.D_REPLY.USER_NAME</code>. 「userName」- 考生姓名
     */
    @Override
    public DReply setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_REPLY.USER_NO</code>. 「userNo」- 准考证号
     */
    @Override
    public String getUserNo() {
        return this.userNo;
    }

    /**
     * Setter for <code>ZDB.D_REPLY.USER_NO</code>. 「userNo」- 准考证号
     */
    @Override
    public DReply setUserNo(String userNo) {
        this.userNo = userNo;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_REPLY.IDENTITY_IDC</code>. 「identityIdc」- 证件号
     */
    @Override
    public String getIdentityIdc() {
        return this.identityIdc;
    }

    /**
     * Setter for <code>ZDB.D_REPLY.IDENTITY_IDC</code>. 「identityIdc」- 证件号
     */
    @Override
    public DReply setIdentityIdc(String identityIdc) {
        this.identityIdc = identityIdc;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_REPLY.IDENTITY_ID</code>. 「identityId」-
     * 关联档案时考生档案ID
     */
    @Override
    public String getIdentityId() {
        return this.identityId;
    }

    /**
     * Setter for <code>ZDB.D_REPLY.IDENTITY_ID</code>. 「identityId」-
     * 关联档案时考生档案ID
     */
    @Override
    public DReply setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_REPLY.EXAM_ID</code>. 「examId」- 哪场考试答题卡
     */
    @Override
    public String getExamId() {
        return this.examId;
    }

    /**
     * Setter for <code>ZDB.D_REPLY.EXAM_ID</code>. 「examId」- 哪场考试答题卡
     */
    @Override
    public DReply setExamId(String examId) {
        this.examId = examId;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_REPLY.PAPER_ID</code>. 「paperId」- 哪张试卷答题卡
     */
    @Override
    public String getPaperId() {
        return this.paperId;
    }

    /**
     * Setter for <code>ZDB.D_REPLY.PAPER_ID</code>. 「paperId」- 哪张试卷答题卡
     */
    @Override
    public DReply setPaperId(String paperId) {
        this.paperId = paperId;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_REPLY.MODEL_ID</code>. 「modelId」-
     * 关联的模型identifier，用于描述
     */
    @Override
    public String getModelId() {
        return this.modelId;
    }

    /**
     * Setter for <code>ZDB.D_REPLY.MODEL_ID</code>. 「modelId」-
     * 关联的模型identifier，用于描述
     */
    @Override
    public DReply setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_REPLY.MODEL_KEY</code>. 「modelKey」-
     * 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    @Override
    public String getModelKey() {
        return this.modelKey;
    }

    /**
     * Setter for <code>ZDB.D_REPLY.MODEL_KEY</code>. 「modelKey」-
     * 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    @Override
    public DReply setModelKey(String modelKey) {
        this.modelKey = modelKey;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_REPLY.SCORE</code>. 「score」- 得分
     */
    @Override
    public BigDecimal getScore() {
        return this.score;
    }

    /**
     * Setter for <code>ZDB.D_REPLY.SCORE</code>. 「score」- 得分
     */
    @Override
    public DReply setScore(BigDecimal score) {
        this.score = score;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_REPLY.GRADE</code>. 「grade」- 最终评级 S/A/B/C/D/E
     */
    @Override
    public String getGrade() {
        return this.grade;
    }

    /**
     * Setter for <code>ZDB.D_REPLY.GRADE</code>. 「grade」- 最终评级 S/A/B/C/D/E
     */
    @Override
    public DReply setGrade(String grade) {
        this.grade = grade;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_REPLY.PASSED</code>. 「passed」- 是否及格，及格 passed =
     * true，否则 passed = false
     */
    @Override
    public Boolean getPassed() {
        return this.passed;
    }

    /**
     * Setter for <code>ZDB.D_REPLY.PASSED</code>. 「passed」- 是否及格，及格 passed =
     * true，否则 passed = false
     */
    @Override
    public DReply setPassed(Boolean passed) {
        this.passed = passed;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_REPLY.Q_TOTAL</code>. 「qTotal」- 试题总量
     */
    @Override
    public Integer getQTotal() {
        return this.qTotal;
    }

    /**
     * Setter for <code>ZDB.D_REPLY.Q_TOTAL</code>. 「qTotal」- 试题总量
     */
    @Override
    public DReply setQTotal(Integer qTotal) {
        this.qTotal = qTotal;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_REPLY.Q_REPLY</code>. 「qReply」- 已答试题数量
     */
    @Override
    public Integer getQReply() {
        return this.qReply;
    }

    /**
     * Setter for <code>ZDB.D_REPLY.Q_REPLY</code>. 「qReply」- 已答试题数量
     */
    @Override
    public DReply setQReply(Integer qReply) {
        this.qReply = qReply;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_REPLY.Q_OK</code>. 「qOk」- 正确试题数量
     */
    @Override
    public Integer getQOk() {
        return this.qOk;
    }

    /**
     * Setter for <code>ZDB.D_REPLY.Q_OK</code>. 「qOk」- 正确试题数量
     */
    @Override
    public DReply setQOk(Integer qOk) {
        this.qOk = qOk;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_REPLY.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>ZDB.D_REPLY.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public DReply setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_REPLY.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>ZDB.D_REPLY.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public DReply setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_REPLY.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>ZDB.D_REPLY.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public DReply setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_REPLY.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>ZDB.D_REPLY.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public DReply setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_REPLY.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>ZDB.D_REPLY.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public DReply setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_REPLY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>ZDB.D_REPLY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public DReply setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_REPLY.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>ZDB.D_REPLY.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public DReply setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_REPLY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>ZDB.D_REPLY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public DReply setUpdatedBy(String updatedBy) {
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
        final DReply other = (DReply) obj;
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
        if (this.userId == null) {
            if (other.userId != null)
                return false;
        }
        else if (!this.userId.equals(other.userId))
            return false;
        if (this.userName == null) {
            if (other.userName != null)
                return false;
        }
        else if (!this.userName.equals(other.userName))
            return false;
        if (this.userNo == null) {
            if (other.userNo != null)
                return false;
        }
        else if (!this.userNo.equals(other.userNo))
            return false;
        if (this.identityIdc == null) {
            if (other.identityIdc != null)
                return false;
        }
        else if (!this.identityIdc.equals(other.identityIdc))
            return false;
        if (this.identityId == null) {
            if (other.identityId != null)
                return false;
        }
        else if (!this.identityId.equals(other.identityId))
            return false;
        if (this.examId == null) {
            if (other.examId != null)
                return false;
        }
        else if (!this.examId.equals(other.examId))
            return false;
        if (this.paperId == null) {
            if (other.paperId != null)
                return false;
        }
        else if (!this.paperId.equals(other.paperId))
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
        if (this.score == null) {
            if (other.score != null)
                return false;
        }
        else if (!this.score.equals(other.score))
            return false;
        if (this.grade == null) {
            if (other.grade != null)
                return false;
        }
        else if (!this.grade.equals(other.grade))
            return false;
        if (this.passed == null) {
            if (other.passed != null)
                return false;
        }
        else if (!this.passed.equals(other.passed))
            return false;
        if (this.qTotal == null) {
            if (other.qTotal != null)
                return false;
        }
        else if (!this.qTotal.equals(other.qTotal))
            return false;
        if (this.qReply == null) {
            if (other.qReply != null)
                return false;
        }
        else if (!this.qReply.equals(other.qReply))
            return false;
        if (this.qOk == null) {
            if (other.qOk != null)
                return false;
        }
        else if (!this.qOk.equals(other.qOk))
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
        result = prime * result + ((this.userId == null) ? 0 : this.userId.hashCode());
        result = prime * result + ((this.userName == null) ? 0 : this.userName.hashCode());
        result = prime * result + ((this.userNo == null) ? 0 : this.userNo.hashCode());
        result = prime * result + ((this.identityIdc == null) ? 0 : this.identityIdc.hashCode());
        result = prime * result + ((this.identityId == null) ? 0 : this.identityId.hashCode());
        result = prime * result + ((this.examId == null) ? 0 : this.examId.hashCode());
        result = prime * result + ((this.paperId == null) ? 0 : this.paperId.hashCode());
        result = prime * result + ((this.modelId == null) ? 0 : this.modelId.hashCode());
        result = prime * result + ((this.modelKey == null) ? 0 : this.modelKey.hashCode());
        result = prime * result + ((this.score == null) ? 0 : this.score.hashCode());
        result = prime * result + ((this.grade == null) ? 0 : this.grade.hashCode());
        result = prime * result + ((this.passed == null) ? 0 : this.passed.hashCode());
        result = prime * result + ((this.qTotal == null) ? 0 : this.qTotal.hashCode());
        result = prime * result + ((this.qReply == null) ? 0 : this.qReply.hashCode());
        result = prime * result + ((this.qOk == null) ? 0 : this.qOk.hashCode());
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
        StringBuilder sb = new StringBuilder("DReply (");

        sb.append(key);
        sb.append(", ").append(code);
        sb.append(", ").append(userId);
        sb.append(", ").append(userName);
        sb.append(", ").append(userNo);
        sb.append(", ").append(identityIdc);
        sb.append(", ").append(identityId);
        sb.append(", ").append(examId);
        sb.append(", ").append(paperId);
        sb.append(", ").append(modelId);
        sb.append(", ").append(modelKey);
        sb.append(", ").append(score);
        sb.append(", ").append(grade);
        sb.append(", ").append(passed);
        sb.append(", ").append(qTotal);
        sb.append(", ").append(qReply);
        sb.append(", ").append(qOk);
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
    public void from(IDReply from) {
        setKey(from.getKey());
        setCode(from.getCode());
        setUserId(from.getUserId());
        setUserName(from.getUserName());
        setUserNo(from.getUserNo());
        setIdentityIdc(from.getIdentityIdc());
        setIdentityId(from.getIdentityId());
        setExamId(from.getExamId());
        setPaperId(from.getPaperId());
        setModelId(from.getModelId());
        setModelKey(from.getModelKey());
        setScore(from.getScore());
        setGrade(from.getGrade());
        setPassed(from.getPassed());
        setQTotal(from.getQTotal());
        setQReply(from.getQReply());
        setQOk(from.getQOk());
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
    public <E extends IDReply> E into(E into) {
        into.from(this);
        return into;
    }
}
