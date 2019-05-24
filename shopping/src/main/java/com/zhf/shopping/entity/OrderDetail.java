package com.zhf.shopping.entity;

import java.io.Serializable;

public class OrderDetail implements Serializable {
    /**
     * id
     */
    private Integer detailId;

    /**
     * orderId
     */
    private Integer orderId;

    /**
     * itemId
     */
    private Integer itemId;

    /**
     * itemNum
     */
    private Integer itemNum;

    private Items items;

    public void setItems(Items items) {
        this.items = items;
    }

    private static final long serialVersionUID = 1L;

    public Integer getDetailId() {
        return detailId;
    }

    public void setDetailId(Integer detailId) {
        this.detailId = detailId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getItemNum() {
        return itemNum;
    }

    public void setItemNum(Integer itemNum) {
        this.itemNum = itemNum;
    }

    public Items getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "detailId=" + detailId +
                ", orderId=" + orderId +
                ", itemId=" + itemId +
                ", itemNum=" + itemNum +
                ", items=" + items +
                '}';
    }

}