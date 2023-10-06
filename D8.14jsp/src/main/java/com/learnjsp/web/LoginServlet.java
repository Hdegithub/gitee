package com.learnjsp.web;

import com.learnjsp.pojo.User;
import com.learnjsp.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    private UserService userService = new UserService();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String rememberMe = req.getParameter("rememberMe");

        boolean isok = userService.isLoginOk(username, password);
        if (isok) {
            HttpSession session = req.getSession();
            session.setAttribute("uname", username);
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            session.setAttribute("uInfo", user);
            if (rememberMe != null && "on".equals(rememberMe)) {
                //说明用户勾选了“记住我”，
                // 把用户名和密码存入cookie
                Cookie cookie = new Cookie("uname", username);
                Cookie cookie2 = new Cookie("pass", password);
                resp.addCookie(cookie);
                resp.addCookie(cookie2);
            }
            resp.sendRedirect(req.getContextPath() + "/selectall");
        } else {
            req.setAttribute("err", "登录失败");
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
        }
    }
}
