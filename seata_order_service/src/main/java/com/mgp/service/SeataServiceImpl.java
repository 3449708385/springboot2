package com.mgp.service;

import com.mgp.bean.Order;
import com.mgp.dao.OrderMapper;
import com.mgp.util.ReturnInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SeataServiceImpl implements SeataServiceApi {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public ReturnInfo testSeata() {
        System.out.println("addOrder");
        Order order = new Order();
        order.setOrderid(1L);
        orderMapper.insert(order);
        throw new RuntimeException("exception");
        //return ReturnInfo.ok();
    }
}
