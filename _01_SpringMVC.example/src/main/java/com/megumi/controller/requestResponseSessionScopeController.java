package com.megumi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class requestResponseSessionScopeController {

    //通过springmvc获取cookie，请求头以及requestScope
    @GetMapping("/requestTest")
    public String requestTest(Model model,@CookieValue("JSESSIONID") String sessionId ,@RequestHeader("device-type") String deviceType){
        model.addAttribute("name","megumi");
        model.addAttribute("title","红魔族最强的天才魔法师");
        System.out.println(deviceType);
        System.out.println(sessionId);
        return "test";
    }


    //使用modelAndView获取数据以及页面跳转
    @GetMapping("/modelAndView")
    public ModelAndView modelAndView(ModelAndView modelAndView){
        //赋值
        modelAndView.addObject("name","megumi");
        modelAndView.addObject("title","红魔族最强的天才魔法师");
        //跳转
        modelAndView.setViewName("test");
        return modelAndView;
    }

    //使用注解的方式获取请求域当中的值
    @GetMapping("/getValueByAnnotation")
    public String getValueByAnnotation(@RequestAttribute("name") String s){
        System.out.println(s);
        return "test";
    }

}
