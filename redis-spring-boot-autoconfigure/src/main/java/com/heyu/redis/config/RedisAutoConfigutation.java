package com.heyu.redis.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;

/**
 * @author heyu
 * @date 2021-08-15 21:53
 */
@Configuration
//@EnableConfigurationProperties(RedisProperties.class) 让RedisProperties被Spring所识别
@EnableConfigurationProperties(RedisProperties.class)
@ConditionalOnClass(Jedis.class)
public class RedisAutoConfigutation {

    /**
     * 提供Jedis的bean
     */
    @Bean
    @ConditionalOnMissingBean(name="jedis")
    public Jedis jedis(RedisProperties redisProperties){
        System.out.println("RedisAutoConfigutation.........");
        return new Jedis(redisProperties.getHost(),redisProperties.getPort());
    }
}
