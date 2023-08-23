package com.learnjsp.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

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

@WebServlet()
public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletInputStream inputStream = req.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String s = br.readLine();
        JSONObject jsonObject = JSON.parseObject(s, JSONObject.class);
        Object uname = jsonObject.get("uname");
        System.out.println(uname);
        System.out.println(uname + "pass:" + jsonObject.get("pwd"));
        boolean isLoginOk = "test".equals(uname);
        Result result = new Result();
        if (isLoginOk){
            result.setCode(200);
            result.setMsg("登陆成功");
        }else{
            result.setCode(400);
            result.setMsg("登陆失败");
        }
        String jsonString = JSON.toJSONString(result);
        resp.setContentType("text/json;charset=UTF-8");
        PrintWriter writer = resp.getWriter();
        writer.write(jsonString);
    }
}
