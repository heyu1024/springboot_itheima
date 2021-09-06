package com.heyu.config;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author heyu
 * @date 2021-08-15 20:28
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(UserConfig.class)
public @interface EnableUser {
}
