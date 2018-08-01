package com.ncu.mapper;

import com.ncu.pojo.URole;
import com.ncu.pojo.URoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface URoleMapper {
    int countByExample(URoleExample example);

    int deleteByExample(URoleExample example);

    int insert(URole record);

    int insertSelective(URole record);

    List<URole> selectByExample(URoleExample example);

    int updateByExampleSelective(@Param("record") URole record, @Param("example") URoleExample example);

    int updateByExample(@Param("record") URole record, @Param("example") URoleExample example);
}