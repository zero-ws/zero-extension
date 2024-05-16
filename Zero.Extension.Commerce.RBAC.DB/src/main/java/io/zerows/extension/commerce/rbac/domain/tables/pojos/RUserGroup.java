/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.rbac.domain.tables.pojos;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.zerows.extension.commerce.rbac.domain.tables.interfaces.IRUserGroup;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class RUserGroup implements VertxPojo, IRUserGroup {

    private static final long serialVersionUID = 1L;

    private String groupId;
    private String userId;
    private Integer priority;

    public RUserGroup() {
    }

    public RUserGroup(IRUserGroup value) {
        this.groupId = value.getGroupId();
        this.userId = value.getUserId();
        this.priority = value.getPriority();
    }

    public RUserGroup(
        String groupId,
        String userId,
        Integer priority
    ) {
        this.groupId = groupId;
        this.userId = userId;
        this.priority = priority;
    }

    public RUserGroup(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    /**
     * Getter for <code>ZDB.R_USER_GROUP.GROUP_ID</code>. 「groupId」- 关联组ID
     */
    @Override
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * Setter for <code>ZDB.R_USER_GROUP.GROUP_ID</code>. 「groupId」- 关联组ID
     */
    @Override
    public RUserGroup setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Getter for <code>ZDB.R_USER_GROUP.USER_ID</code>. 「userId」- 关联用户ID
     */
    @Override
    public String getUserId() {
        return this.userId;
    }

    /**
     * Setter for <code>ZDB.R_USER_GROUP.USER_ID</code>. 「userId」- 关联用户ID
     */
    @Override
    public RUserGroup setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Getter for <code>ZDB.R_USER_GROUP.PRIORITY</code>. 「priority」- 组优先级
     */
    @Override
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * Setter for <code>ZDB.R_USER_GROUP.PRIORITY</code>. 「priority」- 组优先级
     */
    @Override
    public RUserGroup setPriority(Integer priority) {
        this.priority = priority;
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
        final RUserGroup other = (RUserGroup) obj;
        if (this.groupId == null) {
            if (other.groupId != null)
                return false;
        } else if (!this.groupId.equals(other.groupId))
            return false;
        if (this.userId == null) {
            if (other.userId != null)
                return false;
        } else if (!this.userId.equals(other.userId))
            return false;
        if (this.priority == null) {
            if (other.priority != null)
                return false;
        } else if (!this.priority.equals(other.priority))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.groupId == null) ? 0 : this.groupId.hashCode());
        result = prime * result + ((this.userId == null) ? 0 : this.userId.hashCode());
        result = prime * result + ((this.priority == null) ? 0 : this.priority.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RUserGroup (");

        sb.append(groupId);
        sb.append(", ").append(userId);
        sb.append(", ").append(priority);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IRUserGroup from) {
        setGroupId(from.getGroupId());
        setUserId(from.getUserId());
        setPriority(from.getPriority());
    }

    @Override
    public <E extends IRUserGroup> E into(E into) {
        into.from(this);
        return into;
    }
}