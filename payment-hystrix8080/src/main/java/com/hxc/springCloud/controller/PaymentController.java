package com.hxc.springCloud.controller;

import com.hxc.springCloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/hystrix/ok/{id}")
    public String ok(@PathVariable(value = "id") Integer id){
        return paymentService.payment_ok(id);
    }

    @GetMapping(value = "/hystrix/timeout/{id}")
    public String Timeout(@PathVariable(value = "id") Integer id){
        return paymentService.payment_Timeout(id);
    }

    @GetMapping(value = "/payment/circuit/{id}")
    public String paymentCircuitBreaker(@PathVariable(value = "id")Integer id){
        String result = paymentService.paymentCircuitBreaker(id);
        return result;
    }
}
