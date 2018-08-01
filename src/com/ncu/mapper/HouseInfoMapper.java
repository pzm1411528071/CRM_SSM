package com.ncu.mapper;
import com.ncu.pojo.HouseInfo;
import com.ncu.pojo.HouseInfoExample;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;
public interface HouseInfoMapper {
    int countByExample(HouseInfoExample example);

    int deleteByExample(HouseInfoExample example);

    int deleteByPrimaryKey(Integer houseId);

    int insert(HouseInfo record);

    int insertSelective(HouseInfo record);

    List<HouseInfo> selectByExample(HouseInfoExample example);

    HouseInfo selectByPrimaryKey(Integer houseId);

    int updateByExampleSelective(@Param("record") HouseInfo record, @Param("example") HouseInfoExample example);

    int updateByExample(@Param("record") HouseInfo record, @Param("example") HouseInfoExample example);

    int updateByPrimaryKeySelective(HouseInfo record);

    int updateByPrimaryKey(HouseInfo record);

	List<HouseInfo> selectNowPageData(HashMap<Object, Object> queryMap);

	int selecttotalCount();
    
}