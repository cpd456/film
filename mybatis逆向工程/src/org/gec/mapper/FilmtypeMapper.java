package org.gec.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.gec.pojo.Filmtype;
import org.gec.pojo.FilmtypeExample;

public interface FilmtypeMapper {
    int countByExample(FilmtypeExample example);

    int deleteByExample(FilmtypeExample example);

    int deleteByPrimaryKey(Integer typeid);

    int insert(Filmtype record);

    int insertSelective(Filmtype record);

    List<Filmtype> selectByExample(FilmtypeExample example);

    Filmtype selectByPrimaryKey(Integer typeid);

    int updateByExampleSelective(@Param("record") Filmtype record, @Param("example") FilmtypeExample example);

    int updateByExample(@Param("record") Filmtype record, @Param("example") FilmtypeExample example);

    int updateByPrimaryKeySelective(Filmtype record);

    int updateByPrimaryKey(Filmtype record);
}