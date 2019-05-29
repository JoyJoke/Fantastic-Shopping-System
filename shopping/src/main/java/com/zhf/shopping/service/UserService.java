package com.zhf.shopping.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhf.shopping.entity.Items;
import com.zhf.shopping.entity.Orders;
import com.zhf.shopping.entity.User;
import com.zhf.shopping.mapper.UserMapper;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
@CacheConfig(cacheNames = "userService", keyGenerator = "mykeygenerator")
public class UserService implements UserDetailsService {

    @Resource
    private UserMapper userMapper;


    public int deleteByPrimaryKey(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }


    public int insert(User record) {
        return userMapper.insert(record);
    }


    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }


    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }


    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }

    @Cacheable(cacheNames = "orders", key = "#root.methodName+'['+#userId+']'")
    public PageInfo<Orders> findOrdersByUserId(Integer userId, int page, int pageSize) {
        PageHelper.startPage(page, pageSize);
        return new PageInfo<Orders>(userMapper.findOrdersByUserId(userId).getOrders());
    }

    @Cacheable(cacheNames = "items", key = "#root.methodName+'['+#a0+']'")
    public PageInfo<Items> findItemsByUserId(Integer userId, int page, int pageSize) {
        PageHelper.startPage(page, pageSize);
        List<Items> items = new CopyOnWriteArrayList<>();
        userMapper.findItemsByUserId(userId).getOrders().parallelStream().forEach(
                orders -> orders.getOrderdetails().parallelStream().forEach(orderDetail -> items.add(orderDetail.getItems())
                ));
        return new PageInfo<Items>(items);
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return userMapper.selectByUsername(s);
    }
}

