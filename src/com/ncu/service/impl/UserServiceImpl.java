package com.ncu.service.impl;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ncu.mapper.DepartmentInfoMapper;
import com.ncu.mapper.NoticeInfoMapper;
import com.ncu.mapper.PermissionMapper;
import com.ncu.mapper.RolePMapper;
import com.ncu.mapper.URoleMapper;
import com.ncu.mapper.HouseInfoMapper;
import com.ncu.mapper.HouseTypeMapper;
import com.ncu.mapper.UserInfoMapper;
import com.ncu.pojo.DepartmentInfo;
import com.ncu.pojo.HouseInfo;
import com.ncu.pojo.HouseType;
import com.ncu.pojo.HouseTypeExample;
import com.ncu.pojo.NoticeInfo;
import com.ncu.pojo.Permission;
import com.ncu.pojo.RoleP;
import com.ncu.pojo.RolePExample;
import com.ncu.pojo.URole;
import com.ncu.pojo.URoleExample;
import com.ncu.mapper.UserRoleMapper;
import com.ncu.pojo.UserInfo;
import com.ncu.pojo.UserInfoExample;
import com.ncu.pojo.UserRole;
import com.ncu.service.IUserService;
import com.ncu.utils.PageBean;
import com.ncu.utils.TreeNode;
@SuppressWarnings("all")
@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private UserInfoMapper um;
	@Autowired
	private UserRoleMapper rm;
	@Autowired
	private URoleMapper urm;
	@Autowired
	private PermissionMapper pm;
	@Autowired
	private RolePMapper rpm;
	@Autowired
	private DepartmentInfoMapper dm;
	@Autowired
	private NoticeInfoMapper nm;
	@Autowired
	private HouseInfoMapper hm;
	@Autowired
	private HouseTypeMapper htm;
	@Override
	public UserInfo login(UserInfo u) {
		UserInfoExample example = new UserInfoExample();
		example.createCriteria()
		.andUserNameEqualTo(u.getUserName())
		.andUserPwEqualTo(u.getUserPw());
		
		List<UserInfo> ulist = um.selectByExample(example);
		if(ulist.size()>0){
			return ulist.get(0);
		}
		return null;
	}
	@Override
	public PageBean list(String queryContent, Integer queryType, Integer currentPage) {
		// TODO Auto-generated method stub
		HashMap<Object, Object> queryMap = new HashMap<>();
		queryMap.put("queryContent",queryContent);
		queryMap.put("queryType",queryType);
		Integer totalCount= um.countByCondition(queryMap);
		PageBean<UserInfo> pageBean = new PageBean<UserInfo>(totalCount, currentPage);
		int totalPageCount = pageBean.getTotalPageCount();
		queryMap.put("startPos",pageBean.getStartPos());
		queryMap.put("pageSize",pageBean.getPageSize());
		
		List<UserInfo> nowPageData=um.selectNowPageDate(queryMap);
		pageBean.setDataList(nowPageData);
		
		return pageBean;
	}
	@Override
	public UserInfo select(Integer userId) {
		// TODO Auto-generated method stub		
		return um.selectById(userId);
	}
	@Override
	public void edit(UserInfo u) {
		// TODO Auto-generated method stub
		um.updateByPrimaryKeySelective(u);
	}
	@Override
	public void del(Integer userId) {
		um.deleteByPrimaryKey(userId);
		
	}
	@Override
	public UserInfo selectUserById(Integer userId) {
		UserInfo userInfo=um.selectByPrimaryKey(userId);
		return userInfo;
	}
	@Override
	public PageBean<HouseInfo> houselist(String queryContent, Integer queryType, Integer currentPage) {
		// TODO Auto-generated method stub
		HashMap<Object, Object> queryMap = new HashMap<>();
		queryMap.put("queryContent",queryContent);
		queryMap.put("queryType",queryType);
		int totalCount=hm.selecttotalCount();
		PageBean<HouseInfo> pb=new PageBean<>(totalCount, currentPage);
		queryMap.put("startPos",pb.getStartPos());
		queryMap.put("pageSize",pb.getPageSize());
		pb.setDataList(hm.selectNowPageData(queryMap));
		
		return pb;
		
		
	}
	@Override
	public List<DepartmentInfo> getdInfo() {
		// TODO Auto-generated method stub
		return dm.selectAllDepartmentInfo();
	}
	@Override
	public int updatePersonalInfo(UserInfo userinfo) {
		int i=0;
		if(um.updateByPrimaryKeySelective(userinfo)>0) {
			i=1;
		}
		return i;
	}
	@Override
	public DepartmentInfo selectDepartmentInfoById(Integer departmentId) {
		DepartmentInfo di=dm.selectByPrimaryKey(departmentId);
		return di;
	}
	@Override
	public UserRole selectUserRoleById(Integer roleId) {
		UserRole ur=rm.selectByPrimaryKey(roleId);
		
		return ur;
	}
	@Override
	public List<DepartmentInfo> selectDepartmentInfos() {
		List<DepartmentInfo> deptinfo=dm.selectAllDepartmentInfo();
		return deptinfo;
	}
	@Override
	public List<UserRole> selectUserRoles() {
		List<UserRole> userrole=rm.selectAllRole();
		return userrole;
	}
	public List<UserInfo> list() {
		return um.selectUserAndOther();
	}
	@Override
	public List<UserInfo> selectAllUser() {
		// TODO Auto-generated method stub
		UserInfoExample example=new UserInfoExample();
		example.createCriteria().andUserIdIsNotNull();	
		return um.selectByExample(example);
	}
	@Override
	public List<HouseType> selectAllHousetype() {
		// TODO Auto-generated method stub
		HouseTypeExample example=new HouseTypeExample();
		example.createCriteria().andTypeIdIsNotNull();
		return htm.selectByExample(example);
	}
	@Override
	public int addhouse(HouseInfo hi) {
		return hm.insertSelective(hi);		
	}
	@Override
	public HouseInfo selectHouseById(Integer houseId) {
		// TODO Auto-generated method stub
		return hm.selectByPrimaryKey(houseId);
	}
	@Override
	public int edithouse(HouseInfo hi) {
		// TODO Auto-generated method stub		 
		return hm.updateByPrimaryKeySelective(hi);
	}
	@Override
	public void delhouseById(Integer houseId) {
		// TODO Auto-generated method stub
		hm.deleteByPrimaryKey(houseId);
	}
	@Override
	public PageBean<HouseType> housetypelist(String queryContent, Integer currentPage) {
		// TODO Auto-generated method stub
		HashMap<Object, Object> queryMap = new HashMap<>();
		queryMap.put("queryContent",queryContent);
		int totalCount=htm.selecttotalCount();
		PageBean<HouseType> pb=new PageBean<>(totalCount, currentPage);
		queryMap.put("startPos",pb.getStartPos());
		queryMap.put("pageSize",pb.getPageSize());
		pb.setDataList(htm.selectNowPageData(queryMap));
		
		return pb;
	}
	@Override
	public void addhousetype(HouseType ht) {
		htm.insertSelective(ht);		
	}
	@Override
	public void delhousetype(Integer typeId) {
		// TODO Auto-generated method stub
		htm.deleteByPrimaryKey(typeId);
	}
	@Override
	public PageBean<DepartmentInfo> deptlist(String queryContent, Integer currentPage) {
		// TODO Auto-generated method stub
		HashMap<Object, Object> queryMap = new HashMap<>();
		queryMap.put("queryContent",queryContent);
		int totalCount=dm.selecttotalCount();
		PageBean<DepartmentInfo> pb=new PageBean<>(totalCount, currentPage);
		queryMap.put("startPos",pb.getStartPos());
		queryMap.put("pageSize",pb.getPageSize());
		pb.setDataList(dm.selectNowPageData(queryMap));		
		return pb;
	}
	@Override
	public void deldept(Integer departmentId) {
		// TODO Auto-generated method stub
		dm.deleteByPrimaryKey(departmentId);
	}
	@Override
	public PageBean<NoticeInfo> noticelist(String queryContent,Integer queryType, Integer currentPage) {
		// TODO Auto-generated method stub
		HashMap<Object, Object> queryMap = new HashMap<>();
		queryMap.put("queryContent",queryContent);
		queryMap.put("queryType",queryType);
		int totalCount=nm.selecttotalCount();
		PageBean<NoticeInfo> pb=new PageBean<>(totalCount, currentPage);
		queryMap.put("startPos",pb.getStartPos());
		queryMap.put("pageSize",pb.getPageSize());
		pb.setDataList(nm.selectNowPageData(queryMap));		
		return pb;
	}
	@Override
	public void delnotice(Integer noticeId) {
		// TODO Auto-generated method stub
		nm.deleteByPrimaryKey(noticeId);
	}
	@Override
	public void addnotice(NoticeInfo ni) {
		// TODO Auto-generated method stub
		nm.insertSelective(ni);
	}
	@Override
	public PageBean<NoticeInfo> selectNoticeInfoPageBean(Integer turnPage) {
		Date today=new Date();//得到今天的日期，与截止日期比较
		Integer TotalCount;
		HashMap<Object, Object> hashmap=new HashMap<>();
		TotalCount =nm.countByEndTime(today);
		hashmap.put("today", today);
		hashmap.put("TotalCount", TotalCount);
		PageBean<NoticeInfo> noticeinfoPB=new PageBean<NoticeInfo>(TotalCount, turnPage);
		hashmap.put("startPos",noticeinfoPB.getStartPos());
        hashmap.put("pageSize",noticeinfoPB.getPageSize());
		List<NoticeInfo> noticeinfoList=nm.selectByEndTime(hashmap);
		noticeinfoPB.setDataList(noticeinfoList);
		return noticeinfoPB;
	}
	/* *
	 * 查询当前用户的权限
	 * */
	public List<Permission> getPermissions(Integer userId,Integer parentId) {
		//获得顶级菜单集合
		List<Permission> parentPs=getPermissionsByParentId(userId,parentId);//parentId=0为查询顶级菜单
		for(Permission parent:parentPs){
			List<Permission> sons=getPermissionsByParentId(userId,parent.getpId());//parentId=顶级菜单id,查询顶级菜单的子菜单
			parent.setPsons(sons);//将子菜单放入父菜单
		}
		return parentPs;
	}
	//补充方法用来配合上面实现菜单层次结构
	public List<Permission> getPermissionsByParentId(Integer userId,Integer parentId) {
		HashMap<String,Object> hashMap=new HashMap<String,Object>();
		hashMap.put("userId", userId);
		hashMap.put("parentId", parentId);
		return um.getPermissionsByParentId(hashMap);
	}
	public List<UserRole> selectAllUserRole() {
		return rm.selectAllRole();
	}
	public void resetRole(Integer userId, Integer[] roleIds) {
		//1.删除所有角色
		URoleExample example=new URoleExample();
		//加入规则
		example.createCriteria().andUserIdEqualTo(userId);
		urm.deleteByExample(example);
		//2.录入现在角色
		for(Integer roleId:roleIds){
			URole uRole=new URole();
			uRole.setUserId(userId);
			uRole.setRoleId(roleId);
			urm.insert(uRole);
		}
	}
	public List<Permission> selectAllPermission() {
		return pm.selectByExample(null);//没有规则就是查询所有
	}
	public void resetP(Integer roleId, Integer[] pIds) {
		//1.删除所有角色
		RolePExample example=new RolePExample();
		//加入规则
		example.createCriteria().andRoleIdEqualTo(roleId);
		rpm.deleteByExample(example);
		//2.录入现在角色
		for(Integer pId:pIds){
			RoleP roleP=new RoleP();
			roleP.setRoleId(roleId);
			roleP.setpId(pId);
			rpm.insert(roleP);
		}
	}
	public List<TreeNode> getTreeNodes() {
		List<TreeNode> nodes=new ArrayList<TreeNode>();
		List<Permission> ps=pm.selectByExample(null);//查询所有权限
		for(Permission p:ps){
			nodes.add(new TreeNode(p.getpId(), p.getpParentid(), p.getpName(), false, p.getpIsparent()==1?true:false));//这里三目表达式不能出现空格
		}
		return nodes;
	}
	public List<Permission> getPermissionByRoleID(Integer roleId) {
		List<Permission> ps=pm.getPermissionByRoleID(roleId);
		return ps;
	}
}
