package com.mgp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 注意设置数据库的主键起始值和步长，分片数量一旦设置，不能改变
 */
@SpringBootApplication
@MapperScan(basePackages = "com.mgp.*.dao")
public class ShardingJDBCAplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingJDBCAplication.class);
    }

}
