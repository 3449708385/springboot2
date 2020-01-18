package com.mgp.smt.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mgp.dubboapi.service.OrderService;
import com.mgp.util.ReturnInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("dubbo smt api")
@RequestMapping("/smt")
public class SmtController {

    @Reference
    private OrderService orderService;


    @ApiOperation(value = "smt", notes = "smt模块")
    @RequestMapping(value = "/addSmt", method = RequestMethod.POST)
    public ReturnInfo addSmt(){
        System.out.println("smt->getOrderInfo");
        orderService.getOrderInfo(1L);
        return ReturnInfo.ok();
    }


}
