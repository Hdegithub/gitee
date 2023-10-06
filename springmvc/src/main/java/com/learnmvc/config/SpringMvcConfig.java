package com.learnmvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//springmvc配置类，本质上还是一个spring配置类
@Configuration
@ComponentScan("com.learnmvc.controller")
//开启json数据类型自动转换
@EnableWebMvc
public class SpringMvcConfig {
}
