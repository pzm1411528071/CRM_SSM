package com.ncu.mapper;
import com.ncu.pojo.CustomerInfo;
import com.ncu.pojo.CustomerInfoExample;
import com.ncu.pojo.UserInfo;
import com.ncu.utils.Partment;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;
public interface CustomerInfoMapper {
    int countByExample(CustomerInfoExample example);
    int deleteByExample(CustomerInfoExample example);
    int deleteByPrimaryKey(Integer customerId);
    int insert(CustomerInfo record);
    int insertSelective(CustomerInfo record);
    List<CustomerInfo> selectByExample(CustomerInfoExample example);
    CustomerInfo selectByPrimaryKey(Integer customerId);
    int updateByExampleSelective(@Param("record") CustomerInfo record, @Param("example") CustomerInfoExample example);
    int updateByExample(@Param("record") CustomerInfo record, @Param("example") CustomerInfoExample example);
    int updateByPrimaryKeySelective(CustomerInfo record);
    int updateByPrimaryKey(CustomerInfo record);
    
    //查询客户信息及其关联表的所有信息
    List<CustomerInfo> selectCustomerAndOther();
    //根据查询内容和客户状态查找客户信息(通过map传入多个参数)
	List<CustomerInfo> selectCustomerByCondition(HashMap<Object, Object> queryMap);
	//根据查询内容和客户状态查询客户数量
	int countByCondition(HashMap<Object, Object> queryMap);
	//根据客户id查找客户信息
	CustomerInfo selectCustomerById(Integer customerId);
	//查询所有员工信息
	List<UserInfo> selectUser();
	//查询某个时间段内生日的客户信息数量
	Integer countByBirthday(HashMap<Object, Object> hashmap);
	//查询某个时间段内生日的客户信息
	List<CustomerInfo> selectCustomerInfoByBirthday(HashMap<Object, Object> hashmap);
	//大饼中每块的占比
	List<Partment> getPartment();
	
}