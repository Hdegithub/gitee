package com.test.stu.mapper;

import com.test.stu.domain.StuClassRelation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author 29484
* @description 针对表【stu_class_relation】的数据库操作Mapper
* @createDate 2023-11-27 17:24:45
* @Entity com.test.stu.domain.StuClassRelation
*/
@Mapper
public interface StuClassRelationMapper {

    int deleteByPrimaryKey(Long id);

    int insert(StuClassRelation record);

    int insertSelective(StuClassRelation record);

    StuClassRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(StuClassRelation record);

    int updateByPrimaryKey(StuClassRelation record);

    List<StuClassRelation> selectStuByClass(@Param("limit") Integer limit, @Param("pageSize") Integer pageSize,@Param("classId") int classId);

    int findStuCount(@Param("classId") int classId);
}
