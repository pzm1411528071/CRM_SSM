package com.ncu.pojo;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
public class CustomerInfo {
/* *
 * 客户信息pojo
 * */
    private Integer customerId;//客户id
    private String customerName;//客户姓名
    private String customerSex;//客户性别
    private String customerMobile;//客户手机号
    private String customerQq;//客户qq
    private String customerAddress;//客户地址
    private String customerEmail;//客户邮箱
    private String customerRemark;//客户备注
    private String customerJob;//客户工作
    private String customerBlog;//客户博客
    private String customerTel;//客户电话
    private String customerMsn;//客户msn(像qq一样)
    //注解解决前端传来string转成date
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date birthDay;//客户生日
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date customerAddtime;//客户添加时间
    private String customerAddman;//客户添加人员姓名
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date customerChangtime;//客户修改时间
    private String changeMan;//客户修改人员姓名
    private String customerCompany;//客户公司
    private String isUsed;//是否被使用   使用(1) 未使用(0)
    private Integer conditionId;//客户状态id
    private Integer sourceId;//客户来源id
    private Integer userId;//员工id
    private Integer typeId;//客户类型id
    
    //关联对象
    private CustomerCondition cc;
    private CustomerSource cs;
    private UserInfo ui;
    private CustomerType ct;

    public CustomerCondition getCc() {
		return cc;
	}

	public void setCc(CustomerCondition cc) {
		this.cc = cc;
	}

	public CustomerSource getCs() {
		return cs;
	}

	public void setCs(CustomerSource cs) {
		this.cs = cs;
	}

	public UserInfo getUi() {
		return ui;
	}

	public void setUi(UserInfo ui) {
		this.ui = ui;
	}

	public CustomerType getCt() {
		return ct;
	}

	public void setCt(CustomerType ct) {
		this.ct = ct;
	}

	public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getConditionId() {
        return conditionId;
    }

    public void setConditionId(Integer conditionId) {
        this.conditionId = conditionId;
    }

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
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

    public String getCustomerQq() {
        return customerQq;
    }

    public void setCustomerQq(String customerQq) {
        this.customerQq = customerQq == null ? null : customerQq.trim();
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress == null ? null : customerAddress.trim();
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail == null ? null : customerEmail.trim();
    }

    public String getCustomerRemark() {
        return customerRemark;
    }

    public void setCustomerRemark(String customerRemark) {
        this.customerRemark = customerRemark == null ? null : customerRemark.trim();
    }

    public String getCustomerJob() {
        return customerJob;
    }

    public void setCustomerJob(String customerJob) {
        this.customerJob = customerJob == null ? null : customerJob.trim();
    }

    public String getCustomerBlog() {
        return customerBlog;
    }

    public void setCustomerBlog(String customerBlog) {
        this.customerBlog = customerBlog == null ? null : customerBlog.trim();
    }

    public String getCustomerTel() {
        return customerTel;
    }

    public void setCustomerTel(String customerTel) {
        this.customerTel = customerTel == null ? null : customerTel.trim();
    }

    public String getCustomerMsn() {
        return customerMsn;
    }

    public void setCustomerMsn(String customerMsn) {
        this.customerMsn = customerMsn == null ? null : customerMsn.trim();
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public Date getCustomerAddtime() {
        return customerAddtime;
    }

    public void setCustomerAddtime(Date customerAddtime) {
        this.customerAddtime = customerAddtime;
    }

    public String getCustomerAddman() {
        return customerAddman;
    }

    public void setCustomerAddman(String customerAddman) {
        this.customerAddman = customerAddman == null ? null : customerAddman.trim();
    }

    public Date getCustomerChangtime() {
        return customerChangtime;
    }

    public void setCustomerChangtime(Date customerChangtime) {
        this.customerChangtime = customerChangtime;
    }

    public String getChangeMan() {
        return changeMan;
    }

    public void setChangeMan(String changeMan) {
        this.changeMan = changeMan == null ? null : changeMan.trim();
    }

    public String getCustomerCompany() {
        return customerCompany;
    }

    public void setCustomerCompany(String customerCompany) {
        this.customerCompany = customerCompany == null ? null : customerCompany.trim();
    }

    public String getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(String isUsed) {
        this.isUsed = isUsed == null ? null : isUsed.trim();
    }
}