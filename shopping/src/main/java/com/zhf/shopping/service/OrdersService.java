package com.zhf.shopping.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhf.shopping.entity.OrderDetail;
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


    public Orders findUserByOrderId(Integer orderId) {
        return ordersMapper.findUserByOrderId(orderId);
    }

    public PageInfo<OrderDetail> findOrderDetailsByOrderId(Integer orderId, int page, int pageSize) {
        PageHelper.startPage(page, pageSize);
        return new PageInfo<OrderDetail>(ordersMapper.findOrderDetailsByOrderId(orderId).getOrderdetails());
    }
}
