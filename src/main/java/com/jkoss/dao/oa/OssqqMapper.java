package com.jkoss.dao.oa;

import com.jkoss.pojo.oa.Department;
import com.jkoss.pojo.oa.Ossqq;
import com.jkoss.pojo.oa.OssqqExample;
import com.jkoss.tool.Page;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestMapping;

public interface OssqqMapper {
	
	@Select("select * from t_qyqq") 
	@RequestMapping("com.jkoss.dao.oa.OssqqMapper.BaseResultMap2")
	List<Ossqq> selectAtPage(Page page);
	
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