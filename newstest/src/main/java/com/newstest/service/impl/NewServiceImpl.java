package com.newstest.service.impl;


import com.newstest.domain.News;
import com.newstest.mapper.NewsMapper;
import com.newstest.service.NewService;
import com.newstest.utils.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewServiceImpl implements NewService {
    @Autowired
    private NewsMapper newsMapper;

    @Override
    public List<News> selectAll() {
        return newsMapper.selectAll();
    }

    @Override
    public int getTotalNews() {
        return newsMapper.getTotalNews(null);
    }

    @Override
    public PageResult getPageNews(Integer pageNO, Integer pageSize) {
        int start = (pageNO - 1) * pageSize;
        List<News> newsList = newsMapper.selectBypage(start, pageSize);
        int count = newsMapper.selectNewsCount();
        PageResult pageResult = new PageResult(newsList, count, pageSize, pageNO);
        return pageResult;
    }
}