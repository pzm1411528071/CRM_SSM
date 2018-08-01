package com.ncu.mapper;
import com.ncu.pojo.Permission;
import com.ncu.pojo.UserInfo;
import com.ncu.pojo.UserInfoExample;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
@SuppressWarnings("all")
public interface UserInfoMapper {
    int countByExample(UserInfoExample example);
    int deleteByExample(UserInfoExample example);
    int deleteByPrimaryKey(Integer userId);
    int insert(UserInfo record);
    int insertSelective(UserInfo record);
    List<UserInfo> selectByExample(UserInfoExample example);
    UserInfo selectByPrimaryKey(Integer userId);
    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);
    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);
    int updateByPrimaryKeySelective(UserInfo record);
    int updateByPrimaryKey(UserInfo record);
	Integer countByCondition(HashMap<Object, Object> queryMap);
	List<UserInfo> selectNowPageDate(HashMap<Object, Object> queryMap);
	UserInfo selectById(Integer userId);
	//查询员工信息及其关联表的所有信息
	List<UserInfo> selectUserAndOther();
	//根据权限的parentId查询所有权限及其关联表信息
	List<Permission> getPermissionsByParentId(Map m);

	
}