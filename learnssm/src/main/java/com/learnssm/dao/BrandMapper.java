package com.learnssm.dao;





import com.learnssm.domain.Brand;

import java.util.List;

public interface BrandMapper {
    List<Brand> selectAll();

    int insertBrand(Brand brand);

    Brand selectById(Integer id);

    int updateBrandById(Brand brand);

    int deleteById(Integer id);
}
