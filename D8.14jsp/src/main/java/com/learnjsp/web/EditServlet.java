package com.learnjsp.web;

import com.learnjsp.pojo.Brand;
import com.learnjsp.service.BrandService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// 点击了编辑链接后，把当前的这一条数据详情 传过来
// 中转站
@WebServlet(urlPatterns = "/edit")
public class EditServlet extends HttpServlet {
    private BrandService brandService = new BrandService();

    //Tomcat容器来访问 你的service方法，"回调方法"
    // 多线程  重写Thread  run()     callback 回调方法
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String id = req.getParameter("id");
        Integer bid = Integer.parseInt(id);
        //int -> String
//        String s = Integer.toString(9);
//        //Integer ->String
//        Integer myInt = new Integer(99);
//        myInt.toString();
        // mybatis 查询详情
        Brand brand = brandService.findById(bid);

        req.setAttribute("brd", brand);
        req.getRequestDispatcher("/updateBrand.jsp").forward(req, resp);
    }
}
