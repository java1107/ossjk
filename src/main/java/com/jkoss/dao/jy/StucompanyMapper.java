package com.jkoss.dao.jy;

import com.jkoss.pojo.jy.Stucompany;
import com.jkoss.pojo.jy.StucompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StucompanyMapper {
    int countByExample(StucompanyExample example);

    int deleteByExample(StucompanyExample example);

    int deleteByPrimaryKey(Integer jygjID);

    int insert(Stucompany record);

    int insertSelective(Stucompany record);

    List<Stucompany> selectByExample(StucompanyExample example);

    Stucompany selectByPrimaryKey(Integer jygjID);

    int updateByExampleSelective(@Param("record") Stucompany record, @Param("example") StucompanyExample example);

    int updateByExample(@Param("record") Stucompany record, @Param("example") StucompanyExample example);

    int updateByPrimaryKeySelective(Stucompany record);

    int updateByPrimaryKey(Stucompany record);
}