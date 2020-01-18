package com.mgp;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * dubbo拥有：服务注册与发现，本地负载均衡，服务远程调用，超时熔断这些功能
 * hystrix：有超时熔断，资源访问上限熔断，请求结果算法熔断，被调用方熔断
 * feign：服务降级调用方熔断
 */
@SpringBootApplication
@EnableDubbo
public class SmtApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmtApplication.class);
    }

}
