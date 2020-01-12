package com.mgp.controller;


import ch.qos.logback.core.net.SyslogOutputStream;
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
@Api("login interface")
@RequestMapping("/login")
public class LoginController {


    /**
     * paramType：表示参数放在哪个地方
         header-->请求参数的获取：@RequestHeader(代码中接收注解)
         query-->请求参数的获取：@RequestParam(代码中接收注解)
         path（用于restful接口）-->请求参数的获取：@PathVariable(代码中接收注解)
         body-->请求参数的获取：@RequestBody(代码中接收注解)
         form（不常用）
     * @param username
     * @param password
     * @return
     */
    @ApiOperation(value = "用户登录", notes = "登陆模块")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "username", value = "名字", paramType = "query", required = true, dataType = "String"),
        @ApiImplicitParam(name = "password", value = "密码", paramType = "query", required = true, dataType = "String")
    })
    @RequestMapping(value = "/loginInfo", method = RequestMethod.POST)
    public ReturnInfo loginInfo(@RequestParam(required = true) String username, @RequestParam(required = true) String password){
        System.out.println(username+ "    " + password);
        return ReturnInfo.ok();
    }

}
