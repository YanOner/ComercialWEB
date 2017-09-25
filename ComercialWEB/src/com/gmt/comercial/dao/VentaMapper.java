package com.gmt.comercial.dao;

import com.gmt.comercial.model.Venta;
import com.gmt.comercial.model.VentaExample;
import java.util.List;
import org.apache.ibatis.session.RowBounds;

public interface VentaMapper {
    int deleteByPrimaryKey(Integer idVenta);

    int insert(Venta record);

    int insertSelective(Venta record);

    List<Venta> selectByExampleWithRowbounds(VentaExample example, RowBounds rowBounds);

    List<Venta> selectByExample(VentaExample example);

    Venta selectByPrimaryKey(Integer idVenta);

    int updateByPrimaryKeySelective(Venta record);

    int updateByPrimaryKey(Venta record);
}