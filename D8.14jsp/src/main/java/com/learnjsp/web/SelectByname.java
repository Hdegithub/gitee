package com.learnjsp.web;

import com.learnjsp.pojo.Brand;
import com.learnjsp.service.BrandService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/searchByname")
public class SelectByname extends HttpServlet {
    private BrandService brandService = new BrandService();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String searchname = req.getParameter("searchname");
        List<Brand> brands = brandService.selectByname(searchname);
        req.setAttribute("myBrands", brands);
        req.getRequestDispatcher("/jstl-foreach.jsp").forward(req, resp);
    }
}
