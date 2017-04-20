package com.jkoss.dao.jy;

import com.jkoss.pojo.jy.Interview;
import com.jkoss.pojo.jy.InterviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InterviewMapper {
    int countByExample(InterviewExample example);

    int deleteByExample(InterviewExample example);

    int deleteByPrimaryKey(Integer stumsid);

    int insert(Interview record);

    int insertSelective(Interview record);

    List<Interview> selectByExample(InterviewExample example);

    Interview selectByPrimaryKey(Integer stumsid);

    int updateByExampleSelective(@Param("record") Interview record, @Param("example") InterviewExample example);

    int updateByExample(@Param("record") Interview record, @Param("example") InterviewExample example);

    int updateByPrimaryKeySelective(Interview record);

    int updateByPrimaryKey(Interview record);
}