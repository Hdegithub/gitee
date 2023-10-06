package com.learn;

import java.sql.*;
import java.util.Scanner;

public class JdbcTest {
    public static void main(String[] args) throws ClassNotFoundException {
        //testAdd();
        testSelect();
    }

    public static void testAdd() throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/testdb?useSSL=false&characterEncoding=utf8";
        String username = "root";
        String password = "123456";
        Class.forName("com.mysql.jdbc.Driver");
        //1,加载驱动
        try (
                Connection connection = DriverManager.getConnection(url, username, password);
                //4， 构造会话  用来发送sql语句
                Statement stmt = connection.createStatement();
        ) {
            // 3, 构造sql
            String sql = "insert into account(name, money) values('刘德华', 100000)";
            //你发送的sql语句，影响了多少条记录
            int updated = stmt.executeUpdate(sql);
            System.out.println("插入了记录数: " + updated);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void testSelect() {
        //1,加载驱动
        try {
            System.out.println("请输入关键字:");
            Scanner sc = new Scanner(System.in);
            String input = sc.next();
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/testdb?useSSL=false&characterEncoding=utf8";
            String username = "root";
            String password = "123456";
            //2, 建立连接
            Connection connection = DriverManager.getConnection(url, username, password);
            // 3, 构造sql
            String inputname = "%" + input + "%";
            String sqlfind = "select * from testdb.account where name like '%" + inputname + "%'";
            //4， 构造会话  用来发送sql语句
            Statement stmt = connection.createStatement();
            //5， 发送sql，获得结果集
            ResultSet resultSet = stmt.executeQuery(sqlfind);

            //6， 对结果进行遍历   当还有更多的记录时候，返回true
            while (resultSet.next()) {
//            id, name, money
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double money = resultSet.getDouble("money");
                System.out.println("id:" + id + " name: " + name + " money:" + money);
            }
            //7， 关闭
            resultSet.close();
            stmt.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
