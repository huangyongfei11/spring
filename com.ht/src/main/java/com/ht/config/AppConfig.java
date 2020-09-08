package com.ht.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author K1081221
 * @version 2019/9/20
 * @description:
 * @modified:
 */
@Configuration
@ComponentScan("com.ht")
@EnableAspectJAutoProxy
public class AppConfig {
}
