/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.rbac.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ISVisitant extends VertxPojo, Serializable {

    /**
     * Setter for <code>ZDB.S_VISITANT.KEY</code>. 「key」- 限定记录ID
     */
    public ISVisitant setKey(String value);

    /**
     * Getter for <code>ZDB.S_VISITANT.KEY</code>. 「key」- 限定记录ID
     */
    public String getKey();

    /**
     * Setter for <code>ZDB.S_VISITANT.VIEW_ID</code>. 「viewId」- 视图访问者的读ID
     */
    public ISVisitant setViewId(String value);

    /**
     * Getter for <code>ZDB.S_VISITANT.VIEW_ID</code>. 「viewId」- 视图访问者的读ID
     */
    public String getViewId();

    /**
     * Setter for <code>ZDB.S_VISITANT.MODE</code>. 「mode」-
     * 模式，资源访问者继承于资源，可`替换/扩展`两种模式
     */
    public ISVisitant setMode(String value);

    /**
     * Getter for <code>ZDB.S_VISITANT.MODE</code>. 「mode」-
     * 模式，资源访问者继承于资源，可`替换/扩展`两种模式
     */
    public String getMode();

    /**
     * Setter for <code>ZDB.S_VISITANT.PHASE</code>. 「phase」- 作用周期
     */
    public ISVisitant setPhase(String value);

    /**
     * Getter for <code>ZDB.S_VISITANT.PHASE</code>. 「phase」- 作用周期
     */
    public String getPhase();

    /**
     * Setter for <code>ZDB.S_VISITANT.TYPE</code>. 「type」- 访问者类型
     */
    public ISVisitant setType(String value);

    /**
     * Getter for <code>ZDB.S_VISITANT.TYPE</code>. 「type」- 访问者类型
     */
    public String getType();

    /**
     * Setter for <code>ZDB.S_VISITANT.IDENTIFIER</code>. 「identifier」-
     * 动态类型中的模型ID
     */
    public ISVisitant setIdentifier(String value);

    /**
     * Getter for <code>ZDB.S_VISITANT.IDENTIFIER</code>. 「identifier」-
     * 动态类型中的模型ID
     */
    public String getIdentifier();

    /**
     * Setter for <code>ZDB.S_VISITANT.SEEK_KEY</code>. 「seekKey」- 资源检索的唯一键
     */
    public ISVisitant setSeekKey(String value);

    /**
     * Getter for <code>ZDB.S_VISITANT.SEEK_KEY</code>. 「seekKey」- 资源检索的唯一键
     */
    public String getSeekKey();

    /**
     * Setter for <code>ZDB.S_VISITANT.DM_ROW</code>. 「dmRow」对应视图中 Rows
     */
    public ISVisitant setDmRow(String value);

    /**
     * Getter for <code>ZDB.S_VISITANT.DM_ROW</code>. 「dmRow」对应视图中 Rows
     */
    public String getDmRow();

    /**
     * Setter for <code>ZDB.S_VISITANT.DM_QR</code>. 「dmQr」对应视图中的 Criteria
     */
    public ISVisitant setDmQr(String value);

    /**
     * Getter for <code>ZDB.S_VISITANT.DM_QR</code>. 「dmQr」对应视图中的 Criteria
     */
    public String getDmQr();

    /**
     * Setter for <code>ZDB.S_VISITANT.DM_COLUMN</code>. 「dmColumn」对应视图中的
     * Projection
     */
    public ISVisitant setDmColumn(String value);

    /**
     * Getter for <code>ZDB.S_VISITANT.DM_COLUMN</code>. 「dmColumn」对应视图中的
     * Projection
     */
    public String getDmColumn();

    /**
     * Setter for <code>ZDB.S_VISITANT.ACL_VISIBLE</code>. 「aclVisible」- 可见的属性集
     */
    public ISVisitant setAclVisible(String value);

    /**
     * Getter for <code>ZDB.S_VISITANT.ACL_VISIBLE</code>. 「aclVisible」- 可见的属性集
     */
    public String getAclVisible();

    /**
     * Setter for <code>ZDB.S_VISITANT.ACL_VIEW</code>. 「aclView」- 只读的属性集
     */
    public ISVisitant setAclView(String value);

    /**
     * Getter for <code>ZDB.S_VISITANT.ACL_VIEW</code>. 「aclView」- 只读的属性集
     */
    public String getAclView();

    /**
     * Setter for <code>ZDB.S_VISITANT.ACL_VARIETY</code>. 「aclVariety」-
     * 多样性的属性集，用于控制集合类型的属性
     */
    public ISVisitant setAclVariety(String value);

    /**
     * Getter for <code>ZDB.S_VISITANT.ACL_VARIETY</code>. 「aclVariety」-
     * 多样性的属性集，用于控制集合类型的属性
     */
    public String getAclVariety();

    /**
     * Setter for <code>ZDB.S_VISITANT.ACL_VOW</code>. 「aclVow」- 引用类属性集
     */
    public ISVisitant setAclVow(String value);

    /**
     * Getter for <code>ZDB.S_VISITANT.ACL_VOW</code>. 「aclVow」- 引用类属性集
     */
    public String getAclVow();

    /**
     * Setter for <code>ZDB.S_VISITANT.ACL_VERGE</code>. 「aclVerge」- 依赖属性集
     */
    public ISVisitant setAclVerge(String value);

    /**
     * Getter for <code>ZDB.S_VISITANT.ACL_VERGE</code>. 「aclVerge」- 依赖属性集
     */
    public String getAclVerge();

    /**
     * Setter for <code>ZDB.S_VISITANT.SIGMA</code>. 「sigma」- 用户组绑定的统一标识
     */
    public ISVisitant setSigma(String value);

    /**
     * Getter for <code>ZDB.S_VISITANT.SIGMA</code>. 「sigma」- 用户组绑定的统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>ZDB.S_VISITANT.LANGUAGE</code>. 「language」- 使用的语言
     */
    public ISVisitant setLanguage(String value);

    /**
     * Getter for <code>ZDB.S_VISITANT.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>ZDB.S_VISITANT.ACTIVE</code>. 「active」- 是否启用
     */
    public ISVisitant setActive(Boolean value);

    /**
     * Getter for <code>ZDB.S_VISITANT.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>ZDB.S_VISITANT.METADATA</code>. 「metadata」- 附加配置数据
     */
    public ISVisitant setMetadata(String value);

    /**
     * Getter for <code>ZDB.S_VISITANT.METADATA</code>. 「metadata」- 附加配置数据
     */
    public String getMetadata();

    /**
     * Setter for <code>ZDB.S_VISITANT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public ISVisitant setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.S_VISITANT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>ZDB.S_VISITANT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public ISVisitant setCreatedBy(String value);

    /**
     * Getter for <code>ZDB.S_VISITANT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>ZDB.S_VISITANT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public ISVisitant setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.S_VISITANT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>ZDB.S_VISITANT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public ISVisitant setUpdatedBy(String value);

    /**
     * Getter for <code>ZDB.S_VISITANT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface ISVisitant
     */
    public void from(ISVisitant from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface ISVisitant
     */
    public <E extends ISVisitant> E into(E into);

        @Override
        public default ISVisitant fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setViewId,json::getString,"VIEW_ID","java.lang.String");
                setOrThrow(this::setMode,json::getString,"MODE","java.lang.String");
                setOrThrow(this::setPhase,json::getString,"PHASE","java.lang.String");
                setOrThrow(this::setType,json::getString,"TYPE","java.lang.String");
                setOrThrow(this::setIdentifier,json::getString,"IDENTIFIER","java.lang.String");
                setOrThrow(this::setSeekKey,json::getString,"SEEK_KEY","java.lang.String");
                setOrThrow(this::setDmRow,json::getString,"DM_ROW","java.lang.String");
                setOrThrow(this::setDmQr,json::getString,"DM_QR","java.lang.String");
                setOrThrow(this::setDmColumn,json::getString,"DM_COLUMN","java.lang.String");
                setOrThrow(this::setAclVisible,json::getString,"ACL_VISIBLE","java.lang.String");
                setOrThrow(this::setAclView,json::getString,"ACL_VIEW","java.lang.String");
                setOrThrow(this::setAclVariety,json::getString,"ACL_VARIETY","java.lang.String");
                setOrThrow(this::setAclVow,json::getString,"ACL_VOW","java.lang.String");
                setOrThrow(this::setAclVerge,json::getString,"ACL_VERGE","java.lang.String");
                setOrThrow(this::setSigma,json::getString,"SIGMA","java.lang.String");
                setOrThrow(this::setLanguage,json::getString,"LANGUAGE","java.lang.String");
                setOrThrow(this::setActive,json::getBoolean,"ACTIVE","java.lang.Boolean");
                setOrThrow(this::setMetadata,json::getString,"METADATA","java.lang.String");
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
                json.put("VIEW_ID",getViewId());
                json.put("MODE",getMode());
                json.put("PHASE",getPhase());
                json.put("TYPE",getType());
                json.put("IDENTIFIER",getIdentifier());
                json.put("SEEK_KEY",getSeekKey());
                json.put("DM_ROW",getDmRow());
                json.put("DM_QR",getDmQr());
                json.put("DM_COLUMN",getDmColumn());
                json.put("ACL_VISIBLE",getAclVisible());
                json.put("ACL_VIEW",getAclView());
                json.put("ACL_VARIETY",getAclVariety());
                json.put("ACL_VOW",getAclVow());
                json.put("ACL_VERGE",getAclVerge());
                json.put("SIGMA",getSigma());
                json.put("LANGUAGE",getLanguage());
                json.put("ACTIVE",getActive());
                json.put("METADATA",getMetadata());
                json.put("CREATED_AT",getCreatedAt()==null?null:getCreatedAt().toString());
                json.put("CREATED_BY",getCreatedBy());
                json.put("UPDATED_AT",getUpdatedAt()==null?null:getUpdatedAt().toString());
                json.put("UPDATED_BY",getUpdatedBy());
                return json;
        }

}
