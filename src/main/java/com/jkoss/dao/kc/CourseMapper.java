package com.jkoss.dao.kc;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jkoss.pojo.kc.Course;
import com.jkoss.pojo.kc.CourseExample;
 

public interface CourseMapper {
    

	int countByExample(CourseExample example);

    int deleteByExample(CourseExample example);

    int deleteByPrimaryKey(Integer kcid);

    int insert(Course record);

    int insertSelective(Course record);

    List<Course> selectByExample(CourseExample example);

    Course selectByPrimaryKey(Integer kcid);

    int updateByExampleSelective(@Param("record") Course record, @Param("example") CourseExample example);

    int updateByExample(@Param("record") Course record, @Param("example") CourseExample example);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
}