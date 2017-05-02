package com.jkoss.dao.oa;

import com.jkoss.pojo.oa.EmpJobs;
import com.jkoss.pojo.oa.EmpJobsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmpJobsMapper {
    int countByExample(EmpJobsExample example);

    int deleteByExample(EmpJobsExample example);

    int deleteByPrimaryKey(Integer jobid);

    int insert(EmpJobs record);

    int insertSelective(EmpJobs record);

    List<EmpJobs> selectByExample(EmpJobsExample example);

    EmpJobs selectByPrimaryKey(Integer jobid);

    int updateByExampleSelective(@Param("record") EmpJobs record, @Param("example") EmpJobsExample example);

    int updateByExample(@Param("record") EmpJobs record, @Param("example") EmpJobsExample example);

    int updateByPrimaryKeySelective(EmpJobs record);

    int updateByPrimaryKey(EmpJobs record);
}