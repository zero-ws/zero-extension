/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.erp.domain.tables.pojos;


import io.zerows.extension.commerce.erp.domain.tables.interfaces.IEIdentity;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EIdentity implements VertxPojo, IEIdentity {

    private static final long serialVersionUID = 1L;

    private String key;
    private String code;
    private String type;
    private String status;
    private String country;
    private String nativePlace;
    private String nation;
    private String address;
    private String realname;
    private LocalDateTime birthday;
    private String driverLicense;
    private String carPlate;
    private String passport;
    private Boolean gender;
    private String marital;
    private String contactMobile;
    private String contactPhone;
    private String contactAddress;
    private String contactEmail;
    private String urgentName;
    private String urgentPhone;
    private String ecQq;
    private String ecAlipay;
    private String ecWechat;
    private String idcType;
    private String idcNumber;
    private String idcAddress;
    private LocalDateTime idcExpiredAt;
    private String idcFront;
    private String idcBack;
    private String idcIssuer;
    private LocalDateTime idcIssueAt;
    private Boolean verified;
    private String metadata;
    private Boolean active;
    private String sigma;
    private String language;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public EIdentity() {}

    public EIdentity(IEIdentity value) {
        this.key = value.getKey();
        this.code = value.getCode();
        this.type = value.getType();
        this.status = value.getStatus();
        this.country = value.getCountry();
        this.nativePlace = value.getNativePlace();
        this.nation = value.getNation();
        this.address = value.getAddress();
        this.realname = value.getRealname();
        this.birthday = value.getBirthday();
        this.driverLicense = value.getDriverLicense();
        this.carPlate = value.getCarPlate();
        this.passport = value.getPassport();
        this.gender = value.getGender();
        this.marital = value.getMarital();
        this.contactMobile = value.getContactMobile();
        this.contactPhone = value.getContactPhone();
        this.contactAddress = value.getContactAddress();
        this.contactEmail = value.getContactEmail();
        this.urgentName = value.getUrgentName();
        this.urgentPhone = value.getUrgentPhone();
        this.ecQq = value.getEcQq();
        this.ecAlipay = value.getEcAlipay();
        this.ecWechat = value.getEcWechat();
        this.idcType = value.getIdcType();
        this.idcNumber = value.getIdcNumber();
        this.idcAddress = value.getIdcAddress();
        this.idcExpiredAt = value.getIdcExpiredAt();
        this.idcFront = value.getIdcFront();
        this.idcBack = value.getIdcBack();
        this.idcIssuer = value.getIdcIssuer();
        this.idcIssueAt = value.getIdcIssueAt();
        this.verified = value.getVerified();
        this.metadata = value.getMetadata();
        this.active = value.getActive();
        this.sigma = value.getSigma();
        this.language = value.getLanguage();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public EIdentity(
        String key,
        String code,
        String type,
        String status,
        String country,
        String nativePlace,
        String nation,
        String address,
        String realname,
        LocalDateTime birthday,
        String driverLicense,
        String carPlate,
        String passport,
        Boolean gender,
        String marital,
        String contactMobile,
        String contactPhone,
        String contactAddress,
        String contactEmail,
        String urgentName,
        String urgentPhone,
        String ecQq,
        String ecAlipay,
        String ecWechat,
        String idcType,
        String idcNumber,
        String idcAddress,
        LocalDateTime idcExpiredAt,
        String idcFront,
        String idcBack,
        String idcIssuer,
        LocalDateTime idcIssueAt,
        Boolean verified,
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
        this.code = code;
        this.type = type;
        this.status = status;
        this.country = country;
        this.nativePlace = nativePlace;
        this.nation = nation;
        this.address = address;
        this.realname = realname;
        this.birthday = birthday;
        this.driverLicense = driverLicense;
        this.carPlate = carPlate;
        this.passport = passport;
        this.gender = gender;
        this.marital = marital;
        this.contactMobile = contactMobile;
        this.contactPhone = contactPhone;
        this.contactAddress = contactAddress;
        this.contactEmail = contactEmail;
        this.urgentName = urgentName;
        this.urgentPhone = urgentPhone;
        this.ecQq = ecQq;
        this.ecAlipay = ecAlipay;
        this.ecWechat = ecWechat;
        this.idcType = idcType;
        this.idcNumber = idcNumber;
        this.idcAddress = idcAddress;
        this.idcExpiredAt = idcExpiredAt;
        this.idcFront = idcFront;
        this.idcBack = idcBack;
        this.idcIssuer = idcIssuer;
        this.idcIssueAt = idcIssueAt;
        this.verified = verified;
        this.metadata = metadata;
        this.active = active;
        this.sigma = sigma;
        this.language = language;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public EIdentity(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>ZDB.E_IDENTITY.KEY</code>. 「key」- 身份主键
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>ZDB.E_IDENTITY.KEY</code>. 「key」- 身份主键
     */
    @Override
    public EIdentity setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_IDENTITY.CODE</code>. 「code」- 系统编号
     */
    @Override
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>ZDB.E_IDENTITY.CODE</code>. 「code」- 系统编号
     */
    @Override
    public EIdentity setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_IDENTITY.TYPE</code>. 「type」- 身份类型/档案类型
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>ZDB.E_IDENTITY.TYPE</code>. 「type」- 身份类型/档案类型
     */
    @Override
    public EIdentity setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_IDENTITY.STATUS</code>. 「status」- 档案状态
     */
    @Override
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>ZDB.E_IDENTITY.STATUS</code>. 「status」- 档案状态
     */
    @Override
    public EIdentity setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_IDENTITY.COUNTRY</code>. 「country」- 国籍
     */
    @Override
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for <code>ZDB.E_IDENTITY.COUNTRY</code>. 「country」- 国籍
     */
    @Override
    public EIdentity setCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_IDENTITY.NATIVE_PLACE</code>. 「nativePlace」- 籍贯
     */
    @Override
    public String getNativePlace() {
        return this.nativePlace;
    }

    /**
     * Setter for <code>ZDB.E_IDENTITY.NATIVE_PLACE</code>. 「nativePlace」- 籍贯
     */
    @Override
    public EIdentity setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_IDENTITY.NATION</code>. 「nation」- 民族
     */
    @Override
    public String getNation() {
        return this.nation;
    }

    /**
     * Setter for <code>ZDB.E_IDENTITY.NATION</code>. 「nation」- 民族
     */
    @Override
    public EIdentity setNation(String nation) {
        this.nation = nation;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_IDENTITY.ADDRESS</code>. 「address」- 居住地址
     */
    @Override
    public String getAddress() {
        return this.address;
    }

    /**
     * Setter for <code>ZDB.E_IDENTITY.ADDRESS</code>. 「address」- 居住地址
     */
    @Override
    public EIdentity setAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_IDENTITY.REALNAME</code>. 「realname」- 真实姓名
     */
    @Override
    public String getRealname() {
        return this.realname;
    }

    /**
     * Setter for <code>ZDB.E_IDENTITY.REALNAME</code>. 「realname」- 真实姓名
     */
    @Override
    public EIdentity setRealname(String realname) {
        this.realname = realname;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_IDENTITY.BIRTHDAY</code>. 「birthday」- 生日
     */
    @Override
    public LocalDateTime getBirthday() {
        return this.birthday;
    }

    /**
     * Setter for <code>ZDB.E_IDENTITY.BIRTHDAY</code>. 「birthday」- 生日
     */
    @Override
    public EIdentity setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_IDENTITY.DRIVER_LICENSE</code>. 「driverLicense」-
     * 驾驶证
     */
    @Override
    public String getDriverLicense() {
        return this.driverLicense;
    }

    /**
     * Setter for <code>ZDB.E_IDENTITY.DRIVER_LICENSE</code>. 「driverLicense」-
     * 驾驶证
     */
    @Override
    public EIdentity setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_IDENTITY.CAR_PLATE</code>. 「carPlate」- 常用车牌
     */
    @Override
    public String getCarPlate() {
        return this.carPlate;
    }

    /**
     * Setter for <code>ZDB.E_IDENTITY.CAR_PLATE</code>. 「carPlate」- 常用车牌
     */
    @Override
    public EIdentity setCarPlate(String carPlate) {
        this.carPlate = carPlate;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_IDENTITY.PASSPORT</code>. 「passport」- 护照
     */
    @Override
    public String getPassport() {
        return this.passport;
    }

    /**
     * Setter for <code>ZDB.E_IDENTITY.PASSPORT</code>. 「passport」- 护照
     */
    @Override
    public EIdentity setPassport(String passport) {
        this.passport = passport;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_IDENTITY.GENDER</code>. 「gender」- 性别
     */
    @Override
    public Boolean getGender() {
        return this.gender;
    }

    /**
     * Setter for <code>ZDB.E_IDENTITY.GENDER</code>. 「gender」- 性别
     */
    @Override
    public EIdentity setGender(Boolean gender) {
        this.gender = gender;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_IDENTITY.MARITAL</code>. 「marital」- 婚姻状况
     */
    @Override
    public String getMarital() {
        return this.marital;
    }

    /**
     * Setter for <code>ZDB.E_IDENTITY.MARITAL</code>. 「marital」- 婚姻状况
     */
    @Override
    public EIdentity setMarital(String marital) {
        this.marital = marital;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_IDENTITY.CONTACT_MOBILE</code>. 「contactMobile」-
     * 联系手机
     */
    @Override
    public String getContactMobile() {
        return this.contactMobile;
    }

    /**
     * Setter for <code>ZDB.E_IDENTITY.CONTACT_MOBILE</code>. 「contactMobile」-
     * 联系手机
     */
    @Override
    public EIdentity setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_IDENTITY.CONTACT_PHONE</code>. 「contactPhone」- 座机
     */
    @Override
    public String getContactPhone() {
        return this.contactPhone;
    }

    /**
     * Setter for <code>ZDB.E_IDENTITY.CONTACT_PHONE</code>. 「contactPhone」- 座机
     */
    @Override
    public EIdentity setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_IDENTITY.CONTACT_ADDRESS</code>. 「contactAddress」-
     * 联系地址
     */
    @Override
    public String getContactAddress() {
        return this.contactAddress;
    }

    /**
     * Setter for <code>ZDB.E_IDENTITY.CONTACT_ADDRESS</code>. 「contactAddress」-
     * 联系地址
     */
    @Override
    public EIdentity setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_IDENTITY.CONTACT_EMAIL</code>. 「contactEmail」-
     * 联系Email
     */
    @Override
    public String getContactEmail() {
        return this.contactEmail;
    }

    /**
     * Setter for <code>ZDB.E_IDENTITY.CONTACT_EMAIL</code>. 「contactEmail」-
     * 联系Email
     */
    @Override
    public EIdentity setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_IDENTITY.URGENT_NAME</code>. 「urgentName」- 紧急联系人
     */
    @Override
    public String getUrgentName() {
        return this.urgentName;
    }

    /**
     * Setter for <code>ZDB.E_IDENTITY.URGENT_NAME</code>. 「urgentName」- 紧急联系人
     */
    @Override
    public EIdentity setUrgentName(String urgentName) {
        this.urgentName = urgentName;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_IDENTITY.URGENT_PHONE</code>. 「urgentPhone」-
     * 紧急联系电话
     */
    @Override
    public String getUrgentPhone() {
        return this.urgentPhone;
    }

    /**
     * Setter for <code>ZDB.E_IDENTITY.URGENT_PHONE</code>. 「urgentPhone」-
     * 紧急联系电话
     */
    @Override
    public EIdentity setUrgentPhone(String urgentPhone) {
        this.urgentPhone = urgentPhone;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_IDENTITY.EC_QQ</code>. 「ecQq」- QQ号码
     */
    @Override
    public String getEcQq() {
        return this.ecQq;
    }

    /**
     * Setter for <code>ZDB.E_IDENTITY.EC_QQ</code>. 「ecQq」- QQ号码
     */
    @Override
    public EIdentity setEcQq(String ecQq) {
        this.ecQq = ecQq;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_IDENTITY.EC_ALIPAY</code>. 「ecAlipay」- 支付宝
     */
    @Override
    public String getEcAlipay() {
        return this.ecAlipay;
    }

    /**
     * Setter for <code>ZDB.E_IDENTITY.EC_ALIPAY</code>. 「ecAlipay」- 支付宝
     */
    @Override
    public EIdentity setEcAlipay(String ecAlipay) {
        this.ecAlipay = ecAlipay;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_IDENTITY.EC_WECHAT</code>. 「ecWechat」- 微信
     */
    @Override
    public String getEcWechat() {
        return this.ecWechat;
    }

    /**
     * Setter for <code>ZDB.E_IDENTITY.EC_WECHAT</code>. 「ecWechat」- 微信
     */
    @Override
    public EIdentity setEcWechat(String ecWechat) {
        this.ecWechat = ecWechat;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_IDENTITY.IDC_TYPE</code>. 「idcType」- 证件类型
     */
    @Override
    public String getIdcType() {
        return this.idcType;
    }

    /**
     * Setter for <code>ZDB.E_IDENTITY.IDC_TYPE</code>. 「idcType」- 证件类型
     */
    @Override
    public EIdentity setIdcType(String idcType) {
        this.idcType = idcType;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_IDENTITY.IDC_NUMBER</code>. 「idcNumber」- 证件号
     */
    @Override
    public String getIdcNumber() {
        return this.idcNumber;
    }

    /**
     * Setter for <code>ZDB.E_IDENTITY.IDC_NUMBER</code>. 「idcNumber」- 证件号
     */
    @Override
    public EIdentity setIdcNumber(String idcNumber) {
        this.idcNumber = idcNumber;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_IDENTITY.IDC_ADDRESS</code>. 「idcAddress」- 证件地址
     */
    @Override
    public String getIdcAddress() {
        return this.idcAddress;
    }

    /**
     * Setter for <code>ZDB.E_IDENTITY.IDC_ADDRESS</code>. 「idcAddress」- 证件地址
     */
    @Override
    public EIdentity setIdcAddress(String idcAddress) {
        this.idcAddress = idcAddress;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_IDENTITY.IDC_EXPIRED_AT</code>. 「idcExpiredAt」-
     * 证件过期时间
     */
    @Override
    public LocalDateTime getIdcExpiredAt() {
        return this.idcExpiredAt;
    }

    /**
     * Setter for <code>ZDB.E_IDENTITY.IDC_EXPIRED_AT</code>. 「idcExpiredAt」-
     * 证件过期时间
     */
    @Override
    public EIdentity setIdcExpiredAt(LocalDateTime idcExpiredAt) {
        this.idcExpiredAt = idcExpiredAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_IDENTITY.IDC_FRONT</code>. 「idcFront」- 证件正面附件
     */
    @Override
    public String getIdcFront() {
        return this.idcFront;
    }

    /**
     * Setter for <code>ZDB.E_IDENTITY.IDC_FRONT</code>. 「idcFront」- 证件正面附件
     */
    @Override
    public EIdentity setIdcFront(String idcFront) {
        this.idcFront = idcFront;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_IDENTITY.IDC_BACK</code>. 「idcBack」- 证件背面附件
     */
    @Override
    public String getIdcBack() {
        return this.idcBack;
    }

    /**
     * Setter for <code>ZDB.E_IDENTITY.IDC_BACK</code>. 「idcBack」- 证件背面附件
     */
    @Override
    public EIdentity setIdcBack(String idcBack) {
        this.idcBack = idcBack;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_IDENTITY.IDC_ISSUER</code>. 「idcIssuer」- 证件签发机构
     */
    @Override
    public String getIdcIssuer() {
        return this.idcIssuer;
    }

    /**
     * Setter for <code>ZDB.E_IDENTITY.IDC_ISSUER</code>. 「idcIssuer」- 证件签发机构
     */
    @Override
    public EIdentity setIdcIssuer(String idcIssuer) {
        this.idcIssuer = idcIssuer;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_IDENTITY.IDC_ISSUE_AT</code>. 「idcIssueAt」- 证件签发时间
     */
    @Override
    public LocalDateTime getIdcIssueAt() {
        return this.idcIssueAt;
    }

    /**
     * Setter for <code>ZDB.E_IDENTITY.IDC_ISSUE_AT</code>. 「idcIssueAt」- 证件签发时间
     */
    @Override
    public EIdentity setIdcIssueAt(LocalDateTime idcIssueAt) {
        this.idcIssueAt = idcIssueAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_IDENTITY.VERIFIED</code>. 「verified」- 是否验证、备案
     */
    @Override
    public Boolean getVerified() {
        return this.verified;
    }

    /**
     * Setter for <code>ZDB.E_IDENTITY.VERIFIED</code>. 「verified」- 是否验证、备案
     */
    @Override
    public EIdentity setVerified(Boolean verified) {
        this.verified = verified;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_IDENTITY.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>ZDB.E_IDENTITY.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public EIdentity setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_IDENTITY.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>ZDB.E_IDENTITY.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public EIdentity setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_IDENTITY.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>ZDB.E_IDENTITY.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public EIdentity setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_IDENTITY.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>ZDB.E_IDENTITY.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public EIdentity setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_IDENTITY.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>ZDB.E_IDENTITY.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public EIdentity setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_IDENTITY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>ZDB.E_IDENTITY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public EIdentity setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_IDENTITY.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>ZDB.E_IDENTITY.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public EIdentity setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.E_IDENTITY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>ZDB.E_IDENTITY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public EIdentity setUpdatedBy(String updatedBy) {
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
        final EIdentity other = (EIdentity) obj;
        if (this.key == null) {
            if (other.key != null)
                return false;
        }
        else if (!this.key.equals(other.key))
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
        if (this.country == null) {
            if (other.country != null)
                return false;
        }
        else if (!this.country.equals(other.country))
            return false;
        if (this.nativePlace == null) {
            if (other.nativePlace != null)
                return false;
        }
        else if (!this.nativePlace.equals(other.nativePlace))
            return false;
        if (this.nation == null) {
            if (other.nation != null)
                return false;
        }
        else if (!this.nation.equals(other.nation))
            return false;
        if (this.address == null) {
            if (other.address != null)
                return false;
        }
        else if (!this.address.equals(other.address))
            return false;
        if (this.realname == null) {
            if (other.realname != null)
                return false;
        }
        else if (!this.realname.equals(other.realname))
            return false;
        if (this.birthday == null) {
            if (other.birthday != null)
                return false;
        }
        else if (!this.birthday.equals(other.birthday))
            return false;
        if (this.driverLicense == null) {
            if (other.driverLicense != null)
                return false;
        }
        else if (!this.driverLicense.equals(other.driverLicense))
            return false;
        if (this.carPlate == null) {
            if (other.carPlate != null)
                return false;
        }
        else if (!this.carPlate.equals(other.carPlate))
            return false;
        if (this.passport == null) {
            if (other.passport != null)
                return false;
        }
        else if (!this.passport.equals(other.passport))
            return false;
        if (this.gender == null) {
            if (other.gender != null)
                return false;
        }
        else if (!this.gender.equals(other.gender))
            return false;
        if (this.marital == null) {
            if (other.marital != null)
                return false;
        }
        else if (!this.marital.equals(other.marital))
            return false;
        if (this.contactMobile == null) {
            if (other.contactMobile != null)
                return false;
        }
        else if (!this.contactMobile.equals(other.contactMobile))
            return false;
        if (this.contactPhone == null) {
            if (other.contactPhone != null)
                return false;
        }
        else if (!this.contactPhone.equals(other.contactPhone))
            return false;
        if (this.contactAddress == null) {
            if (other.contactAddress != null)
                return false;
        }
        else if (!this.contactAddress.equals(other.contactAddress))
            return false;
        if (this.contactEmail == null) {
            if (other.contactEmail != null)
                return false;
        }
        else if (!this.contactEmail.equals(other.contactEmail))
            return false;
        if (this.urgentName == null) {
            if (other.urgentName != null)
                return false;
        }
        else if (!this.urgentName.equals(other.urgentName))
            return false;
        if (this.urgentPhone == null) {
            if (other.urgentPhone != null)
                return false;
        }
        else if (!this.urgentPhone.equals(other.urgentPhone))
            return false;
        if (this.ecQq == null) {
            if (other.ecQq != null)
                return false;
        }
        else if (!this.ecQq.equals(other.ecQq))
            return false;
        if (this.ecAlipay == null) {
            if (other.ecAlipay != null)
                return false;
        }
        else if (!this.ecAlipay.equals(other.ecAlipay))
            return false;
        if (this.ecWechat == null) {
            if (other.ecWechat != null)
                return false;
        }
        else if (!this.ecWechat.equals(other.ecWechat))
            return false;
        if (this.idcType == null) {
            if (other.idcType != null)
                return false;
        }
        else if (!this.idcType.equals(other.idcType))
            return false;
        if (this.idcNumber == null) {
            if (other.idcNumber != null)
                return false;
        }
        else if (!this.idcNumber.equals(other.idcNumber))
            return false;
        if (this.idcAddress == null) {
            if (other.idcAddress != null)
                return false;
        }
        else if (!this.idcAddress.equals(other.idcAddress))
            return false;
        if (this.idcExpiredAt == null) {
            if (other.idcExpiredAt != null)
                return false;
        }
        else if (!this.idcExpiredAt.equals(other.idcExpiredAt))
            return false;
        if (this.idcFront == null) {
            if (other.idcFront != null)
                return false;
        }
        else if (!this.idcFront.equals(other.idcFront))
            return false;
        if (this.idcBack == null) {
            if (other.idcBack != null)
                return false;
        }
        else if (!this.idcBack.equals(other.idcBack))
            return false;
        if (this.idcIssuer == null) {
            if (other.idcIssuer != null)
                return false;
        }
        else if (!this.idcIssuer.equals(other.idcIssuer))
            return false;
        if (this.idcIssueAt == null) {
            if (other.idcIssueAt != null)
                return false;
        }
        else if (!this.idcIssueAt.equals(other.idcIssueAt))
            return false;
        if (this.verified == null) {
            if (other.verified != null)
                return false;
        }
        else if (!this.verified.equals(other.verified))
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
        result = prime * result + ((this.code == null) ? 0 : this.code.hashCode());
        result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.country == null) ? 0 : this.country.hashCode());
        result = prime * result + ((this.nativePlace == null) ? 0 : this.nativePlace.hashCode());
        result = prime * result + ((this.nation == null) ? 0 : this.nation.hashCode());
        result = prime * result + ((this.address == null) ? 0 : this.address.hashCode());
        result = prime * result + ((this.realname == null) ? 0 : this.realname.hashCode());
        result = prime * result + ((this.birthday == null) ? 0 : this.birthday.hashCode());
        result = prime * result + ((this.driverLicense == null) ? 0 : this.driverLicense.hashCode());
        result = prime * result + ((this.carPlate == null) ? 0 : this.carPlate.hashCode());
        result = prime * result + ((this.passport == null) ? 0 : this.passport.hashCode());
        result = prime * result + ((this.gender == null) ? 0 : this.gender.hashCode());
        result = prime * result + ((this.marital == null) ? 0 : this.marital.hashCode());
        result = prime * result + ((this.contactMobile == null) ? 0 : this.contactMobile.hashCode());
        result = prime * result + ((this.contactPhone == null) ? 0 : this.contactPhone.hashCode());
        result = prime * result + ((this.contactAddress == null) ? 0 : this.contactAddress.hashCode());
        result = prime * result + ((this.contactEmail == null) ? 0 : this.contactEmail.hashCode());
        result = prime * result + ((this.urgentName == null) ? 0 : this.urgentName.hashCode());
        result = prime * result + ((this.urgentPhone == null) ? 0 : this.urgentPhone.hashCode());
        result = prime * result + ((this.ecQq == null) ? 0 : this.ecQq.hashCode());
        result = prime * result + ((this.ecAlipay == null) ? 0 : this.ecAlipay.hashCode());
        result = prime * result + ((this.ecWechat == null) ? 0 : this.ecWechat.hashCode());
        result = prime * result + ((this.idcType == null) ? 0 : this.idcType.hashCode());
        result = prime * result + ((this.idcNumber == null) ? 0 : this.idcNumber.hashCode());
        result = prime * result + ((this.idcAddress == null) ? 0 : this.idcAddress.hashCode());
        result = prime * result + ((this.idcExpiredAt == null) ? 0 : this.idcExpiredAt.hashCode());
        result = prime * result + ((this.idcFront == null) ? 0 : this.idcFront.hashCode());
        result = prime * result + ((this.idcBack == null) ? 0 : this.idcBack.hashCode());
        result = prime * result + ((this.idcIssuer == null) ? 0 : this.idcIssuer.hashCode());
        result = prime * result + ((this.idcIssueAt == null) ? 0 : this.idcIssueAt.hashCode());
        result = prime * result + ((this.verified == null) ? 0 : this.verified.hashCode());
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
        StringBuilder sb = new StringBuilder("EIdentity (");

        sb.append(key);
        sb.append(", ").append(code);
        sb.append(", ").append(type);
        sb.append(", ").append(status);
        sb.append(", ").append(country);
        sb.append(", ").append(nativePlace);
        sb.append(", ").append(nation);
        sb.append(", ").append(address);
        sb.append(", ").append(realname);
        sb.append(", ").append(birthday);
        sb.append(", ").append(driverLicense);
        sb.append(", ").append(carPlate);
        sb.append(", ").append(passport);
        sb.append(", ").append(gender);
        sb.append(", ").append(marital);
        sb.append(", ").append(contactMobile);
        sb.append(", ").append(contactPhone);
        sb.append(", ").append(contactAddress);
        sb.append(", ").append(contactEmail);
        sb.append(", ").append(urgentName);
        sb.append(", ").append(urgentPhone);
        sb.append(", ").append(ecQq);
        sb.append(", ").append(ecAlipay);
        sb.append(", ").append(ecWechat);
        sb.append(", ").append(idcType);
        sb.append(", ").append(idcNumber);
        sb.append(", ").append(idcAddress);
        sb.append(", ").append(idcExpiredAt);
        sb.append(", ").append(idcFront);
        sb.append(", ").append(idcBack);
        sb.append(", ").append(idcIssuer);
        sb.append(", ").append(idcIssueAt);
        sb.append(", ").append(verified);
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
    public void from(IEIdentity from) {
        setKey(from.getKey());
        setCode(from.getCode());
        setType(from.getType());
        setStatus(from.getStatus());
        setCountry(from.getCountry());
        setNativePlace(from.getNativePlace());
        setNation(from.getNation());
        setAddress(from.getAddress());
        setRealname(from.getRealname());
        setBirthday(from.getBirthday());
        setDriverLicense(from.getDriverLicense());
        setCarPlate(from.getCarPlate());
        setPassport(from.getPassport());
        setGender(from.getGender());
        setMarital(from.getMarital());
        setContactMobile(from.getContactMobile());
        setContactPhone(from.getContactPhone());
        setContactAddress(from.getContactAddress());
        setContactEmail(from.getContactEmail());
        setUrgentName(from.getUrgentName());
        setUrgentPhone(from.getUrgentPhone());
        setEcQq(from.getEcQq());
        setEcAlipay(from.getEcAlipay());
        setEcWechat(from.getEcWechat());
        setIdcType(from.getIdcType());
        setIdcNumber(from.getIdcNumber());
        setIdcAddress(from.getIdcAddress());
        setIdcExpiredAt(from.getIdcExpiredAt());
        setIdcFront(from.getIdcFront());
        setIdcBack(from.getIdcBack());
        setIdcIssuer(from.getIdcIssuer());
        setIdcIssueAt(from.getIdcIssueAt());
        setVerified(from.getVerified());
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
    public <E extends IEIdentity> E into(E into) {
        into.from(this);
        return into;
    }
}
