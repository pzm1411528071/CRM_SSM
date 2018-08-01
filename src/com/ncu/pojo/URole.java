package com.ncu.pojo;
public class URole {
/* *
 * 用户--角色(多对多)
 * 用户角色中间表pojo
 * */
    private Integer userId;//用户角色中间表--用户id
    private Integer roleId;//用户角色中间表--角色id

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}