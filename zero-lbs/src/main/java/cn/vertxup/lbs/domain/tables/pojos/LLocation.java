/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.lbs.domain.tables.pojos;


import cn.vertxup.lbs.domain.tables.interfaces.ILLocation;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LLocation implements VertxPojo, ILLocation {

    private static final long serialVersionUID = 1L;

    private String key;
    private String name;
    private String code;
    private String address;
    private String city;
    private String country;
    private String region;
    private String fullName;
    private String state;
    private String street1;
    private String street2;
    private String street3;
    private String postal;
    private String metadata;
    private String regionId;
    private Boolean active;
    private String sigma;
    private String language;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public LLocation() {}

    public LLocation(ILLocation value) {
        this.key = value.getKey();
        this.name = value.getName();
        this.code = value.getCode();
        this.address = value.getAddress();
        this.city = value.getCity();
        this.country = value.getCountry();
        this.region = value.getRegion();
        this.fullName = value.getFullName();
        this.state = value.getState();
        this.street1 = value.getStreet1();
        this.street2 = value.getStreet2();
        this.street3 = value.getStreet3();
        this.postal = value.getPostal();
        this.metadata = value.getMetadata();
        this.regionId = value.getRegionId();
        this.active = value.getActive();
        this.sigma = value.getSigma();
        this.language = value.getLanguage();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public LLocation(
        String key,
        String name,
        String code,
        String address,
        String city,
        String country,
        String region,
        String fullName,
        String state,
        String street1,
        String street2,
        String street3,
        String postal,
        String metadata,
        String regionId,
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
        this.address = address;
        this.city = city;
        this.country = country;
        this.region = region;
        this.fullName = fullName;
        this.state = state;
        this.street1 = street1;
        this.street2 = street2;
        this.street3 = street3;
        this.postal = postal;
        this.metadata = metadata;
        this.regionId = regionId;
        this.active = active;
        this.sigma = sigma;
        this.language = language;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public LLocation(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>ZDB.L_LOCATION.KEY</code>. 「key」- 主键
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>ZDB.L_LOCATION.KEY</code>. 「key」- 主键
     */
    @Override
    public LLocation setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>ZDB.L_LOCATION.NAME</code>. 「name」- 名称
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>ZDB.L_LOCATION.NAME</code>. 「name」- 名称
     */
    @Override
    public LLocation setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>ZDB.L_LOCATION.CODE</code>. 「code」- 编码
     */
    @Override
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>ZDB.L_LOCATION.CODE</code>. 「code」- 编码
     */
    @Override
    public LLocation setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Getter for <code>ZDB.L_LOCATION.ADDRESS</code>. 「address」- 详细地址
     */
    @Override
    public String getAddress() {
        return this.address;
    }

    /**
     * Setter for <code>ZDB.L_LOCATION.ADDRESS</code>. 「address」- 详细地址
     */
    @Override
    public LLocation setAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Getter for <code>ZDB.L_LOCATION.CITY</code>. 「city」- 3.城市
     */
    @Override
    public String getCity() {
        return this.city;
    }

    /**
     * Setter for <code>ZDB.L_LOCATION.CITY</code>. 「city」- 3.城市
     */
    @Override
    public LLocation setCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Getter for <code>ZDB.L_LOCATION.COUNTRY</code>. 「country」- 1.国家
     */
    @Override
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for <code>ZDB.L_LOCATION.COUNTRY</code>. 「country」- 1.国家
     */
    @Override
    public LLocation setCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Getter for <code>ZDB.L_LOCATION.REGION</code>. 「region」- 4.区域
     */
    @Override
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for <code>ZDB.L_LOCATION.REGION</code>. 「region」- 4.区域
     */
    @Override
    public LLocation setRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Getter for <code>ZDB.L_LOCATION.FULL_NAME</code>. 「fullName」- 地址全称
     */
    @Override
    public String getFullName() {
        return this.fullName;
    }

    /**
     * Setter for <code>ZDB.L_LOCATION.FULL_NAME</code>. 「fullName」- 地址全称
     */
    @Override
    public LLocation setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    /**
     * Getter for <code>ZDB.L_LOCATION.STATE</code>. 「state」- 2.省会
     */
    @Override
    public String getState() {
        return this.state;
    }

    /**
     * Setter for <code>ZDB.L_LOCATION.STATE</code>. 「state」- 2.省会
     */
    @Override
    public LLocation setState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Getter for <code>ZDB.L_LOCATION.STREET1</code>. 「street1」- 街道1
     */
    @Override
    public String getStreet1() {
        return this.street1;
    }

    /**
     * Setter for <code>ZDB.L_LOCATION.STREET1</code>. 「street1」- 街道1
     */
    @Override
    public LLocation setStreet1(String street1) {
        this.street1 = street1;
        return this;
    }

    /**
     * Getter for <code>ZDB.L_LOCATION.STREET2</code>. 「street2」- 街道2
     */
    @Override
    public String getStreet2() {
        return this.street2;
    }

    /**
     * Setter for <code>ZDB.L_LOCATION.STREET2</code>. 「street2」- 街道2
     */
    @Override
    public LLocation setStreet2(String street2) {
        this.street2 = street2;
        return this;
    }

    /**
     * Getter for <code>ZDB.L_LOCATION.STREET3</code>. 「street3」- 街道3
     */
    @Override
    public String getStreet3() {
        return this.street3;
    }

    /**
     * Setter for <code>ZDB.L_LOCATION.STREET3</code>. 「street3」- 街道3
     */
    @Override
    public LLocation setStreet3(String street3) {
        this.street3 = street3;
        return this;
    }

    /**
     * Getter for <code>ZDB.L_LOCATION.POSTAL</code>. 「postal」- 邮政编码
     */
    @Override
    public String getPostal() {
        return this.postal;
    }

    /**
     * Setter for <code>ZDB.L_LOCATION.POSTAL</code>. 「postal」- 邮政编码
     */
    @Override
    public LLocation setPostal(String postal) {
        this.postal = postal;
        return this;
    }

    /**
     * Getter for <code>ZDB.L_LOCATION.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>ZDB.L_LOCATION.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public LLocation setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>ZDB.L_LOCATION.REGION_ID</code>. 「regionId」- 区域ID
     */
    @Override
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * Setter for <code>ZDB.L_LOCATION.REGION_ID</code>. 「regionId」- 区域ID
     */
    @Override
    public LLocation setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * Getter for <code>ZDB.L_LOCATION.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>ZDB.L_LOCATION.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public LLocation setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>ZDB.L_LOCATION.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>ZDB.L_LOCATION.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public LLocation setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>ZDB.L_LOCATION.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>ZDB.L_LOCATION.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public LLocation setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>ZDB.L_LOCATION.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>ZDB.L_LOCATION.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LLocation setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.L_LOCATION.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>ZDB.L_LOCATION.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public LLocation setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>ZDB.L_LOCATION.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>ZDB.L_LOCATION.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LLocation setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.L_LOCATION.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>ZDB.L_LOCATION.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public LLocation setUpdatedBy(String updatedBy) {
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
        final LLocation other = (LLocation) obj;
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
        if (this.address == null) {
            if (other.address != null)
                return false;
        }
        else if (!this.address.equals(other.address))
            return false;
        if (this.city == null) {
            if (other.city != null)
                return false;
        }
        else if (!this.city.equals(other.city))
            return false;
        if (this.country == null) {
            if (other.country != null)
                return false;
        }
        else if (!this.country.equals(other.country))
            return false;
        if (this.region == null) {
            if (other.region != null)
                return false;
        }
        else if (!this.region.equals(other.region))
            return false;
        if (this.fullName == null) {
            if (other.fullName != null)
                return false;
        }
        else if (!this.fullName.equals(other.fullName))
            return false;
        if (this.state == null) {
            if (other.state != null)
                return false;
        }
        else if (!this.state.equals(other.state))
            return false;
        if (this.street1 == null) {
            if (other.street1 != null)
                return false;
        }
        else if (!this.street1.equals(other.street1))
            return false;
        if (this.street2 == null) {
            if (other.street2 != null)
                return false;
        }
        else if (!this.street2.equals(other.street2))
            return false;
        if (this.street3 == null) {
            if (other.street3 != null)
                return false;
        }
        else if (!this.street3.equals(other.street3))
            return false;
        if (this.postal == null) {
            if (other.postal != null)
                return false;
        }
        else if (!this.postal.equals(other.postal))
            return false;
        if (this.metadata == null) {
            if (other.metadata != null)
                return false;
        }
        else if (!this.metadata.equals(other.metadata))
            return false;
        if (this.regionId == null) {
            if (other.regionId != null)
                return false;
        }
        else if (!this.regionId.equals(other.regionId))
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
        result = prime * result + ((this.address == null) ? 0 : this.address.hashCode());
        result = prime * result + ((this.city == null) ? 0 : this.city.hashCode());
        result = prime * result + ((this.country == null) ? 0 : this.country.hashCode());
        result = prime * result + ((this.region == null) ? 0 : this.region.hashCode());
        result = prime * result + ((this.fullName == null) ? 0 : this.fullName.hashCode());
        result = prime * result + ((this.state == null) ? 0 : this.state.hashCode());
        result = prime * result + ((this.street1 == null) ? 0 : this.street1.hashCode());
        result = prime * result + ((this.street2 == null) ? 0 : this.street2.hashCode());
        result = prime * result + ((this.street3 == null) ? 0 : this.street3.hashCode());
        result = prime * result + ((this.postal == null) ? 0 : this.postal.hashCode());
        result = prime * result + ((this.metadata == null) ? 0 : this.metadata.hashCode());
        result = prime * result + ((this.regionId == null) ? 0 : this.regionId.hashCode());
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
        StringBuilder sb = new StringBuilder("LLocation (");

        sb.append(key);
        sb.append(", ").append(name);
        sb.append(", ").append(code);
        sb.append(", ").append(address);
        sb.append(", ").append(city);
        sb.append(", ").append(country);
        sb.append(", ").append(region);
        sb.append(", ").append(fullName);
        sb.append(", ").append(state);
        sb.append(", ").append(street1);
        sb.append(", ").append(street2);
        sb.append(", ").append(street3);
        sb.append(", ").append(postal);
        sb.append(", ").append(metadata);
        sb.append(", ").append(regionId);
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
    public void from(ILLocation from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setAddress(from.getAddress());
        setCity(from.getCity());
        setCountry(from.getCountry());
        setRegion(from.getRegion());
        setFullName(from.getFullName());
        setState(from.getState());
        setStreet1(from.getStreet1());
        setStreet2(from.getStreet2());
        setStreet3(from.getStreet3());
        setPostal(from.getPostal());
        setMetadata(from.getMetadata());
        setRegionId(from.getRegionId());
        setActive(from.getActive());
        setSigma(from.getSigma());
        setLanguage(from.getLanguage());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    @Override
    public <E extends ILLocation> E into(E into) {
        into.from(this);
        return into;
    }
}
