package com.learnjsp.service;

import com.learnjsp.mapper.BrandMapper;
import com.learnjsp.pojo.Brand;
import com.learnjsp.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

//service  业务逻辑层
public class BrandService {

    //有利于单独进行测试
//    public List<Brand> getAllBrands() {
//        SqlSession sqlSession = SqlSessionFactoryUtils.openSession();
//        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
//        List<Brand> brands = brandMapper.selectAll();
//        sqlSession.close();
//        return brands;
//    }
    public int deleteByIds(Integer[] ids) {
        SqlSession sqlSession = SqlSessionFactoryUtils.openSession();
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        int i = brandMapper.deleteByIds(ids);
        sqlSession.close();
        return i;
    }
    public List<Brand> getAllBrands(Integer pageNo, Integer pageSize) {
        SqlSession sqlSession = SqlSessionFactoryUtils.openSession();
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        //limit 的第一个参数
        int start = (pageNo - 1) * pageSize;
        List<Brand> brands = brandMapper.selectAll(start, pageSize);
        sqlSession.close();
        return brands;
    }

    public List<Brand> searchpage(Integer pageNo, Integer pageSize, Brand brand) {
        SqlSession sqlSession = SqlSessionFactoryUtils.openSession();
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        //limit 的第一个参数
        int start = (pageNo - 1) * pageSize;
        List<Brand> brands = brandMapper.searchpage(brand);
        sqlSession.close();
        return brands;
    }

    public int getAllBrandsCount() {
        SqlSession sqlSession = SqlSessionFactoryUtils.openSession();
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        int count = brandMapper.selectAllCount();
        sqlSession.close();
        return count;
    }

    public int searchCount(Brand brand) {
        SqlSession sqlSession = SqlSessionFactoryUtils.openSession();
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        //limit 的第一个参数
        int start = (brand.getPageNo() - 1) * brand.getPageSize();
        brand.setPageNo(start);
        int count = brandMapper.searchCount(brand);
        sqlSession.close();
        return count;
    }

    public int addBrand(Brand brand) {
        SqlSession sqlSession = SqlSessionFactoryUtils.openSession();
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        int i = brandMapper.insertBrand(brand);
        sqlSession.close();
        return i;
    }

    public Brand findById(Integer id) {
        SqlSession sqlSession = SqlSessionFactoryUtils.openSession();
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        Brand brand = brandMapper.selectById(id);
        sqlSession.close();
        return brand;
    }

    public int updateBrand(Brand brd) {
        SqlSession sqlSession = SqlSessionFactoryUtils.openSession();
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        int i = brandMapper.updateBrandById(brd);
        return i;
    }

    public int deleteById(Integer id) {
        SqlSession sqlSession = SqlSessionFactoryUtils.openSession();
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        int i = brandMapper.deleteById(id);
        return i;
    }

    public List<Brand> selectByname(Brand brd) {
        SqlSession sqlSession = SqlSessionFactoryUtils.openSession();
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        List<Brand> brandList = brandMapper.selectByname(brd);
        sqlSession.close();
        return brandList;
    }
}
