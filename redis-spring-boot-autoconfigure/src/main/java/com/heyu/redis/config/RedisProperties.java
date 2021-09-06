package com.heyu.redis.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author heyu
 * @date 2021-08-15 21:57
 */
//加@Component也不一定能被spring识别
@ConfigurationProperties(prefix = "redis")
public class RedisProperties {

    private String host="localhost";
    private int port=6379;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
