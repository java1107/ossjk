package com.jkoss.dao.jy;

import com.jkoss.pojo.jy.Jiuyerecode;
import com.jkoss.pojo.jy.JiuyerecodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JiuyerecodeMapper {
    int countByExample(JiuyerecodeExample example);

    int deleteByExample(JiuyerecodeExample example);

    int deleteByPrimaryKey(Integer jysuccid);

    int insert(Jiuyerecode record);

    int insertSelective(Jiuyerecode record);

    List<Jiuyerecode> selectByExample(JiuyerecodeExample example);

    Jiuyerecode selectByPrimaryKey(Integer jysuccid);

    int updateByExampleSelective(@Param("record") Jiuyerecode record, @Param("example") JiuyerecodeExample example);

    int updateByExample(@Param("record") Jiuyerecode record, @Param("example") JiuyerecodeExample example);

    int updateByPrimaryKeySelective(Jiuyerecode record);

    int updateByPrimaryKey(Jiuyerecode record);
}