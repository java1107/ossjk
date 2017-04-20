package com.jkoss.dao.sys;

import com.jkoss.pojo.sys.Sysright;
import com.jkoss.pojo.sys.SysrightExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

public interface SysrightMapper {
	
/*	@Select( "select  a.* from t_sysright a,t_emp2right b  where a.rtid=b.rtid and b.eid = #{eid}")
	@ResultMap("com.jkoss.dao.EmpsMapper.BaseResultMap")*/
    List<Sysright> selectByEid(Integer eid);
	
    int countByExample(SysrightExample example);

    int deleteByExample(SysrightExample example);

    int deleteByPrimaryKey(Integer rtid);

    int insert(Sysright record);

    int insertSelective(Sysright record);

    List<Sysright> selectByExample(SysrightExample example);

    Sysright selectByPrimaryKey(Integer rtid);

    int updateByExampleSelective(@Param("record") Sysright record, @Param("example") SysrightExample example);

    int updateByExample(@Param("record") Sysright record, @Param("example") SysrightExample example);

    int updateByPrimaryKeySelective(Sysright record);

    int updateByPrimaryKey(Sysright record);
    
}