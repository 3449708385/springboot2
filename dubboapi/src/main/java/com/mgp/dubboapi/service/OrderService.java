package com.mgp.dubboapi.service;

import com.mgp.util.ReturnInfo;

public interface OrderService {

    ReturnInfo getOrderInfo(Long orderId);

}
