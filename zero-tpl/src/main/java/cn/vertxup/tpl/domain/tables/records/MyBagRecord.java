/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.tpl.domain.tables.records;


import cn.vertxup.tpl.domain.tables.MyBag;
import cn.vertxup.tpl.domain.tables.interfaces.IMyBag;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MyBagRecord extends UpdatableRecordImpl<MyBagRecord> implements VertxPojo, Record15<String, String, String, String, Long, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String>, IMyBag {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>ZDB.MY_BAG.KEY</code>. 「key」- 个人应用主键
     */
    @Override
    public MyBagRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_BAG.KEY</code>. 「key」- 个人应用主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>ZDB.MY_BAG.BAG_ID</code>. 「bagId」- 个人包主键
     */
    @Override
    public MyBagRecord setBagId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_BAG.BAG_ID</code>. 「bagId」- 个人包主键
     */
    @Override
    public String getBagId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ZDB.MY_BAG.OWNER</code>. 「owner」- 拥有者ID，我的 / 角色级
     */
    @Override
    public MyBagRecord setOwner(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_BAG.OWNER</code>. 「owner」- 拥有者ID，我的 / 角色级
     */
    @Override
    public String getOwner() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ZDB.MY_BAG.OWNER_TYPE</code>. 「ownerType」- ROLE 角色，USER
     * 用户
     */
    @Override
    public MyBagRecord setOwnerType(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_BAG.OWNER_TYPE</code>. 「ownerType」- ROLE 角色，USER
     * 用户
     */
    @Override
    public String getOwnerType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ZDB.MY_BAG.UI_SORT</code>. 「uiSort」- 模块排序
     */
    @Override
    public MyBagRecord setUiSort(Long value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_BAG.UI_SORT</code>. 「uiSort」- 模块排序
     */
    @Override
    public Long getUiSort() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>ZDB.MY_BAG.TYPE</code>. 「type」- 类型（默认全站）
     */
    @Override
    public MyBagRecord setType(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_BAG.TYPE</code>. 「type」- 类型（默认全站）
     */
    @Override
    public String getType() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ZDB.MY_BAG.POSITION</code>. 「position」- 位置（默认左上）
     */
    @Override
    public MyBagRecord setPosition(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_BAG.POSITION</code>. 「position」- 位置（默认左上）
     */
    @Override
    public String getPosition() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ZDB.MY_BAG.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public MyBagRecord setActive(Boolean value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_BAG.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>ZDB.MY_BAG.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public MyBagRecord setSigma(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_BAG.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(8);
    }

    /**
     * Setter for <code>ZDB.MY_BAG.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public MyBagRecord setMetadata(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_BAG.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(9);
    }

    /**
     * Setter for <code>ZDB.MY_BAG.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public MyBagRecord setLanguage(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_BAG.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(10);
    }

    /**
     * Setter for <code>ZDB.MY_BAG.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public MyBagRecord setCreatedAt(LocalDateTime value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_BAG.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(11);
    }

    /**
     * Setter for <code>ZDB.MY_BAG.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public MyBagRecord setCreatedBy(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_BAG.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(12);
    }

    /**
     * Setter for <code>ZDB.MY_BAG.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public MyBagRecord setUpdatedAt(LocalDateTime value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_BAG.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(13);
    }

    /**
     * Setter for <code>ZDB.MY_BAG.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public MyBagRecord setUpdatedBy(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_BAG.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(14);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record15 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row15<String, String, String, String, Long, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    @Override
    public Row15<String, String, String, String, Long, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row15) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return MyBag.MY_BAG.KEY;
    }

    @Override
    public Field<String> field2() {
        return MyBag.MY_BAG.BAG_ID;
    }

    @Override
    public Field<String> field3() {
        return MyBag.MY_BAG.OWNER;
    }

    @Override
    public Field<String> field4() {
        return MyBag.MY_BAG.OWNER_TYPE;
    }

    @Override
    public Field<Long> field5() {
        return MyBag.MY_BAG.UI_SORT;
    }

    @Override
    public Field<String> field6() {
        return MyBag.MY_BAG.TYPE;
    }

    @Override
    public Field<String> field7() {
        return MyBag.MY_BAG.POSITION;
    }

    @Override
    public Field<Boolean> field8() {
        return MyBag.MY_BAG.ACTIVE;
    }

    @Override
    public Field<String> field9() {
        return MyBag.MY_BAG.SIGMA;
    }

    @Override
    public Field<String> field10() {
        return MyBag.MY_BAG.METADATA;
    }

    @Override
    public Field<String> field11() {
        return MyBag.MY_BAG.LANGUAGE;
    }

    @Override
    public Field<LocalDateTime> field12() {
        return MyBag.MY_BAG.CREATED_AT;
    }

    @Override
    public Field<String> field13() {
        return MyBag.MY_BAG.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field14() {
        return MyBag.MY_BAG.UPDATED_AT;
    }

    @Override
    public Field<String> field15() {
        return MyBag.MY_BAG.UPDATED_BY;
    }

    @Override
    public String component1() {
        return getKey();
    }

    @Override
    public String component2() {
        return getBagId();
    }

    @Override
    public String component3() {
        return getOwner();
    }

    @Override
    public String component4() {
        return getOwnerType();
    }

    @Override
    public Long component5() {
        return getUiSort();
    }

    @Override
    public String component6() {
        return getType();
    }

    @Override
    public String component7() {
        return getPosition();
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
        return getBagId();
    }

    @Override
    public String value3() {
        return getOwner();
    }

    @Override
    public String value4() {
        return getOwnerType();
    }

    @Override
    public Long value5() {
        return getUiSort();
    }

    @Override
    public String value6() {
        return getType();
    }

    @Override
    public String value7() {
        return getPosition();
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
    public MyBagRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public MyBagRecord value2(String value) {
        setBagId(value);
        return this;
    }

    @Override
    public MyBagRecord value3(String value) {
        setOwner(value);
        return this;
    }

    @Override
    public MyBagRecord value4(String value) {
        setOwnerType(value);
        return this;
    }

    @Override
    public MyBagRecord value5(Long value) {
        setUiSort(value);
        return this;
    }

    @Override
    public MyBagRecord value6(String value) {
        setType(value);
        return this;
    }

    @Override
    public MyBagRecord value7(String value) {
        setPosition(value);
        return this;
    }

    @Override
    public MyBagRecord value8(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public MyBagRecord value9(String value) {
        setSigma(value);
        return this;
    }

    @Override
    public MyBagRecord value10(String value) {
        setMetadata(value);
        return this;
    }

    @Override
    public MyBagRecord value11(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public MyBagRecord value12(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public MyBagRecord value13(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public MyBagRecord value14(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public MyBagRecord value15(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public MyBagRecord values(String value1, String value2, String value3, String value4, Long value5, String value6, String value7, Boolean value8, String value9, String value10, String value11, LocalDateTime value12, String value13, LocalDateTime value14, String value15) {
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

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IMyBag from) {
        setKey(from.getKey());
        setBagId(from.getBagId());
        setOwner(from.getOwner());
        setOwnerType(from.getOwnerType());
        setUiSort(from.getUiSort());
        setType(from.getType());
        setPosition(from.getPosition());
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
    public <E extends IMyBag> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MyBagRecord
     */
    public MyBagRecord() {
        super(MyBag.MY_BAG);
    }

    /**
     * Create a detached, initialised MyBagRecord
     */
    public MyBagRecord(String key, String bagId, String owner, String ownerType, Long uiSort, String type, String position, Boolean active, String sigma, String metadata, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(MyBag.MY_BAG);

        setKey(key);
        setBagId(bagId);
        setOwner(owner);
        setOwnerType(ownerType);
        setUiSort(uiSort);
        setType(type);
        setPosition(position);
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
     * Create a detached, initialised MyBagRecord
     */
    public MyBagRecord(cn.vertxup.tpl.domain.tables.pojos.MyBag value) {
        super(MyBag.MY_BAG);

        if (value != null) {
            setKey(value.getKey());
            setBagId(value.getBagId());
            setOwner(value.getOwner());
            setOwnerType(value.getOwnerType());
            setUiSort(value.getUiSort());
            setType(value.getType());
            setPosition(value.getPosition());
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

        public MyBagRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
