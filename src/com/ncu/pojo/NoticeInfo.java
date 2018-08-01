package com.ncu.pojo;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
public class NoticeInfo {
/* *
 * 公告pojo
 * */
    private Integer noticeId;//公告id
    private Integer userId;//用户id
    private String noticeItem;//公告项
    private String noticeContent;//公告内容
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date noticeTime;//公告发布时间
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date noticeEndtime;//公告结束时间
    private String isUsed;//是否被使用   使用(1) 未使用(0)   
    //关联
  
    private UserInfo ui;
    
    

	public void setUi(UserInfo ui) {
		this.ui = ui;
	}


    public UserInfo getUi() {
		return ui;
	}

	public Integer getNoticeId() {

        return noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNoticeItem() {
        return noticeItem;
    }

    public void setNoticeItem(String noticeItem) {
        this.noticeItem = noticeItem == null ? null : noticeItem.trim();
    }

    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent == null ? null : noticeContent.trim();
    }

    public Date getNoticeTime() {
        return noticeTime;
    }

    public void setNoticeTime(Date noticeTime) {
        this.noticeTime = noticeTime;
    }

    public Date getNoticeEndtime() {
        return noticeEndtime;
    }

    public void setNoticeEndtime(Date noticeEndtime) {
        this.noticeEndtime = noticeEndtime;
    }

    public String getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(String isUsed) {
        this.isUsed = isUsed == null ? null : isUsed.trim();
    }
}