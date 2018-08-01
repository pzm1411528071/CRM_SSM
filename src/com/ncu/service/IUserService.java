package com.ncu.service;
import java.util.List;
import com.ncu.pojo.DepartmentInfo;
import com.ncu.pojo.HouseInfo;
import com.ncu.pojo.HouseType;
import com.ncu.pojo.NoticeInfo;
import com.ncu.pojo.Permission;
import com.ncu.pojo.UserInfo;
import com.ncu.pojo.UserRole;
import com.ncu.utils.PageBean;
import com.ncu.utils.TreeNode;
public interface IUserService {
	UserInfo login(UserInfo u);
	//通过用户id查询用户信息
	UserInfo selectUserById(Integer userId);
    //登录用户修改个人信息
	int updatePersonalInfo(UserInfo userinfo);
    //通过部门id查询部门信息
	DepartmentInfo selectDepartmentInfoById(Integer departmentId);
    //通过角色id查询角色信息
	UserRole selectUserRoleById(Integer roleId);
    //查找所有的部门信息
	List<DepartmentInfo> selectDepartmentInfos();
    //查找所有的用户角色
	List<UserRole> selectUserRoles();
    //查找有效公告信息
	PageBean<NoticeInfo> selectNoticeInfoPageBean(Integer turnPage);
	PageBean<UserInfo> list(String queryContent, Integer queryType, Integer currentPage);
	UserInfo select(Integer userId);
	void edit(UserInfo u);
	void del(Integer userId);
	PageBean<HouseInfo> houselist(String queryContent, Integer queryType, Integer currentPage);
	List<DepartmentInfo> getdInfo();
	//查询员工信息及其关联表的所有信息
	List<UserInfo> list();
	List<UserInfo> selectAllUser();
	List<HouseType> selectAllHousetype();
	int addhouse(HouseInfo hi);
	HouseInfo selectHouseById(Integer houseId);
	int edithouse(HouseInfo hi);
	void delhouseById(Integer houseId);
	PageBean<HouseType> housetypelist(String queryContent,Integer currentPage);
	void addhousetype(HouseType ht);
	void delhousetype(Integer typeId);
	PageBean<DepartmentInfo> deptlist(String queryContent, Integer currentPage);
	void deldept(Integer departmentId);
	PageBean<NoticeInfo> noticelist(String queryContent,Integer queryType, Integer currentPage);
	void delnotice(Integer noticeId);
	void addnotice(NoticeInfo ni);
	//根据用户id和顶级菜单号查询用户权限顶级菜单及子菜单
	List<Permission> getPermissions(Integer userId,Integer parentId);
	//查询所有角色
	List<UserRole> selectAllUserRole();
	//重置用户角色
	void resetRole(Integer userId, Integer[] roleIds);
	//查询所有权限
	List<Permission> selectAllPermission();
	//重置用户权限
	void resetP(Integer roleId, Integer[] pIds);
	//将权限放入节点中
	List<TreeNode> getTreeNodes();
	//根据角色id查询所有权限
	List<Permission> getPermissionByRoleID(Integer roleId);
}
