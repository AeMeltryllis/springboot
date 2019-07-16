//package com.how2java.springboot.exception;
//import javax.servlet.http.HttpServletRequest;
//
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.servlet.ModelAndView;
//
///**
// * 此类是测试springboot异常转跳
// *
// *
// */
//@ControllerAdvice
//public class GlobalExceptionHandler {
//    @ExceptionHandler(value = Exception.class)
//    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
//        ModelAndView mav = new ModelAndView();
//        mav.addObject("exception", e);
//        mav.addObject("url", req.getRequestURL());
//        mav.setViewName("errorPage");
//        return mav;
//    }
//}
