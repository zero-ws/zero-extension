/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.rbac.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IOUser extends VertxPojo, Serializable {

    /**
     * Setter for <code>ZDB.O_USER.KEY</code>. 「key」- OAuth用户ID
     */
    public IOUser setKey(String value);

    /**
     * Getter for <code>ZDB.O_USER.KEY</code>. 「key」- OAuth用户ID
     */
    public String getKey();

    /**
     * Setter for <code>ZDB.O_USER.REDIRECT_URI</code>. 「redirectUri」- 回调重定向地址
     */
    public IOUser setRedirectUri(String value);

    /**
     * Getter for <code>ZDB.O_USER.REDIRECT_URI</code>. 「redirectUri」- 回调重定向地址
     */
    public String getRedirectUri();

    /**
     * Setter for <code>ZDB.O_USER.CODE</code>. 「code」- 系统编号
     */
    public IOUser setCode(String value);

    /**
     * Getter for <code>ZDB.O_USER.CODE</code>. 「code」- 系统编号
     */
    public String getCode();

    /**
     * Setter for <code>ZDB.O_USER.CLIENT_SECRET</code>. 「clientSecret」- 客户端密钥
     */
    public IOUser setClientSecret(String value);

    /**
     * Getter for <code>ZDB.O_USER.CLIENT_SECRET</code>. 「clientSecret」- 客户端密钥
     */
    public String getClientSecret();

    /**
     * Setter for <code>ZDB.O_USER.CLIENT_ID</code>. 「clientId」- 客户端ID
     */
    public IOUser setClientId(String value);

    /**
     * Getter for <code>ZDB.O_USER.CLIENT_ID</code>. 「clientId」- 客户端ID
     */
    public String getClientId();

    /**
     * Setter for <code>ZDB.O_USER.GRANT_TYPE</code>. 「grantType」- 认证方式
     */
    public IOUser setGrantType(String value);

    /**
     * Getter for <code>ZDB.O_USER.GRANT_TYPE</code>. 「grantType」- 认证方式
     */
    public String getGrantType();

    /**
     * Setter for <code>ZDB.O_USER.SCOPE</code>. 「scope」- 对应名空间，以应用为中心
     */
    public IOUser setScope(String value);

    /**
     * Getter for <code>ZDB.O_USER.SCOPE</code>. 「scope」- 对应名空间，以应用为中心
     */
    public String getScope();

    /**
     * Setter for <code>ZDB.O_USER.STATE</code>. 「state」- 客户端状态
     */
    public IOUser setState(String value);

    /**
     * Getter for <code>ZDB.O_USER.STATE</code>. 「state」- 客户端状态
     */
    public String getState();

    /**
     * Setter for <code>ZDB.O_USER.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IOUser setLanguage(String value);

    /**
     * Getter for <code>ZDB.O_USER.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>ZDB.O_USER.ACTIVE</code>. 「active」- 是否启用
     */
    public IOUser setActive(Boolean value);

    /**
     * Getter for <code>ZDB.O_USER.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>ZDB.O_USER.METADATA</code>. 「metadata」- 附加配置数据
     */
    public IOUser setMetadata(String value);

    /**
     * Getter for <code>ZDB.O_USER.METADATA</code>. 「metadata」- 附加配置数据
     */
    public String getMetadata();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IOUser
     */
    public void from(IOUser from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IOUser
     */
    public <E extends IOUser> E into(E into);

        @Override
        public default IOUser fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setRedirectUri,json::getString,"REDIRECT_URI","java.lang.String");
                setOrThrow(this::setCode,json::getString,"CODE","java.lang.String");
                setOrThrow(this::setClientSecret,json::getString,"CLIENT_SECRET","java.lang.String");
                setOrThrow(this::setClientId,json::getString,"CLIENT_ID","java.lang.String");
                setOrThrow(this::setGrantType,json::getString,"GRANT_TYPE","java.lang.String");
                setOrThrow(this::setScope,json::getString,"SCOPE","java.lang.String");
                setOrThrow(this::setState,json::getString,"STATE","java.lang.String");
                setOrThrow(this::setLanguage,json::getString,"LANGUAGE","java.lang.String");
                setOrThrow(this::setActive,json::getBoolean,"ACTIVE","java.lang.Boolean");
                setOrThrow(this::setMetadata,json::getString,"METADATA","java.lang.String");
                return this;
        }


        @Override
        public default io.vertx.core.json.JsonObject toJson() {
                io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
                json.put("KEY",getKey());
                json.put("REDIRECT_URI",getRedirectUri());
                json.put("CODE",getCode());
                json.put("CLIENT_SECRET",getClientSecret());
                json.put("CLIENT_ID",getClientId());
                json.put("GRANT_TYPE",getGrantType());
                json.put("SCOPE",getScope());
                json.put("STATE",getState());
                json.put("LANGUAGE",getLanguage());
                json.put("ACTIVE",getActive());
                json.put("METADATA",getMetadata());
                return json;
        }

}
