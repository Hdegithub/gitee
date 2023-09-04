package com.learnssm.service.impl;

import com.learnssm.dao.BrandMapper;
import com.learnssm.domain.Brand;
import com.learnssm.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<Brand> getAll() {
        return brandMapper.selectAll();
    }


    public Brand getById(Integer id) {
        return brandMapper.getById(id);
    }

    public List<Brand>queryBrand (Brand brand) {
        return brandMapper.queryBrand(brand);
    }

    @Override
    public int delete(Integer id) {
        int delete = brandMapper.deleteById(id);
        return delete;
    }

    @Override
    public int insertBrand(Brand brand) {
        int insert = 0;
        try {
            insert = brandMapper.insertBrand(brand);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return insert;
    }

    @Override
    public int updateBrandById(Brand brand) {
        int update = brandMapper.updateBrandById(brand);
        return update;
    }
}
