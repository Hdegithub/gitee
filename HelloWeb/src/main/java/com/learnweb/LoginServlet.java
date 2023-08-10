package com.learnweb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置网页显示中文
        resp.setHeader("Content-type", "text/html;charset=UTF-8");
        //接收参数
        String uname = req.getParameter("username");
        String pwd = req.getParameter("password");
        System.out.println(uname);

        //显示在网页上
        PrintWriter writer = resp.getWriter();
        if ("admin".equals(uname)&&"123456".equals(pwd)){
            writer.write("登录成功："+uname);
        }else{
            writer.write("登录失败");
        }
    }
}
