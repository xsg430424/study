package com.forezp.client;

import com.forezp.entity.JWT;
import org.springframework.stereotype.Component;

/**
 * @des
 * @date 2020/3/22 0022 23:03
 * @auther xiaoshuigeng
 */
@Component
public class AuthServiceHystrix implements AuthServiceClient {
    @Override
    public JWT getToken(String authorization, String type, String username, String password) {
        System.out.println("----------ops getToken histrix ---------");
        return null;
    }
}
