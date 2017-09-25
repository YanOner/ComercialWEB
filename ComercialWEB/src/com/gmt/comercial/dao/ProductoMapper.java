package com.gmt.comercial.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;

import com.gmt.comercial.model.Producto;
import com.gmt.comercial.model.ProductoExample;

public interface ProductoMapper {
    int deleteByPrimaryKey(Integer idProducto);

    int insert(Producto record);

    int insertSelective(Producto record);

    List<Producto> detalleProducto(Map<String, Object> parametros);
    
    List<Producto> buscarCatalogo(Map<String, Object> parametros);
    
    List<Producto> selectByExampleWithRowbounds(ProductoExample example, RowBounds rowBounds);

    List<Producto> selectByExample(ProductoExample example);

    Producto selectByPrimaryKey(Integer idProducto);

    int updateByPrimaryKeySelective(Producto record);

    int updateByPrimaryKey(Producto record);
}