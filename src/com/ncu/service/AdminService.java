package com.ncu.service;

import java.util.List;

import com.ncu.pojo.DepartmentInfo;
import com.ncu.pojo.UserInfo;
import com.ncu.pojo.UserRole;

/**AdminService类是管理员服务层的接口
 * @author Administrator
 *
 */
public interface AdminService {
    //添加用户信息
	int addUserInfo(UserInfo ui);
    //添加部门信息
	int addDepartmentInfo(DepartmentInfo di);
    //添加角色信息
	int addUserRole(UserRole ur);
    //查询所有的角色信息
	List<UserRole> showAllRole();
    //查询所有的部门信息
	List<DepartmentInfo> findDepartmentName();
    //根据用户角色编号查询角色信息
	UserRole selectUserRoleById(Integer roleId);
	//修改用户角色信息
	Integer updateUserRole(UserRole ur);
	//删除用户角色信息
	Integer deleteUserRole(Integer roleId);




	



}
