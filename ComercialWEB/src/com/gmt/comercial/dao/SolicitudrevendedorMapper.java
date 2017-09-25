package com.gmt.comercial.dao;

import com.gmt.comercial.model.Solicitudrevendedor;
import com.gmt.comercial.model.SolicitudrevendedorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SolicitudrevendedorMapper {
    int deleteByPrimaryKey(@Param("idSolicitud") Integer idSolicitud, @Param("idCliente") Integer idCliente, @Param("codUsuario") String codUsuario);

    int insert(Solicitudrevendedor record);

    int insertSelective(Solicitudrevendedor record);

    List<Solicitudrevendedor> selectByExampleWithRowbounds(SolicitudrevendedorExample example, RowBounds rowBounds);

    List<Solicitudrevendedor> selectByExample(SolicitudrevendedorExample example);

    Solicitudrevendedor selectByPrimaryKey(@Param("idSolicitud") Integer idSolicitud, @Param("idCliente") Integer idCliente, @Param("codUsuario") String codUsuario);

    int updateByPrimaryKeySelective(Solicitudrevendedor record);

    int updateByPrimaryKey(Solicitudrevendedor record);
}