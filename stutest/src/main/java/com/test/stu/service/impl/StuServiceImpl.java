package com.test.stu.service.impl;

import com.test.stu.domain.StuTable;
import com.test.stu.mapper.StuTableMapper;
import com.test.stu.service.StuService;
import com.test.stu.utils.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StuServiceImpl implements StuService {
    @Autowired
    private StuTableMapper stuTableMapper;

    @Override
    public PageResult findStu(Integer pageNo, Integer pageSize, String stuName) {
        List<StuTable> stuList = stuTableMapper.selectPageByName((pageNo - 1), pageSize, stuName);
        int stuCount = stuTableMapper.findStuCount(stuName);
        PageResult pageResult = new PageResult(stuList, stuCount, pageSize, pageNo);
        return pageResult;
    }

    @Override
    public Boolean addStu(StuTable stuTable) {
        int insertStu = stuTableMapper.insertSelective(stuTable);
        if (insertStu>0){
            return true;
        }else {
            return false;
        }
    }
}
