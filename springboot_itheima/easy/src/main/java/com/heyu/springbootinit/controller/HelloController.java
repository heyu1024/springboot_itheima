package com.heyu.springbootinit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shkstart
 * @date 2021-08-14 18:38
 */
@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String Hello(){
        return "hello springboot";
    }
}
