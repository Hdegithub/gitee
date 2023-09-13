package com.newstest.service.impl;


import com.newstest.domain.News;
import com.newstest.mapper.NewsMapper;
import com.newstest.service.NewService;
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
}