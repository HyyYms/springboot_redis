package com.redis.jedis_test_pom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/first")
public class FirstController {
    @RequestMapping("view")
    public String view(HttpServletRequest request) {
        return "demoPage/firstPage";
    }
}
