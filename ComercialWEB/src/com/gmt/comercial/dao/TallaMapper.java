package com.gmt.comercial.dao;

import com.gmt.comercial.model.Talla;
import com.gmt.comercial.model.TallaExample;
import java.util.List;
import org.apache.ibatis.session.RowBounds;

public interface TallaMapper {
    int deleteByPrimaryKey(Integer nroTalla);

    int insert(Talla record);

    int insertSelective(Talla record);

    List<Talla> selectByExampleWithRowbounds(TallaExample example, RowBounds rowBounds);

    List<Talla> selectByExample(TallaExample example);

    Talla selectByPrimaryKey(Integer nroTalla);

    int updateByPrimaryKeySelective(Talla record);

    int updateByPrimaryKey(Talla record);
}