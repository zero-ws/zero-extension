/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.mbse.modulat.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;

import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.setOrThrow;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public interface IBWeb extends VertxPojo, Serializable {

    /**
     * Getter for <code>ZDB.B_WEB.KEY</code>. 「key」- 主键
     */
    public String getKey();

    /**
     * Setter for <code>ZDB.B_WEB.KEY</code>. 「key」- 主键
     */
    public IBWeb setKey(String value);

    /**
     * Getter for <code>ZDB.B_WEB.CODE</code>. 「code」- 系统内部编码
     */
    public String getCode();

    /**
     * Setter for <code>ZDB.B_WEB.CODE</code>. 「code」- 系统内部编码
     */
    public IBWeb setCode(String value);

    /**
     * Getter for <code>ZDB.B_WEB.BLOCK_ID</code>. 「blockId」- 所属模块ID
     */
    public String getBlockId();

    /**
     * Setter for <code>ZDB.B_WEB.BLOCK_ID</code>. 「blockId」- 所属模块ID
     */
    public IBWeb setBlockId(String value);

    /**
     * Getter for <code>ZDB.B_WEB.TYPE</code>. 「type」- 类型保留，单独区分
     */
    public String getType();

    /**
     * Setter for <code>ZDB.B_WEB.TYPE</code>. 「type」- 类型保留，单独区分
     */
    public IBWeb setType(String value);

    /**
     * Getter for <code>ZDB.B_WEB.LIC_CONTENT</code>. 「licContent」- 内容编码
     */
    public String getLicContent();

    /**
     * Setter for <code>ZDB.B_WEB.LIC_CONTENT</code>. 「licContent」- 内容编码
     */
    public IBWeb setLicContent(String value);

    /**
     * Getter for <code>ZDB.B_WEB.LIC_OP</code>. 「licOp」- 界面操作
     */
    public String getLicOp();

    /**
     * Setter for <code>ZDB.B_WEB.LIC_OP</code>. 「licOp」- 界面操作
     */
    public IBWeb setLicOp(String value);

    /**
     * Getter for <code>ZDB.B_WEB.LIC_MODULE</code>. 「licModule」- 单独指定 X_MODULE
     * 中的记录
     */
    public String getLicModule();

    /**
     * Setter for <code>ZDB.B_WEB.LIC_MODULE</code>. 「licModule」- 单独指定 X_MODULE
     * 中的记录
     */
    public IBWeb setLicModule(String value);

    /**
     * Getter for <code>ZDB.B_WEB.LIC_TPL</code>. 「licTpl」- PAGE, LAYOUT,
     * CONTROL 等记录
     */
    public String getLicTpl();

    /**
     * Setter for <code>ZDB.B_WEB.LIC_TPL</code>. 「licTpl」- PAGE, LAYOUT,
     * CONTROL 等记录
     */
    public IBWeb setLicTpl(String value);

    /**
     * Getter for <code>ZDB.B_WEB.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>ZDB.B_WEB.ACTIVE</code>. 「active」- 是否启用
     */
    public IBWeb setActive(Boolean value);

    /**
     * Getter for <code>ZDB.B_WEB.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>ZDB.B_WEB.SIGMA</code>. 「sigma」- 统一标识
     */
    public IBWeb setSigma(String value);

    /**
     * Getter for <code>ZDB.B_WEB.METADATA</code>. 「metadata」- 附加配置
     */
    public String getMetadata();

    /**
     * Setter for <code>ZDB.B_WEB.METADATA</code>. 「metadata」- 附加配置
     */
    public IBWeb setMetadata(String value);

    /**
     * Getter for <code>ZDB.B_WEB.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>ZDB.B_WEB.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IBWeb setLanguage(String value);

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IBWeb
     */
    public void from(IBWeb from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IBWeb
     */
    public <E extends IBWeb> E into(E into);

    @Override
    public default IBWeb fromJson(io.vertx.core.json.JsonObject json) {
        setOrThrow(this::setKey, json::getString, "KEY", "java.lang.String");
        setOrThrow(this::setCode, json::getString, "CODE", "java.lang.String");
        setOrThrow(this::setBlockId, json::getString, "BLOCK_ID", "java.lang.String");
        setOrThrow(this::setType, json::getString, "TYPE", "java.lang.String");
        setOrThrow(this::setLicContent, json::getString, "LIC_CONTENT", "java.lang.String");
        setOrThrow(this::setLicOp, json::getString, "LIC_OP", "java.lang.String");
        setOrThrow(this::setLicModule, json::getString, "LIC_MODULE", "java.lang.String");
        setOrThrow(this::setLicTpl, json::getString, "LIC_TPL", "java.lang.String");
        setOrThrow(this::setActive, json::getBoolean, "ACTIVE", "java.lang.Boolean");
        setOrThrow(this::setSigma, json::getString, "SIGMA", "java.lang.String");
        setOrThrow(this::setMetadata, json::getString, "METADATA", "java.lang.String");
        setOrThrow(this::setLanguage, json::getString, "LANGUAGE", "java.lang.String");
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("KEY", getKey());
        json.put("CODE", getCode());
        json.put("BLOCK_ID", getBlockId());
        json.put("TYPE", getType());
        json.put("LIC_CONTENT", getLicContent());
        json.put("LIC_OP", getLicOp());
        json.put("LIC_MODULE", getLicModule());
        json.put("LIC_TPL", getLicTpl());
        json.put("ACTIVE", getActive());
        json.put("SIGMA", getSigma());
        json.put("METADATA", getMetadata());
        json.put("LANGUAGE", getLanguage());
        return json;
    }

}