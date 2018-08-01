package com.ncu.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ncu.pojo.DepartmentInfo;
import com.ncu.pojo.NoticeInfo;
import com.ncu.pojo.Permission;
import com.ncu.pojo.HouseInfo;
import com.ncu.pojo.HouseType;
import com.ncu.pojo.UserInfo;
import com.ncu.pojo.UserRole;
import com.ncu.service.IUserService;
import com.ncu.utils.MD5Utils;
import com.ncu.utils.PageBean;
@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	private IUserService us;
	// 在方法中传入session参数,可以直接获取(但不推荐),还是通过request获得
	/**
	 * 用户登录
	 * 
	 * @param u 用户登录信息
	 * @return
	 */
	// 在方法中传入session参数,可以直接获取(但不推荐),还是通过request获得
	@Autowired
	private HttpServletRequest request;
	/**
	 * 用户登录
	 * @param u 用户登录信息
	 * @return
	 */
	@RequestMapping("login")
	public String login(UserInfo u) {
		u.setUserPw(MD5Utils.md5(u.getUserPw()));//密码进行md5加密
		UserInfo userInfo = us.login(u);
		if (userInfo != null) {
			HttpSession session = request.getSession();
			//登录成功后查询用户权限对象
			List<Permission> permissions=us.getPermissions(userInfo.getUserId(), 0);//0表示顶级菜单
			// 最好放入对象,便于后面需要用到用户的其他信息
			session.setAttribute("user", userInfo);
			session.setAttribute("ps", permissions);
			return "frame/main";
		} else {
			return "login";
		}
	}
	/**
	 * 显示用户信息列表 包含查询及分页
	 * @param queryContent 查询内容
	 * @param queryType	查询字段
	 * @param currentPage 当前页数
	 * @param textfield 跳转页码
	 * @return
	 */
	@RequestMapping("userlist3")
	public String list(Model m, String queryContent, Integer queryType, Integer currentPage, Integer textfield) {
		if (textfield != null) {
			currentPage = textfield;
		}
		PageBean<UserInfo> pb = us.list(queryContent == null ? "" : queryContent, queryType == null ? 1 : queryType,
				(currentPage == null ? 1 : currentPage));
		m.addAttribute("pb", pb);
		m.addAttribute("queryContent", queryContent);
		m.addAttribute("queryType", queryType);
		return "employee/emp_list";
	}
	/**
	 * 按id查询用户及关联信息，并在前端显示
	 * @param userId 用户id
	 * @return
	 */
	@RequestMapping("selectuser")
	public String select(Model m, Integer userId) {
		UserInfo u = us.select(userId);
		List<DepartmentInfo> di=us.getdInfo();
		m.addAttribute("u", u);
		m.addAttribute("di", di);
		return "employee/emp_edit";
	}
	/**
	 * 修改用户信息
	 * @param u 用户信息
	 * @return
	 */
	@RequestMapping("edituser")
	public String edit(Model m, UserInfo u) {
		us.edit(u);
		PageBean<UserInfo> pb = us.list("", 1, 1);		
		m.addAttribute("pb", pb);
		return "employee/emp_list";
	}
	/**
	 * 用户详情
	 * @param m
	 * @param userId 用户id
	 * @return
	 */
	@RequestMapping("userdetail")
	public String select1(Model m, Integer userId) {
		UserInfo u = us.select(userId);
		m.addAttribute("u", u);
		return "employee/emp_detail";
	}
	/**
	 * 删除用户
	 * @param m
	 * @param userId 用户id
	 * @return
	 */
	@RequestMapping("deluser")
	public String del(Model m, Integer userId) {
		us.del(userId);
		PageBean<UserInfo> pb = us.list("", 1, 1);
		m.addAttribute("pb", pb);
		return "employee/emp_list";
	}
	/**
	 * 根据条件查询房屋信息
	 * @param m
	 * @param queryContent
	 * @param queryType
	 * @param currentPage
	 * @param textfield
	 * @return
	 */
	@RequestMapping("houselist")
	public String houselist(Model m, String queryContent, Integer queryType,  Integer currentPage,Integer textfield) {
		if (textfield != null) {
			currentPage = textfield;
		}
		PageBean<HouseInfo> pb=us.houselist(queryContent == null ? "" : queryContent, queryType == null ? 1 : queryType,
				(currentPage == null ? 1 : currentPage));
		
		m.addAttribute("pb", pb);
		m.addAttribute("queryContent", queryContent);
		m.addAttribute("queryType", queryType);
		m.addAttribute("currentPage", currentPage);
		return "employee/house_list";
	}
	/**
	 * 该方法是该登录的用户用来修改自己的个人信息时从数据库中获取自己的信息，
	 * 从前端获取该用户的id,返回个人信息至前台
	 * @param m
	 * @param userId  登录用户的id
	 * @return
	 */
	@RequestMapping("updateInformation")
	public String findPersonalInformation(Model m,Integer userId) {
		int i=0;//传到前端的i为0,则不弹出修改成功提示框
		UserInfo userInfo=us.selectUserById(userId);
		List<DepartmentInfo> deptinfo=us.selectDepartmentInfos();
		List<UserRole> userrole=us.selectUserRoles();
		m.addAttribute("i", i);//传到前端，为了修改前不弹出对话框
		m.addAttribute("userInfo", userInfo);
		
		m.addAttribute("deptinfo", deptinfo);
		m.addAttribute("userrole", userrole);
		
		return "user/personalInfo_update";
	}
	/**
	 * 修改用户个人 信息
	 * @param m
	 * @param userinfo 从前台获取到的修改后的整个用户的对象
	 * @return
	 */
	@RequestMapping("updatePersonalInformation")
	public String updatePersonalInformation(Model m,UserInfo userinfo) {
		
		userinfo.setUserChangetime(new Date());//给对象设置修改时间
		int i=us.updatePersonalInfo(userinfo);//返回1则说明修改成功，0则不成功
		UserInfo userInfo=us.selectUserById(userinfo.getUserId());
		List<DepartmentInfo> deptinfo=us.selectDepartmentInfos();
		List<UserRole> userrole=us.selectUserRoles();
		m.addAttribute("i", i);//传到前台去判断，如果为1，显示修改成功
		m.addAttribute("userInfo", userInfo);
		m.addAttribute("deptinfo", deptinfo);
		m.addAttribute("userrole", userrole);
        return "user/personalInfo_update";
	}
	/**
	 * 添加房屋(实际添加在下一步)
	 * @param m
	 * @return
	 */
	@RequestMapping("addhouse1")
	public String addhouse1(Model m) {
		List<UserInfo> ul= us.selectAllUser();
		List<HouseType> ht=us.selectAllHousetype();
		m.addAttribute("ul", ul);
		m.addAttribute("ht", ht);
		return "employee/house_add";
	}
	/**
	 * 登录成功后用于查询有效公告
	 * @param m
	 * @param turnPage 分页的最开始的显示的页数
	 * @return
	 */
	@RequestMapping("findNoticeInfo")
	public String finNoticeInfo(Model m,Integer turnPage) {
		PageBean<NoticeInfo> noticeinfoPB=us.selectNoticeInfoPageBean(turnPage);
		//将公告信息放入session中，这样在首页进行其他查询操作时，不影响公告信息的显示
		HttpSession session=request.getSession();
		session.setAttribute("noticeinfoPageBean", noticeinfoPB);
		return "frame/center";
	}
	/**
	 * 添加房屋
	 * @param m
	 * @param hi
	 * @return
	 */
	@RequestMapping("addhouse2")
	public String addhouse2(Model m,HouseInfo hi) {
		us.addhouse(hi);
		PageBean<HouseInfo> pb=us.houselist("", 1, 1);
		m.addAttribute("pb", pb);
		return "employee/house_list";
	}
	/**
	 * 编辑房屋
	 * @param m
	 * @param houseId 房屋id
	 * @return
	 */
	@RequestMapping("edithouse1")
	public String edithouse1(Model m,Integer houseId) {
		HouseInfo hi=us.selectHouseById(houseId);
		List<UserInfo> ul= us.selectAllUser();
		List<HouseType> ht=us.selectAllHousetype();
		m.addAttribute("hi", hi);
		m.addAttribute("ul", ul);
		m.addAttribute("ht", ht);
		return "employee/house_edit";
	} 
	@RequestMapping("edithouse2")
	public String edithouse2(Model m,HouseInfo hi) {
		us.edithouse(hi);
		PageBean<HouseInfo> pb=us.houselist("", 1, 1);
		m.addAttribute("pb", pb);
		return "employee/house_list";
	}
	@RequestMapping("delhouse")
	public String delhouse(Model m,Integer houseId) {
		us.delhouseById(houseId);
		PageBean<HouseInfo> pb=us.houselist("", 1, 1);
		m.addAttribute("pb", pb);
		return "employee/house_list";
	}
	@RequestMapping("housetypelist")
	public String housetypelist(Model m, String queryContent, Integer currentPage, Integer textfield) {
		if (textfield != null) {
			currentPage = textfield;
		}
		PageBean<HouseType> pb = us.housetypelist(queryContent==null?"":queryContent,
				(currentPage == null ? 1 : currentPage));
		m.addAttribute("pb", pb);
		m.addAttribute("queryContent", queryContent);
		return "employee/house_type_list";
	}
	@RequestMapping("addhousetype")
	public String addhousetype(Model m,HouseType ht) {
		us.addhousetype(ht);
		PageBean<HouseType> pb=us.housetypelist("", 1);
		m.addAttribute("pb", pb);
		return "employee/house_type_list";
	}
	@RequestMapping("delhousetype")
	public String delhousetype(Model m,Integer typeId) {
		us.delhousetype(typeId);
		PageBean<HouseType> pb=us.housetypelist("", 1);
		m.addAttribute("pb", pb);
		return "employee/house_type_list";
	}
	@RequestMapping("deptlist")
	public String deptlist(Model m, String queryContent, Integer currentPage, Integer textfield) {
		if (textfield != null) {
			currentPage = textfield;
		}
		PageBean<DepartmentInfo> pb = us.deptlist(queryContent==null?"":queryContent,
				(currentPage == null ? 1 : currentPage));
		m.addAttribute("pb", pb);
		m.addAttribute("queryContent", queryContent);
		return "employee/dept_list";
	}
	@RequestMapping("deldept")
	public String deldept(Model m,Integer departmentId) {
		us.deldept(departmentId);
		PageBean<DepartmentInfo> pb=us.deptlist("", 1);
		m.addAttribute("pb", pb);
		return "employee/dept_list";
	}
	@RequestMapping("noticelist")
	public String noticelist(Model m, String queryContent,Integer queryType, Integer currentPage, Integer textfield) {
		if (textfield != null) {
			currentPage = textfield;
		}
		PageBean<NoticeInfo> pb = us.noticelist(queryContent == null ? "" : queryContent, queryType == null ? 1 : queryType,
				(currentPage == null ? 1 : currentPage));
		m.addAttribute("pb", pb);
		m.addAttribute("queryContent", queryContent);
		m.addAttribute("queryType", queryType);
		return "employee/notice_list";
	}
	@RequestMapping("delnotice")
	public String delnotice(Model m,Integer noticeId) {
		us.delnotice(noticeId);
		PageBean<NoticeInfo> pb=us.noticelist("",1, 1);
		m.addAttribute("pb", pb);
		return "employee/notice_list";
	}
	@RequestMapping("addnotice1")
	public String addnotice1(Model m) {
		List<UserInfo> ul=us.selectAllUser();
		m.addAttribute("ul", ul);
		return "employee/notice_add";
	}
	@RequestMapping("addnotice2")
	public String addnotice2(Model m,NoticeInfo ni) {		
		us.addnotice(ni);
		PageBean<NoticeInfo> pb=us.noticelist("", 1,1);
		m.addAttribute("pb", pb);
		return "employee/notice_list";
	}
}
