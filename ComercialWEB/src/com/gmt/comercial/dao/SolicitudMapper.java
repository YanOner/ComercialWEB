package com.gmt.comercial.dao;

import com.gmt.comercial.model.Solicitud;
import com.gmt.comercial.model.SolicitudExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SolicitudMapper {
    int deleteByPrimaryKey(@Param("idSolicitud") Integer idSolicitud, @Param("idCliente") Integer idCliente, @Param("codUsuario") String codUsuario);

    int insert(Solicitud record);

    int insertSelective(Solicitud record);

    List<Solicitud> selectByExampleWithRowbounds(SolicitudExample example, RowBounds rowBounds);

    List<Solicitud> selectByExample(SolicitudExample example);

    Solicitud selectByPrimaryKey(@Param("idSolicitud") Integer idSolicitud, @Param("idCliente") Integer idCliente, @Param("codUsuario") String codUsuario);

    int updateByPrimaryKeySelective(Solicitud record);

    int updateByPrimaryKey(Solicitud record);
}