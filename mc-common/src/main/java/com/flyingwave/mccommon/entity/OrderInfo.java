package com.flyingwave.mccommon.entity;

import java.util.Date;

import lombok.Data;


@Data
public class OrderInfo {

    private String orderNo;

    private String userName;

    private Date createDt;

    private String productNo;

    private Integer productCount;

}
