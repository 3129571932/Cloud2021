package com.hxc.springCloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class PaymentController {

    @Resource
    private RestTemplate restTemplate;

    private static final String URL = "http://consul-payment";

    @GetMapping(value = "/consumer/payment/get")
    public String get(){
        return restTemplate.getForObject(URL+"/payment/get",String.class);
    }
}
