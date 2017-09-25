package com.gmt.comercial.dao;

import com.gmt.comercial.model.Material;
import com.gmt.comercial.model.MaterialExample;
import java.util.List;
import org.apache.ibatis.session.RowBounds;

public interface MaterialMapper {
    int deleteByPrimaryKey(Integer idMaterial);

    int insert(Material record);

    int insertSelective(Material record);

    List<Material> selectByExampleWithRowbounds(MaterialExample example, RowBounds rowBounds);

    List<Material> selectByExample(MaterialExample example);

    Material selectByPrimaryKey(Integer idMaterial);

    int updateByPrimaryKeySelective(Material record);

    int updateByPrimaryKey(Material record);
}