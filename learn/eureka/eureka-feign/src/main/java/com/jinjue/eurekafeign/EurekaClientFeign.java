package com.jinjue.eurekafeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @des TODO
 * @date 2019/8/17 11:18
 * @auther xiaoshuigeng
 */
@FeignClient(value = "eureka-client",configuration = FeignConfig.class,fallback = HiHystrix.class)
public interface EurekaClientFeign {
    @GetMapping(value="/hi")
    String remoteHi(@RequestParam(value="name") String name);
}
