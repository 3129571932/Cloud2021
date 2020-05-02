package com.hxc.springCloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA(){
        System.out.println("===============i");
        return "---------testA";
    }

    @GetMapping("/testB")
    public String testB(){
        return "---------testB";
    }

    @SentinelResource(value = "testC",blockHandler = "errorFallBack")
    @GetMapping(value = "/testC")
    public String testC(@RequestParam(value = "p1",required = false)String p1,
                        @RequestParam(value = "p2",required = false)String p2){
        return "============testC";
    }
    public String errorFallBack(String p1, String p2, BlockException exception){
        return "==============errorFallBack";
    }
}
