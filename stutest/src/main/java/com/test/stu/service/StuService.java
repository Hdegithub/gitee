package com.test.stu.service;

import com.test.stu.domain.StuTable;
import com.test.stu.utils.PageResult;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StuService {
    PageResult findStu(@Param("pageNo") Integer pageNo, @Param("pageSize") Integer pageSize, @Param("stuName") String stuName);

    //添加学生
    Boolean addStu(StuTable stuTable);
}
