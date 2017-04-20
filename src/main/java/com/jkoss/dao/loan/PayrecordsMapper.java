package com.jkoss.dao.loan;

import com.jkoss.pojo.loan.Payrecords;
import com.jkoss.pojo.loan.PayrecordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayrecordsMapper {
    int countByExample(PayrecordsExample example);

    int deleteByExample(PayrecordsExample example);

    int deleteByPrimaryKey(Integer payRecordID);

    int insert(Payrecords record);

    int insertSelective(Payrecords record);

    List<Payrecords> selectByExample(PayrecordsExample example);

    Payrecords selectByPrimaryKey(Integer payRecordID);

    int updateByExampleSelective(@Param("record") Payrecords record, @Param("example") PayrecordsExample example);

    int updateByExample(@Param("record") Payrecords record, @Param("example") PayrecordsExample example);

    int updateByPrimaryKeySelective(Payrecords record);

    int updateByPrimaryKey(Payrecords record);
}