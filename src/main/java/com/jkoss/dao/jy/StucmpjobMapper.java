package com.jkoss.dao.jy;

import com.jkoss.pojo.jy.Stucmpjob;
import com.jkoss.pojo.jy.StucmpjobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StucmpjobMapper {
    int countByExample(StucmpjobExample example);

    int deleteByExample(StucmpjobExample example);

    int deleteByPrimaryKey(Integer jygwid);

    int insert(Stucmpjob record);

    int insertSelective(Stucmpjob record);

    List<Stucmpjob> selectByExample(StucmpjobExample example);

    Stucmpjob selectByPrimaryKey(Integer jygwid);

    int updateByExampleSelective(@Param("record") Stucmpjob record, @Param("example") StucmpjobExample example);

    int updateByExample(@Param("record") Stucmpjob record, @Param("example") StucmpjobExample example);

    int updateByPrimaryKeySelective(Stucmpjob record);

    int updateByPrimaryKey(Stucmpjob record);
}