package com.zhf.shopping.mapper;

import com.zhf.shopping.entity.Items;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ItemsMapper {
    int deleteByPrimaryKey(Integer itemId);

    int insert(Items record);

    int insertSelective(Items record);

    Items selectByPrimaryKey(Integer itemId);

    int updateByPrimaryKeySelective(Items record);

    int updateByPrimaryKey(Items record);
}