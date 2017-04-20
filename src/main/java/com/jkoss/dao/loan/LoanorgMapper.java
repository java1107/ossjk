package com.jkoss.dao.loan;

import com.jkoss.pojo.loan.Loanorg;
import com.jkoss.pojo.loan.LoanorgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoanorgMapper {
    int countByExample(LoanorgExample example);

    int deleteByExample(LoanorgExample example);

    int deleteByPrimaryKey(Integer loancpid);

    int insert(Loanorg record);

    int insertSelective(Loanorg record);

    List<Loanorg> selectByExample(LoanorgExample example);

    Loanorg selectByPrimaryKey(Integer loancpid);

    int updateByExampleSelective(@Param("record") Loanorg record, @Param("example") LoanorgExample example);

    int updateByExample(@Param("record") Loanorg record, @Param("example") LoanorgExample example);

    int updateByPrimaryKeySelective(Loanorg record);

    int updateByPrimaryKey(Loanorg record);
}