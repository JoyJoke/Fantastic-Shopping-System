package com.zhf.shopping.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class User implements Serializable {
    /**
     * userId
     */
    private Integer userId;

    /**
     * username
     */
    private String username;

    /**
     * sex
     */
    private String sex;

    /**
     * birthday
     */
    private Date birthday;

    private List<Orders> orders;


    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    private static final long serialVersionUID = 1L;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", orders=" + orders +
                '}';
    }
}