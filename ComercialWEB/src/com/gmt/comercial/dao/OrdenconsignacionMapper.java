package com.gmt.comercial.dao;

import com.gmt.comercial.model.Ordenconsignacion;
import com.gmt.comercial.model.OrdenconsignacionExample;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface OrdenconsignacionMapper {
    int deleteByPrimaryKey(@Param("idOrdenConsignacion") Integer idOrdenConsignacion, @Param("fechaProgramada") Date fechaProgramada);

    int insert(Ordenconsignacion record);

    int insertSelective(Ordenconsignacion record);

    List<Ordenconsignacion> selectByExampleWithRowbounds(OrdenconsignacionExample example, RowBounds rowBounds);

    List<Ordenconsignacion> selectByExample(OrdenconsignacionExample example);

    Ordenconsignacion selectByPrimaryKey(@Param("idOrdenConsignacion") Integer idOrdenConsignacion, @Param("fechaProgramada") Date fechaProgramada);

    int updateByPrimaryKeySelective(Ordenconsignacion record);

    int updateByPrimaryKey(Ordenconsignacion record);
}