package com.learnjsp.Filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(urlPatterns = "/*")
public class FilterLogin implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入登录验证");
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;
        String uri = req.getRequestURI();
        //拦截所有，放行登陆login.jsp，"/login"
        if (uri.contains("login")) {
            filterChain.doFilter(req, resp);
        } else {
            HttpSession session = req.getSession();
            Object user = session.getAttribute("user");
            if (user == null) {//说明没登陆过，踢回login
                resp.sendRedirect("login.jsp");
            }else {
                filterChain.doFilter(req,resp);
            }
        }
    }
}
