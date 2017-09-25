package com.gmt.comercial.dao;

import com.gmt.comercial.model.Cliente;
import com.gmt.comercial.model.ClienteExample;
import java.util.List;
import org.apache.ibatis.session.RowBounds;

public interface ClienteMapper {
    int deleteByPrimaryKey(Integer idCliente);

    int insert(Cliente record);

    int insertSelective(Cliente record);

    List<Cliente> selectByExampleWithRowbounds(ClienteExample example, RowBounds rowBounds);

    List<Cliente> selectByExample(ClienteExample example);

    Cliente selectByPrimaryKey(Integer idCliente);

    int updateByPrimaryKeySelective(Cliente record);

    int updateByPrimaryKey(Cliente record);
}