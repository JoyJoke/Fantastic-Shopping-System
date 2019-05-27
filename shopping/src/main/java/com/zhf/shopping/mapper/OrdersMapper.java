package com.zhf.shopping.mapper;

import com.zhf.shopping.entity.Orders;

public interface OrdersMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);

    Orders findUserByOrderId(Integer orderId);

    Orders findOrderDetailsByOrderId(Integer orderId);
}