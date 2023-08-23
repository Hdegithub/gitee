package com.learnjsp.web;
import com.alibaba.fastjson.JSON;
import com.learnjsp.pojo.Brand;
import com.learnjsp.service.BrandService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(urlPatterns = "/selectall")
public class AllServlet extends HttpServlet {
    private BrandService brandService = new BrandService();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Brand> allBrands = brandService.getAllBrands();
        // 转换为JSON结构 返回
        // List  -> JSON 字符串
        String jsonString = JSON.toJSONString(allBrands);
        resp.setHeader("Content-Type", "text/json;charset=utf-8");
        // 直接返回给前端
        PrintWriter writer = resp.getWriter();
        writer.write(jsonString);
        writer.flush();
    }
}
