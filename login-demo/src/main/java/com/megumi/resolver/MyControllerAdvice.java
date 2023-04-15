package com.megumi.resolver;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class MyControllerAdvice {
    @ExceptionHandler({RuntimeException.class, NullPointerException.class})
    public ModelAndView MyControllerAdvice(Exception exception){
        String msg = exception.getMessage();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg",msg);
        modelAndView.setViewName("/WEB-INF/page/error.jsp");

        return modelAndView;
    }
}
