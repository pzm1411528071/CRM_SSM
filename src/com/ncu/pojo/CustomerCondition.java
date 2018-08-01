package com.ncu.pojo;
public class CustomerCondition {
/* *
 * 客户状态pojo
 * */
    private Integer conditionId;//客户状态id
    private String conditionName;//客户状态名称
    private String conditionExplain;//客户状态解释
    private String isUsed;//是否被使用   使用(1) 未使用(0)
    private String customerName;//客户姓名
    private String customerSex;//客户性别
    private String customerMobile;//客户电话

    public Integer getConditionId() {
        return conditionId;
    }

    public void setConditionId(Integer conditionId) {
        this.conditionId = conditionId;
    }

    public String getConditionName() {
        return conditionName;
    }

    public void setConditionName(String conditionName) {
        this.conditionName = conditionName == null ? null : conditionName.trim();
    }

    public String getConditionExplain() {
        return conditionExplain;
    }

    public void setConditionExplain(String conditionExplain) {
        this.conditionExplain = conditionExplain == null ? null : conditionExplain.trim();
    }

    public String getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(String isUsed) {
        this.isUsed = isUsed == null ? null : isUsed.trim();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getCustomerSex() {
        return customerSex;
    }

    public void setCustomerSex(String customerSex) {
        this.customerSex = customerSex == null ? null : customerSex.trim();
    }

    public String getCustomerMobile() {
        return customerMobile;
    }

    public void setCustomerMobile(String customerMobile) {
        this.customerMobile = customerMobile == null ? null : customerMobile.trim();
    }
}