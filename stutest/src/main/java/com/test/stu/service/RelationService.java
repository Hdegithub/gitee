package com.test.stu.service;

import com.test.stu.utils.PageResult;
import org.apache.ibatis.annotations.Param;

/**
 * 学生班级连接表
 */
public interface RelationService {
    //查询某个班级所有学生情况

    PageResult findAllStuByClass(@Param("pageNo") Integer pageNo, @Param("pageSize") Integer pageSize, @Param("classId") int classId);
}
