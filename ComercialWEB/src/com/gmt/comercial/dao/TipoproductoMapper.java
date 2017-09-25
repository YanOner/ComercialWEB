package com.gmt.comercial.dao;

import com.gmt.comercial.model.Tipoproducto;
import com.gmt.comercial.model.TipoproductoExample;
import java.util.List;
import org.apache.ibatis.session.RowBounds;

public interface TipoproductoMapper {
    int deleteByPrimaryKey(Integer idTipoProducto);

    int insert(Tipoproducto record);

    int insertSelective(Tipoproducto record);

    List<Tipoproducto> selectByExampleWithRowbounds(TipoproductoExample example, RowBounds rowBounds);

    List<Tipoproducto> selectByExample(TipoproductoExample example);

    Tipoproducto selectByPrimaryKey(Integer idTipoProducto);

    int updateByPrimaryKeySelective(Tipoproducto record);

    int updateByPrimaryKey(Tipoproducto record);
}