package com.flying.mcdao.mapper;

import com.flyingwave.mccommon.entity.OrderInfo;

public interface OrderInfoMapper {

    OrderInfo selectOrderInfoById(String orderNo);

}
