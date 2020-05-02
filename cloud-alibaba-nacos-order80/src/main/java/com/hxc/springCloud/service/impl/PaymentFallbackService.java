package com.hxc.springCloud.service.impl;

import com.hxc.springCloud.entity.CommonResult;
import com.hxc.springCloud.entity.Payment;
import com.hxc.springCloud.service.PaymentService;
import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
