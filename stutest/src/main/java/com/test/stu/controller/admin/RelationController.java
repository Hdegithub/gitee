package com.test.stu.controller.admin;

import com.test.stu.service.RelationService;
import com.test.stu.utils.PageResult;
import com.test.stu.utils.Result;
import com.test.stu.utils.ResultGenerator;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class RelationController {
    @Autowired
    private RelationService relationService;

    @ApiOperation(value = "查询学生", notes = "查询某班所有学生")
    public Result list(@RequestParam(required = false) @ApiParam(value = "页码") Integer pageNumber,
                       @RequestParam(required = false) @ApiParam(value = "每页条数") Integer pageSize,
                       @RequestParam(required = false) @ApiParam(value = "班级") Integer classId) {
        if (pageNumber == null) {
            pageNumber = 1;
        }
        if (pageSize == null) {
            pageSize = 10;
        }
        PageResult pageResult = relationService.findAllStuByClass(pageNumber,pageSize,classId);
        Result result = ResultGenerator.genSuccessResult();
        result.setData(pageResult);
        return result;
    }
}
