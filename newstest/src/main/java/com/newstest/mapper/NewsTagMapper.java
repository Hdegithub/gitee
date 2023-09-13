package com.newstest.mapper;

import com.newstest.domain.NewsTag;
import com.newstest.utils.PageQueryUtil;

/**
* @author 29484
* @description 针对表【tb_news_tag】的数据库操作Mapper
* @createDate 2023-09-08 15:42:00
* @Entity com.newstest.domain.TbNewsTag
*/
public interface NewsTagMapper {

    int deleteByPrimaryKey(Long id);

    int insert(NewsTag record);

    int insertSelective(NewsTag record);

    NewsTag selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(NewsTag record);

    int updateByPrimaryKey(NewsTag record);

    int getTotalTags(PageQueryUtil pageUtil);
}
