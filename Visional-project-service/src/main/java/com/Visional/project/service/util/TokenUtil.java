package com.Visional.project.service.util;

import com.Visional.project.domain.exception.ConditionException;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Calendar;
import java.util.Date;

public class TokenUtil {

    private static final String ISSUER = "Issuer";

    // -------- JWT 生成Token ---------
    public static String generateToken(Long UserID) throws Exception{
        Algorithm algorithm = Algorithm.RSA256(RSAUtil.getPublicKey(), RSAUtil.getPrivateKey());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.SECOND, 30); //设置token过期时间为30秒
        return JWT.create().withKeyId(String.valueOf(UserID))
                .withIssuer(ISSUER)
                .withExpiresAt(calendar.getTime())
                .sign(algorithm);
    }

    // -------- JWT 验证token ---------
    public static Long verifyToken(String token){
        try{
            Algorithm algorithm = Algorithm.RSA256(RSAUtil.getPublicKey(), RSAUtil.getPrivateKey());
            JWTVerifier verifier = JWT.require(algorithm).build();
            DecodedJWT jwt = verifier.verify(token);
            String UserID = jwt.getKeyId();
            return Long.valueOf(UserID);
        }
        catch (TokenExpiredException e){
            throw new ConditionException("555", "Token has expired!");
        }
        catch (Exception e){
            throw new ConditionException("Invalid Token!");
        }


    }
}























