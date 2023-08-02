package org.example.mapper;

import org.apache.ibatis.annotations.Param;
import org.example.pojo.User;

import java.util.List;

public interface UserMapper {
    int updateUser(User user);

    int deleteByIds(@Param("myIds") int[] ids);

    List<User> selectUser(@Param("myIds") int[] ids);

    int Login(User user);
}
