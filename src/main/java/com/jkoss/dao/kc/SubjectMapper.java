package com.jkoss.dao.kc;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jkoss.pojo.kc.Subject;
import com.jkoss.pojo.kc.SubjectExample;

public interface SubjectMapper {
      

	int countByExample(SubjectExample example);

    int deleteByExample(SubjectExample example);

    int deleteByPrimaryKey(Integer sbid);

    int insert(Subject record);

    int insertSelective(Subject record);

    List<Subject> selectByExample(SubjectExample example);

    Subject selectByPrimaryKey(Integer sbid);

    int updateByExampleSelective(@Param("record") Subject record, @Param("example") SubjectExample example);

    int updateByExample(@Param("record") Subject record, @Param("example") SubjectExample example);

    int updateByPrimaryKeySelective(Subject record);

    int updateByPrimaryKey(Subject record);
}