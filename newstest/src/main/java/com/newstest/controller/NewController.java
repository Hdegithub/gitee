package com.newstest.controller;

import com.newstest.domain.News;
import com.newstest.service.NewService;
import com.newstest.utils.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/news")
public class NewController {
    @Autowired
    private NewService newService;

    @RequestMapping("/all")
    public Result selectall() {
        List<News> newsList= newService.selectAll();
        Result result=new Result();
        result.setCode(Code.GET_OK);
        result.setData(newsList);
        return result;
    }
}
