package com.mgp.shardingjdbc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.mgp.*.dao")
public class ShardingJDBCAplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingJDBCAplication.class);
    }

}
