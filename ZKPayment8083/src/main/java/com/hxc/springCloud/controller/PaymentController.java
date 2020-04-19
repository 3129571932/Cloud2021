package com.hxc.springCloud.controller;

import com.hxc.springCloud.entity.CommonResult;
import com.hxc.springCloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {

    @GetMapping(value = "/payment/get")
    public String getPaymentById(){
        return "zk";
    }

}
