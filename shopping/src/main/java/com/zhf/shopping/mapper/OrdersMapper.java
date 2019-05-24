package com.zhf.shopping.mapper;

import com.zhf.shopping.entity.OrderDetail;
import com.zhf.shopping.entity.Orders;
import com.zhf.shopping.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrdersMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);

    User findUserByOrderId(Integer orderId);

    List<OrderDetail> findOrderDetailsByOrderId(Integer orderId);
}