package com.neo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类说明
 * <p>
 *
 * @author 肖水庚
 * @version 1.0.0
 * @date 2019/1/26
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello spring boot!";
    }
}
