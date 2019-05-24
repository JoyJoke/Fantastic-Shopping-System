package com.zhf.shopping.service;

import com.zhf.shopping.entity.OrderDetail;
import com.zhf.shopping.mapper.OrderDetailMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderDetailService {

    @Resource
    private OrderDetailMapper orderDetailMapper;


    public int deleteByPrimaryKey(Integer detailId) {
        return orderDetailMapper.deleteByPrimaryKey(detailId);
    }


    public int insert(OrderDetail record) {
        return orderDetailMapper.insert(record);
    }


    public int insertSelective(OrderDetail record) {
        return orderDetailMapper.insertSelective(record);
    }


    public OrderDetail selectByPrimaryKey(Integer detailId) {
        return orderDetailMapper.selectByPrimaryKey(detailId);
    }


    public int updateByPrimaryKeySelective(OrderDetail record) {
        return orderDetailMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(OrderDetail record) {
        return orderDetailMapper.updateByPrimaryKey(record);
    }

}
