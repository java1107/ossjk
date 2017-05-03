package com.jkoss.dao.oa;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.jkoss.pojo.oa.Department;
import com.jkoss.pojo.oa.Emps;
import com.jkoss.pojo.oa.EmpsExample;
import com.jkoss.tool.Page;

public interface EmpsMapper {
	
	@Select("select * from t_emps")
	@ResultMap("com.jkoss.dao.oa.EmpsMapper.BaseResultMap")
	List<Emps> selectAtPage(Page page);
	
   /*	@Select("select  a.*,b.*,c.* from t_emps a,t_empdetail b,t_sysright c,t_emp2right d "
			+ "where a.empdid=b.empdid and a.eid=d.eid and c.rtid=d.rtid and lgnName = #{lgnName}")*/
	@Select("select  * from t_emps  where lgnName = #{lgnName}")
	@ResultMap("com.jkoss.dao.oa.EmpsMapper.BaseResultMap")
    Emps selectByLgnName(String lgnName);
 
    int countByExample(EmpsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emps
     *
     * @mbggenerated
     */
    int deleteByExample(EmpsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emps
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer eid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emps
     *
     * @mbggenerated
     */
    int insert(Emps record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emps
     *
     * @mbggenerated
     */
    int insertSelective(Emps record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emps
     *
     * @mbggenerated
     */
    List<Emps> selectByExample(EmpsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emps
     *
     * @mbggenerated
     */
    Emps selectByPrimaryKey(Integer eid);
    
    


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emps
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Emps record, @Param("example") EmpsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emps
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Emps record, @Param("example") EmpsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emps
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Emps record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emps
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Emps record);
}