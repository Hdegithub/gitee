package com.learnbootmybatis.dao;

import com.learnbootmybatis.domain.Brand;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BrandDao {
    @Select("select * from tb_brand where  company_name like concat('%',#{brand.companyName},'%')")
    public BrandDao queryBrand(Brand brand);

    @Select("select * from tb_brand")
    public List<Brand> getAll();

    @Select("select * from tb_brand where id = #{id}")
    public Brand getById(Integer id);
}