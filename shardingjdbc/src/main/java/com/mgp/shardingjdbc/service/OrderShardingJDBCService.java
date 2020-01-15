package com.mgp.shardingjdbc.service;

import com.mgp.bean.OrderShardingJDBC;

public interface OrderShardingJDBCService {

    int addOrder(OrderShardingJDBC orderShardingJDBC);
}
