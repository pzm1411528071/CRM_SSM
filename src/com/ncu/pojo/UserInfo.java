package com.ncu.pojo;
import java.util.Date;
public class UserInfo {
/* *
 * 用户信息pojo
 * */
    private Integer userId;//用户id
    private Integer departmentId;//部门id
    private Integer roleId;//用户角色id
    private String pic;//用户图片
    private String userName;//用户名
    private String userSex;//用户性别
    private String userMobile;//用户手机号
    private Integer userAge;//用户年龄
    private String userAddress;//用户地址
    private String userNum;//用户编号
    private String userPw;//用户密码
    private String userTel;//用户电话
    private String userIdnum;//用户id编号
    private String userEmail;//用户邮箱
    private Date userAddtime;//用户添加时间
    private String userAddman;//用户添加人员姓名
    private Date userChangetime;//用户修改时间
    private String userChangeman;//用户修改人员姓名
    private String userIntest;//用户爱好
    private String userDiploma;//用户文凭
    private String userBankcard;//用户银行账户
    private String userNation;//用户籍贯
    private String isMarried;//用户是否结婚      已婚   未婚
    private String isUsed;//是否被使用   使用(1) 未使用(0)
    
    //关联
    private DepartmentInfo di;
    private UserRole ur;
    
    public DepartmentInfo getDi() {
		return di;
	}

	public void setDi(DepartmentInfo di) {
		this.di = di;
	}

	public UserRole getUr() {
		return ur;
	}

	public void setUr(UserRole ur) {
		this.ur = ur;
	}

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public String getUserNum() {
        return userNum;
    }

    public void setUserNum(String userNum) {
        this.userNum = userNum == null ? null : userNum.trim();
    }

    public String getUserPw() {
        return userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw == null ? null : userPw.trim();
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel == null ? null : userTel.trim();
    }

    public String getUserIdnum() {
        return userIdnum;
    }

    public void setUserIdnum(String userIdnum) {
        this.userIdnum = userIdnum == null ? null : userIdnum.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public Date getUserAddtime() {
        return userAddtime;
    }

    public void setUserAddtime(Date userAddtime) {
        this.userAddtime = userAddtime;
    }

    public String getUserAddman() {
        return userAddman;
    }

    public void setUserAddman(String userAddman) {
        this.userAddman = userAddman == null ? null : userAddman.trim();
    }

    public Date getUserChangetime() {
        return userChangetime;
    }

    public void setUserChangetime(Date userChangetime) {
        this.userChangetime = userChangetime;
    }

    public String getUserChangeman() {
        return userChangeman;
    }

    public void setUserChangeman(String userChangeman) {
        this.userChangeman = userChangeman == null ? null : userChangeman.trim();
    }

    public String getUserIntest() {
        return userIntest;
    }

    public void setUserIntest(String userIntest) {
        this.userIntest = userIntest == null ? null : userIntest.trim();
    }

    public String getUserDiploma() {
        return userDiploma;
    }

    public void setUserDiploma(String userDiploma) {
        this.userDiploma = userDiploma == null ? null : userDiploma.trim();
    }

    public String getUserBankcard() {
        return userBankcard;
    }

    public void setUserBankcard(String userBankcard) {
        this.userBankcard = userBankcard == null ? null : userBankcard.trim();
    }

    public String getUserNation() {
        return userNation;
    }

    public void setUserNation(String userNation) {
        this.userNation = userNation == null ? null : userNation.trim();
    }

    public String getIsMarried() {
        return isMarried;
    }

    public void setIsMarried(String isMarried) {
        this.isMarried = isMarried == null ? null : isMarried.trim();
    }

    public String getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(String isUsed) {
        this.isUsed = isUsed == null ? null : isUsed.trim();
    }
}