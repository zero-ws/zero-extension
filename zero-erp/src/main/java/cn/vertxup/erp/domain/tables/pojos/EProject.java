/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.pojos;


import cn.vertxup.erp.domain.tables.interfaces.IEProject;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.math.BigDecimal;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EProject implements VertxPojo, IEProject {

    private static final long serialVersionUID = 1L;

    private String key;
    private String name;
    private String code;
    private String shortName;
    private String deptId;
    private String type;
    private String status;
    private String budget;
    private String level;
    private String priority;
    private String risk;
    private String title;
    private String icon;
    private BigDecimal amount;
    private String subject;
    private String description;
    private String remark;
    private String leadBy;
    private LocalDateTime planStartAt;
    private LocalDateTime planEndAt;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private String metadata;
    private Boolean active;
    private String sigma;
    private String language;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public EProject() {}

    public EProject(IEProject value) {
        this.key = value.getKey();
        this.name = value.getName();
        this.code = value.getCode();
        this.shortName = value.getShortName();
        this.deptId = value.getDeptId();
        this.type = value.getType();
        this.status = value.getStatus();
        this.budget = value.getBudget();
        this.level = value.getLevel();
        this.priority = value.getPriority();
        this.risk = value.getRisk();
        this.title = value.getTitle();
        this.icon = value.getIcon();
        this.amount = value.getAmount();
        this.subject = value.getSubject();
        this.description = value.getDescription();
        this.remark = value.getRemark();
        this.leadBy = value.getLeadBy();
        this.planStartAt = value.getPlanStartAt();
        this.planEndAt = value.getPlanEndAt();
        this.startAt = value.getStartAt();
        this.endAt = value.getEndAt();
        this.metadata = value.getMetadata();
        this.active = value.getActive();
        this.sigma = value.getSigma();
        this.language = value.getLanguage();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public EProject(
        String key,
        String name,
        String code,
        String shortName,
        String deptId,
        String type,
        String status,
        String budget,
        String level,
        String priority,
        String risk,
        String title,
        String icon,
        BigDecimal amount,
        String subject,
        String description,
        String remark,
        String leadBy,
        LocalDateTime planStartAt,
        LocalDateTime planEndAt,
        LocalDateTime startAt,
        LocalDateTime endAt,
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
        this.shortName = shortName;
        this.deptId = deptId;
        this.type = type;
        this.status = status;
        this.budget = budget;
        this.level = level;
        this.priority = priority;
        this.risk = risk;
        this.title = title;
        this.icon = icon;
        this.amount = amount;
        this.subject = subject;
        this.description = description;
        this.remark = remark;
        this.leadBy = leadBy;
        this.planStartAt = planStartAt;
        this.planEndAt = planEndAt;
        this.startAt = startAt;
        this.endAt = endAt;
        this.metadata = metadata;
        this.active = active;
        this.sigma = sigma;
        this.language = language;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public EProject(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>ZDB.E_PROJECT.KEY</code>. 「key」- 项目ID
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.KEY</code>. 「key」- 项目ID
     */
    @Override
    public EProject setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.NAME</code>. 「name」- 项目名称
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.NAME</code>. 「name」- 项目名称
     */
    @Override
    public EProject setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.CODE</code>. 「code」- 项目编号
     */
    @Override
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.CODE</code>. 「code」- 项目编号
     */
    @Override
    public EProject setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.SHORT_NAME</code>. 「shortName」- 项目简称
     */
    @Override
    public String getShortName() {
        return this.shortName;
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.SHORT_NAME</code>. 「shortName」- 项目简称
     */
    @Override
    public EProject setShortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.DEPT_ID</code>. 「deptId」- 所属部门,
     * resource.departments
     */
    @Override
    public String getDeptId() {
        return this.deptId;
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.DEPT_ID</code>. 「deptId」- 所属部门,
     * resource.departments
     */
    @Override
    public EProject setDeptId(String deptId) {
        this.deptId = deptId;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.TYPE</code>. 「type」- 项目分类，zero.project
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.TYPE</code>. 「type」- 项目分类，zero.project
     */
    @Override
    public EProject setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.STATUS</code>. 「status」-
     * 项目状态，zero.project.status
     */
    @Override
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.STATUS</code>. 「status」-
     * 项目状态，zero.project.status
     */
    @Override
    public EProject setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.BUDGET</code>. 「budget」-
     * 所属预算，zero.project.budget
     */
    @Override
    public String getBudget() {
        return this.budget;
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.BUDGET</code>. 「budget」-
     * 所属预算，zero.project.budget
     */
    @Override
    public EProject setBudget(String budget) {
        this.budget = budget;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.LEVEL</code>. 「level」-
     * 项目级别，zero.project.level
     */
    @Override
    public String getLevel() {
        return this.level;
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.LEVEL</code>. 「level」-
     * 项目级别，zero.project.level
     */
    @Override
    public EProject setLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.PRIORITY</code>. 「priority」-
     * 项目优先级，zero.project.priority
     */
    @Override
    public String getPriority() {
        return this.priority;
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.PRIORITY</code>. 「priority」-
     * 项目优先级，zero.project.priority
     */
    @Override
    public EProject setPriority(String priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.RISK</code>. 「risk」-
     * 项目风险，zero.project.risk
     */
    @Override
    public String getRisk() {
        return this.risk;
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.RISK</code>. 「risk」-
     * 项目风险，zero.project.risk
     */
    @Override
    public EProject setRisk(String risk) {
        this.risk = risk;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.TITLE</code>. 「title」- 项目标题
     */
    @Override
    public String getTitle() {
        return this.title;
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.TITLE</code>. 「title」- 项目标题
     */
    @Override
    public EProject setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.ICON</code>. 「icon」- 项目图标
     */
    @Override
    public String getIcon() {
        return this.icon;
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.ICON</code>. 「icon」- 项目图标
     */
    @Override
    public EProject setIcon(String icon) {
        this.icon = icon;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.AMOUNT</code>. 「amount」- 项目金额
     */
    @Override
    public BigDecimal getAmount() {
        return this.amount;
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.AMOUNT</code>. 「amount」- 项目金额
     */
    @Override
    public EProject setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.SUBJECT</code>. 「subject」- 项目目标
     */
    @Override
    public String getSubject() {
        return this.subject;
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.SUBJECT</code>. 「subject」- 项目目标
     */
    @Override
    public EProject setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.DESCRIPTION</code>. 「description」- 主单描述内容
     */
    @Override
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.DESCRIPTION</code>. 「description」- 主单描述内容
     */
    @Override
    public EProject setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.REMARK</code>. 「remark」- 项目备注
     */
    @Override
    public String getRemark() {
        return this.remark;
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.REMARK</code>. 「remark」- 项目备注
     */
    @Override
    public EProject setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.LEAD_BY</code>. 「leadBy」- 项目经理
     */
    @Override
    public String getLeadBy() {
        return this.leadBy;
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.LEAD_BY</code>. 「leadBy」- 项目经理
     */
    @Override
    public EProject setLeadBy(String leadBy) {
        this.leadBy = leadBy;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.PLAN_START_AT</code>. 「planStartAt」- 开始日期
     */
    @Override
    public LocalDateTime getPlanStartAt() {
        return this.planStartAt;
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.PLAN_START_AT</code>. 「planStartAt」- 开始日期
     */
    @Override
    public EProject setPlanStartAt(LocalDateTime planStartAt) {
        this.planStartAt = planStartAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.PLAN_END_AT</code>. 「planEndAt」- 结束日期
     */
    @Override
    public LocalDateTime getPlanEndAt() {
        return this.planEndAt;
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.PLAN_END_AT</code>. 「planEndAt」- 结束日期
     */
    @Override
    public EProject setPlanEndAt(LocalDateTime planEndAt) {
        this.planEndAt = planEndAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.START_AT</code>. 「startAt」- 实际开始日期
     */
    @Override
    public LocalDateTime getStartAt() {
        return this.startAt;
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.START_AT</code>. 「startAt」- 实际开始日期
     */
    @Override
    public EProject setStartAt(LocalDateTime startAt) {
        this.startAt = startAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.END_AT</code>. 「endAt」- 实际结束日期
     */
    @Override
    public LocalDateTime getEndAt() {
        return this.endAt;
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.END_AT</code>. 「endAt」- 实际结束日期
     */
    @Override
    public EProject setEndAt(LocalDateTime endAt) {
        this.endAt = endAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public EProject setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public EProject setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.SIGMA</code>. 「sigma」- 统一标识（项目所属应用）
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.SIGMA</code>. 「sigma」- 统一标识（项目所属应用）
     */
    @Override
    public EProject setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public EProject setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public EProject setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public EProject setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public EProject setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public EProject setUpdatedBy(String updatedBy) {
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
        final EProject other = (EProject) obj;
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
        if (this.shortName == null) {
            if (other.shortName != null)
                return false;
        }
        else if (!this.shortName.equals(other.shortName))
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
        if (this.priority == null) {
            if (other.priority != null)
                return false;
        }
        else if (!this.priority.equals(other.priority))
            return false;
        if (this.risk == null) {
            if (other.risk != null)
                return false;
        }
        else if (!this.risk.equals(other.risk))
            return false;
        if (this.title == null) {
            if (other.title != null)
                return false;
        }
        else if (!this.title.equals(other.title))
            return false;
        if (this.icon == null) {
            if (other.icon != null)
                return false;
        }
        else if (!this.icon.equals(other.icon))
            return false;
        if (this.amount == null) {
            if (other.amount != null)
                return false;
        }
        else if (!this.amount.equals(other.amount))
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
        if (this.remark == null) {
            if (other.remark != null)
                return false;
        }
        else if (!this.remark.equals(other.remark))
            return false;
        if (this.leadBy == null) {
            if (other.leadBy != null)
                return false;
        }
        else if (!this.leadBy.equals(other.leadBy))
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
        result = prime * result + ((this.shortName == null) ? 0 : this.shortName.hashCode());
        result = prime * result + ((this.deptId == null) ? 0 : this.deptId.hashCode());
        result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.budget == null) ? 0 : this.budget.hashCode());
        result = prime * result + ((this.level == null) ? 0 : this.level.hashCode());
        result = prime * result + ((this.priority == null) ? 0 : this.priority.hashCode());
        result = prime * result + ((this.risk == null) ? 0 : this.risk.hashCode());
        result = prime * result + ((this.title == null) ? 0 : this.title.hashCode());
        result = prime * result + ((this.icon == null) ? 0 : this.icon.hashCode());
        result = prime * result + ((this.amount == null) ? 0 : this.amount.hashCode());
        result = prime * result + ((this.subject == null) ? 0 : this.subject.hashCode());
        result = prime * result + ((this.description == null) ? 0 : this.description.hashCode());
        result = prime * result + ((this.remark == null) ? 0 : this.remark.hashCode());
        result = prime * result + ((this.leadBy == null) ? 0 : this.leadBy.hashCode());
        result = prime * result + ((this.planStartAt == null) ? 0 : this.planStartAt.hashCode());
        result = prime * result + ((this.planEndAt == null) ? 0 : this.planEndAt.hashCode());
        result = prime * result + ((this.startAt == null) ? 0 : this.startAt.hashCode());
        result = prime * result + ((this.endAt == null) ? 0 : this.endAt.hashCode());
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
        StringBuilder sb = new StringBuilder("EProject (");

        sb.append(key);
        sb.append(", ").append(name);
        sb.append(", ").append(code);
        sb.append(", ").append(shortName);
        sb.append(", ").append(deptId);
        sb.append(", ").append(type);
        sb.append(", ").append(status);
        sb.append(", ").append(budget);
        sb.append(", ").append(level);
        sb.append(", ").append(priority);
        sb.append(", ").append(risk);
        sb.append(", ").append(title);
        sb.append(", ").append(icon);
        sb.append(", ").append(amount);
        sb.append(", ").append(subject);
        sb.append(", ").append(description);
        sb.append(", ").append(remark);
        sb.append(", ").append(leadBy);
        sb.append(", ").append(planStartAt);
        sb.append(", ").append(planEndAt);
        sb.append(", ").append(startAt);
        sb.append(", ").append(endAt);
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
    public void from(IEProject from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setShortName(from.getShortName());
        setDeptId(from.getDeptId());
        setType(from.getType());
        setStatus(from.getStatus());
        setBudget(from.getBudget());
        setLevel(from.getLevel());
        setPriority(from.getPriority());
        setRisk(from.getRisk());
        setTitle(from.getTitle());
        setIcon(from.getIcon());
        setAmount(from.getAmount());
        setSubject(from.getSubject());
        setDescription(from.getDescription());
        setRemark(from.getRemark());
        setLeadBy(from.getLeadBy());
        setPlanStartAt(from.getPlanStartAt());
        setPlanEndAt(from.getPlanEndAt());
        setStartAt(from.getStartAt());
        setEndAt(from.getEndAt());
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
    public <E extends IEProject> E into(E into) {
        into.from(this);
        return into;
    }
}
