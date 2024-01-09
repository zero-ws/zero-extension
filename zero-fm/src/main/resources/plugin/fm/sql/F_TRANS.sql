-- liquibase formatted sql

-- changeset Lang:f-trans-1
DROP TABLE IF EXISTS `F_TRANS`;
CREATE TABLE `F_TRANS`
(
    `KEY`        VARCHAR(36) COMMENT '「key」- 交易单主键ID',
    `NAME`       VARCHAR(255) COMMENT '「name」 - 交易单标题',
    `CODE`       VARCHAR(255)   NOT NULL COMMENT '「code」 - 交易单编号',
    `SERIAL`     VARCHAR(36)    NOT NULL COMMENT '「serial」 - 交易单据号',

    /*
     * 交易单类型
     * SETTLEMENT - 针对结算单的交易
     * DEBT - 针对欠款单的交易
     * REFUND - 针对退款单的交易
     */
    `TYPE`       VARCHAR(32)    NOT NULL COMMENT '「type」 - 交易单类型',
    `STATUS`     VARCHAR(36)    NOT NULL COMMENT '「status」 - 交易状态',
    -- 交易总金额
    `AMOUNT`     DECIMAL(18, 2) NOT NULL COMMENT '「amount」——价税合计，所有明细对应的实际结算金额',
    `AMOUNT_PRE` DECIMAL(18, 2) COMMENT '「amountPre」预付金额',
    -- 预付信息
    `PREPAY`     BIT COMMENT '「prepay」- 是否预付',
    `COMMENT`    LONGTEXT COMMENT '「comment」 - 备注',

    -- 特殊字段
    `SIGMA`      VARCHAR(32) COMMENT '「sigma」- 统一标识',
    `LANGUAGE`   VARCHAR(10) COMMENT '「language」- 使用的语言',
    `ACTIVE`     BIT COMMENT '「active」- 是否启用',
    `METADATA`   TEXT COMMENT '「metadata」- 附加配置数据',

    -- Auditor字段
    `CREATED_AT` DATETIME COMMENT '「createdAt」- 创建时间',
    `CREATED_BY` VARCHAR(36) COMMENT '「createdBy」- 创建人',
    `UPDATED_AT` DATETIME COMMENT '「updatedAt」- 更新时间',
    `UPDATED_BY` VARCHAR(36) COMMENT '「updatedBy」- 更新人',
    PRIMARY KEY (`KEY`)
);
-- changeset Lang:f-trans-2
ALTER TABLE F_TRANS
    ADD UNIQUE (`CODE`, `SIGMA`);
ALTER TABLE F_TRANS
    ADD UNIQUE (`SERIAL`, `SIGMA`);
