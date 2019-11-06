package com.zhf.shopping.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Orders implements Serializable {
    /**
     * orderId
     */
    private Integer orderId;

//    /**
//     * userId
//     */
//    private Integer userId;

    /**
     * number
     */
    private String number;

    /**
     * createTime
     */
    private Date createTime;

    private User user;

    private List<OrderDetail> orderdetails;


    public List<OrderDetail> getOrderdetails() {
        return orderdetails;
    }

    public void setOrderdetails(List<OrderDetail> orderdetails) {
        this.orderdetails = orderdetails;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private static final long serialVersionUID = 1L;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

//    public Integer getUserId() {
//        return userId;
//    }
//
//    public void setUserId(Integer userId) {
//        this.userId = userId;
//    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderId=" + orderId +
//                ", userId=" + userId +
                ", number='" + number + '\'' +
                ", createTime=" + createTime +
                ", user=" + user +
                ", orderdetails=" + orderdetails +
                '}';
    }
}