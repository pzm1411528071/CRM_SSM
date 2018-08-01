package com.ncu.controller;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ncu.pojo.DepartmentInfo;
import com.ncu.pojo.Permission;
import com.ncu.pojo.UserInfo;
import com.ncu.pojo.UserRole;
import com.ncu.service.AdminService;
import com.ncu.service.IUserService;
import com.ncu.utils.TreeNode;
/**AdminController类是管理员模块的控制层模块，控制相应的操作
 * @author Administrator
 *
 */
@Controller
@RequestMapping("admin")
public class AdminController {
	@Autowired
	private AdminService as;
	@Autowired
	private IUserService us;
	/**
	 * 管理员在进入添加用户信息界面时，调用该方法从部门表和角色表中
	 * 查询出各个部门和各个角色的编号和姓名，并将这些信息传到前端界面中
	 * 
	 * @param m
	 * @return
	 */
	@RequestMapping("adminAddCustomer")
	public String findDeptAndRole(Model m) {
		List<DepartmentInfo> di=as.findDepartmentName();
		List<UserRole> ur=as.showAllRole();
		m.addAttribute("deptinfo", di);
		m.addAttribute("userrole", ur);
		return "admin/emp_add";
		
	}
	/**
	 * 该方法在管理员添加新的 用户的时候，调用来存储信息
	 * @param ui
	 * @return
	 */
	@RequestMapping("addUserInfo")
	public String addUserInfo(Model m,UserInfo ui) {
		ui.setUserAddtime(new Date());
		ui.setUserChangetime(new Date());
		Integer i= as.addUserInfo(ui);
		m.addAttribute("i", i);
		return "admin/emp_add";
	}
	/**
	 * 
	 * 该方法在管理员添加新的部门的时候，调用来存储信息，存储成功跳转到提示成功
	 * @param di
	 * @return
	 */
	@RequestMapping("addDepartmentInfo")
	public String addDepartmentInfo(Model m,DepartmentInfo di) {
            int i=as.addDepartmentInfo(di);
            m.addAttribute("i", i);
			return "admin/dept_add";
	}
	/**
	 * 该方法在管理员添加新的用户角色的时候，调用来存储信息，存储成功跳转到提示成功
	 * @param ur
	 * @return
	 */
	@RequestMapping("addUserRole")
	public String addUserRole(Model m,UserRole ur) {
		Integer i=as.addUserRole(ur);
		m.addAttribute("i", i);
		return "admin/role_add";
		

	}
	/**
	 * 在管理员存储用户角色时，率先查看已存在的用户角色，调用该方法，
	 * 查看用户角色表中已经存在的信息
	 * @param m
	 * @return
	 */
	@RequestMapping("RoleList")
	public String roleList(Model m) {
		List<UserRole> userrole=as.showAllRole();
		m.addAttribute("userrole", userrole);
		return "admin/role_add";		
	}
	/**
	 * 根据角色id查询整个角色信息
	 * @param m
	 * @param roleId  角色ID
	 * @return
	 */
	@RequestMapping("getUserRole")
	public String getUserRole(Model m,Integer roleId) {
		UserRole ur=as.selectUserRoleById(roleId);
		m.addAttribute("userrole", ur);
		return "admin/role_update";
	}
	/**
	 * 修改角色信息
	 * @param m
	 * @param ur 用户修改后的角色信息对象
	 * @return
	 */
	@RequestMapping("updateUserRole")
	public String updateUserRole(Model m,UserRole ur) {
		Integer i=as.updateUserRole(ur);//用于判断是否修改成功
		List<UserRole> userrole=as.showAllRole();
		m.addAttribute("userrole", userrole);
		m.addAttribute("i", i);
		return "admin/role_add";
	}
	/**
	 * 删除用户角色
	 * @param m
	 * @param roleId 用户id
	 * @return
	 */
	@RequestMapping("deleteUserRole")
	public String deleteUserRole(Model m,Integer roleId) {
		as.deleteUserRole(roleId);
		List<UserRole> userrole=as.showAllRole();
		m.addAttribute("userrole", userrole);
		return "admin/role_add";		
	}
	/**
	 * 进入分配角色页面,真正分配角色在下一步
	 * @param m
	 * @return
	 */
	@RequestMapping("adminDistributeRole1")
	public String distributeRole1(Model m) {
		List<UserInfo> uList=us.selectAllUser();
		List<UserRole> rList=us.selectAllUserRole();
		m.addAttribute("us", uList);
		m.addAttribute("rs", rList);
		return "admin/distribute_role";		
	}
	/**
	 * 分配角色
	 * @param userId 用户id
	 * @param roleIds 角色数组
	 * @return
	 */
	@RequestMapping("adminDistributeRole2")
	public String distributeRole2(Integer userId,Integer[] roleIds) {
		if(roleIds==null){//没有勾选,默认不进行修改
			return "redirect:/admin/adminDistributeRole1";
		}
		us.resetRole(userId,roleIds);
		return "redirect:/admin/adminDistributeRole1";		
	}
	/**
	 * 进入分配权限页面,真正分配权限在下一步
	 * @param m
	 * @return
	 */
	@RequestMapping("adminDistributePermission1")
	public String distributePermission1(Model m) {
		List<UserRole> rList=us.selectAllUserRole();
		List<Permission> pList=us.selectAllPermission();
		m.addAttribute("rs", rList);
		m.addAttribute("ps", pList);
		return "admin/distribute_permisson";		
	}
	/**
	 * 分配权限
	 * @param roleId 角色id
	 * @param pIds 权限数组
	 * @return
	 */
	@RequestMapping("adminDistributePermission2")
	public String distributePermission2(Integer roleId,String pIds) {
		if(pIds==""){//没有勾选,默认不进行修改
			return "redirect:/admin/adminDistributePermission1";
		}
		String[] arrStr=pIds.split(",");
		Integer[] ids = new Integer[arrStr.length];
		for (int i = 0; i < arrStr.length; i++) {
			ids[i]=Integer.valueOf(arrStr[i]);
		}
		us.resetP(roleId,ids);
		return "redirect:/admin/adminDistributePermission1";		
	}
	/**
	 * 获得节点数据(存在层次的权限数据)
	 * @return
	 */
	@ResponseBody
	@RequestMapping("getTreeNodes")
	public List<TreeNode> getTreeNodes() {
		List<TreeNode> nodes=us.getTreeNodes();
		return nodes;		
	}
	/**
	 * 根据角色id获得权限
	 * @param roleId
	 * @return
	 */
	@ResponseBody
	@RequestMapping("getPermissionByRoleID")
	public List<Permission> getPermissions(Integer roleId) {
		List<Permission> ps=us.getPermissionByRoleID(roleId);
		return ps;		
	}
}
