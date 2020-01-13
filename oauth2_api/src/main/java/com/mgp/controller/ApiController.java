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
@Api("api interface")
@RequestMapping("/api")
public class ApiController {

    /**
     * post请求：http://127.0.0.1:8006/api/loginInfo?clientName=m1&clientInfo=m2，header：[{"key":"Authorization","value":"bearer 70050dcf-7156-43fc-9d34-6697283bb386","description":"","type":"text","enabled":true}]，只需要配置一下，就会自动验证
     * paramType：表示参数放在哪个地方
         header-->请求参数的获取：@RequestHeader(代码中接收注解)
         query-->请求参数的获取：@RequestParam(代码中接收注解)
         path（用于restful接口）-->请求参数的获取：@PathVariable(代码中接收注解)
         body-->请求参数的获取：@RequestBody(代码中接收注解)
         form（不常用）
     * @param clientName
     * @param clientInfo
     * @return
     */
    @ApiOperation(value = "公共api", notes = "公共api模块")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "clientName", value = "clientName", paramType = "query", required = true, dataType = "String"),
            @ApiImplicitParam(name = "clientInfo", value = "clientInfo", paramType = "query", required = true, dataType = "String")
    })
    @RequestMapping(value = "/loginInfo", method = RequestMethod.POST)
    public ReturnInfo loginInfo(@RequestParam(required = true) String clientName, @RequestParam(required = true) String clientInfo){
        System.out.println(clientName+ "    " + clientInfo);
        return ReturnInfo.ok();
    }
}
