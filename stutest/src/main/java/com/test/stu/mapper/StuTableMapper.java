package com.test.stu.mapper;

import com.test.stu.domain.StuTable;

/**
* @author 29484
* @description 针对表【stu_table(学生信息)】的数据库操作Mapper
* @createDate 2023-11-27 17:24:52
* @Entity com.test.stu.domain.StuTable
*/
public interface StuTableMapper {

    int deleteByPrimaryKey(Long id);

    int insert(StuTable record);

    int insertSelective(StuTable record);

    StuTable selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(StuTable record);

    int updateByPrimaryKey(StuTable record);

}
