package com.jkoss.dao.kc;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jkoss.pojo.kc.Coursemodel;
import com.jkoss.pojo.kc.CoursemodelExample;

public interface CoursemodelMapper {
  
 
 

	int countByExample(CoursemodelExample example);

    int deleteByExample(CoursemodelExample example);

    int deleteByPrimaryKey(Integer kcmdelid);

    int insert(Coursemodel record);

    int insertSelective(Coursemodel record);

    List<Coursemodel> selectByExample(CoursemodelExample example);

    Coursemodel selectByPrimaryKey(Integer kcmdelid);

    int updateByExampleSelective(@Param("record") Coursemodel record, @Param("example") CoursemodelExample example);

    int updateByExample(@Param("record") Coursemodel record, @Param("example") CoursemodelExample example);

    int updateByPrimaryKeySelective(Coursemodel record);

    int updateByPrimaryKey(Coursemodel record);
}