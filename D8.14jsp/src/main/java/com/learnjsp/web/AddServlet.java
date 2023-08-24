package com.learnjsp.web;

import com.alibaba.fastjson.JSON;
import com.learnjsp.json.Result;
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

@WebServlet(urlPatterns = "/addBrand")
public class AddServlet extends HttpServlet {

    private BrandService brandService = new BrandService();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        ServletInputStream ips = req.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(ips));
        String line = br.readLine();
        System.out.println("line: " + line);
        //JSON String -> Brand
        Brand brand = JSON.parseObject(line, Brand.class);

        StringBuilder msg = new StringBuilder();
        if (brand.getStatus() == null || "".equals(brand.getStatus())) {
            msg.append("状态不能为空<br>");
        }
        if (brand.getBrandName() == null || "".equals(brand.getBrandName().trim())) {
            msg.append("品牌名不能为空<br>");
        }
        resp.setHeader("Content-Type", "text/json;charset=utf-8");
        // 直接返回给前端  ,返回给前端的统一的都是JSON
        PrintWriter writer = resp.getWriter();
        Result result = new Result();
        if (!"".equals(msg.toString())) {
            //返回code 400 代表错误  msg:
            result.setCode(400);
            result.setMsg(msg.toString());
            String s = JSON.toJSONString(result);
            writer.write(s);
            writer.flush();
            return;
        }

        //todo: 调用Mybatis ，insert DB
        int added = brandService.addBrand(brand);
        if (added > 0) {
            //增加成功
            // 返回 code 200
            result.setCode(200);
            result.setMsg("增加成功");
        }else{
            // 返回code  400 代表失败
            result.setCode(400);
            result.setMsg("增加失败");
        }
//        if (!"".equals(msg.toString())) {
//            req.setAttribute("error", msg.toString());
//            req.getRequestDispatcher("/addBrand.jsp").forward(req, resp);
//            return;
//        }
//        Brand brand = new Brand(null, brandName, companyName, Integer.parseInt(ordered), description, Integer.parseInt(status));
//        brand.setTypeId(Integer.parseInt(typeId));
//        int added = brandService.addBrand(brand);
//        if (added > 0) {
//            //todo: 跳转到查询所有的界面
//            resp.sendRedirect("/D8_14jsp/selectall");
//        } else {
//            //提示出错
//            req.setAttribute("error", "新增失败");
//            //请求转发
//            req.getRequestDispatcher("/addBrand.jsp").forward(req, resp);
//        }
    }
}
