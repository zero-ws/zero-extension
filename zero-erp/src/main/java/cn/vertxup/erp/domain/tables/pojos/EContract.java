/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.pojos;


import cn.vertxup.erp.domain.tables.interfaces.IEContract;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.math.BigDecimal;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EContract implements VertxPojo, IEContract {

    private static final long serialVersionUID = 1L;

    private String key;
    private String name;
    private String code;
    private String deptId;
    private String type;
    private String status;
    private String budget;
    private String level;
    private String title;
    private String subject;
    private String description;
    private BigDecimal amount;
    private String remark;
    private LocalDateTime planStartAt;
    private LocalDateTime planEndAt;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private String signedBy;
    private LocalDateTime signedAt;
    private String partyA;
    private String partyB;
    private String aName;
    private String aPhone;
    private String aLegal;
    private String aAddress;
    private String bName;
    private String bPhone;
    private String bLegal;
    private String bAddress;
    private String metadata;
    private Boolean active;
    private String sigma;
    private String language;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public EContract() {}

    public EContract(IEContract value) {
        this.key = value.getKey();
        this.name = value.getName();
        this.code = value.getCode();
        this.deptId = value.getDeptId();
        this.type = value.getType();
        this.status = value.getStatus();
        this.budget = value.getBudget();
        this.level = value.getLevel();
        this.title = value.getTitle();
        this.subject = value.getSubject();
        this.description = value.getDescription();
        this.amount = value.getAmount();
        this.remark = value.getRemark();
        this.planStartAt = value.getPlanStartAt();
        this.planEndAt = value.getPlanEndAt();
        this.startAt = value.getStartAt();
        this.endAt = value.getEndAt();
        this.signedBy = value.getSignedBy();
        this.signedAt = value.getSignedAt();
        this.partyA = value.getPartyA();
        this.partyB = value.getPartyB();
        this.aName = value.getAName();
        this.aPhone = value.getAPhone();
        this.aLegal = value.getALegal();
        this.aAddress = value.getAAddress();
        this.bName = value.getBName();
        this.bPhone = value.getBPhone();
        this.bLegal = value.getBLegal();
        this.bAddress = value.getBAddress();
        this.metadata = value.getMetadata();
        this.active = value.getActive();
        this.sigma = value.getSigma();
        this.language = value.getLanguage();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public EContract(
        String key,
        String name,
        String code,
        String deptId,
        String type,
        String status,
        String budget,
        String level,
        String title,
        String subject,
        String description,
        BigDecimal amount,
        String remark,
        LocalDateTime planStartAt,
        LocalDateTime planEndAt,
        LocalDateTime startAt,
        LocalDateTime endAt,
        String signedBy,
        LocalDateTime signedAt,
        String partyA,
        String partyB,
        String aName,
        String aPhone,
        String aLegal,
        String aAddress,
        String bName,
        String bPhone,
        String bLegal,
        String bAddress,
        String metadata,
        Boolean active,
        String sigma,
        String language,
        LocalDateTime createdAt,
        String createdBy,
        LocalDateTime updatedAt,
        String updatedBy
    ) {
        this.key = key;
        this.name = name;
        this.code = code;
        this.deptId = deptId;
        this.type = type;
        this.status = status;
        this.budget = budget;
        this.level = level;
        this.title = title;
        this.subject = subject;
        this.description = description;
        this.amount = amount;
        this.remark = remark;
        this.planStartAt = planStartAt;
        this.planEndAt = planEndAt;
        this.startAt = startAt;
        this.endAt = endAt;
        this.signedBy = signedBy;
        this.signedAt = signedAt;
        this.partyA = partyA;
        this.partyB = partyB;
        this.aName = aName;
        this.aPhone = aPhone;
        this.aLegal = aLegal;
        this.aAddress = aAddress;
        this.bName = bName;
        this.bPhone = bPhone;
        this.bLegal = bLegal;
        this.bAddress = bAddress;
        this.metadata = metadata;
        this.active = active;
        this.sigma = sigma;
        this.language = language;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public EContract(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>ZDB.E_CONTRACT.KEY</code>. 「key」- 合同主键
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>ZDB.E_CONTRACT.KEY</code>. 「key」- 合同主键
     */
    @Override
    public EContract setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CONTRACT.NAME</code>. 「name」- 合同名称
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>ZDB.E_CONTRACT.NAME</code>. 「name」- 合同名称
     */
    @Override
    public EContract setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CONTRACT.CODE</code>. 「code」- 合同编号
     */
    @Override
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>ZDB.E_CONTRACT.CODE</code>. 「code」- 合同编号
     */
    @Override
    public EContract setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CONTRACT.DEPT_ID</code>. 「deptId」- 所属部门,
     * resource.departments
     */
    @Override
    public String getDeptId() {
        return this.deptId;
    }

    /**
     * Setter for <code>ZDB.E_CONTRACT.DEPT_ID</code>. 「deptId」- 所属部门,
     * resource.departments
     */
    @Override
    public EContract setDeptId(String deptId) {
        this.deptId = deptId;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CONTRACT.TYPE</code>. 「type」- 合同分类，zero.contract
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>ZDB.E_CONTRACT.TYPE</code>. 「type」- 合同分类，zero.contract
     */
    @Override
    public EContract setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CONTRACT.STATUS</code>. 「status」-
     * 合同状态，zero.contract.status
     */
    @Override
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>ZDB.E_CONTRACT.STATUS</code>. 「status」-
     * 合同状态，zero.contract.status
     */
    @Override
    public EContract setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CONTRACT.BUDGET</code>. 「budget」-
     * 所属预算，zero.contract.budget
     */
    @Override
    public String getBudget() {
        return this.budget;
    }

    /**
     * Setter for <code>ZDB.E_CONTRACT.BUDGET</code>. 「budget」-
     * 所属预算，zero.contract.budget
     */
    @Override
    public EContract setBudget(String budget) {
        this.budget = budget;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CONTRACT.LEVEL</code>. 「level」-
     * 合同级别，zero.contract.level
     */
    @Override
    public String getLevel() {
        return this.level;
    }

    /**
     * Setter for <code>ZDB.E_CONTRACT.LEVEL</code>. 「level」-
     * 合同级别，zero.contract.level
     */
    @Override
    public EContract setLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CONTRACT.TITLE</code>. 「title」- 合同标题
     */
    @Override
    public String getTitle() {
        return this.title;
    }

    /**
     * Setter for <code>ZDB.E_CONTRACT.TITLE</code>. 「title」- 合同标题
     */
    @Override
    public EContract setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CONTRACT.SUBJECT</code>. 「subject」- 合同目标
     */
    @Override
    public String getSubject() {
        return this.subject;
    }

    /**
     * Setter for <code>ZDB.E_CONTRACT.SUBJECT</code>. 「subject」- 合同目标
     */
    @Override
    public EContract setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CONTRACT.DESCRIPTION</code>. 「description」- 合同描述
     */
    @Override
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for <code>ZDB.E_CONTRACT.DESCRIPTION</code>. 「description」- 合同描述
     */
    @Override
    public EContract setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CONTRACT.AMOUNT</code>. 「amount」- 合同金额
     */
    @Override
    public BigDecimal getAmount() {
        return this.amount;
    }

    /**
     * Setter for <code>ZDB.E_CONTRACT.AMOUNT</code>. 「amount」- 合同金额
     */
    @Override
    public EContract setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CONTRACT.REMARK</code>. 「remark」- 合同备注
     */
    @Override
    public String getRemark() {
        return this.remark;
    }

    /**
     * Setter for <code>ZDB.E_CONTRACT.REMARK</code>. 「remark」- 合同备注
     */
    @Override
    public EContract setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CONTRACT.PLAN_START_AT</code>. 「planStartAt」- 开始日期
     */
    @Override
    public LocalDateTime getPlanStartAt() {
        return this.planStartAt;
    }

    /**
     * Setter for <code>ZDB.E_CONTRACT.PLAN_START_AT</code>. 「planStartAt」- 开始日期
     */
    @Override
    public EContract setPlanStartAt(LocalDateTime planStartAt) {
        this.planStartAt = planStartAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CONTRACT.PLAN_END_AT</code>. 「planEndAt」- 结束日期
     */
    @Override
    public LocalDateTime getPlanEndAt() {
        return this.planEndAt;
    }

    /**
     * Setter for <code>ZDB.E_CONTRACT.PLAN_END_AT</code>. 「planEndAt」- 结束日期
     */
    @Override
    public EContract setPlanEndAt(LocalDateTime planEndAt) {
        this.planEndAt = planEndAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CONTRACT.START_AT</code>. 「startAt」- 实际开始日期
     */
    @Override
    public LocalDateTime getStartAt() {
        return this.startAt;
    }

    /**
     * Setter for <code>ZDB.E_CONTRACT.START_AT</code>. 「startAt」- 实际开始日期
     */
    @Override
    public EContract setStartAt(LocalDateTime startAt) {
        this.startAt = startAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CONTRACT.END_AT</code>. 「endAt」- 实际结束日期
     */
    @Override
    public LocalDateTime getEndAt() {
        return this.endAt;
    }

    /**
     * Setter for <code>ZDB.E_CONTRACT.END_AT</code>. 「endAt」- 实际结束日期
     */
    @Override
    public EContract setEndAt(LocalDateTime endAt) {
        this.endAt = endAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CONTRACT.SIGNED_BY</code>. 「signedBy」- 签订人
     */
    @Override
    public String getSignedBy() {
        return this.signedBy;
    }

    /**
     * Setter for <code>ZDB.E_CONTRACT.SIGNED_BY</code>. 「signedBy」- 签订人
     */
    @Override
    public EContract setSignedBy(String signedBy) {
        this.signedBy = signedBy;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CONTRACT.SIGNED_AT</code>. 「signedAt」- 签订时间
     */
    @Override
    public LocalDateTime getSignedAt() {
        return this.signedAt;
    }

    /**
     * Setter for <code>ZDB.E_CONTRACT.SIGNED_AT</code>. 「signedAt」- 签订时间
     */
    @Override
    public EContract setSignedAt(LocalDateTime signedAt) {
        this.signedAt = signedAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CONTRACT.PARTY_A</code>. 「partyA」-
     * 甲方（关联公司ID，E_COMPANY）
     */
    @Override
    public String getPartyA() {
        return this.partyA;
    }

    /**
     * Setter for <code>ZDB.E_CONTRACT.PARTY_A</code>. 「partyA」-
     * 甲方（关联公司ID，E_COMPANY）
     */
    @Override
    public EContract setPartyA(String partyA) {
        this.partyA = partyA;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CONTRACT.PARTY_B</code>. 「partyB」-
     * 乙方（关联客户ID，E_CUSTOMER）
     */
    @Override
    public String getPartyB() {
        return this.partyB;
    }

    /**
     * Setter for <code>ZDB.E_CONTRACT.PARTY_B</code>. 「partyB」-
     * 乙方（关联客户ID，E_CUSTOMER）
     */
    @Override
    public EContract setPartyB(String partyB) {
        this.partyB = partyB;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CONTRACT.A_NAME</code>. 「aName」-
     * 甲方名称（个人为姓名/企业为企业名）
     */
    @Override
    public String getAName() {
        return this.aName;
    }

    /**
     * Setter for <code>ZDB.E_CONTRACT.A_NAME</code>. 「aName」-
     * 甲方名称（个人为姓名/企业为企业名）
     */
    @Override
    public EContract setAName(String aName) {
        this.aName = aName;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CONTRACT.A_PHONE</code>. 「aPhone」- 甲方电话
     */
    @Override
    public String getAPhone() {
        return this.aPhone;
    }

    /**
     * Setter for <code>ZDB.E_CONTRACT.A_PHONE</code>. 「aPhone」- 甲方电话
     */
    @Override
    public EContract setAPhone(String aPhone) {
        this.aPhone = aPhone;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CONTRACT.A_LEGAL</code>. 「aLegal」- 甲方法人（企业合同专用）
     */
    @Override
    public String getALegal() {
        return this.aLegal;
    }

    /**
     * Setter for <code>ZDB.E_CONTRACT.A_LEGAL</code>. 「aLegal」- 甲方法人（企业合同专用）
     */
    @Override
    public EContract setALegal(String aLegal) {
        this.aLegal = aLegal;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CONTRACT.A_ADDRESS</code>. 「aAddress」- 甲方地址
     */
    @Override
    public String getAAddress() {
        return this.aAddress;
    }

    /**
     * Setter for <code>ZDB.E_CONTRACT.A_ADDRESS</code>. 「aAddress」- 甲方地址
     */
    @Override
    public EContract setAAddress(String aAddress) {
        this.aAddress = aAddress;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CONTRACT.B_NAME</code>. 「bName」-
     * 乙方名称（个人为姓名/企业为企业名）
     */
    @Override
    public String getBName() {
        return this.bName;
    }

    /**
     * Setter for <code>ZDB.E_CONTRACT.B_NAME</code>. 「bName」-
     * 乙方名称（个人为姓名/企业为企业名）
     */
    @Override
    public EContract setBName(String bName) {
        this.bName = bName;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CONTRACT.B_PHONE</code>. 「bPhone」- 乙方人电话
     */
    @Override
    public String getBPhone() {
        return this.bPhone;
    }

    /**
     * Setter for <code>ZDB.E_CONTRACT.B_PHONE</code>. 「bPhone」- 乙方人电话
     */
    @Override
    public EContract setBPhone(String bPhone) {
        this.bPhone = bPhone;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CONTRACT.B_LEGAL</code>. 「bLegal」- 乙方法人（企业合同专用）
     */
    @Override
    public String getBLegal() {
        return this.bLegal;
    }

    /**
     * Setter for <code>ZDB.E_CONTRACT.B_LEGAL</code>. 「bLegal」- 乙方法人（企业合同专用）
     */
    @Override
    public EContract setBLegal(String bLegal) {
        this.bLegal = bLegal;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CONTRACT.B_ADDRESS</code>. 「bAddress」- 乙方地址
     */
    @Override
    public String getBAddress() {
        return this.bAddress;
    }

    /**
     * Setter for <code>ZDB.E_CONTRACT.B_ADDRESS</code>. 「bAddress」- 乙方地址
     */
    @Override
    public EContract setBAddress(String bAddress) {
        this.bAddress = bAddress;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CONTRACT.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>ZDB.E_CONTRACT.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public EContract setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CONTRACT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>ZDB.E_CONTRACT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public EContract setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CONTRACT.SIGMA</code>. 「sigma」- 统一标识（公司所属应用）
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>ZDB.E_CONTRACT.SIGMA</code>. 「sigma」- 统一标识（公司所属应用）
     */
    @Override
    public EContract setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CONTRACT.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>ZDB.E_CONTRACT.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public EContract setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CONTRACT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>ZDB.E_CONTRACT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public EContract setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CONTRACT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>ZDB.E_CONTRACT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public EContract setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CONTRACT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>ZDB.E_CONTRACT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public EContract setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CONTRACT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>ZDB.E_CONTRACT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public EContract setUpdatedBy(String updatedBy) {
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
        final EContract other = (EContract) obj;
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
        if (this.deptId == null) {
            if (other.deptId != null)
                return false;
        }
        else if (!this.deptId.equals(other.deptId))
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
        if (this.budget == null) {
            if (other.budget != null)
                return false;
        }
        else if (!this.budget.equals(other.budget))
            return false;
        if (this.level == null) {
            if (other.level != null)
                return false;
        }
        else if (!this.level.equals(other.level))
            return false;
        if (this.title == null) {
            if (other.title != null)
                return false;
        }
        else if (!this.title.equals(other.title))
            return false;
        if (this.subject == null) {
            if (other.subject != null)
                return false;
        }
        else if (!this.subject.equals(other.subject))
            return false;
        if (this.description == null) {
            if (other.description != null)
                return false;
        }
        else if (!this.description.equals(other.description))
            return false;
        if (this.amount == null) {
            if (other.amount != null)
                return false;
        }
        else if (!this.amount.equals(other.amount))
            return false;
        if (this.remark == null) {
            if (other.remark != null)
                return false;
        }
        else if (!this.remark.equals(other.remark))
            return false;
        if (this.planStartAt == null) {
            if (other.planStartAt != null)
                return false;
        }
        else if (!this.planStartAt.equals(other.planStartAt))
            return false;
        if (this.planEndAt == null) {
            if (other.planEndAt != null)
                return false;
        }
        else if (!this.planEndAt.equals(other.planEndAt))
            return false;
        if (this.startAt == null) {
            if (other.startAt != null)
                return false;
        }
        else if (!this.startAt.equals(other.startAt))
            return false;
        if (this.endAt == null) {
            if (other.endAt != null)
                return false;
        }
        else if (!this.endAt.equals(other.endAt))
            return false;
        if (this.signedBy == null) {
            if (other.signedBy != null)
                return false;
        }
        else if (!this.signedBy.equals(other.signedBy))
            return false;
        if (this.signedAt == null) {
            if (other.signedAt != null)
                return false;
        }
        else if (!this.signedAt.equals(other.signedAt))
            return false;
        if (this.partyA == null) {
            if (other.partyA != null)
                return false;
        }
        else if (!this.partyA.equals(other.partyA))
            return false;
        if (this.partyB == null) {
            if (other.partyB != null)
                return false;
        }
        else if (!this.partyB.equals(other.partyB))
            return false;
        if (this.aName == null) {
            if (other.aName != null)
                return false;
        }
        else if (!this.aName.equals(other.aName))
            return false;
        if (this.aPhone == null) {
            if (other.aPhone != null)
                return false;
        }
        else if (!this.aPhone.equals(other.aPhone))
            return false;
        if (this.aLegal == null) {
            if (other.aLegal != null)
                return false;
        }
        else if (!this.aLegal.equals(other.aLegal))
            return false;
        if (this.aAddress == null) {
            if (other.aAddress != null)
                return false;
        }
        else if (!this.aAddress.equals(other.aAddress))
            return false;
        if (this.bName == null) {
            if (other.bName != null)
                return false;
        }
        else if (!this.bName.equals(other.bName))
            return false;
        if (this.bPhone == null) {
            if (other.bPhone != null)
                return false;
        }
        else if (!this.bPhone.equals(other.bPhone))
            return false;
        if (this.bLegal == null) {
            if (other.bLegal != null)
                return false;
        }
        else if (!this.bLegal.equals(other.bLegal))
            return false;
        if (this.bAddress == null) {
            if (other.bAddress != null)
                return false;
        }
        else if (!this.bAddress.equals(other.bAddress))
            return false;
        if (this.metadata == null) {
            if (other.metadata != null)
                return false;
        }
        else if (!this.metadata.equals(other.metadata))
            return false;
        if (this.active == null) {
            if (other.active != null)
                return false;
        }
        else if (!this.active.equals(other.active))
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
        result = prime * result + ((this.deptId == null) ? 0 : this.deptId.hashCode());
        result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.budget == null) ? 0 : this.budget.hashCode());
        result = prime * result + ((this.level == null) ? 0 : this.level.hashCode());
        result = prime * result + ((this.title == null) ? 0 : this.title.hashCode());
        result = prime * result + ((this.subject == null) ? 0 : this.subject.hashCode());
        result = prime * result + ((this.description == null) ? 0 : this.description.hashCode());
        result = prime * result + ((this.amount == null) ? 0 : this.amount.hashCode());
        result = prime * result + ((this.remark == null) ? 0 : this.remark.hashCode());
        result = prime * result + ((this.planStartAt == null) ? 0 : this.planStartAt.hashCode());
        result = prime * result + ((this.planEndAt == null) ? 0 : this.planEndAt.hashCode());
        result = prime * result + ((this.startAt == null) ? 0 : this.startAt.hashCode());
        result = prime * result + ((this.endAt == null) ? 0 : this.endAt.hashCode());
        result = prime * result + ((this.signedBy == null) ? 0 : this.signedBy.hashCode());
        result = prime * result + ((this.signedAt == null) ? 0 : this.signedAt.hashCode());
        result = prime * result + ((this.partyA == null) ? 0 : this.partyA.hashCode());
        result = prime * result + ((this.partyB == null) ? 0 : this.partyB.hashCode());
        result = prime * result + ((this.aName == null) ? 0 : this.aName.hashCode());
        result = prime * result + ((this.aPhone == null) ? 0 : this.aPhone.hashCode());
        result = prime * result + ((this.aLegal == null) ? 0 : this.aLegal.hashCode());
        result = prime * result + ((this.aAddress == null) ? 0 : this.aAddress.hashCode());
        result = prime * result + ((this.bName == null) ? 0 : this.bName.hashCode());
        result = prime * result + ((this.bPhone == null) ? 0 : this.bPhone.hashCode());
        result = prime * result + ((this.bLegal == null) ? 0 : this.bLegal.hashCode());
        result = prime * result + ((this.bAddress == null) ? 0 : this.bAddress.hashCode());
        result = prime * result + ((this.metadata == null) ? 0 : this.metadata.hashCode());
        result = prime * result + ((this.active == null) ? 0 : this.active.hashCode());
        result = prime * result + ((this.sigma == null) ? 0 : this.sigma.hashCode());
        result = prime * result + ((this.language == null) ? 0 : this.language.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.updatedAt == null) ? 0 : this.updatedAt.hashCode());
        result = prime * result + ((this.updatedBy == null) ? 0 : this.updatedBy.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("EContract (");

        sb.append(key);
        sb.append(", ").append(name);
        sb.append(", ").append(code);
        sb.append(", ").append(deptId);
        sb.append(", ").append(type);
        sb.append(", ").append(status);
        sb.append(", ").append(budget);
        sb.append(", ").append(level);
        sb.append(", ").append(title);
        sb.append(", ").append(subject);
        sb.append(", ").append(description);
        sb.append(", ").append(amount);
        sb.append(", ").append(remark);
        sb.append(", ").append(planStartAt);
        sb.append(", ").append(planEndAt);
        sb.append(", ").append(startAt);
        sb.append(", ").append(endAt);
        sb.append(", ").append(signedBy);
        sb.append(", ").append(signedAt);
        sb.append(", ").append(partyA);
        sb.append(", ").append(partyB);
        sb.append(", ").append(aName);
        sb.append(", ").append(aPhone);
        sb.append(", ").append(aLegal);
        sb.append(", ").append(aAddress);
        sb.append(", ").append(bName);
        sb.append(", ").append(bPhone);
        sb.append(", ").append(bLegal);
        sb.append(", ").append(bAddress);
        sb.append(", ").append(metadata);
        sb.append(", ").append(active);
        sb.append(", ").append(sigma);
        sb.append(", ").append(language);
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
    public void from(IEContract from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setDeptId(from.getDeptId());
        setType(from.getType());
        setStatus(from.getStatus());
        setBudget(from.getBudget());
        setLevel(from.getLevel());
        setTitle(from.getTitle());
        setSubject(from.getSubject());
        setDescription(from.getDescription());
        setAmount(from.getAmount());
        setRemark(from.getRemark());
        setPlanStartAt(from.getPlanStartAt());
        setPlanEndAt(from.getPlanEndAt());
        setStartAt(from.getStartAt());
        setEndAt(from.getEndAt());
        setSignedBy(from.getSignedBy());
        setSignedAt(from.getSignedAt());
        setPartyA(from.getPartyA());
        setPartyB(from.getPartyB());
        setAName(from.getAName());
        setAPhone(from.getAPhone());
        setALegal(from.getALegal());
        setAAddress(from.getAAddress());
        setBName(from.getBName());
        setBPhone(from.getBPhone());
        setBLegal(from.getBLegal());
        setBAddress(from.getBAddress());
        setMetadata(from.getMetadata());
        setActive(from.getActive());
        setSigma(from.getSigma());
        setLanguage(from.getLanguage());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    @Override
    public <E extends IEContract> E into(E into) {
        into.from(this);
        return into;
    }
}
