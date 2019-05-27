package com.zhf.shopping.service;

import com.zhf.shopping.entity.User;
import com.zhf.shopping.mapper.UserMapper;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
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

    //    public PageInfo<User> findOrdersByUserId(Integer userId,int page, int pageSize) {
//        PageHelper.startPage(page, pageSize);
//        return new PageInfo<>(userMapper.findOrdersByUserId(userId));
//    }
    public User findOrdersByUserId(Integer userId) {
        return userMapper.findOrdersByUserId(userId);
    }

    public User findItemsByUserId(Integer userId) {
        return userMapper.findItemsByUserId(userId);
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return userMapper.selectByUsername(s);
    }
}

