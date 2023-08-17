package com.learnjsp.service;

import com.learnjsp.mapper.BrandMapper;
import com.learnjsp.pojo.Brand;
import com.learnjsp.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

//service  业务逻辑层
public class BrandService {

    //有利于单独进行测试
    public List<Brand> getAllBrands() {
        SqlSession sqlSession = SqlSessionFactoryUtils.openSession();
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        List<Brand> brands = brandMapper.selectAll();
        sqlSession.close();
        return brands;
    }

    public int addBrand(Brand brand) {
        SqlSession sqlSession = SqlSessionFactoryUtils.openSession();
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        int i = brandMapper.insertBrand(brand);
        sqlSession.close();
        return i;
    }

    public Brand findById(Integer id){
        SqlSession sqlSession = SqlSessionFactoryUtils.openSession();
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        Brand brand = brandMapper.selectById(id);
        sqlSession.close();
        return brand;
    }
    public int updateBrand(Brand brd){
        SqlSession sqlSession = SqlSessionFactoryUtils.openSession();
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        int i = brandMapper.updateBrandById(brd);
        return i;
    }
    public int delBrand(Integer id){
        SqlSession sqlSession = SqlSessionFactoryUtils.openSession();
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        int i = brandMapper.deleteById(id);
        return i;
    }
    public List<Brand> selectByname(String input) {
        SqlSession sqlSession = SqlSessionFactoryUtils.openSession();
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        List<Brand> brandname = brandMapper.selectByname(input);
        sqlSession.close();
        return brandname;
    }
}
