package com.yzb.mall.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrderDesc implements Serializable {

    private String col;
    private boolean asc = true;
}
