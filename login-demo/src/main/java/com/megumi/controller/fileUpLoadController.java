package com.megumi.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class fileUpLoadController {
    @RequestMapping("/upload")
    public String upload(MultipartFile uploadFile) throws IOException {
        uploadFile.transferTo(new File("test.sql"));
        return "/WEB-INF/page/sucess.jsp";
    }
}
