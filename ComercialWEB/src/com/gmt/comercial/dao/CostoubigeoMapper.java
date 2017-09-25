package com.gmt.comercial.dao;

import com.gmt.comercial.model.Costoubigeo;
import com.gmt.comercial.model.CostoubigeoExample;
import java.util.List;
import org.apache.ibatis.session.RowBounds;

public interface CostoubigeoMapper {
    int deleteByPrimaryKey(String codUbigeoCosto);

    int insert(Costoubigeo record);

    int insertSelective(Costoubigeo record);

    List<Costoubigeo> selectByExampleWithRowbounds(CostoubigeoExample example, RowBounds rowBounds);

    List<Costoubigeo> selectByExample(CostoubigeoExample example);

    Costoubigeo selectByPrimaryKey(String codUbigeoCosto);

    int updateByPrimaryKeySelective(Costoubigeo record);

    int updateByPrimaryKey(Costoubigeo record);
}