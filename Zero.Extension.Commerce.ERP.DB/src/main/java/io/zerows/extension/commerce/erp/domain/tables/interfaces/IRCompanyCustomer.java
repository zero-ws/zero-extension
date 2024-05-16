/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.erp.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;

import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.setOrThrow;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public interface IRCompanyCustomer extends VertxPojo, Serializable {

    /**
     * Getter for <code>ZDB.R_COMPANY_CUSTOMER.COMPANY_ID</code>. 「companyId」-
     * 企业的ID
     */
    public String getCompanyId();

    /**
     * Setter for <code>ZDB.R_COMPANY_CUSTOMER.COMPANY_ID</code>. 「companyId」-
     * 企业的ID
     */
    public IRCompanyCustomer setCompanyId(String value);

    /**
     * Getter for <code>ZDB.R_COMPANY_CUSTOMER.CUSTOMER_ID</code>. 「customerId」-
     * 客户信息的ID
     */
    public String getCustomerId();

    /**
     * Setter for <code>ZDB.R_COMPANY_CUSTOMER.CUSTOMER_ID</code>. 「customerId」-
     * 客户信息的ID
     */
    public IRCompanyCustomer setCustomerId(String value);

    /**
     * Getter for <code>ZDB.R_COMPANY_CUSTOMER.LINK_COMPONENT</code>.
     * 「linkComponent」- 关联执行组件（扩展用）
     */
    public String getLinkComponent();

    /**
     * Setter for <code>ZDB.R_COMPANY_CUSTOMER.LINK_COMPONENT</code>.
     * 「linkComponent」- 关联执行组件（扩展用）
     */
    public IRCompanyCustomer setLinkComponent(String value);

    /**
     * Getter for <code>ZDB.R_COMPANY_CUSTOMER.COMMENT</code>. 「comment」- 关系备注
     */
    public String getComment();

    /**
     * Setter for <code>ZDB.R_COMPANY_CUSTOMER.COMMENT</code>. 「comment」- 关系备注
     */
    public IRCompanyCustomer setComment(String value);

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IRCompanyCustomer
     */
    public void from(IRCompanyCustomer from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IRCompanyCustomer
     */
    public <E extends IRCompanyCustomer> E into(E into);

    @Override
    public default IRCompanyCustomer fromJson(io.vertx.core.json.JsonObject json) {
        setOrThrow(this::setCompanyId, json::getString, "COMPANY_ID", "java.lang.String");
        setOrThrow(this::setCustomerId, json::getString, "CUSTOMER_ID", "java.lang.String");
        setOrThrow(this::setLinkComponent, json::getString, "LINK_COMPONENT", "java.lang.String");
        setOrThrow(this::setComment, json::getString, "COMMENT", "java.lang.String");
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("COMPANY_ID", getCompanyId());
        json.put("CUSTOMER_ID", getCustomerId());
        json.put("LINK_COMPONENT", getLinkComponent());
        json.put("COMMENT", getComment());
        return json;
    }

}