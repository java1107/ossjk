package com.jkoss.dao.jy;

import com.jkoss.pojo.jy.JiuyeGS;
import com.jkoss.pojo.jy.JiuyeGSExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JiuyeGSMapper {
    int countByExample(JiuyeGSExample example);

    int deleteByExample(JiuyeGSExample example);

    int deleteByPrimaryKey(Integer jyid);

    int insert(JiuyeGS record);

    int insertSelective(JiuyeGS record);

    List<JiuyeGS> selectByExample(JiuyeGSExample example);

    JiuyeGS selectByPrimaryKey(Integer jyid);

    int updateByExampleSelective(@Param("record") JiuyeGS record, @Param("example") JiuyeGSExample example);

    int updateByExample(@Param("record") JiuyeGS record, @Param("example") JiuyeGSExample example);

    int updateByPrimaryKeySelective(JiuyeGS record);

    int updateByPrimaryKey(JiuyeGS record);
}