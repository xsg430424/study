package com.jinjue.eurekaribbonclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @des TODO
 * @date 2019/8/17 10:19
 * @auther xiaoshuigeng
 */
@RestController
public class RibbonController {
    @Autowired
    private RibbonService ribbonService;
    @GetMapping("/hi")
    public String remoteHi(@RequestParam(required = false,defaultValue = "xsg") String name){
        return ribbonService.remoteHi(name);
    }
}
