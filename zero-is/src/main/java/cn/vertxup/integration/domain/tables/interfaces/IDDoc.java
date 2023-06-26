/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.integration.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IDDoc extends VertxPojo, Serializable {

    /**
     * Setter for <code>DB_ETERNAL.D_DOC.KEY</code>. 「key」- 文档主键，唯一标识
     */
    public IDDoc setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.D_DOC.KEY</code>. 「key」- 文档主键，唯一标识
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.D_DOC.CODE</code>. 「code」- 文档系统编号
     */
    public IDDoc setCode(String value);

    /**
     * Getter for <code>DB_ETERNAL.D_DOC.CODE</code>. 「code」- 文档系统编号
     */
    public String getCode();

    /**
     * Setter for <code>DB_ETERNAL.D_DOC.STATUS</code>. 「status」- 状态
     */
    public IDDoc setStatus(String value);

    /**
     * Getter for <code>DB_ETERNAL.D_DOC.STATUS</code>. 「status」- 状态
     */
    public String getStatus();

    /**
     * Setter for <code>DB_ETERNAL.D_DOC.TYPE</code>. 「type」- 文档类型，用于指定子表信息
     */
    public IDDoc setType(String value);

    /**
     * Getter for <code>DB_ETERNAL.D_DOC.TYPE</code>. 「type」- 文档类型，用于指定子表信息
     */
    public String getType();

    /**
     * Setter for <code>DB_ETERNAL.D_DOC.CATEGORY</code>. 「category」- 文档类别,
     * 关联对应的分类
     */
    public IDDoc setCategory(String value);

    /**
     * Getter for <code>DB_ETERNAL.D_DOC.CATEGORY</code>. 「category」- 文档类别,
     * 关联对应的分类
     */
    public String getCategory();

    /**
     * Setter for <code>DB_ETERNAL.D_DOC.NAME</code>. 「name」- 文档名称
     */
    public IDDoc setName(String value);

    /**
     * Getter for <code>DB_ETERNAL.D_DOC.NAME</code>. 「name」- 文档名称
     */
    public String getName();

    /**
     * Setter for <code>DB_ETERNAL.D_DOC.SN</code>. 「sn」- 文档编号
     */
    public IDDoc setSn(String value);

    /**
     * Getter for <code>DB_ETERNAL.D_DOC.SN</code>. 「sn」- 文档编号
     */
    public String getSn();

    /**
     * Setter for <code>DB_ETERNAL.D_DOC.PREFIX</code>. 「prefix」- 文档前缀
     */
    public IDDoc setPrefix(String value);

    /**
     * Getter for <code>DB_ETERNAL.D_DOC.PREFIX</code>. 「prefix」- 文档前缀
     */
    public String getPrefix();

    /**
     * Setter for <code>DB_ETERNAL.D_DOC.BRIEF</code>. 「brief」- 文档简介
     */
    public IDDoc setBrief(String value);

    /**
     * Getter for <code>DB_ETERNAL.D_DOC.BRIEF</code>. 「brief」- 文档简介
     */
    public String getBrief();

    /**
     * Setter for <code>DB_ETERNAL.D_DOC.DESCRIPTION</code>. 「description」- 文档描述
     */
    public IDDoc setDescription(String value);

    /**
     * Getter for <code>DB_ETERNAL.D_DOC.DESCRIPTION</code>. 「description」- 文档描述
     */
    public String getDescription();

    /**
     * Setter for <code>DB_ETERNAL.D_DOC.VERSION</code>. 「version」- 文档版本, N.N
     */
    public IDDoc setVersion(String value);

    /**
     * Getter for <code>DB_ETERNAL.D_DOC.VERSION</code>. 「version」- 文档版本, N.N
     */
    public String getVersion();

    /**
     * Setter for <code>DB_ETERNAL.D_DOC.AUTHOR</code>. 「author」- 文档作者
     */
    public IDDoc setAuthor(String value);

    /**
     * Getter for <code>DB_ETERNAL.D_DOC.AUTHOR</code>. 「author」- 文档作者
     */
    public String getAuthor();

    /**
     * Setter for <code>DB_ETERNAL.D_DOC.AUTHOR_OR</code>. 「authorOr」- 第二作者、第三作者
     */
    public IDDoc setAuthorOr(String value);

    /**
     * Getter for <code>DB_ETERNAL.D_DOC.AUTHOR_OR</code>. 「authorOr」- 第二作者、第三作者
     */
    public String getAuthorOr();

    /**
     * Setter for <code>DB_ETERNAL.D_DOC.COPY</code>. 「copy」- 是否副本
     */
    public IDDoc setCopy(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.D_DOC.COPY</code>. 「copy」- 是否副本
     */
    public Boolean getCopy();

    /**
     * Setter for <code>DB_ETERNAL.D_DOC.COPY_TO</code>. 「copy」-
     * 若是副本，则标注是哪份文档的副本
     */
    public IDDoc setCopyTo(String value);

    /**
     * Getter for <code>DB_ETERNAL.D_DOC.COPY_TO</code>. 「copy」-
     * 若是副本，则标注是哪份文档的副本
     */
    public String getCopyTo();

    /**
     * Setter for <code>DB_ETERNAL.D_DOC.FILE_NAME</code>. 「fileName」-
     * 原始文件名，带扩展名
     */
    public IDDoc setFileName(String value);

    /**
     * Getter for <code>DB_ETERNAL.D_DOC.FILE_NAME</code>. 「fileName」-
     * 原始文件名，带扩展名
     */
    public String getFileName();

    /**
     * Setter for <code>DB_ETERNAL.D_DOC.FILE_KEY</code>. 「fileKey」-
     * TPL模式中的文件唯一的key（全局唯一）
     */
    public IDDoc setFileKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.D_DOC.FILE_KEY</code>. 「fileKey」-
     * TPL模式中的文件唯一的key（全局唯一）
     */
    public String getFileKey();

    /**
     * Setter for <code>DB_ETERNAL.D_DOC.SIGMA</code>. 「sigma」- 统一标识
     */
    public IDDoc setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.D_DOC.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.D_DOC.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IDDoc setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.D_DOC.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.D_DOC.ACTIVE</code>. 「active」- 是否启用
     */
    public IDDoc setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.D_DOC.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.D_DOC.METADATA</code>. 「metadata」- 附加配置数据
     */
    public IDDoc setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.D_DOC.METADATA</code>. 「metadata」- 附加配置数据
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.D_DOC.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IDDoc setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.D_DOC.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.D_DOC.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IDDoc setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.D_DOC.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.D_DOC.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IDDoc setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.D_DOC.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.D_DOC.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IDDoc setUpdatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.D_DOC.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IDDoc
     */
    public void from(IDDoc from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IDDoc
     */
    public <E extends IDDoc> E into(E into);

        @Override
        public default IDDoc fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setCode,json::getString,"CODE","java.lang.String");
                setOrThrow(this::setStatus,json::getString,"STATUS","java.lang.String");
                setOrThrow(this::setType,json::getString,"TYPE","java.lang.String");
                setOrThrow(this::setCategory,json::getString,"CATEGORY","java.lang.String");
                setOrThrow(this::setName,json::getString,"NAME","java.lang.String");
                setOrThrow(this::setSn,json::getString,"SN","java.lang.String");
                setOrThrow(this::setPrefix,json::getString,"PREFIX","java.lang.String");
                setOrThrow(this::setBrief,json::getString,"BRIEF","java.lang.String");
                setOrThrow(this::setDescription,json::getString,"DESCRIPTION","java.lang.String");
                setOrThrow(this::setVersion,json::getString,"VERSION","java.lang.String");
                setOrThrow(this::setAuthor,json::getString,"AUTHOR","java.lang.String");
                setOrThrow(this::setAuthorOr,json::getString,"AUTHOR_OR","java.lang.String");
                setOrThrow(this::setCopy,json::getBoolean,"COPY","java.lang.Boolean");
                setOrThrow(this::setCopyTo,json::getString,"COPY_TO","java.lang.String");
                setOrThrow(this::setFileName,json::getString,"FILE_NAME","java.lang.String");
                setOrThrow(this::setFileKey,json::getString,"FILE_KEY","java.lang.String");
                setOrThrow(this::setSigma,json::getString,"SIGMA","java.lang.String");
                setOrThrow(this::setLanguage,json::getString,"LANGUAGE","java.lang.String");
                setOrThrow(this::setActive,json::getBoolean,"ACTIVE","java.lang.Boolean");
                setOrThrow(this::setMetadata,json::getString,"METADATA","java.lang.String");
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
                json.put("STATUS",getStatus());
                json.put("TYPE",getType());
                json.put("CATEGORY",getCategory());
                json.put("NAME",getName());
                json.put("SN",getSn());
                json.put("PREFIX",getPrefix());
                json.put("BRIEF",getBrief());
                json.put("DESCRIPTION",getDescription());
                json.put("VERSION",getVersion());
                json.put("AUTHOR",getAuthor());
                json.put("AUTHOR_OR",getAuthorOr());
                json.put("COPY",getCopy());
                json.put("COPY_TO",getCopyTo());
                json.put("FILE_NAME",getFileName());
                json.put("FILE_KEY",getFileKey());
                json.put("SIGMA",getSigma());
                json.put("LANGUAGE",getLanguage());
                json.put("ACTIVE",getActive());
                json.put("METADATA",getMetadata());
                json.put("CREATED_AT",getCreatedAt()==null?null:getCreatedAt().toString());
                json.put("CREATED_BY",getCreatedBy());
                json.put("UPDATED_AT",getUpdatedAt()==null?null:getUpdatedAt().toString());
                json.put("UPDATED_BY",getUpdatedBy());
                return json;
        }

}
