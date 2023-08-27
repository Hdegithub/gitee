package com.learnjsp.mapper;

import com.learnjsp.pojo.Brand;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BrandMapper {
    List<Brand> selectAll();

    List<Brand> selectAll(@Param("start") Integer start, @Param("pageSize") Integer pageSize);

    int selectAllCount();

    List<Brand> searchpage(@Param("brand") Brand brand);
    int searchCount(@Param("brand") Brand brand);

    int insertBrand(Brand brand);

    Brand selectById(Integer id);

    int updateBrandById(Brand brand);

    int deleteById(Integer id);

    List<Brand> selectByname(Brand brand);

}
