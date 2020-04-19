package com.hxc.springCloud.controller;

import com.hxc.springCloud.entity.CommonResult;
import com.hxc.springCloud.entity.Payment;
import com.hxc.springCloud.service.PaymentFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class PaymentController {
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable(value = "id")Long id){
       return paymentFeignService.getPaymentById(id);
    }

}
