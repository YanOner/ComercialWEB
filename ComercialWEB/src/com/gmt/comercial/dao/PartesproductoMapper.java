package com.gmt.comercial.dao;

import com.gmt.comercial.model.Partesproducto;
import com.gmt.comercial.model.PartesproductoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PartesproductoMapper {
    int deleteByPrimaryKey(@Param("idComponente") Integer idComponente, @Param("idProducto") Integer idProducto);

    int insert(Partesproducto record);

    int insertSelective(Partesproducto record);

    List<Partesproducto> selectByExampleWithRowbounds(PartesproductoExample example, RowBounds rowBounds);

    List<Partesproducto> selectByExample(PartesproductoExample example);

    Partesproducto selectByPrimaryKey(@Param("idComponente") Integer idComponente, @Param("idProducto") Integer idProducto);

    int updateByPrimaryKeySelective(Partesproducto record);

    int updateByPrimaryKey(Partesproducto record);
}