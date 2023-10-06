package com.newstest.mapper;

import com.newstest.domain.News;
import com.newstest.utils.PageQueryUtil;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 29484
 * @description 针对表【tb_news】的数据库操作Mapper
 * @createDate 2023-09-08 15:42:00
 * @Entity com.newstest.domain.TbNews
 */
@Mapper
public interface NewsMapper {

    int deleteByPrimaryKey(Long id);

    int insert(News record);

    int insertSelective(News record);

    News selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);

    List<News> selectAll();

    News selectById(Long id);

    int getTotalNews(PageQueryUtil pageUtil);

    List<News> selectBypage(@Param("start") Integer start, @Param("recordSize") Integer recordSize);

    int selectNewsCount();
}
