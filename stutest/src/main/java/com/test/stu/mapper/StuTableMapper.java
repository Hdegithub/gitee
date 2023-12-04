package com.test.stu.mapper;

import com.test.stu.domain.StuTable;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author 29484
* @description 针对表【stu_table(学生信息)】的数据库操作Mapper
* @createDate 2023-11-27 17:24:52
* @Entity com.test.stu.domain.StuTable
*/
@Mapper
public interface StuTableMapper {

    int deleteByPrimaryKey(Long id);

    int insert(StuTable record);

    int insertSelective(StuTable record);

    StuTable selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(StuTable record);

    int updateByPrimaryKey(StuTable record);

    //根据学生名字模糊查询学生
    List<StuTable>selectPageByName(@Param("limit") Integer limit, @Param("pageSize") Integer pageSize, @Param("stuName") String stuName);

    int findStuCount(@Param("stuName") String stuName);
}
