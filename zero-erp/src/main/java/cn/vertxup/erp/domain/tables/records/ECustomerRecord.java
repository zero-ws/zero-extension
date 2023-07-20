/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.records;


import cn.vertxup.erp.domain.tables.ECustomer;
import cn.vertxup.erp.domain.tables.interfaces.IECustomer;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ECustomerRecord extends UpdatableRecordImpl<ECustomerRecord> implements VertxPojo, IECustomer {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>ZDB.E_CUSTOMER.KEY</code>. 「key」- 客户ID
     */
    @Override
    public ECustomerRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.KEY</code>. 「key」- 客户ID
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.NAME</code>. 「name」- 客户名称
     */
    @Override
    public ECustomerRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.NAME</code>. 「name」- 客户名称
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.CODE</code>. 「code」- 客户编号
     */
    @Override
    public ECustomerRecord setCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.CODE</code>. 「code」- 客户编号
     */
    @Override
    public String getCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.TYPE</code>. 「type」- 客户分类（不同类型代表不同客户）
     */
    @Override
    public ECustomerRecord setType(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.TYPE</code>. 「type」- 客户分类（不同类型代表不同客户）
     */
    @Override
    public String getType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.STATUS</code>. 「status」- 客户状态
     */
    @Override
    public ECustomerRecord setStatus(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.STATUS</code>. 「status」- 客户状态
     */
    @Override
    public String getStatus() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.TAX_CODE</code>. 「taxCode」- 税号
     */
    @Override
    public ECustomerRecord setTaxCode(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.TAX_CODE</code>. 「taxCode」- 税号
     */
    @Override
    public String getTaxCode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.TAX_TITLE</code>. 「taxTitle」- 开票抬头
     */
    @Override
    public ECustomerRecord setTaxTitle(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.TAX_TITLE</code>. 「taxTitle」- 开票抬头
     */
    @Override
    public String getTaxTitle() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.CONTACT_NAME</code>. 「contactName」- 联系人姓名
     */
    @Override
    public ECustomerRecord setContactName(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.CONTACT_NAME</code>. 「contactName」- 联系人姓名
     */
    @Override
    public String getContactName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.CONTACT_PHONE</code>. 「contactPhone」-
     * 联系人电话
     */
    @Override
    public ECustomerRecord setContactPhone(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.CONTACT_PHONE</code>. 「contactPhone」-
     * 联系人电话
     */
    @Override
    public String getContactPhone() {
        return (String) get(8);
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.CONTACT_EMAIL</code>. 「contactEmail」-
     * 联系人Email
     */
    @Override
    public ECustomerRecord setContactEmail(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.CONTACT_EMAIL</code>. 「contactEmail」-
     * 联系人Email
     */
    @Override
    public String getContactEmail() {
        return (String) get(9);
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.CONTACT_ONLINE</code>. 「contactOnline」-
     * 在线联系方式
     */
    @Override
    public ECustomerRecord setContactOnline(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.CONTACT_ONLINE</code>. 「contactOnline」-
     * 在线联系方式
     */
    @Override
    public String getContactOnline() {
        return (String) get(10);
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.TITLE</code>. 「title」- 客户显示标题
     */
    @Override
    public ECustomerRecord setTitle(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.TITLE</code>. 「title」- 客户显示标题
     */
    @Override
    public String getTitle() {
        return (String) get(11);
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.COMMENT</code>. 「comment」- 客户备注
     */
    @Override
    public ECustomerRecord setComment(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.COMMENT</code>. 「comment」- 客户备注
     */
    @Override
    public String getComment() {
        return (String) get(12);
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.EMAIL</code>. 「email」- 企业邮箱
     */
    @Override
    public ECustomerRecord setEmail(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.EMAIL</code>. 「email」- 企业邮箱
     */
    @Override
    public String getEmail() {
        return (String) get(13);
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.FAX</code>. 「fax」- 传真号
     */
    @Override
    public ECustomerRecord setFax(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.FAX</code>. 「fax」- 传真号
     */
    @Override
    public String getFax() {
        return (String) get(14);
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.HOMEPAGE</code>. 「homepage」- 客户主页
     */
    @Override
    public ECustomerRecord setHomepage(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.HOMEPAGE</code>. 「homepage」- 客户主页
     */
    @Override
    public String getHomepage() {
        return (String) get(15);
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.LOGO</code>. 「logo」- 附件对应的 attachment Key
     */
    @Override
    public ECustomerRecord setLogo(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.LOGO</code>. 「logo」- 附件对应的 attachment Key
     */
    @Override
    public String getLogo() {
        return (String) get(16);
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.PHONE</code>. 「phone」- 客户座机
     */
    @Override
    public ECustomerRecord setPhone(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.PHONE</code>. 「phone」- 客户座机
     */
    @Override
    public String getPhone() {
        return (String) get(17);
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.ADDRESS</code>. 「address」- 客户地址
     */
    @Override
    public ECustomerRecord setAddress(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.ADDRESS</code>. 「address」- 客户地址
     */
    @Override
    public String getAddress() {
        return (String) get(18);
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.SIGN_NAME</code>. 「signName」- 签单人姓名
     */
    @Override
    public ECustomerRecord setSignName(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.SIGN_NAME</code>. 「signName」- 签单人姓名
     */
    @Override
    public String getSignName() {
        return (String) get(19);
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.SIGN_PHONE</code>. 「signPhone」- 签单人电话
     */
    @Override
    public ECustomerRecord setSignPhone(String value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.SIGN_PHONE</code>. 「signPhone」- 签单人电话
     */
    @Override
    public String getSignPhone() {
        return (String) get(20);
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.RUN_UP</code>. 「runUp」- 挂账属性
     */
    @Override
    public ECustomerRecord setRunUp(Boolean value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.RUN_UP</code>. 「runUp」- 挂账属性
     */
    @Override
    public Boolean getRunUp() {
        return (Boolean) get(21);
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.RUN_UP_AMOUNT</code>. 「runUpAmount」- 挂账限额
     */
    @Override
    public ECustomerRecord setRunUpAmount(BigDecimal value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.RUN_UP_AMOUNT</code>. 「runUpAmount」- 挂账限额
     */
    @Override
    public BigDecimal getRunUpAmount() {
        return (BigDecimal) get(22);
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.BANK_ID</code>. 「bankId」- 开户行
     */
    @Override
    public ECustomerRecord setBankId(String value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.BANK_ID</code>. 「bankId」- 开户行
     */
    @Override
    public String getBankId() {
        return (String) get(23);
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.BANK_CARD</code>. 「bankCard」- 开户行账号
     */
    @Override
    public ECustomerRecord setBankCard(String value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.BANK_CARD</code>. 「bankCard」- 开户行账号
     */
    @Override
    public String getBankCard() {
        return (String) get(24);
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public ECustomerRecord setMetadata(String value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(25);
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public ECustomerRecord setActive(Boolean value) {
        set(26, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(26);
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.SIGMA</code>. 「sigma」- 统一标识（客户所属应用）
     */
    @Override
    public ECustomerRecord setSigma(String value) {
        set(27, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.SIGMA</code>. 「sigma」- 统一标识（客户所属应用）
     */
    @Override
    public String getSigma() {
        return (String) get(27);
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public ECustomerRecord setLanguage(String value) {
        set(28, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(28);
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public ECustomerRecord setCreatedAt(LocalDateTime value) {
        set(29, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(29);
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public ECustomerRecord setCreatedBy(String value) {
        set(30, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(30);
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public ECustomerRecord setUpdatedAt(LocalDateTime value) {
        set(31, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(31);
    }

    /**
     * Setter for <code>ZDB.E_CUSTOMER.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public ECustomerRecord setUpdatedBy(String value) {
        set(32, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.E_CUSTOMER.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(32);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
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
        resetChangedOnNotNull();
    }

    @Override
    public <E extends IECustomer> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ECustomerRecord
     */
    public ECustomerRecord() {
        super(ECustomer.E_CUSTOMER);
    }

    /**
     * Create a detached, initialised ECustomerRecord
     */
    public ECustomerRecord(String key, String name, String code, String type, String status, String taxCode, String taxTitle, String contactName, String contactPhone, String contactEmail, String contactOnline, String title, String comment, String email, String fax, String homepage, String logo, String phone, String address, String signName, String signPhone, Boolean runUp, BigDecimal runUpAmount, String bankId, String bankCard, String metadata, Boolean active, String sigma, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(ECustomer.E_CUSTOMER);

        setKey(key);
        setName(name);
        setCode(code);
        setType(type);
        setStatus(status);
        setTaxCode(taxCode);
        setTaxTitle(taxTitle);
        setContactName(contactName);
        setContactPhone(contactPhone);
        setContactEmail(contactEmail);
        setContactOnline(contactOnline);
        setTitle(title);
        setComment(comment);
        setEmail(email);
        setFax(fax);
        setHomepage(homepage);
        setLogo(logo);
        setPhone(phone);
        setAddress(address);
        setSignName(signName);
        setSignPhone(signPhone);
        setRunUp(runUp);
        setRunUpAmount(runUpAmount);
        setBankId(bankId);
        setBankCard(bankCard);
        setMetadata(metadata);
        setActive(active);
        setSigma(sigma);
        setLanguage(language);
        setCreatedAt(createdAt);
        setCreatedBy(createdBy);
        setUpdatedAt(updatedAt);
        setUpdatedBy(updatedBy);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised ECustomerRecord
     */
    public ECustomerRecord(cn.vertxup.erp.domain.tables.pojos.ECustomer value) {
        super(ECustomer.E_CUSTOMER);

        if (value != null) {
            setKey(value.getKey());
            setName(value.getName());
            setCode(value.getCode());
            setType(value.getType());
            setStatus(value.getStatus());
            setTaxCode(value.getTaxCode());
            setTaxTitle(value.getTaxTitle());
            setContactName(value.getContactName());
            setContactPhone(value.getContactPhone());
            setContactEmail(value.getContactEmail());
            setContactOnline(value.getContactOnline());
            setTitle(value.getTitle());
            setComment(value.getComment());
            setEmail(value.getEmail());
            setFax(value.getFax());
            setHomepage(value.getHomepage());
            setLogo(value.getLogo());
            setPhone(value.getPhone());
            setAddress(value.getAddress());
            setSignName(value.getSignName());
            setSignPhone(value.getSignPhone());
            setRunUp(value.getRunUp());
            setRunUpAmount(value.getRunUpAmount());
            setBankId(value.getBankId());
            setBankCard(value.getBankCard());
            setMetadata(value.getMetadata());
            setActive(value.getActive());
            setSigma(value.getSigma());
            setLanguage(value.getLanguage());
            setCreatedAt(value.getCreatedAt());
            setCreatedBy(value.getCreatedBy());
            setUpdatedAt(value.getUpdatedAt());
            setUpdatedBy(value.getUpdatedBy());
            resetChangedOnNotNull();
        }
    }

        public ECustomerRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
