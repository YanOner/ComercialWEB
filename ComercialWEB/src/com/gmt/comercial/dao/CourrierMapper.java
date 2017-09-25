package com.gmt.comercial.dao;

import com.gmt.comercial.model.Courrier;
import com.gmt.comercial.model.CourrierExample;
import java.util.List;
import org.apache.ibatis.session.RowBounds;

public interface CourrierMapper {
    int deleteByPrimaryKey(Integer idCourrier);

    int insert(Courrier record);

    int insertSelective(Courrier record);

    List<Courrier> selectByExampleWithRowbounds(CourrierExample example, RowBounds rowBounds);

    List<Courrier> selectByExample(CourrierExample example);

    Courrier selectByPrimaryKey(Integer idCourrier);

    int updateByPrimaryKeySelective(Courrier record);

    int updateByPrimaryKey(Courrier record);
}