/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.pojos;


import cn.vertxup.erp.domain.tables.interfaces.IRCompanyCustomer;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RCompanyCustomer implements VertxPojo, IRCompanyCustomer {

    private static final long serialVersionUID = 1L;

    private String companyId;
    private String customerId;
    private String comment;

    public RCompanyCustomer() {}

    public RCompanyCustomer(IRCompanyCustomer value) {
        this.companyId = value.getCompanyId();
        this.customerId = value.getCustomerId();
        this.comment = value.getComment();
    }

    public RCompanyCustomer(
        String companyId,
        String customerId,
        String comment
    ) {
        this.companyId = companyId;
        this.customerId = customerId;
        this.comment = comment;
    }

        public RCompanyCustomer(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>DB_ETERNAL.R_COMPANY_CUSTOMER.COMPANY_ID</code>.
     * 「companyId」- 企业的ID
     */
    @Override
    public String getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for <code>DB_ETERNAL.R_COMPANY_CUSTOMER.COMPANY_ID</code>.
     * 「companyId」- 企业的ID
     */
    @Override
    public RCompanyCustomer setCompanyId(String companyId) {
        this.companyId = companyId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.R_COMPANY_CUSTOMER.CUSTOMER_ID</code>.
     * 「customerId」- 客户信息的ID
     */
    @Override
    public String getCustomerId() {
        return this.customerId;
    }

    /**
     * Setter for <code>DB_ETERNAL.R_COMPANY_CUSTOMER.CUSTOMER_ID</code>.
     * 「customerId」- 客户信息的ID
     */
    @Override
    public RCompanyCustomer setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.R_COMPANY_CUSTOMER.COMMENT</code>. 「comment」-
     * 关系备注
     */
    @Override
    public String getComment() {
        return this.comment;
    }

    /**
     * Setter for <code>DB_ETERNAL.R_COMPANY_CUSTOMER.COMMENT</code>. 「comment」-
     * 关系备注
     */
    @Override
    public RCompanyCustomer setComment(String comment) {
        this.comment = comment;
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
        final RCompanyCustomer other = (RCompanyCustomer) obj;
        if (this.companyId == null) {
            if (other.companyId != null)
                return false;
        }
        else if (!this.companyId.equals(other.companyId))
            return false;
        if (this.customerId == null) {
            if (other.customerId != null)
                return false;
        }
        else if (!this.customerId.equals(other.customerId))
            return false;
        if (this.comment == null) {
            if (other.comment != null)
                return false;
        }
        else if (!this.comment.equals(other.comment))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.companyId == null) ? 0 : this.companyId.hashCode());
        result = prime * result + ((this.customerId == null) ? 0 : this.customerId.hashCode());
        result = prime * result + ((this.comment == null) ? 0 : this.comment.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RCompanyCustomer (");

        sb.append(companyId);
        sb.append(", ").append(customerId);
        sb.append(", ").append(comment);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IRCompanyCustomer from) {
        setCompanyId(from.getCompanyId());
        setCustomerId(from.getCustomerId());
        setComment(from.getComment());
    }

    @Override
    public <E extends IRCompanyCustomer> E into(E into) {
        into.from(this);
        return into;
    }
}
