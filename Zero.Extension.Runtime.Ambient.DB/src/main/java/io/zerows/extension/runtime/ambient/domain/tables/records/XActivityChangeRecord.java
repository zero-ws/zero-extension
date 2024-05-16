/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.runtime.ambient.domain.tables.records;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.zerows.extension.runtime.ambient.domain.tables.XActivityChange;
import io.zerows.extension.runtime.ambient.domain.tables.interfaces.IXActivityChange;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record17;
import org.jooq.Row17;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XActivityChangeRecord extends UpdatableRecordImpl<XActivityChangeRecord> implements VertxPojo, Record17<String, String, String, String, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String>, IXActivityChange {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>ZDB.X_ACTIVITY_CHANGE.KEY</code>. 「key」- 操作行为主键
     */
    @Override
    public XActivityChangeRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY_CHANGE.KEY</code>. 「key」- 操作行为主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY_CHANGE.ACTIVITY_ID</code>. 「activityId」-
     * 关联的操作ID
     */
    @Override
    public XActivityChangeRecord setActivityId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY_CHANGE.ACTIVITY_ID</code>. 「activityId」-
     * 关联的操作ID
     */
    @Override
    public String getActivityId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY_CHANGE.TYPE</code>. 「type」- 字段变更类型：ADD |
     * DELETE | UPDATE 三种
     */
    @Override
    public XActivityChangeRecord setType(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY_CHANGE.TYPE</code>. 「type」- 字段变更类型：ADD |
     * DELETE | UPDATE 三种
     */
    @Override
    public String getType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY_CHANGE.STATUS</code>. 「status」-
     * 待确认变更状态：CONFIRMED | PENDING
     */
    @Override
    public XActivityChangeRecord setStatus(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY_CHANGE.STATUS</code>. 「status」-
     * 待确认变更状态：CONFIRMED | PENDING
     */
    @Override
    public String getStatus() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY_CHANGE.FIELD_NAME</code>. 「fieldName」-
     * 如果是变更记录则需要生成变更日志
     */
    @Override
    public XActivityChangeRecord setFieldName(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY_CHANGE.FIELD_NAME</code>. 「fieldName」-
     * 如果是变更记录则需要生成变更日志
     */
    @Override
    public String getFieldName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY_CHANGE.FIELD_ALIAS</code>. 「fieldAlias」-
     * 字段对应的别名
     */
    @Override
    public XActivityChangeRecord setFieldAlias(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY_CHANGE.FIELD_ALIAS</code>. 「fieldAlias」-
     * 字段对应的别名
     */
    @Override
    public String getFieldAlias() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY_CHANGE.FIELD_TYPE</code>. 「fieldType」-
     * 变更字段的数据类型，直接从模型定义中读取
     */
    @Override
    public XActivityChangeRecord setFieldType(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY_CHANGE.FIELD_TYPE</code>. 「fieldType」-
     * 变更字段的数据类型，直接从模型定义中读取
     */
    @Override
    public String getFieldType() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY_CHANGE.VALUE_OLD</code>. 「valueOld」- 旧值
     */
    @Override
    public XActivityChangeRecord setValueOld(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY_CHANGE.VALUE_OLD</code>. 「valueOld」- 旧值
     */
    @Override
    public String getValueOld() {
        return (String) get(7);
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY_CHANGE.VALUE_NEW</code>. 「valueNew」- 新值
     */
    @Override
    public XActivityChangeRecord setValueNew(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY_CHANGE.VALUE_NEW</code>. 「valueNew」- 新值
     */
    @Override
    public String getValueNew() {
        return (String) get(8);
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY_CHANGE.SIGMA</code>. 「sigma」- 用户组绑定的统一标识
     */
    @Override
    public XActivityChangeRecord setSigma(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY_CHANGE.SIGMA</code>. 「sigma」- 用户组绑定的统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(9);
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY_CHANGE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public XActivityChangeRecord setLanguage(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY_CHANGE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(10);
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY_CHANGE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public XActivityChangeRecord setActive(Boolean value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY_CHANGE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY_CHANGE.METADATA</code>. 「metadata」-
     * 附加配置数据
     */
    @Override
    public XActivityChangeRecord setMetadata(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY_CHANGE.METADATA</code>. 「metadata」-
     * 附加配置数据
     */
    @Override
    public String getMetadata() {
        return (String) get(12);
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY_CHANGE.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public XActivityChangeRecord setCreatedAt(LocalDateTime value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY_CHANGE.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(13);
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY_CHANGE.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    @Override
    public XActivityChangeRecord setCreatedBy(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY_CHANGE.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(14);
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY_CHANGE.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public XActivityChangeRecord setUpdatedAt(LocalDateTime value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY_CHANGE.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(15);
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY_CHANGE.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    @Override
    public XActivityChangeRecord setUpdatedBy(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY_CHANGE.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(16);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record17 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row17<String, String, String, String, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    @Override
    public Row17<String, String, String, String, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row17) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return XActivityChange.X_ACTIVITY_CHANGE.KEY;
    }

    @Override
    public Field<String> field2() {
        return XActivityChange.X_ACTIVITY_CHANGE.ACTIVITY_ID;
    }

    @Override
    public Field<String> field3() {
        return XActivityChange.X_ACTIVITY_CHANGE.TYPE;
    }

    @Override
    public Field<String> field4() {
        return XActivityChange.X_ACTIVITY_CHANGE.STATUS;
    }

    @Override
    public Field<String> field5() {
        return XActivityChange.X_ACTIVITY_CHANGE.FIELD_NAME;
    }

    @Override
    public Field<String> field6() {
        return XActivityChange.X_ACTIVITY_CHANGE.FIELD_ALIAS;
    }

    @Override
    public Field<String> field7() {
        return XActivityChange.X_ACTIVITY_CHANGE.FIELD_TYPE;
    }

    @Override
    public Field<String> field8() {
        return XActivityChange.X_ACTIVITY_CHANGE.VALUE_OLD;
    }

    @Override
    public Field<String> field9() {
        return XActivityChange.X_ACTIVITY_CHANGE.VALUE_NEW;
    }

    @Override
    public Field<String> field10() {
        return XActivityChange.X_ACTIVITY_CHANGE.SIGMA;
    }

    @Override
    public Field<String> field11() {
        return XActivityChange.X_ACTIVITY_CHANGE.LANGUAGE;
    }

    @Override
    public Field<Boolean> field12() {
        return XActivityChange.X_ACTIVITY_CHANGE.ACTIVE;
    }

    @Override
    public Field<String> field13() {
        return XActivityChange.X_ACTIVITY_CHANGE.METADATA;
    }

    @Override
    public Field<LocalDateTime> field14() {
        return XActivityChange.X_ACTIVITY_CHANGE.CREATED_AT;
    }

    @Override
    public Field<String> field15() {
        return XActivityChange.X_ACTIVITY_CHANGE.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field16() {
        return XActivityChange.X_ACTIVITY_CHANGE.UPDATED_AT;
    }

    @Override
    public Field<String> field17() {
        return XActivityChange.X_ACTIVITY_CHANGE.UPDATED_BY;
    }

    @Override
    public String component1() {
        return getKey();
    }

    @Override
    public String component2() {
        return getActivityId();
    }

    @Override
    public String component3() {
        return getType();
    }

    @Override
    public String component4() {
        return getStatus();
    }

    @Override
    public String component5() {
        return getFieldName();
    }

    @Override
    public String component6() {
        return getFieldAlias();
    }

    @Override
    public String component7() {
        return getFieldType();
    }

    @Override
    public String component8() {
        return getValueOld();
    }

    @Override
    public String component9() {
        return getValueNew();
    }

    @Override
    public String component10() {
        return getSigma();
    }

    @Override
    public String component11() {
        return getLanguage();
    }

    @Override
    public Boolean component12() {
        return getActive();
    }

    @Override
    public String component13() {
        return getMetadata();
    }

    @Override
    public LocalDateTime component14() {
        return getCreatedAt();
    }

    @Override
    public String component15() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component16() {
        return getUpdatedAt();
    }

    @Override
    public String component17() {
        return getUpdatedBy();
    }

    @Override
    public String value1() {
        return getKey();
    }

    @Override
    public String value2() {
        return getActivityId();
    }

    @Override
    public String value3() {
        return getType();
    }

    @Override
    public String value4() {
        return getStatus();
    }

    @Override
    public String value5() {
        return getFieldName();
    }

    @Override
    public String value6() {
        return getFieldAlias();
    }

    @Override
    public String value7() {
        return getFieldType();
    }

    @Override
    public String value8() {
        return getValueOld();
    }

    @Override
    public String value9() {
        return getValueNew();
    }

    @Override
    public String value10() {
        return getSigma();
    }

    @Override
    public String value11() {
        return getLanguage();
    }

    @Override
    public Boolean value12() {
        return getActive();
    }

    @Override
    public String value13() {
        return getMetadata();
    }

    @Override
    public LocalDateTime value14() {
        return getCreatedAt();
    }

    @Override
    public String value15() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value16() {
        return getUpdatedAt();
    }

    @Override
    public String value17() {
        return getUpdatedBy();
    }

    @Override
    public XActivityChangeRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public XActivityChangeRecord value2(String value) {
        setActivityId(value);
        return this;
    }

    @Override
    public XActivityChangeRecord value3(String value) {
        setType(value);
        return this;
    }

    @Override
    public XActivityChangeRecord value4(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public XActivityChangeRecord value5(String value) {
        setFieldName(value);
        return this;
    }

    @Override
    public XActivityChangeRecord value6(String value) {
        setFieldAlias(value);
        return this;
    }

    @Override
    public XActivityChangeRecord value7(String value) {
        setFieldType(value);
        return this;
    }

    @Override
    public XActivityChangeRecord value8(String value) {
        setValueOld(value);
        return this;
    }

    @Override
    public XActivityChangeRecord value9(String value) {
        setValueNew(value);
        return this;
    }

    @Override
    public XActivityChangeRecord value10(String value) {
        setSigma(value);
        return this;
    }

    @Override
    public XActivityChangeRecord value11(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public XActivityChangeRecord value12(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public XActivityChangeRecord value13(String value) {
        setMetadata(value);
        return this;
    }

    @Override
    public XActivityChangeRecord value14(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public XActivityChangeRecord value15(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public XActivityChangeRecord value16(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public XActivityChangeRecord value17(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public XActivityChangeRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, Boolean value12, String value13, LocalDateTime value14, String value15, LocalDateTime value16, String value17) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IXActivityChange from) {
        setKey(from.getKey());
        setActivityId(from.getActivityId());
        setType(from.getType());
        setStatus(from.getStatus());
        setFieldName(from.getFieldName());
        setFieldAlias(from.getFieldAlias());
        setFieldType(from.getFieldType());
        setValueOld(from.getValueOld());
        setValueNew(from.getValueNew());
        setSigma(from.getSigma());
        setLanguage(from.getLanguage());
        setActive(from.getActive());
        setMetadata(from.getMetadata());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
        resetChangedOnNotNull();
    }

    @Override
    public <E extends IXActivityChange> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached XActivityChangeRecord
     */
    public XActivityChangeRecord() {
        super(XActivityChange.X_ACTIVITY_CHANGE);
    }

    /**
     * Create a detached, initialised XActivityChangeRecord
     */
    public XActivityChangeRecord(String key, String activityId, String type, String status, String fieldName, String fieldAlias, String fieldType, String valueOld, String valueNew, String sigma, String language, Boolean active, String metadata, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(XActivityChange.X_ACTIVITY_CHANGE);

        setKey(key);
        setActivityId(activityId);
        setType(type);
        setStatus(status);
        setFieldName(fieldName);
        setFieldAlias(fieldAlias);
        setFieldType(fieldType);
        setValueOld(valueOld);
        setValueNew(valueNew);
        setSigma(sigma);
        setLanguage(language);
        setActive(active);
        setMetadata(metadata);
        setCreatedAt(createdAt);
        setCreatedBy(createdBy);
        setUpdatedAt(updatedAt);
        setUpdatedBy(updatedBy);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised XActivityChangeRecord
     */
    public XActivityChangeRecord(io.zerows.extension.runtime.ambient.domain.tables.pojos.XActivityChange value) {
        super(XActivityChange.X_ACTIVITY_CHANGE);

        if (value != null) {
            setKey(value.getKey());
            setActivityId(value.getActivityId());
            setType(value.getType());
            setStatus(value.getStatus());
            setFieldName(value.getFieldName());
            setFieldAlias(value.getFieldAlias());
            setFieldType(value.getFieldType());
            setValueOld(value.getValueOld());
            setValueNew(value.getValueNew());
            setSigma(value.getSigma());
            setLanguage(value.getLanguage());
            setActive(value.getActive());
            setMetadata(value.getMetadata());
            setCreatedAt(value.getCreatedAt());
            setCreatedBy(value.getCreatedBy());
            setUpdatedAt(value.getUpdatedAt());
            setUpdatedBy(value.getUpdatedBy());
            resetChangedOnNotNull();
        }
    }

        public XActivityChangeRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}