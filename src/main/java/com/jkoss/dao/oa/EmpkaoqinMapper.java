package com.jkoss.dao.oa;

import com.jkoss.pojo.oa.Empkaoqin;
import com.jkoss.pojo.oa.EmpkaoqinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmpkaoqinMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_empkaoqin
     *
     * @mbggenerated
     */
    int countByExample(EmpkaoqinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_empkaoqin
     *
     * @mbggenerated
     */
    int deleteByExample(EmpkaoqinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_empkaoqin
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer ekqid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_empkaoqin
     *
     * @mbggenerated
     */
    int insert(Empkaoqin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_empkaoqin
     *
     * @mbggenerated
     */
    int insertSelective(Empkaoqin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_empkaoqin
     *
     * @mbggenerated
     */
    List<Empkaoqin> selectByExample(EmpkaoqinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_empkaoqin
     *
     * @mbggenerated
     */
    Empkaoqin selectByPrimaryKey(Integer ekqid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_empkaoqin
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Empkaoqin record, @Param("example") EmpkaoqinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_empkaoqin
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Empkaoqin record, @Param("example") EmpkaoqinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_empkaoqin
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Empkaoqin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_empkaoqin
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Empkaoqin record);
}