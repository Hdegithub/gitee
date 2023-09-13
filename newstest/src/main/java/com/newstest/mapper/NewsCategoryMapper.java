package com.newstest.mapper;

import com.newstest.domain.NewsCategory;
import com.newstest.utils.PageQueryUtil;

/**
* @author 29484
* @description 针对表【tb_news_category】的数据库操作Mapper
* @createDate 2023-09-08 15:42:00
* @Entity com.newstest.domain.TbNewsCategory
*/
public interface NewsCategoryMapper {

    int deleteByPrimaryKey(Long id);

    int insert(NewsCategory record);

    int insertSelective(NewsCategory record);

    NewsCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(NewsCategory record);

    int updateByPrimaryKey(NewsCategory record);

    int getTotalCategories(PageQueryUtil pageUtil);
}
