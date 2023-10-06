package com.learnjsp.web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.learnjsp.pojo.Brand;
import com.learnjsp.service.BrandService;
import com.learnjsp.utils.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

@WebServlet(urlPatterns = "/delete")
public class DeleteServlet extends HttpServlet {
    private static final Logger LOGGER = LoggerFactory.getLogger(DeleteServlet.class);
    private BrandService brandService = new BrandService();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServletInputStream ips = req.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(ips));
        String line = br.readLine();
        System.out.println("line: " + line);
        JSONArray jArray = JSON.parseObject(line, JSONArray.class);
        // 从JSON 数组 还原出来  int 数据
        Integer[] ids = jArray.toArray(new Integer[jArray.size()]);
        //todo: 执行批量删除
        int i = brandService.deleteByIds(ids);
        if (i > 0) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }
        System.out.println("删除了 :" + i);
        resp.setHeader("Content-Type", "text/json;charset=utf-8");
        // 直接返回给前端  ,返回给前端的统一的都是JSON
        PrintWriter writer = resp.getWriter();
        Result result = new Result();
        result.setCode(200);
        result.setMsg("删除成功");
        String s = JSON.toJSONString(result);
        writer.write(s);
        writer.flush();
    }
}
