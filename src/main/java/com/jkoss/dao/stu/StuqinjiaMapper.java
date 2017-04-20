package com.jkoss.dao.stu;

import com.jkoss.pojo.stu.Stuqinjia;
import com.jkoss.pojo.stu.StuqinjiaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StuqinjiaMapper {
    int countByExample(StuqinjiaExample example);

    int deleteByExample(StuqinjiaExample example);

    int deleteByPrimaryKey(Integer sqjid);

    int insert(Stuqinjia record);

    int insertSelective(Stuqinjia record);

    List<Stuqinjia> selectByExample(StuqinjiaExample example);

    Stuqinjia selectByPrimaryKey(Integer sqjid);

    int updateByExampleSelective(@Param("record") Stuqinjia record, @Param("example") StuqinjiaExample example);

    int updateByExample(@Param("record") Stuqinjia record, @Param("example") StuqinjiaExample example);

    int updateByPrimaryKeySelective(Stuqinjia record);

    int updateByPrimaryKey(Stuqinjia record);
}