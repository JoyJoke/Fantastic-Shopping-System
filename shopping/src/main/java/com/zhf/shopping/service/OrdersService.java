package com.zhf.shopping.service;

import com.zhf.shopping.entity.Orders;
import com.zhf.shopping.mapper.OrdersMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrdersService {

    @Resource
    private OrdersMapper ordersMapper;


    public int deleteByPrimaryKey(Integer id) {
        return ordersMapper.deleteByPrimaryKey(id);
    }


    public int insert(Orders record) {
        return ordersMapper.insert(record);
    }


    public int insertSelective(Orders record) {
        return ordersMapper.insertSelective(record);
    }


    public Orders selectByPrimaryKey(Integer id) {
        return ordersMapper.selectByPrimaryKey(id);
    }


    public int updateByPrimaryKeySelective(Orders record) {
        return ordersMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Orders record) {
        return ordersMapper.updateByPrimaryKey(record);
    }

}
