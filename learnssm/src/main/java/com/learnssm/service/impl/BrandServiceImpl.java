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

    @Override
    public int addBrand(Brand brand) {
        return 0;
    }
}
