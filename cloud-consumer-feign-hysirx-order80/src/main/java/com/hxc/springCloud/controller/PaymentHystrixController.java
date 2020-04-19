package com.hxc.springCloud.controller;

import com.hxc.springCloud.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentHystrixController {

    @Resource
    private PaymentService paymentService;

    @GetMapping("/consumer/feign/hystrix/ok/{id}")
    public String ok(@PathVariable(value = "id")Integer id){
        return paymentService.ok(id);
    }


    @GetMapping("/consumer/feign/hystrix/timeout/{id}")
    public String timeout(@PathVariable(value = "id")Integer id){
        //直接出错
        return paymentService.Timeout(id);
    }

}
