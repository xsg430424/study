package com.jinjue.eurekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @des TODO
 * @date 2019/8/17 10:19
 * @auther xiaoshuigeng
 */
@RestController
public class HiController {
    @Value("${server.port}")
    String port;
    @GetMapping("/hi")
    public String hi(@RequestParam String name){
        return "hi "+ name+", i am from port:"+port;
    }
}
