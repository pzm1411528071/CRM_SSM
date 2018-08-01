package com.ncu.mapper;
import com.ncu.pojo.DepartmentInfo;
import com.ncu.pojo.DepartmentInfoExample;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepartmentInfoMapper {
    int countByExample(DepartmentInfoExample example);

    int deleteByExample(DepartmentInfoExample example);

    int deleteByPrimaryKey(Integer departmentId);

    int insert(DepartmentInfo record);

    int insertSelective(DepartmentInfo record);

    List<DepartmentInfo> selectByExample(DepartmentInfoExample example);

    DepartmentInfo selectByPrimaryKey(Integer departmentId);

    int updateByExampleSelective(@Param("record") DepartmentInfo record, @Param("example") DepartmentInfoExample example);

    int updateByExample(@Param("record") DepartmentInfo record, @Param("example") DepartmentInfoExample example);

    int updateByPrimaryKeySelective(DepartmentInfo record);

    int updateByPrimaryKey(DepartmentInfo record);

	List<DepartmentInfo> selectAllDepartmentInfo();

	int selecttotalCount();

	List<DepartmentInfo> selectNowPageData(HashMap<Object, Object> queryMap);
}