package com.gmt.comercial.dao;

import com.gmt.comercial.model.Documentopago;
import com.gmt.comercial.model.DocumentopagoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DocumentopagoMapper {
    int deleteByPrimaryKey(@Param("nroSerie") String nroSerie, @Param("codDocumento") String codDocumento);

    int insert(Documentopago record);

    int insertSelective(Documentopago record);

    List<Documentopago> selectByExampleWithRowbounds(DocumentopagoExample example, RowBounds rowBounds);

    List<Documentopago> selectByExample(DocumentopagoExample example);

    Documentopago selectByPrimaryKey(@Param("nroSerie") String nroSerie, @Param("codDocumento") String codDocumento);

    int updateByPrimaryKeySelective(Documentopago record);

    int updateByPrimaryKey(Documentopago record);
}