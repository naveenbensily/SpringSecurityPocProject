package com.demo.springsecurity.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.demo")
@EnableAutoConfiguration
@SpringBootApplication
public class StandAloneWebApplication extends SpringBootServletInitializer {


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(StandAloneWebApplication.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(StandAloneWebApplication.class, args);
    }




}

