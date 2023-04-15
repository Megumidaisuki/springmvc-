package com.megumi.resolver;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Component
public class myHandleExceptionResolver implements HandlerExceptionResolver {
    //所有controller包下产生异常时都会调用该方法
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {

        //将异常信息以一种更友好的方式表现出来
        String msg = e.getMessage();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg",msg);

        //跳转到error.jsp页面
        modelAndView.setViewName("/WEB-INF/page/error.jsp");

        return modelAndView;
    }
}
