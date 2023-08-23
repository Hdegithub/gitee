package com.learnjsp.mapper;

import com.learnjsp.pojo.Brand;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BrandMapper {
    List<Brand> selectAll();

    int insertBrand(Brand brand);

    Brand selectById(Integer id);

    int updateBrandById(Brand brand);

    int deleteById(Integer id);

    List<Brand> selectByname(@Param("myinput") String input);
}
