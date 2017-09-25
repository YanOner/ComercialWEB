package com.gmt.comercial.dao;

import com.gmt.comercial.model.Disponibilidadmovilidad;
import com.gmt.comercial.model.DisponibilidadmovilidadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DisponibilidadmovilidadMapper {
    int deleteByPrimaryKey(@Param("idMovilidad") Integer idMovilidad, @Param("idOrdenDespacho") Integer idOrdenDespacho);

    int insert(Disponibilidadmovilidad record);

    int insertSelective(Disponibilidadmovilidad record);

    List<Disponibilidadmovilidad> selectByExampleWithRowbounds(DisponibilidadmovilidadExample example, RowBounds rowBounds);

    List<Disponibilidadmovilidad> selectByExample(DisponibilidadmovilidadExample example);

    Disponibilidadmovilidad selectByPrimaryKey(@Param("idMovilidad") Integer idMovilidad, @Param("idOrdenDespacho") Integer idOrdenDespacho);

    int updateByPrimaryKeySelective(Disponibilidadmovilidad record);

    int updateByPrimaryKey(Disponibilidadmovilidad record);
}