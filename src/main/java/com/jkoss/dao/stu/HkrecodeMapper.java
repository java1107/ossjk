package com.jkoss.dao.stu;

import com.jkoss.pojo.stu.Hkrecode;
import com.jkoss.pojo.stu.HkrecodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HkrecodeMapper {
    int countByExample(HkrecodeExample example);

    int deleteByExample(HkrecodeExample example);

    int deleteByPrimaryKey(Integer hkid2);

    int insert(Hkrecode record);

    int insertSelective(Hkrecode record);

    List<Hkrecode> selectByExample(HkrecodeExample example);

    Hkrecode selectByPrimaryKey(Integer hkid2);

    int updateByExampleSelective(@Param("record") Hkrecode record, @Param("example") HkrecodeExample example);

    int updateByExample(@Param("record") Hkrecode record, @Param("example") HkrecodeExample example);

    int updateByPrimaryKeySelective(Hkrecode record);

    int updateByPrimaryKey(Hkrecode record);
}