package com.zhf.shopping.mapper;

import com.zhf.shopping.entity.Role;
import com.zhf.shopping.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    User selectByUsername(String userName);

    List<Role> findRoleByUserId(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> findOrdersByUserId(Integer userId);

    List<User> findItemsByUserId(Integer userId);
}