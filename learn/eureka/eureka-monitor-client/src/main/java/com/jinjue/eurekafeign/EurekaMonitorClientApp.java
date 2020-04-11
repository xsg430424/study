package com.jinjue.eurekafeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @des TODO
 * @date 2019/8/17 9:47
 * @auther xiaoshuigeng
 */
@EnableTurbine
@EnableHystrix
@EnableHystrixDashboard
@SpringBootApplication
public class EurekaMonitorClientApp {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMonitorClientApp.class,args);
    }
}
