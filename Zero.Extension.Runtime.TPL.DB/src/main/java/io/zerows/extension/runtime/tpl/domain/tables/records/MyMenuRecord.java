/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.runtime.tpl.domain.tables.records;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.zerows.extension.runtime.tpl.domain.tables.MyMenu;
import io.zerows.extension.runtime.tpl.domain.tables.interfaces.IMyMenu;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record21;
import org.jooq.Row21;
import org.jooq.impl.UpdatableRecordImpl;

import java.time.LocalDateTime;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class MyMenuRecord extends UpdatableRecordImpl<MyMenuRecord> implements VertxPojo, Record21<String, String, String, String, Long, String, String, String, String, String, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String>, IMyMenu {

    private static final long serialVersionUID = 1L;

    /**
     * Create a detached MyMenuRecord
     */
    public MyMenuRecord() {
        super(MyMenu.MY_MENU);
    }

    /**
     * Create a detached, initialised MyMenuRecord
     */
    public MyMenuRecord(String key, String icon, String text, String uri, Long uiSort, String uiParent, String uiColorFg, String uiColorBg, String type, String page, String position, String owner, String ownerType, Boolean active, String sigma, String metadata, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(MyMenu.MY_MENU);

        setKey(key);
        setIcon(icon);
        setText(text);
        setUri(uri);
        setUiSort(uiSort);
        setUiParent(uiParent);
        setUiColorFg(uiColorFg);
        setUiColorBg(uiColorBg);
        setType(type);
        setPage(page);
        setPosition(position);
        setOwner(owner);
        setOwnerType(ownerType);
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
     * Create a detached, initialised MyMenuRecord
     */
    public MyMenuRecord(io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu value) {
        super(MyMenu.MY_MENU);

        if (value != null) {
            setKey(value.getKey());
            setIcon(value.getIcon());
            setText(value.getText());
            setUri(value.getUri());
            setUiSort(value.getUiSort());
            setUiParent(value.getUiParent());
            setUiColorFg(value.getUiColorFg());
            setUiColorBg(value.getUiColorBg());
            setType(value.getType());
            setPage(value.getPage());
            setPosition(value.getPosition());
            setOwner(value.getOwner());
            setOwnerType(value.getOwnerType());
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

    public MyMenuRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    /**
     * Getter for <code>ZDB.MY_MENU.KEY</code>. 「key」- 菜单主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>ZDB.MY_MENU.KEY</code>. 「key」- 菜单主键
     */
    @Override
    public MyMenuRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_MENU.ICON</code>. 「icon」- 菜单使用的icon
     */
    @Override
    public String getIcon() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ZDB.MY_MENU.ICON</code>. 「icon」- 菜单使用的icon
     */
    @Override
    public MyMenuRecord setIcon(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_MENU.TEXT</code>. 「text」- 菜单显示文字
     */
    @Override
    public String getText() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ZDB.MY_MENU.TEXT</code>. 「text」- 菜单显示文字
     */
    @Override
    public MyMenuRecord setText(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_MENU.URI</code>. 「uri」- 菜单地址（不包含应用的path）
     */
    @Override
    public String getUri() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ZDB.MY_MENU.URI</code>. 「uri」- 菜单地址（不包含应用的path）
     */
    @Override
    public MyMenuRecord setUri(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_MENU.UI_SORT</code>. 「uiSort」- 菜单排序
     */
    @Override
    public Long getUiSort() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>ZDB.MY_MENU.UI_SORT</code>. 「uiSort」- 菜单排序
     */
    @Override
    public MyMenuRecord setUiSort(Long value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_MENU.UI_PARENT</code>. 「uiParent」- 菜单父ID
     */
    @Override
    public String getUiParent() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ZDB.MY_MENU.UI_PARENT</code>. 「uiParent」- 菜单父ID
     */
    @Override
    public MyMenuRecord setUiParent(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_MENU.UI_COLOR_FG</code>. 「uiColorFg」- 前景色
     */
    @Override
    public String getUiColorFg() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ZDB.MY_MENU.UI_COLOR_FG</code>. 「uiColorFg」- 前景色
     */
    @Override
    public MyMenuRecord setUiColorFg(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_MENU.UI_COLOR_BG</code>. 「uiColorBg」- 背景色
     */
    @Override
    public String getUiColorBg() {
        return (String) get(7);
    }

    /**
     * Setter for <code>ZDB.MY_MENU.UI_COLOR_BG</code>. 「uiColorBg」- 背景色
     */
    @Override
    public MyMenuRecord setUiColorBg(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_MENU.TYPE</code>. 「type」- 菜单类型
     */
    @Override
    public String getType() {
        return (String) get(8);
    }

    /**
     * Setter for <code>ZDB.MY_MENU.TYPE</code>. 「type」- 菜单类型
     */
    @Override
    public MyMenuRecord setType(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_MENU.PAGE</code>. 「page」- 菜单所在页面
     */
    @Override
    public String getPage() {
        return (String) get(9);
    }

    /**
     * Setter for <code>ZDB.MY_MENU.PAGE</code>. 「page」- 菜单所在页面
     */
    @Override
    public MyMenuRecord setPage(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_MENU.POSITION</code>. 「position」- 菜单位置
     */
    @Override
    public String getPosition() {
        return (String) get(10);
    }

    /**
     * Setter for <code>ZDB.MY_MENU.POSITION</code>. 「position」- 菜单位置
     */
    @Override
    public MyMenuRecord setPosition(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_MENU.OWNER</code>. 「owner」- 拥有者ID，我的 / 角色级
     */
    @Override
    public String getOwner() {
        return (String) get(11);
    }

    /**
     * Setter for <code>ZDB.MY_MENU.OWNER</code>. 「owner」- 拥有者ID，我的 / 角色级
     */
    @Override
    public MyMenuRecord setOwner(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_MENU.OWNER_TYPE</code>. 「ownerType」- ROLE 角色，USER
     * 用户
     */
    @Override
    public String getOwnerType() {
        return (String) get(12);
    }

    /**
     * Setter for <code>ZDB.MY_MENU.OWNER_TYPE</code>. 「ownerType」- ROLE 角色，USER
     * 用户
     */
    @Override
    public MyMenuRecord setOwnerType(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_MENU.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(13);
    }

    /**
     * Setter for <code>ZDB.MY_MENU.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public MyMenuRecord setActive(Boolean value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_MENU.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(14);
    }

    /**
     * Setter for <code>ZDB.MY_MENU.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public MyMenuRecord setSigma(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_MENU.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(15);
    }

    /**
     * Setter for <code>ZDB.MY_MENU.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public MyMenuRecord setMetadata(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_MENU.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(16);
    }

    /**
     * Setter for <code>ZDB.MY_MENU.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public MyMenuRecord setLanguage(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_MENU.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(17);
    }

    /**
     * Setter for <code>ZDB.MY_MENU.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public MyMenuRecord setCreatedAt(LocalDateTime value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_MENU.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(18);
    }

    /**
     * Setter for <code>ZDB.MY_MENU.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public MyMenuRecord setCreatedBy(String value) {
        set(18, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>ZDB.MY_MENU.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(19);
    }

    // -------------------------------------------------------------------------
    // Record21 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>ZDB.MY_MENU.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public MyMenuRecord setUpdatedAt(LocalDateTime value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_MENU.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(20);
    }

    /**
     * Setter for <code>ZDB.MY_MENU.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public MyMenuRecord setUpdatedBy(String value) {
        set(20, value);
        return this;
    }

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    @Override
    public Row21<String, String, String, String, Long, String, String, String, String, String, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    @Override
    public Row21<String, String, String, String, Long, String, String, String, String, String, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row21) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return MyMenu.MY_MENU.KEY;
    }

    @Override
    public Field<String> field2() {
        return MyMenu.MY_MENU.ICON;
    }

    @Override
    public Field<String> field3() {
        return MyMenu.MY_MENU.TEXT;
    }

    @Override
    public Field<String> field4() {
        return MyMenu.MY_MENU.URI;
    }

    @Override
    public Field<Long> field5() {
        return MyMenu.MY_MENU.UI_SORT;
    }

    @Override
    public Field<String> field6() {
        return MyMenu.MY_MENU.UI_PARENT;
    }

    @Override
    public Field<String> field7() {
        return MyMenu.MY_MENU.UI_COLOR_FG;
    }

    @Override
    public Field<String> field8() {
        return MyMenu.MY_MENU.UI_COLOR_BG;
    }

    @Override
    public Field<String> field9() {
        return MyMenu.MY_MENU.TYPE;
    }

    @Override
    public Field<String> field10() {
        return MyMenu.MY_MENU.PAGE;
    }

    @Override
    public Field<String> field11() {
        return MyMenu.MY_MENU.POSITION;
    }

    @Override
    public Field<String> field12() {
        return MyMenu.MY_MENU.OWNER;
    }

    @Override
    public Field<String> field13() {
        return MyMenu.MY_MENU.OWNER_TYPE;
    }

    @Override
    public Field<Boolean> field14() {
        return MyMenu.MY_MENU.ACTIVE;
    }

    @Override
    public Field<String> field15() {
        return MyMenu.MY_MENU.SIGMA;
    }

    @Override
    public Field<String> field16() {
        return MyMenu.MY_MENU.METADATA;
    }

    @Override
    public Field<String> field17() {
        return MyMenu.MY_MENU.LANGUAGE;
    }

    @Override
    public Field<LocalDateTime> field18() {
        return MyMenu.MY_MENU.CREATED_AT;
    }

    @Override
    public Field<String> field19() {
        return MyMenu.MY_MENU.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field20() {
        return MyMenu.MY_MENU.UPDATED_AT;
    }

    @Override
    public Field<String> field21() {
        return MyMenu.MY_MENU.UPDATED_BY;
    }

    @Override
    public String component1() {
        return getKey();
    }

    @Override
    public String component2() {
        return getIcon();
    }

    @Override
    public String component3() {
        return getText();
    }

    @Override
    public String component4() {
        return getUri();
    }

    @Override
    public Long component5() {
        return getUiSort();
    }

    @Override
    public String component6() {
        return getUiParent();
    }

    @Override
    public String component7() {
        return getUiColorFg();
    }

    @Override
    public String component8() {
        return getUiColorBg();
    }

    @Override
    public String component9() {
        return getType();
    }

    @Override
    public String component10() {
        return getPage();
    }

    @Override
    public String component11() {
        return getPosition();
    }

    @Override
    public String component12() {
        return getOwner();
    }

    @Override
    public String component13() {
        return getOwnerType();
    }

    @Override
    public Boolean component14() {
        return getActive();
    }

    @Override
    public String component15() {
        return getSigma();
    }

    @Override
    public String component16() {
        return getMetadata();
    }

    @Override
    public String component17() {
        return getLanguage();
    }

    @Override
    public LocalDateTime component18() {
        return getCreatedAt();
    }

    @Override
    public String component19() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component20() {
        return getUpdatedAt();
    }

    @Override
    public String component21() {
        return getUpdatedBy();
    }

    @Override
    public String value1() {
        return getKey();
    }

    @Override
    public String value2() {
        return getIcon();
    }

    @Override
    public String value3() {
        return getText();
    }

    @Override
    public String value4() {
        return getUri();
    }

    @Override
    public Long value5() {
        return getUiSort();
    }

    @Override
    public String value6() {
        return getUiParent();
    }

    @Override
    public String value7() {
        return getUiColorFg();
    }

    @Override
    public String value8() {
        return getUiColorBg();
    }

    @Override
    public String value9() {
        return getType();
    }

    @Override
    public String value10() {
        return getPage();
    }

    @Override
    public String value11() {
        return getPosition();
    }

    @Override
    public String value12() {
        return getOwner();
    }

    @Override
    public String value13() {
        return getOwnerType();
    }

    @Override
    public Boolean value14() {
        return getActive();
    }

    @Override
    public String value15() {
        return getSigma();
    }

    @Override
    public String value16() {
        return getMetadata();
    }

    @Override
    public String value17() {
        return getLanguage();
    }

    @Override
    public LocalDateTime value18() {
        return getCreatedAt();
    }

    @Override
    public String value19() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value20() {
        return getUpdatedAt();
    }

    @Override
    public String value21() {
        return getUpdatedBy();
    }

    @Override
    public MyMenuRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public MyMenuRecord value2(String value) {
        setIcon(value);
        return this;
    }

    @Override
    public MyMenuRecord value3(String value) {
        setText(value);
        return this;
    }

    @Override
    public MyMenuRecord value4(String value) {
        setUri(value);
        return this;
    }

    @Override
    public MyMenuRecord value5(Long value) {
        setUiSort(value);
        return this;
    }

    @Override
    public MyMenuRecord value6(String value) {
        setUiParent(value);
        return this;
    }

    @Override
    public MyMenuRecord value7(String value) {
        setUiColorFg(value);
        return this;
    }

    @Override
    public MyMenuRecord value8(String value) {
        setUiColorBg(value);
        return this;
    }

    @Override
    public MyMenuRecord value9(String value) {
        setType(value);
        return this;
    }

    @Override
    public MyMenuRecord value10(String value) {
        setPage(value);
        return this;
    }

    @Override
    public MyMenuRecord value11(String value) {
        setPosition(value);
        return this;
    }

    @Override
    public MyMenuRecord value12(String value) {
        setOwner(value);
        return this;
    }

    @Override
    public MyMenuRecord value13(String value) {
        setOwnerType(value);
        return this;
    }

    @Override
    public MyMenuRecord value14(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public MyMenuRecord value15(String value) {
        setSigma(value);
        return this;
    }

    @Override
    public MyMenuRecord value16(String value) {
        setMetadata(value);
        return this;
    }

    @Override
    public MyMenuRecord value17(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public MyMenuRecord value18(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public MyMenuRecord value19(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public MyMenuRecord value20(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    @Override
    public MyMenuRecord value21(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public MyMenuRecord values(String value1, String value2, String value3, String value4, Long value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, String value13, Boolean value14, String value15, String value16, String value17, LocalDateTime value18, String value19, LocalDateTime value20, String value21) {
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
        value21(value21);
        return this;
    }

    @Override
    public void from(IMyMenu from) {
        setKey(from.getKey());
        setIcon(from.getIcon());
        setText(from.getText());
        setUri(from.getUri());
        setUiSort(from.getUiSort());
        setUiParent(from.getUiParent());
        setUiColorFg(from.getUiColorFg());
        setUiColorBg(from.getUiColorBg());
        setType(from.getType());
        setPage(from.getPage());
        setPosition(from.getPosition());
        setOwner(from.getOwner());
        setOwnerType(from.getOwnerType());
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
    public <E extends IMyMenu> E into(E into) {
        into.from(this);
        return into;
    }
}