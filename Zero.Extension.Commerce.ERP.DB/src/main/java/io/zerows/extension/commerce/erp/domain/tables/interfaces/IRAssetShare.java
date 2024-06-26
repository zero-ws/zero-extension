/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.erp.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;

import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.setOrThrow;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public interface IRAssetShare extends VertxPojo, Serializable {

    /**
     * Getter for <code>ZDB.R_ASSET_SHARE.ASSET_ID</code>. 「assetId」- 资产ID
     */
    public String getAssetId();

    /**
     * Setter for <code>ZDB.R_ASSET_SHARE.ASSET_ID</code>. 「assetId」- 资产ID
     */
    public IRAssetShare setAssetId(String value);

    /**
     * Getter for <code>ZDB.R_ASSET_SHARE.ENTITY_TYPE</code>. 「entityType」- 关联类型
     */
    public String getEntityType();

    /**
     * Setter for <code>ZDB.R_ASSET_SHARE.ENTITY_TYPE</code>. 「entityType」- 关联类型
     */
    public IRAssetShare setEntityType(String value);

    /**
     * Getter for <code>ZDB.R_ASSET_SHARE.ENTITY_ID</code>. 「entityId」- 关联实体ID
     */
    public String getEntityId();

    /**
     * Setter for <code>ZDB.R_ASSET_SHARE.ENTITY_ID</code>. 「entityId」- 关联实体ID
     */
    public IRAssetShare setEntityId(String value);

    /**
     * Getter for <code>ZDB.R_ASSET_SHARE.LINK_COMPONENT</code>.
     * 「linkComponent」- 关联执行组件（扩展用）
     */
    public String getLinkComponent();

    /**
     * Setter for <code>ZDB.R_ASSET_SHARE.LINK_COMPONENT</code>.
     * 「linkComponent」- 关联执行组件（扩展用）
     */
    public IRAssetShare setLinkComponent(String value);

    /**
     * Getter for <code>ZDB.R_ASSET_SHARE.COMMENT</code>. 「comment」- 关系备注
     */
    public String getComment();

    /**
     * Setter for <code>ZDB.R_ASSET_SHARE.COMMENT</code>. 「comment」- 关系备注
     */
    public IRAssetShare setComment(String value);

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IRAssetShare
     */
    public void from(IRAssetShare from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IRAssetShare
     */
    public <E extends IRAssetShare> E into(E into);

    @Override
    public default IRAssetShare fromJson(io.vertx.core.json.JsonObject json) {
        setOrThrow(this::setAssetId, json::getString, "ASSET_ID", "java.lang.String");
        setOrThrow(this::setEntityType, json::getString, "ENTITY_TYPE", "java.lang.String");
        setOrThrow(this::setEntityId, json::getString, "ENTITY_ID", "java.lang.String");
        setOrThrow(this::setLinkComponent, json::getString, "LINK_COMPONENT", "java.lang.String");
        setOrThrow(this::setComment, json::getString, "COMMENT", "java.lang.String");
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("ASSET_ID", getAssetId());
        json.put("ENTITY_TYPE", getEntityType());
        json.put("ENTITY_ID", getEntityId());
        json.put("LINK_COMPONENT", getLinkComponent());
        json.put("COMMENT", getComment());
        return json;
    }

}
