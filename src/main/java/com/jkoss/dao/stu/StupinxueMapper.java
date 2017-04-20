package com.jkoss.dao.stu;

import com.jkoss.pojo.stu.Stupinxue;
import com.jkoss.pojo.stu.StupinxueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StupinxueMapper {
    int countByExample(StupinxueExample example);

    int deleteByExample(StupinxueExample example);

    int deleteByPrimaryKey(Integer pinjiaID);

    int insert(Stupinxue record);

    int insertSelective(Stupinxue record);

    List<Stupinxue> selectByExample(StupinxueExample example);

    Stupinxue selectByPrimaryKey(Integer pinjiaID);

    int updateByExampleSelective(@Param("record") Stupinxue record, @Param("example") StupinxueExample example);

    int updateByExample(@Param("record") Stupinxue record, @Param("example") StupinxueExample example);

    int updateByPrimaryKeySelective(Stupinxue record);

    int updateByPrimaryKey(Stupinxue record);
}