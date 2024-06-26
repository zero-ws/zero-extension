/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.runtime.ambient.domain.tables.records;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.zerows.extension.runtime.ambient.domain.tables.RTagObject;
import io.zerows.extension.runtime.ambient.domain.tables.interfaces.IRTagObject;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RTagObjectRecord extends UpdatableRecordImpl<RTagObjectRecord> implements VertxPojo, Record5<String, String, String, String, String>, IRTagObject {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>ZDB.R_TAG_OBJECT.TAG_ID</code>. 「tagId」- 标签ID
     */
    @Override
    public RTagObjectRecord setTagId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.R_TAG_OBJECT.TAG_ID</code>. 「tagId」- 标签ID
     */
    @Override
    public String getTagId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>ZDB.R_TAG_OBJECT.ENTITY_TYPE</code>. 「entityType」- 关联类型
     */
    @Override
    public RTagObjectRecord setEntityType(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.R_TAG_OBJECT.ENTITY_TYPE</code>. 「entityType」- 关联类型
     */
    @Override
    public String getEntityType() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ZDB.R_TAG_OBJECT.ENTITY_ID</code>. 「entityId」- 关联实体ID
     */
    @Override
    public RTagObjectRecord setEntityId(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.R_TAG_OBJECT.ENTITY_ID</code>. 「entityId」- 关联实体ID
     */
    @Override
    public String getEntityId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ZDB.R_TAG_OBJECT.LINK_COMPONENT</code>. 「linkComponent」-
     * 关联执行组件（扩展用）
     */
    @Override
    public RTagObjectRecord setLinkComponent(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.R_TAG_OBJECT.LINK_COMPONENT</code>. 「linkComponent」-
     * 关联执行组件（扩展用）
     */
    @Override
    public String getLinkComponent() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ZDB.R_TAG_OBJECT.COMMENT</code>. 「comment」- 关系备注
     */
    @Override
    public RTagObjectRecord setComment(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.R_TAG_OBJECT.COMMENT</code>. 「comment」- 关系备注
     */
    @Override
    public String getComment() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record3<String, String, String> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<String, String, String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return RTagObject.R_TAG_OBJECT.TAG_ID;
    }

    @Override
    public Field<String> field2() {
        return RTagObject.R_TAG_OBJECT.ENTITY_TYPE;
    }

    @Override
    public Field<String> field3() {
        return RTagObject.R_TAG_OBJECT.ENTITY_ID;
    }

    @Override
    public Field<String> field4() {
        return RTagObject.R_TAG_OBJECT.LINK_COMPONENT;
    }

    @Override
    public Field<String> field5() {
        return RTagObject.R_TAG_OBJECT.COMMENT;
    }

    @Override
    public String component1() {
        return getTagId();
    }

    @Override
    public String component2() {
        return getEntityType();
    }

    @Override
    public String component3() {
        return getEntityId();
    }

    @Override
    public String component4() {
        return getLinkComponent();
    }

    @Override
    public String component5() {
        return getComment();
    }

    @Override
    public String value1() {
        return getTagId();
    }

    @Override
    public String value2() {
        return getEntityType();
    }

    @Override
    public String value3() {
        return getEntityId();
    }

    @Override
    public String value4() {
        return getLinkComponent();
    }

    @Override
    public String value5() {
        return getComment();
    }

    @Override
    public RTagObjectRecord value1(String value) {
        setTagId(value);
        return this;
    }

    @Override
    public RTagObjectRecord value2(String value) {
        setEntityType(value);
        return this;
    }

    @Override
    public RTagObjectRecord value3(String value) {
        setEntityId(value);
        return this;
    }

    @Override
    public RTagObjectRecord value4(String value) {
        setLinkComponent(value);
        return this;
    }

    @Override
    public RTagObjectRecord value5(String value) {
        setComment(value);
        return this;
    }

    @Override
    public RTagObjectRecord values(String value1, String value2, String value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IRTagObject from) {
        setTagId(from.getTagId());
        setEntityType(from.getEntityType());
        setEntityId(from.getEntityId());
        setLinkComponent(from.getLinkComponent());
        setComment(from.getComment());
        resetChangedOnNotNull();
    }

    @Override
    public <E extends IRTagObject> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RTagObjectRecord
     */
    public RTagObjectRecord() {
        super(RTagObject.R_TAG_OBJECT);
    }

    /**
     * Create a detached, initialised RTagObjectRecord
     */
    public RTagObjectRecord(String tagId, String entityType, String entityId, String linkComponent, String comment) {
        super(RTagObject.R_TAG_OBJECT);

        setTagId(tagId);
        setEntityType(entityType);
        setEntityId(entityId);
        setLinkComponent(linkComponent);
        setComment(comment);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised RTagObjectRecord
     */
    public RTagObjectRecord(io.zerows.extension.runtime.ambient.domain.tables.pojos.RTagObject value) {
        super(RTagObject.R_TAG_OBJECT);

        if (value != null) {
            setTagId(value.getTagId());
            setEntityType(value.getEntityType());
            setEntityId(value.getEntityId());
            setLinkComponent(value.getLinkComponent());
            setComment(value.getComment());
            resetChangedOnNotNull();
        }
    }

        public RTagObjectRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
