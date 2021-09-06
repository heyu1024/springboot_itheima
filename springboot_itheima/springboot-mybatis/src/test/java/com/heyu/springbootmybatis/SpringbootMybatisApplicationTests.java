package com.heyu.springbootmybatis;

import com.heyu.springbootmybatis.bean.User;
import com.heyu.springbootmybatis.mapper.UserMapper;
import com.heyu.springbootmybatis.mapper.UserXmlMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMybatisApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserXmlMapper userXmlMapper;

    @Test
    public void testFindAll() {
        List<User> all = userMapper.findAll();
        System.out.println(all);
    }

    @Test
    public void testFindAll2() {
        List<User> all = userXmlMapper.findAll();
        System.out.println(all);
    }

}
