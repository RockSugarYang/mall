package com.yzb.mall.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public abstract class PageQuery extends ReqDTO {

    private int pageIndex = 1;
    private int pageSize = 10;
    private List<OrderDesc> orderDescs;

    public void addOrderDesc(OrderDesc orderDesc) {
        if (null == orderDescs) {
            orderDescs = new ArrayList<>();
        }
        orderDescs.add(orderDesc);
    }

    public int getOffset() {
        return pageIndex > 0 ? (pageIndex - 1) * pageSize : 0;
    }
}
