package com.learnssm.dao;


import com.learnssm.domain.Brand;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BrandMapper {
    List<Brand> selectAll();

    //模糊查询所有
    List<Brand> queryBrand(@Param("brand") Brand brand);

    //按照条件，查询符合的记录条数
    int queryBrandCount(@Param("brand") Brand brand);

    public Brand getById(Integer id);

    public int insertBrand(Brand brand);

    Brand selectById(Integer id);

    public int updateBrandById(Brand brand);

    public int deleteById(Integer id);


}
