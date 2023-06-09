-- liquibase formatted sql

-- changeset Lang:d-doc-1
-- 文档专用表：D_DOC
/*
 * 注意文档和附件的区别，文档更多是用于描述文档的业务属性
 */
DROP TABLE IF EXISTS D_DOC;
CREATE TABLE IF NOT EXISTS D_DOC
(
    `KEY`         VARCHAR(36) COMMENT '「key」- 文档主键，唯一标识',
    `CODE`        VARCHAR(255) COMMENT '「code」- 文档系统编号',
    `STATUS`      VARCHAR(12) COMMENT '「status」- 状态',
    `TYPE`        VARCHAR(128) COMMENT '「type」- 文档类型，用于指定子表信息',
    `CATEGORY`    VARCHAR(36) COMMENT '「category」- 文档类别, 关联对应的分类',
    /*
     关于 NAME / TITLE / FILE_NAME 三个属性的不同使用场景
     NAME - 文档名称，可在文档管理中用于别名，通常是文件本身去后缀的名称，存储文件物理属性
     FILE_NAME - 文档原始文件名，带扩展名，通常是文档上传文件名，下载时可用此作下载文件名
     */
    `NAME`        VARCHAR(255) COMMENT '「name」- 文档名称',

    -- 文档特殊属性
    `SN`          VARCHAR(255) COMMENT '「sn」- 文档编号',
    `PREFIX`      VARCHAR(255) COMMENT '「prefix」- 文档前缀',
    `BRIEF`       TEXT COMMENT '「brief」- 文档简介',
    `DESCRIPTION` TEXT COMMENT '「description」- 文档描述',
    `VERSION`     VARCHAR(32) COMMENT '「version」- 文档版本, N.N',

    -- 作者属性
    `AUTHOR`      VARCHAR(128) COMMENT '「author」- 文档作者',
    `AUTHOR_OR`   LONG COMMENT '「authorOr」- 第二作者、第三作者',

    -- 自引用
    `COPY`        BIT COMMENT '「copy」- 是否副本',
    `COPY_TO`     VARCHAR(36) COMMENT '「copy」- 若是副本，则标注是哪份文档的副本',

    /*
     直接使用 FILE_KEY 可关联到文档的唯一键值，并可根据信息下载文件，内联可直接对应到 X_ATTACHMENT 中的附件
     信息实现全文档的下载相关信息，开启下载渠道直接进入文档的处理方式，包括文档阅览模式也可根据此字段实现对应的
     下载，此处关联采用软关联模式。
     */
    `FILE_NAME`   VARCHAR(255) COMMENT '「fileName」- 原始文件名，带扩展名',
    `FILE_KEY`    VARCHAR(255) COMMENT '「fileKey」- TPL模式中的文件唯一的key（全局唯一）',

    -- 特殊字段
    `SIGMA`       VARCHAR(32) COMMENT '「sigma」- 统一标识',
    `LANGUAGE`    VARCHAR(10) COMMENT '「language」- 使用的语言',
    `ACTIVE`      BIT COMMENT '「active」- 是否启用',
    `METADATA`    TEXT COMMENT '「metadata」- 附加配置数据',

    -- Auditor字段
    `CREATED_AT`  DATETIME COMMENT '「createdAt」- 创建时间',
    `CREATED_BY`  VARCHAR(36) COMMENT '「createdBy」- 创建人',
    `UPDATED_AT`  DATETIME COMMENT '「updatedAt」- 更新时间',
    `UPDATED_BY`  VARCHAR(36) COMMENT '「updatedBy」- 更新人',
    PRIMARY KEY (`KEY`) USING BTREE
);
-- changeset Lang:d-doc-2
ALTER TABLE D_DOC
    ADD UNIQUE (`FILE_KEY`) USING BTREE;
ALTER TABLE D_DOC
    ADD UNIQUE (`NAME`, `SIGMA`, `VERSION`) USING BTREE;
ALTER TABLE D_DOC
    ADD UNIQUE (`CODE`, `SIGMA`, `VERSION`) USING BTREE;