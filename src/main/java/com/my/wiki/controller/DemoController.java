package com.my.wiki.controller;

import com.my.wiki.domain.Demo;
import com.my.wiki.domain.Test;
import com.my.wiki.service.DemoService;
import com.my.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Resource
    private DemoService demoService;

    @GetMapping("/list1")
    public List<Demo> list(){
        return demoService.list();
    }
}
