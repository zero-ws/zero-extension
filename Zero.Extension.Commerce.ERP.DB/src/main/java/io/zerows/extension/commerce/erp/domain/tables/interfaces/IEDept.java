/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.erp.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.time.LocalDateTime;

import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.setOrThrow;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public interface IEDept extends VertxPojo, Serializable {

    /**
     * Getter for <code>ZDB.E_DEPT.KEY</code>. 「key」- 部门主键
     */
    public String getKey();

    /**
     * Setter for <code>ZDB.E_DEPT.KEY</code>. 「key」- 部门主键
     */
    public IEDept setKey(String value);

    /**
     * Getter for <code>ZDB.E_DEPT.NAME</code>. 「name」- 部门名称
     */
    public String getName();

    /**
     * Setter for <code>ZDB.E_DEPT.NAME</code>. 「name」- 部门名称
     */
    public IEDept setName(String value);

    /**
     * Getter for <code>ZDB.E_DEPT.CODE</code>. 「code」- 部门编号
     */
    public String getCode();

    /**
     * Setter for <code>ZDB.E_DEPT.CODE</code>. 「code」- 部门编号
     */
    public IEDept setCode(String value);

    /**
     * Getter for <code>ZDB.E_DEPT.MANAGER_ID</code>. 「managerId」- 部门经理
     */
    public String getManagerId();

    /**
     * Setter for <code>ZDB.E_DEPT.MANAGER_ID</code>. 「managerId」- 部门经理
     */
    public IEDept setManagerId(String value);

    /**
     * Getter for <code>ZDB.E_DEPT.MANAGER_NAME</code>. 「managerName」- 部门名称
     */
    public String getManagerName();

    /**
     * Setter for <code>ZDB.E_DEPT.MANAGER_NAME</code>. 「managerName」- 部门名称
     */
    public IEDept setManagerName(String value);

    /**
     * Getter for <code>ZDB.E_DEPT.COMPANY_ID</code>. 「companyId」- 所属公司
     */
    public String getCompanyId();

    /**
     * Setter for <code>ZDB.E_DEPT.COMPANY_ID</code>. 「companyId」- 所属公司
     */
    public IEDept setCompanyId(String value);

    /**
     * Getter for <code>ZDB.E_DEPT.DEPT_ID</code>. 「deptId」- 父部门
     */
    public String getDeptId();

    /**
     * Setter for <code>ZDB.E_DEPT.DEPT_ID</code>. 「deptId」- 父部门
     */
    public IEDept setDeptId(String value);

    /**
     * Getter for <code>ZDB.E_DEPT.COMMENT</code>. 「comment」- 部门备注
     */
    public String getComment();

    /**
     * Setter for <code>ZDB.E_DEPT.COMMENT</code>. 「comment」- 部门备注
     */
    public IEDept setComment(String value);

    /**
     * Getter for <code>ZDB.E_DEPT.METADATA</code>. 「metadata」- 附加配置
     */
    public String getMetadata();

    /**
     * Setter for <code>ZDB.E_DEPT.METADATA</code>. 「metadata」- 附加配置
     */
    public IEDept setMetadata(String value);

    /**
     * Getter for <code>ZDB.E_DEPT.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>ZDB.E_DEPT.ACTIVE</code>. 「active」- 是否启用
     */
    public IEDept setActive(Boolean value);

    /**
     * Getter for <code>ZDB.E_DEPT.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>ZDB.E_DEPT.SIGMA</code>. 「sigma」- 统一标识
     */
    public IEDept setSigma(String value);

    /**
     * Getter for <code>ZDB.E_DEPT.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>ZDB.E_DEPT.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IEDept setLanguage(String value);

    /**
     * Getter for <code>ZDB.E_DEPT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>ZDB.E_DEPT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IEDept setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.E_DEPT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>ZDB.E_DEPT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IEDept setCreatedBy(String value);

    /**
     * Getter for <code>ZDB.E_DEPT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>ZDB.E_DEPT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IEDept setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.E_DEPT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    /**
     * Setter for <code>ZDB.E_DEPT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IEDept setUpdatedBy(String value);

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IEDept
     */
    public void from(IEDept from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IEDept
     */
    public <E extends IEDept> E into(E into);

    @Override
    public default IEDept fromJson(io.vertx.core.json.JsonObject json) {
        setOrThrow(this::setKey, json::getString, "KEY", "java.lang.String");
        setOrThrow(this::setName, json::getString, "NAME", "java.lang.String");
        setOrThrow(this::setCode, json::getString, "CODE", "java.lang.String");
        setOrThrow(this::setManagerId, json::getString, "MANAGER_ID", "java.lang.String");
        setOrThrow(this::setManagerName, json::getString, "MANAGER_NAME", "java.lang.String");
        setOrThrow(this::setCompanyId, json::getString, "COMPANY_ID", "java.lang.String");
        setOrThrow(this::setDeptId, json::getString, "DEPT_ID", "java.lang.String");
        setOrThrow(this::setComment, json::getString, "COMMENT", "java.lang.String");
        setOrThrow(this::setMetadata, json::getString, "METADATA", "java.lang.String");
        setOrThrow(this::setActive, json::getBoolean, "ACTIVE", "java.lang.Boolean");
        setOrThrow(this::setSigma, json::getString, "SIGMA", "java.lang.String");
        setOrThrow(this::setLanguage, json::getString, "LANGUAGE", "java.lang.String");
        setOrThrow(this::setCreatedAt, key -> {
            String s = json.getString(key);
            return s == null ? null : java.time.LocalDateTime.parse(s);
        }, "CREATED_AT", "java.time.LocalDateTime");
        setOrThrow(this::setCreatedBy, json::getString, "CREATED_BY", "java.lang.String");
        setOrThrow(this::setUpdatedAt, key -> {
            String s = json.getString(key);
            return s == null ? null : java.time.LocalDateTime.parse(s);
        }, "UPDATED_AT", "java.time.LocalDateTime");
        setOrThrow(this::setUpdatedBy, json::getString, "UPDATED_BY", "java.lang.String");
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("KEY", getKey());
        json.put("NAME", getName());
        json.put("CODE", getCode());
        json.put("MANAGER_ID", getManagerId());
        json.put("MANAGER_NAME", getManagerName());
        json.put("COMPANY_ID", getCompanyId());
        json.put("DEPT_ID", getDeptId());
        json.put("COMMENT", getComment());
        json.put("METADATA", getMetadata());
        json.put("ACTIVE", getActive());
        json.put("SIGMA", getSigma());
        json.put("LANGUAGE", getLanguage());
        json.put("CREATED_AT", getCreatedAt() == null ? null : getCreatedAt().toString());
        json.put("CREATED_BY", getCreatedBy());
        json.put("UPDATED_AT", getUpdatedAt() == null ? null : getUpdatedAt().toString());
        json.put("UPDATED_BY", getUpdatedBy());
        return json;
    }

}
