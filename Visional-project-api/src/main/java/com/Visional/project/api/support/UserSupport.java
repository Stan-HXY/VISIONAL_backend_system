package com.Visional.project.api.support;

import com.Visional.project.domain.exception.ConditionException;
import com.Visional.project.service.util.TokenUtil;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Component
public class UserSupport {

    /*Token 传给前端后，前端会存在local storage里，下一次请求接口时，会从local storage里拿token，放在request header里
    * 这样所有跟用户相关的接口都放在request header中，就不用区分每个接口需要哪些参数
    * ----- 所以UserSupport就是一个general method, 从request header中同意获取前端传来的token，并进行解析（verifyToken()）
    * */
    public Long getCurrentUserID(){ // Request Catcher
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        String token = requestAttributes.getRequest().getHeader("token");
        Long UserID = TokenUtil.verifyToken(token);
        if(UserID < 0){
            throw new ConditionException("Invalid User!");
        }
        return UserID;
    }

}
















