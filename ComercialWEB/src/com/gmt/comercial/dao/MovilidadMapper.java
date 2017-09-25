package com.gmt.comercial.dao;

import com.gmt.comercial.model.Movilidad;
import com.gmt.comercial.model.MovilidadExample;
import java.util.List;
import org.apache.ibatis.session.RowBounds;

public interface MovilidadMapper {
    int deleteByPrimaryKey(Integer idMovilidad);

    int insert(Movilidad record);

    int insertSelective(Movilidad record);

    List<Movilidad> selectByExampleWithRowbounds(MovilidadExample example, RowBounds rowBounds);

    List<Movilidad> selectByExample(MovilidadExample example);

    Movilidad selectByPrimaryKey(Integer idMovilidad);

    int updateByPrimaryKeySelective(Movilidad record);

    int updateByPrimaryKey(Movilidad record);
}