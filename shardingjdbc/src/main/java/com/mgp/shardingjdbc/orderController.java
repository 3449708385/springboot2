package com.mgp.shardingjdbc;

import com.mgp.bean.OrderShardingJDBC;
import com.mgp.shardingjdbc.service.OrderShardingJDBCService;
import com.mgp.util.ReturnInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("order api")
@RequestMapping("/order")
public class orderController {

    @Autowired
    private OrderShardingJDBCService orderShardingJDBCService;

    @ApiOperation(value = "order", notes = "order模块")
    @RequestMapping(value = "/addOrder", method = RequestMethod.POST)
    public ReturnInfo addOrder(){

        for(int i=0;i<100;i++){

            OrderShardingJDBC orderShardingJDBC = new OrderShardingJDBC();
            orderShardingJDBC.setOrderId(i);
            orderShardingJDBCService.addOrder(orderShardingJDBC);
        }

        return ReturnInfo.ok();

    }

}
