package com.ncu.pojo;
public class CustomerSource {
/* *
 * 客户来源pojo
 * */
    private Integer sourceId;//客户来源id
    private String sourceName;//客户来源名称
    private String isUsed;//是否被使用   使用(1) 未使用(0)

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName == null ? null : sourceName.trim();
    }

    public String getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(String isUsed) {
        this.isUsed = isUsed == null ? null : isUsed.trim();
    }
}