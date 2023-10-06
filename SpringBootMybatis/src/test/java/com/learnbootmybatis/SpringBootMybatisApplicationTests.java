package com.learnbootmybatis;

import com.learnbootmybatis.dao.BrandDao;
import com.learnbootmybatis.domain.Brand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBootMybatisApplicationTests {

    @Autowired
    private BrandDao brandDao;

    //验证Spring 和Mybatis 整合ok
    @Test
    void queryBrand() {
        Brand brand = new Brand();
        BrandDao brandDao = this.brandDao.queryBrand(brand);
        Assertions.assertNotNull(brandDao);
    }

    @Test
    void testGetAll() {
        List<Brand> all = brandDao.getAll();
        Assertions.assertNotNull(all);
    }

    @Test
    void testSelect() {
        Brand byId = brandDao.getById(2);
        Assertions.assertNotNull(byId);
        Assertions.assertNotNull(byId.getBrandName());
        System.out.println(byId);
    }
}
