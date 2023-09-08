package com.newstest.mapper;

import com.newstest.domain.Config;

/**
* @author 29484
* @description 针对表【tb_config】的数据库操作Mapper
* @createDate 2023-09-08 15:42:00
* @Entity com.newstest.domain.TbConfig
*/
public interface ConfigMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Config record);

    int insertSelective(Config record);

    Config selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Config record);

    int updateByPrimaryKey(Config record);

}
