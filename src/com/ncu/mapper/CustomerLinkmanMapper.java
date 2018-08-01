package com.ncu.mapper;

import com.ncu.pojo.CustomerLinkman;
import com.ncu.pojo.CustomerLinkmanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerLinkmanMapper {
    int countByExample(CustomerLinkmanExample example);

    int deleteByExample(CustomerLinkmanExample example);

    int deleteByPrimaryKey(Integer linkmanId);

    int insert(CustomerLinkman record);

    int insertSelective(CustomerLinkman record);

    List<CustomerLinkman> selectByExample(CustomerLinkmanExample example);

    CustomerLinkman selectByPrimaryKey(Integer linkmanId);

    int updateByExampleSelective(@Param("record") CustomerLinkman record, @Param("example") CustomerLinkmanExample example);

    int updateByExample(@Param("record") CustomerLinkman record, @Param("example") CustomerLinkmanExample example);

    int updateByPrimaryKeySelective(CustomerLinkman record);

    int updateByPrimaryKey(CustomerLinkman record);
}