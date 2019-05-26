package com.zhf.shopping.service;

import com.zhf.shopping.entity.Role;
import com.zhf.shopping.mapper.RoleMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RoleService {

    @Resource
    private RoleMapper roleMapper;


    public int deleteByPrimaryKey(Integer roleId) {
        return roleMapper.deleteByPrimaryKey(roleId);
    }


    public int insert(Role record) {
        return roleMapper.insert(record);
    }


    public int insertSelective(Role record) {
        return roleMapper.insertSelective(record);
    }


    public Role selectByPrimaryKey(Integer roleId) {
        return roleMapper.selectByPrimaryKey(roleId);
    }


    public int updateByPrimaryKeySelective(Role record) {
        return roleMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Role record) {
        return roleMapper.updateByPrimaryKey(record);
    }

}

