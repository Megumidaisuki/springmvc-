package com.megumi.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller

public class converterController {
    @GetMapping(value = "testConverter")
    public String testConverter(@DateTimeFormat(pattern = "yyyy-MM-dd") Date birsday/*注意，此处应填的是想转化成的类型而不是获取参数的类型*/){
        System.out.println("testConverter");
        System.out.println(birsday);
        return "/success.jsp";
    }
}
