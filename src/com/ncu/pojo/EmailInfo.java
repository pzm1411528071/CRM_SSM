package com.ncu.pojo;
import java.util.Date;
public class EmailInfo {
/* *
 * 邮箱信息pojo
 * */
    private Integer emailId;//邮箱id
    private Integer customerId;//客户id
    private Integer userId;//用户id
    private String emailContent;//邮箱内容
    private Date emailTime;//邮箱发送时间
    private String emailState;//邮箱发送状态   发送(1) 未发送(0)
    private String emailTheme;//邮箱主题
    private String isUsed;//是否被使用   使用(1) 未使用(0)

    //关联对象
    private CustomerInfo ci;
    
    public CustomerInfo getCi() {
		return ci;
	}

	public void setCi(CustomerInfo ci) {
		this.ci = ci;
	}

	public Integer getEmailId() {
        return emailId;
    }

    public void setEmailId(Integer emailId) {
        this.emailId = emailId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getEmailContent() {
        return emailContent;
    }

    public void setEmailContent(String emailContent) {
        this.emailContent = emailContent == null ? null : emailContent.trim();
    }

    public Date getEmailTime() {
        return emailTime;
    }

    public void setEmailTime(Date emailTime) {
        this.emailTime = emailTime;
    }

    public String getEmailState() {
        return emailState;
    }

    public void setEmailState(String emailState) {
        this.emailState = emailState == null ? null : emailState.trim();
    }

    public String getEmailTheme() {
        return emailTheme;
    }

    public void setEmailTheme(String emailTheme) {
        this.emailTheme = emailTheme == null ? null : emailTheme.trim();
    }

    public String getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(String isUsed) {
        this.isUsed = isUsed == null ? null : isUsed.trim();
    }
}