/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IXActivityRule extends VertxPojo, Serializable {

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.KEY</code>. 「key」- 规则主键
     */
    public IXActivityRule setKey(String value);

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.KEY</code>. 「key」- 规则主键
     */
    public String getKey();

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.DEFINITION_KEY</code>.
     * 「definitionKey」- 流程对应的 definitionKey，用于查询所有规则用
     */
    public IXActivityRule setDefinitionKey(String value);

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.DEFINITION_KEY</code>.
     * 「definitionKey」- 流程对应的 definitionKey，用于查询所有规则用
     */
    public String getDefinitionKey();

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.TASK_KEY</code>. 「taskKey」-
     * 和待办绑定的taskKey
     */
    public IXActivityRule setTaskKey(String value);

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.TASK_KEY</code>. 「taskKey」-
     * 和待办绑定的taskKey
     */
    public String getTaskKey();

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.TYPE</code>. 「type」- 规则类型
     */
    public IXActivityRule setType(String value);

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.TYPE</code>. 「type」- 规则类型
     */
    public String getType();

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.RULE_NAME</code>. 「ruleName」-
     * 规则名称，如果 type = ATOM 时读取，并设置到 typeName 中
     */
    public IXActivityRule setRuleName(String value);

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.RULE_NAME</code>. 「ruleName」-
     * 规则名称，如果 type = ATOM 时读取，并设置到 typeName 中
     */
    public String getRuleName();

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.RULE_ORDER</code>. 「ruleOrder」-
     * 规则触发顺序，修正两个时间戳，生成时序号统一，先生成的规则排序在上边
     */
    public IXActivityRule setRuleOrder(Long value);

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.RULE_ORDER</code>. 「ruleOrder」-
     * 规则触发顺序，修正两个时间戳，生成时序号统一，先生成的规则排序在上边
     */
    public Long getRuleOrder();

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.RULE_NS</code>. 「ruleNs」- 规则所属主模型名空间
     */
    public IXActivityRule setRuleNs(String value);

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.RULE_NS</code>. 「ruleNs」- 规则所属主模型名空间
     */
    public String getRuleNs();

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.RULE_IDENTIFIER</code>.
     * 「ruleIdentifier」- 主模型ID
     */
    public IXActivityRule setRuleIdentifier(String value);

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.RULE_IDENTIFIER</code>.
     * 「ruleIdentifier」- 主模型ID
     */
    public String getRuleIdentifier();

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.RULE_FIELD</code>. 「ruleField」- 主字段名
     */
    public IXActivityRule setRuleField(String value);

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.RULE_FIELD</code>. 「ruleField」- 主字段名
     */
    public String getRuleField();

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.RULE_EXPRESSION</code>.
     * 「ruleExpression」- 规则触发表达式 ( 可以是多个，JsonArray格式 )
     */
    public IXActivityRule setRuleExpression(String value);

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.RULE_EXPRESSION</code>.
     * 「ruleExpression」- 规则触发表达式 ( 可以是多个，JsonArray格式 )
     */
    public String getRuleExpression();

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.RULE_TPL</code>. 「ruleTpl」-
     * 参数模板专用，JsonObject结构
     */
    public IXActivityRule setRuleTpl(String value);

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.RULE_TPL</code>. 「ruleTpl」-
     * 参数模板专用，JsonObject结构
     */
    public String getRuleTpl();

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.RULE_CONFIG</code>. 「ruleConfig」-
     * 规则对应的额外配置
     */
    public IXActivityRule setRuleConfig(String value);

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.RULE_CONFIG</code>. 「ruleConfig」-
     * 规则对应的额外配置
     */
    public String getRuleConfig();

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.RULE_MESSAGE</code>. 「ruleMessage」-
     * 输出消息专用, Ut.fromExpression解析（特殊解析）
     */
    public IXActivityRule setRuleMessage(String value);

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.RULE_MESSAGE</code>. 「ruleMessage」-
     * 输出消息专用, Ut.fromExpression解析（特殊解析）
     */
    public String getRuleMessage();

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.HOOK_COMPONENT</code>.
     * 「hookComponent」-- 回调钩子组件
     */
    public IXActivityRule setHookComponent(String value);

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.HOOK_COMPONENT</code>.
     * 「hookComponent」-- 回调钩子组件
     */
    public String getHookComponent();

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.HOOK_CONFIG</code>. 「hookConfig」--
     * 回调钩子组件配置
     */
    public IXActivityRule setHookConfig(String value);

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.HOOK_CONFIG</code>. 「hookConfig」--
     * 回调钩子组件配置
     */
    public String getHookConfig();

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.LOGGING</code>. 「logging」- 是否记录日志
     */
    public IXActivityRule setLogging(Boolean value);

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.LOGGING</code>. 「logging」- 是否记录日志
     */
    public Boolean getLogging();

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.ACTIVE</code>. 「active」- 是否启用
     */
    public IXActivityRule setActive(Boolean value);

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.SIGMA</code>. 「sigma」- 统一标识
     */
    public IXActivityRule setSigma(String value);

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.METADATA</code>. 「metadata」- 附加配置
     */
    public IXActivityRule setMetadata(String value);

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.METADATA</code>. 「metadata」- 附加配置
     */
    public String getMetadata();

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IXActivityRule setLanguage(String value);

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IXActivityRule setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IXActivityRule setCreatedBy(String value);

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IXActivityRule setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>ZDB.X_ACTIVITY_RULE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IXActivityRule setUpdatedBy(String value);

    /**
     * Getter for <code>ZDB.X_ACTIVITY_RULE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IXActivityRule
     */
    public void from(IXActivityRule from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IXActivityRule
     */
    public <E extends IXActivityRule> E into(E into);

        @Override
        public default IXActivityRule fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setDefinitionKey,json::getString,"DEFINITION_KEY","java.lang.String");
                setOrThrow(this::setTaskKey,json::getString,"TASK_KEY","java.lang.String");
                setOrThrow(this::setType,json::getString,"TYPE","java.lang.String");
                setOrThrow(this::setRuleName,json::getString,"RULE_NAME","java.lang.String");
                setOrThrow(this::setRuleOrder,json::getLong,"RULE_ORDER","java.lang.Long");
                setOrThrow(this::setRuleNs,json::getString,"RULE_NS","java.lang.String");
                setOrThrow(this::setRuleIdentifier,json::getString,"RULE_IDENTIFIER","java.lang.String");
                setOrThrow(this::setRuleField,json::getString,"RULE_FIELD","java.lang.String");
                setOrThrow(this::setRuleExpression,json::getString,"RULE_EXPRESSION","java.lang.String");
                setOrThrow(this::setRuleTpl,json::getString,"RULE_TPL","java.lang.String");
                setOrThrow(this::setRuleConfig,json::getString,"RULE_CONFIG","java.lang.String");
                setOrThrow(this::setRuleMessage,json::getString,"RULE_MESSAGE","java.lang.String");
                setOrThrow(this::setHookComponent,json::getString,"HOOK_COMPONENT","java.lang.String");
                setOrThrow(this::setHookConfig,json::getString,"HOOK_CONFIG","java.lang.String");
                setOrThrow(this::setLogging,json::getBoolean,"LOGGING","java.lang.Boolean");
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
                json.put("DEFINITION_KEY",getDefinitionKey());
                json.put("TASK_KEY",getTaskKey());
                json.put("TYPE",getType());
                json.put("RULE_NAME",getRuleName());
                json.put("RULE_ORDER",getRuleOrder());
                json.put("RULE_NS",getRuleNs());
                json.put("RULE_IDENTIFIER",getRuleIdentifier());
                json.put("RULE_FIELD",getRuleField());
                json.put("RULE_EXPRESSION",getRuleExpression());
                json.put("RULE_TPL",getRuleTpl());
                json.put("RULE_CONFIG",getRuleConfig());
                json.put("RULE_MESSAGE",getRuleMessage());
                json.put("HOOK_COMPONENT",getHookComponent());
                json.put("HOOK_CONFIG",getHookConfig());
                json.put("LOGGING",getLogging());
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
