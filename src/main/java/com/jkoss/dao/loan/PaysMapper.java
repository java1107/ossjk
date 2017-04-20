package com.jkoss.dao.loan;

import com.jkoss.pojo.loan.Pays;
import com.jkoss.pojo.loan.PaysExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaysMapper {
    int countByExample(PaysExample example);

    int deleteByExample(PaysExample example);

    int deleteByPrimaryKey(Integer payID);

    int insert(Pays record);

    int insertSelective(Pays record);

    List<Pays> selectByExample(PaysExample example);

    Pays selectByPrimaryKey(Integer payID);

    int updateByExampleSelective(@Param("record") Pays record, @Param("example") PaysExample example);

    int updateByExample(@Param("record") Pays record, @Param("example") PaysExample example);

    int updateByPrimaryKeySelective(Pays record);

    int updateByPrimaryKey(Pays record);
}