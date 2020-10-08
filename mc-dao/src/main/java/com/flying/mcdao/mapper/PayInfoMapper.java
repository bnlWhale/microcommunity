package com.flying.mcdao.mapper;

import com.flyingwave.mccommon.entity.PayInfo;

public interface PayInfoMapper {

    PayInfo selectPayInfoByOrderNo(String orderNo);

}
