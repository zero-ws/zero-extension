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
public interface IUiVisitor extends VertxPojo, Serializable {

    /**
     * Setter for <code>ZDB.UI_VISITOR.IDENTIFIER</code>. 「identifier」- 维度1：标识模型
     */
    public IUiVisitor setIdentifier(String value);

    /**
     * Getter for <code>ZDB.UI_VISITOR.IDENTIFIER</code>. 「identifier」- 维度1：标识模型
     */
    public String getIdentifier();

    /**
     * Setter for <code>ZDB.UI_VISITOR.PAGE</code>. 「page」- 维度2：页面ID
     */
    public IUiVisitor setPage(String value);

    /**
     * Getter for <code>ZDB.UI_VISITOR.PAGE</code>. 「page」- 维度2：页面ID
     */
    public String getPage();

    /**
     * Setter for <code>ZDB.UI_VISITOR.PATH</code>. 「path」- 维度3：路径信息，view +
     * position
     */
    public IUiVisitor setPath(String value);

    /**
     * Getter for <code>ZDB.UI_VISITOR.PATH</code>. 「path」- 维度3：路径信息，view +
     * position
     */
    public String getPath();

    /**
     * Setter for <code>ZDB.UI_VISITOR.TYPE</code>. 「type」- 维度4：操作类型：List / Form
     * 或其他
     */
    public IUiVisitor setType(String value);

    /**
     * Getter for <code>ZDB.UI_VISITOR.TYPE</code>. 「type」- 维度4：操作类型：List / Form
     * 或其他
     */
    public String getType();

    /**
     * Setter for <code>ZDB.UI_VISITOR.CONTROL_ID</code>. 「controlId」-
     * 挂载专用的ID：List / Form 都可用
     */
    public IUiVisitor setControlId(String value);

    /**
     * Getter for <code>ZDB.UI_VISITOR.CONTROL_ID</code>. 「controlId」-
     * 挂载专用的ID：List / Form 都可用
     */
    public String getControlId();

    /**
     * Setter for <code>ZDB.UI_VISITOR.RESOURCE_ID</code>. 「resourceId」- 关联资源ID
     */
    public IUiVisitor setResourceId(String value);

    /**
     * Getter for <code>ZDB.UI_VISITOR.RESOURCE_ID</code>. 「resourceId」- 关联资源ID
     */
    public String getResourceId();

    /**
     * Setter for <code>ZDB.UI_VISITOR.SIGMA</code>. 「sigma」- 高维度：统一标识符
     */
    public IUiVisitor setSigma(String value);

    /**
     * Getter for <code>ZDB.UI_VISITOR.SIGMA</code>. 「sigma」- 高维度：统一标识符
     */
    public String getSigma();

    /**
     * Setter for <code>ZDB.UI_VISITOR.METADATA</code>. 「metadata」- 附加配置数据
     */
    public IUiVisitor setMetadata(String value);

    /**
     * Getter for <code>ZDB.UI_VISITOR.METADATA</code>. 「metadata」- 附加配置数据
     */
    public String getMetadata();

    /**
     * Setter for <code>ZDB.UI_VISITOR.RUN_COMPONENT</code>. 「runComponent」-
     * 执行组件，扩展时专用
     */
    public IUiVisitor setRunComponent(String value);

    /**
     * Getter for <code>ZDB.UI_VISITOR.RUN_COMPONENT</code>. 「runComponent」-
     * 执行组件，扩展时专用
     */
    public String getRunComponent();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IUiVisitor
     */
    public void from(IUiVisitor from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IUiVisitor
     */
    public <E extends IUiVisitor> E into(E into);

        @Override
        public default IUiVisitor fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setIdentifier,json::getString,"IDENTIFIER","java.lang.String");
                setOrThrow(this::setPage,json::getString,"PAGE","java.lang.String");
                setOrThrow(this::setPath,json::getString,"PATH","java.lang.String");
                setOrThrow(this::setType,json::getString,"TYPE","java.lang.String");
                setOrThrow(this::setControlId,json::getString,"CONTROL_ID","java.lang.String");
                setOrThrow(this::setResourceId,json::getString,"RESOURCE_ID","java.lang.String");
                setOrThrow(this::setSigma,json::getString,"SIGMA","java.lang.String");
                setOrThrow(this::setMetadata,json::getString,"METADATA","java.lang.String");
                setOrThrow(this::setRunComponent,json::getString,"RUN_COMPONENT","java.lang.String");
                return this;
        }


        @Override
        public default io.vertx.core.json.JsonObject toJson() {
                io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
                json.put("IDENTIFIER",getIdentifier());
                json.put("PAGE",getPage());
                json.put("PATH",getPath());
                json.put("TYPE",getType());
                json.put("CONTROL_ID",getControlId());
                json.put("RESOURCE_ID",getResourceId());
                json.put("SIGMA",getSigma());
                json.put("METADATA",getMetadata());
                json.put("RUN_COMPONENT",getRunComponent());
                return json;
        }

}
