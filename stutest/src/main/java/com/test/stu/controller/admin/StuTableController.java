package com.test.stu.controller.admin;

import com.test.stu.domain.StuTable;
import com.test.stu.service.StuService;
import com.test.stu.utils.PageResult;
import com.test.stu.utils.Result;
import com.test.stu.utils.ResultGenerator;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@RestController

public class StuTableController {
    @Autowired
    private StuService stuService;

    @ApiOperation(value = "学生列表", notes = "查询所有学生")
    public Result list(@RequestParam(required = false) @ApiParam(value = "页码") Integer pageNumber,
                       @RequestParam(required = false) @ApiParam(value = "每页条数") Integer pageSize,
                       @RequestParam(required = false) @ApiParam(value = "学生名称") String stuName) {
        if (pageNumber == null) {
            pageNumber = 1;
        }
        if (pageSize == null) {
            pageSize = 10;
        }
        PageResult pageResult = stuService.findStu(pageNumber, pageSize, stuName);
        Result result = ResultGenerator.genSuccessResult();
        result.setData(pageResult);
        return result;
    }

    //添加学生
    @ApiOperation(value = "新增学生", notes = "新增学生信息")

    public Result add(@RequestBody @Valid StuTable stuTable) {
        Boolean addStu = stuService.addStu(stuTable);
        if (addStu == true) {
            return ResultGenerator.genSuccessResult();
        } else {
            return ResultGenerator.genFailResult("添加失败");
        }
    }

    //修改学生信息
}
