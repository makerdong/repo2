package com.itheima.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class quick2 {
    @RequestMapping("quick2")
    public String quick(){
        return "springboot";
    }
}
