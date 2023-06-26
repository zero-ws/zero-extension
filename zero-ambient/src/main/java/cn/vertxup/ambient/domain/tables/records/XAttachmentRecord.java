/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain.tables.records;


import cn.vertxup.ambient.domain.tables.XAttachment;
import cn.vertxup.ambient.domain.tables.interfaces.IXAttachment;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XAttachmentRecord extends UpdatableRecordImpl<XAttachmentRecord> implements VertxPojo, IXAttachment {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>DB_ETERNAL.X_ATTACHMENT.KEY</code>. 「key」- 附件的ID值
     */
    @Override
    public XAttachmentRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_ATTACHMENT.KEY</code>. 「key」- 附件的ID值
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_ATTACHMENT.NAME</code>. 「name」- 文件名（带扩展名）
     */
    @Override
    public XAttachmentRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_ATTACHMENT.NAME</code>. 「name」- 文件名（带扩展名）
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_ATTACHMENT.EXTENSION</code>. 「extension」-
     * 文件扩展名
     */
    @Override
    public XAttachmentRecord setExtension(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_ATTACHMENT.EXTENSION</code>. 「extension」-
     * 文件扩展名
     */
    @Override
    public String getExtension() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_ATTACHMENT.TYPE</code>. 「type」-
     * 文件类型，直接关联zero.file.tree类型
     */
    @Override
    public XAttachmentRecord setType(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_ATTACHMENT.TYPE</code>. 「type」-
     * 文件类型，直接关联zero.file.tree类型
     */
    @Override
    public String getType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_ATTACHMENT.MIME</code>. 「mime」- 该文件的MIME类型
     */
    @Override
    public XAttachmentRecord setMime(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_ATTACHMENT.MIME</code>. 「mime」- 该文件的MIME类型
     */
    @Override
    public String getMime() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_ATTACHMENT.SIZE</code>. 「size」- 该文件的尺寸
     */
    @Override
    public XAttachmentRecord setSize(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_ATTACHMENT.SIZE</code>. 「size」- 该文件的尺寸
     */
    @Override
    public Integer getSize() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_ATTACHMENT.STATUS</code>. 「status」-
     * 状态，PROGRESS / SUCCESS
     */
    @Override
    public XAttachmentRecord setStatus(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_ATTACHMENT.STATUS</code>. 「status」-
     * 状态，PROGRESS / SUCCESS
     */
    @Override
    public String getStatus() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_ATTACHMENT.DIRECTORY_ID</code>.
     * 「directoryId」- 文件存储所属目录
     */
    @Override
    public XAttachmentRecord setDirectoryId(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_ATTACHMENT.DIRECTORY_ID</code>.
     * 「directoryId」- 文件存储所属目录
     */
    @Override
    public String getDirectoryId() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_ATTACHMENT.STORE_WAY</code>. 「storeWay」-
     * 存储方式，BLOB / FILE / REMOTE
     */
    @Override
    public XAttachmentRecord setStoreWay(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_ATTACHMENT.STORE_WAY</code>. 「storeWay」-
     * 存储方式，BLOB / FILE / REMOTE
     */
    @Override
    public String getStoreWay() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_ATTACHMENT.STORE_PATH</code>. 「storePath」-
     * 远程存储的目录信息（显示专用，去服务器和协议部分）
     */
    @Override
    public XAttachmentRecord setStorePath(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_ATTACHMENT.STORE_PATH</code>. 「storePath」-
     * 远程存储的目录信息（显示专用，去服务器和协议部分）
     */
    @Override
    public String getStorePath() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_ATTACHMENT.STORE_URI</code>. 「storeUri」-
     * 远程存储的目录URI部分
     */
    @Override
    public XAttachmentRecord setStoreUri(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_ATTACHMENT.STORE_URI</code>. 「storeUri」-
     * 远程存储的目录URI部分
     */
    @Override
    public String getStoreUri() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_ATTACHMENT.MODEL_ID</code>. 「modelId」-
     * 关联的模型identifier，用于描述
     */
    @Override
    public XAttachmentRecord setModelId(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_ATTACHMENT.MODEL_ID</code>. 「modelId」-
     * 关联的模型identifier，用于描述
     */
    @Override
    public String getModelId() {
        return (String) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_ATTACHMENT.MODEL_KEY</code>. 「modelKey」-
     * 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    @Override
    public XAttachmentRecord setModelKey(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_ATTACHMENT.MODEL_KEY</code>. 「modelKey」-
     * 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    @Override
    public String getModelKey() {
        return (String) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_ATTACHMENT.MODEL_CATEGORY</code>.
     * 「modelCategory」- 如果一个模型记录包含多种附件，则需要设置模型相关字段，等价于 field
     */
    @Override
    public XAttachmentRecord setModelCategory(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_ATTACHMENT.MODEL_CATEGORY</code>.
     * 「modelCategory」- 如果一个模型记录包含多种附件，则需要设置模型相关字段，等价于 field
     */
    @Override
    public String getModelCategory() {
        return (String) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_ATTACHMENT.FILE_NAME</code>. 「fileName」-
     * 原始文件名（不带扩展名）
     */
    @Override
    public XAttachmentRecord setFileName(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_ATTACHMENT.FILE_NAME</code>. 「fileName」-
     * 原始文件名（不带扩展名）
     */
    @Override
    public String getFileName() {
        return (String) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_ATTACHMENT.FILE_KEY</code>. 「fileKey」-
     * TPL模式中的文件唯一的key（全局唯一）
     */
    @Override
    public XAttachmentRecord setFileKey(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_ATTACHMENT.FILE_KEY</code>. 「fileKey」-
     * TPL模式中的文件唯一的key（全局唯一）
     */
    @Override
    public String getFileKey() {
        return (String) get(15);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_ATTACHMENT.FILE_URL</code>. 「fileUrl」-
     * 该文件的下载链接（全局唯一）
     */
    @Override
    public XAttachmentRecord setFileUrl(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_ATTACHMENT.FILE_URL</code>. 「fileUrl」-
     * 该文件的下载链接（全局唯一）
     */
    @Override
    public String getFileUrl() {
        return (String) get(16);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_ATTACHMENT.FILE_PATH</code>. 「filePath」-
     * 该文件的存储地址，FILE时使用
     */
    @Override
    public XAttachmentRecord setFilePath(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_ATTACHMENT.FILE_PATH</code>. 「filePath」-
     * 该文件的存储地址，FILE时使用
     */
    @Override
    public String getFilePath() {
        return (String) get(17);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_ATTACHMENT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public XAttachmentRecord setActive(Boolean value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_ATTACHMENT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(18);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_ATTACHMENT.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public XAttachmentRecord setSigma(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_ATTACHMENT.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(19);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_ATTACHMENT.METADATA</code>. 「metadata」-
     * 附加配置
     */
    @Override
    public XAttachmentRecord setMetadata(String value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_ATTACHMENT.METADATA</code>. 「metadata」-
     * 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(20);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_ATTACHMENT.LANGUAGE</code>. 「language」-
     * 使用的语言
     */
    @Override
    public XAttachmentRecord setLanguage(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_ATTACHMENT.LANGUAGE</code>. 「language」-
     * 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(21);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_ATTACHMENT.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public XAttachmentRecord setCreatedAt(LocalDateTime value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_ATTACHMENT.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(22);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_ATTACHMENT.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    @Override
    public XAttachmentRecord setCreatedBy(String value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_ATTACHMENT.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(23);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_ATTACHMENT.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public XAttachmentRecord setUpdatedAt(LocalDateTime value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_ATTACHMENT.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(24);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_ATTACHMENT.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    @Override
    public XAttachmentRecord setUpdatedBy(String value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_ATTACHMENT.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(25);
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
    public void from(IXAttachment from) {
        setKey(from.getKey());
        setName(from.getName());
        setExtension(from.getExtension());
        setType(from.getType());
        setMime(from.getMime());
        setSize(from.getSize());
        setStatus(from.getStatus());
        setDirectoryId(from.getDirectoryId());
        setStoreWay(from.getStoreWay());
        setStorePath(from.getStorePath());
        setStoreUri(from.getStoreUri());
        setModelId(from.getModelId());
        setModelKey(from.getModelKey());
        setModelCategory(from.getModelCategory());
        setFileName(from.getFileName());
        setFileKey(from.getFileKey());
        setFileUrl(from.getFileUrl());
        setFilePath(from.getFilePath());
        setActive(from.getActive());
        setSigma(from.getSigma());
        setMetadata(from.getMetadata());
        setLanguage(from.getLanguage());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
        resetChangedOnNotNull();
    }

    @Override
    public <E extends IXAttachment> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached XAttachmentRecord
     */
    public XAttachmentRecord() {
        super(XAttachment.X_ATTACHMENT);
    }

    /**
     * Create a detached, initialised XAttachmentRecord
     */
    public XAttachmentRecord(String key, String name, String extension, String type, String mime, Integer size, String status, String directoryId, String storeWay, String storePath, String storeUri, String modelId, String modelKey, String modelCategory, String fileName, String fileKey, String fileUrl, String filePath, Boolean active, String sigma, String metadata, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(XAttachment.X_ATTACHMENT);

        setKey(key);
        setName(name);
        setExtension(extension);
        setType(type);
        setMime(mime);
        setSize(size);
        setStatus(status);
        setDirectoryId(directoryId);
        setStoreWay(storeWay);
        setStorePath(storePath);
        setStoreUri(storeUri);
        setModelId(modelId);
        setModelKey(modelKey);
        setModelCategory(modelCategory);
        setFileName(fileName);
        setFileKey(fileKey);
        setFileUrl(fileUrl);
        setFilePath(filePath);
        setActive(active);
        setSigma(sigma);
        setMetadata(metadata);
        setLanguage(language);
        setCreatedAt(createdAt);
        setCreatedBy(createdBy);
        setUpdatedAt(updatedAt);
        setUpdatedBy(updatedBy);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised XAttachmentRecord
     */
    public XAttachmentRecord(cn.vertxup.ambient.domain.tables.pojos.XAttachment value) {
        super(XAttachment.X_ATTACHMENT);

        if (value != null) {
            setKey(value.getKey());
            setName(value.getName());
            setExtension(value.getExtension());
            setType(value.getType());
            setMime(value.getMime());
            setSize(value.getSize());
            setStatus(value.getStatus());
            setDirectoryId(value.getDirectoryId());
            setStoreWay(value.getStoreWay());
            setStorePath(value.getStorePath());
            setStoreUri(value.getStoreUri());
            setModelId(value.getModelId());
            setModelKey(value.getModelKey());
            setModelCategory(value.getModelCategory());
            setFileName(value.getFileName());
            setFileKey(value.getFileKey());
            setFileUrl(value.getFileUrl());
            setFilePath(value.getFilePath());
            setActive(value.getActive());
            setSigma(value.getSigma());
            setMetadata(value.getMetadata());
            setLanguage(value.getLanguage());
            setCreatedAt(value.getCreatedAt());
            setCreatedBy(value.getCreatedBy());
            setUpdatedAt(value.getUpdatedAt());
            setUpdatedBy(value.getUpdatedBy());
            resetChangedOnNotNull();
        }
    }

        public XAttachmentRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
