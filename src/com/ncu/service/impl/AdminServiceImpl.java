package com.ncu.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ncu.mapper.DepartmentInfoMapper;
import com.ncu.mapper.UserInfoMapper;
import com.ncu.mapper.UserRoleMapper;
import com.ncu.pojo.DepartmentInfo;
import com.ncu.pojo.UserInfo;
import com.ncu.pojo.UserRole;
import com.ncu.service.AdminService;

/**
 * AdminServiceImpl类是管理员服务层的具体实现类
 * @author Administrator
 *
 */
@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private UserInfoMapper um;
	@Autowired
	private DepartmentInfoMapper dm;
	@Autowired
    private UserRoleMapper rm;
	
	@Override
	public int  addUserInfo(UserInfo ui) {
		int i=0;
		if(um.insertSelective(ui)>0) {
			i=1;
		}
		return i;
		
		
	}

	@Override
	public int addDepartmentInfo(DepartmentInfo di) {
		int i=0;
		if(dm.insertSelective(di)>0) {
			i=1;
		}
		return i;
	}
	

	@Override
	public int addUserRole(UserRole ur) {
		int i=0;
		if(rm.insertSelective(ur)>0) {
			i=1;
		}
		return i;
	}

	@Override
	public List<UserRole> showAllRole() {
		List<UserRole> userrole= rm.selectAllRole();
		return userrole;
	}

	@Override
	public List<DepartmentInfo> findDepartmentName() {
		List<DepartmentInfo> deptinfo=dm.selectAllDepartmentInfo();
		return deptinfo;
	}

	@Override
	public UserRole selectUserRoleById(Integer roleId) {
		UserRole ur=rm.selectByPrimaryKey(roleId);
		return ur;
	}

	@Override
	public Integer updateUserRole(UserRole ur) {
		return rm.updateByPrimaryKeySelective(ur);		
	}

	@Override
	public Integer deleteUserRole(Integer roleId) {
		Integer i=0;
		if( rm.deleteByPrimaryKey(roleId)==1) {
			i=1; 
		};
		return i;
		
	}






}
