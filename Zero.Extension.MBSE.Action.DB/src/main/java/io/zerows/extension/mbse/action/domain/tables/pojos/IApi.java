/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.mbse.action.domain.tables.pojos;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.zerows.extension.mbse.action.domain.tables.interfaces.IIApi;

import java.time.LocalDateTime;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class IApi implements VertxPojo, IIApi {

    private static final long serialVersionUID = 1L;

    private String key;
    private String name;
    private String uri;
    private String method;
    private String consumes;
    private String produces;
    private Boolean secure;
    private String comment;
    private String type;
    private String paramMode;
    private String paramRequired;
    private String paramContained;
    private String inRule;
    private String inMapping;
    private String inPlug;
    private String inScript;
    private String outWriter;
    private String workerType;
    private String workerAddress;
    private String workerConsumer;
    private String workerClass;
    private String workerJs;
    private String serviceId;
    private String sigma;
    private String language;
    private Boolean active;
    private String metadata;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public IApi() {
    }

    public IApi(IIApi value) {
        this.key = value.getKey();
        this.name = value.getName();
        this.uri = value.getUri();
        this.method = value.getMethod();
        this.consumes = value.getConsumes();
        this.produces = value.getProduces();
        this.secure = value.getSecure();
        this.comment = value.getComment();
        this.type = value.getType();
        this.paramMode = value.getParamMode();
        this.paramRequired = value.getParamRequired();
        this.paramContained = value.getParamContained();
        this.inRule = value.getInRule();
        this.inMapping = value.getInMapping();
        this.inPlug = value.getInPlug();
        this.inScript = value.getInScript();
        this.outWriter = value.getOutWriter();
        this.workerType = value.getWorkerType();
        this.workerAddress = value.getWorkerAddress();
        this.workerConsumer = value.getWorkerConsumer();
        this.workerClass = value.getWorkerClass();
        this.workerJs = value.getWorkerJs();
        this.serviceId = value.getServiceId();
        this.sigma = value.getSigma();
        this.language = value.getLanguage();
        this.active = value.getActive();
        this.metadata = value.getMetadata();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public IApi(
        String key,
        String name,
        String uri,
        String method,
        String consumes,
        String produces,
        Boolean secure,
        String comment,
        String type,
        String paramMode,
        String paramRequired,
        String paramContained,
        String inRule,
        String inMapping,
        String inPlug,
        String inScript,
        String outWriter,
        String workerType,
        String workerAddress,
        String workerConsumer,
        String workerClass,
        String workerJs,
        String serviceId,
        String sigma,
        String language,
        Boolean active,
        String metadata,
        LocalDateTime createdAt,
        String createdBy,
        LocalDateTime updatedAt,
        String updatedBy
    ) {
        this.key = key;
        this.name = name;
        this.uri = uri;
        this.method = method;
        this.consumes = consumes;
        this.produces = produces;
        this.secure = secure;
        this.comment = comment;
        this.type = type;
        this.paramMode = paramMode;
        this.paramRequired = paramRequired;
        this.paramContained = paramContained;
        this.inRule = inRule;
        this.inMapping = inMapping;
        this.inPlug = inPlug;
        this.inScript = inScript;
        this.outWriter = outWriter;
        this.workerType = workerType;
        this.workerAddress = workerAddress;
        this.workerConsumer = workerConsumer;
        this.workerClass = workerClass;
        this.workerJs = workerJs;
        this.serviceId = serviceId;
        this.sigma = sigma;
        this.language = language;
        this.active = active;
        this.metadata = metadata;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public IApi(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    /**
     * Getter for <code>ZDB.I_API.KEY</code>. 「key」- 接口ID
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>ZDB.I_API.KEY</code>. 「key」- 接口ID
     */
    @Override
    public IApi setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>ZDB.I_API.NAME</code>. 「name」- 接口名称
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>ZDB.I_API.NAME</code>. 「name」- 接口名称
     */
    @Override
    public IApi setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>ZDB.I_API.URI</code>. 「uri」- 接口路径，安全路径位于 /api 之下
     */
    @Override
    public String getUri() {
        return this.uri;
    }

    /**
     * Setter for <code>ZDB.I_API.URI</code>. 「uri」- 接口路径，安全路径位于 /api 之下
     */
    @Override
    public IApi setUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Getter for <code>ZDB.I_API.METHOD</code>. 「method」- 接口对应的HTTP方法
     */
    @Override
    public String getMethod() {
        return this.method;
    }

    /**
     * Setter for <code>ZDB.I_API.METHOD</code>. 「method」- 接口对应的HTTP方法
     */
    @Override
    public IApi setMethod(String method) {
        this.method = method;
        return this;
    }

    /**
     * Getter for <code>ZDB.I_API.CONSUMES</code>. 「consumes」- 当前接口使用的客户端 MIME
     */
    @Override
    public String getConsumes() {
        return this.consumes;
    }

    /**
     * Setter for <code>ZDB.I_API.CONSUMES</code>. 「consumes」- 当前接口使用的客户端 MIME
     */
    @Override
    public IApi setConsumes(String consumes) {
        this.consumes = consumes;
        return this;
    }

    /**
     * Getter for <code>ZDB.I_API.PRODUCES</code>. 「produces」- 当前接口使用的服务端 MIME
     */
    @Override
    public String getProduces() {
        return this.produces;
    }

    /**
     * Setter for <code>ZDB.I_API.PRODUCES</code>. 「produces」- 当前接口使用的服务端 MIME
     */
    @Override
    public IApi setProduces(String produces) {
        this.produces = produces;
        return this;
    }

    /**
     * Getter for <code>ZDB.I_API.SECURE</code>. 「secure」- 是否走安全通道，默认为TRUE
     */
    @Override
    public Boolean getSecure() {
        return this.secure;
    }

    /**
     * Setter for <code>ZDB.I_API.SECURE</code>. 「secure」- 是否走安全通道，默认为TRUE
     */
    @Override
    public IApi setSecure(Boolean secure) {
        this.secure = secure;
        return this;
    }

    /**
     * Getter for <code>ZDB.I_API.COMMENT</code>. 「comment」- 备注信息
     */
    @Override
    public String getComment() {
        return this.comment;
    }

    /**
     * Setter for <code>ZDB.I_API.COMMENT</code>. 「comment」- 备注信息
     */
    @Override
    public IApi setComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Getter for <code>ZDB.I_API.TYPE</code>. 「type」- 通信类型，ONE-WAY /
     * REQUEST-RESPONSE / PUBLISH-SUBSCRIBE
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>ZDB.I_API.TYPE</code>. 「type」- 通信类型，ONE-WAY /
     * REQUEST-RESPONSE / PUBLISH-SUBSCRIBE
     */
    @Override
    public IApi setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>ZDB.I_API.PARAM_MODE</code>. 「paramMode」- 参数来源，QUERY /
     * BODY / DEFINE / PATH
     */
    @Override
    public String getParamMode() {
        return this.paramMode;
    }

    /**
     * Setter for <code>ZDB.I_API.PARAM_MODE</code>. 「paramMode」- 参数来源，QUERY /
     * BODY / DEFINE / PATH
     */
    @Override
    public IApi setParamMode(String paramMode) {
        this.paramMode = paramMode;
        return this;
    }

    /**
     * Getter for <code>ZDB.I_API.PARAM_REQUIRED</code>. 「paramRequired」-
     * 必须参数表，一个JsonArray用于返回 400基本验证（验证Query和Path）
     */
    @Override
    public String getParamRequired() {
        return this.paramRequired;
    }

    /**
     * Setter for <code>ZDB.I_API.PARAM_REQUIRED</code>. 「paramRequired」-
     * 必须参数表，一个JsonArray用于返回 400基本验证（验证Query和Path）
     */
    @Override
    public IApi setParamRequired(String paramRequired) {
        this.paramRequired = paramRequired;
        return this;
    }

    /**
     * Getter for <code>ZDB.I_API.PARAM_CONTAINED</code>. 「paramContained」-
     * 必须参数表，一个JsonArray用于返回 400基本验证（验证Body）
     */
    @Override
    public String getParamContained() {
        return this.paramContained;
    }

    /**
     * Setter for <code>ZDB.I_API.PARAM_CONTAINED</code>. 「paramContained」-
     * 必须参数表，一个JsonArray用于返回 400基本验证（验证Body）
     */
    @Override
    public IApi setParamContained(String paramContained) {
        this.paramContained = paramContained;
        return this;
    }

    /**
     * Getter for <code>ZDB.I_API.IN_RULE</code>. 「inRule」- 参数验证、转换基本规则
     */
    @Override
    public String getInRule() {
        return this.inRule;
    }

    /**
     * Setter for <code>ZDB.I_API.IN_RULE</code>. 「inRule」- 参数验证、转换基本规则
     */
    @Override
    public IApi setInRule(String inRule) {
        this.inRule = inRule;
        return this;
    }

    /**
     * Getter for <code>ZDB.I_API.IN_MAPPING</code>. 「inMapping」- 参数映射规则
     */
    @Override
    public String getInMapping() {
        return this.inMapping;
    }

    /**
     * Setter for <code>ZDB.I_API.IN_MAPPING</code>. 「inMapping」- 参数映射规则
     */
    @Override
    public IApi setInMapping(String inMapping) {
        this.inMapping = inMapping;
        return this;
    }

    /**
     * Getter for <code>ZDB.I_API.IN_PLUG</code>. 「inPlug」- 参数请求流程中的插件
     */
    @Override
    public String getInPlug() {
        return this.inPlug;
    }

    /**
     * Setter for <code>ZDB.I_API.IN_PLUG</code>. 「inPlug」- 参数请求流程中的插件
     */
    @Override
    public IApi setInPlug(String inPlug) {
        this.inPlug = inPlug;
        return this;
    }

    /**
     * Getter for <code>ZDB.I_API.IN_SCRIPT</code>. 「inScript」- 【保留】参数请求流程中的脚本控制
     */
    @Override
    public String getInScript() {
        return this.inScript;
    }

    /**
     * Setter for <code>ZDB.I_API.IN_SCRIPT</code>. 「inScript」- 【保留】参数请求流程中的脚本控制
     */
    @Override
    public IApi setInScript(String inScript) {
        this.inScript = inScript;
        return this;
    }

    /**
     * Getter for <code>ZDB.I_API.OUT_WRITER</code>. 「outWriter」- 响应格式处理器
     */
    @Override
    public String getOutWriter() {
        return this.outWriter;
    }

    /**
     * Setter for <code>ZDB.I_API.OUT_WRITER</code>. 「outWriter」- 响应格式处理器
     */
    @Override
    public IApi setOutWriter(String outWriter) {
        this.outWriter = outWriter;
        return this;
    }

    /**
     * Getter for <code>ZDB.I_API.WORKER_TYPE</code>. 「workerType」- Worker类型：JS
     * / PLUG / STD
     */
    @Override
    public String getWorkerType() {
        return this.workerType;
    }

    /**
     * Setter for <code>ZDB.I_API.WORKER_TYPE</code>. 「workerType」- Worker类型：JS
     * / PLUG / STD
     */
    @Override
    public IApi setWorkerType(String workerType) {
        this.workerType = workerType;
        return this;
    }

    /**
     * Getter for <code>ZDB.I_API.WORKER_ADDRESS</code>. 「workerAddress」- 请求发送地址
     */
    @Override
    public String getWorkerAddress() {
        return this.workerAddress;
    }

    /**
     * Setter for <code>ZDB.I_API.WORKER_ADDRESS</code>. 「workerAddress」- 请求发送地址
     */
    @Override
    public IApi setWorkerAddress(String workerAddress) {
        this.workerAddress = workerAddress;
        return this;
    }

    /**
     * Getter for <code>ZDB.I_API.WORKER_CONSUMER</code>. 「workerConsumer」-
     * 请求地址消费专用组件
     */
    @Override
    public String getWorkerConsumer() {
        return this.workerConsumer;
    }

    /**
     * Setter for <code>ZDB.I_API.WORKER_CONSUMER</code>. 「workerConsumer」-
     * 请求地址消费专用组件
     */
    @Override
    public IApi setWorkerConsumer(String workerConsumer) {
        this.workerConsumer = workerConsumer;
        return this;
    }

    /**
     * Getter for <code>ZDB.I_API.WORKER_CLASS</code>. 「workerClass」- OX |
     * PLUG专用，请求执行器对应的JavaClass名称
     */
    @Override
    public String getWorkerClass() {
        return this.workerClass;
    }

    /**
     * Setter for <code>ZDB.I_API.WORKER_CLASS</code>. 「workerClass」- OX |
     * PLUG专用，请求执行器对应的JavaClass名称
     */
    @Override
    public IApi setWorkerClass(String workerClass) {
        this.workerClass = workerClass;
        return this;
    }

    /**
     * Getter for <code>ZDB.I_API.WORKER_JS</code>. 「workerJs」- JS
     * 专用，JavaScript路径：runtime/workers/&lt;app&gt;/下的执行器
     */
    @Override
    public String getWorkerJs() {
        return this.workerJs;
    }

    /**
     * Setter for <code>ZDB.I_API.WORKER_JS</code>. 「workerJs」- JS
     * 专用，JavaScript路径：runtime/workers/&lt;app&gt;/下的执行器
     */
    @Override
    public IApi setWorkerJs(String workerJs) {
        this.workerJs = workerJs;
        return this;
    }

    /**
     * Getter for <code>ZDB.I_API.SERVICE_ID</code>. 「serviceId」- 关联的服务ID
     */
    @Override
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * Setter for <code>ZDB.I_API.SERVICE_ID</code>. 「serviceId」- 关联的服务ID
     */
    @Override
    public IApi setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * Getter for <code>ZDB.I_API.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>ZDB.I_API.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public IApi setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>ZDB.I_API.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>ZDB.I_API.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public IApi setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>ZDB.I_API.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>ZDB.I_API.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public IApi setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>ZDB.I_API.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>ZDB.I_API.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public IApi setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>ZDB.I_API.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>ZDB.I_API.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public IApi setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.I_API.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>ZDB.I_API.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public IApi setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>ZDB.I_API.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>ZDB.I_API.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public IApi setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.I_API.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>ZDB.I_API.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public IApi setUpdatedBy(String updatedBy) {
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
        final IApi other = (IApi) obj;
        if (this.key == null) {
            if (other.key != null)
                return false;
        } else if (!this.key.equals(other.key))
            return false;
        if (this.name == null) {
            if (other.name != null)
                return false;
        } else if (!this.name.equals(other.name))
            return false;
        if (this.uri == null) {
            if (other.uri != null)
                return false;
        } else if (!this.uri.equals(other.uri))
            return false;
        if (this.method == null) {
            if (other.method != null)
                return false;
        } else if (!this.method.equals(other.method))
            return false;
        if (this.consumes == null) {
            if (other.consumes != null)
                return false;
        } else if (!this.consumes.equals(other.consumes))
            return false;
        if (this.produces == null) {
            if (other.produces != null)
                return false;
        } else if (!this.produces.equals(other.produces))
            return false;
        if (this.secure == null) {
            if (other.secure != null)
                return false;
        } else if (!this.secure.equals(other.secure))
            return false;
        if (this.comment == null) {
            if (other.comment != null)
                return false;
        } else if (!this.comment.equals(other.comment))
            return false;
        if (this.type == null) {
            if (other.type != null)
                return false;
        } else if (!this.type.equals(other.type))
            return false;
        if (this.paramMode == null) {
            if (other.paramMode != null)
                return false;
        } else if (!this.paramMode.equals(other.paramMode))
            return false;
        if (this.paramRequired == null) {
            if (other.paramRequired != null)
                return false;
        } else if (!this.paramRequired.equals(other.paramRequired))
            return false;
        if (this.paramContained == null) {
            if (other.paramContained != null)
                return false;
        } else if (!this.paramContained.equals(other.paramContained))
            return false;
        if (this.inRule == null) {
            if (other.inRule != null)
                return false;
        } else if (!this.inRule.equals(other.inRule))
            return false;
        if (this.inMapping == null) {
            if (other.inMapping != null)
                return false;
        } else if (!this.inMapping.equals(other.inMapping))
            return false;
        if (this.inPlug == null) {
            if (other.inPlug != null)
                return false;
        } else if (!this.inPlug.equals(other.inPlug))
            return false;
        if (this.inScript == null) {
            if (other.inScript != null)
                return false;
        } else if (!this.inScript.equals(other.inScript))
            return false;
        if (this.outWriter == null) {
            if (other.outWriter != null)
                return false;
        } else if (!this.outWriter.equals(other.outWriter))
            return false;
        if (this.workerType == null) {
            if (other.workerType != null)
                return false;
        } else if (!this.workerType.equals(other.workerType))
            return false;
        if (this.workerAddress == null) {
            if (other.workerAddress != null)
                return false;
        } else if (!this.workerAddress.equals(other.workerAddress))
            return false;
        if (this.workerConsumer == null) {
            if (other.workerConsumer != null)
                return false;
        } else if (!this.workerConsumer.equals(other.workerConsumer))
            return false;
        if (this.workerClass == null) {
            if (other.workerClass != null)
                return false;
        } else if (!this.workerClass.equals(other.workerClass))
            return false;
        if (this.workerJs == null) {
            if (other.workerJs != null)
                return false;
        } else if (!this.workerJs.equals(other.workerJs))
            return false;
        if (this.serviceId == null) {
            if (other.serviceId != null)
                return false;
        } else if (!this.serviceId.equals(other.serviceId))
            return false;
        if (this.sigma == null) {
            if (other.sigma != null)
                return false;
        } else if (!this.sigma.equals(other.sigma))
            return false;
        if (this.language == null) {
            if (other.language != null)
                return false;
        } else if (!this.language.equals(other.language))
            return false;
        if (this.active == null) {
            if (other.active != null)
                return false;
        } else if (!this.active.equals(other.active))
            return false;
        if (this.metadata == null) {
            if (other.metadata != null)
                return false;
        } else if (!this.metadata.equals(other.metadata))
            return false;
        if (this.createdAt == null) {
            if (other.createdAt != null)
                return false;
        } else if (!this.createdAt.equals(other.createdAt))
            return false;
        if (this.createdBy == null) {
            if (other.createdBy != null)
                return false;
        } else if (!this.createdBy.equals(other.createdBy))
            return false;
        if (this.updatedAt == null) {
            if (other.updatedAt != null)
                return false;
        } else if (!this.updatedAt.equals(other.updatedAt))
            return false;
        if (this.updatedBy == null) {
            if (other.updatedBy != null)
                return false;
        } else if (!this.updatedBy.equals(other.updatedBy))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.key == null) ? 0 : this.key.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.uri == null) ? 0 : this.uri.hashCode());
        result = prime * result + ((this.method == null) ? 0 : this.method.hashCode());
        result = prime * result + ((this.consumes == null) ? 0 : this.consumes.hashCode());
        result = prime * result + ((this.produces == null) ? 0 : this.produces.hashCode());
        result = prime * result + ((this.secure == null) ? 0 : this.secure.hashCode());
        result = prime * result + ((this.comment == null) ? 0 : this.comment.hashCode());
        result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
        result = prime * result + ((this.paramMode == null) ? 0 : this.paramMode.hashCode());
        result = prime * result + ((this.paramRequired == null) ? 0 : this.paramRequired.hashCode());
        result = prime * result + ((this.paramContained == null) ? 0 : this.paramContained.hashCode());
        result = prime * result + ((this.inRule == null) ? 0 : this.inRule.hashCode());
        result = prime * result + ((this.inMapping == null) ? 0 : this.inMapping.hashCode());
        result = prime * result + ((this.inPlug == null) ? 0 : this.inPlug.hashCode());
        result = prime * result + ((this.inScript == null) ? 0 : this.inScript.hashCode());
        result = prime * result + ((this.outWriter == null) ? 0 : this.outWriter.hashCode());
        result = prime * result + ((this.workerType == null) ? 0 : this.workerType.hashCode());
        result = prime * result + ((this.workerAddress == null) ? 0 : this.workerAddress.hashCode());
        result = prime * result + ((this.workerConsumer == null) ? 0 : this.workerConsumer.hashCode());
        result = prime * result + ((this.workerClass == null) ? 0 : this.workerClass.hashCode());
        result = prime * result + ((this.workerJs == null) ? 0 : this.workerJs.hashCode());
        result = prime * result + ((this.serviceId == null) ? 0 : this.serviceId.hashCode());
        result = prime * result + ((this.sigma == null) ? 0 : this.sigma.hashCode());
        result = prime * result + ((this.language == null) ? 0 : this.language.hashCode());
        result = prime * result + ((this.active == null) ? 0 : this.active.hashCode());
        result = prime * result + ((this.metadata == null) ? 0 : this.metadata.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.updatedAt == null) ? 0 : this.updatedAt.hashCode());
        result = prime * result + ((this.updatedBy == null) ? 0 : this.updatedBy.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("IApi (");

        sb.append(key);
        sb.append(", ").append(name);
        sb.append(", ").append(uri);
        sb.append(", ").append(method);
        sb.append(", ").append(consumes);
        sb.append(", ").append(produces);
        sb.append(", ").append(secure);
        sb.append(", ").append(comment);
        sb.append(", ").append(type);
        sb.append(", ").append(paramMode);
        sb.append(", ").append(paramRequired);
        sb.append(", ").append(paramContained);
        sb.append(", ").append(inRule);
        sb.append(", ").append(inMapping);
        sb.append(", ").append(inPlug);
        sb.append(", ").append(inScript);
        sb.append(", ").append(outWriter);
        sb.append(", ").append(workerType);
        sb.append(", ").append(workerAddress);
        sb.append(", ").append(workerConsumer);
        sb.append(", ").append(workerClass);
        sb.append(", ").append(workerJs);
        sb.append(", ").append(serviceId);
        sb.append(", ").append(sigma);
        sb.append(", ").append(language);
        sb.append(", ").append(active);
        sb.append(", ").append(metadata);
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
    public void from(IIApi from) {
        setKey(from.getKey());
        setName(from.getName());
        setUri(from.getUri());
        setMethod(from.getMethod());
        setConsumes(from.getConsumes());
        setProduces(from.getProduces());
        setSecure(from.getSecure());
        setComment(from.getComment());
        setType(from.getType());
        setParamMode(from.getParamMode());
        setParamRequired(from.getParamRequired());
        setParamContained(from.getParamContained());
        setInRule(from.getInRule());
        setInMapping(from.getInMapping());
        setInPlug(from.getInPlug());
        setInScript(from.getInScript());
        setOutWriter(from.getOutWriter());
        setWorkerType(from.getWorkerType());
        setWorkerAddress(from.getWorkerAddress());
        setWorkerConsumer(from.getWorkerConsumer());
        setWorkerClass(from.getWorkerClass());
        setWorkerJs(from.getWorkerJs());
        setServiceId(from.getServiceId());
        setSigma(from.getSigma());
        setLanguage(from.getLanguage());
        setActive(from.getActive());
        setMetadata(from.getMetadata());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    @Override
    public <E extends IIApi> E into(E into) {
        into.from(this);
        return into;
    }
}