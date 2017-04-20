package com.jkoss.dao.jy;

import com.jkoss.pojo.jy.Stuattendance;
import com.jkoss.pojo.jy.StuattendanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StuattendanceMapper {
    int countByExample(StuattendanceExample example);

    int deleteByExample(StuattendanceExample example);

    int deleteByPrimaryKey(Integer kqid);

    int insert(Stuattendance record);

    int insertSelective(Stuattendance record);

    List<Stuattendance> selectByExample(StuattendanceExample example);

    Stuattendance selectByPrimaryKey(Integer kqid);

    int updateByExampleSelective(@Param("record") Stuattendance record, @Param("example") StuattendanceExample example);

    int updateByExample(@Param("record") Stuattendance record, @Param("example") StuattendanceExample example);

    int updateByPrimaryKeySelective(Stuattendance record);

    int updateByPrimaryKey(Stuattendance record);
}