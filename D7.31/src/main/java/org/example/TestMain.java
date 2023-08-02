package org.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.mapper.GoodMapper;
import org.example.mapper.OrderMapper;
import org.example.mapper.UserMapper;
import org.example.pojo.Good;
import org.example.pojo.Order;
import org.example.pojo.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        //testInsert();
        //testSelect();
        //testSearch();
        //testWhen();
        //testInsertGen();
        //testUpdateDynamic();
        //testDeleteIds();
        //testSelectIds();
        testLogin();
    }
    private static void testLogin(){
        SqlSession sqlSession = openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = scanner.next();
        System.out.println("请输入密码：");
        String password = scanner.next();
        user.setName(username);
        user.setPwd(password);
        int cnt = userMapper.Login(user);
        if (cnt >= 0){
            System.out.println("登录成功");
        }else{
            System.out.println("登陆失败");
        }
    }

    private static void testSelectIds() {
        SqlSession sqlSession = openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int[] ids = {26,27};
        List<User> userList = userMapper.selectUser(ids);
        userList.forEach(user -> System.out.println(user));
    }

    private static void testDeleteIds() {
        SqlSession sqlSession = openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int[] ids = {20};
        int deleted = userMapper.deleteByIds(ids);
        System.out.println("删除了: " + deleted);
    }

    private static void testWhen() {
        SqlSession sqlSession = openSession();
        GoodMapper brandMapper = sqlSession.getMapper(GoodMapper.class);
        Good good = new Good();
        good.setTitle("果");
        good.setPrice(10);
        List<Good> goods = brandMapper.selectByOneCondition(good);
        System.out.println("品牌名字含有" + good.getTitle() + "的：" + "或者价格是:" + good.getPrice());
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

    //主键回填
    private static void testInsertGen() {
        SqlSession sqlSession = openSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        Order order = new Order();
        order.setStatus(1);
        order.setPayment(987.3);
        order.setPaymentType(2);
        int i = orderMapper.addOrder(order);
        System.out.println("执行insert后受到影响的条数:" + i);
        System.out.println("order(id值)：" + order.getId());
        sqlSession.close();
    }

    private static void testUpdateDynamic() {
        SqlSession sqlSession = openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setId(15);
        user.setPwd("111");
        user.setAge(20);
        userMapper.updateUser(user);
    }
}
