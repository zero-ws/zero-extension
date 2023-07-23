/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.doc.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IDReply extends VertxPojo, Serializable {

    /**
     * Setter for <code>ZDB.D_REPLY.KEY</code>. 「key」- 答题卡主键
     */
    public IDReply setKey(String value);

    /**
     * Getter for <code>ZDB.D_REPLY.KEY</code>. 「key」- 答题卡主键
     */
    public String getKey();

    /**
     * Setter for <code>ZDB.D_REPLY.CODE</code>. 「code」- 答题卡编号
     */
    public IDReply setCode(String value);

    /**
     * Getter for <code>ZDB.D_REPLY.CODE</code>. 「code」- 答题卡编号
     */
    public String getCode();

    /**
     * Setter for <code>ZDB.D_REPLY.USER_ID</code>. 「userId」- 考生ID
     */
    public IDReply setUserId(String value);

    /**
     * Getter for <code>ZDB.D_REPLY.USER_ID</code>. 「userId」- 考生ID
     */
    public String getUserId();

    /**
     * Setter for <code>ZDB.D_REPLY.USER_NAME</code>. 「userName」- 考生姓名
     */
    public IDReply setUserName(String value);

    /**
     * Getter for <code>ZDB.D_REPLY.USER_NAME</code>. 「userName」- 考生姓名
     */
    public String getUserName();

    /**
     * Setter for <code>ZDB.D_REPLY.USER_NO</code>. 「userNo」- 准考证号
     */
    public IDReply setUserNo(String value);

    /**
     * Getter for <code>ZDB.D_REPLY.USER_NO</code>. 「userNo」- 准考证号
     */
    public String getUserNo();

    /**
     * Setter for <code>ZDB.D_REPLY.IDENTITY_IDC</code>. 「identityIdc」- 证件号
     */
    public IDReply setIdentityIdc(String value);

    /**
     * Getter for <code>ZDB.D_REPLY.IDENTITY_IDC</code>. 「identityIdc」- 证件号
     */
    public String getIdentityIdc();

    /**
     * Setter for <code>ZDB.D_REPLY.IDENTITY_ID</code>. 「identityId」-
     * 关联档案时考生档案ID
     */
    public IDReply setIdentityId(String value);

    /**
     * Getter for <code>ZDB.D_REPLY.IDENTITY_ID</code>. 「identityId」-
     * 关联档案时考生档案ID
     */
    public String getIdentityId();

    /**
     * Setter for <code>ZDB.D_REPLY.EXAM_ID</code>. 「examId」- 哪场考试答题卡
     */
    public IDReply setExamId(String value);

    /**
     * Getter for <code>ZDB.D_REPLY.EXAM_ID</code>. 「examId」- 哪场考试答题卡
     */
    public String getExamId();

    /**
     * Setter for <code>ZDB.D_REPLY.PAPER_ID</code>. 「paperId」- 哪张试卷答题卡
     */
    public IDReply setPaperId(String value);

    /**
     * Getter for <code>ZDB.D_REPLY.PAPER_ID</code>. 「paperId」- 哪张试卷答题卡
     */
    public String getPaperId();

    /**
     * Setter for <code>ZDB.D_REPLY.MODEL_ID</code>. 「modelId」-
     * 关联的模型identifier，用于描述
     */
    public IDReply setModelId(String value);

    /**
     * Getter for <code>ZDB.D_REPLY.MODEL_ID</code>. 「modelId」-
     * 关联的模型identifier，用于描述
     */
    public String getModelId();

    /**
     * Setter for <code>ZDB.D_REPLY.MODEL_KEY</code>. 「modelKey」-
     * 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    public IDReply setModelKey(String value);

    /**
     * Getter for <code>ZDB.D_REPLY.MODEL_KEY</code>. 「modelKey」-
     * 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    public String getModelKey();

    /**
     * Setter for <code>ZDB.D_REPLY.SCORE</code>. 「score」- 得分
     */
    public IDReply setScore(BigDecimal value);

    /**
     * Getter for <code>ZDB.D_REPLY.SCORE</code>. 「score」- 得分
     */
    public BigDecimal getScore();

    /**
     * Setter for <code>ZDB.D_REPLY.GRADE</code>. 「grade」- 最终评级 S/A/B/C/D/E
     */
    public IDReply setGrade(String value);

    /**
     * Getter for <code>ZDB.D_REPLY.GRADE</code>. 「grade」- 最终评级 S/A/B/C/D/E
     */
    public String getGrade();

    /**
     * Setter for <code>ZDB.D_REPLY.PASSED</code>. 「passed」- 是否及格，及格 passed =
     * true，否则 passed = false
     */
    public IDReply setPassed(Boolean value);

    /**
     * Getter for <code>ZDB.D_REPLY.PASSED</code>. 「passed」- 是否及格，及格 passed =
     * true，否则 passed = false
     */
    public Boolean getPassed();

    /**
     * Setter for <code>ZDB.D_REPLY.Q_TOTAL</code>. 「qTotal」- 试题总量
     */
    public IDReply setQTotal(Integer value);

    /**
     * Getter for <code>ZDB.D_REPLY.Q_TOTAL</code>. 「qTotal」- 试题总量
     */
    public Integer getQTotal();

    /**
     * Setter for <code>ZDB.D_REPLY.Q_REPLY</code>. 「qReply」- 已答试题数量
     */
    public IDReply setQReply(Integer value);

    /**
     * Getter for <code>ZDB.D_REPLY.Q_REPLY</code>. 「qReply」- 已答试题数量
     */
    public Integer getQReply();

    /**
     * Setter for <code>ZDB.D_REPLY.Q_OK</code>. 「qOk」- 正确试题数量
     */
    public IDReply setQOk(Integer value);

    /**
     * Getter for <code>ZDB.D_REPLY.Q_OK</code>. 「qOk」- 正确试题数量
     */
    public Integer getQOk();

    /**
     * Setter for <code>ZDB.D_REPLY.SIGMA</code>. 「sigma」- 统一标识
     */
    public IDReply setSigma(String value);

    /**
     * Getter for <code>ZDB.D_REPLY.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>ZDB.D_REPLY.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IDReply setLanguage(String value);

    /**
     * Getter for <code>ZDB.D_REPLY.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>ZDB.D_REPLY.ACTIVE</code>. 「active」- 是否启用
     */
    public IDReply setActive(Boolean value);

    /**
     * Getter for <code>ZDB.D_REPLY.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>ZDB.D_REPLY.METADATA</code>. 「metadata」- 附加配置数据
     */
    public IDReply setMetadata(String value);

    /**
     * Getter for <code>ZDB.D_REPLY.METADATA</code>. 「metadata」- 附加配置数据
     */
    public String getMetadata();

    /**
     * Setter for <code>ZDB.D_REPLY.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IDReply setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.D_REPLY.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>ZDB.D_REPLY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IDReply setCreatedBy(String value);

    /**
     * Getter for <code>ZDB.D_REPLY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>ZDB.D_REPLY.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IDReply setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.D_REPLY.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>ZDB.D_REPLY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IDReply setUpdatedBy(String value);

    /**
     * Getter for <code>ZDB.D_REPLY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IDReply
     */
    public void from(IDReply from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IDReply
     */
    public <E extends IDReply> E into(E into);

        @Override
        public default IDReply fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setCode,json::getString,"CODE","java.lang.String");
                setOrThrow(this::setUserId,json::getString,"USER_ID","java.lang.String");
                setOrThrow(this::setUserName,json::getString,"USER_NAME","java.lang.String");
                setOrThrow(this::setUserNo,json::getString,"USER_NO","java.lang.String");
                setOrThrow(this::setIdentityIdc,json::getString,"IDENTITY_IDC","java.lang.String");
                setOrThrow(this::setIdentityId,json::getString,"IDENTITY_ID","java.lang.String");
                setOrThrow(this::setExamId,json::getString,"EXAM_ID","java.lang.String");
                setOrThrow(this::setPaperId,json::getString,"PAPER_ID","java.lang.String");
                setOrThrow(this::setModelId,json::getString,"MODEL_ID","java.lang.String");
                setOrThrow(this::setModelKey,json::getString,"MODEL_KEY","java.lang.String");
                setOrThrow(this::setScore,key -> {String s = json.getString(key); return s==null?null:new java.math.BigDecimal(s);},"SCORE","java.math.BigDecimal");
                setOrThrow(this::setGrade,json::getString,"GRADE","java.lang.String");
                setOrThrow(this::setPassed,json::getBoolean,"PASSED","java.lang.Boolean");
                setOrThrow(this::setQTotal,json::getInteger,"Q_TOTAL","java.lang.Integer");
                setOrThrow(this::setQReply,json::getInteger,"Q_REPLY","java.lang.Integer");
                setOrThrow(this::setQOk,json::getInteger,"Q_OK","java.lang.Integer");
                setOrThrow(this::setSigma,json::getString,"SIGMA","java.lang.String");
                setOrThrow(this::setLanguage,json::getString,"LANGUAGE","java.lang.String");
                setOrThrow(this::setActive,json::getBoolean,"ACTIVE","java.lang.Boolean");
                setOrThrow(this::setMetadata,json::getString,"METADATA","java.lang.String");
                setOrThrow(this::setCreatedAt,key -> {String s = json.getString(key); return s==null?null:java.time.LocalDateTime.parse(s);},"CREATED_AT","java.time.LocalDateTime");
                setOrThrow(this::setCreatedBy,json::getString,"CREATED_BY","java.lang.String");
                setOrThrow(this::setUpdatedAt,key -> {String s = json.getString(key); return s==null?null:java.time.LocalDateTime.parse(s);},"UPDATED_AT","java.time.LocalDateTime");
                setOrThrow(this::setUpdatedBy,json::getString,"UPDATED_BY","java.lang.String");
                return this;
        }


        @Override
        public default io.vertx.core.json.JsonObject toJson() {
                io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
                json.put("KEY",getKey());
                json.put("CODE",getCode());
                json.put("USER_ID",getUserId());
                json.put("USER_NAME",getUserName());
                json.put("USER_NO",getUserNo());
                json.put("IDENTITY_IDC",getIdentityIdc());
                json.put("IDENTITY_ID",getIdentityId());
                json.put("EXAM_ID",getExamId());
                json.put("PAPER_ID",getPaperId());
                json.put("MODEL_ID",getModelId());
                json.put("MODEL_KEY",getModelKey());
                json.put("SCORE",getScore()==null?null:getScore().toString());
                json.put("GRADE",getGrade());
                json.put("PASSED",getPassed());
                json.put("Q_TOTAL",getQTotal());
                json.put("Q_REPLY",getQReply());
                json.put("Q_OK",getQOk());
                json.put("SIGMA",getSigma());
                json.put("LANGUAGE",getLanguage());
                json.put("ACTIVE",getActive());
                json.put("METADATA",getMetadata());
                json.put("CREATED_AT",getCreatedAt()==null?null:getCreatedAt().toString());
                json.put("CREATED_BY",getCreatedBy());
                json.put("UPDATED_AT",getUpdatedAt()==null?null:getUpdatedAt().toString());
                json.put("UPDATED_BY",getUpdatedBy());
                return json;
        }

}