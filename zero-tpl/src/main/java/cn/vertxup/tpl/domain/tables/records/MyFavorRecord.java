/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.tpl.domain.tables.records;


import cn.vertxup.tpl.domain.tables.MyFavor;
import cn.vertxup.tpl.domain.tables.interfaces.IMyFavor;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record18;
import org.jooq.Row18;
import org.jooq.impl.UpdatableRecordImpl;

import java.time.LocalDateTime;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MyFavorRecord extends UpdatableRecordImpl<MyFavorRecord> implements VertxPojo, Record18<String, String, String, Long, String, String, String, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String>, IMyFavor {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>DB_ETERNAL.MY_FAVOR.KEY</code>. 「key」- 个人应用主键
     */
    @Override
    public MyFavorRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.MY_FAVOR.KEY</code>. 「key」- 个人应用主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.MY_FAVOR.OWNER</code>. 「owner」- 拥有者ID，我的 /
     * 角色级
     */
    @Override
    public MyFavorRecord setOwner(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.MY_FAVOR.OWNER</code>. 「owner」- 拥有者ID，我的 /
     * 角色级
     */
    @Override
    public String getOwner() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.MY_FAVOR.OWNER_TYPE</code>. 「ownerType」- ROLE
     * 角色，USER 用户
     */
    @Override
    public MyFavorRecord setOwnerType(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.MY_FAVOR.OWNER_TYPE</code>. 「ownerType」- ROLE
     * 角色，USER 用户
     */
    @Override
    public String getOwnerType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.MY_FAVOR.UI_SORT</code>. 「uiSort」- 模块排序
     */
    @Override
    public MyFavorRecord setUiSort(Long value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.MY_FAVOR.UI_SORT</code>. 「uiSort」- 模块排序
     */
    @Override
    public Long getUiSort() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.MY_FAVOR.TYPE</code>. 「type」- 类型（默认全站）
     */
    @Override
    public MyFavorRecord setType(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.MY_FAVOR.TYPE</code>. 「type」- 类型（默认全站）
     */
    @Override
    public String getType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.MY_FAVOR.POSITION</code>. 「position」-
     * 位置（默认左侧）
     */
    @Override
    public MyFavorRecord setPosition(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.MY_FAVOR.POSITION</code>. 「position」-
     * 位置（默认左侧）
     */
    @Override
    public String getPosition() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.MY_FAVOR.URI_KEY</code>. 「uriKey」- URI
     * KEY（加密长度）
     */
    @Override
    public MyFavorRecord setUriKey(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.MY_FAVOR.URI_KEY</code>. 「uriKey」- URI
     * KEY（加密长度）
     */
    @Override
    public String getUriKey() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.MY_FAVOR.URI_FULL</code>. 「uriFull」-
     * 收藏完整链接地址（带参数部分）
     */
    @Override
    public MyFavorRecord setUriFull(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.MY_FAVOR.URI_FULL</code>. 「uriFull」-
     * 收藏完整链接地址（带参数部分）
     */
    @Override
    public String getUriFull() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.MY_FAVOR.URI</code>. 「uri」- 收藏地址
     */
    @Override
    public MyFavorRecord setUri(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.MY_FAVOR.URI</code>. 「uri」- 收藏地址
     */
    @Override
    public String getUri() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.MY_FAVOR.URI_PARAM</code>. 「uriParam」-
     * 该收藏参数（收藏夹专用）
     */
    @Override
    public MyFavorRecord setUriParam(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.MY_FAVOR.URI_PARAM</code>. 「uriParam」-
     * 该收藏参数（收藏夹专用）
     */
    @Override
    public String getUriParam() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.MY_FAVOR.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public MyFavorRecord setActive(Boolean value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.MY_FAVOR.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.MY_FAVOR.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public MyFavorRecord setSigma(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.MY_FAVOR.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.MY_FAVOR.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public MyFavorRecord setMetadata(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.MY_FAVOR.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.MY_FAVOR.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public MyFavorRecord setLanguage(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.MY_FAVOR.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.MY_FAVOR.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public MyFavorRecord setCreatedAt(LocalDateTime value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.MY_FAVOR.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.MY_FAVOR.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public MyFavorRecord setCreatedBy(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.MY_FAVOR.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(15);
    }

    /**
     * Setter for <code>DB_ETERNAL.MY_FAVOR.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public MyFavorRecord setUpdatedAt(LocalDateTime value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.MY_FAVOR.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(16);
    }

    /**
     * Setter for <code>DB_ETERNAL.MY_FAVOR.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public MyFavorRecord setUpdatedBy(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.MY_FAVOR.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(17);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record18 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row18<String, String, String, Long, String, String, String, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    @Override
    public Row18<String, String, String, Long, String, String, String, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row18) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return MyFavor.MY_FAVOR.KEY;
    }

    @Override
    public Field<String> field2() {
        return MyFavor.MY_FAVOR.OWNER;
    }

    @Override
    public Field<String> field3() {
        return MyFavor.MY_FAVOR.OWNER_TYPE;
    }

    @Override
    public Field<Long> field4() {
        return MyFavor.MY_FAVOR.UI_SORT;
    }

    @Override
    public Field<String> field5() {
        return MyFavor.MY_FAVOR.TYPE;
    }

    @Override
    public Field<String> field6() {
        return MyFavor.MY_FAVOR.POSITION;
    }

    @Override
    public Field<String> field7() {
        return MyFavor.MY_FAVOR.URI_KEY;
    }

    @Override
    public Field<String> field8() {
        return MyFavor.MY_FAVOR.URI_FULL;
    }

    @Override
    public Field<String> field9() {
        return MyFavor.MY_FAVOR.URI;
    }

    @Override
    public Field<String> field10() {
        return MyFavor.MY_FAVOR.URI_PARAM;
    }

    @Override
    public Field<Boolean> field11() {
        return MyFavor.MY_FAVOR.ACTIVE;
    }

    @Override
    public Field<String> field12() {
        return MyFavor.MY_FAVOR.SIGMA;
    }

    @Override
    public Field<String> field13() {
        return MyFavor.MY_FAVOR.METADATA;
    }

    @Override
    public Field<String> field14() {
        return MyFavor.MY_FAVOR.LANGUAGE;
    }

    @Override
    public Field<LocalDateTime> field15() {
        return MyFavor.MY_FAVOR.CREATED_AT;
    }

    @Override
    public Field<String> field16() {
        return MyFavor.MY_FAVOR.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field17() {
        return MyFavor.MY_FAVOR.UPDATED_AT;
    }

    @Override
    public Field<String> field18() {
        return MyFavor.MY_FAVOR.UPDATED_BY;
    }

    @Override
    public String component1() {
        return getKey();
    }

    @Override
    public String component2() {
        return getOwner();
    }

    @Override
    public String component3() {
        return getOwnerType();
    }

    @Override
    public Long component4() {
        return getUiSort();
    }

    @Override
    public String component5() {
        return getType();
    }

    @Override
    public String component6() {
        return getPosition();
    }

    @Override
    public String component7() {
        return getUriKey();
    }

    @Override
    public String component8() {
        return getUriFull();
    }

    @Override
    public String component9() {
        return getUri();
    }

    @Override
    public String component10() {
        return getUriParam();
    }

    @Override
    public Boolean component11() {
        return getActive();
    }

    @Override
    public String component12() {
        return getSigma();
    }

    @Override
    public String component13() {
        return getMetadata();
    }

    @Override
    public String component14() {
        return getLanguage();
    }

    @Override
    public LocalDateTime component15() {
        return getCreatedAt();
    }

    @Override
    public String component16() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component17() {
        return getUpdatedAt();
    }

    @Override
    public String component18() {
        return getUpdatedBy();
    }

    @Override
    public String value1() {
        return getKey();
    }

    @Override
    public String value2() {
        return getOwner();
    }

    @Override
    public String value3() {
        return getOwnerType();
    }

    @Override
    public Long value4() {
        return getUiSort();
    }

    @Override
    public String value5() {
        return getType();
    }

    @Override
    public String value6() {
        return getPosition();
    }

    @Override
    public String value7() {
        return getUriKey();
    }

    @Override
    public String value8() {
        return getUriFull();
    }

    @Override
    public String value9() {
        return getUri();
    }

    @Override
    public String value10() {
        return getUriParam();
    }

    @Override
    public Boolean value11() {
        return getActive();
    }

    @Override
    public String value12() {
        return getSigma();
    }

    @Override
    public String value13() {
        return getMetadata();
    }

    @Override
    public String value14() {
        return getLanguage();
    }

    @Override
    public LocalDateTime value15() {
        return getCreatedAt();
    }

    @Override
    public String value16() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value17() {
        return getUpdatedAt();
    }

    @Override
    public String value18() {
        return getUpdatedBy();
    }

    @Override
    public MyFavorRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public MyFavorRecord value2(String value) {
        setOwner(value);
        return this;
    }

    @Override
    public MyFavorRecord value3(String value) {
        setOwnerType(value);
        return this;
    }

    @Override
    public MyFavorRecord value4(Long value) {
        setUiSort(value);
        return this;
    }

    @Override
    public MyFavorRecord value5(String value) {
        setType(value);
        return this;
    }

    @Override
    public MyFavorRecord value6(String value) {
        setPosition(value);
        return this;
    }

    @Override
    public MyFavorRecord value7(String value) {
        setUriKey(value);
        return this;
    }

    @Override
    public MyFavorRecord value8(String value) {
        setUriFull(value);
        return this;
    }

    @Override
    public MyFavorRecord value9(String value) {
        setUri(value);
        return this;
    }

    @Override
    public MyFavorRecord value10(String value) {
        setUriParam(value);
        return this;
    }

    @Override
    public MyFavorRecord value11(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public MyFavorRecord value12(String value) {
        setSigma(value);
        return this;
    }

    @Override
    public MyFavorRecord value13(String value) {
        setMetadata(value);
        return this;
    }

    @Override
    public MyFavorRecord value14(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public MyFavorRecord value15(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public MyFavorRecord value16(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public MyFavorRecord value17(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public MyFavorRecord value18(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public MyFavorRecord values(String value1, String value2, String value3, Long value4, String value5, String value6, String value7, String value8, String value9, String value10, Boolean value11, String value12, String value13, String value14, LocalDateTime value15, String value16, LocalDateTime value17, String value18) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IMyFavor from) {
        setKey(from.getKey());
        setOwner(from.getOwner());
        setOwnerType(from.getOwnerType());
        setUiSort(from.getUiSort());
        setType(from.getType());
        setPosition(from.getPosition());
        setUriKey(from.getUriKey());
        setUriFull(from.getUriFull());
        setUri(from.getUri());
        setUriParam(from.getUriParam());
        setActive(from.getActive());
        setSigma(from.getSigma());
        setMetadata(from.getMetadata());
        setLanguage(from.getLanguage());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    @Override
    public <E extends IMyFavor> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MyFavorRecord
     */
    public MyFavorRecord() {
        super(MyFavor.MY_FAVOR);
    }

    /**
     * Create a detached, initialised MyFavorRecord
     */
    public MyFavorRecord(String key, String owner, String ownerType, Long uiSort, String type, String position, String uriKey, String uriFull, String uri, String uriParam, Boolean active, String sigma, String metadata, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(MyFavor.MY_FAVOR);

        setKey(key);
        setOwner(owner);
        setOwnerType(ownerType);
        setUiSort(uiSort);
        setType(type);
        setPosition(position);
        setUriKey(uriKey);
        setUriFull(uriFull);
        setUri(uri);
        setUriParam(uriParam);
        setActive(active);
        setSigma(sigma);
        setMetadata(metadata);
        setLanguage(language);
        setCreatedAt(createdAt);
        setCreatedBy(createdBy);
        setUpdatedAt(updatedAt);
        setUpdatedBy(updatedBy);
    }

    /**
     * Create a detached, initialised MyFavorRecord
     */
    public MyFavorRecord(cn.vertxup.tpl.domain.tables.pojos.MyFavor value) {
        super(MyFavor.MY_FAVOR);

        if (value != null) {
            setKey(value.getKey());
            setOwner(value.getOwner());
            setOwnerType(value.getOwnerType());
            setUiSort(value.getUiSort());
            setType(value.getType());
            setPosition(value.getPosition());
            setUriKey(value.getUriKey());
            setUriFull(value.getUriFull());
            setUri(value.getUri());
            setUriParam(value.getUriParam());
            setActive(value.getActive());
            setSigma(value.getSigma());
            setMetadata(value.getMetadata());
            setLanguage(value.getLanguage());
            setCreatedAt(value.getCreatedAt());
            setCreatedBy(value.getCreatedBy());
            setUpdatedAt(value.getUpdatedAt());
            setUpdatedBy(value.getUpdatedBy());
        }
    }

        public MyFavorRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
