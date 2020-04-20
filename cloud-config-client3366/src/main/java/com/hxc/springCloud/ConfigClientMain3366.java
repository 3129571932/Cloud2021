package com.hxc.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@RefreshScope
@EnableEurekaClient
public class ConfigClientMain3366 {

    public static void main(String[] args) {

        SpringApplication.run(ConfigClientMain3366.class,args);

    }

}
