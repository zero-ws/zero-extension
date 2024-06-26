/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.runtime.integration.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.time.LocalDateTime;

import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.setOrThrow;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public interface IIPortfolio extends VertxPojo, Serializable {

    /**
     * Getter for <code>ZDB.I_PORTFOLIO.KEY</code>. 「key」- 目录专用ID
     */
    public String getKey();

    /**
     * Setter for <code>ZDB.I_PORTFOLIO.KEY</code>. 「key」- 目录专用ID
     */
    public IIPortfolio setKey(String value);

    /**
     * Getter for <code>ZDB.I_PORTFOLIO.NAME</code>. 「name」- 目录名称
     */
    public String getName();

    /**
     * Setter for <code>ZDB.I_PORTFOLIO.NAME</code>. 「name」- 目录名称
     */
    public IIPortfolio setName(String value);

    /**
     * Getter for <code>ZDB.I_PORTFOLIO.CODE</code>. 「code」- 目录系统编码
     */
    public String getCode();

    /**
     * Setter for <code>ZDB.I_PORTFOLIO.CODE</code>. 「code」- 目录系统编码
     */
    public IIPortfolio setCode(String value);

    /**
     * Getter for <code>ZDB.I_PORTFOLIO.STATUS</code>. 「status」- 目录状态
     */
    public String getStatus();

    /**
     * Setter for <code>ZDB.I_PORTFOLIO.STATUS</code>. 「status」- 目录状态
     */
    public IIPortfolio setStatus(String value);

    /**
     * Getter for <code>ZDB.I_PORTFOLIO.TYPE</code>. 「type」- 目录类型
     */
    public String getType();

    /**
     * Setter for <code>ZDB.I_PORTFOLIO.TYPE</code>. 「type」- 目录类型
     */
    public IIPortfolio setType(String value);

    /**
     * Getter for <code>ZDB.I_PORTFOLIO.INTEGRATION_ID</code>. 「integrationId」-
     * 是否关联集成配置，管理时直接同步
     */
    public String getIntegrationId();

    /**
     * Setter for <code>ZDB.I_PORTFOLIO.INTEGRATION_ID</code>. 「integrationId」-
     * 是否关联集成配置，管理时直接同步
     */
    public IIPortfolio setIntegrationId(String value);

    /**
     * Getter for <code>ZDB.I_PORTFOLIO.OWNER_TYPE</code>. 「ownerType」- 关联主体类型
     */
    public String getOwnerType();

    /**
     * Setter for <code>ZDB.I_PORTFOLIO.OWNER_TYPE</code>. 「ownerType」- 关联主体类型
     */
    public IIPortfolio setOwnerType(String value);

    /**
     * Getter for <code>ZDB.I_PORTFOLIO.OWNER</code>. 「owner」- 关联主体主键
     */
    public String getOwner();

    /**
     * Setter for <code>ZDB.I_PORTFOLIO.OWNER</code>. 「owner」- 关联主体主键
     */
    public IIPortfolio setOwner(String value);

    /**
     * Getter for <code>ZDB.I_PORTFOLIO.RUN_COMPONENT</code>. 「runComponent」-
     * 执行组件，LDAP执行专用
     */
    public String getRunComponent();

    /**
     * Setter for <code>ZDB.I_PORTFOLIO.RUN_COMPONENT</code>. 「runComponent」-
     * 执行组件，LDAP执行专用
     */
    public IIPortfolio setRunComponent(String value);

    /**
     * Getter for <code>ZDB.I_PORTFOLIO.RUN_CONFIG</code>. 「runConfig」- 执行组件额外配置
     */
    public String getRunConfig();

    /**
     * Setter for <code>ZDB.I_PORTFOLIO.RUN_CONFIG</code>. 「runConfig」- 执行组件额外配置
     */
    public IIPortfolio setRunConfig(String value);

    /**
     * Getter for <code>ZDB.I_PORTFOLIO.DATA_KEY</code>. 「dataKey」- LDAP路径做完整标识
     */
    public String getDataKey();

    /**
     * Setter for <code>ZDB.I_PORTFOLIO.DATA_KEY</code>. 「dataKey」- LDAP路径做完整标识
     */
    public IIPortfolio setDataKey(String value);

    /**
     * Getter for <code>ZDB.I_PORTFOLIO.DATA_CONFIG</code>. 「dataConfig」- 数据基础配置
     */
    public String getDataConfig();

    /**
     * Setter for <code>ZDB.I_PORTFOLIO.DATA_CONFIG</code>. 「dataConfig」- 数据基础配置
     */
    public IIPortfolio setDataConfig(String value);

    /**
     * Getter for <code>ZDB.I_PORTFOLIO.DATA_SECURE</code>. 「dataSecure」- 安全专用配置
     */
    public String getDataSecure();

    /**
     * Setter for <code>ZDB.I_PORTFOLIO.DATA_SECURE</code>. 「dataSecure」- 安全专用配置
     */
    public IIPortfolio setDataSecure(String value);

    /**
     * Getter for <code>ZDB.I_PORTFOLIO.DATA_INTEGRATION</code>.
     * 「dataIntegration」- 绑定好过后，导入/导出数据专用配置
     */
    public String getDataIntegration();

    /**
     * Setter for <code>ZDB.I_PORTFOLIO.DATA_INTEGRATION</code>.
     * 「dataIntegration」- 绑定好过后，导入/导出数据专用配置
     */
    public IIPortfolio setDataIntegration(String value);

    /**
     * Getter for <code>ZDB.I_PORTFOLIO.APP_ID</code>. 「appId」- 关联的应用程序ID
     */
    public String getAppId();

    /**
     * Setter for <code>ZDB.I_PORTFOLIO.APP_ID</code>. 「appId」- 关联的应用程序ID
     */
    public IIPortfolio setAppId(String value);

    /**
     * Getter for <code>ZDB.I_PORTFOLIO.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>ZDB.I_PORTFOLIO.ACTIVE</code>. 「active」- 是否启用
     */
    public IIPortfolio setActive(Boolean value);

    /**
     * Getter for <code>ZDB.I_PORTFOLIO.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>ZDB.I_PORTFOLIO.SIGMA</code>. 「sigma」- 统一标识
     */
    public IIPortfolio setSigma(String value);

    /**
     * Getter for <code>ZDB.I_PORTFOLIO.METADATA</code>. 「metadata」- 附加配置
     */
    public String getMetadata();

    /**
     * Setter for <code>ZDB.I_PORTFOLIO.METADATA</code>. 「metadata」- 附加配置
     */
    public IIPortfolio setMetadata(String value);

    /**
     * Getter for <code>ZDB.I_PORTFOLIO.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>ZDB.I_PORTFOLIO.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IIPortfolio setLanguage(String value);

    /**
     * Getter for <code>ZDB.I_PORTFOLIO.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>ZDB.I_PORTFOLIO.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IIPortfolio setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.I_PORTFOLIO.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>ZDB.I_PORTFOLIO.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IIPortfolio setCreatedBy(String value);

    /**
     * Getter for <code>ZDB.I_PORTFOLIO.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>ZDB.I_PORTFOLIO.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IIPortfolio setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.I_PORTFOLIO.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    /**
     * Setter for <code>ZDB.I_PORTFOLIO.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IIPortfolio setUpdatedBy(String value);

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IIPortfolio
     */
    public void from(IIPortfolio from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IIPortfolio
     */
    public <E extends IIPortfolio> E into(E into);

    @Override
    public default IIPortfolio fromJson(io.vertx.core.json.JsonObject json) {
        setOrThrow(this::setKey, json::getString, "KEY", "java.lang.String");
        setOrThrow(this::setName, json::getString, "NAME", "java.lang.String");
        setOrThrow(this::setCode, json::getString, "CODE", "java.lang.String");
        setOrThrow(this::setStatus, json::getString, "STATUS", "java.lang.String");
        setOrThrow(this::setType, json::getString, "TYPE", "java.lang.String");
        setOrThrow(this::setIntegrationId, json::getString, "INTEGRATION_ID", "java.lang.String");
        setOrThrow(this::setOwnerType, json::getString, "OWNER_TYPE", "java.lang.String");
        setOrThrow(this::setOwner, json::getString, "OWNER", "java.lang.String");
        setOrThrow(this::setRunComponent, json::getString, "RUN_COMPONENT", "java.lang.String");
        setOrThrow(this::setRunConfig, json::getString, "RUN_CONFIG", "java.lang.String");
        setOrThrow(this::setDataKey, json::getString, "DATA_KEY", "java.lang.String");
        setOrThrow(this::setDataConfig, json::getString, "DATA_CONFIG", "java.lang.String");
        setOrThrow(this::setDataSecure, json::getString, "DATA_SECURE", "java.lang.String");
        setOrThrow(this::setDataIntegration, json::getString, "DATA_INTEGRATION", "java.lang.String");
        setOrThrow(this::setAppId, json::getString, "APP_ID", "java.lang.String");
        setOrThrow(this::setActive, json::getBoolean, "ACTIVE", "java.lang.Boolean");
        setOrThrow(this::setSigma, json::getString, "SIGMA", "java.lang.String");
        setOrThrow(this::setMetadata, json::getString, "METADATA", "java.lang.String");
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
        json.put("STATUS", getStatus());
        json.put("TYPE", getType());
        json.put("INTEGRATION_ID", getIntegrationId());
        json.put("OWNER_TYPE", getOwnerType());
        json.put("OWNER", getOwner());
        json.put("RUN_COMPONENT", getRunComponent());
        json.put("RUN_CONFIG", getRunConfig());
        json.put("DATA_KEY", getDataKey());
        json.put("DATA_CONFIG", getDataConfig());
        json.put("DATA_SECURE", getDataSecure());
        json.put("DATA_INTEGRATION", getDataIntegration());
        json.put("APP_ID", getAppId());
        json.put("ACTIVE", getActive());
        json.put("SIGMA", getSigma());
        json.put("METADATA", getMetadata());
        json.put("LANGUAGE", getLanguage());
        json.put("CREATED_AT", getCreatedAt() == null ? null : getCreatedAt().toString());
        json.put("CREATED_BY", getCreatedBy());
        json.put("UPDATED_AT", getUpdatedAt() == null ? null : getUpdatedAt().toString());
        json.put("UPDATED_BY", getUpdatedBy());
        return json;
    }

}
