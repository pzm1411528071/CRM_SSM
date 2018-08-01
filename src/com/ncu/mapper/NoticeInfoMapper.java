package com.ncu.mapper;
import com.ncu.pojo.NoticeInfo;
import com.ncu.pojo.NoticeInfoExample;
import java.util.HashMap;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
public interface NoticeInfoMapper {
    int countByExample(NoticeInfoExample example);

    int deleteByExample(NoticeInfoExample example);

    int deleteByPrimaryKey(Integer noticeId);

    int insert(NoticeInfo record);

    int insertSelective(NoticeInfo record);

    List<NoticeInfo> selectByExample(NoticeInfoExample example);

    NoticeInfo selectByPrimaryKey(Integer noticeId);

    int updateByExampleSelective(@Param("record") NoticeInfo record, @Param("example") NoticeInfoExample example);

    int updateByExample(@Param("record") NoticeInfo record, @Param("example") NoticeInfoExample example);

    int updateByPrimaryKeySelective(NoticeInfo record);

    int updateByPrimaryKey(NoticeInfo record);
    
	int selecttotalCount();

	List<NoticeInfo> selectNowPageData(HashMap<Object, Object> queryMap);
    //根据当前时间和截止时间相比较，算出截止时间之前的有效公告数量
	Integer countByEndTime(Date today);
    //根据当前时间和截止时间相比较，算出截止时间之前的有效公告的具体信息
	List<NoticeInfo> selectByEndTime(HashMap<Object, Object> hashmap);
}