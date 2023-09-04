package com.learnssm.service;



import com.learnssm.domain.Brand;

import java.util.List;

public interface BrandService {

    List<Brand> getAll();

    int addBrand(Brand brand);
}
