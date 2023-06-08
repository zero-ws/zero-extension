/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ui.domain.tables.pojos;


import cn.vertxup.ui.domain.tables.interfaces.IVFragment;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VFragment implements VertxPojo, IVFragment {

    private static final long serialVersionUID = 1L;

    private String key;
    private String container;
    private String notice;
    private String buttonConnect;
    private String buttonGroup;
    private String modal;
    private Integer grid;
    private String config;

    public VFragment() {}

    public VFragment(IVFragment value) {
        this.key = value.getKey();
        this.container = value.getContainer();
        this.notice = value.getNotice();
        this.buttonConnect = value.getButtonConnect();
        this.buttonGroup = value.getButtonGroup();
        this.modal = value.getModal();
        this.grid = value.getGrid();
        this.config = value.getConfig();
    }

    public VFragment(
        String key,
        String container,
        String notice,
        String buttonConnect,
        String buttonGroup,
        String modal,
        Integer grid,
        String config
    ) {
        this.key = key;
        this.container = container;
        this.notice = notice;
        this.buttonConnect = buttonConnect;
        this.buttonGroup = buttonGroup;
        this.modal = modal;
        this.grid = grid;
        this.config = config;
    }

        public VFragment(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>DB_ETERNAL.V_FRAGMENT.KEY</code>. 「key」- 选项主键
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>DB_ETERNAL.V_FRAGMENT.KEY</code>. 「key」- 选项主键
     */
    @Override
    public VFragment setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.V_FRAGMENT.CONTAINER</code>. 「container」-
     * 容器专用格式
     */
    @Override
    public String getContainer() {
        return this.container;
    }

    /**
     * Setter for <code>DB_ETERNAL.V_FRAGMENT.CONTAINER</code>. 「container」-
     * 容器专用格式
     */
    @Override
    public VFragment setContainer(String container) {
        this.container = container;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.V_FRAGMENT.NOTICE</code>. 「notice」-
     * notice选项，Alert结构
     */
    @Override
    public String getNotice() {
        return this.notice;
    }

    /**
     * Setter for <code>DB_ETERNAL.V_FRAGMENT.NOTICE</code>. 「notice」-
     * notice选项，Alert结构
     */
    @Override
    public VFragment setNotice(String notice) {
        this.notice = notice;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.V_FRAGMENT.BUTTON_CONNECT</code>.
     * 「buttonConnect」- 按钮的ID（单按钮）
     */
    @Override
    public String getButtonConnect() {
        return this.buttonConnect;
    }

    /**
     * Setter for <code>DB_ETERNAL.V_FRAGMENT.BUTTON_CONNECT</code>.
     * 「buttonConnect」- 按钮的ID（单按钮）
     */
    @Override
    public VFragment setButtonConnect(String buttonConnect) {
        this.buttonConnect = buttonConnect;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.V_FRAGMENT.BUTTON_GROUP</code>.
     * 「buttonGroup」- 一组按钮配置
     */
    @Override
    public String getButtonGroup() {
        return this.buttonGroup;
    }

    /**
     * Setter for <code>DB_ETERNAL.V_FRAGMENT.BUTTON_GROUP</code>.
     * 「buttonGroup」- 一组按钮配置
     */
    @Override
    public VFragment setButtonGroup(String buttonGroup) {
        this.buttonGroup = buttonGroup;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.V_FRAGMENT.MODAL</code>. 「modal」-
     * modal选项，Model专用结构
     */
    @Override
    public String getModal() {
        return this.modal;
    }

    /**
     * Setter for <code>DB_ETERNAL.V_FRAGMENT.MODAL</code>. 「modal」-
     * modal选项，Model专用结构
     */
    @Override
    public VFragment setModal(String modal) {
        this.modal = modal;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.V_FRAGMENT.GRID</code>. 「grid」-
     * grid选项（分区面板专用）
     */
    @Override
    public Integer getGrid() {
        return this.grid;
    }

    /**
     * Setter for <code>DB_ETERNAL.V_FRAGMENT.GRID</code>. 「grid」-
     * grid选项（分区面板专用）
     */
    @Override
    public VFragment setGrid(Integer grid) {
        this.grid = grid;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.V_FRAGMENT.CONFIG</code>. 「config」-
     * 根目录开始的基本配置
     */
    @Override
    public String getConfig() {
        return this.config;
    }

    /**
     * Setter for <code>DB_ETERNAL.V_FRAGMENT.CONFIG</code>. 「config」-
     * 根目录开始的基本配置
     */
    @Override
    public VFragment setConfig(String config) {
        this.config = config;
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
        final VFragment other = (VFragment) obj;
        if (this.key == null) {
            if (other.key != null)
                return false;
        }
        else if (!this.key.equals(other.key))
            return false;
        if (this.container == null) {
            if (other.container != null)
                return false;
        }
        else if (!this.container.equals(other.container))
            return false;
        if (this.notice == null) {
            if (other.notice != null)
                return false;
        }
        else if (!this.notice.equals(other.notice))
            return false;
        if (this.buttonConnect == null) {
            if (other.buttonConnect != null)
                return false;
        }
        else if (!this.buttonConnect.equals(other.buttonConnect))
            return false;
        if (this.buttonGroup == null) {
            if (other.buttonGroup != null)
                return false;
        }
        else if (!this.buttonGroup.equals(other.buttonGroup))
            return false;
        if (this.modal == null) {
            if (other.modal != null)
                return false;
        }
        else if (!this.modal.equals(other.modal))
            return false;
        if (this.grid == null) {
            if (other.grid != null)
                return false;
        }
        else if (!this.grid.equals(other.grid))
            return false;
        if (this.config == null) {
            if (other.config != null)
                return false;
        }
        else if (!this.config.equals(other.config))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.key == null) ? 0 : this.key.hashCode());
        result = prime * result + ((this.container == null) ? 0 : this.container.hashCode());
        result = prime * result + ((this.notice == null) ? 0 : this.notice.hashCode());
        result = prime * result + ((this.buttonConnect == null) ? 0 : this.buttonConnect.hashCode());
        result = prime * result + ((this.buttonGroup == null) ? 0 : this.buttonGroup.hashCode());
        result = prime * result + ((this.modal == null) ? 0 : this.modal.hashCode());
        result = prime * result + ((this.grid == null) ? 0 : this.grid.hashCode());
        result = prime * result + ((this.config == null) ? 0 : this.config.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("VFragment (");

        sb.append(key);
        sb.append(", ").append(container);
        sb.append(", ").append(notice);
        sb.append(", ").append(buttonConnect);
        sb.append(", ").append(buttonGroup);
        sb.append(", ").append(modal);
        sb.append(", ").append(grid);
        sb.append(", ").append(config);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IVFragment from) {
        setKey(from.getKey());
        setContainer(from.getContainer());
        setNotice(from.getNotice());
        setButtonConnect(from.getButtonConnect());
        setButtonGroup(from.getButtonGroup());
        setModal(from.getModal());
        setGrid(from.getGrid());
        setConfig(from.getConfig());
    }

    @Override
    public <E extends IVFragment> E into(E into) {
        into.from(this);
        return into;
    }
}
