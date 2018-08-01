package com.ncu.pojo;
public class CustomerType {
/* *
 * 客户类型pojo
 * */
    private Integer typeId;//客户类型id
    private String typeName;//客户类型名称
    private String isUsed;//是否被使用   使用(1) 未使用(0)

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public String getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(String isUsed) {
        this.isUsed = isUsed == null ? null : isUsed.trim();
    }
}