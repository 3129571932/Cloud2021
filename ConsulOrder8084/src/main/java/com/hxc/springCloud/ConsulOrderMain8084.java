package com.hxc.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulOrderMain8084 {

    public static void main(String[] args) {
        SpringApplication.run(ConsulOrderMain8084.class,args);
    }

}
