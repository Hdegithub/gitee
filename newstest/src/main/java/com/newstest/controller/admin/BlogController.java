package com.newstest.controller.admin;

import com.newstest.domain.News;
import com.newstest.service.NewService;
import com.newstest.utils.NewsConstans;
import com.newstest.utils.PageResult;
import com.newstest.utils.Result;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class BlogController {
    @Autowired
    private NewService newService;

    //指向新闻管理页面
    @RequestMapping("/blogs")
    public String list(HttpServletRequest request) {
        request.setAttribute("path", "blogs");
        return "admin.blog";
    }

    @GetMapping("/blogs/list")
    @ResponseBody       //结果会被转化为JSON
    public Result newlist(@RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
        PageResult pageResult = newService.getPageNews(page, limit);
        Result result = new Result();
        result.setCode(NewsConstans.RESULT_OK);
        result.setData(pageResult);
        return result;
    }
}
