package com.newstest.mapper;

import com.newstest.domain.Link;
import com.newstest.utils.PageQueryUtil;

/**
* @author 29484
* @description 针对表【tb_link】的数据库操作Mapper
* @createDate 2023-09-08 15:42:00
* @Entity com.newstest.domain.TbLink
*/
public interface LinkMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Link record);

    int insertSelective(Link record);

    Link selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Link record);

    int updateByPrimaryKey(Link record);

    int getTotalLinks(PageQueryUtil pageUtil);
}
