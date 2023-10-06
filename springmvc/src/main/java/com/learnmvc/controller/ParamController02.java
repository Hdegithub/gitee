package com.learnmvc.controller;

import com.learnmvc.domain.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * 各种类型请求参数
 */
@Controller
public class ParamController02 {
    @RequestMapping("/login")
    @ResponseBody
    public String login(@RequestParam(defaultValue = "hhh") String username, @RequestParam(defaultValue = "666") String password) {
        System.out.println(username);
        System.out.println(password);
        if (username.contains("hhh") && password.contains("666")) {
            return "ok";
        } else {
            return "notok";
        }
    }


    @RequestMapping("/register")
    @ResponseBody
    // required 约束参数不能缺失  当加了@RequestParam 之后，required默认要求
    public String reg(@RequestParam("uname") String username, @RequestParam(required = true) String password,
                      String password2) {
        System.out.println(username);
        System.out.println(password);
        System.out.println("password2:" + password2);
        return "ok";
    }

    @RequestMapping("/pojoParamForJson")
    @ResponseBody
    public String pojoParamForJson(@RequestBody User user) {
        System.out.println("pojo(json)参数传递 user ==> " + user);
        return "{'module':'pojo for json param'}";
    }

}
