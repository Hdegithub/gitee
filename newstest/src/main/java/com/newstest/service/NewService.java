package com.newstest.service;

import com.newstest.domain.News;

import java.util.List;

public interface NewService {
    List<News> selectAll();
}
