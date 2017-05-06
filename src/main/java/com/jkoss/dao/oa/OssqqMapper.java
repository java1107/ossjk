package com.jkoss.dao.oa;

import com.jkoss.pojo.oa.Ossqq;
import com.jkoss.pojo.oa.OssqqExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OssqqMapper {
    int countByExample(OssqqExample example);

    int deleteByExample(OssqqExample example);

    int deleteByPrimaryKey(Integer qqeid);

    int insert(Ossqq record);

    int insertSelective(Ossqq record);

    List<Ossqq> selectByExample(OssqqExample example);

    Ossqq selectByPrimaryKey(Integer qqeid);

    int updateByExampleSelective(@Param("record") Ossqq record, @Param("example") OssqqExample example);

    int updateByExample(@Param("record") Ossqq record, @Param("example") OssqqExample example);

    int updateByPrimaryKeySelective(Ossqq record);

    int updateByPrimaryKey(Ossqq record);
}