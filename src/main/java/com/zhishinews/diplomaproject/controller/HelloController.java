package com.zhishinews.diplomaproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {
    @RequestMapping("/zhishinews")
    public String hello(HttpServletRequest request, @RequestParam(value="description",required = false,defaultValue = "springboot-thymeleaf")String description) {
       request.setAttribute("description",description);
        return "first";
    }
}
