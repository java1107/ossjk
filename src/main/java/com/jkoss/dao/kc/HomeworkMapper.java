package com.jkoss.dao.kc;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jkoss.pojo.kc.Homework;
import com.jkoss.pojo.kc.HomeworkExample;

public interface HomeworkMapper {
    

	int countByExample(HomeworkExample example);

    int deleteByExample(HomeworkExample example);

    int deleteByPrimaryKey(Integer hkid);

    int insert(Homework record);

    int insertSelective(Homework record);

    List<Homework> selectByExample(HomeworkExample example);

    Homework selectByPrimaryKey(Integer hkid);

    int updateByExampleSelective(@Param("record") Homework record, @Param("example") HomeworkExample example);

    int updateByExample(@Param("record") Homework record, @Param("example") HomeworkExample example);

    int updateByPrimaryKeySelective(Homework record);

    int updateByPrimaryKey(Homework record);
}