package com.megumi.controller;

import com.megumi.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/User")
public class userController {
    //获取restful风格的路径参数
    @GetMapping(value = "/findUserById/{id}/{name}")
    public String findUserById(@PathVariable("id") Integer id, @PathVariable("name") String name){
        System.out.println("findUserById");
        return "/success.jsp";
    }

    //获取请求体中的json数据
    @PostMapping(value = "/insertUser")
    public String insertUser(@RequestBody User user){
        System.out.println("insertUser");
        System.out.println(user);
        return "/success.jsp";
    }
    //获取请求体中的json数据
    @PostMapping(value = "/insertListUser")
    public String insertListUser(@RequestBody List<User> list){
        System.out.println("insertListUser");
        System.out.println(list);
        return "/success.jsp";
    }

    //获取queryString格式的参数
    @PostMapping(value = "/queryString")
    public String queryString(User user){
        System.out.println("queryString");
        System.out.println(user);
        return "/success.jsp";

    }
}
