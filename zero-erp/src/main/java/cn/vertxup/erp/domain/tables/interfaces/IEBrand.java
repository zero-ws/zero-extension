/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IEBrand extends VertxPojo, Serializable {

    /**
     * Setter for <code>ZDB.E_BRAND.KEY</code>. 「key」- 品牌ID
     */
    public IEBrand setKey(String value);

    /**
     * Getter for <code>ZDB.E_BRAND.KEY</code>. 「key」- 品牌ID
     */
    public String getKey();

    /**
     * Setter for <code>ZDB.E_BRAND.CODE</code>. 「code」- 品牌编码
     */
    public IEBrand setCode(String value);

    /**
     * Getter for <code>ZDB.E_BRAND.CODE</code>. 「code」- 品牌编码
     */
    public String getCode();

    /**
     * Setter for <code>ZDB.E_BRAND.NAME</code>. 「name」- 品牌名称
     */
    public IEBrand setName(String value);

    /**
     * Getter for <code>ZDB.E_BRAND.NAME</code>. 「name」- 品牌名称
     */
    public String getName();

    /**
     * Setter for <code>ZDB.E_BRAND.ALIAS</code>. 「alias」- 品牌别名
     */
    public IEBrand setAlias(String value);

    /**
     * Getter for <code>ZDB.E_BRAND.ALIAS</code>. 「alias」- 品牌别名
     */
    public String getAlias();

    /**
     * Setter for <code>ZDB.E_BRAND.COMPANY_NAME</code>. 「companyName」- 品牌公司名
     */
    public IEBrand setCompanyName(String value);

    /**
     * Getter for <code>ZDB.E_BRAND.COMPANY_NAME</code>. 「companyName」- 品牌公司名
     */
    public String getCompanyName();

    /**
     * Setter for <code>ZDB.E_BRAND.CATEGORY_CODE</code>. 「categoryCode」- 类别代码
     */
    public IEBrand setCategoryCode(String value);

    /**
     * Getter for <code>ZDB.E_BRAND.CATEGORY_CODE</code>. 「categoryCode」- 类别代码
     */
    public String getCategoryCode();

    /**
     * Setter for <code>ZDB.E_BRAND.CATEGORY_NAME</code>. 「categoryName」- 类别名称
     */
    public IEBrand setCategoryName(String value);

    /**
     * Getter for <code>ZDB.E_BRAND.CATEGORY_NAME</code>. 「categoryName」- 类别名称
     */
    public String getCategoryName();

    /**
     * Setter for <code>ZDB.E_BRAND.AREA</code>. 「area」- 区域码，如：GB/T2659-2000国际标准
     */
    public IEBrand setArea(String value);

    /**
     * Getter for <code>ZDB.E_BRAND.AREA</code>. 「area」- 区域码，如：GB/T2659-2000国际标准
     */
    public String getArea();

    /**
     * Setter for <code>ZDB.E_BRAND.AREA_NAME</code>. 「areaName」- 区域名称
     */
    public IEBrand setAreaName(String value);

    /**
     * Getter for <code>ZDB.E_BRAND.AREA_NAME</code>. 「areaName」- 区域名称
     */
    public String getAreaName();

    /**
     * Setter for <code>ZDB.E_BRAND.AREA_CATEGORY</code>. 「areaCategory」- 区域类别码
     */
    public IEBrand setAreaCategory(String value);

    /**
     * Getter for <code>ZDB.E_BRAND.AREA_CATEGORY</code>. 「areaCategory」- 区域类别码
     */
    public String getAreaCategory();

    /**
     * Setter for <code>ZDB.E_BRAND.METADATA</code>. 「metadata」- 附加配置
     */
    public IEBrand setMetadata(String value);

    /**
     * Getter for <code>ZDB.E_BRAND.METADATA</code>. 「metadata」- 附加配置
     */
    public String getMetadata();

    /**
     * Setter for <code>ZDB.E_BRAND.ACTIVE</code>. 「active」- 是否启用
     */
    public IEBrand setActive(Boolean value);

    /**
     * Getter for <code>ZDB.E_BRAND.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>ZDB.E_BRAND.SIGMA</code>. 「sigma」- 统一标识（公司所属应用）
     */
    public IEBrand setSigma(String value);

    /**
     * Getter for <code>ZDB.E_BRAND.SIGMA</code>. 「sigma」- 统一标识（公司所属应用）
     */
    public String getSigma();

    /**
     * Setter for <code>ZDB.E_BRAND.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IEBrand setLanguage(String value);

    /**
     * Getter for <code>ZDB.E_BRAND.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>ZDB.E_BRAND.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IEBrand setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.E_BRAND.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>ZDB.E_BRAND.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IEBrand setCreatedBy(String value);

    /**
     * Getter for <code>ZDB.E_BRAND.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>ZDB.E_BRAND.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IEBrand setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.E_BRAND.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>ZDB.E_BRAND.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IEBrand setUpdatedBy(String value);

    /**
     * Getter for <code>ZDB.E_BRAND.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IEBrand
     */
    public void from(IEBrand from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IEBrand
     */
    public <E extends IEBrand> E into(E into);

        @Override
        public default IEBrand fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setCode,json::getString,"CODE","java.lang.String");
                setOrThrow(this::setName,json::getString,"NAME","java.lang.String");
                setOrThrow(this::setAlias,json::getString,"ALIAS","java.lang.String");
                setOrThrow(this::setCompanyName,json::getString,"COMPANY_NAME","java.lang.String");
                setOrThrow(this::setCategoryCode,json::getString,"CATEGORY_CODE","java.lang.String");
                setOrThrow(this::setCategoryName,json::getString,"CATEGORY_NAME","java.lang.String");
                setOrThrow(this::setArea,json::getString,"AREA","java.lang.String");
                setOrThrow(this::setAreaName,json::getString,"AREA_NAME","java.lang.String");
                setOrThrow(this::setAreaCategory,json::getString,"AREA_CATEGORY","java.lang.String");
                setOrThrow(this::setMetadata,json::getString,"METADATA","java.lang.String");
                setOrThrow(this::setActive,json::getBoolean,"ACTIVE","java.lang.Boolean");
                setOrThrow(this::setSigma,json::getString,"SIGMA","java.lang.String");
                setOrThrow(this::setLanguage,json::getString,"LANGUAGE","java.lang.String");
                setOrThrow(this::setCreatedAt,key -> {String s = json.getString(key); return s==null?null:java.time.LocalDateTime.parse(s);},"CREATED_AT","java.time.LocalDateTime");
                setOrThrow(this::setCreatedBy,json::getString,"CREATED_BY","java.lang.String");
                setOrThrow(this::setUpdatedAt,key -> {String s = json.getString(key); return s==null?null:java.time.LocalDateTime.parse(s);},"UPDATED_AT","java.time.LocalDateTime");
                setOrThrow(this::setUpdatedBy,json::getString,"UPDATED_BY","java.lang.String");
                return this;
        }


        @Override
        public default io.vertx.core.json.JsonObject toJson() {
                io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
                json.put("KEY",getKey());
                json.put("CODE",getCode());
                json.put("NAME",getName());
                json.put("ALIAS",getAlias());
                json.put("COMPANY_NAME",getCompanyName());
                json.put("CATEGORY_CODE",getCategoryCode());
                json.put("CATEGORY_NAME",getCategoryName());
                json.put("AREA",getArea());
                json.put("AREA_NAME",getAreaName());
                json.put("AREA_CATEGORY",getAreaCategory());
                json.put("METADATA",getMetadata());
                json.put("ACTIVE",getActive());
                json.put("SIGMA",getSigma());
                json.put("LANGUAGE",getLanguage());
                json.put("CREATED_AT",getCreatedAt()==null?null:getCreatedAt().toString());
                json.put("CREATED_BY",getCreatedBy());
                json.put("UPDATED_AT",getUpdatedAt()==null?null:getUpdatedAt().toString());
                json.put("UPDATED_BY",getUpdatedBy());
                return json;
        }

}
