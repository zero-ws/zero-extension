/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.erp.domain.tables.pojos;


import io.zerows.extension.commerce.erp.domain.tables.interfaces.IECustomer;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.math.BigDecimal;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ECustomer implements VertxPojo, IECustomer {

    private static final long serialVersionUID = 1L;

    private String key;
    private String name;
    private String code;
    private String type;
    private String status;
    private String taxCode;
    private String taxTitle;
    private String contactName;
    private String contactPhone;
    private String contactEmail;
    private String contactOnline;
    private String title;
    private String comment;
    private String email;
    private String fax;
    private String homepage;
    private String logo;
    private String phone;
    private String address;
    private String signName;
    private String signPhone;
    private Boolean runUp;
    private BigDecimal runUpAmount;
    private String bankId;
    private String bankCard;
    private String metadata;
    private Boolean active;
    private String sigma;
    private String language;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public ECustomer() {}

    public ECustomer(IECustomer value) {
        this.key = value.getKey();
        this.name = value.getName();
        this.code = value.getCode();
        this.type = value.getType();
        this.status = value.getStatus();
        this.taxCode = value.getTaxCode();
        this.taxTitle = value.getTaxTitle();
        this.contactName = value.getContactName();
        this.contactPhone = value.getContactPhone();
        this.contactEmail = value.getContactEmail();
        this.contactOnline = value.getContactOnline();
        this.title = value.getTitle();
        this.comment = value.getComment();
        this.email = value.getEmail();
        this.fax = value.getFax();
        this.homepage = value.getHomepage();
        this.logo = value.getLogo();
        this.phone = value.getPhone();
        this.address = value.getAddress();
        this.signName = value.getSignName();
        this.signPhone = value.getSignPhone();
        this.runUp = value.getRunUp();
        this.runUpAmount = value.getRunUpAmount();
        this.bankId = value.getBankId();
        this.bankCard = value.getBankCard();
        this.metadata = value.getMetadata();
        this.active = value.getActive();
        this.sigma = value.getSigma();
        this.language = value.getLanguage();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public ECustomer(
        String key,
        String name,
        String code,
        String type,
        String status,
        String taxCode,
        String taxTitle,
        String contactName,
        String contactPhone,
        String contactEmail,
        String contactOnline,
        String title,
        String comment,
        String email,
        String fax,
        String homepage,
        String logo,
        String phone,
        String address,
        String signName,
        String signPhone,
        Boolean runUp,
        BigDecimal runUpAmount,
        String bankId,
        String bankCard,
        String metadata,
        Boolean active,
        String sigma,
        String language,
        LocalDateTime createdAt,
        String createdBy,
        LocalDateTime updatedAt,
        String updatedBy
    ) {
        this.key = key;
        this.name = name;
        this.code = code;
        this.type = type;
        this.status = status;
        this.taxCode = taxCode;
        this.taxTitle = taxTitle;
        this.contactName = contactName;
        this.contactPhone = contactPhone;
        this.contactEmail = contactEmail;
        this.contactOnline = contactOnline;
        this.title = title;
        this.comment = comment;
        this.email = email;
        this.fax = fax;
        this.homepage = homepage;
        this.logo = logo;
        this.phone = phone;
        this.address = address;
        this.signName = signName;
        this.signPhone = signPhone;
        this.runUp = runUp;
        this.runUpAmount = runUpAmount;
        this.bankId = bankId;
        this.bankCard = bankCard;
        this.metadata = metadata;
        this.active = active;
        this.sigma = sigma;
        this.language = language;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public ECustomer(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.KEY</code>. 「key」- 客户ID
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.KEY</code>. 「key」- 客户ID
     */
    @Override
    public ECustomer setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.NAME</code>. 「name」- 客户名称
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.NAME</code>. 「name」- 客户名称
     */
    @Override
    public ECustomer setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.CODE</code>. 「code」- 客户编号
     */
    @Override
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.CODE</code>. 「code」- 客户编号
     */
    @Override
    public ECustomer setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.TYPE</code>. 「type」- 客户分类（不同类型代表不同客户）
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.TYPE</code>. 「type」- 客户分类（不同类型代表不同客户）
     */
    @Override
    public ECustomer setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.STATUS</code>. 「status」- 客户状态
     */
    @Override
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.STATUS</code>. 「status」- 客户状态
     */
    @Override
    public ECustomer setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.TAX_CODE</code>. 「taxCode」- 税号
     */
    @Override
    public String getTaxCode() {
        return this.taxCode;
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.TAX_CODE</code>. 「taxCode」- 税号
     */
    @Override
    public ECustomer setTaxCode(String taxCode) {
        this.taxCode = taxCode;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.TAX_TITLE</code>. 「taxTitle」- 开票抬头
     */
    @Override
    public String getTaxTitle() {
        return this.taxTitle;
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.TAX_TITLE</code>. 「taxTitle」- 开票抬头
     */
    @Override
    public ECustomer setTaxTitle(String taxTitle) {
        this.taxTitle = taxTitle;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.CONTACT_NAME</code>. 「contactName」- 联系人姓名
     */
    @Override
    public String getContactName() {
        return this.contactName;
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.CONTACT_NAME</code>. 「contactName」- 联系人姓名
     */
    @Override
    public ECustomer setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.CONTACT_PHONE</code>. 「contactPhone」-
     * 联系人电话
     */
    @Override
    public String getContactPhone() {
        return this.contactPhone;
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.CONTACT_PHONE</code>. 「contactPhone」-
     * 联系人电话
     */
    @Override
    public ECustomer setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.CONTACT_EMAIL</code>. 「contactEmail」-
     * 联系人Email
     */
    @Override
    public String getContactEmail() {
        return this.contactEmail;
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.CONTACT_EMAIL</code>. 「contactEmail」-
     * 联系人Email
     */
    @Override
    public ECustomer setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.CONTACT_ONLINE</code>. 「contactOnline」-
     * 在线联系方式
     */
    @Override
    public String getContactOnline() {
        return this.contactOnline;
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.CONTACT_ONLINE</code>. 「contactOnline」-
     * 在线联系方式
     */
    @Override
    public ECustomer setContactOnline(String contactOnline) {
        this.contactOnline = contactOnline;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.TITLE</code>. 「title」- 客户显示标题
     */
    @Override
    public String getTitle() {
        return this.title;
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.TITLE</code>. 「title」- 客户显示标题
     */
    @Override
    public ECustomer setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.COMMENT</code>. 「comment」- 客户备注
     */
    @Override
    public String getComment() {
        return this.comment;
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.COMMENT</code>. 「comment」- 客户备注
     */
    @Override
    public ECustomer setComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.EMAIL</code>. 「email」- 企业邮箱
     */
    @Override
    public String getEmail() {
        return this.email;
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.EMAIL</code>. 「email」- 企业邮箱
     */
    @Override
    public ECustomer setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.FAX</code>. 「fax」- 传真号
     */
    @Override
    public String getFax() {
        return this.fax;
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.FAX</code>. 「fax」- 传真号
     */
    @Override
    public ECustomer setFax(String fax) {
        this.fax = fax;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.HOMEPAGE</code>. 「homepage」- 客户主页
     */
    @Override
    public String getHomepage() {
        return this.homepage;
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.HOMEPAGE</code>. 「homepage」- 客户主页
     */
    @Override
    public ECustomer setHomepage(String homepage) {
        this.homepage = homepage;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.LOGO</code>. 「logo」- 附件对应的 attachment Key
     */
    @Override
    public String getLogo() {
        return this.logo;
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.LOGO</code>. 「logo」- 附件对应的 attachment Key
     */
    @Override
    public ECustomer setLogo(String logo) {
        this.logo = logo;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.PHONE</code>. 「phone」- 客户座机
     */
    @Override
    public String getPhone() {
        return this.phone;
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.PHONE</code>. 「phone」- 客户座机
     */
    @Override
    public ECustomer setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.ADDRESS</code>. 「address」- 客户地址
     */
    @Override
    public String getAddress() {
        return this.address;
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.ADDRESS</code>. 「address」- 客户地址
     */
    @Override
    public ECustomer setAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.SIGN_NAME</code>. 「signName」- 签单人姓名
     */
    @Override
    public String getSignName() {
        return this.signName;
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.SIGN_NAME</code>. 「signName」- 签单人姓名
     */
    @Override
    public ECustomer setSignName(String signName) {
        this.signName = signName;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.SIGN_PHONE</code>. 「signPhone」- 签单人电话
     */
    @Override
    public String getSignPhone() {
        return this.signPhone;
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.SIGN_PHONE</code>. 「signPhone」- 签单人电话
     */
    @Override
    public ECustomer setSignPhone(String signPhone) {
        this.signPhone = signPhone;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.RUN_UP</code>. 「runUp」- 挂账属性
     */
    @Override
    public Boolean getRunUp() {
        return this.runUp;
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.RUN_UP</code>. 「runUp」- 挂账属性
     */
    @Override
    public ECustomer setRunUp(Boolean runUp) {
        this.runUp = runUp;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.RUN_UP_AMOUNT</code>. 「runUpAmount」- 挂账限额
     */
    @Override
    public BigDecimal getRunUpAmount() {
        return this.runUpAmount;
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.RUN_UP_AMOUNT</code>. 「runUpAmount」- 挂账限额
     */
    @Override
    public ECustomer setRunUpAmount(BigDecimal runUpAmount) {
        this.runUpAmount = runUpAmount;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.BANK_ID</code>. 「bankId」- 开户行
     */
    @Override
    public String getBankId() {
        return this.bankId;
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.BANK_ID</code>. 「bankId」- 开户行
     */
    @Override
    public ECustomer setBankId(String bankId) {
        this.bankId = bankId;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.BANK_CARD</code>. 「bankCard」- 开户行账号
     */
    @Override
    public String getBankCard() {
        return this.bankCard;
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.BANK_CARD</code>. 「bankCard」- 开户行账号
     */
    @Override
    public ECustomer setBankCard(String bankCard) {
        this.bankCard = bankCard;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public ECustomer setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public ECustomer setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.SIGMA</code>. 「sigma」- 统一标识（客户所属应用）
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.SIGMA</code>. 「sigma」- 统一标识（客户所属应用）
     */
    @Override
    public ECustomer setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public ECustomer setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public ECustomer setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public ECustomer setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public ECustomer setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public ECustomer setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
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
        final ECustomer other = (ECustomer) obj;
        if (this.key == null) {
            if (other.key != null)
                return false;
        }
        else if (!this.key.equals(other.key))
            return false;
        if (this.name == null) {
            if (other.name != null)
                return false;
        }
        else if (!this.name.equals(other.name))
            return false;
        if (this.code == null) {
            if (other.code != null)
                return false;
        }
        else if (!this.code.equals(other.code))
            return false;
        if (this.type == null) {
            if (other.type != null)
                return false;
        }
        else if (!this.type.equals(other.type))
            return false;
        if (this.status == null) {
            if (other.status != null)
                return false;
        }
        else if (!this.status.equals(other.status))
            return false;
        if (this.taxCode == null) {
            if (other.taxCode != null)
                return false;
        }
        else if (!this.taxCode.equals(other.taxCode))
            return false;
        if (this.taxTitle == null) {
            if (other.taxTitle != null)
                return false;
        }
        else if (!this.taxTitle.equals(other.taxTitle))
            return false;
        if (this.contactName == null) {
            if (other.contactName != null)
                return false;
        }
        else if (!this.contactName.equals(other.contactName))
            return false;
        if (this.contactPhone == null) {
            if (other.contactPhone != null)
                return false;
        }
        else if (!this.contactPhone.equals(other.contactPhone))
            return false;
        if (this.contactEmail == null) {
            if (other.contactEmail != null)
                return false;
        }
        else if (!this.contactEmail.equals(other.contactEmail))
            return false;
        if (this.contactOnline == null) {
            if (other.contactOnline != null)
                return false;
        }
        else if (!this.contactOnline.equals(other.contactOnline))
            return false;
        if (this.title == null) {
            if (other.title != null)
                return false;
        }
        else if (!this.title.equals(other.title))
            return false;
        if (this.comment == null) {
            if (other.comment != null)
                return false;
        }
        else if (!this.comment.equals(other.comment))
            return false;
        if (this.email == null) {
            if (other.email != null)
                return false;
        }
        else if (!this.email.equals(other.email))
            return false;
        if (this.fax == null) {
            if (other.fax != null)
                return false;
        }
        else if (!this.fax.equals(other.fax))
            return false;
        if (this.homepage == null) {
            if (other.homepage != null)
                return false;
        }
        else if (!this.homepage.equals(other.homepage))
            return false;
        if (this.logo == null) {
            if (other.logo != null)
                return false;
        }
        else if (!this.logo.equals(other.logo))
            return false;
        if (this.phone == null) {
            if (other.phone != null)
                return false;
        }
        else if (!this.phone.equals(other.phone))
            return false;
        if (this.address == null) {
            if (other.address != null)
                return false;
        }
        else if (!this.address.equals(other.address))
            return false;
        if (this.signName == null) {
            if (other.signName != null)
                return false;
        }
        else if (!this.signName.equals(other.signName))
            return false;
        if (this.signPhone == null) {
            if (other.signPhone != null)
                return false;
        }
        else if (!this.signPhone.equals(other.signPhone))
            return false;
        if (this.runUp == null) {
            if (other.runUp != null)
                return false;
        }
        else if (!this.runUp.equals(other.runUp))
            return false;
        if (this.runUpAmount == null) {
            if (other.runUpAmount != null)
                return false;
        }
        else if (!this.runUpAmount.equals(other.runUpAmount))
            return false;
        if (this.bankId == null) {
            if (other.bankId != null)
                return false;
        }
        else if (!this.bankId.equals(other.bankId))
            return false;
        if (this.bankCard == null) {
            if (other.bankCard != null)
                return false;
        }
        else if (!this.bankCard.equals(other.bankCard))
            return false;
        if (this.metadata == null) {
            if (other.metadata != null)
                return false;
        }
        else if (!this.metadata.equals(other.metadata))
            return false;
        if (this.active == null) {
            if (other.active != null)
                return false;
        }
        else if (!this.active.equals(other.active))
            return false;
        if (this.sigma == null) {
            if (other.sigma != null)
                return false;
        }
        else if (!this.sigma.equals(other.sigma))
            return false;
        if (this.language == null) {
            if (other.language != null)
                return false;
        }
        else if (!this.language.equals(other.language))
            return false;
        if (this.createdAt == null) {
            if (other.createdAt != null)
                return false;
        }
        else if (!this.createdAt.equals(other.createdAt))
            return false;
        if (this.createdBy == null) {
            if (other.createdBy != null)
                return false;
        }
        else if (!this.createdBy.equals(other.createdBy))
            return false;
        if (this.updatedAt == null) {
            if (other.updatedAt != null)
                return false;
        }
        else if (!this.updatedAt.equals(other.updatedAt))
            return false;
        if (this.updatedBy == null) {
            if (other.updatedBy != null)
                return false;
        }
        else if (!this.updatedBy.equals(other.updatedBy))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.key == null) ? 0 : this.key.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.code == null) ? 0 : this.code.hashCode());
        result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.taxCode == null) ? 0 : this.taxCode.hashCode());
        result = prime * result + ((this.taxTitle == null) ? 0 : this.taxTitle.hashCode());
        result = prime * result + ((this.contactName == null) ? 0 : this.contactName.hashCode());
        result = prime * result + ((this.contactPhone == null) ? 0 : this.contactPhone.hashCode());
        result = prime * result + ((this.contactEmail == null) ? 0 : this.contactEmail.hashCode());
        result = prime * result + ((this.contactOnline == null) ? 0 : this.contactOnline.hashCode());
        result = prime * result + ((this.title == null) ? 0 : this.title.hashCode());
        result = prime * result + ((this.comment == null) ? 0 : this.comment.hashCode());
        result = prime * result + ((this.email == null) ? 0 : this.email.hashCode());
        result = prime * result + ((this.fax == null) ? 0 : this.fax.hashCode());
        result = prime * result + ((this.homepage == null) ? 0 : this.homepage.hashCode());
        result = prime * result + ((this.logo == null) ? 0 : this.logo.hashCode());
        result = prime * result + ((this.phone == null) ? 0 : this.phone.hashCode());
        result = prime * result + ((this.address == null) ? 0 : this.address.hashCode());
        result = prime * result + ((this.signName == null) ? 0 : this.signName.hashCode());
        result = prime * result + ((this.signPhone == null) ? 0 : this.signPhone.hashCode());
        result = prime * result + ((this.runUp == null) ? 0 : this.runUp.hashCode());
        result = prime * result + ((this.runUpAmount == null) ? 0 : this.runUpAmount.hashCode());
        result = prime * result + ((this.bankId == null) ? 0 : this.bankId.hashCode());
        result = prime * result + ((this.bankCard == null) ? 0 : this.bankCard.hashCode());
        result = prime * result + ((this.metadata == null) ? 0 : this.metadata.hashCode());
        result = prime * result + ((this.active == null) ? 0 : this.active.hashCode());
        result = prime * result + ((this.sigma == null) ? 0 : this.sigma.hashCode());
        result = prime * result + ((this.language == null) ? 0 : this.language.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.updatedAt == null) ? 0 : this.updatedAt.hashCode());
        result = prime * result + ((this.updatedBy == null) ? 0 : this.updatedBy.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ECustomer (");

        sb.append(key);
        sb.append(", ").append(name);
        sb.append(", ").append(code);
        sb.append(", ").append(type);
        sb.append(", ").append(status);
        sb.append(", ").append(taxCode);
        sb.append(", ").append(taxTitle);
        sb.append(", ").append(contactName);
        sb.append(", ").append(contactPhone);
        sb.append(", ").append(contactEmail);
        sb.append(", ").append(contactOnline);
        sb.append(", ").append(title);
        sb.append(", ").append(comment);
        sb.append(", ").append(email);
        sb.append(", ").append(fax);
        sb.append(", ").append(homepage);
        sb.append(", ").append(logo);
        sb.append(", ").append(phone);
        sb.append(", ").append(address);
        sb.append(", ").append(signName);
        sb.append(", ").append(signPhone);
        sb.append(", ").append(runUp);
        sb.append(", ").append(runUpAmount);
        sb.append(", ").append(bankId);
        sb.append(", ").append(bankCard);
        sb.append(", ").append(metadata);
        sb.append(", ").append(active);
        sb.append(", ").append(sigma);
        sb.append(", ").append(language);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(updatedAt);
        sb.append(", ").append(updatedBy);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IECustomer from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setType(from.getType());
        setStatus(from.getStatus());
        setTaxCode(from.getTaxCode());
        setTaxTitle(from.getTaxTitle());
        setContactName(from.getContactName());
        setContactPhone(from.getContactPhone());
        setContactEmail(from.getContactEmail());
        setContactOnline(from.getContactOnline());
        setTitle(from.getTitle());
        setComment(from.getComment());
        setEmail(from.getEmail());
        setFax(from.getFax());
        setHomepage(from.getHomepage());
        setLogo(from.getLogo());
        setPhone(from.getPhone());
        setAddress(from.getAddress());
        setSignName(from.getSignName());
        setSignPhone(from.getSignPhone());
        setRunUp(from.getRunUp());
        setRunUpAmount(from.getRunUpAmount());
        setBankId(from.getBankId());
        setBankCard(from.getBankCard());
        setMetadata(from.getMetadata());
        setActive(from.getActive());
        setSigma(from.getSigma());
        setLanguage(from.getLanguage());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    @Override
    public <E extends IECustomer> E into(E into) {
        into.from(this);
        return into;
    }
}
