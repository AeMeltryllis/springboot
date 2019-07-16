package com.how2java.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;

//@RestController
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model m) {
        m.addAttribute("name","zhw");

        return "hello";
    }
//    public String hello(Model m) throws Exception {
//        /**
//         * 此方法测试异常转跳
//         */
//        m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
//        if(true){
//            throw new Exception("zhe has some exception");
//        }
//        return "hello";
//    }

}