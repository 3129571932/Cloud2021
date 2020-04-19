package com.hxc.springCloud.service.impl;

import cn.hutool.core.util.IdUtil;
import com.hxc.springCloud.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public String payment_ok(Integer id) {
        String result = "ok:"+Thread.currentThread().getName()+"ok:"+id;
        return result;
    }

    @HystrixCommand(fallbackMethod = "paymentTimeout_handler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "400")
    })
    @Override
    public String payment_Timeout(Integer id) {
        //报错
        int a = 10/0;
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String result = "timeout:"+Thread.currentThread().getName()+"timeout:"+id;
        return result;
    }

    public String paymentTimeout_handler(Integer id){
        return "当前服务访问人数过多，请稍后访问";
    }
    //服务熔断
    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60"),
    })
    @Override
    public String paymentCircuitBreaker(@PathVariable(value = "id") Integer id) {
        if(id<0){
            throw new RuntimeException("id 不能为负数");
        }
        String serialNumber = IdUtil.simpleUUID();
        return Thread.currentThread().getName()+"\t"+"调用成功，流水号"+serialNumber;
    }

    @Override
    public String paymentCircuitBreaker_fallback(@PathVariable(value = "id") Integer id) {
        return "id不能为负数，请稍后再试";
    }
}
