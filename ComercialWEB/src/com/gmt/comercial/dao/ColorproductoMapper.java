package com.gmt.comercial.dao;

import com.gmt.comercial.model.Colorproducto;
import com.gmt.comercial.model.ColorproductoExample;
import java.util.List;
import org.apache.ibatis.session.RowBounds;

public interface ColorproductoMapper {
    int deleteByPrimaryKey(Integer idColorProducto);

    int insert(Colorproducto record);

    int insertSelective(Colorproducto record);

    List<Colorproducto> selectByExampleWithRowbounds(ColorproductoExample example, RowBounds rowBounds);

    List<Colorproducto> selectByExample(ColorproductoExample example);

    Colorproducto selectByPrimaryKey(Integer idColorProducto);

    int updateByPrimaryKeySelective(Colorproducto record);

    int updateByPrimaryKey(Colorproducto record);
}