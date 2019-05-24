package com.zhf.shopping.mapper;

import com.zhf.shopping.entity.Orders;
import com.zhf.shopping.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper<findOrderById> {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<Orders> findOrdersByUserId(Integer userId);

    User findItemsByUserId(Integer userId);
}