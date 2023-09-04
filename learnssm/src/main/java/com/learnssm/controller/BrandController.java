package com.learnssm.controller;

import com.learnssm.domain.Brand;
import com.learnssm.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    @RequestMapping("/all")
    public List<Brand> getall() {
        List<Brand> serviceAll = brandService.getAll();
        return serviceAll;
    }
}
