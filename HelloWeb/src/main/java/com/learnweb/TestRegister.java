package com.learnweb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/register")
public class TestRegister extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置网页显示中文
        req.setCharacterEncoding("UTF-8");
        resp.setHeader("Content-type", "text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();
        String uname = req.getParameter("username");
        //没传这个参数，收到的就是null
        String pwd = req.getParameter("password");
        String pwd2 = req.getParameter("password2");
        String gender = req.getParameter("gender");
        String city = req.getParameter("city");
        String desc = req.getParameter("desc");
        System.out.println(uname + " " + pwd);
        //多个值
        String[] hobbies = req.getParameterValues("hobby");

        if (pwd == null || pwd2 == null) {
            writer.write("密码不允许为空");
            writer.flush();
            return;
        }
        if (!pwd.equals(pwd2)) {
            writer.write("两次密码不一致");
        }
        writer.write("你的注册信息如下：");
        writer.write("<br/>");
        writer.write("用户名:" + uname);
        writer.write("<br/>");
        writer.write(" 性别: " + (gender.equals("1") ? "男" : "女"));
        writer.write("<br/>");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < hobbies.length; i++) {
            switch (hobbies[i]) {
                case "1":
                    stringBuilder.append("旅游");
                    break;
                case "2":
                    stringBuilder.append("电影");
                    break;
                case "3":
                    stringBuilder.append("游戏");
                    break;
            }
        }
        writer.write(" 爱好: " + stringBuilder.toString());
        writer.write("<br/>");
        writer.write(" 城市: " + city);
        writer.write("<br/>");
        writer.write(" 描述: " + desc);
    }
}
