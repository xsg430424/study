package com.forezp.client;


import com.forezp.entity.JWT;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @des
 * @date 2020/3/22 0022 22:55
 * @auther xiaoshuigeng
 */
@FeignClient(value = "uaa-service",fallback = AuthServiceHystrix.class)
public interface AuthServiceClient {
    @PostMapping(value = "/oauth/token")
    JWT getToken(@RequestHeader(value = "Authorization") String authorization,
                 @RequestParam(value = "grant_type") String type,
                 @RequestParam(value = "username") String username,
                 @RequestParam(value = "password") String password);
}
