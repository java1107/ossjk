package com.jkoss.dao.zx;

import com.jkoss.pojo.zx.Consultation;
import com.jkoss.pojo.zx.ConsultationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConsultationMapper {
    int countByExample(ConsultationExample example);

    int deleteByExample(ConsultationExample example);

    int deleteByPrimaryKey(Integer zstuid);

    int insert(Consultation record);

    int insertSelective(Consultation record);

    List<Consultation> selectByExample(ConsultationExample example);

    Consultation selectByPrimaryKey(Integer zstuid);

    int updateByExampleSelective(@Param("record") Consultation record, @Param("example") ConsultationExample example);

    int updateByExample(@Param("record") Consultation record, @Param("example") ConsultationExample example);

    int updateByPrimaryKeySelective(Consultation record);

    int updateByPrimaryKey(Consultation record);
}