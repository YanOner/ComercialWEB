package com.gmt.comercial.dao;

import com.gmt.comercial.model.Fomapago;
import com.gmt.comercial.model.FomapagoExample;
import java.util.List;
import org.apache.ibatis.session.RowBounds;

public interface FomapagoMapper {
    int deleteByPrimaryKey(Integer idFomaPago);

    int insert(Fomapago record);

    int insertSelective(Fomapago record);

    List<Fomapago> selectByExampleWithRowbounds(FomapagoExample example, RowBounds rowBounds);

    List<Fomapago> selectByExample(FomapagoExample example);

    Fomapago selectByPrimaryKey(Integer idFomaPago);

    int updateByPrimaryKeySelective(Fomapago record);

    int updateByPrimaryKey(Fomapago record);
}