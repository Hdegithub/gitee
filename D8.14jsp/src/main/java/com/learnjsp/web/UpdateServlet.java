package com.learnjsp.web;

import com.learnjsp.pojo.Brand;
import com.learnjsp.service.BrandService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/updateBrand")
public class UpdateServlet extends HttpServlet {
    private BrandService brandService = new BrandService();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Object uname = session.getAttribute("uname");
        if (uname == null) {
            //说明用户没有登陆
            resp.sendRedirect(req.getContextPath() + "/login.jsp");
            return;
        }
        req.setCharacterEncoding("UTF-8");
        String id = req.getParameter("id");
        String brandName = req.getParameter("brandName");
        String companyName = req.getParameter("companyName");
        String description = req.getParameter("description");
        String ordered = req.getParameter("ordered");
        String status = req.getParameter("status");
        Brand brand = new Brand();
        brand.setId(Integer.parseInt(id));
        brand.setBrandName(brandName);
        brand.setCompanyName(companyName);
        brand.setOrdered(Integer.parseInt(ordered));
        brand.setDescription(description);
        brand.setStatus(Integer.parseInt(status));
        StringBuilder msg = new StringBuilder();
        if (status == null || "".equals(status.trim())){
            msg.append("状态不能为空<br>");
        }
        if (brandName == null || "".equals(brandName.trim())){
            msg.append("品牌名不能为空<br>");
        }
        if (!"".equals(msg.toString())) {
            req.setAttribute("brd", brand);
            req.setAttribute("error", msg.toString());
            //请求转发，浏览器地址栏不会变化
            req.getRequestDispatcher("/updateBrand.jsp").forward(req, resp);
            return;
        }

        //todo: 调用Mybatis ，更新
        int updated = brandService.updateBrand(brand);
        if (updated > 0){
            //更新成功,跳转到 all 页面
            req.getRequestDispatcher("/selectall").forward(req, resp);
        }else{
            req.setAttribute("brd", brand);
            req.setAttribute("error", "更新失败");
            //请求转发，浏览器地址栏不会变化
            req.getRequestDispatcher("/updateBrand.jsp").forward(req, resp);
            return;
        }
    }
}
