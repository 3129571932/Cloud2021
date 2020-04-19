package com.hxc.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulPaymentMain8500 {
    public static void main(String[] args) {

        SpringApplication.run(ConsulPaymentMain8500.class,args);

    }
}
