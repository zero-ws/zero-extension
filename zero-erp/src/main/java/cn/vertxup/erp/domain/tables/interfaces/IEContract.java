/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IEContract extends VertxPojo, Serializable {

    /**
     * Setter for <code>ZDB.E_CONTRACT.KEY</code>. 「key」- 合同主键
     */
    public IEContract setKey(String value);

    /**
     * Getter for <code>ZDB.E_CONTRACT.KEY</code>. 「key」- 合同主键
     */
    public String getKey();

    /**
     * Setter for <code>ZDB.E_CONTRACT.NAME</code>. 「name」- 合同名称
     */
    public IEContract setName(String value);

    /**
     * Getter for <code>ZDB.E_CONTRACT.NAME</code>. 「name」- 合同名称
     */
    public String getName();

    /**
     * Setter for <code>ZDB.E_CONTRACT.CODE</code>. 「code」- 合同编号
     */
    public IEContract setCode(String value);

    /**
     * Getter for <code>ZDB.E_CONTRACT.CODE</code>. 「code」- 合同编号
     */
    public String getCode();

    /**
     * Setter for <code>ZDB.E_CONTRACT.DEPT_ID</code>. 「deptId」- 所属部门,
     * resource.departments
     */
    public IEContract setDeptId(String value);

    /**
     * Getter for <code>ZDB.E_CONTRACT.DEPT_ID</code>. 「deptId」- 所属部门,
     * resource.departments
     */
    public String getDeptId();

    /**
     * Setter for <code>ZDB.E_CONTRACT.TYPE</code>. 「type」- 合同分类，zero.contract
     */
    public IEContract setType(String value);

    /**
     * Getter for <code>ZDB.E_CONTRACT.TYPE</code>. 「type」- 合同分类，zero.contract
     */
    public String getType();

    /**
     * Setter for <code>ZDB.E_CONTRACT.STATUS</code>. 「status」-
     * 合同状态，zero.contract.status
     */
    public IEContract setStatus(String value);

    /**
     * Getter for <code>ZDB.E_CONTRACT.STATUS</code>. 「status」-
     * 合同状态，zero.contract.status
     */
    public String getStatus();

    /**
     * Setter for <code>ZDB.E_CONTRACT.BUDGET</code>. 「budget」-
     * 所属预算，zero.contract.budget
     */
    public IEContract setBudget(String value);

    /**
     * Getter for <code>ZDB.E_CONTRACT.BUDGET</code>. 「budget」-
     * 所属预算，zero.contract.budget
     */
    public String getBudget();

    /**
     * Setter for <code>ZDB.E_CONTRACT.LEVEL</code>. 「level」-
     * 合同级别，zero.contract.level
     */
    public IEContract setLevel(String value);

    /**
     * Getter for <code>ZDB.E_CONTRACT.LEVEL</code>. 「level」-
     * 合同级别，zero.contract.level
     */
    public String getLevel();

    /**
     * Setter for <code>ZDB.E_CONTRACT.TITLE</code>. 「title」- 合同标题
     */
    public IEContract setTitle(String value);

    /**
     * Getter for <code>ZDB.E_CONTRACT.TITLE</code>. 「title」- 合同标题
     */
    public String getTitle();

    /**
     * Setter for <code>ZDB.E_CONTRACT.SUBJECT</code>. 「subject」- 合同目标
     */
    public IEContract setSubject(String value);

    /**
     * Getter for <code>ZDB.E_CONTRACT.SUBJECT</code>. 「subject」- 合同目标
     */
    public String getSubject();

    /**
     * Setter for <code>ZDB.E_CONTRACT.DESCRIPTION</code>. 「description」- 合同描述
     */
    public IEContract setDescription(String value);

    /**
     * Getter for <code>ZDB.E_CONTRACT.DESCRIPTION</code>. 「description」- 合同描述
     */
    public String getDescription();

    /**
     * Setter for <code>ZDB.E_CONTRACT.AMOUNT</code>. 「amount」- 合同金额
     */
    public IEContract setAmount(BigDecimal value);

    /**
     * Getter for <code>ZDB.E_CONTRACT.AMOUNT</code>. 「amount」- 合同金额
     */
    public BigDecimal getAmount();

    /**
     * Setter for <code>ZDB.E_CONTRACT.REMARK</code>. 「remark」- 合同备注
     */
    public IEContract setRemark(String value);

    /**
     * Getter for <code>ZDB.E_CONTRACT.REMARK</code>. 「remark」- 合同备注
     */
    public String getRemark();

    /**
     * Setter for <code>ZDB.E_CONTRACT.PLAN_START_AT</code>. 「planStartAt」- 开始日期
     */
    public IEContract setPlanStartAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.E_CONTRACT.PLAN_START_AT</code>. 「planStartAt」- 开始日期
     */
    public LocalDateTime getPlanStartAt();

    /**
     * Setter for <code>ZDB.E_CONTRACT.PLAN_END_AT</code>. 「planEndAt」- 结束日期
     */
    public IEContract setPlanEndAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.E_CONTRACT.PLAN_END_AT</code>. 「planEndAt」- 结束日期
     */
    public LocalDateTime getPlanEndAt();

    /**
     * Setter for <code>ZDB.E_CONTRACT.START_AT</code>. 「startAt」- 实际开始日期
     */
    public IEContract setStartAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.E_CONTRACT.START_AT</code>. 「startAt」- 实际开始日期
     */
    public LocalDateTime getStartAt();

    /**
     * Setter for <code>ZDB.E_CONTRACT.END_AT</code>. 「endAt」- 实际结束日期
     */
    public IEContract setEndAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.E_CONTRACT.END_AT</code>. 「endAt」- 实际结束日期
     */
    public LocalDateTime getEndAt();

    /**
     * Setter for <code>ZDB.E_CONTRACT.SIGNED_BY</code>. 「signedBy」- 签订人
     */
    public IEContract setSignedBy(String value);

    /**
     * Getter for <code>ZDB.E_CONTRACT.SIGNED_BY</code>. 「signedBy」- 签订人
     */
    public String getSignedBy();

    /**
     * Setter for <code>ZDB.E_CONTRACT.SIGNED_AT</code>. 「signedAt」- 签订时间
     */
    public IEContract setSignedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.E_CONTRACT.SIGNED_AT</code>. 「signedAt」- 签订时间
     */
    public LocalDateTime getSignedAt();

    /**
     * Setter for <code>ZDB.E_CONTRACT.PARTY_A</code>. 「partyA」-
     * 甲方（关联公司ID，E_COMPANY）
     */
    public IEContract setPartyA(String value);

    /**
     * Getter for <code>ZDB.E_CONTRACT.PARTY_A</code>. 「partyA」-
     * 甲方（关联公司ID，E_COMPANY）
     */
    public String getPartyA();

    /**
     * Setter for <code>ZDB.E_CONTRACT.PARTY_B</code>. 「partyB」-
     * 乙方（关联客户ID，E_CUSTOMER）
     */
    public IEContract setPartyB(String value);

    /**
     * Getter for <code>ZDB.E_CONTRACT.PARTY_B</code>. 「partyB」-
     * 乙方（关联客户ID，E_CUSTOMER）
     */
    public String getPartyB();

    /**
     * Setter for <code>ZDB.E_CONTRACT.A_NAME</code>. 「aName」-
     * 甲方名称（个人为姓名/企业为企业名）
     */
    public IEContract setAName(String value);

    /**
     * Getter for <code>ZDB.E_CONTRACT.A_NAME</code>. 「aName」-
     * 甲方名称（个人为姓名/企业为企业名）
     */
    public String getAName();

    /**
     * Setter for <code>ZDB.E_CONTRACT.A_PHONE</code>. 「aPhone」- 甲方电话
     */
    public IEContract setAPhone(String value);

    /**
     * Getter for <code>ZDB.E_CONTRACT.A_PHONE</code>. 「aPhone」- 甲方电话
     */
    public String getAPhone();

    /**
     * Setter for <code>ZDB.E_CONTRACT.A_LEGAL</code>. 「aLegal」- 甲方法人（企业合同专用）
     */
    public IEContract setALegal(String value);

    /**
     * Getter for <code>ZDB.E_CONTRACT.A_LEGAL</code>. 「aLegal」- 甲方法人（企业合同专用）
     */
    public String getALegal();

    /**
     * Setter for <code>ZDB.E_CONTRACT.A_ADDRESS</code>. 「aAddress」- 甲方地址
     */
    public IEContract setAAddress(String value);

    /**
     * Getter for <code>ZDB.E_CONTRACT.A_ADDRESS</code>. 「aAddress」- 甲方地址
     */
    public String getAAddress();

    /**
     * Setter for <code>ZDB.E_CONTRACT.B_NAME</code>. 「bName」-
     * 乙方名称（个人为姓名/企业为企业名）
     */
    public IEContract setBName(String value);

    /**
     * Getter for <code>ZDB.E_CONTRACT.B_NAME</code>. 「bName」-
     * 乙方名称（个人为姓名/企业为企业名）
     */
    public String getBName();

    /**
     * Setter for <code>ZDB.E_CONTRACT.B_PHONE</code>. 「bPhone」- 乙方人电话
     */
    public IEContract setBPhone(String value);

    /**
     * Getter for <code>ZDB.E_CONTRACT.B_PHONE</code>. 「bPhone」- 乙方人电话
     */
    public String getBPhone();

    /**
     * Setter for <code>ZDB.E_CONTRACT.B_LEGAL</code>. 「bLegal」- 乙方法人（企业合同专用）
     */
    public IEContract setBLegal(String value);

    /**
     * Getter for <code>ZDB.E_CONTRACT.B_LEGAL</code>. 「bLegal」- 乙方法人（企业合同专用）
     */
    public String getBLegal();

    /**
     * Setter for <code>ZDB.E_CONTRACT.B_ADDRESS</code>. 「bAddress」- 乙方地址
     */
    public IEContract setBAddress(String value);

    /**
     * Getter for <code>ZDB.E_CONTRACT.B_ADDRESS</code>. 「bAddress」- 乙方地址
     */
    public String getBAddress();

    /**
     * Setter for <code>ZDB.E_CONTRACT.METADATA</code>. 「metadata」- 附加配置
     */
    public IEContract setMetadata(String value);

    /**
     * Getter for <code>ZDB.E_CONTRACT.METADATA</code>. 「metadata」- 附加配置
     */
    public String getMetadata();

    /**
     * Setter for <code>ZDB.E_CONTRACT.ACTIVE</code>. 「active」- 是否启用
     */
    public IEContract setActive(Boolean value);

    /**
     * Getter for <code>ZDB.E_CONTRACT.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>ZDB.E_CONTRACT.SIGMA</code>. 「sigma」- 统一标识（公司所属应用）
     */
    public IEContract setSigma(String value);

    /**
     * Getter for <code>ZDB.E_CONTRACT.SIGMA</code>. 「sigma」- 统一标识（公司所属应用）
     */
    public String getSigma();

    /**
     * Setter for <code>ZDB.E_CONTRACT.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IEContract setLanguage(String value);

    /**
     * Getter for <code>ZDB.E_CONTRACT.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>ZDB.E_CONTRACT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IEContract setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.E_CONTRACT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>ZDB.E_CONTRACT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IEContract setCreatedBy(String value);

    /**
     * Getter for <code>ZDB.E_CONTRACT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>ZDB.E_CONTRACT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IEContract setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.E_CONTRACT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>ZDB.E_CONTRACT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IEContract setUpdatedBy(String value);

    /**
     * Getter for <code>ZDB.E_CONTRACT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IEContract
     */
    public void from(IEContract from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IEContract
     */
    public <E extends IEContract> E into(E into);

        @Override
        public default IEContract fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setName,json::getString,"NAME","java.lang.String");
                setOrThrow(this::setCode,json::getString,"CODE","java.lang.String");
                setOrThrow(this::setDeptId,json::getString,"DEPT_ID","java.lang.String");
                setOrThrow(this::setType,json::getString,"TYPE","java.lang.String");
                setOrThrow(this::setStatus,json::getString,"STATUS","java.lang.String");
                setOrThrow(this::setBudget,json::getString,"BUDGET","java.lang.String");
                setOrThrow(this::setLevel,json::getString,"LEVEL","java.lang.String");
                setOrThrow(this::setTitle,json::getString,"TITLE","java.lang.String");
                setOrThrow(this::setSubject,json::getString,"SUBJECT","java.lang.String");
                setOrThrow(this::setDescription,json::getString,"DESCRIPTION","java.lang.String");
                setOrThrow(this::setAmount,key -> {String s = json.getString(key); return s==null?null:new java.math.BigDecimal(s);},"AMOUNT","java.math.BigDecimal");
                setOrThrow(this::setRemark,json::getString,"REMARK","java.lang.String");
                setOrThrow(this::setPlanStartAt,key -> {String s = json.getString(key); return s==null?null:java.time.LocalDateTime.parse(s);},"PLAN_START_AT","java.time.LocalDateTime");
                setOrThrow(this::setPlanEndAt,key -> {String s = json.getString(key); return s==null?null:java.time.LocalDateTime.parse(s);},"PLAN_END_AT","java.time.LocalDateTime");
                setOrThrow(this::setStartAt,key -> {String s = json.getString(key); return s==null?null:java.time.LocalDateTime.parse(s);},"START_AT","java.time.LocalDateTime");
                setOrThrow(this::setEndAt,key -> {String s = json.getString(key); return s==null?null:java.time.LocalDateTime.parse(s);},"END_AT","java.time.LocalDateTime");
                setOrThrow(this::setSignedBy,json::getString,"SIGNED_BY","java.lang.String");
                setOrThrow(this::setSignedAt,key -> {String s = json.getString(key); return s==null?null:java.time.LocalDateTime.parse(s);},"SIGNED_AT","java.time.LocalDateTime");
                setOrThrow(this::setPartyA,json::getString,"PARTY_A","java.lang.String");
                setOrThrow(this::setPartyB,json::getString,"PARTY_B","java.lang.String");
                setOrThrow(this::setAName,json::getString,"A_NAME","java.lang.String");
                setOrThrow(this::setAPhone,json::getString,"A_PHONE","java.lang.String");
                setOrThrow(this::setALegal,json::getString,"A_LEGAL","java.lang.String");
                setOrThrow(this::setAAddress,json::getString,"A_ADDRESS","java.lang.String");
                setOrThrow(this::setBName,json::getString,"B_NAME","java.lang.String");
                setOrThrow(this::setBPhone,json::getString,"B_PHONE","java.lang.String");
                setOrThrow(this::setBLegal,json::getString,"B_LEGAL","java.lang.String");
                setOrThrow(this::setBAddress,json::getString,"B_ADDRESS","java.lang.String");
                setOrThrow(this::setMetadata,json::getString,"METADATA","java.lang.String");
                setOrThrow(this::setActive,json::getBoolean,"ACTIVE","java.lang.Boolean");
                setOrThrow(this::setSigma,json::getString,"SIGMA","java.lang.String");
                setOrThrow(this::setLanguage,json::getString,"LANGUAGE","java.lang.String");
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
                json.put("NAME",getName());
                json.put("CODE",getCode());
                json.put("DEPT_ID",getDeptId());
                json.put("TYPE",getType());
                json.put("STATUS",getStatus());
                json.put("BUDGET",getBudget());
                json.put("LEVEL",getLevel());
                json.put("TITLE",getTitle());
                json.put("SUBJECT",getSubject());
                json.put("DESCRIPTION",getDescription());
                json.put("AMOUNT",getAmount()==null?null:getAmount().toString());
                json.put("REMARK",getRemark());
                json.put("PLAN_START_AT",getPlanStartAt()==null?null:getPlanStartAt().toString());
                json.put("PLAN_END_AT",getPlanEndAt()==null?null:getPlanEndAt().toString());
                json.put("START_AT",getStartAt()==null?null:getStartAt().toString());
                json.put("END_AT",getEndAt()==null?null:getEndAt().toString());
                json.put("SIGNED_BY",getSignedBy());
                json.put("SIGNED_AT",getSignedAt()==null?null:getSignedAt().toString());
                json.put("PARTY_A",getPartyA());
                json.put("PARTY_B",getPartyB());
                json.put("A_NAME",getAName());
                json.put("A_PHONE",getAPhone());
                json.put("A_LEGAL",getALegal());
                json.put("A_ADDRESS",getAAddress());
                json.put("B_NAME",getBName());
                json.put("B_PHONE",getBPhone());
                json.put("B_LEGAL",getBLegal());
                json.put("B_ADDRESS",getBAddress());
                json.put("METADATA",getMetadata());
                json.put("ACTIVE",getActive());
                json.put("SIGMA",getSigma());
                json.put("LANGUAGE",getLanguage());
                json.put("CREATED_AT",getCreatedAt()==null?null:getCreatedAt().toString());
                json.put("CREATED_BY",getCreatedBy());
                json.put("UPDATED_AT",getUpdatedAt()==null?null:getUpdatedAt().toString());
                json.put("UPDATED_BY",getUpdatedBy());
                return json;
        }

}
