package com.gmt.comercial.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.gmt.comercial.model.Usuario;
import com.gmt.comercial.model.UsuarioExample;

public interface UsuarioMapper {
    int deleteByPrimaryKey(String codUsuario);

    int insert(Usuario record);

    int insertSelective(Usuario record);

    List<Usuario> selectByExampleWithRowbounds(UsuarioExample example, RowBounds rowBounds);

    List<Usuario> selectByExample(UsuarioExample example);

    Usuario selectByPrimaryKey(HashMap mapa);

    int updateByPrimaryKeySelective(Usuario record);

    int updateByPrimaryKey(Usuario record);
}