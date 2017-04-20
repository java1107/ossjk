package com.jkoss.dao.jy;

import com.jkoss.pojo.jy.JiuyeJobs;
import com.jkoss.pojo.jy.JiuyeJobsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JiuyeJobsMapper {
    int countByExample(JiuyeJobsExample example);

    int deleteByExample(JiuyeJobsExample example);

    int deleteByPrimaryKey(Integer jobid);

    int insert(JiuyeJobs record);

    int insertSelective(JiuyeJobs record);

    List<JiuyeJobs> selectByExample(JiuyeJobsExample example);

    JiuyeJobs selectByPrimaryKey(Integer jobid);

    int updateByExampleSelective(@Param("record") JiuyeJobs record, @Param("example") JiuyeJobsExample example);

    int updateByExample(@Param("record") JiuyeJobs record, @Param("example") JiuyeJobsExample example);

    int updateByPrimaryKeySelective(JiuyeJobs record);

    int updateByPrimaryKey(JiuyeJobs record);
}