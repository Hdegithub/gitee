package com.learnweb;

import com.learnweb.mapper.UserMapper;
import com.learnweb.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
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
        SqlSession sqlSession = openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUserName(uname);
        user.setUserPassword(pwd);
        int cnt = userMapper.selectByUnamePass(user);
        if (cnt > 0) {
            writer.write("登陆成功! 欢迎您: " + uname);
            //页面跳转 ，用request.setAttribute 把用户名传递到下一个servlet
            // mainServlet 首页servlet  显示欢迎您：用户名
        } else {
            writer.write("登陆失败！");
        }
    }

    private static SqlSession openSession() {
        //1. 加载mybatis的核心配置文件，获取 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //会话
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2. 获取SqlSession对象，用它来执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        return sqlSession;
    }
}

