package com.hxc.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class EurekaPaymentMain8080 {
    public static void main(String[] args) {

        SpringApplication.run(EurekaPaymentMain8080.class,args);

    }
}
