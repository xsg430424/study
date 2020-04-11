package com.jinjue.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @des TODO
 * @date 2019/8/17 9:47
 * @auther xiaoshuigeng
 */

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class EurekaZuulClientApp {
    public static void main(String[] args) {
        SpringApplication.run(EurekaZuulClientApp.class,args);
    }
}
