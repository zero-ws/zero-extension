/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ui.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IVTable extends VertxPojo, Serializable {

    /**
     * Setter for <code>ZDB.V_TABLE.KEY</code>. 「key」- 表选项主键
     */
    public IVTable setKey(String value);

    /**
     * Getter for <code>ZDB.V_TABLE.KEY</code>. 「key」- 表选项主键
     */
    public String getKey();

    /**
     * Setter for <code>ZDB.V_TABLE.BORDERED</code>. 「bordered」- 是否带表框
     */
    public IVTable setBordered(Boolean value);

    /**
     * Getter for <code>ZDB.V_TABLE.BORDERED</code>. 「bordered」- 是否带表框
     */
    public Boolean getBordered();

    /**
     * Setter for <code>ZDB.V_TABLE.SIZE</code>. 「size」- 表格尺寸
     */
    public IVTable setSize(String value);

    /**
     * Getter for <code>ZDB.V_TABLE.SIZE</code>. 「size」- 表格尺寸
     */
    public String getSize();

    /**
     * Setter for <code>ZDB.V_TABLE.CLASS_NAME</code>. 「className」- CSS属性
     */
    public IVTable setClassName(String value);

    /**
     * Getter for <code>ZDB.V_TABLE.CLASS_NAME</code>. 「className」- CSS属性
     */
    public String getClassName();

    /**
     * Setter for <code>ZDB.V_TABLE.TOTAL_REPORT</code>. 「totalReport」-
     * total.report - 文字: 总共多少条统计
     */
    public IVTable setTotalReport(String value);

    /**
     * Getter for <code>ZDB.V_TABLE.TOTAL_REPORT</code>. 「totalReport」-
     * total.report - 文字: 总共多少条统计
     */
    public String getTotalReport();

    /**
     * Setter for <code>ZDB.V_TABLE.TOTAL_SELECTED</code>. 「totalSelected」-
     * total.selected - 文字: 选择了多少条
     */
    public IVTable setTotalSelected(String value);

    /**
     * Getter for <code>ZDB.V_TABLE.TOTAL_SELECTED</code>. 「totalSelected」-
     * total.selected - 文字: 选择了多少条
     */
    public String getTotalSelected();

    /**
     * Setter for <code>ZDB.V_TABLE.ROW_DOUBLE_CLICK</code>. 「rowDoubleClick」-
     * row.onDoubleClick - 双击事件名
     */
    public IVTable setRowDoubleClick(String value);

    /**
     * Getter for <code>ZDB.V_TABLE.ROW_DOUBLE_CLICK</code>. 「rowDoubleClick」-
     * row.onDoubleClick - 双击事件名
     */
    public String getRowDoubleClick();

    /**
     * Setter for <code>ZDB.V_TABLE.ROW_CLICK</code>. 「rowClick」- row.onClick -
     * 单击事件名
     */
    public IVTable setRowClick(String value);

    /**
     * Getter for <code>ZDB.V_TABLE.ROW_CLICK</code>. 「rowClick」- row.onClick -
     * 单击事件名
     */
    public String getRowClick();

    /**
     * Setter for <code>ZDB.V_TABLE.ROW_CONTEXT_MENU</code>. 「rowContextMenu」-
     * row.onContextMenu - 右键菜单事件名
     */
    public IVTable setRowContextMenu(String value);

    /**
     * Getter for <code>ZDB.V_TABLE.ROW_CONTEXT_MENU</code>. 「rowContextMenu」-
     * row.onContextMenu - 右键菜单事件名
     */
    public String getRowContextMenu();

    /**
     * Setter for <code>ZDB.V_TABLE.ROW_MOUSE_ENTER</code>. 「rowMouseEnter」-
     * row.onMouseEnter - 鼠标左键事件名
     */
    public IVTable setRowMouseEnter(String value);

    /**
     * Getter for <code>ZDB.V_TABLE.ROW_MOUSE_ENTER</code>. 「rowMouseEnter」-
     * row.onMouseEnter - 鼠标左键事件名
     */
    public String getRowMouseEnter();

    /**
     * Setter for <code>ZDB.V_TABLE.ROW_MOUSE_LEAVE</code>. 「rowMouseLeave」-
     * row.onMouseLeave - 鼠标移开事件名
     */
    public IVTable setRowMouseLeave(String value);

    /**
     * Getter for <code>ZDB.V_TABLE.ROW_MOUSE_LEAVE</code>. 「rowMouseLeave」-
     * row.onMouseLeave - 鼠标移开事件名
     */
    public String getRowMouseLeave();

    /**
     * Setter for <code>ZDB.V_TABLE.OP_TITLE</code>. 「opTitle」-
     * columns/[0]/title, 执行列标题
     */
    public IVTable setOpTitle(String value);

    /**
     * Getter for <code>ZDB.V_TABLE.OP_TITLE</code>. 「opTitle」-
     * columns/[0]/title, 执行列标题
     */
    public String getOpTitle();

    /**
     * Setter for <code>ZDB.V_TABLE.OP_DATA_INDEX</code>. 「opDataIndex」-
     * columns/[0]/dataIndex, 执行列标题
     */
    public IVTable setOpDataIndex(String value);

    /**
     * Getter for <code>ZDB.V_TABLE.OP_DATA_INDEX</code>. 「opDataIndex」-
     * columns/[0]/dataIndex, 执行列标题
     */
    public String getOpDataIndex();

    /**
     * Setter for <code>ZDB.V_TABLE.OP_FIXED</code>. 「opFixed」-
     * columns/[0]/fixed，执行列左还是右
     */
    public IVTable setOpFixed(Boolean value);

    /**
     * Getter for <code>ZDB.V_TABLE.OP_FIXED</code>. 「opFixed」-
     * columns/[0]/fixed，执行列左还是右
     */
    public Boolean getOpFixed();

    /**
     * Setter for <code>ZDB.V_TABLE.OP_CONFIG</code>. 「opConfig」-
     * columns/[0]/$option, 执行类对应配置，配置按钮
     */
    public IVTable setOpConfig(String value);

    /**
     * Getter for <code>ZDB.V_TABLE.OP_CONFIG</code>. 「opConfig」-
     * columns/[0]/$option, 执行类对应配置，配置按钮
     */
    public String getOpConfig();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IVTable
     */
    public void from(IVTable from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IVTable
     */
    public <E extends IVTable> E into(E into);

        @Override
        public default IVTable fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setBordered,json::getBoolean,"BORDERED","java.lang.Boolean");
                setOrThrow(this::setSize,json::getString,"SIZE","java.lang.String");
                setOrThrow(this::setClassName,json::getString,"CLASS_NAME","java.lang.String");
                setOrThrow(this::setTotalReport,json::getString,"TOTAL_REPORT","java.lang.String");
                setOrThrow(this::setTotalSelected,json::getString,"TOTAL_SELECTED","java.lang.String");
                setOrThrow(this::setRowDoubleClick,json::getString,"ROW_DOUBLE_CLICK","java.lang.String");
                setOrThrow(this::setRowClick,json::getString,"ROW_CLICK","java.lang.String");
                setOrThrow(this::setRowContextMenu,json::getString,"ROW_CONTEXT_MENU","java.lang.String");
                setOrThrow(this::setRowMouseEnter,json::getString,"ROW_MOUSE_ENTER","java.lang.String");
                setOrThrow(this::setRowMouseLeave,json::getString,"ROW_MOUSE_LEAVE","java.lang.String");
                setOrThrow(this::setOpTitle,json::getString,"OP_TITLE","java.lang.String");
                setOrThrow(this::setOpDataIndex,json::getString,"OP_DATA_INDEX","java.lang.String");
                setOrThrow(this::setOpFixed,json::getBoolean,"OP_FIXED","java.lang.Boolean");
                setOrThrow(this::setOpConfig,json::getString,"OP_CONFIG","java.lang.String");
                return this;
        }


        @Override
        public default io.vertx.core.json.JsonObject toJson() {
                io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
                json.put("KEY",getKey());
                json.put("BORDERED",getBordered());
                json.put("SIZE",getSize());
                json.put("CLASS_NAME",getClassName());
                json.put("TOTAL_REPORT",getTotalReport());
                json.put("TOTAL_SELECTED",getTotalSelected());
                json.put("ROW_DOUBLE_CLICK",getRowDoubleClick());
                json.put("ROW_CLICK",getRowClick());
                json.put("ROW_CONTEXT_MENU",getRowContextMenu());
                json.put("ROW_MOUSE_ENTER",getRowMouseEnter());
                json.put("ROW_MOUSE_LEAVE",getRowMouseLeave());
                json.put("OP_TITLE",getOpTitle());
                json.put("OP_DATA_INDEX",getOpDataIndex());
                json.put("OP_FIXED",getOpFixed());
                json.put("OP_CONFIG",getOpConfig());
                return json;
        }

}
