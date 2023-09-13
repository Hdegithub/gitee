package com.newstest.service.impl;

import com.newstest.domain.NewsCategory;
import com.newstest.mapper.NewsCategoryMapper;
import com.newstest.service.CategoryService;
import com.newstest.utils.PageQueryUtil;
import com.newstest.utils.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private NewsCategoryMapper newsCategoryMapper;

    @Override
    public PageResult getBlogCategoryPage(PageQueryUtil pageUtil) {
        return null;
    }

    @Override
    public int getTotalCategories() {
        return newsCategoryMapper.getTotalCategories(null);
    }

    @Override
    public Boolean saveCategory(String categoryName, String categoryIcon) {
        return null;
    }

    @Override
    public Boolean updateCategory(Integer categoryId, String categoryName, String categoryIcon) {
        return null;
    }

    @Override
    public Boolean deleteBatch(Integer[] ids) {
        return null;
    }

    @Override
    public List<NewsCategory> getAllCategories() {
        return null;
    }
}
