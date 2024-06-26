/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.runtime.ambient.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IXSource extends VertxPojo, Serializable {

    /**
     * Setter for <code>ZDB.X_SOURCE.KEY</code>. 「key」- 数据源主键
     */
    public IXSource setKey(String value);

    /**
     * Getter for <code>ZDB.X_SOURCE.KEY</code>. 「key」- 数据源主键
     */
    public String getKey();

    /**
     * Setter for <code>ZDB.X_SOURCE.IP_V4</code>. 「ipV4」- IP v4地址
     */
    public IXSource setIpV4(String value);

    /**
     * Getter for <code>ZDB.X_SOURCE.IP_V4</code>. 「ipV4」- IP v4地址
     */
    public String getIpV4();

    /**
     * Setter for <code>ZDB.X_SOURCE.IP_V6</code>. 「ipV6」- IP v6地址
     */
    public IXSource setIpV6(String value);

    /**
     * Getter for <code>ZDB.X_SOURCE.IP_V6</code>. 「ipV6」- IP v6地址
     */
    public String getIpV6();

    /**
     * Setter for <code>ZDB.X_SOURCE.HOSTNAME</code>. 「hostname」- 主机地址
     */
    public IXSource setHostname(String value);

    /**
     * Getter for <code>ZDB.X_SOURCE.HOSTNAME</code>. 「hostname」- 主机地址
     */
    public String getHostname();

    /**
     * Setter for <code>ZDB.X_SOURCE.PORT</code>. 「port」- 端口号
     */
    public IXSource setPort(Integer value);

    /**
     * Getter for <code>ZDB.X_SOURCE.PORT</code>. 「port」- 端口号
     */
    public Integer getPort();

    /**
     * Setter for <code>ZDB.X_SOURCE.CATEGORY</code>. 「category」- 数据库类型
     */
    public IXSource setCategory(String value);

    /**
     * Getter for <code>ZDB.X_SOURCE.CATEGORY</code>. 「category」- 数据库类型
     */
    public String getCategory();

    /**
     * Setter for <code>ZDB.X_SOURCE.DRIVER_CLASS_NAME</code>.
     * 「driverClassName」- 数据库驱动指定，JDBC4之前
     */
    public IXSource setDriverClassName(String value);

    /**
     * Getter for <code>ZDB.X_SOURCE.DRIVER_CLASS_NAME</code>.
     * 「driverClassName」- 数据库驱动指定，JDBC4之前
     */
    public String getDriverClassName();

    /**
     * Setter for <code>ZDB.X_SOURCE.JDBC_URL</code>. 「jdbcUrl」- JDBC连接字符串
     */
    public IXSource setJdbcUrl(String value);

    /**
     * Getter for <code>ZDB.X_SOURCE.JDBC_URL</code>. 「jdbcUrl」- JDBC连接字符串
     */
    public String getJdbcUrl();

    /**
     * Setter for <code>ZDB.X_SOURCE.JDBC_CONFIG</code>. 「jdbcConfig」-
     * 连接字符串中的配置key=value
     */
    public IXSource setJdbcConfig(String value);

    /**
     * Getter for <code>ZDB.X_SOURCE.JDBC_CONFIG</code>. 「jdbcConfig」-
     * 连接字符串中的配置key=value
     */
    public String getJdbcConfig();

    /**
     * Setter for <code>ZDB.X_SOURCE.INSTANCE</code>. 「instance」- 实例名称
     */
    public IXSource setInstance(String value);

    /**
     * Getter for <code>ZDB.X_SOURCE.INSTANCE</code>. 「instance」- 实例名称
     */
    public String getInstance();

    /**
     * Setter for <code>ZDB.X_SOURCE.USERNAME</code>. 「username」- 账号
     */
    public IXSource setUsername(String value);

    /**
     * Getter for <code>ZDB.X_SOURCE.USERNAME</code>. 「username」- 账号
     */
    public String getUsername();

    /**
     * Setter for <code>ZDB.X_SOURCE.PASSWORD</code>. 「password」- 密码
     */
    public IXSource setPassword(String value);

    /**
     * Getter for <code>ZDB.X_SOURCE.PASSWORD</code>. 「password」- 密码
     */
    public String getPassword();

    /**
     * Setter for <code>ZDB.X_SOURCE.APP_ID</code>. 「appId」- 关联的应用程序ID
     */
    public IXSource setAppId(String value);

    /**
     * Getter for <code>ZDB.X_SOURCE.APP_ID</code>. 「appId」- 关联的应用程序ID
     */
    public String getAppId();

    /**
     * Setter for <code>ZDB.X_SOURCE.ACTIVE</code>. 「active」- 是否启用
     */
    public IXSource setActive(Boolean value);

    /**
     * Getter for <code>ZDB.X_SOURCE.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>ZDB.X_SOURCE.SIGMA</code>. 「sigma」- 统一标识
     */
    public IXSource setSigma(String value);

    /**
     * Getter for <code>ZDB.X_SOURCE.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>ZDB.X_SOURCE.METADATA</code>. 「metadata」- 附加配置
     */
    public IXSource setMetadata(String value);

    /**
     * Getter for <code>ZDB.X_SOURCE.METADATA</code>. 「metadata」- 附加配置
     */
    public String getMetadata();

    /**
     * Setter for <code>ZDB.X_SOURCE.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IXSource setLanguage(String value);

    /**
     * Getter for <code>ZDB.X_SOURCE.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>ZDB.X_SOURCE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IXSource setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.X_SOURCE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>ZDB.X_SOURCE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IXSource setCreatedBy(String value);

    /**
     * Getter for <code>ZDB.X_SOURCE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>ZDB.X_SOURCE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IXSource setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.X_SOURCE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>ZDB.X_SOURCE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IXSource setUpdatedBy(String value);

    /**
     * Getter for <code>ZDB.X_SOURCE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IXSource
     */
    public void from(IXSource from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IXSource
     */
    public <E extends IXSource> E into(E into);

        @Override
        public default IXSource fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setIpV4,json::getString,"IP_V4","java.lang.String");
                setOrThrow(this::setIpV6,json::getString,"IP_V6","java.lang.String");
                setOrThrow(this::setHostname,json::getString,"HOSTNAME","java.lang.String");
                setOrThrow(this::setPort,json::getInteger,"PORT","java.lang.Integer");
                setOrThrow(this::setCategory,json::getString,"CATEGORY","java.lang.String");
                setOrThrow(this::setDriverClassName,json::getString,"DRIVER_CLASS_NAME","java.lang.String");
                setOrThrow(this::setJdbcUrl,json::getString,"JDBC_URL","java.lang.String");
                setOrThrow(this::setJdbcConfig,json::getString,"JDBC_CONFIG","java.lang.String");
                setOrThrow(this::setInstance,json::getString,"INSTANCE","java.lang.String");
                setOrThrow(this::setUsername,json::getString,"USERNAME","java.lang.String");
                setOrThrow(this::setPassword,json::getString,"PASSWORD","java.lang.String");
                setOrThrow(this::setAppId,json::getString,"APP_ID","java.lang.String");
                setOrThrow(this::setActive,json::getBoolean,"ACTIVE","java.lang.Boolean");
                setOrThrow(this::setSigma,json::getString,"SIGMA","java.lang.String");
                setOrThrow(this::setMetadata,json::getString,"METADATA","java.lang.String");
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
                json.put("IP_V4",getIpV4());
                json.put("IP_V6",getIpV6());
                json.put("HOSTNAME",getHostname());
                json.put("PORT",getPort());
                json.put("CATEGORY",getCategory());
                json.put("DRIVER_CLASS_NAME",getDriverClassName());
                json.put("JDBC_URL",getJdbcUrl());
                json.put("JDBC_CONFIG",getJdbcConfig());
                json.put("INSTANCE",getInstance());
                json.put("USERNAME",getUsername());
                json.put("PASSWORD",getPassword());
                json.put("APP_ID",getAppId());
                json.put("ACTIVE",getActive());
                json.put("SIGMA",getSigma());
                json.put("METADATA",getMetadata());
                json.put("LANGUAGE",getLanguage());
                json.put("CREATED_AT",getCreatedAt()==null?null:getCreatedAt().toString());
                json.put("CREATED_BY",getCreatedBy());
                json.put("UPDATED_AT",getUpdatedAt()==null?null:getUpdatedAt().toString());
                json.put("UPDATED_BY",getUpdatedBy());
                return json;
        }

}
