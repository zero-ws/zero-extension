/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.psi.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IPCommodity extends VertxPojo, Serializable {

    /**
     * Setter for <code>ZDB.P_COMMODITY.KEY</code>. 「key」- 产品主键
     */
    public IPCommodity setKey(String value);

    /**
     * Getter for <code>ZDB.P_COMMODITY.KEY</code>. 「key」- 产品主键
     */
    public String getKey();

    /**
     * Setter for <code>ZDB.P_COMMODITY.NAME</code>. 「name」- 产品名称
     */
    public IPCommodity setName(String value);

    /**
     * Getter for <code>ZDB.P_COMMODITY.NAME</code>. 「name」- 产品名称
     */
    public String getName();

    /**
     * Setter for <code>ZDB.P_COMMODITY.CODE</code>. 「code」- 产品编号（系统可用）
     */
    public IPCommodity setCode(String value);

    /**
     * Getter for <code>ZDB.P_COMMODITY.CODE</code>. 「code」- 产品编号（系统可用）
     */
    public String getCode();

    /**
     * Setter for <code>ZDB.P_COMMODITY.TYPE</code>. 「type」- 产品类型
     */
    public IPCommodity setType(String value);

    /**
     * Getter for <code>ZDB.P_COMMODITY.TYPE</code>. 「type」- 产品类型
     */
    public String getType();

    /**
     * Setter for <code>ZDB.P_COMMODITY.STATUS</code>. 「status」- 产品状态
     */
    public IPCommodity setStatus(String value);

    /**
     * Getter for <code>ZDB.P_COMMODITY.STATUS</code>. 「status」- 产品状态
     */
    public String getStatus();

    /**
     * Setter for <code>ZDB.P_COMMODITY.TAGS</code>. 「tags」- 商品标签
     */
    public IPCommodity setTags(String value);

    /**
     * Getter for <code>ZDB.P_COMMODITY.TAGS</code>. 「tags」- 商品标签
     */
    public String getTags();

    /**
     * Setter for <code>ZDB.P_COMMODITY.ORIGIN</code>. 「origin」- 商品产地
     */
    public IPCommodity setOrigin(String value);

    /**
     * Getter for <code>ZDB.P_COMMODITY.ORIGIN</code>. 「origin」- 商品产地
     */
    public String getOrigin();

    /**
     * Setter for <code>ZDB.P_COMMODITY.BAR_CODE</code>. 「barCode」- 条形码
     */
    public IPCommodity setBarCode(String value);

    /**
     * Getter for <code>ZDB.P_COMMODITY.BAR_CODE</code>. 「barCode」- 条形码
     */
    public String getBarCode();

    /**
     * Setter for <code>ZDB.P_COMMODITY.HELP_CODE</code>. 「helpCode」- 助记码
     */
    public IPCommodity setHelpCode(String value);

    /**
     * Getter for <code>ZDB.P_COMMODITY.HELP_CODE</code>. 「helpCode」- 助记码
     */
    public String getHelpCode();

    /**
     * Setter for <code>ZDB.P_COMMODITY.BRAND_ID</code>. 「brandId」- 品牌
     */
    public IPCommodity setBrandId(String value);

    /**
     * Getter for <code>ZDB.P_COMMODITY.BRAND_ID</code>. 「brandId」- 品牌
     */
    public String getBrandId();

    /**
     * Setter for <code>ZDB.P_COMMODITY.MODEL_NUMBER</code>. 「modelNumber」- 规格型号
     */
    public IPCommodity setModelNumber(String value);

    /**
     * Getter for <code>ZDB.P_COMMODITY.MODEL_NUMBER</code>. 「modelNumber」- 规格型号
     */
    public String getModelNumber();

    /**
     * Setter for <code>ZDB.P_COMMODITY.UNIT</code>. 「unit」- 计量单位
     */
    public IPCommodity setUnit(String value);

    /**
     * Getter for <code>ZDB.P_COMMODITY.UNIT</code>. 「unit」- 计量单位
     */
    public String getUnit();

    /**
     * Setter for <code>ZDB.P_COMMODITY.EXPIRED_DAY</code>. 「expiredDay」- 保质天数
     */
    public IPCommodity setExpiredDay(Integer value);

    /**
     * Getter for <code>ZDB.P_COMMODITY.EXPIRED_DAY</code>. 「expiredDay」- 保质天数
     */
    public Integer getExpiredDay();

    /**
     * Setter for <code>ZDB.P_COMMODITY.K_WAY_COST</code>. 「kWayCost」- 成本计算方法
     */
    public IPCommodity setKWayCost(String value);

    /**
     * Getter for <code>ZDB.P_COMMODITY.K_WAY_COST</code>. 「kWayCost」- 成本计算方法
     */
    public String getKWayCost();

    /**
     * Setter for <code>ZDB.P_COMMODITY.K_BY_BATCH</code>. 「kByBatch」- 按批核算成本
     */
    public IPCommodity setKByBatch(Boolean value);

    /**
     * Getter for <code>ZDB.P_COMMODITY.K_BY_BATCH</code>. 「kByBatch」- 按批核算成本
     */
    public Boolean getKByBatch();

    /**
     * Setter for <code>ZDB.P_COMMODITY.K_TAX_TYPE</code>. 「kTaxType」- 税收分类编码
     */
    public IPCommodity setKTaxType(String value);

    /**
     * Getter for <code>ZDB.P_COMMODITY.K_TAX_TYPE</code>. 「kTaxType」- 税收分类编码
     */
    public String getKTaxType();

    /**
     * Setter for <code>ZDB.P_COMMODITY.K_TAX_RATE</code>. 「kTaxRate」- 税率
     */
    public IPCommodity setKTaxRate(BigDecimal value);

    /**
     * Getter for <code>ZDB.P_COMMODITY.K_TAX_RATE</code>. 「kTaxRate」- 税率
     */
    public BigDecimal getKTaxRate();

    /**
     * Setter for <code>ZDB.P_COMMODITY.DF_CUSTOMER</code>. 「dfCustomer」- 默认供应商
     */
    public IPCommodity setDfCustomer(String value);

    /**
     * Getter for <code>ZDB.P_COMMODITY.DF_CUSTOMER</code>. 「dfCustomer」- 默认供应商
     */
    public String getDfCustomer();

    /**
     * Setter for <code>ZDB.P_COMMODITY.DF_WH</code>. 「dfWh」- 默认仓库
     */
    public IPCommodity setDfWh(String value);

    /**
     * Getter for <code>ZDB.P_COMMODITY.DF_WH</code>. 「dfWh」- 默认仓库
     */
    public String getDfWh();

    /**
     * Setter for <code>ZDB.P_COMMODITY.LOGO</code>. 「logo」- 产品图片
     */
    public IPCommodity setLogo(String value);

    /**
     * Getter for <code>ZDB.P_COMMODITY.LOGO</code>. 「logo」- 产品图片
     */
    public String getLogo();

    /**
     * Setter for <code>ZDB.P_COMMODITY.PRICE</code>. 「price」- 商品单价
     */
    public IPCommodity setPrice(BigDecimal value);

    /**
     * Getter for <code>ZDB.P_COMMODITY.PRICE</code>. 「price」- 商品单价
     */
    public BigDecimal getPrice();

    /**
     * Setter for <code>ZDB.P_COMMODITY.QUANTITY</code>. 「quantity」- 商品数量
     */
    public IPCommodity setQuantity(Integer value);

    /**
     * Getter for <code>ZDB.P_COMMODITY.QUANTITY</code>. 「quantity」- 商品数量
     */
    public Integer getQuantity();

    /**
     * Setter for <code>ZDB.P_COMMODITY.AMOUNT</code>. 「amount」——总价，理论计算结果
     */
    public IPCommodity setAmount(BigDecimal value);

    /**
     * Getter for <code>ZDB.P_COMMODITY.AMOUNT</code>. 「amount」——总价，理论计算结果
     */
    public BigDecimal getAmount();

    /**
     * Setter for <code>ZDB.P_COMMODITY.COMMENT</code>. 「comment」- 产品备注
     */
    public IPCommodity setComment(String value);

    /**
     * Getter for <code>ZDB.P_COMMODITY.COMMENT</code>. 「comment」- 产品备注
     */
    public String getComment();

    /**
     * Setter for <code>ZDB.P_COMMODITY.ACTIVE</code>. 「active」- 是否启用
     */
    public IPCommodity setActive(Boolean value);

    /**
     * Getter for <code>ZDB.P_COMMODITY.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>ZDB.P_COMMODITY.SIGMA</code>. 「sigma」- 统一标识
     */
    public IPCommodity setSigma(String value);

    /**
     * Getter for <code>ZDB.P_COMMODITY.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>ZDB.P_COMMODITY.METADATA</code>. 「metadata」- 附加配置
     */
    public IPCommodity setMetadata(String value);

    /**
     * Getter for <code>ZDB.P_COMMODITY.METADATA</code>. 「metadata」- 附加配置
     */
    public String getMetadata();

    /**
     * Setter for <code>ZDB.P_COMMODITY.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IPCommodity setLanguage(String value);

    /**
     * Getter for <code>ZDB.P_COMMODITY.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>ZDB.P_COMMODITY.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IPCommodity setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.P_COMMODITY.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>ZDB.P_COMMODITY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IPCommodity setCreatedBy(String value);

    /**
     * Getter for <code>ZDB.P_COMMODITY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>ZDB.P_COMMODITY.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IPCommodity setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.P_COMMODITY.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>ZDB.P_COMMODITY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IPCommodity setUpdatedBy(String value);

    /**
     * Getter for <code>ZDB.P_COMMODITY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IPCommodity
     */
    public void from(IPCommodity from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IPCommodity
     */
    public <E extends IPCommodity> E into(E into);

        @Override
        public default IPCommodity fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setName,json::getString,"NAME","java.lang.String");
                setOrThrow(this::setCode,json::getString,"CODE","java.lang.String");
                setOrThrow(this::setType,json::getString,"TYPE","java.lang.String");
                setOrThrow(this::setStatus,json::getString,"STATUS","java.lang.String");
                setOrThrow(this::setTags,json::getString,"TAGS","java.lang.String");
                setOrThrow(this::setOrigin,json::getString,"ORIGIN","java.lang.String");
                setOrThrow(this::setBarCode,json::getString,"BAR_CODE","java.lang.String");
                setOrThrow(this::setHelpCode,json::getString,"HELP_CODE","java.lang.String");
                setOrThrow(this::setBrandId,json::getString,"BRAND_ID","java.lang.String");
                setOrThrow(this::setModelNumber,json::getString,"MODEL_NUMBER","java.lang.String");
                setOrThrow(this::setUnit,json::getString,"UNIT","java.lang.String");
                setOrThrow(this::setExpiredDay,json::getInteger,"EXPIRED_DAY","java.lang.Integer");
                setOrThrow(this::setKWayCost,json::getString,"K_WAY_COST","java.lang.String");
                setOrThrow(this::setKByBatch,json::getBoolean,"K_BY_BATCH","java.lang.Boolean");
                setOrThrow(this::setKTaxType,json::getString,"K_TAX_TYPE","java.lang.String");
                setOrThrow(this::setKTaxRate,key -> {String s = json.getString(key); return s==null?null:new java.math.BigDecimal(s);},"K_TAX_RATE","java.math.BigDecimal");
                setOrThrow(this::setDfCustomer,json::getString,"DF_CUSTOMER","java.lang.String");
                setOrThrow(this::setDfWh,json::getString,"DF_WH","java.lang.String");
                setOrThrow(this::setLogo,json::getString,"LOGO","java.lang.String");
                setOrThrow(this::setPrice,key -> {String s = json.getString(key); return s==null?null:new java.math.BigDecimal(s);},"PRICE","java.math.BigDecimal");
                setOrThrow(this::setQuantity,json::getInteger,"QUANTITY","java.lang.Integer");
                setOrThrow(this::setAmount,key -> {String s = json.getString(key); return s==null?null:new java.math.BigDecimal(s);},"AMOUNT","java.math.BigDecimal");
                setOrThrow(this::setComment,json::getString,"COMMENT","java.lang.String");
                setOrThrow(this::setActive,json::getBoolean,"ACTIVE","java.lang.Boolean");
                setOrThrow(this::setSigma,json::getString,"SIGMA","java.lang.String");
                setOrThrow(this::setMetadata,json::getString,"METADATA","java.lang.String");
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
                json.put("NAME",getName());
                json.put("CODE",getCode());
                json.put("TYPE",getType());
                json.put("STATUS",getStatus());
                json.put("TAGS",getTags());
                json.put("ORIGIN",getOrigin());
                json.put("BAR_CODE",getBarCode());
                json.put("HELP_CODE",getHelpCode());
                json.put("BRAND_ID",getBrandId());
                json.put("MODEL_NUMBER",getModelNumber());
                json.put("UNIT",getUnit());
                json.put("EXPIRED_DAY",getExpiredDay());
                json.put("K_WAY_COST",getKWayCost());
                json.put("K_BY_BATCH",getKByBatch());
                json.put("K_TAX_TYPE",getKTaxType());
                json.put("K_TAX_RATE",getKTaxRate()==null?null:getKTaxRate().toString());
                json.put("DF_CUSTOMER",getDfCustomer());
                json.put("DF_WH",getDfWh());
                json.put("LOGO",getLogo());
                json.put("PRICE",getPrice()==null?null:getPrice().toString());
                json.put("QUANTITY",getQuantity());
                json.put("AMOUNT",getAmount()==null?null:getAmount().toString());
                json.put("COMMENT",getComment());
                json.put("ACTIVE",getActive());
                json.put("SIGMA",getSigma());
                json.put("METADATA",getMetadata());
                json.put("LANGUAGE",getLanguage());
                json.put("CREATED_AT",getCreatedAt()==null?null:getCreatedAt().toString());
                json.put("CREATED_BY",getCreatedBy());
                json.put("UPDATED_AT",getUpdatedAt()==null?null:getUpdatedAt().toString());
                json.put("UPDATED_BY",getUpdatedBy());
                return json;
        }

}
