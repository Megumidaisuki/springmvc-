package com.megumi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class loginController {
    @RequestMapping("/login")
    public String login(String username, String password, HttpSession session){
        session.setAttribute("username",username);
        return "/WEB-INF/page/sucess.jsp";
    }

}
