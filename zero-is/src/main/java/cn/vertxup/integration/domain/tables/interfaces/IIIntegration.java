/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.integration.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IIIntegration extends VertxPojo, Serializable {

    /**
     * Setter for <code>ZDB.I_INTEGRATION.KEY</code>. 「key」- 集成配置主键
     */
    public IIIntegration setKey(String value);

    /**
     * Getter for <code>ZDB.I_INTEGRATION.KEY</code>. 「key」- 集成配置主键
     */
    public String getKey();

    /**
     * Setter for <code>ZDB.I_INTEGRATION.NAME</code>. 「name」- 集成名称
     */
    public IIIntegration setName(String value);

    /**
     * Getter for <code>ZDB.I_INTEGRATION.NAME</code>. 「name」- 集成名称
     */
    public String getName();

    /**
     * Setter for <code>ZDB.I_INTEGRATION.TYPE</code>. 「type」- 集成类型
     */
    public IIIntegration setType(String value);

    /**
     * Getter for <code>ZDB.I_INTEGRATION.TYPE</code>. 「type」- 集成类型
     */
    public String getType();

    /**
     * Setter for <code>ZDB.I_INTEGRATION.IP_V4</code>. 「ipV4」- IP v4地址
     */
    public IIIntegration setIpV4(String value);

    /**
     * Getter for <code>ZDB.I_INTEGRATION.IP_V4</code>. 「ipV4」- IP v4地址
     */
    public String getIpV4();

    /**
     * Setter for <code>ZDB.I_INTEGRATION.IP_V6</code>. 「ipV6」- IP v6地址
     */
    public IIIntegration setIpV6(String value);

    /**
     * Getter for <code>ZDB.I_INTEGRATION.IP_V6</code>. 「ipV6」- IP v6地址
     */
    public String getIpV6();

    /**
     * Setter for <code>ZDB.I_INTEGRATION.HOSTNAME</code>. 「hostname」- 主机地址
     */
    public IIIntegration setHostname(String value);

    /**
     * Getter for <code>ZDB.I_INTEGRATION.HOSTNAME</code>. 「hostname」- 主机地址
     */
    public String getHostname();

    /**
     * Setter for <code>ZDB.I_INTEGRATION.PORT</code>. 「port」- 端口号
     */
    public IIIntegration setPort(Integer value);

    /**
     * Getter for <code>ZDB.I_INTEGRATION.PORT</code>. 「port」- 端口号
     */
    public Integer getPort();

    /**
     * Setter for <code>ZDB.I_INTEGRATION.PROTOCOL</code>. 「protocol」-
     * 协议类型：HTTP, HTTPS, FTP
     */
    public IIIntegration setProtocol(String value);

    /**
     * Getter for <code>ZDB.I_INTEGRATION.PROTOCOL</code>. 「protocol」-
     * 协议类型：HTTP, HTTPS, FTP
     */
    public String getProtocol();

    /**
     * Setter for <code>ZDB.I_INTEGRATION.SECURE_PORT</code>. 「securePort」-
     * 传输层安全接口
     */
    public IIIntegration setSecurePort(Integer value);

    /**
     * Getter for <code>ZDB.I_INTEGRATION.SECURE_PORT</code>. 「securePort」-
     * 传输层安全接口
     */
    public Integer getSecurePort();

    /**
     * Setter for <code>ZDB.I_INTEGRATION.SECURE_PROTOCOL</code>.
     * 「secureProtocol」- 传入层协议：TLS / SSL（邮件服务器需要）
     */
    public IIIntegration setSecureProtocol(String value);

    /**
     * Getter for <code>ZDB.I_INTEGRATION.SECURE_PROTOCOL</code>.
     * 「secureProtocol」- 传入层协议：TLS / SSL（邮件服务器需要）
     */
    public String getSecureProtocol();

    /**
     * Setter for <code>ZDB.I_INTEGRATION.ENDPOINT</code>. 「endpoint」- 端地址
     */
    public IIIntegration setEndpoint(String value);

    /**
     * Getter for <code>ZDB.I_INTEGRATION.ENDPOINT</code>. 「endpoint」- 端地址
     */
    public String getEndpoint();

    /**
     * Setter for <code>ZDB.I_INTEGRATION.PATH</code>. 「path」- 集成专用根路径
     */
    public IIIntegration setPath(String value);

    /**
     * Getter for <code>ZDB.I_INTEGRATION.PATH</code>. 「path」- 集成专用根路径
     */
    public String getPath();

    /**
     * Setter for <code>ZDB.I_INTEGRATION.OS_KEY</code>. 「osKey」- 开源专用Key
     */
    public IIIntegration setOsKey(String value);

    /**
     * Getter for <code>ZDB.I_INTEGRATION.OS_KEY</code>. 「osKey」- 开源专用Key
     */
    public String getOsKey();

    /**
     * Setter for <code>ZDB.I_INTEGRATION.OS_SECRET</code>. 「osSecret」-
     * 开源专用Secret
     */
    public IIIntegration setOsSecret(String value);

    /**
     * Getter for <code>ZDB.I_INTEGRATION.OS_SECRET</code>. 「osSecret」-
     * 开源专用Secret
     */
    public String getOsSecret();

    /**
     * Setter for <code>ZDB.I_INTEGRATION.OS_AUTHORIZE</code>. 「osAuthorize」-
     * Authorize接口
     */
    public IIIntegration setOsAuthorize(String value);

    /**
     * Getter for <code>ZDB.I_INTEGRATION.OS_AUTHORIZE</code>. 「osAuthorize」-
     * Authorize接口
     */
    public String getOsAuthorize();

    /**
     * Setter for <code>ZDB.I_INTEGRATION.OS_TOKEN</code>. 「osToken」- Token接口
     */
    public IIIntegration setOsToken(String value);

    /**
     * Getter for <code>ZDB.I_INTEGRATION.OS_TOKEN</code>. 「osToken」- Token接口
     */
    public String getOsToken();

    /**
     * Setter for <code>ZDB.I_INTEGRATION.USERNAME</code>. 「username」- 账号
     */
    public IIIntegration setUsername(String value);

    /**
     * Getter for <code>ZDB.I_INTEGRATION.USERNAME</code>. 「username」- 账号
     */
    public String getUsername();

    /**
     * Setter for <code>ZDB.I_INTEGRATION.PASSWORD</code>. 「password」- 密码
     */
    public IIIntegration setPassword(String value);

    /**
     * Getter for <code>ZDB.I_INTEGRATION.PASSWORD</code>. 「password」- 密码
     */
    public String getPassword();

    /**
     * Setter for <code>ZDB.I_INTEGRATION.PUBLIC_KEY</code>. 「publicKey」- Key文件
     */
    public IIIntegration setPublicKey(String value);

    /**
     * Getter for <code>ZDB.I_INTEGRATION.PUBLIC_KEY</code>. 「publicKey」- Key文件
     */
    public String getPublicKey();

    /**
     * Setter for <code>ZDB.I_INTEGRATION.OPTIONS</code>. 「options」- 集成相关配置
     */
    public IIIntegration setOptions(String value);

    /**
     * Getter for <code>ZDB.I_INTEGRATION.OPTIONS</code>. 「options」- 集成相关配置
     */
    public String getOptions();

    /**
     * Setter for <code>ZDB.I_INTEGRATION.APP_ID</code>. 「appId」- 关联的应用程序ID
     */
    public IIIntegration setAppId(String value);

    /**
     * Getter for <code>ZDB.I_INTEGRATION.APP_ID</code>. 「appId」- 关联的应用程序ID
     */
    public String getAppId();

    /**
     * Setter for <code>ZDB.I_INTEGRATION.ACTIVE</code>. 「active」- 是否启用
     */
    public IIIntegration setActive(Boolean value);

    /**
     * Getter for <code>ZDB.I_INTEGRATION.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>ZDB.I_INTEGRATION.SIGMA</code>. 「sigma」- 统一标识
     */
    public IIIntegration setSigma(String value);

    /**
     * Getter for <code>ZDB.I_INTEGRATION.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>ZDB.I_INTEGRATION.METADATA</code>. 「metadata」- 附加配置
     */
    public IIIntegration setMetadata(String value);

    /**
     * Getter for <code>ZDB.I_INTEGRATION.METADATA</code>. 「metadata」- 附加配置
     */
    public String getMetadata();

    /**
     * Setter for <code>ZDB.I_INTEGRATION.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IIIntegration setLanguage(String value);

    /**
     * Getter for <code>ZDB.I_INTEGRATION.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>ZDB.I_INTEGRATION.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IIIntegration setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.I_INTEGRATION.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>ZDB.I_INTEGRATION.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IIIntegration setCreatedBy(String value);

    /**
     * Getter for <code>ZDB.I_INTEGRATION.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>ZDB.I_INTEGRATION.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IIIntegration setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.I_INTEGRATION.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>ZDB.I_INTEGRATION.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IIIntegration setUpdatedBy(String value);

    /**
     * Getter for <code>ZDB.I_INTEGRATION.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IIIntegration
     */
    public void from(IIIntegration from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IIIntegration
     */
    public <E extends IIIntegration> E into(E into);

        @Override
        public default IIIntegration fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setName,json::getString,"NAME","java.lang.String");
                setOrThrow(this::setType,json::getString,"TYPE","java.lang.String");
                setOrThrow(this::setIpV4,json::getString,"IP_V4","java.lang.String");
                setOrThrow(this::setIpV6,json::getString,"IP_V6","java.lang.String");
                setOrThrow(this::setHostname,json::getString,"HOSTNAME","java.lang.String");
                setOrThrow(this::setPort,json::getInteger,"PORT","java.lang.Integer");
                setOrThrow(this::setProtocol,json::getString,"PROTOCOL","java.lang.String");
                setOrThrow(this::setSecurePort,json::getInteger,"SECURE_PORT","java.lang.Integer");
                setOrThrow(this::setSecureProtocol,json::getString,"SECURE_PROTOCOL","java.lang.String");
                setOrThrow(this::setEndpoint,json::getString,"ENDPOINT","java.lang.String");
                setOrThrow(this::setPath,json::getString,"PATH","java.lang.String");
                setOrThrow(this::setOsKey,json::getString,"OS_KEY","java.lang.String");
                setOrThrow(this::setOsSecret,json::getString,"OS_SECRET","java.lang.String");
                setOrThrow(this::setOsAuthorize,json::getString,"OS_AUTHORIZE","java.lang.String");
                setOrThrow(this::setOsToken,json::getString,"OS_TOKEN","java.lang.String");
                setOrThrow(this::setUsername,json::getString,"USERNAME","java.lang.String");
                setOrThrow(this::setPassword,json::getString,"PASSWORD","java.lang.String");
                setOrThrow(this::setPublicKey,json::getString,"PUBLIC_KEY","java.lang.String");
                setOrThrow(this::setOptions,json::getString,"OPTIONS","java.lang.String");
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
                json.put("NAME",getName());
                json.put("TYPE",getType());
                json.put("IP_V4",getIpV4());
                json.put("IP_V6",getIpV6());
                json.put("HOSTNAME",getHostname());
                json.put("PORT",getPort());
                json.put("PROTOCOL",getProtocol());
                json.put("SECURE_PORT",getSecurePort());
                json.put("SECURE_PROTOCOL",getSecureProtocol());
                json.put("ENDPOINT",getEndpoint());
                json.put("PATH",getPath());
                json.put("OS_KEY",getOsKey());
                json.put("OS_SECRET",getOsSecret());
                json.put("OS_AUTHORIZE",getOsAuthorize());
                json.put("OS_TOKEN",getOsToken());
                json.put("USERNAME",getUsername());
                json.put("PASSWORD",getPassword());
                json.put("PUBLIC_KEY",getPublicKey());
                json.put("OPTIONS",getOptions());
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
