package com.gmt.comercial.dao;

import com.gmt.comercial.model.Ordendespacho;
import com.gmt.comercial.model.OrdendespachoExample;
import java.util.List;
import org.apache.ibatis.session.RowBounds;

public interface OrdendespachoMapper {
    int deleteByPrimaryKey(Integer idOrdenDespacho);

    int insert(Ordendespacho record);

    int insertSelective(Ordendespacho record);

    List<Ordendespacho> selectByExampleWithRowbounds(OrdendespachoExample example, RowBounds rowBounds);

    List<Ordendespacho> selectByExample(OrdendespachoExample example);

    Ordendespacho selectByPrimaryKey(Integer idOrdenDespacho);

    int updateByPrimaryKeySelective(Ordendespacho record);

    int updateByPrimaryKey(Ordendespacho record);
}