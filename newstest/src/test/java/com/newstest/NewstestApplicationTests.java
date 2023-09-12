package com.newstest;

import com.newstest.domain.News;
import com.newstest.domain.NewsComment;
import com.newstest.mapper.NewsMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class NewstestApplicationTests {
    @Autowired
    private NewsMapper newsMapper;

    @Test
    void contextLoads() {
        News tbNews = newsMapper.selectByPrimaryKey(2L);
        Assertions.assertNotNull(tbNews);
        System.out.println(tbNews);
    }

    @Test
    void testSelectById() {
        News news = newsMapper.selectById(4L);
        Assertions.assertNotNull(news);
        System.out.println(news);
        List<NewsComment> commentList = news.getCommentList();
        Assertions.assertNotNull(commentList);
        Assertions.assertTrue(commentList.size() > 0);
        System.out.println(commentList);
    }

    @Test
    void testSelectAll() {
        List<News> newsList = newsMapper.selectAll();
        Assertions.assertNotNull(newsList);
        Assertions.assertTrue(newsList.size() > 0);
        newsList.forEach((news) -> {
            System.out.println(news);
        });
    }
}
