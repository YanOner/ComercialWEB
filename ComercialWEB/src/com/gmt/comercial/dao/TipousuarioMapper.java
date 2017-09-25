package com.gmt.comercial.dao;

import com.gmt.comercial.model.Tipousuario;
import com.gmt.comercial.model.TipousuarioExample;
import java.util.List;
import org.apache.ibatis.session.RowBounds;

public interface TipousuarioMapper {
    int deleteByPrimaryKey(Integer idTipoUsuario);

    int insert(Tipousuario record);

    int insertSelective(Tipousuario record);

    List<Tipousuario> selectByExampleWithRowbounds(TipousuarioExample example, RowBounds rowBounds);

    List<Tipousuario> selectByExample(TipousuarioExample example);

    Tipousuario selectByPrimaryKey(Integer idTipoUsuario);

    int updateByPrimaryKeySelective(Tipousuario record);

    int updateByPrimaryKey(Tipousuario record);
}