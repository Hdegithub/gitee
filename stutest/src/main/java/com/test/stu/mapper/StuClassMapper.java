package com.test.stu.mapper;

import com.test.stu.domain.StuClass;

/**
* @author 29484
* @description 针对表【stu_class(学生班级表)】的数据库操作Mapper
* @createDate 2023-11-21 19:17:43
* @Entity com.test.stu.domain.StuClass
*/
public interface StuClassMapper {

    int deleteByPrimaryKey(Long id);

    int insert(StuClass record);

    int insertSelective(StuClass record);

    StuClass selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(StuClass record);

    int updateByPrimaryKey(StuClass record);
}
