package org.gec.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.gec.pojo.Filminfo;
import org.gec.pojo.FilminfoExample;

public interface FilminfoMapper {
    int countByExample(FilminfoExample example);

    int deleteByExample(FilminfoExample example);

    int deleteByPrimaryKey(Integer filmid);

    int insert(Filminfo record);

    int insertSelective(Filminfo record);

    List<Filminfo> selectByExample(FilminfoExample example);

    Filminfo selectByPrimaryKey(Integer filmid);

    int updateByExampleSelective(@Param("record") Filminfo record, @Param("example") FilminfoExample example);

    int updateByExample(@Param("record") Filminfo record, @Param("example") FilminfoExample example);

    int updateByPrimaryKeySelective(Filminfo record);

    int updateByPrimaryKey(Filminfo record);
}