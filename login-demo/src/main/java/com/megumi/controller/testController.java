package com.megumi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testController {
    @GetMapping("/test")
    public String test(){
        System.out.println("test");
        return "/WEB-INF/page/sucess.jsp";
    }
}
