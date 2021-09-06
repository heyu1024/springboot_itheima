package com.heyu.springbootlistener.listener;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author heyu
 * @date 2021-08-21 17:42
 * 当项目启动后执行run方法
 */
@Component
public class MyApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("ApplicationRunner..run");
        System.out.println(Arrays.asList(args.getSourceArgs()));
    }
}