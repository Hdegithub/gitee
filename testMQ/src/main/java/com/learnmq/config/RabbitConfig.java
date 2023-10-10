package com.learnmq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
    //队列名  ，不同队列通常对应不同的业务
    public static final String QUEUE_NAME = "myQueue";
    //表明 此方法会返回一个对象，而且这个对象要交给spring容器来管理，使用
    @Bean
    public Queue createQueue(){
        return new Queue(QUEUE_NAME);
    }
}
