package com.mgp.controller;

import com.mgp.util.ReturnInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("order api")
@RequestMapping("/order")
public class orderController {

    @ApiOperation(value = "order", notes = "订单模块")
    @RequestMapping(value = "/addOrder", method = RequestMethod.POST)
    public ReturnInfo addOrder(){

        return ReturnInfo.ok();
    }
}
