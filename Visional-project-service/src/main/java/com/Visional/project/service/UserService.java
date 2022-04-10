package com.Visional.project.service;

import com.Visional.project.dao.UserDAO;
import com.Visional.project.domain.User;
import com.Visional.project.domain.UserInfo;
import com.Visional.project.domain.constant.UserConstant;
import com.Visional.project.domain.exception.ConditionException;
import com.Visional.project.service.util.MD5Util;
import com.Visional.project.service.util.RSAUtil;
import com.Visional.project.service.util.TokenUtil;
import com.mysql.cj.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    // ============ Look-up user in database by 'Phone' ==============
    public User getUserByPhone(String Phone){
        return userDAO.getUserByPhone(Phone);
    }

    // ============ add user to database ============
    public void addUser(User user) {
        String Phone = user.getPhone();
        // --- check if user's phone num is valid ---
        if(StringUtils.isNullOrEmpty(Phone)){
            throw new ConditionException("Phone number cannot be empty!");
        }
        User dbUser = this.getUserByPhone(Phone);
        // --- If user already exist ---
        if(dbUser != null){
            throw new ConditionException("This phone number is already used!");
        }
        // --- Record user sign-up information ---
        Date now = new Date(); // time_stamp
        String salt = String.valueOf(now.getTime()); // use time_stamp as salt value
        String rawPassword;

        // decode password sent from frontend
        String password = user.getPassword();
        try {
            rawPassword = RSAUtil.decrypt(password);
        }
        catch (Exception e){
            throw new ConditionException("Password decrypt failed!");
        }

        // MD5 encrypting user's password
        String md5Password = MD5Util.sign(rawPassword, salt, "UTF-8");

        // insert into 't_user' table
        user.setSalt(salt);
        user.setPassword(md5Password);
        user.setCreateTime(now);
        userDAO.addUser(user);

        // insert into 't_user_info' table
        UserInfo userInfo = new UserInfo();
        userInfo.setUserID(user.getId());
        userInfo.setNickname(UserConstant.DEFAULT_NICKNAME);
        userInfo.setBirthday(UserConstant.DEFAULT_BRITHDAY);
        userInfo.setGender(UserConstant.GENDER_UNKNOW);
        userInfo.setCreateTime(now);
        userDAO.addUserInfo(userInfo);

        return;
    }

    // ============ user Login ============
    public String login(User user) throws Exception {
        String Phone = user.getPhone() == null ? "" : user.getPhone();
        String Email = user.getEmail() == null ? "" : user.getEmail();

        if(StringUtils.isNullOrEmpty(Phone) && StringUtils.isNullOrEmpty(Email)){
            throw new ConditionException("Parameters Error!");
        }

        User dbUser = this.userDAO.getUserByPhoneOrEmail(Phone, Email);
        // --- if user does not exist ---
        if(dbUser == null){
            throw new ConditionException("User doesn't exist!");
        }

        // --- check if password is correct ---
        String password = user.getPassword();
        String rawPassword;
        try {
            rawPassword = RSAUtil.decrypt(password);
        }
        catch (Exception e){
            throw new ConditionException("Password decrypt failed!");
        }
        String salt = dbUser.getSalt();
        String md5Password = MD5Util.sign(rawPassword, salt, "UTF-8");

        // when password is wrong
        if(!md5Password.equals(dbUser.getPassword())){
            throw new ConditionException("Wrong Password!");
        }

        // Valid user: generate Token and sent to frontend
        return TokenUtil.generateToken(dbUser.getId());
    }

    public User getUserInfo(Long UserID) {
        User user = userDAO.getUserByID(UserID);
        UserInfo userInfo = userDAO.getUserInfoByUserID(UserID);
        user.setUserInfo(userInfo);
        return user;
    }


    public void updateUsers(User user) throws Exception{
        Long id = user.getId();
        User dbUser = userDAO.getUserByID(id);
        if(dbUser == null){
            throw new ConditionException("User not exist！");
        }
        if(!StringUtils.isNullOrEmpty(user.getPassword())){
            String rawPassword = RSAUtil.decrypt(user.getPassword());
            String md5Password = MD5Util.sign(rawPassword, dbUser.getSalt(), "UTF-8");
            user.setPassword(md5Password);
        }
        user.setUpdateTime(new Date());
        userDAO.updateUsers(user);
        return;
    }

    public void UpdateUserInfos(UserInfo userinfo) {
        userinfo.setUpdateTime(new Date());
        userDAO.updateUserInfos(userinfo);
        return;
    }
}













