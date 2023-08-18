package com.learnjsp.service;
import com.learnjsp.mapper.UserMapper;
import com.learnjsp.pojo.User;
import com.learnjsp.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;

public class UserService {

    public boolean isLoginOk(String uname, String password) {
        SqlSession sqlSession = SqlSessionFactoryUtils.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername(uname);
        user.setPassword(password);
        int i = userMapper.selectUser(user);
        return i > 0;
    }
    public int addUser(String uname,String password){
        SqlSession sqlSession = SqlSessionFactoryUtils.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername(uname);
        user.setPassword(password);
        int i = userMapper.addUser(user);
        return i;
    }
}
