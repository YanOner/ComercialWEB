package com.gmt.comercial.dao;

import com.gmt.comercial.model.Pagosordenconsignacion;
import com.gmt.comercial.model.PagosordenconsignacionExample;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PagosordenconsignacionMapper {
    int deleteByPrimaryKey(@Param("idOrdenConsignacion") Integer idOrdenConsignacion, @Param("fechaProgramada") Date fechaProgramada, @Param("correlativo") Integer correlativo);

    int insert(Pagosordenconsignacion record);

    int insertSelective(Pagosordenconsignacion record);

    List<Pagosordenconsignacion> selectByExampleWithRowbounds(PagosordenconsignacionExample example, RowBounds rowBounds);

    List<Pagosordenconsignacion> selectByExample(PagosordenconsignacionExample example);

    Pagosordenconsignacion selectByPrimaryKey(@Param("idOrdenConsignacion") Integer idOrdenConsignacion, @Param("fechaProgramada") Date fechaProgramada, @Param("correlativo") Integer correlativo);

    int updateByPrimaryKeySelective(Pagosordenconsignacion record);

    int updateByPrimaryKey(Pagosordenconsignacion record);
}