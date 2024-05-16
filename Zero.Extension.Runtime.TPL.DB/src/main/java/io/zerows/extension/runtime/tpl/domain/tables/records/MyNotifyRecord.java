/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.runtime.tpl.domain.tables.records;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.zerows.extension.runtime.tpl.domain.tables.MyNotify;
import io.zerows.extension.runtime.tpl.domain.tables.interfaces.IMyNotify;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
import org.jooq.impl.UpdatableRecordImpl;

import java.time.LocalDateTime;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class MyNotifyRecord extends UpdatableRecordImpl<MyNotifyRecord> implements VertxPojo, Record15<String, String, String, String, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String>, IMyNotify {

    private static final long serialVersionUID = 1L;

    /**
     * Create a detached MyNotifyRecord
     */
    public MyNotifyRecord() {
        super(MyNotify.MY_NOTIFY);
    }

    /**
     * Create a detached, initialised MyNotifyRecord
     */
    public MyNotifyRecord(String key, String ownerType, String ownerId, String configInternal, String configEmail, String configSms, String appId, Boolean active, String sigma, String metadata, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(MyNotify.MY_NOTIFY);

        setKey(key);
        setOwnerType(ownerType);
        setOwnerId(ownerId);
        setConfigInternal(configInternal);
        setConfigEmail(configEmail);
        setConfigSms(configSms);
        setAppId(appId);
        setActive(active);
        setSigma(sigma);
        setMetadata(metadata);
        setLanguage(language);
        setCreatedAt(createdAt);
        setCreatedBy(createdBy);
        setUpdatedAt(updatedAt);
        setUpdatedBy(updatedBy);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised MyNotifyRecord
     */
    public MyNotifyRecord(io.zerows.extension.runtime.tpl.domain.tables.pojos.MyNotify value) {
        super(MyNotify.MY_NOTIFY);

        if (value != null) {
            setKey(value.getKey());
            setOwnerType(value.getOwnerType());
            setOwnerId(value.getOwnerId());
            setConfigInternal(value.getConfigInternal());
            setConfigEmail(value.getConfigEmail());
            setConfigSms(value.getConfigSms());
            setAppId(value.getAppId());
            setActive(value.getActive());
            setSigma(value.getSigma());
            setMetadata(value.getMetadata());
            setLanguage(value.getLanguage());
            setCreatedAt(value.getCreatedAt());
            setCreatedBy(value.getCreatedBy());
            setUpdatedAt(value.getUpdatedAt());
            setUpdatedBy(value.getUpdatedBy());
            resetChangedOnNotNull();
        }
    }

    public MyNotifyRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    /**
     * Getter for <code>ZDB.MY_NOTIFY.KEY</code>. 「key」- 设置主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>ZDB.MY_NOTIFY.KEY</code>. 「key」- 设置主键
     */
    @Override
    public MyNotifyRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_NOTIFY.OWNER_TYPE</code>. 「ownerType」- 拥有者类型
     */
    @Override
    public String getOwnerType() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ZDB.MY_NOTIFY.OWNER_TYPE</code>. 「ownerType」- 拥有者类型
     */
    @Override
    public MyNotifyRecord setOwnerType(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_NOTIFY.OWNER_ID</code>. 「ownerId」- 拥有者ID
     */
    @Override
    public String getOwnerId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ZDB.MY_NOTIFY.OWNER_ID</code>. 「ownerId」- 拥有者ID
     */
    @Override
    public MyNotifyRecord setOwnerId(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_NOTIFY.CONFIG_INTERNAL</code>. 「configInternal」-
     * 站内信配置
     */
    @Override
    public String getConfigInternal() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ZDB.MY_NOTIFY.CONFIG_INTERNAL</code>. 「configInternal」-
     * 站内信配置
     */
    @Override
    public MyNotifyRecord setConfigInternal(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_NOTIFY.CONFIG_EMAIL</code>. 「configEmail」- 邮件配置
     */
    @Override
    public String getConfigEmail() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ZDB.MY_NOTIFY.CONFIG_EMAIL</code>. 「configEmail」- 邮件配置
     */
    @Override
    public MyNotifyRecord setConfigEmail(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_NOTIFY.CONFIG_SMS</code>. 「configSms」- 短信配置
     */
    @Override
    public String getConfigSms() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ZDB.MY_NOTIFY.CONFIG_SMS</code>. 「configSms」- 短信配置
     */
    @Override
    public MyNotifyRecord setConfigSms(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_NOTIFY.APP_ID</code>. 「appId」- 所属应用ID
     */
    @Override
    public String getAppId() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ZDB.MY_NOTIFY.APP_ID</code>. 「appId」- 所属应用ID
     */
    @Override
    public MyNotifyRecord setAppId(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_NOTIFY.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>ZDB.MY_NOTIFY.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public MyNotifyRecord setActive(Boolean value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_NOTIFY.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(8);
    }

    /**
     * Setter for <code>ZDB.MY_NOTIFY.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public MyNotifyRecord setSigma(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_NOTIFY.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(9);
    }

    /**
     * Setter for <code>ZDB.MY_NOTIFY.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public MyNotifyRecord setMetadata(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_NOTIFY.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(10);
    }

    /**
     * Setter for <code>ZDB.MY_NOTIFY.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public MyNotifyRecord setLanguage(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_NOTIFY.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(11);
    }

    /**
     * Setter for <code>ZDB.MY_NOTIFY.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public MyNotifyRecord setCreatedAt(LocalDateTime value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_NOTIFY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(12);
    }

    /**
     * Setter for <code>ZDB.MY_NOTIFY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public MyNotifyRecord setCreatedBy(String value) {
        set(12, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>ZDB.MY_NOTIFY.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(13);
    }

    // -------------------------------------------------------------------------
    // Record15 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>ZDB.MY_NOTIFY.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public MyNotifyRecord setUpdatedAt(LocalDateTime value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_NOTIFY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(14);
    }

    /**
     * Setter for <code>ZDB.MY_NOTIFY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public MyNotifyRecord setUpdatedBy(String value) {
        set(14, value);
        return this;
    }

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    @Override
    public Row15<String, String, String, String, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    @Override
    public Row15<String, String, String, String, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row15) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return MyNotify.MY_NOTIFY.KEY;
    }

    @Override
    public Field<String> field2() {
        return MyNotify.MY_NOTIFY.OWNER_TYPE;
    }

    @Override
    public Field<String> field3() {
        return MyNotify.MY_NOTIFY.OWNER_ID;
    }

    @Override
    public Field<String> field4() {
        return MyNotify.MY_NOTIFY.CONFIG_INTERNAL;
    }

    @Override
    public Field<String> field5() {
        return MyNotify.MY_NOTIFY.CONFIG_EMAIL;
    }

    @Override
    public Field<String> field6() {
        return MyNotify.MY_NOTIFY.CONFIG_SMS;
    }

    @Override
    public Field<String> field7() {
        return MyNotify.MY_NOTIFY.APP_ID;
    }

    @Override
    public Field<Boolean> field8() {
        return MyNotify.MY_NOTIFY.ACTIVE;
    }

    @Override
    public Field<String> field9() {
        return MyNotify.MY_NOTIFY.SIGMA;
    }

    @Override
    public Field<String> field10() {
        return MyNotify.MY_NOTIFY.METADATA;
    }

    @Override
    public Field<String> field11() {
        return MyNotify.MY_NOTIFY.LANGUAGE;
    }

    @Override
    public Field<LocalDateTime> field12() {
        return MyNotify.MY_NOTIFY.CREATED_AT;
    }

    @Override
    public Field<String> field13() {
        return MyNotify.MY_NOTIFY.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field14() {
        return MyNotify.MY_NOTIFY.UPDATED_AT;
    }

    @Override
    public Field<String> field15() {
        return MyNotify.MY_NOTIFY.UPDATED_BY;
    }

    @Override
    public String component1() {
        return getKey();
    }

    @Override
    public String component2() {
        return getOwnerType();
    }

    @Override
    public String component3() {
        return getOwnerId();
    }

    @Override
    public String component4() {
        return getConfigInternal();
    }

    @Override
    public String component5() {
        return getConfigEmail();
    }

    @Override
    public String component6() {
        return getConfigSms();
    }

    @Override
    public String component7() {
        return getAppId();
    }

    @Override
    public Boolean component8() {
        return getActive();
    }

    @Override
    public String component9() {
        return getSigma();
    }

    @Override
    public String component10() {
        return getMetadata();
    }

    @Override
    public String component11() {
        return getLanguage();
    }

    @Override
    public LocalDateTime component12() {
        return getCreatedAt();
    }

    @Override
    public String component13() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component14() {
        return getUpdatedAt();
    }

    @Override
    public String component15() {
        return getUpdatedBy();
    }

    @Override
    public String value1() {
        return getKey();
    }

    @Override
    public String value2() {
        return getOwnerType();
    }

    @Override
    public String value3() {
        return getOwnerId();
    }

    @Override
    public String value4() {
        return getConfigInternal();
    }

    @Override
    public String value5() {
        return getConfigEmail();
    }

    @Override
    public String value6() {
        return getConfigSms();
    }

    @Override
    public String value7() {
        return getAppId();
    }

    @Override
    public Boolean value8() {
        return getActive();
    }

    @Override
    public String value9() {
        return getSigma();
    }

    @Override
    public String value10() {
        return getMetadata();
    }

    @Override
    public String value11() {
        return getLanguage();
    }

    @Override
    public LocalDateTime value12() {
        return getCreatedAt();
    }

    @Override
    public String value13() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value14() {
        return getUpdatedAt();
    }

    @Override
    public String value15() {
        return getUpdatedBy();
    }

    @Override
    public MyNotifyRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public MyNotifyRecord value2(String value) {
        setOwnerType(value);
        return this;
    }

    @Override
    public MyNotifyRecord value3(String value) {
        setOwnerId(value);
        return this;
    }

    @Override
    public MyNotifyRecord value4(String value) {
        setConfigInternal(value);
        return this;
    }

    @Override
    public MyNotifyRecord value5(String value) {
        setConfigEmail(value);
        return this;
    }

    @Override
    public MyNotifyRecord value6(String value) {
        setConfigSms(value);
        return this;
    }

    @Override
    public MyNotifyRecord value7(String value) {
        setAppId(value);
        return this;
    }

    @Override
    public MyNotifyRecord value8(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public MyNotifyRecord value9(String value) {
        setSigma(value);
        return this;
    }

    @Override
    public MyNotifyRecord value10(String value) {
        setMetadata(value);
        return this;
    }

    @Override
    public MyNotifyRecord value11(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public MyNotifyRecord value12(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public MyNotifyRecord value13(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public MyNotifyRecord value14(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    @Override
    public MyNotifyRecord value15(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public MyNotifyRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, Boolean value8, String value9, String value10, String value11, LocalDateTime value12, String value13, LocalDateTime value14, String value15) {
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
        return this;
    }

    @Override
    public void from(IMyNotify from) {
        setKey(from.getKey());
        setOwnerType(from.getOwnerType());
        setOwnerId(from.getOwnerId());
        setConfigInternal(from.getConfigInternal());
        setConfigEmail(from.getConfigEmail());
        setConfigSms(from.getConfigSms());
        setAppId(from.getAppId());
        setActive(from.getActive());
        setSigma(from.getSigma());
        setMetadata(from.getMetadata());
        setLanguage(from.getLanguage());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
        resetChangedOnNotNull();
    }

    @Override
    public <E extends IMyNotify> E into(E into) {
        into.from(this);
        return into;
    }
}