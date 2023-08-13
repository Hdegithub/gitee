package com.learnweb;

import com.learnweb.mapper.UserMapper;
import com.learnweb.pojo.User;
import com.learnweb.utils.SqlUtils;
import org.apache.ibatis.session.SqlSession;

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
        if ("".equals(pwd) || "".equals(pwd2)) {
            writer.write("密码不允许为空");
            writer.flush();
            return;
        }
        if (!pwd.equals(pwd2)) {
            writer.write("两次密码不一致");
        }
        User user = new User();
        user.setUserName(uname);
        user.setUserPassword(pwd);
        // 1，检查占用
        boolean isUsed = isAlreadyUsed(uname);
        if (isUsed) {
            writer.write("用户名：" + uname + " 已经被占用了!");
            writer.flush();
            return;
        }
        //增加数据
        int rs = addUser(user);
        if (rs > 0) {
            writer.write("注册成功");
        } else {
            writer.write("注册失败");
        }
        writer.write("<br/>");
        writer.write("<a href=\"login.html\">返回登录</a>");
        writer.write("<br/>");
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

    private boolean isAlreadyUsed(String username) {
        SqlSession sqlSession = SqlUtils.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int result = userMapper.selectByUname(username);
        if (result > 0) {
            //用户名已经被占用了
            return true;
        } else {
            return false;
        }
    }

    private int addUser(User user) {
        SqlSession sqlSession = SqlUtils.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //sql 语句返回的int ，含义： 你发送的sql 影响了多少条记录 {insert ,update ,delete}
        int rs = userMapper.insertByUnamePass(user);
        return rs;
    }
}
