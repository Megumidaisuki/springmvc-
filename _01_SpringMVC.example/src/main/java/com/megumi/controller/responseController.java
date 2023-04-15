package com.megumi.controller;

import com.megumi.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("/Response")
public class responseController {
    @GetMapping("/testResponse/{id}")
    @ResponseBody
    public User testResponse(@PathVariable Integer id){
        System.out.println("testResponse");
        User user = new User(id, null, null, null);
        return user;
    }
}
