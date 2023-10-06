package com.learnssm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//只负责SpringMVC 相关类扫描
@Configuration
@ComponentScan(basePackages = "com.learnssm.controller")
@EnableWebMvc
public class SpringMvcConfig {


}
