package com.scot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = {"com.scot.mapper"})
@SpringBootApplication
public class ScotApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScotApplication.class, args);
    }

}
