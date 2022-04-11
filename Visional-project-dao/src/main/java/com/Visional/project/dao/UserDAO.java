package com.Visional.project.dao;

import com.Visional.project.domain.User;
import com.Visional.project.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Set;

// Used for interaction with Database
@Mapper // Mybatis: mapping object into XML
public interface UserDAO {


    // Function body is SQL Query, in XML file
    User getUserByPhone(String Phone);

    // return total record number | add user into t_user
    Integer addUser(User user);

    // return total record number | add user into t_user_info
    Integer addUserInfo(UserInfo userInfo);

    User getUserByID(Long id);

    UserInfo getUserInfoByUserID(Long UserID);

    Integer updateUsers(User user);

    User getUserByPhoneOrEmail(@Param("Phone") String Phone, @Param("Email") String Email);

    Integer updateUserInfos(UserInfo userinfo);

    List<UserInfo> getUserInfoByUserIDs(Set<Long> UserIDList);
}
