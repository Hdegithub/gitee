package com.test.stu.service.impl;

import com.test.stu.domain.StuClassRelation;
import com.test.stu.mapper.StuClassRelationMapper;
import com.test.stu.service.RelationService;
import com.test.stu.utils.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RelationServiceImpl implements RelationService {
    @Autowired
    public StuClassRelationMapper stuClassRelationMapper;

    @Override
    public PageResult findAllStuByClass(Integer pageNo, Integer pageSize, int classId) {
        List<StuClassRelation> stuList = stuClassRelationMapper.selectStuByClass((pageNo - 1), pageSize, classId);
        int stuCount = stuClassRelationMapper.findStuCount(classId);
        PageResult pageResult = new PageResult(stuList, stuCount, pageSize, pageNo);
        return pageResult;
    }
}
