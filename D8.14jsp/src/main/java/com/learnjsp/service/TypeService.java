package com.learnjsp.service;

import com.learnjsp.mapper.TypeMapper;
import com.learnjsp.pojo.Type;
import com.learnjsp.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class TypeService {

    public List<Type> selectAll() {
        SqlSession sqlSession = SqlSessionFactoryUtils.openSession();
        TypeMapper mapper = sqlSession.getMapper(TypeMapper.class);
        List<Type> typeList = mapper.selectAll();
        sqlSession.close();
        return typeList;
    }
}
