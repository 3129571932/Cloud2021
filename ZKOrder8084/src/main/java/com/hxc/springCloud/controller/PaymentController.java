package com.hxc.springCloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private RestTemplate restTemplate;

    private static final String URL="http://zkpayment";

    @GetMapping(value = "/consumer/zk/payment")
    public String get(){
        return restTemplate.getForObject(URL+"/payment/get",String.class);
    }

}
