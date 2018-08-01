package com.ncu.pojo;
public class DepartmentInfo {
/* *
 * 部门信息pojo
 * */
    private Integer departmentId;//部门id
    private String departmentName;//部门名称
    private String departmentDesc;//部门描述
    private String isUsed;//是否被使用   使用(1) 未使用(0)

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    public String getDepartmentDesc() {
        return departmentDesc;
    }

    public void setDepartmentDesc(String departmentDesc) {
        this.departmentDesc = departmentDesc == null ? null : departmentDesc.trim();
    }

    public String getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(String isUsed) {
        this.isUsed = isUsed == null ? null : isUsed.trim();
    }
}