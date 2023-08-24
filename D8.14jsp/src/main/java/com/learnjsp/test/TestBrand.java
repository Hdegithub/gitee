package com.learnjsp.test;

import com.auth0.jwt.interfaces.Claim;
import com.learnjsp.pojo.User;
import com.learnjsp.utils.JwtUtil;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class TestBrand {
    @Test
    public void testToken() {
        User user = new User();
        user.setId(9);
        user.setUsername("tom");

        String token = JwtUtil.createToken(user);
        System.out.println(token);

        //生成的token 返回给前端，前端后续的请求都携带这个token，用来验明身份

        Map<String, Claim> stringClaimMap = JwtUtil.verifyToken(token);
        System.out.println(stringClaimMap.get("id").asInt());
        System.out.println(stringClaimMap.get("userName").asString());
    }
}
