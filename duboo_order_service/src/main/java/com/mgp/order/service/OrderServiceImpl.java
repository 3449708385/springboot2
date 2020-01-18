package com.mgp.order.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.mgp.dubboapi.service.OrderService;
import com.mgp.util.ReturnInfo;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public ReturnInfo getOrderInfo(Long orderId) {
        System.out.println("smt 调用 order");
        return ReturnInfo.ok();
    }
}
