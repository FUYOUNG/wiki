package com.my.wiki.config;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

import org.slf4j.Logger;
@ComponentScan("com.my")
@SpringBootApplication
public class WikiApplication {
    private static final Logger LOG=LoggerFactory.getLogger(WikiApplication.class);
    public static void main(String[] args) {

        SpringApplication app= new SpringApplication(WikiApplication.class);
        Environment env=app.run(args).getEnvironment();
        LOG.info("启动成功");
        LOG.info("地址:\thttp://127.0.0.1:8080");
    }

}