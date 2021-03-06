package com.jkoss.dao.oa;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jkoss.pojo.oa.Department;
import com.jkoss.pojo.oa.DepartmentExample;
import com.jkoss.tool.Page;

public interface DepartmentMapper {
	
	@Select("select * from t_department")
	@RequestMapping("com.jkoss.dao.oa.DepartmentMapper.BaseResultMap")
	List<Department> selectAtPage(Page page);
	   
    int countByExample(DepartmentExample example);
 
    int deleteByExample(DepartmentExample example);
 
    int deleteByPrimaryKey(Integer depID);
 
    int insert(Department record);
 
    int insertSelective(Department record);
 
    List<Department> selectByExample(DepartmentExample example);
 
    Department selectByPrimaryKey(Integer depID);
 
    int updateByExampleSelective(@Param("record") Department record, @Param("example") DepartmentExample example);
 
    int updateByExample(@Param("record") Department record, @Param("example") DepartmentExample example);
 
    int updateByPrimaryKeySelective(Department record);
 
    int updateByPrimaryKey(Department record);
    
    
    
    
}