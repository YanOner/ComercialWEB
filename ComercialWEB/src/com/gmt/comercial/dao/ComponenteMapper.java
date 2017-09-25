package com.gmt.comercial.dao;

import com.gmt.comercial.model.Componente;
import com.gmt.comercial.model.ComponenteExample;
import java.util.List;
import org.apache.ibatis.session.RowBounds;

public interface ComponenteMapper {
    int deleteByPrimaryKey(Integer idComponente);

    int insert(Componente record);

    int insertSelective(Componente record);

    List<Componente> selectByExampleWithRowbounds(ComponenteExample example, RowBounds rowBounds);

    List<Componente> selectByExample(ComponenteExample example);

    Componente selectByPrimaryKey(Integer idComponente);

    int updateByPrimaryKeySelective(Componente record);

    int updateByPrimaryKey(Componente record);
}