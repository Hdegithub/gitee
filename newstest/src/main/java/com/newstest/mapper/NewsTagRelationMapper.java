package com.newstest.mapper;

import com.newstest.domain.NewsTagRelation;

/**
 * @author 29484
 * @description 针对表【tb_news_tag_relation】的数据库操作Mapper
 * @createDate 2023-09-08 15:42:00
 * @Entity com.newstest.domain.TbNewsTagRelation
 */
public interface NewsTagRelationMapper {

    int deleteByPrimaryKey(Long id);

    int insert(NewsTagRelation record);

    int insertSelective(NewsTagRelation record);

    NewsTagRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(NewsTagRelation record);

    int updateByPrimaryKey(NewsTagRelation record);

}
