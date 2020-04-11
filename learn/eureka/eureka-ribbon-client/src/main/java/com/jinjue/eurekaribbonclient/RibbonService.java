package com.jinjue.eurekaribbonclient;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @des TODO
 * @date 2019/8/17 10:38
 * @auther xiaoshuigeng
 */
@Service
public class RibbonService {
    @Autowired
    private RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "hiError")
    public String remoteHi(String name){
        return restTemplate.getForObject("http://eureka-client/hi?name="+name,String.class);
    }
    public String hiError(String name){
        return "hi "+ name+", sorry error!";
    }
}
