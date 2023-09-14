package com.newstest.mapper;

import com.newstest.domain.AdminUser;
import org.apache.ibatis.annotations.Param;

/**
* @author 29484
* @description 针对表【tb_admin_user】的数据库操作Mapper
* @createDate 2023-09-08 15:41:59
* @Entity com.newstest.domain.AdminUser
*/
public interface AdminUserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(AdminUser record);

    int insertSelective(AdminUser record);

    AdminUser selectByPrimaryKey(Integer adminUserId);

    int updateByPrimaryKeySelective(AdminUser record);

    int updateByPrimaryKey(AdminUser record);

    //登陆
    AdminUser login(@Param("userName") String userName, @Param("password") String password);
}
