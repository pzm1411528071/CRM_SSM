package com.ncu.pojo;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
public class CustomerCare {
/* *
 * 客户关怀pojo
 * */
    private Integer careId;//客户关怀id
    private Integer customerId;//客户id
    private String careTheme;//客户关怀主题
    private String careWay;//客户关怀方式
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date careTime;//客户关怀时间
    private String careRemark;//客户关怀评论
    /* *
     * Date默认是标准格式是Tue May 28 23:12:34 CST 2013,
     * 如果是这种格式字符串从前端传入,不需要转换,也可以实现String到Date类型转换,
     * 如果通过注解设置好转换格式yyyy-MM-dd HH:mm:ss,时间存入数据库后
     * 如果通过el表达式显示到前端仍然是标准格式
     * */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date careNexttime;//客户关怀下次时间
    private String carePeople;//客户关怀人员
    private String isUsed;//是否被使用   使用(1) 未使用(0)


    

    //关联对象
    private CustomerInfo cs;

	public CustomerInfo getCs() {
		return cs;
	}

	public void setCs(CustomerInfo cs) {
		this.cs = cs;
	}

	public Integer getCareId() {

        return careId;
    }

    public void setCareId(Integer careId) {
        this.careId = careId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCareTheme() {
        return careTheme;
    }

    public void setCareTheme(String careTheme) {
        this.careTheme = careTheme == null ? null : careTheme.trim();
    }

    public String getCareWay() {
        return careWay;
    }

    public void setCareWay(String careWay) {
        this.careWay = careWay == null ? null : careWay.trim();
    }

    public Date getCareTime() {
        return careTime;
    }

    public void setCareTime(Date careTime) {
        this.careTime = careTime;
    }

    public String getCareRemark() {
        return careRemark;
    }

    public void setCareRemark(String careRemark) {
        this.careRemark = careRemark == null ? null : careRemark.trim();
    }

    public Date getCareNexttime() {
        return careNexttime;
    }

    public void setCareNexttime(Date careNexttime) {
        this.careNexttime = careNexttime;
    }

    public String getCarePeople() {
        return carePeople;
    }

    public void setCarePeople(String carePeople) {
        this.carePeople = carePeople == null ? null : carePeople.trim();
    }

    public String getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(String isUsed) {
        this.isUsed = isUsed == null ? null : isUsed.trim();
    }
}