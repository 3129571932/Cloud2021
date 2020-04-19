package com.hxc.springCloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallBackService implements PaymentService {
    @Override
    public String ok(Integer id) {
        return "---PaymentFallBackService fall back";
    }

    @Override
    public String Timeout(Integer id) {
        return "---PaymentFallBackService fall back timeout";
    }
}
