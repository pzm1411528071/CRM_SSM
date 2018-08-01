package com.ncu.mapper;

import com.ncu.pojo.HouseType;
import com.ncu.pojo.HouseTypeExample;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HouseTypeMapper {
    int countByExample(HouseTypeExample example);

    int deleteByExample(HouseTypeExample example);

    int deleteByPrimaryKey(Integer typeId);

    int insert(HouseType record);

    int insertSelective(HouseType record);

    List<HouseType> selectByExample(HouseTypeExample example);

    HouseType selectByPrimaryKey(Integer typeId);

    int updateByExampleSelective(@Param("record") HouseType record, @Param("example") HouseTypeExample example);

    int updateByExample(@Param("record") HouseType record, @Param("example") HouseTypeExample example);

    int updateByPrimaryKeySelective(HouseType record);

    int updateByPrimaryKey(HouseType record);

	int selecttotalCount();

	List<HouseType> selectNowPageData(HashMap<Object, Object> queryMap);
}