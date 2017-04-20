package com.jkoss.dao.stu;

import com.jkoss.pojo.stu.Ossstu;
import com.jkoss.pojo.stu.OssstuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OssstuMapper {
    int countByExample(OssstuExample example);

    int deleteByExample(OssstuExample example);

    int deleteByPrimaryKey(Integer ossstuid);

    int insert(Ossstu record);

    int insertSelective(Ossstu record);

    List<Ossstu> selectByExample(OssstuExample example);

    Ossstu selectByPrimaryKey(Integer ossstuid);

    int updateByExampleSelective(@Param("record") Ossstu record, @Param("example") OssstuExample example);

    int updateByExample(@Param("record") Ossstu record, @Param("example") OssstuExample example);

    int updateByPrimaryKeySelective(Ossstu record);

    int updateByPrimaryKey(Ossstu record);
}