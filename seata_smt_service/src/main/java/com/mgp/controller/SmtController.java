package com.mgp.controller;

import com.mgp.service.SmtService;
import com.mgp.util.ReturnInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("smt api")
@RequestMapping("/smt")
public class SmtController {

    @Autowired
    private SmtService smtService;

    @ApiOperation(value = "smt", notes = "smt模块")
    @RequestMapping(value = "/addSmt", method = RequestMethod.POST)
    public ReturnInfo addSmt(){
        smtService.addSmt();
        return ReturnInfo.ok();
    }

}
