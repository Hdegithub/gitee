package com.learnssm.controller;

import com.learnssm.domain.Brand;
import com.learnssm.service.BrandService;
import com.learnssm.utils.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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

    @RequestMapping("/get/{id}")
    public Result getById(@PathVariable("id") Integer id) {
        Brand brand = brandService.getById(id);
        Integer code = brand == null ? Code.GET_ERR : Code.GET_OK;
        String msg = brand == null ? "没有找到" : "";
        Result result = new Result(code, msg, brand);
        return result;
    }

    @RequestMapping("/delete/{id}")
    public int delete(@PathVariable("id") Integer id) {
        return brandService.delete(id);
    }


    //模糊查询
    @RequestMapping("/query")
    public Result queryBrand(@RequestBody Brand brand) {
        List<Brand> queryBrand = brandService.queryBrand(brand);
        Result result = new Result();
        if (queryBrand != null && queryBrand.size() > 0) {
            //成功
            result.setCode(Code.GET_OK);
            //只要是引用类型 ，都是Object的子类
            result.setData(queryBrand);
        } else {
            //没有找到数据   201代表没有找到数据
            //前端 只需要拿到code值判断，如果是201，就直接在网页显示 message
            result.setCode(Code.GET_ERR);
            result.setMessage("没有找到符合条件的数据");
        }
        return result;
    }

    //修改数据
    @RequestMapping("/update")
    public int update(@RequestBody Brand brand) {
        return brandService.updateBrandById(brand);
    }

    //增加数据
    @RequestMapping("/insert")
    public int insert(@RequestBody Brand brand) {
        return brandService.insertBrand(brand);
    }
}
