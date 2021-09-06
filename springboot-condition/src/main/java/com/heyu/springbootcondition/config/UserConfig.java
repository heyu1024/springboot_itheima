package com.heyu.springbootcondition.config;

import com.heyu.springbootcondition.bean.User;
import com.heyu.springbootcondition.condition.ClassCondition;
import com.heyu.springbootcondition.condition.ConditionOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author shkstart
 * @date 2021-08-15 16:45
 */
@Configuration
public class UserConfig {

    @Bean
//    @Conditional(ClassCondition.class)
//    @ConditionOnClass("redis.clients.jedis.Jedis")
    public User user(){
        return new User();
    }

    @Bean
    @ConditionalOnProperty(name = "name",havingValue = "heyu")
    public User user2(){
        return new User();
    }
}
