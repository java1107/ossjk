package com.jkoss.dao.zx;

import com.jkoss.pojo.zx.School;
import com.jkoss.pojo.zx.SchoolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchoolMapper {
    int countByExample(SchoolExample example);

    int deleteByExample(SchoolExample example);

    int deleteByPrimaryKey(Integer schoolID);

    int insert(School record);

    int insertSelective(School record);

    List<School> selectByExample(SchoolExample example);

    School selectByPrimaryKey(Integer schoolID);

    int updateByExampleSelective(@Param("record") School record, @Param("example") SchoolExample example);

    int updateByExample(@Param("record") School record, @Param("example") SchoolExample example);

    int updateByPrimaryKeySelective(School record);

    int updateByPrimaryKey(School record);
}