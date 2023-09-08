package com.newstest;

import com.newstest.domain.News;
import com.newstest.mapper.NewsMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NewstestApplicationTests {
    @Autowired
    private NewsMapper tbNewsMapper;
    @Test
    void contextLoads() {
        News tbNews = tbNewsMapper.selectByPrimaryKey(2L);
        Assertions.assertNotNull(tbNews);
        System.out.println(tbNews);
    }

}
