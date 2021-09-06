package com.heyu.config;

import com.heyu.bean.Role;
import com.heyu.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author heyu
 * @date 2021-08-15 20:09
 */
@Configuration
public class UserConfig {

    @Bean
    public User user(){
        return new User();
    }

    @Bean
    public Role role(){
        return new Role();
    }
}
