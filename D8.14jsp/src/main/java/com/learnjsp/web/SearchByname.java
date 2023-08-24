package com.learnjsp.web;

import com.alibaba.fastjson.JSON;
import com.learnjsp.pojo.Brand;
import com.learnjsp.service.BrandService;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(urlPatterns = "/searchByname")
public class SearchByname extends HttpServlet {
    private BrandService brandService = new BrandService();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletInputStream inputStream = req.getInputStream();
        BufferedReader br=new BufferedReader(new InputStreamReader(inputStream));
        String line = br.readLine();
        Brand brand = JSON.parseObject(line, Brand.class);
        List<Brand> brands = brandService.selectByname(brand);
        String jsonString = JSON.toJSONString(brands);
        resp.setHeader("Content-Type", "text/json;charset=utf-8");
        // 直接返回给前端
        PrintWriter writer = resp.getWriter();
        writer.write(jsonString);
        writer.flush();
    }
}
