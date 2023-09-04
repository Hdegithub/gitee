package com.learnssm;

import com.learnssm.config.SpringConfig;
import com.learnssm.domain.Brand;
import com.learnssm.service.BrandService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
//设置Spring环境对应的配置类, 测试service层的逻辑，不需要SpringMVC
@ContextConfiguration(classes = SpringConfig.class)
public class TestService {
    @Autowired
    private BrandService brandService;
    //test case 测试用例
    @Test
    public void testGetAll(){
        //验证Spring 和Mybatis 整合ok
        List<Brand> all = brandService.getAll();
        Assert.assertNotNull(all);
        Assert.assertTrue(all.size() > 0);
    }
}
