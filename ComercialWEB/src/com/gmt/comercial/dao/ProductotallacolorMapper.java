package com.gmt.comercial.dao;

import com.gmt.comercial.model.Productotallacolor;
import com.gmt.comercial.model.ProductotallacolorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ProductotallacolorMapper {
    int deleteByPrimaryKey(@Param("idProducto") Integer idProducto, @Param("idColorProducto") Integer idColorProducto, @Param("nroTalla") Integer nroTalla);

    int insert(Productotallacolor record);

    int insertSelective(Productotallacolor record);

    List<Productotallacolor> selectByExampleWithRowbounds(ProductotallacolorExample example, RowBounds rowBounds);

    List<Productotallacolor> selectByExample(ProductotallacolorExample example);

    Productotallacolor selectByPrimaryKey(@Param("idProducto") Integer idProducto, @Param("idColorProducto") Integer idColorProducto, @Param("nroTalla") Integer nroTalla);

    int updateByPrimaryKeySelective(Productotallacolor record);

    int updateByPrimaryKey(Productotallacolor record);
}