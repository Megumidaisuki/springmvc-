package com.megumi.controller;

import com.megumi.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/test")
public class testController {
    @RequestMapping("/hello")
    public String hello(String name){
        System.out.println("hello");
        System.out.println(name);
        return "/success.jsp";

    }
    @RequestMapping( value = "/testPath")
    public String testPath(){
        System.out.println("testPath");
        return "/success.jsp";
    }
//    指定请求方式
    @RequestMapping(value = "/testMethod" ,method = RequestMethod.POST)
    public String testMethod(){
        System.out.println("testMethod");
        return "/success.jsp";
    }
//    显然，上面的写法多少有些臃肿了，springmvc为我们提供了更简便的写法
//@PostMapping   等价于   @RequestMapping(method = RequestMethod.POST)
//@GetMapping    等价于   @RequestMapping(method = RequestMethod.GET)
//@PutMapping    等价于   @RequestMapping(method = RequestMethod.PUT)* 	@DeleteMapping    等价于   @RequestMapping(method = RequestMethod.DELETE)
@GetMapping(value = "/testParams",params = "!code")
    public String testParams(){
        System.out.println("testParams");
        return "/success.jsp";
    }
    //还可以指定请求头以及请求头里的内容
@GetMapping(value = "/testHeaders" ,headers = "deviceType=android")
    public String testHeaders(){
    System.out.println("testHeaders");
        return "/success.jsp";
    }
}

