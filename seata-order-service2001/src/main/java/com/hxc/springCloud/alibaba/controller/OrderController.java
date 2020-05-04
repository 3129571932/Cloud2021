package com.hxc.springCloud.alibaba.controller;

import com.hxc.springCloud.alibaba.domain.CommonResult;
import com.hxc.springCloud.alibaba.domain.Order;
import com.hxc.springCloud.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderController {
    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order){
        orderService.create(order);
        return new CommonResult(200,"dingdnachuangjianchenggong");
    }
}
