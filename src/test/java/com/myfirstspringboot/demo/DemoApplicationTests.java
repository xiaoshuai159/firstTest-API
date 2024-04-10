package com.myfirstspringboot.demo;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class DemoApplicationTests {

//    @Test
//    public void testGen() {
//        Map<String, Object> claims = new HashMap<>();
//        claims.put("id",1);
//        claims.put("username","张三");
//        // 生成jwt的代码
//        String token = JWT.create()
//                .withClaim("user",claims) // 添加载荷
//                .withExpiresAt(new Date(System.currentTimeMillis()+1000*60*60*12)) // 生效时间
//                .sign(Algorithm.HMAC256("itheima"));// 指定算法，配置密钥
//        System.out.println(token);
//    }
//    @Test
//    public void testParse(){
//        String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9." +
//                "eyJleHAiOjE3MDUwMDc4NzQsInVzZXIiOnsiaWQiOjEsInVzZXJuYW1lIjoi5byg5LiJIn19." +
//                "03bVEOJAKhrdQTJ5OC8ebDL90-B0Dmha70YAI-Ux8lI";
//        JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256("itheima")).build();
//        DecodedJWT decodedJWT = jwtVerifier.verify(token);
//        Map<String, Claim> claims = decodedJWT.getClaims();
//        System.out.println(claims.get("user"));
//    }


}
