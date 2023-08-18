package com.learnjsp.web;

import com.learnjsp.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/register")
public class RegServlet extends HttpServlet {
    private UserService userService = new UserService();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setHeader("Content-Type", "text/html;charset=UTF-8");
        req.setCharacterEncoding("UTF-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String checkCode = req.getParameter("checkCode");
        //验证码逻辑 ： 需要检验用户输入的验证码  和刚刚生成的是否一致
        HttpSession session = req.getSession();
        String code = (String) session.getAttribute("code");
        if (code != null && code.equalsIgnoreCase(checkCode)) {
            //验证码正确
            int i = userService.addUser(username, password);
            if (i > 0) {
                req.setAttribute("info", "注册成功");
                req.getRequestDispatcher("/login.jsp").forward(req, resp);
            } else {
                //验证码错误
                req.setAttribute("err", "登录失败");
                req.getRequestDispatcher("/register.jsp").forward(req, resp);
            }
        }
    }
}
