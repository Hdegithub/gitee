package com.learnjsp.web;

import com.alibaba.fastjson.JSON;
import com.learnjsp.utils.Result;
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

@WebServlet(urlPatterns = "/updateBrand")
public class UpdateServlet extends HttpServlet {
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
        //todo: 调用Mybatis ，更新
        int updated = brandService.updateBrand(brand);
        if (updated > 0) {
            //更新成功,跳转到 all 页面
            result.setCode(200);
            result.setMsg("修改成功");
        } else {
            result.setCode(400);
            result.setMsg("修改失败");
        }
    }
}
