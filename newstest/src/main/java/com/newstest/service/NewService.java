package com.newstest.service;

import com.newstest.domain.News;
import com.newstest.utils.PageResult;

import java.util.List;

public interface NewService {
    List<News> selectAll();

    int getTotalNews();

    //查询带有分页的新闻列表
    PageResult getPageNews(Integer pageNO,Integer pageSize);
}
