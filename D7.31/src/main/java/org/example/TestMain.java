package org.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.mapper.GoodMapper;
import org.example.pojo.Good;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        //testInsert();
        //testSelect();
        testSearch();
        //testWhen();
    }
private static void testWhen(){
    SqlSession sqlSession = openSession();
    GoodMapper brandMapper = sqlSession.getMapper(GoodMapper.class);
    Good good = new Good();
    good.setTitle("果");
    good.setPrice(10);
    List<Good> goods = brandMapper.selectByOneCondition(good);
    System.out.println("品牌名字含有"+good.getTitle()+"的："+"或者价格是:"+good.getPrice());
    goods.forEach(god -> System.out.println(god));
}
    private static void testSearch() {
        SqlSession sqlSession = openSession();
        GoodMapper brandMapper = sqlSession.getMapper(GoodMapper.class);
        Good good = new Good();
        good.setTitle("果");
        // 再加条件
        //good.setId(18);
        List<Good> goods = brandMapper.selectByConditionDynamic(good);
        System.out.println("品牌名字含有果的");
        goods.forEach(god -> System.out.println(god));
    }

    private static void testSelect() {
        SqlSession sqlSession = openSession();
        GoodMapper goodMapper = sqlSession.getMapper(GoodMapper.class);
        List<Good> goodList = goodMapper.selectByCondition(17);
        goodList.forEach(god -> System.out.println(god));
    }

    private static void testInsert() {
        SqlSession sqlSession = openSession();
        GoodMapper goodMapper = sqlSession.getMapper(GoodMapper.class);
        Good good = new Good();
        good.setTitle("菠萝");
        good.setPrice(10);
        int insertGood = goodMapper.insertGood(good);
        System.out.println("执行insert后受到影响的条数:" + insertGood);
        sqlSession.commit();
        sqlSession.close();
    }

    private static void test() {
        //获取mybatis Session
        SqlSession sqlSession = openSession();
        GoodMapper goodMapper = sqlSession.getMapper(GoodMapper.class);
        List<Good> goodList = goodMapper.selectAllGoods();
        goodList.forEach(good -> System.out.println(good));
        System.out.println("==========================");
        Good good = goodMapper.selectByid(16);
        if (good != null) {
            /**
             * #{ }
             *  select * from tb_brand where id = ?
             *  说明内部用的是PreparedStatement ，优点： 防止sql注入攻击
             *  mybatis内部就是用JDBC来实现的
             *  ${} 无法预防sql注入攻击
             */
            System.out.println("找到了id是16的： " + good);
        }
        sqlSession.close();
    }

    private static SqlSession openSession() {
        //1. 加载mybatis的核心配置文件，获取 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //会话
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2. 获取SqlSession对象，用它来执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        return sqlSession;
    }
}
