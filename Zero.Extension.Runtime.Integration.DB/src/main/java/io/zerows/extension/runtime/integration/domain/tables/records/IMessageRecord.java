/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.runtime.integration.domain.tables.records;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.zerows.extension.runtime.integration.domain.tables.IMessage;
import io.zerows.extension.runtime.integration.domain.tables.interfaces.IIMessage;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record20;
import org.jooq.Row20;
import org.jooq.impl.UpdatableRecordImpl;

import java.time.LocalDateTime;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class IMessageRecord extends UpdatableRecordImpl<IMessageRecord> implements VertxPojo, Record20<String, String, String, String, String, String, String, String, String, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String>, IIMessage {

    private static final long serialVersionUID = 1L;

    /**
     * Create a detached IMessageRecord
     */
    public IMessageRecord() {
        super(IMessage.I_MESSAGE);
    }

    /**
     * Create a detached, initialised IMessageRecord
     */
    public IMessageRecord(String key, String name, String code, String type, String status, String subject, String content, String sendFrom, String sendTo, String sendBy, String sendAt, String appId, Boolean active, String sigma, String metadata, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(IMessage.I_MESSAGE);

        setKey(key);
        setName(name);
        setCode(code);
        setType(type);
        setStatus(status);
        setSubject(subject);
        setContent(content);
        setSendFrom(sendFrom);
        setSendTo(sendTo);
        setSendBy(sendBy);
        setSendAt(sendAt);
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
     * Create a detached, initialised IMessageRecord
     */
    public IMessageRecord(io.zerows.extension.runtime.integration.domain.tables.pojos.IMessage value) {
        super(IMessage.I_MESSAGE);

        if (value != null) {
            setKey(value.getKey());
            setName(value.getName());
            setCode(value.getCode());
            setType(value.getType());
            setStatus(value.getStatus());
            setSubject(value.getSubject());
            setContent(value.getContent());
            setSendFrom(value.getSendFrom());
            setSendTo(value.getSendTo());
            setSendBy(value.getSendBy());
            setSendAt(value.getSendAt());
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

    public IMessageRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    /**
     * Getter for <code>ZDB.I_MESSAGE.KEY</code>. 「key」- 消息主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>ZDB.I_MESSAGE.KEY</code>. 「key」- 消息主键
     */
    @Override
    public IMessageRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.I_MESSAGE.NAME</code>. 「name」- 消息名称
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ZDB.I_MESSAGE.NAME</code>. 「name」- 消息名称
     */
    @Override
    public IMessageRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.I_MESSAGE.CODE</code>. 「code」- 消息编码
     */
    @Override
    public String getCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ZDB.I_MESSAGE.CODE</code>. 「code」- 消息编码
     */
    @Override
    public IMessageRecord setCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.I_MESSAGE.TYPE</code>. 「type」- 消息类型
     */
    @Override
    public String getType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ZDB.I_MESSAGE.TYPE</code>. 「type」- 消息类型
     */
    @Override
    public IMessageRecord setType(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.I_MESSAGE.STATUS</code>. 「status」- 消息状态
     */
    @Override
    public String getStatus() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ZDB.I_MESSAGE.STATUS</code>. 「status」- 消息状态
     */
    @Override
    public IMessageRecord setStatus(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.I_MESSAGE.SUBJECT</code>. 「subject」- 消息标题
     */
    @Override
    public String getSubject() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ZDB.I_MESSAGE.SUBJECT</code>. 「subject」- 消息标题
     */
    @Override
    public IMessageRecord setSubject(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.I_MESSAGE.CONTENT</code>. 「content」- 消息内容
     */
    @Override
    public String getContent() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ZDB.I_MESSAGE.CONTENT</code>. 「content」- 消息内容
     */
    @Override
    public IMessageRecord setContent(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.I_MESSAGE.SEND_FROM</code>. 「from」- 消息发送方
     */
    @Override
    public String getSendFrom() {
        return (String) get(7);
    }

    /**
     * Setter for <code>ZDB.I_MESSAGE.SEND_FROM</code>. 「from」- 消息发送方
     */
    @Override
    public IMessageRecord setSendFrom(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.I_MESSAGE.SEND_TO</code>. 「to」- 消息接收方
     */
    @Override
    public String getSendTo() {
        return (String) get(8);
    }

    /**
     * Setter for <code>ZDB.I_MESSAGE.SEND_TO</code>. 「to」- 消息接收方
     */
    @Override
    public IMessageRecord setSendTo(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.I_MESSAGE.SEND_BY</code>. 「sendBy」- 发送者
     */
    @Override
    public String getSendBy() {
        return (String) get(9);
    }

    /**
     * Setter for <code>ZDB.I_MESSAGE.SEND_BY</code>. 「sendBy」- 发送者
     */
    @Override
    public IMessageRecord setSendBy(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.I_MESSAGE.SEND_AT</code>. 「sendAt」- 发送时间
     */
    @Override
    public String getSendAt() {
        return (String) get(10);
    }

    /**
     * Setter for <code>ZDB.I_MESSAGE.SEND_AT</code>. 「sendAt」- 发送时间
     */
    @Override
    public IMessageRecord setSendAt(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.I_MESSAGE.APP_ID</code>. 「appId」- 所属应用ID
     */
    @Override
    public String getAppId() {
        return (String) get(11);
    }

    /**
     * Setter for <code>ZDB.I_MESSAGE.APP_ID</code>. 「appId」- 所属应用ID
     */
    @Override
    public IMessageRecord setAppId(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.I_MESSAGE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(12);
    }

    /**
     * Setter for <code>ZDB.I_MESSAGE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public IMessageRecord setActive(Boolean value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.I_MESSAGE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(13);
    }

    /**
     * Setter for <code>ZDB.I_MESSAGE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public IMessageRecord setSigma(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.I_MESSAGE.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(14);
    }

    /**
     * Setter for <code>ZDB.I_MESSAGE.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public IMessageRecord setMetadata(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.I_MESSAGE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(15);
    }

    /**
     * Setter for <code>ZDB.I_MESSAGE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public IMessageRecord setLanguage(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.I_MESSAGE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(16);
    }

    /**
     * Setter for <code>ZDB.I_MESSAGE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public IMessageRecord setCreatedAt(LocalDateTime value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.I_MESSAGE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(17);
    }

    /**
     * Setter for <code>ZDB.I_MESSAGE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public IMessageRecord setCreatedBy(String value) {
        set(17, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>ZDB.I_MESSAGE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(18);
    }

    // -------------------------------------------------------------------------
    // Record20 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>ZDB.I_MESSAGE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public IMessageRecord setUpdatedAt(LocalDateTime value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.I_MESSAGE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(19);
    }

    /**
     * Setter for <code>ZDB.I_MESSAGE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public IMessageRecord setUpdatedBy(String value) {
        set(19, value);
        return this;
    }

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    @Override
    public Row20<String, String, String, String, String, String, String, String, String, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row20) super.fieldsRow();
    }

    @Override
    public Row20<String, String, String, String, String, String, String, String, String, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row20) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return IMessage.I_MESSAGE.KEY;
    }

    @Override
    public Field<String> field2() {
        return IMessage.I_MESSAGE.NAME;
    }

    @Override
    public Field<String> field3() {
        return IMessage.I_MESSAGE.CODE;
    }

    @Override
    public Field<String> field4() {
        return IMessage.I_MESSAGE.TYPE;
    }

    @Override
    public Field<String> field5() {
        return IMessage.I_MESSAGE.STATUS;
    }

    @Override
    public Field<String> field6() {
        return IMessage.I_MESSAGE.SUBJECT;
    }

    @Override
    public Field<String> field7() {
        return IMessage.I_MESSAGE.CONTENT;
    }

    @Override
    public Field<String> field8() {
        return IMessage.I_MESSAGE.SEND_FROM;
    }

    @Override
    public Field<String> field9() {
        return IMessage.I_MESSAGE.SEND_TO;
    }

    @Override
    public Field<String> field10() {
        return IMessage.I_MESSAGE.SEND_BY;
    }

    @Override
    public Field<String> field11() {
        return IMessage.I_MESSAGE.SEND_AT;
    }

    @Override
    public Field<String> field12() {
        return IMessage.I_MESSAGE.APP_ID;
    }

    @Override
    public Field<Boolean> field13() {
        return IMessage.I_MESSAGE.ACTIVE;
    }

    @Override
    public Field<String> field14() {
        return IMessage.I_MESSAGE.SIGMA;
    }

    @Override
    public Field<String> field15() {
        return IMessage.I_MESSAGE.METADATA;
    }

    @Override
    public Field<String> field16() {
        return IMessage.I_MESSAGE.LANGUAGE;
    }

    @Override
    public Field<LocalDateTime> field17() {
        return IMessage.I_MESSAGE.CREATED_AT;
    }

    @Override
    public Field<String> field18() {
        return IMessage.I_MESSAGE.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field19() {
        return IMessage.I_MESSAGE.UPDATED_AT;
    }

    @Override
    public Field<String> field20() {
        return IMessage.I_MESSAGE.UPDATED_BY;
    }

    @Override
    public String component1() {
        return getKey();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getCode();
    }

    @Override
    public String component4() {
        return getType();
    }

    @Override
    public String component5() {
        return getStatus();
    }

    @Override
    public String component6() {
        return getSubject();
    }

    @Override
    public String component7() {
        return getContent();
    }

    @Override
    public String component8() {
        return getSendFrom();
    }

    @Override
    public String component9() {
        return getSendTo();
    }

    @Override
    public String component10() {
        return getSendBy();
    }

    @Override
    public String component11() {
        return getSendAt();
    }

    @Override
    public String component12() {
        return getAppId();
    }

    @Override
    public Boolean component13() {
        return getActive();
    }

    @Override
    public String component14() {
        return getSigma();
    }

    @Override
    public String component15() {
        return getMetadata();
    }

    @Override
    public String component16() {
        return getLanguage();
    }

    @Override
    public LocalDateTime component17() {
        return getCreatedAt();
    }

    @Override
    public String component18() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component19() {
        return getUpdatedAt();
    }

    @Override
    public String component20() {
        return getUpdatedBy();
    }

    @Override
    public String value1() {
        return getKey();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getCode();
    }

    @Override
    public String value4() {
        return getType();
    }

    @Override
    public String value5() {
        return getStatus();
    }

    @Override
    public String value6() {
        return getSubject();
    }

    @Override
    public String value7() {
        return getContent();
    }

    @Override
    public String value8() {
        return getSendFrom();
    }

    @Override
    public String value9() {
        return getSendTo();
    }

    @Override
    public String value10() {
        return getSendBy();
    }

    @Override
    public String value11() {
        return getSendAt();
    }

    @Override
    public String value12() {
        return getAppId();
    }

    @Override
    public Boolean value13() {
        return getActive();
    }

    @Override
    public String value14() {
        return getSigma();
    }

    @Override
    public String value15() {
        return getMetadata();
    }

    @Override
    public String value16() {
        return getLanguage();
    }

    @Override
    public LocalDateTime value17() {
        return getCreatedAt();
    }

    @Override
    public String value18() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value19() {
        return getUpdatedAt();
    }

    @Override
    public String value20() {
        return getUpdatedBy();
    }

    @Override
    public IMessageRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public IMessageRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public IMessageRecord value3(String value) {
        setCode(value);
        return this;
    }

    @Override
    public IMessageRecord value4(String value) {
        setType(value);
        return this;
    }

    @Override
    public IMessageRecord value5(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public IMessageRecord value6(String value) {
        setSubject(value);
        return this;
    }

    @Override
    public IMessageRecord value7(String value) {
        setContent(value);
        return this;
    }

    @Override
    public IMessageRecord value8(String value) {
        setSendFrom(value);
        return this;
    }

    @Override
    public IMessageRecord value9(String value) {
        setSendTo(value);
        return this;
    }

    @Override
    public IMessageRecord value10(String value) {
        setSendBy(value);
        return this;
    }

    @Override
    public IMessageRecord value11(String value) {
        setSendAt(value);
        return this;
    }

    @Override
    public IMessageRecord value12(String value) {
        setAppId(value);
        return this;
    }

    @Override
    public IMessageRecord value13(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public IMessageRecord value14(String value) {
        setSigma(value);
        return this;
    }

    @Override
    public IMessageRecord value15(String value) {
        setMetadata(value);
        return this;
    }

    @Override
    public IMessageRecord value16(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public IMessageRecord value17(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public IMessageRecord value18(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public IMessageRecord value19(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    @Override
    public IMessageRecord value20(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public IMessageRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, Boolean value13, String value14, String value15, String value16, LocalDateTime value17, String value18, LocalDateTime value19, String value20) {
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
        value18(value18);
        value19(value19);
        value20(value20);
        return this;
    }

    @Override
    public void from(IIMessage from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setType(from.getType());
        setStatus(from.getStatus());
        setSubject(from.getSubject());
        setContent(from.getContent());
        setSendFrom(from.getSendFrom());
        setSendTo(from.getSendTo());
        setSendBy(from.getSendBy());
        setSendAt(from.getSendAt());
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
    public <E extends IIMessage> E into(E into) {
        into.from(this);
        return into;
    }
}