package com.hxc.springCloud.service;

public interface PaymentService {
    public String payment_ok(Integer id);
    public String payment_Timeout(Integer id);
    public String paymentCircuitBreaker(Integer id);
    public String paymentCircuitBreaker_fallback(Integer id);
}
