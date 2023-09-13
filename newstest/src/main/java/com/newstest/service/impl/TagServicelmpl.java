package com.newstest.service.impl;

import com.newstest.domain.BlogTagCount;
import com.newstest.mapper.NewsTagMapper;
import com.newstest.service.TagService;
import com.newstest.utils.PageQueryUtil;
import com.newstest.utils.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagServicelmpl implements TagService {
    @Autowired
    private NewsTagMapper newsTagMapper;

    @Override
    public PageResult getBlogTagPage(PageQueryUtil pageUtil) {
        return null;
    }

    @Override
    public int getTotalTags() {
        return newsTagMapper.getTotalTags(null);
    }

    @Override
    public Boolean saveTag(String tagName) {
        return null;
    }

    @Override
    public Boolean deleteBatch(Integer[] ids) {
        return null;
    }

    @Override
    public List<BlogTagCount> getBlogTagCountForIndex() {
        return null;
    }
}
