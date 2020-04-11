package com.jinjue.eurekafeign;

import org.springframework.stereotype.Component;

/**
 * @des TODO
 * @date 2019/8/17 16:57
 * @auther xiaoshuigeng
 */
@Component
public class HiHystrix implements EurekaClientFeign {
    @Override
    public String remoteHi(String name) {
        return "hi "+ name+", sorry error!";
    }
}
