package com.hxc.springCloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "PAYMENT-HYSTRIX",fallback = PaymentFallBackService.class)
@Component
public interface PaymentService {
    @GetMapping(value = "/hystrix/ok/{id}")
    public String ok(@PathVariable(value = "id") Integer id);

    @GetMapping(value = "/hystrix/timeout/{id}")
    public String Timeout(@PathVariable(value = "id") Integer id);

}
