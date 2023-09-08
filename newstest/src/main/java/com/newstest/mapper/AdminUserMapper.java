package com.newstest.mapper;

import com.newstest.domain.AdminUser;

/**
* @author 29484
* @description 针对表【tb_admin_user】的数据库操作Mapper
* @createDate 2023-09-08 15:41:59
* @Entity com.newstest.domain.TbAdminUser
*/
public interface AdminUserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(AdminUser record);

    int insertSelective(AdminUser record);

    AdminUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AdminUser record);

    int updateByPrimaryKey(AdminUser record);

}
