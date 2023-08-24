package com.learnjsp.mapper;

import com.learnjsp.pojo.User;

public interface UserMapper {

    int selectUser(User user);

    int addUser(User user);

    User selectUserInfo(User user);
}
