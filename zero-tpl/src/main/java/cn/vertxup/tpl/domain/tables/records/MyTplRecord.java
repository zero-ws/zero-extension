/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.tpl.domain.tables.records;


import cn.vertxup.tpl.domain.tables.MyTpl;
import cn.vertxup.tpl.domain.tables.interfaces.IMyTpl;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MyTplRecord extends UpdatableRecordImpl<MyTplRecord> implements VertxPojo, Record14<String, String, String, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String>, IMyTpl {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>ZDB.MY_TPL.KEY</code>. 「key」- 个人设置主键
     */
    @Override
    public MyTplRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_TPL.KEY</code>. 「key」- 个人设置主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>ZDB.MY_TPL.TPL_ID</code>. 「tplId」- 对应TPL的ID
     */
    @Override
    public MyTplRecord setTplId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_TPL.TPL_ID</code>. 「tplId」- 对应TPL的ID
     */
    @Override
    public String getTplId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ZDB.MY_TPL.TPL_TYPE</code>. 「tplType」- 对应TPL类型
     */
    @Override
    public MyTplRecord setTplType(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_TPL.TPL_TYPE</code>. 「tplType」- 对应TPL类型
     */
    @Override
    public String getTplType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ZDB.MY_TPL.OWNER</code>. 「owner」- 拥有者ID，我的 / 角色级
     */
    @Override
    public MyTplRecord setOwner(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_TPL.OWNER</code>. 「owner」- 拥有者ID，我的 / 角色级
     */
    @Override
    public String getOwner() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ZDB.MY_TPL.OWNER_TYPE</code>. 「ownerType」- ROLE 角色，USER
     * 用户
     */
    @Override
    public MyTplRecord setOwnerType(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_TPL.OWNER_TYPE</code>. 「ownerType」- ROLE 角色，USER
     * 用户
     */
    @Override
    public String getOwnerType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ZDB.MY_TPL.TYPE</code>. 「type」- 类型（默认全站）
     */
    @Override
    public MyTplRecord setType(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_TPL.TYPE</code>. 「type」- 类型（默认全站）
     */
    @Override
    public String getType() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ZDB.MY_TPL.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public MyTplRecord setActive(Boolean value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_TPL.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>ZDB.MY_TPL.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public MyTplRecord setSigma(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_TPL.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(7);
    }

    /**
     * Setter for <code>ZDB.MY_TPL.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public MyTplRecord setMetadata(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_TPL.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(8);
    }

    /**
     * Setter for <code>ZDB.MY_TPL.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public MyTplRecord setLanguage(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_TPL.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(9);
    }

    /**
     * Setter for <code>ZDB.MY_TPL.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public MyTplRecord setCreatedAt(LocalDateTime value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_TPL.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(10);
    }

    /**
     * Setter for <code>ZDB.MY_TPL.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public MyTplRecord setCreatedBy(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_TPL.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(11);
    }

    /**
     * Setter for <code>ZDB.MY_TPL.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public MyTplRecord setUpdatedAt(LocalDateTime value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_TPL.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(12);
    }

    /**
     * Setter for <code>ZDB.MY_TPL.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public MyTplRecord setUpdatedBy(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_TPL.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(13);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row14<String, String, String, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    @Override
    public Row14<String, String, String, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row14) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return MyTpl.MY_TPL.KEY;
    }

    @Override
    public Field<String> field2() {
        return MyTpl.MY_TPL.TPL_ID;
    }

    @Override
    public Field<String> field3() {
        return MyTpl.MY_TPL.TPL_TYPE;
    }

    @Override
    public Field<String> field4() {
        return MyTpl.MY_TPL.OWNER;
    }

    @Override
    public Field<String> field5() {
        return MyTpl.MY_TPL.OWNER_TYPE;
    }

    @Override
    public Field<String> field6() {
        return MyTpl.MY_TPL.TYPE;
    }

    @Override
    public Field<Boolean> field7() {
        return MyTpl.MY_TPL.ACTIVE;
    }

    @Override
    public Field<String> field8() {
        return MyTpl.MY_TPL.SIGMA;
    }

    @Override
    public Field<String> field9() {
        return MyTpl.MY_TPL.METADATA;
    }

    @Override
    public Field<String> field10() {
        return MyTpl.MY_TPL.LANGUAGE;
    }

    @Override
    public Field<LocalDateTime> field11() {
        return MyTpl.MY_TPL.CREATED_AT;
    }

    @Override
    public Field<String> field12() {
        return MyTpl.MY_TPL.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field13() {
        return MyTpl.MY_TPL.UPDATED_AT;
    }

    @Override
    public Field<String> field14() {
        return MyTpl.MY_TPL.UPDATED_BY;
    }

    @Override
    public String component1() {
        return getKey();
    }

    @Override
    public String component2() {
        return getTplId();
    }

    @Override
    public String component3() {
        return getTplType();
    }

    @Override
    public String component4() {
        return getOwner();
    }

    @Override
    public String component5() {
        return getOwnerType();
    }

    @Override
    public String component6() {
        return getType();
    }

    @Override
    public Boolean component7() {
        return getActive();
    }

    @Override
    public String component8() {
        return getSigma();
    }

    @Override
    public String component9() {
        return getMetadata();
    }

    @Override
    public String component10() {
        return getLanguage();
    }

    @Override
    public LocalDateTime component11() {
        return getCreatedAt();
    }

    @Override
    public String component12() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component13() {
        return getUpdatedAt();
    }

    @Override
    public String component14() {
        return getUpdatedBy();
    }

    @Override
    public String value1() {
        return getKey();
    }

    @Override
    public String value2() {
        return getTplId();
    }

    @Override
    public String value3() {
        return getTplType();
    }

    @Override
    public String value4() {
        return getOwner();
    }

    @Override
    public String value5() {
        return getOwnerType();
    }

    @Override
    public String value6() {
        return getType();
    }

    @Override
    public Boolean value7() {
        return getActive();
    }

    @Override
    public String value8() {
        return getSigma();
    }

    @Override
    public String value9() {
        return getMetadata();
    }

    @Override
    public String value10() {
        return getLanguage();
    }

    @Override
    public LocalDateTime value11() {
        return getCreatedAt();
    }

    @Override
    public String value12() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value13() {
        return getUpdatedAt();
    }

    @Override
    public String value14() {
        return getUpdatedBy();
    }

    @Override
    public MyTplRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public MyTplRecord value2(String value) {
        setTplId(value);
        return this;
    }

    @Override
    public MyTplRecord value3(String value) {
        setTplType(value);
        return this;
    }

    @Override
    public MyTplRecord value4(String value) {
        setOwner(value);
        return this;
    }

    @Override
    public MyTplRecord value5(String value) {
        setOwnerType(value);
        return this;
    }

    @Override
    public MyTplRecord value6(String value) {
        setType(value);
        return this;
    }

    @Override
    public MyTplRecord value7(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public MyTplRecord value8(String value) {
        setSigma(value);
        return this;
    }

    @Override
    public MyTplRecord value9(String value) {
        setMetadata(value);
        return this;
    }

    @Override
    public MyTplRecord value10(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public MyTplRecord value11(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public MyTplRecord value12(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public MyTplRecord value13(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public MyTplRecord value14(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public MyTplRecord values(String value1, String value2, String value3, String value4, String value5, String value6, Boolean value7, String value8, String value9, String value10, LocalDateTime value11, String value12, LocalDateTime value13, String value14) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IMyTpl from) {
        setKey(from.getKey());
        setTplId(from.getTplId());
        setTplType(from.getTplType());
        setOwner(from.getOwner());
        setOwnerType(from.getOwnerType());
        setType(from.getType());
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
    public <E extends IMyTpl> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MyTplRecord
     */
    public MyTplRecord() {
        super(MyTpl.MY_TPL);
    }

    /**
     * Create a detached, initialised MyTplRecord
     */
    public MyTplRecord(String key, String tplId, String tplType, String owner, String ownerType, String type, Boolean active, String sigma, String metadata, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(MyTpl.MY_TPL);

        setKey(key);
        setTplId(tplId);
        setTplType(tplType);
        setOwner(owner);
        setOwnerType(ownerType);
        setType(type);
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
     * Create a detached, initialised MyTplRecord
     */
    public MyTplRecord(cn.vertxup.tpl.domain.tables.pojos.MyTpl value) {
        super(MyTpl.MY_TPL);

        if (value != null) {
            setKey(value.getKey());
            setTplId(value.getTplId());
            setTplType(value.getTplType());
            setOwner(value.getOwner());
            setOwnerType(value.getOwnerType());
            setType(value.getType());
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

        public MyTplRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
