package com.jkoss.dao.oa;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jkoss.pojo.oa.Emps;
import com.jkoss.pojo.oa.Ossqq;
import com.jkoss.pojo.oa.OssqqExample;
import com.jkoss.tool.Page;

public interface OssqqMapper {
	
	@Select("select * from t_qyqq") 
	@RequestMapping("com.jkoss.dao.oa.OssqqMapper.BaseResultMap")
	List<Ossqq> selectAtPage(Page page);
	                            
	@Select("select  * from t_qyqq  where qqename = #{qename}")
	@ResultMap("com.jkoss.dao.oa.OssqqMapper.BaseResultMap")
	Ossqq selectByEqename(String qename);
	
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