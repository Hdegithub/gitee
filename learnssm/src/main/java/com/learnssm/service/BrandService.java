package com.learnssm.service;


import com.learnssm.domain.Brand;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BrandService {

    public List<Brand> getAll();

    public Brand getById(Integer id);

    List<Brand> queryBrand(@Param("brand") Brand brand);

    public int delete(Integer id);

    public int insertBrand(Brand brand);

    public int updateBrandById(Brand brand);
}
