package com.heyu.test;

import com.heyu.springbootinit.SpringbootInitApplication;
import com.heyu.springbootinit.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author shkstart
 * @date 2021-08-15 15:08
 * userService的测试类
 *
 */
@SpringBootTest(classes = SpringbootInitApplication.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testAdd(){
        userService.add();
    }
}
