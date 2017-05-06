package com.jkoss.dao.oa;

import com.jkoss.pojo.oa.Empfiles;
import com.jkoss.pojo.oa.EmpfilesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmpfilesMapper {
    int countByExample(EmpfilesExample example);

    int deleteByExample(EmpfilesExample example);

    int deleteByPrimaryKey(Integer fjid);

    int insert(Empfiles record);

    int insertSelective(Empfiles record);

    List<Empfiles> selectByExample(EmpfilesExample example);

    Empfiles selectByPrimaryKey(Integer fjid);

    int updateByExampleSelective(@Param("record") Empfiles record, @Param("example") EmpfilesExample example);

    int updateByExample(@Param("record") Empfiles record, @Param("example") EmpfilesExample example);

    int updateByPrimaryKeySelective(Empfiles record);

    int updateByPrimaryKey(Empfiles record);
}