package com.ncu.mapper;
import com.ncu.pojo.CustomerCare;
import com.ncu.pojo.CustomerCareExample;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;
public interface CustomerCareMapper {
    int countByExample(CustomerCareExample example);

    int deleteByExample(CustomerCareExample example);

    int deleteByPrimaryKey(Integer careId);

    int insert(CustomerCare record);

    int insertSelective(CustomerCare record);

    List<CustomerCare> selectByExample(CustomerCareExample example);

    CustomerCare selectByPrimaryKey(Integer careId);

    int updateByExampleSelective(@Param("record") CustomerCare record, @Param("example") CustomerCareExample example);

    int updateByExample(@Param("record") CustomerCare record, @Param("example") CustomerCareExample example);

    int updateByPrimaryKeySelective(CustomerCare record);

    int updateByPrimaryKey(CustomerCare record);

	List<CustomerCare> selectByCareTime(HashMap<Object, Object> hashmap);

	Integer countByCondition(HashMap<Object, Object> hashmap);

    //查询客户关怀信息及其关联表的所有信息
	List<CustomerCare> selectCustomerCareAndOther();
	//根据查询内容和客户关怀查找客户关怀信息
	List<CustomerCare> selectCustomerCareByCondition(HashMap<Object, Object> queryMap);
}