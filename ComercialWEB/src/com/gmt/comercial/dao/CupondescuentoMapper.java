package com.gmt.comercial.dao;

import com.gmt.comercial.model.Cupondescuento;
import com.gmt.comercial.model.CupondescuentoExample;
import java.util.List;
import org.apache.ibatis.session.RowBounds;

public interface CupondescuentoMapper {
    int deleteByPrimaryKey(Integer idCuponDescuento);

    int insert(Cupondescuento record);

    int insertSelective(Cupondescuento record);

    List<Cupondescuento> selectByExampleWithRowbounds(CupondescuentoExample example, RowBounds rowBounds);

    List<Cupondescuento> selectByExample(CupondescuentoExample example);

    Cupondescuento selectByPrimaryKey(Integer idCuponDescuento);

    int updateByPrimaryKeySelective(Cupondescuento record);

    int updateByPrimaryKey(Cupondescuento record);
}