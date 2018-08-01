package com.ncu.mapper;

import com.ncu.pojo.EmailInfo;
import com.ncu.pojo.EmailInfoExample;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmailInfoMapper {
    int countByExample(EmailInfoExample example);

    int deleteByExample(EmailInfoExample example);

    int deleteByPrimaryKey(Integer emailId);

    int insert(EmailInfo record);

    int insertSelective(EmailInfo record);

    List<EmailInfo> selectByExample(EmailInfoExample example);

    EmailInfo selectByPrimaryKey(Integer emailId);

    int updateByExampleSelective(@Param("record") EmailInfo record, @Param("example") EmailInfoExample example);

    int updateByExample(@Param("record") EmailInfo record, @Param("example") EmailInfoExample example);

    int updateByPrimaryKeySelective(EmailInfo record);

    int updateByPrimaryKey(EmailInfo record);
    //根据联系客户的时间范围查找信息的条数
	Integer countByCondition(HashMap<Object, Object> hashmap);
    //查询联系客户信息表的具体信息
	List<EmailInfo> selectByEmailTime(HashMap<Object, Object> hashmap);
}