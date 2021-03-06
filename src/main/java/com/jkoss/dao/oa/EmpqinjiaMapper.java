package com.jkoss.dao.oa;

import com.jkoss.pojo.oa.Empqinjia;
import com.jkoss.pojo.oa.EmpqinjiaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmpqinjiaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_empqinjia
     *
     * @mbggenerated
     */
    int countByExample(EmpqinjiaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_empqinjia
     *
     * @mbggenerated
     */
    int deleteByExample(EmpqinjiaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_empqinjia
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer sqjid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_empqinjia
     *
     * @mbggenerated
     */
    int insert(Empqinjia record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_empqinjia
     *
     * @mbggenerated
     */
    int insertSelective(Empqinjia record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_empqinjia
     *
     * @mbggenerated
     */
    List<Empqinjia> selectByExample(EmpqinjiaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_empqinjia
     *
     * @mbggenerated
     */
    Empqinjia selectByPrimaryKey(Integer sqjid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_empqinjia
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Empqinjia record, @Param("example") EmpqinjiaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_empqinjia
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Empqinjia record, @Param("example") EmpqinjiaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_empqinjia
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Empqinjia record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_empqinjia
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Empqinjia record);
}