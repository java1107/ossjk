package com.jkoss.dao.stu;

import com.jkoss.pojo.stu.Results;
import com.jkoss.pojo.stu.ResultsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResultsMapper {
    int countByExample(ResultsExample example);

    int deleteByExample(ResultsExample example);

    int deleteByPrimaryKey(Integer resid);

    int insert(Results record);

    int insertSelective(Results record);

    List<Results> selectByExample(ResultsExample example);

    Results selectByPrimaryKey(Integer resid);

    int updateByExampleSelective(@Param("record") Results record, @Param("example") ResultsExample example);

    int updateByExample(@Param("record") Results record, @Param("example") ResultsExample example);

    int updateByPrimaryKeySelective(Results record);

    int updateByPrimaryKey(Results record);
}