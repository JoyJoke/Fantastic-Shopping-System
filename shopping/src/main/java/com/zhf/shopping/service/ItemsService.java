package com.zhf.shopping.service;

import com.zhf.shopping.entity.Items;
import com.zhf.shopping.mapper.ItemsMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ItemsService {

    @Resource
    private ItemsMapper itemsMapper;


    public int deleteByPrimaryKey(Integer itemId) {
        return itemsMapper.deleteByPrimaryKey(itemId);
    }


    public int insert(Items record) {
        return itemsMapper.insert(record);
    }


    public int insertSelective(Items record) {
        return itemsMapper.insertSelective(record);
    }


    public Items selectByPrimaryKey(Integer itemId) {
        return itemsMapper.selectByPrimaryKey(itemId);
    }


    public int updateByPrimaryKeySelective(Items record) {
        return itemsMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Items record) {
        return itemsMapper.updateByPrimaryKey(record);
    }

}


