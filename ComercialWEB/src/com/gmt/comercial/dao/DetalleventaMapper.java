package com.gmt.comercial.dao;

import com.gmt.comercial.model.Detalleventa;
import com.gmt.comercial.model.DetalleventaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DetalleventaMapper {
    int deleteByPrimaryKey(@Param("idVenta") Integer idVenta, @Param("idProducto") Integer idProducto, @Param("idColorProducto") Integer idColorProducto, @Param("nroTalla") Integer nroTalla);

    int insert(Detalleventa record);

    int insertSelective(Detalleventa record);

    List<Detalleventa> selectByExampleWithRowbounds(DetalleventaExample example, RowBounds rowBounds);

    List<Detalleventa> selectByExample(DetalleventaExample example);

    Detalleventa selectByPrimaryKey(@Param("idVenta") Integer idVenta, @Param("idProducto") Integer idProducto, @Param("idColorProducto") Integer idColorProducto, @Param("nroTalla") Integer nroTalla);

    int updateByPrimaryKeySelective(Detalleventa record);

    int updateByPrimaryKey(Detalleventa record);
}