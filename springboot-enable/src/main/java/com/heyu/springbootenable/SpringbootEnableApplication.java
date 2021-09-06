package com.heyu.springbootenable;

import com.heyu.bean.Role;
import com.heyu.bean.User;
import com.heyu.config.EnableUser;
import com.heyu.config.MyImportSelector;
import com.heyu.config.UserConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import redis.clients.jedis.Jedis;

import java.util.Map;

/**
 *
 * @ComponentScan 扫描范围：当前引导类所在包及其子包
 * package com.heyu.springbootenable;
 *
 * package com.heyu.config;
 *
 * 1.使用@ComponentScan扫描com.heyu.config包
 * 2.可以使用@Import注解,加载类。这些类都会被Spring创建并放入ioc容器
 * 3.对Import注解进行封装
 */


/**
 * Import的四种用法
 * 1、导入Bean
 * 2、导入配置类
 * 3、导入ImportSelector的实现类
 * 4、导入ImportBeanDefinitionRegistrar的实现类
 */

@SpringBootApplication
//@ComponentScan("com.heyu.config")
//使用@Import(UserConfig.class) ，UserConfig类上面可以不加@Configuration注解
//@Import(UserConfig.class)
//@EnableUser
//@Import(User.class)
@Import(MyImportSelector.class)
public class SpringbootEnableApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootEnableApplication.class, args);


//        //获取一个Bean
//        Object user = context.getBean("user");
//        System.out.println(user);

        //不能直接通过名字，因为不一定叫user
//        Map<String, User> map = context.getBeansOfType(User.class);
//        System.out.println(map);

//        User user = context.getBean(User.class);
//        System.out.println(user);
//
//        Role role = context.getBean(Role.class);
//        System.out.println(role);


        Jedis jedis = context.getBean(Jedis.class);
        System.out.println(jedis);

        jedis.set("name","heyu");

        String name = jedis.get("name");
        System.out.println(name);

    }


    @Bean
    public Jedis jedis(){
        return new Jedis("localhost",6379);
    }
}
