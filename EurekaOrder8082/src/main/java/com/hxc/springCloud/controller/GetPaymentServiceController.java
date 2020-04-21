package com.hxc.springCloud.controller;

import com.hxc.springCloud.entity.CommonResult;
import com.hxc.springCloud.entity.Payment;
import lombok.extern.log4j.Log4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Log4j
public class GetPaymentServiceController {

    @Resource
    private RestTemplate restTemplate;

    private static final String URL = "http://PAYMENT";

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
        return restTemplate.postForObject(URL+"/payment/create",payment, CommonResult.class);
    }
    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id")Long id){
        return restTemplate.getForObject(URL+"/payment/get/"+id,CommonResult.class);
    }
    @GetMapping(value = "/consumer/payment/zipkin")
    public String paymentZipkin(){
        String result = restTemplate.getForObject(URL+"/payment/zipkin/",String.class);
        return result;
    }

}
