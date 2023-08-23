package com.learnjsp.web;

import com.learnjsp.pojo.Brand;
import com.learnjsp.service.BrandService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/addBrand")
public class AddServlet extends HttpServlet {

    private BrandService brandService = new BrandService();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String brandName = req.getParameter("brandName");
        String companyName = req.getParameter("companyName");
        String description = req.getParameter("description");
        String ordered = req.getParameter("ordered");
        String status = req.getParameter("status");
        String typeId = req.getParameter("typeId");

        StringBuilder msg = new StringBuilder();
        if (status == null || "".equals(status.trim())) {
            msg.append("状态不能为空<br>");
        }
        if (brandName == null || "".equals(brandName.trim())) {
            msg.append("品牌名不能为空<br>");
        }
        if (!"".equals(msg.toString())) {
            req.setAttribute("error", msg.toString());
            req.getRequestDispatcher("/addBrand.jsp").forward(req, resp);
            return;
        }
        Brand brand = new Brand(null, brandName, companyName, Integer.parseInt(ordered), description, Integer.parseInt(status));
        brand.setTypeId(Integer.parseInt(typeId));
        int added = brandService.addBrand(brand);
        if (added > 0) {
            //todo: 跳转到查询所有的界面
            resp.sendRedirect("/D8_14jsp/selectall");
        } else {
            //提示出错
            req.setAttribute("error", "新增失败");
            //请求转发
            req.getRequestDispatcher("/addBrand.jsp").forward(req, resp);
        }
    }
}
