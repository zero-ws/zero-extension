/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.records;


import cn.vertxup.erp.domain.tables.EProject;
import cn.vertxup.erp.domain.tables.interfaces.IEProject;

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
public class EProjectRecord extends UpdatableRecordImpl<EProjectRecord> implements VertxPojo, IEProject {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>ZDB.E_PROJECT.KEY</code>. 「key」- 项目ID
     */
    @Override
    public EProjectRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.KEY</code>. 「key」- 项目ID
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.NAME</code>. 「name」- 项目名称
     */
    @Override
    public EProjectRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.NAME</code>. 「name」- 项目名称
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.CODE</code>. 「code」- 项目编号
     */
    @Override
    public EProjectRecord setCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.CODE</code>. 「code」- 项目编号
     */
    @Override
    public String getCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.SHORT_NAME</code>. 「shortName」- 项目简称
     */
    @Override
    public EProjectRecord setShortName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.SHORT_NAME</code>. 「shortName」- 项目简称
     */
    @Override
    public String getShortName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.DEPT_ID</code>. 「deptId」- 所属部门,
     * resource.departments
     */
    @Override
    public EProjectRecord setDeptId(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.DEPT_ID</code>. 「deptId」- 所属部门,
     * resource.departments
     */
    @Override
    public String getDeptId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.TYPE</code>. 「type」- 项目分类，zero.project
     */
    @Override
    public EProjectRecord setType(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.TYPE</code>. 「type」- 项目分类，zero.project
     */
    @Override
    public String getType() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.STATUS</code>. 「status」-
     * 项目状态，zero.project.status
     */
    @Override
    public EProjectRecord setStatus(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.STATUS</code>. 「status」-
     * 项目状态，zero.project.status
     */
    @Override
    public String getStatus() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.BUDGET</code>. 「budget」-
     * 所属预算，zero.project.budget
     */
    @Override
    public EProjectRecord setBudget(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.BUDGET</code>. 「budget」-
     * 所属预算，zero.project.budget
     */
    @Override
    public String getBudget() {
        return (String) get(7);
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.LEVEL</code>. 「level」-
     * 项目级别，zero.project.level
     */
    @Override
    public EProjectRecord setLevel(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.LEVEL</code>. 「level」-
     * 项目级别，zero.project.level
     */
    @Override
    public String getLevel() {
        return (String) get(8);
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.PRIORITY</code>. 「priority」-
     * 项目优先级，zero.project.priority
     */
    @Override
    public EProjectRecord setPriority(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.PRIORITY</code>. 「priority」-
     * 项目优先级，zero.project.priority
     */
    @Override
    public String getPriority() {
        return (String) get(9);
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.RISK</code>. 「risk」-
     * 项目风险，zero.project.risk
     */
    @Override
    public EProjectRecord setRisk(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.RISK</code>. 「risk」-
     * 项目风险，zero.project.risk
     */
    @Override
    public String getRisk() {
        return (String) get(10);
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.TITLE</code>. 「title」- 项目标题
     */
    @Override
    public EProjectRecord setTitle(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.TITLE</code>. 「title」- 项目标题
     */
    @Override
    public String getTitle() {
        return (String) get(11);
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.ICON</code>. 「icon」- 项目图标
     */
    @Override
    public EProjectRecord setIcon(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.ICON</code>. 「icon」- 项目图标
     */
    @Override
    public String getIcon() {
        return (String) get(12);
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.AMOUNT</code>. 「amount」- 项目金额
     */
    @Override
    public EProjectRecord setAmount(BigDecimal value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.AMOUNT</code>. 「amount」- 项目金额
     */
    @Override
    public BigDecimal getAmount() {
        return (BigDecimal) get(13);
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.SUBJECT</code>. 「subject」- 项目目标
     */
    @Override
    public EProjectRecord setSubject(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.SUBJECT</code>. 「subject」- 项目目标
     */
    @Override
    public String getSubject() {
        return (String) get(14);
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.DESCRIPTION</code>. 「description」- 主单描述内容
     */
    @Override
    public EProjectRecord setDescription(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.DESCRIPTION</code>. 「description」- 主单描述内容
     */
    @Override
    public String getDescription() {
        return (String) get(15);
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.REMARK</code>. 「remark」- 项目备注
     */
    @Override
    public EProjectRecord setRemark(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.REMARK</code>. 「remark」- 项目备注
     */
    @Override
    public String getRemark() {
        return (String) get(16);
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.LEAD_BY</code>. 「leadBy」- 项目经理
     */
    @Override
    public EProjectRecord setLeadBy(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.LEAD_BY</code>. 「leadBy」- 项目经理
     */
    @Override
    public String getLeadBy() {
        return (String) get(17);
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.PLAN_START_AT</code>. 「planStartAt」- 开始日期
     */
    @Override
    public EProjectRecord setPlanStartAt(LocalDateTime value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.PLAN_START_AT</code>. 「planStartAt」- 开始日期
     */
    @Override
    public LocalDateTime getPlanStartAt() {
        return (LocalDateTime) get(18);
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.PLAN_END_AT</code>. 「planEndAt」- 结束日期
     */
    @Override
    public EProjectRecord setPlanEndAt(LocalDateTime value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.PLAN_END_AT</code>. 「planEndAt」- 结束日期
     */
    @Override
    public LocalDateTime getPlanEndAt() {
        return (LocalDateTime) get(19);
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.START_AT</code>. 「startAt」- 实际开始日期
     */
    @Override
    public EProjectRecord setStartAt(LocalDateTime value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.START_AT</code>. 「startAt」- 实际开始日期
     */
    @Override
    public LocalDateTime getStartAt() {
        return (LocalDateTime) get(20);
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.END_AT</code>. 「endAt」- 实际结束日期
     */
    @Override
    public EProjectRecord setEndAt(LocalDateTime value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.END_AT</code>. 「endAt」- 实际结束日期
     */
    @Override
    public LocalDateTime getEndAt() {
        return (LocalDateTime) get(21);
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public EProjectRecord setMetadata(String value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(22);
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public EProjectRecord setActive(Boolean value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(23);
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.SIGMA</code>. 「sigma」- 统一标识（项目所属应用）
     */
    @Override
    public EProjectRecord setSigma(String value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.SIGMA</code>. 「sigma」- 统一标识（项目所属应用）
     */
    @Override
    public String getSigma() {
        return (String) get(24);
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public EProjectRecord setLanguage(String value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(25);
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public EProjectRecord setCreatedAt(LocalDateTime value) {
        set(26, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(26);
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public EProjectRecord setCreatedBy(String value) {
        set(27, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(27);
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public EProjectRecord setUpdatedAt(LocalDateTime value) {
        set(28, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(28);
    }

    /**
     * Setter for <code>ZDB.E_PROJECT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public EProjectRecord setUpdatedBy(String value) {
        set(29, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_PROJECT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(29);
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
        resetChangedOnNotNull();
    }

    @Override
    public <E extends IEProject> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EProjectRecord
     */
    public EProjectRecord() {
        super(EProject.E_PROJECT);
    }

    /**
     * Create a detached, initialised EProjectRecord
     */
    public EProjectRecord(String key, String name, String code, String shortName, String deptId, String type, String status, String budget, String level, String priority, String risk, String title, String icon, BigDecimal amount, String subject, String description, String remark, String leadBy, LocalDateTime planStartAt, LocalDateTime planEndAt, LocalDateTime startAt, LocalDateTime endAt, String metadata, Boolean active, String sigma, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(EProject.E_PROJECT);

        setKey(key);
        setName(name);
        setCode(code);
        setShortName(shortName);
        setDeptId(deptId);
        setType(type);
        setStatus(status);
        setBudget(budget);
        setLevel(level);
        setPriority(priority);
        setRisk(risk);
        setTitle(title);
        setIcon(icon);
        setAmount(amount);
        setSubject(subject);
        setDescription(description);
        setRemark(remark);
        setLeadBy(leadBy);
        setPlanStartAt(planStartAt);
        setPlanEndAt(planEndAt);
        setStartAt(startAt);
        setEndAt(endAt);
        setMetadata(metadata);
        setActive(active);
        setSigma(sigma);
        setLanguage(language);
        setCreatedAt(createdAt);
        setCreatedBy(createdBy);
        setUpdatedAt(updatedAt);
        setUpdatedBy(updatedBy);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised EProjectRecord
     */
    public EProjectRecord(cn.vertxup.erp.domain.tables.pojos.EProject value) {
        super(EProject.E_PROJECT);

        if (value != null) {
            setKey(value.getKey());
            setName(value.getName());
            setCode(value.getCode());
            setShortName(value.getShortName());
            setDeptId(value.getDeptId());
            setType(value.getType());
            setStatus(value.getStatus());
            setBudget(value.getBudget());
            setLevel(value.getLevel());
            setPriority(value.getPriority());
            setRisk(value.getRisk());
            setTitle(value.getTitle());
            setIcon(value.getIcon());
            setAmount(value.getAmount());
            setSubject(value.getSubject());
            setDescription(value.getDescription());
            setRemark(value.getRemark());
            setLeadBy(value.getLeadBy());
            setPlanStartAt(value.getPlanStartAt());
            setPlanEndAt(value.getPlanEndAt());
            setStartAt(value.getStartAt());
            setEndAt(value.getEndAt());
            setMetadata(value.getMetadata());
            setActive(value.getActive());
            setSigma(value.getSigma());
            setLanguage(value.getLanguage());
            setCreatedAt(value.getCreatedAt());
            setCreatedBy(value.getCreatedBy());
            setUpdatedAt(value.getUpdatedAt());
            setUpdatedBy(value.getUpdatedBy());
            resetChangedOnNotNull();
        }
    }

        public EProjectRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
