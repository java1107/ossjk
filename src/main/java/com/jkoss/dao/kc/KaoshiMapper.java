package com.jkoss.dao.kc;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jkoss.pojo.kc.Kaoshi;
import com.jkoss.pojo.kc.KaoshiExample;

public interface KaoshiMapper {
     

	int countByExample(KaoshiExample example);

    int deleteByExample(KaoshiExample example);

    int deleteByPrimaryKey(Integer themeid);

    int insert(Kaoshi record);

    int insertSelective(Kaoshi record);

    List<Kaoshi> selectByExample(KaoshiExample example);

    Kaoshi selectByPrimaryKey(Integer themeid);

    int updateByExampleSelective(@Param("record") Kaoshi record, @Param("example") KaoshiExample example);

    int updateByExample(@Param("record") Kaoshi record, @Param("example") KaoshiExample example);

    int updateByPrimaryKeySelective(Kaoshi record);

    int updateByPrimaryKey(Kaoshi record);
}