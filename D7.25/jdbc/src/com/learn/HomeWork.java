package com.learn;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.Properties;

public class HomeWork {
    public static void main(String[] args) throws Exception {

        Properties prop = new Properties();
        prop.load(new FileInputStream("jdbc/druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);

        Brand brand = new Brand(0, "菠萝", "菠萝有限公司", 1, "好吃", 1);
//        try {
//            int update = addBrand(brand);
//            System.out.println("收到影响的记录数：" + update);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        Brand brd = getbyid(dataSource, 3);
        if (brd == null) {
            System.out.println("没有找到数据");
        } else {
            System.out.println("没有找到数据" + brd);
        }
    }

    //增加数据
    private static int addBrand(Brand brand) throws Exception {
        Properties prop = new Properties();
        prop.load(new FileInputStream("jdbc/druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
        try (
                Connection conn = dataSource.getConnection();) {
            String sql = "insert into tb_brand( brand_name, company_name, ordered, description, status)values(?,?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, brand.getBrandName());
            pstmt.setString(2, brand.getCompanyName());
            pstmt.setInt(3, brand.getOrdered());
            pstmt.setString(4, brand.getDescription());
            pstmt.setInt(5, brand.getStatus());
            int update = pstmt.executeUpdate();
            return update;
        }
    }

    //根据id查询
    private static Brand getbyid(DataSource dataSource, int id) {
        try (Connection conn = dataSource.getConnection()) {
            String sql = "select * from tb_brand where id=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int id1 = rs.getInt("id");
                String brandName = rs.getString("brand_name");
                String companyName = rs.getString("company_name");
                int ordered = rs.getInt("ordered");
                String description = rs.getString("description");
                int status = rs.getInt("status");
                Brand brand = new Brand(id1, brandName, companyName, ordered, description, status);
                return brand;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    private static int updataBrand(DataSource dataSource, Brand brand) {
        try (Connection conn = dataSource.getConnection()) {
            String sql = "update tb_brand set brand_name=?, company_name=?, ordered=?, description, status=?where id=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, brand.getBrandName());
            pstmt.setString(2, brand.getCompanyName());
            pstmt.setInt(3, brand.getOrdered());
            pstmt.setString(4, brand.getDescription());
            pstmt.setInt(5, brand.getStatus());
            pstmt.setInt(6, brand.getId());
            int update = pstmt.executeUpdate();
            return update;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return 0;
    }

    private static int deletebyid(DataSource dataSource, int id) {
        try (Connection conn = dataSource.getConnection()) {
            String sql = "delete from tb_brand where id=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,id);
            int i = pstmt.executeUpdate();
            return i;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return 0;
    }
}
