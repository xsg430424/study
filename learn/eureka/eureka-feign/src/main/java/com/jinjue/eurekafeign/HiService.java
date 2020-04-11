package com.jinjue.eurekafeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @des TODO
 * @date 2019/8/17 11:17
 * @auther xiaoshuigeng
 */
@Service
public class HiService {
    @Autowired
    private EurekaClientFeign eurekaClientFeign;
    public String hi(String name){
        return eurekaClientFeign.remoteHi(name);
    }
}
