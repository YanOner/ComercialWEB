package com.gmt.comercial.dao;

import com.gmt.comercial.model.Bancos;
import com.gmt.comercial.model.BancosExample;
import java.util.List;
import org.apache.ibatis.session.RowBounds;

public interface BancosMapper {
    int deleteByPrimaryKey(Integer idBancos);

    int insert(Bancos record);

    int insertSelective(Bancos record);

    List<Bancos> selectByExampleWithRowbounds(BancosExample example, RowBounds rowBounds);

    List<Bancos> selectByExample(BancosExample example);

    Bancos selectByPrimaryKey(Integer idBancos);

    int updateByPrimaryKeySelective(Bancos record);

    int updateByPrimaryKey(Bancos record);
}