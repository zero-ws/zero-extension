/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.mbse.ui.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;

import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.setOrThrow;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public interface IVFragment extends VertxPojo, Serializable {

    /**
     * Getter for <code>ZDB.V_FRAGMENT.KEY</code>. 「key」- 选项主键
     */
    public String getKey();

    /**
     * Setter for <code>ZDB.V_FRAGMENT.KEY</code>. 「key」- 选项主键
     */
    public IVFragment setKey(String value);

    /**
     * Getter for <code>ZDB.V_FRAGMENT.CONTAINER</code>. 「container」- 容器专用格式
     */
    public String getContainer();

    /**
     * Setter for <code>ZDB.V_FRAGMENT.CONTAINER</code>. 「container」- 容器专用格式
     */
    public IVFragment setContainer(String value);

    /**
     * Getter for <code>ZDB.V_FRAGMENT.NOTICE</code>. 「notice」- notice选项，Alert结构
     */
    public String getNotice();

    /**
     * Setter for <code>ZDB.V_FRAGMENT.NOTICE</code>. 「notice」- notice选项，Alert结构
     */
    public IVFragment setNotice(String value);

    /**
     * Getter for <code>ZDB.V_FRAGMENT.BUTTON_CONNECT</code>. 「buttonConnect」-
     * 按钮的ID（单按钮）
     */
    public String getButtonConnect();

    /**
     * Setter for <code>ZDB.V_FRAGMENT.BUTTON_CONNECT</code>. 「buttonConnect」-
     * 按钮的ID（单按钮）
     */
    public IVFragment setButtonConnect(String value);

    /**
     * Getter for <code>ZDB.V_FRAGMENT.BUTTON_GROUP</code>. 「buttonGroup」-
     * 一组按钮配置
     */
    public String getButtonGroup();

    /**
     * Setter for <code>ZDB.V_FRAGMENT.BUTTON_GROUP</code>. 「buttonGroup」-
     * 一组按钮配置
     */
    public IVFragment setButtonGroup(String value);

    /**
     * Getter for <code>ZDB.V_FRAGMENT.MODAL</code>. 「modal」- modal选项，Model专用结构
     */
    public String getModal();

    /**
     * Setter for <code>ZDB.V_FRAGMENT.MODAL</code>. 「modal」- modal选项，Model专用结构
     */
    public IVFragment setModal(String value);

    /**
     * Getter for <code>ZDB.V_FRAGMENT.GRID</code>. 「grid」- grid选项（分区面板专用）
     */
    public Integer getGrid();

    /**
     * Setter for <code>ZDB.V_FRAGMENT.GRID</code>. 「grid」- grid选项（分区面板专用）
     */
    public IVFragment setGrid(Integer value);

    /**
     * Getter for <code>ZDB.V_FRAGMENT.CONFIG</code>. 「config」- 根目录开始的基本配置
     */
    public String getConfig();

    /**
     * Setter for <code>ZDB.V_FRAGMENT.CONFIG</code>. 「config」- 根目录开始的基本配置
     */
    public IVFragment setConfig(String value);

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IVFragment
     */
    public void from(IVFragment from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IVFragment
     */
    public <E extends IVFragment> E into(E into);

    @Override
    public default IVFragment fromJson(io.vertx.core.json.JsonObject json) {
        setOrThrow(this::setKey, json::getString, "KEY", "java.lang.String");
        setOrThrow(this::setContainer, json::getString, "CONTAINER", "java.lang.String");
        setOrThrow(this::setNotice, json::getString, "NOTICE", "java.lang.String");
        setOrThrow(this::setButtonConnect, json::getString, "BUTTON_CONNECT", "java.lang.String");
        setOrThrow(this::setButtonGroup, json::getString, "BUTTON_GROUP", "java.lang.String");
        setOrThrow(this::setModal, json::getString, "MODAL", "java.lang.String");
        setOrThrow(this::setGrid, json::getInteger, "GRID", "java.lang.Integer");
        setOrThrow(this::setConfig, json::getString, "CONFIG", "java.lang.String");
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("KEY", getKey());
        json.put("CONTAINER", getContainer());
        json.put("NOTICE", getNotice());
        json.put("BUTTON_CONNECT", getButtonConnect());
        json.put("BUTTON_GROUP", getButtonGroup());
        json.put("MODAL", getModal());
        json.put("GRID", getGrid());
        json.put("CONFIG", getConfig());
        return json;
    }

}