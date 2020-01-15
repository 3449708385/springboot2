package com.mgp.shardingjdbc.service;

import com.mgp.bean.OrderShardingJDBC;
import com.mgp.shardingjdbc.dao.OrderShardingJDBCMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderShardingJDBCServiceImpl implements OrderShardingJDBCService {


    @Autowired
    private OrderShardingJDBCMapper orderShardingJDBCMapper;

    @Override
    public int addOrder(OrderShardingJDBC orderShardingJDBC) {
        return orderShardingJDBCMapper.insert(orderShardingJDBC);
    }
}
