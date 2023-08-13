package com.learnweb.mapper;

import com.learnweb.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    //用户名和密码登陆验证
    int selectByUnamePass(User user);

    int insertByUnamePass(User user);

    int selectByUname(@Param("myusername") String uname);

    int insertUserWithDetail(User user);

    //模糊查询，可能返回多条记录，需要用集合
    List<User> selectUserByName(@Param("userName") String uname);
}
