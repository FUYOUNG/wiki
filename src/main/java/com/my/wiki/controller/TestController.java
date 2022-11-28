package com.my.wiki.controller;

import com.my.wiki.service.TestService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.my.wiki.domain.Test;
import java.util.List;

@RestController
public class TestController {
    @Value("${test.hello}")
    private String testHello;

    @Resource
    private TestService testService;

    @RequestMapping("/hello")
    public String hello(){
        return "Hello world!"+testHello;
    }

    @GetMapping("/test/list")
    public List<Test> list(){
        return testService.list();
    }
}
