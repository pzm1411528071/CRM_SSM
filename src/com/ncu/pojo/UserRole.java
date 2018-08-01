package com.ncu.pojo;
public class UserRole {
/* *
 * 用户角色pojo
 * */
    private Integer roleId;//用户角色
    private String roleName;//用户角色名称
    private Integer rolePower;//用户角色等级
    private String isUsed;//是否被使用   使用(1) 未使用(0)
    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public Integer getRolePower() {
        return rolePower;
    }

    public void setRolePower(Integer rolePower) {
        this.rolePower = rolePower;
    }

    public String getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(String isUsed) {
        this.isUsed = isUsed == null ? null : isUsed.trim();
    }
}