package com.lxzh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
@MapperScan("com.lxzh.mapper")
@SpringBootApplication
public class LxzhWebApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(LxzhWebApplication.class, args);
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(LxzhWebApplication.class);
    }

}
