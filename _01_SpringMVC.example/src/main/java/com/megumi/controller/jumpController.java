package com.megumi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class jumpController {
    @GetMapping("/testJumpToJsp")
    public String testJumpToJsp(){
        System.out.println("test");
        return "test";
    }
    @GetMapping("/testJumpToSucess")
    public String testJumpToSucess(){
        System.out.println("sucess");
        return "forward:/success.jsp";
    }
}
