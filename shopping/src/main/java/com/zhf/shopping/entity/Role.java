package com.zhf.shopping.entity;

import org.springframework.security.core.GrantedAuthority;

public class Role implements GrantedAuthority {
    private Integer roleId;
    private String name;

    public Integer getId() {
        return roleId;
    }

    public void setId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAuthority() {
        return name;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", name='" + name + '\'' +
                '}';
    }
}
