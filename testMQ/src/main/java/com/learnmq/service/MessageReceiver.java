package com.learnmq.service;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "myQueue")
public class MessageReceiver {

    @RabbitHandler
    public void process(String msg) {
        System.out.println("收到了：" + msg);
    }
}
