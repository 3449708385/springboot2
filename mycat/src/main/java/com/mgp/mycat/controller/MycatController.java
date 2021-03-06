package com.mgp.mycat.controller;

import com.mgp.bean.MycatTest;
import com.mgp.bean.SmtShardingJDBC;
import com.mgp.mycat.service.MycatSmtService;
import com.mgp.mycat.service.MycatTestService;
import com.mgp.util.ReturnInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mycat")
@Api("mycat api")
public class MycatController {

    @Autowired
    private MycatTestService mycatTestService;

    @Autowired
    private MycatSmtService mycatSmtService;

    @ApiOperation(value = "mycat", notes = "mycat模块")
    @RequestMapping(value = "/addTest", method = RequestMethod.POST)
    public ReturnInfo addTest(){
        MycatTest mycatTest = new MycatTest();
        mycatTest.setDataid(1);
        mycatTestService.addTest(mycatTest);
        return ReturnInfo.ok();
    }

    @ApiOperation(value = "mycat", notes = "mycat模块")
    @RequestMapping(value = "/selectTest", method = RequestMethod.POST)
    public ReturnInfo selectTest(){
        return ReturnInfo.ok(mycatTestService.selectTest(1L));
    }



    @ApiOperation(value = "smt", notes = "smt模块")
    @RequestMapping(value = "/addSmt", method = RequestMethod.POST)
    public ReturnInfo addSmt(){
        return ReturnInfo.ok(mycatSmtService.addSmt());
    }

    @ApiOperation(value = "smt", notes = "smt模块")
    @RequestMapping(value = "/getMycatSmt", method = RequestMethod.POST)
    public ReturnInfo getMycatSmt(){
        return ReturnInfo.ok(mycatSmtService.getMycatSmt(1L));
    }

}
