package com.jkoss.dao.loan;

import com.jkoss.pojo.loan.Loancfg;
import com.jkoss.pojo.loan.LoancfgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoancfgMapper {
    int countByExample(LoancfgExample example);

    int deleteByExample(LoancfgExample example);

    int deleteByPrimaryKey(Integer fanID);

    int insert(Loancfg record);

    int insertSelective(Loancfg record);

    List<Loancfg> selectByExample(LoancfgExample example);

    Loancfg selectByPrimaryKey(Integer fanID);

    int updateByExampleSelective(@Param("record") Loancfg record, @Param("example") LoancfgExample example);

    int updateByExample(@Param("record") Loancfg record, @Param("example") LoancfgExample example);

    int updateByPrimaryKeySelective(Loancfg record);

    int updateByPrimaryKey(Loancfg record);
}