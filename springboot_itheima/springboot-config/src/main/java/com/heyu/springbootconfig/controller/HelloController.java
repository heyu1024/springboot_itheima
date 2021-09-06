package com.heyu.springbootconfig.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shkstart
 * @date 2021-08-15 11:51
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello(){
        return "hello config";
    }
}
