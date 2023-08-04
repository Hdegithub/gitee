package org.example.pojo;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.mapper.DeptMapper;
import org.junit.Assert;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestDept {
    @org.junit.Test
    public void testSelect() throws IOException {
        //1. 获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2. 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        List<Emp> empList = mapper.selectemp();
        Assert.assertNotNull(empList);
        Assert.assertTrue(empList.size() > 0);
        empList.forEach(emp -> System.out.println(emp));
    }
}
