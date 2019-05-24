package com.zhf.shopping.entity;

import java.io.Serializable;
import java.util.Date;

public class Items implements Serializable {
    /**
     * id
     */
    private Integer itemId;

    /**
     * itemName
     */
    private String itemName;

    /**
     * detail
     */
    private String detail;

    /**
     * picture
     */
    private String picture;

    /**
     * createTine
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Items{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", detail='" + detail + '\'' +
                ", picture='" + picture + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}