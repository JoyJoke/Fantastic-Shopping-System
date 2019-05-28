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

    private Double price;

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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", itemId=").append(itemId);
        sb.append(", itemName=").append(itemName);
        sb.append(", detail=").append(detail);
        sb.append(", price=").append(price);
        sb.append(", picture=").append(picture);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}