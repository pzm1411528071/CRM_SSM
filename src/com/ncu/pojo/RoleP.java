package com.ncu.pojo;
public class RoleP {
/* * 
 * 角色--权限(多对多)
 * 角色权限中间表对应的pojo
 * */
    private Integer roleId;//角色权限中间表--用户角色id
    private Integer pId;//角色权限中间表--权限id

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }
}