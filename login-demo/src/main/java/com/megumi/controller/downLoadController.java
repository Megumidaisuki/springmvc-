package com.megumi.controller;

import com.megumi.utils.DownLoadUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class downLoadController {
    @RequestMapping("/download")
    public void download(HttpServletRequest request, HttpServletResponse response) throws Exception {
        DownLoadUtils.downloadFile("/WEB-INF/text/那些当年.txt",request.getServletContext(),response);

    }

}
