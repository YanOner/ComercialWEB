package com.gmt.comercial.dao;

import com.gmt.comercial.model.Temporada;
import com.gmt.comercial.model.TemporadaExample;
import java.util.List;
import org.apache.ibatis.session.RowBounds;

public interface TemporadaMapper {
    int deleteByPrimaryKey(Integer idTemporada);

    int insert(Temporada record);

    int insertSelective(Temporada record);

    List<Temporada> selectByExampleWithRowbounds(TemporadaExample example, RowBounds rowBounds);

    List<Temporada> selectByExample(TemporadaExample example);

    Temporada selectByPrimaryKey(Integer idTemporada);

    int updateByPrimaryKeySelective(Temporada record);

    int updateByPrimaryKey(Temporada record);
}