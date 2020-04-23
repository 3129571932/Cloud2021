package com.hxc.springCloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class PaymentController {

    @Resource
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String URL;

    @GetMapping(value = "/consumer/payment/getPort/")
    public String getPort(){
        return restTemplate.getForObject(URL+"/payment/getPort/",String.class);
    }

}
