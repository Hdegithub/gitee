package com.learnjsp.mapper;

import com.learnjsp.pojo.Brand;

import java.util.List;

public interface BrandMapper {
    List<Brand> selectAll();

    int insertBrand(Brand brand);
}
