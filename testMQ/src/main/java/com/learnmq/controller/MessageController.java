package com.learnmq.controller;

import com.learnmq.utils.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @Autowired
    private Sender sender;

    @RequestMapping("send")
    public String sendmessage(@RequestParam("message") String msg) {
        sender.send(msg);
        return "ok";
    }
}
