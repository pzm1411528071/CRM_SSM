package com.ncu.pojo;
public class CustomerLinkman {
/* *
 * 客户联系人pojo
 * */
    private Integer linkmanId;//联系人id
    private String linkmanName;//联系人姓名
    private String linkmanSex;//联系人性别
    private String linkmanJob;//联系人工作
    private String linkmanMobile;//联系人手机号
    private Integer linkmanAge;//联系人年龄
    private String linkmanRelation;//联系人关系
    private String isUsed;//是否被使用   使用(1) 未使用(0)
    private Integer customerId;//客户id

    public Integer getLinkmanId() {
        return linkmanId;
    }

    public void setLinkmanId(Integer linkmanId) {
        this.linkmanId = linkmanId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getLinkmanName() {
        return linkmanName;
    }

    public void setLinkmanName(String linkmanName) {
        this.linkmanName = linkmanName == null ? null : linkmanName.trim();
    }

    public String getLinkmanSex() {
        return linkmanSex;
    }

    public void setLinkmanSex(String linkmanSex) {
        this.linkmanSex = linkmanSex == null ? null : linkmanSex.trim();
    }

    public String getLinkmanJob() {
        return linkmanJob;
    }

    public void setLinkmanJob(String linkmanJob) {
        this.linkmanJob = linkmanJob == null ? null : linkmanJob.trim();
    }

    public String getLinkmanMobile() {
        return linkmanMobile;
    }

    public void setLinkmanMobile(String linkmanMobile) {
        this.linkmanMobile = linkmanMobile == null ? null : linkmanMobile.trim();
    }

    public Integer getLinkmanAge() {
        return linkmanAge;
    }

    public void setLinkmanAge(Integer linkmanAge) {
        this.linkmanAge = linkmanAge;
    }

    public String getLinkmanRelation() {
        return linkmanRelation;
    }

    public void setLinkmanRelation(String linkmanRelation) {
        this.linkmanRelation = linkmanRelation == null ? null : linkmanRelation.trim();
    }

    public String getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(String isUsed) {
        this.isUsed = isUsed == null ? null : isUsed.trim();
    }
}