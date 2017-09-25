package com.gmt.comercial.dao;

import com.gmt.comercial.model.Direccion;
import com.gmt.comercial.model.DireccionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DireccionMapper {
    int deleteByPrimaryKey(@Param("idDireccion") Integer idDireccion, @Param("idCliente") Integer idCliente);

    int insert(Direccion record);

    int insertSelective(Direccion record);

    List<Direccion> selectByExampleWithRowbounds(DireccionExample example, RowBounds rowBounds);

    List<Direccion> selectByExample(DireccionExample example);

    Direccion selectByPrimaryKey(@Param("idDireccion") Integer idDireccion, @Param("idCliente") Integer idCliente);

    int updateByPrimaryKeySelective(Direccion record);

    int updateByPrimaryKey(Direccion record);
}