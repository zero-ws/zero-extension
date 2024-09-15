package io.zerows.extension.commerce.rbac.atom;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.horizon.uca.cache.Cc;
import io.vertx.core.json.JsonObject;
import io.vertx.up.util.Ut;
import io.zerows.core.feature.web.mbse.atom.specification.KQr;
import io.zerows.jackson.databind.JsonObjectDeserializer;
import io.zerows.jackson.databind.JsonObjectSerializer;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/*
 * Security configuration data
 *
 */
public class ScConfig implements Serializable {
    private static final Cc<String, KQr> CC_KQR = Cc.open();
    /*
     * Message Code expired time: ( s )，秒
     */
    private final Integer messageExpired = 60;
    /*
     * Unique condition for Security Entity
     * 1) User
     * 2) Role
     * 3) Group
     * 4) Permission
     * 5) Action
     * 6) Resource
     */
    private ScCondition condition = new ScCondition();
    /*
     * Authorization Code expired time: ( s )，秒
     */
    private Integer codeExpired = 30;
    /*
     * Authorization Code length ( random string )
     */
    private Integer codeLength = 8;
    /*
     * WebToken expired time: ( min ), 分钟
     */
    private Long tokenExpired = 30L;
    /*
     * Enable user group feature
     */
    private Boolean supportGroup = Boolean.FALSE;
    /*
     * Enable secondary cache for permissions ( role = xxx )
     */
    private Boolean supportSecondary = Boolean.FALSE;
    /*
     * Enable multi application, whether search action with X-Sigma Header
     */
    private Boolean supportMultiApp = Boolean.TRUE;
    private Boolean supportIntegration = Boolean.FALSE;
    /*
     * Enable image code here, if enabled, the login component must be
     * from `ExLogin` switched to `ExEntry` instead, because here need
     * additional parameters `verifyCode` instead password only.
     */
    private Boolean verifyCode = Boolean.FALSE;
    /*
     * Enable login counter limitation.
     */
    private Integer verifyLimitation = null;
    /*
     * When verifyLimitation is not null, this means the duration when counter ended.
     * For example:
     * 1. verifyLimitation = 3
     * 2. verifyDuration = 300
     * It means 3 max login handler times per 300 seconds.
     * 3 times / 300 seconds
     */
    private Integer verifyDuration = 300;
    /*
     * Password Init
     */
    private String initializePassword;
    @JsonSerialize(using = JsonObjectSerializer.class)
    @JsonDeserialize(using = JsonObjectDeserializer.class)
    private JsonObject initialize = new JsonObject();
    @JsonSerialize(using = JsonObjectSerializer.class)
    @JsonDeserialize(using = JsonObjectDeserializer.class)
    private JsonObject category = new JsonObject();

    public String getInitializePassword() {
        return this.initializePassword;
    }

    public void setInitializePassword(final String initializePassword) {
        this.initializePassword = initializePassword;
    }

    public ScCondition getCondition() {
        return this.condition;
    }

    public void setCondition(final ScCondition condition) {
        this.condition = condition;
    }

    /*
     * 默认使用秒，所以此处不转换
     */
    public Integer getCodeExpired() {
        return this.codeExpired;
    }

    public void setCodeExpired(final Integer codeExpired) {
        this.codeExpired = codeExpired;
    }

    public Integer getCodeLength() {
        return this.codeLength;
    }

    public void setCodeLength(final Integer codeLength) {
        this.codeLength = codeLength;
    }


    public Boolean getSupportSecondary() {
        return this.supportSecondary;
    }

    public void setSupportSecondary(final Boolean supportSecondary) {
        this.supportSecondary = supportSecondary;
    }

    /**
     * 默认使用分钟，所以此处分钟转秒
     *
     * @return 返回秒
     */
    public Integer getTokenExpired() {
        if (null == this.tokenExpired) {
            this.tokenExpired = 0L;
        }
        return Math.toIntExact(TimeUnit.MINUTES.toSeconds(this.tokenExpired));
    }

    public void setTokenExpired(final Long tokenExpired) {
        this.tokenExpired = tokenExpired;
    }

    public Integer getMessageExpired() {
        return this.messageExpired;
    }

    public Boolean getVerifyCode() {
        return this.verifyCode;
    }

    public void setVerifyCode(final Boolean verifyCode) {
        this.verifyCode = verifyCode;
    }

    public Integer getVerifyLimitation() {
        return this.verifyLimitation;
    }

    public void setVerifyLimitation(final Integer verifyLimitation) {
        this.verifyLimitation = verifyLimitation;
    }

    public Integer getVerifyDuration() {
        return this.verifyDuration;
    }

    public void setVerifyDuration(final Integer verifyDuration) {
        this.verifyDuration = verifyDuration;
    }

    public Boolean getSupportGroup() {
        return this.supportGroup;
    }

    public void setSupportGroup(final Boolean supportGroup) {
        this.supportGroup = supportGroup;
    }

    public Boolean getSupportMultiApp() {
        return this.supportMultiApp;
    }

    public void setSupportMultiApp(final Boolean supportMultiApp) {
        this.supportMultiApp = supportMultiApp;
    }

    public JsonObject getCategory() {
        return this.category;
    }

    public void setCategory(final JsonObject category) {
        this.category = category;
    }

    public Boolean getSupportIntegration() {
        return this.supportIntegration;
    }

    public void setSupportIntegration(final Boolean supportIntegration) {
        this.supportIntegration = supportIntegration;
    }

    public KQr category(final String name) {
        return CC_KQR.pick(() -> {
            final JsonObject serializeJ = Ut.valueJObject(this.category, name);
            final KQr qr = Ut.deserialize(serializeJ, KQr.class);
            if (qr.valid()) {
                return qr.identifier(name);
            } else {
                return null;
            }
        }, name);
    }

    public JsonObject getInitialize() {
        return this.initialize;
    }

    public void setInitialize(final JsonObject initialize) {
        this.initialize = initialize;
    }

    @Override
    public String toString() {
        return "ScConfig{" +
            ", condition=" + this.condition +
            ", codeExpired=" + this.codeExpired +
            ", codeLength=" + this.codeLength +
            ", tokenExpired=" + this.tokenExpired +
            ", supportGroup=" + this.supportGroup +
            ", supportSecondary=" + this.supportSecondary +
            ", supportMultiApp=" + this.supportMultiApp +
            ", supportIntegration=" + this.supportIntegration +
            ", verifyCode=" + this.verifyCode +
            ", verifyLimitation=" + this.verifyLimitation +
            ", verifyDuration=" + this.verifyDuration +
            ", initializePassword='" + this.initializePassword + '\'' +
            ", initialize=" + this.initialize +
            ", category=" + this.category +
            '}';
    }
}
