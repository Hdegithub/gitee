package com.newstest.mapper;

import com.newstest.domain.NewsComment;

import java.util.Map;

/**
* @author 29484
* @description 针对表【tb_news_comment】的数据库操作Mapper
* @createDate 2023-09-08 15:42:00
* @Entity com.newstest.domain.TbNewsComment
*/
public interface NewsCommentMapper {

    int deleteByPrimaryKey(Long id);

    int insert(NewsComment record);

    int insertSelective(NewsComment record);

    NewsComment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(NewsComment record);

    int updateByPrimaryKey(NewsComment record);

    int getTotalNewsComments(Map map);
}
