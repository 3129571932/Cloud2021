package com.hxc.springCloud.service;

import com.hxc.springCloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param(value = "id")Long id);
}
