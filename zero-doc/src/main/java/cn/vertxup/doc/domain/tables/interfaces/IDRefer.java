/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.doc.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IDRefer extends VertxPojo, Serializable {

    /**
     * Setter for <code>ZDB.D_REFER.FROM_ID</code>. 「fromId」- 从ID
     */
    public IDRefer setFromId(String value);

    /**
     * Getter for <code>ZDB.D_REFER.FROM_ID</code>. 「fromId」- 从ID
     */
    public String getFromId();

    /**
     * Setter for <code>ZDB.D_REFER.FROM_TYPE</code>. 「fromType」- 从类型
     */
    public IDRefer setFromType(String value);

    /**
     * Getter for <code>ZDB.D_REFER.FROM_TYPE</code>. 「fromType」- 从类型
     */
    public String getFromType();

    /**
     * Setter for <code>ZDB.D_REFER.TO_ID</code>. 「toId」- 到ID
     */
    public IDRefer setToId(String value);

    /**
     * Getter for <code>ZDB.D_REFER.TO_ID</code>. 「toId」- 到ID
     */
    public String getToId();

    /**
     * Setter for <code>ZDB.D_REFER.TO_TYPE</code>. 「toType」- 到类型
     */
    public IDRefer setToType(String value);

    /**
     * Getter for <code>ZDB.D_REFER.TO_TYPE</code>. 「toType」- 到类型
     */
    public String getToType();

    /**
     * Setter for <code>ZDB.D_REFER.INLINE</code>. 「inline」- 是否内联
     */
    public IDRefer setInline(Boolean value);

    /**
     * Getter for <code>ZDB.D_REFER.INLINE</code>. 「inline」- 是否内联
     */
    public Boolean getInline();

    /**
     * Setter for <code>ZDB.D_REFER.COMMENT</code>. 「comment」- 关系备注
     */
    public IDRefer setComment(String value);

    /**
     * Getter for <code>ZDB.D_REFER.COMMENT</code>. 「comment」- 关系备注
     */
    public String getComment();

    /**
     * Setter for <code>ZDB.D_REFER.REFER_COMPONENT</code>. 「referComponent」-
     * 关联执行组件（扩展用）
     */
    public IDRefer setReferComponent(String value);

    /**
     * Getter for <code>ZDB.D_REFER.REFER_COMPONENT</code>. 「referComponent」-
     * 关联执行组件（扩展用）
     */
    public String getReferComponent();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IDRefer
     */
    public void from(IDRefer from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IDRefer
     */
    public <E extends IDRefer> E into(E into);

        @Override
        public default IDRefer fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setFromId,json::getString,"FROM_ID","java.lang.String");
                setOrThrow(this::setFromType,json::getString,"FROM_TYPE","java.lang.String");
                setOrThrow(this::setToId,json::getString,"TO_ID","java.lang.String");
                setOrThrow(this::setToType,json::getString,"TO_TYPE","java.lang.String");
                setOrThrow(this::setInline,json::getBoolean,"INLINE","java.lang.Boolean");
                setOrThrow(this::setComment,json::getString,"COMMENT","java.lang.String");
                setOrThrow(this::setReferComponent,json::getString,"REFER_COMPONENT","java.lang.String");
                return this;
        }


        @Override
        public default io.vertx.core.json.JsonObject toJson() {
                io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
                json.put("FROM_ID",getFromId());
                json.put("FROM_TYPE",getFromType());
                json.put("TO_ID",getToId());
                json.put("TO_TYPE",getToType());
                json.put("INLINE",getInline());
                json.put("COMMENT",getComment());
                json.put("REFER_COMPONENT",getReferComponent());
                return json;
        }

}
