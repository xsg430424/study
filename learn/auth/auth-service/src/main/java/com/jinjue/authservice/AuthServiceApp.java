package com.jinjue.authservice;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @des TODO
 * @date 2019/8/29 22:49
 * @auther xiaoshuigeng
 */
@SpringBootApplication
@EnableEurekaClient
@EnableResourceServer
public class AuthServiceApp {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("z");
        list.add("a");
        list.add("a");
        list.add("b");
        System.out.println(list);
        Set<String> set=new HashSet<>();
        set.add("z");
        set.add("a");
        set.add("a");
        set.add("b");
        set.add("b");
        System.out.println(set);
    }
}
