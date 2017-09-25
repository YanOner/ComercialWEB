package com.gmt.comercial.dao;

import com.gmt.comercial.model.Unidadmedidadimension;
import com.gmt.comercial.model.UnidadmedidadimensionExample;
import java.util.List;
import org.apache.ibatis.session.RowBounds;

public interface UnidadmedidadimensionMapper {
    int deleteByPrimaryKey(Integer idUMD);

    int insert(Unidadmedidadimension record);

    int insertSelective(Unidadmedidadimension record);

    List<Unidadmedidadimension> selectByExampleWithRowbounds(UnidadmedidadimensionExample example, RowBounds rowBounds);

    List<Unidadmedidadimension> selectByExample(UnidadmedidadimensionExample example);

    Unidadmedidadimension selectByPrimaryKey(Integer idUMD);

    int updateByPrimaryKeySelective(Unidadmedidadimension record);

    int updateByPrimaryKey(Unidadmedidadimension record);
}