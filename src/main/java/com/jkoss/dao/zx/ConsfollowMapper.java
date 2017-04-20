package com.jkoss.dao.zx;

import com.jkoss.pojo.zx.Consfollow;
import com.jkoss.pojo.zx.ConsfollowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConsfollowMapper {
    int countByExample(ConsfollowExample example);

    int deleteByExample(ConsfollowExample example);

    int deleteByPrimaryKey(Integer flwid);

    int insert(Consfollow record);

    int insertSelective(Consfollow record);

    List<Consfollow> selectByExample(ConsfollowExample example);

    Consfollow selectByPrimaryKey(Integer flwid);

    int updateByExampleSelective(@Param("record") Consfollow record, @Param("example") ConsfollowExample example);

    int updateByExample(@Param("record") Consfollow record, @Param("example") ConsfollowExample example);

    int updateByPrimaryKeySelective(Consfollow record);

    int updateByPrimaryKey(Consfollow record);
}