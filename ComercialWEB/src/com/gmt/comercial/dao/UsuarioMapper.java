package com.gmt.comercial.dao;

import com.gmt.comercial.model.Usuario;
import com.gmt.comercial.model.UsuarioExample;
import java.util.List;
import org.apache.ibatis.session.RowBounds;

public interface UsuarioMapper {
    int deleteByPrimaryKey(String codUsuario);

    int insert(Usuario record);

    int insertSelective(Usuario record);

    List<Usuario> selectByExampleWithRowbounds(UsuarioExample example, RowBounds rowBounds);

    List<Usuario> selectByExample(UsuarioExample example);

    Usuario selectByPrimaryKey(String codUsuario);

    int updateByPrimaryKeySelective(Usuario record);

    int updateByPrimaryKey(Usuario record);
}