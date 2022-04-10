package com.Visional.project.api;

import com.Visional.project.api.support.UserSupport;
import com.Visional.project.domain.JsonResponse;
import com.Visional.project.domain.User;
import com.Visional.project.domain.UserInfo;
import com.Visional.project.service.UserService;
import com.Visional.project.service.util.RSAUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController // Constroller that is RESTful
public class UserAPI {

    @Autowired // insert dependency or instance of Object
    private UserService userService;

    @Autowired
    private UserSupport userSupport;

    @GetMapping("/users")
    public JsonResponse<User> getUserInfo(){
        Long UserID = userSupport.getCurrentUserID();
        User user = userService.getUserInfo(UserID);

        return new JsonResponse<>(user);
    }

    // ============= api for getting RSA Public Key ================
    @GetMapping("/rsa-pks") // RSA encryption public key
    public JsonResponse<String> getRsaPublicKey(){
        String pk = RSAUtil.getPublicKeyStr();
        // Request Success
        return new JsonResponse<>(pk);
    }

    // =============== api for User Sign-Up ================
    @PostMapping("/users")
    // Request Body: 前端传值时，将User类进行封装为JSON类型传给后端
    public JsonResponse<String> addUser(@RequestBody User user){
        userService.addUser(user);
        return JsonResponse.success();
    }

    // =============== api for User Login ================
    @PostMapping("/user-tokens")
    public JsonResponse<String> login(@RequestBody User user) throws Exception {
        // user token - 用户凭证
        String token = userService.login(user);
        return new JsonResponse<>(token); // sent to frontend
    }

    @PutMapping("/users")
    public JsonResponse<String> updateUsers(@RequestBody User user) throws Exception{
        Long userId = userSupport.getCurrentUserID();
        user.setId(userId);
        userService.updateUsers(user);
        return JsonResponse.success();
    }

    @PutMapping("/user-infos")
    public JsonResponse<String> updateUserInfos(@RequestBody UserInfo userinfo){
        Long userID = userSupport.getCurrentUserID();
        userinfo.setUserID(userID);
        userService.UpdateUserInfos(userinfo);
        return JsonResponse.success();
    }


}

























