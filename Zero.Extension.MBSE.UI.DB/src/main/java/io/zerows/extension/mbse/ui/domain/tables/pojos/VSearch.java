/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.mbse.ui.domain.tables.pojos;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.zerows.extension.mbse.ui.domain.tables.interfaces.IVSearch;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class VSearch implements VertxPojo, IVSearch {

    private static final long serialVersionUID = 1L;

    private String key;
    private Boolean enabled;
    private Boolean advanced;
    private String opRedo;
    private String opAdvanced;
    private String opView;
    private String confirmClear;
    private String placeholder;
    private String cond;
    private String advancedWidth;
    private String advancedTitle;
    private String advancedNotice;
    private String advancedView;

    public VSearch() {
    }

    public VSearch(IVSearch value) {
        this.key = value.getKey();
        this.enabled = value.getEnabled();
        this.advanced = value.getAdvanced();
        this.opRedo = value.getOpRedo();
        this.opAdvanced = value.getOpAdvanced();
        this.opView = value.getOpView();
        this.confirmClear = value.getConfirmClear();
        this.placeholder = value.getPlaceholder();
        this.cond = value.getCond();
        this.advancedWidth = value.getAdvancedWidth();
        this.advancedTitle = value.getAdvancedTitle();
        this.advancedNotice = value.getAdvancedNotice();
        this.advancedView = value.getAdvancedView();
    }

    public VSearch(
        String key,
        Boolean enabled,
        Boolean advanced,
        String opRedo,
        String opAdvanced,
        String opView,
        String confirmClear,
        String placeholder,
        String cond,
        String advancedWidth,
        String advancedTitle,
        String advancedNotice,
        String advancedView
    ) {
        this.key = key;
        this.enabled = enabled;
        this.advanced = advanced;
        this.opRedo = opRedo;
        this.opAdvanced = opAdvanced;
        this.opView = opView;
        this.confirmClear = confirmClear;
        this.placeholder = placeholder;
        this.cond = cond;
        this.advancedWidth = advancedWidth;
        this.advancedTitle = advancedTitle;
        this.advancedNotice = advancedNotice;
        this.advancedView = advancedView;
    }

    public VSearch(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    /**
     * Getter for <code>ZDB.V_SEARCH.KEY</code>. 「key」- 选项主键
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>ZDB.V_SEARCH.KEY</code>. 「key」- 选项主键
     */
    @Override
    public VSearch setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>ZDB.V_SEARCH.ENABLED</code>. 「enabled」- search.enabled:
     * 是否启用搜索
     */
    @Override
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * Setter for <code>ZDB.V_SEARCH.ENABLED</code>. 「enabled」- search.enabled:
     * 是否启用搜索
     */
    @Override
    public VSearch setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Getter for <code>ZDB.V_SEARCH.ADVANCED</code>. 「advanced」-
     * search.advanced: 是否启用高级搜索
     */
    @Override
    public Boolean getAdvanced() {
        return this.advanced;
    }

    /**
     * Setter for <code>ZDB.V_SEARCH.ADVANCED</code>. 「advanced」-
     * search.advanced: 是否启用高级搜索
     */
    @Override
    public VSearch setAdvanced(Boolean advanced) {
        this.advanced = advanced;
        return this;
    }

    /**
     * Getter for <code>ZDB.V_SEARCH.OP_REDO</code>. 「opRedo」- search.op.redo:
     * 清除条件按钮提示文字
     */
    @Override
    public String getOpRedo() {
        return this.opRedo;
    }

    /**
     * Setter for <code>ZDB.V_SEARCH.OP_REDO</code>. 「opRedo」- search.op.redo:
     * 清除条件按钮提示文字
     */
    @Override
    public VSearch setOpRedo(String opRedo) {
        this.opRedo = opRedo;
        return this;
    }

    /**
     * Getter for <code>ZDB.V_SEARCH.OP_ADVANCED</code>. 「opAdvanced」-
     * search.op.advanced: 高级搜索按钮提示文字
     */
    @Override
    public String getOpAdvanced() {
        return this.opAdvanced;
    }

    /**
     * Setter for <code>ZDB.V_SEARCH.OP_ADVANCED</code>. 「opAdvanced」-
     * search.op.advanced: 高级搜索按钮提示文字
     */
    @Override
    public VSearch setOpAdvanced(String opAdvanced) {
        this.opAdvanced = opAdvanced;
        return this;
    }

    /**
     * Getter for <code>ZDB.V_SEARCH.OP_VIEW</code>. 「opView」-
     * search.op.view：视图查询条件修改文字
     */
    @Override
    public String getOpView() {
        return this.opView;
    }

    /**
     * Setter for <code>ZDB.V_SEARCH.OP_VIEW</code>. 「opView」-
     * search.op.view：视图查询条件修改文字
     */
    @Override
    public VSearch setOpView(String opView) {
        this.opView = opView;
        return this;
    }

    /**
     * Getter for <code>ZDB.V_SEARCH.CONFIRM_CLEAR</code>. 「confirmClear」-
     * search.confirm.clear: 清除条件提示
     */
    @Override
    public String getConfirmClear() {
        return this.confirmClear;
    }

    /**
     * Setter for <code>ZDB.V_SEARCH.CONFIRM_CLEAR</code>. 「confirmClear」-
     * search.confirm.clear: 清除条件提示
     */
    @Override
    public VSearch setConfirmClear(String confirmClear) {
        this.confirmClear = confirmClear;
        return this;
    }

    /**
     * Getter for <code>ZDB.V_SEARCH.PLACEHOLDER</code>. 「placeholder」-
     * search.placeholder: 搜索框水印文字
     */
    @Override
    public String getPlaceholder() {
        return this.placeholder;
    }

    /**
     * Setter for <code>ZDB.V_SEARCH.PLACEHOLDER</code>. 「placeholder」-
     * search.placeholder: 搜索框水印文字
     */
    @Override
    public VSearch setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
        return this;
    }

    /**
     * Getter for <code>ZDB.V_SEARCH.COND</code>. 「cond」- search.cond: 搜索条件
     */
    @Override
    public String getCond() {
        return this.cond;
    }

    /**
     * Setter for <code>ZDB.V_SEARCH.COND</code>. 「cond」- search.cond: 搜索条件
     */
    @Override
    public VSearch setCond(String cond) {
        this.cond = cond;
        return this;
    }

    /**
     * Getter for <code>ZDB.V_SEARCH.ADVANCED_WIDTH</code>. 「advancedWidth」-
     * search.advanced.width: 高级搜索窗口宽度
     */
    @Override
    public String getAdvancedWidth() {
        return this.advancedWidth;
    }

    /**
     * Setter for <code>ZDB.V_SEARCH.ADVANCED_WIDTH</code>. 「advancedWidth」-
     * search.advanced.width: 高级搜索窗口宽度
     */
    @Override
    public VSearch setAdvancedWidth(String advancedWidth) {
        this.advancedWidth = advancedWidth;
        return this;
    }

    /**
     * Getter for <code>ZDB.V_SEARCH.ADVANCED_TITLE</code>. 「advancedTitle」-
     * search.advanced.title: 高级搜索窗口标题
     */
    @Override
    public String getAdvancedTitle() {
        return this.advancedTitle;
    }

    /**
     * Setter for <code>ZDB.V_SEARCH.ADVANCED_TITLE</code>. 「advancedTitle」-
     * search.advanced.title: 高级搜索窗口标题
     */
    @Override
    public VSearch setAdvancedTitle(String advancedTitle) {
        this.advancedTitle = advancedTitle;
        return this;
    }

    /**
     * Getter for <code>ZDB.V_SEARCH.ADVANCED_NOTICE</code>. 「advancedNotice」-
     * search.advanced.notice: 提示信息结构（Alert）
     */
    @Override
    public String getAdvancedNotice() {
        return this.advancedNotice;
    }

    /**
     * Setter for <code>ZDB.V_SEARCH.ADVANCED_NOTICE</code>. 「advancedNotice」-
     * search.advanced.notice: 提示信息结构（Alert）
     */
    @Override
    public VSearch setAdvancedNotice(String advancedNotice) {
        this.advancedNotice = advancedNotice;
        return this;
    }

    /**
     * Getter for <code>ZDB.V_SEARCH.ADVANCED_VIEW</code>. 「viewOption」-
     * search.criteria.xxx：视图选项信息
     */
    @Override
    public String getAdvancedView() {
        return this.advancedView;
    }

    /**
     * Setter for <code>ZDB.V_SEARCH.ADVANCED_VIEW</code>. 「viewOption」-
     * search.criteria.xxx：视图选项信息
     */
    @Override
    public VSearch setAdvancedView(String advancedView) {
        this.advancedView = advancedView;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final VSearch other = (VSearch) obj;
        if (this.key == null) {
            if (other.key != null)
                return false;
        } else if (!this.key.equals(other.key))
            return false;
        if (this.enabled == null) {
            if (other.enabled != null)
                return false;
        } else if (!this.enabled.equals(other.enabled))
            return false;
        if (this.advanced == null) {
            if (other.advanced != null)
                return false;
        } else if (!this.advanced.equals(other.advanced))
            return false;
        if (this.opRedo == null) {
            if (other.opRedo != null)
                return false;
        } else if (!this.opRedo.equals(other.opRedo))
            return false;
        if (this.opAdvanced == null) {
            if (other.opAdvanced != null)
                return false;
        } else if (!this.opAdvanced.equals(other.opAdvanced))
            return false;
        if (this.opView == null) {
            if (other.opView != null)
                return false;
        } else if (!this.opView.equals(other.opView))
            return false;
        if (this.confirmClear == null) {
            if (other.confirmClear != null)
                return false;
        } else if (!this.confirmClear.equals(other.confirmClear))
            return false;
        if (this.placeholder == null) {
            if (other.placeholder != null)
                return false;
        } else if (!this.placeholder.equals(other.placeholder))
            return false;
        if (this.cond == null) {
            if (other.cond != null)
                return false;
        } else if (!this.cond.equals(other.cond))
            return false;
        if (this.advancedWidth == null) {
            if (other.advancedWidth != null)
                return false;
        } else if (!this.advancedWidth.equals(other.advancedWidth))
            return false;
        if (this.advancedTitle == null) {
            if (other.advancedTitle != null)
                return false;
        } else if (!this.advancedTitle.equals(other.advancedTitle))
            return false;
        if (this.advancedNotice == null) {
            if (other.advancedNotice != null)
                return false;
        } else if (!this.advancedNotice.equals(other.advancedNotice))
            return false;
        if (this.advancedView == null) {
            if (other.advancedView != null)
                return false;
        } else if (!this.advancedView.equals(other.advancedView))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.key == null) ? 0 : this.key.hashCode());
        result = prime * result + ((this.enabled == null) ? 0 : this.enabled.hashCode());
        result = prime * result + ((this.advanced == null) ? 0 : this.advanced.hashCode());
        result = prime * result + ((this.opRedo == null) ? 0 : this.opRedo.hashCode());
        result = prime * result + ((this.opAdvanced == null) ? 0 : this.opAdvanced.hashCode());
        result = prime * result + ((this.opView == null) ? 0 : this.opView.hashCode());
        result = prime * result + ((this.confirmClear == null) ? 0 : this.confirmClear.hashCode());
        result = prime * result + ((this.placeholder == null) ? 0 : this.placeholder.hashCode());
        result = prime * result + ((this.cond == null) ? 0 : this.cond.hashCode());
        result = prime * result + ((this.advancedWidth == null) ? 0 : this.advancedWidth.hashCode());
        result = prime * result + ((this.advancedTitle == null) ? 0 : this.advancedTitle.hashCode());
        result = prime * result + ((this.advancedNotice == null) ? 0 : this.advancedNotice.hashCode());
        result = prime * result + ((this.advancedView == null) ? 0 : this.advancedView.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("VSearch (");

        sb.append(key);
        sb.append(", ").append(enabled);
        sb.append(", ").append(advanced);
        sb.append(", ").append(opRedo);
        sb.append(", ").append(opAdvanced);
        sb.append(", ").append(opView);
        sb.append(", ").append(confirmClear);
        sb.append(", ").append(placeholder);
        sb.append(", ").append(cond);
        sb.append(", ").append(advancedWidth);
        sb.append(", ").append(advancedTitle);
        sb.append(", ").append(advancedNotice);
        sb.append(", ").append(advancedView);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IVSearch from) {
        setKey(from.getKey());
        setEnabled(from.getEnabled());
        setAdvanced(from.getAdvanced());
        setOpRedo(from.getOpRedo());
        setOpAdvanced(from.getOpAdvanced());
        setOpView(from.getOpView());
        setConfirmClear(from.getConfirmClear());
        setPlaceholder(from.getPlaceholder());
        setCond(from.getCond());
        setAdvancedWidth(from.getAdvancedWidth());
        setAdvancedTitle(from.getAdvancedTitle());
        setAdvancedNotice(from.getAdvancedNotice());
        setAdvancedView(from.getAdvancedView());
    }

    @Override
    public <E extends IVSearch> E into(E into) {
        into.from(this);
        return into;
    }
}