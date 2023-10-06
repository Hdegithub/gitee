package com.learnjsp.web;

import com.alibaba.fastjson.JSONObject;
import com.learnjsp.pojo.Brand;
import com.learnjsp.service.BrandService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(urlPatterns = "/selectall")
public class AllServlet extends HttpServlet {
    private BrandService brandService = new BrandService();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pageNo = req.getParameter("pageNo");
        String cntPerPage = req.getParameter("cntPerPage");
        if (pageNo == null) {
            pageNo = "1";
        }
        if (cntPerPage == null) {
            cntPerPage = "10";
        }
        int pNo = Integer.parseInt(pageNo);
        int pageSize = Integer.parseInt(cntPerPage);

        List<Brand> allBrands = brandService.getAllBrands(pNo, pageSize);
        int count = brandService.getAllBrandsCount();

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("cnt", count);
        jsonObject.put("brands", allBrands);
        // 转换为JSON结构 返回
        // List  -> JSON 字符串
        //  String jsonString = JSON.toJSONString(allBrands);
        resp.setHeader("Content-Type", "text/json;charset=utf-8");
        // 直接返回给前端
        PrintWriter writer = resp.getWriter();
        writer.write(jsonObject.toJSONString());
        writer.flush();
    }
}
