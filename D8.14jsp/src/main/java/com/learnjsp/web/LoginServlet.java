package com.learnjsp.web;

import com.learnjsp.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/login")

public class LoginServlet extends HttpServlet {
    private UserService userService = new UserService();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        boolean isok = userService.isLoginOk(username, password);
        if (isok){
            HttpSession session=req.getSession();
            session.setAttribute("uname",username);
            resp.sendRedirect(req.getContextPath()+"/selectall");
        }else {
            req.setAttribute("err","登录失败");
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
        }
    }
}
