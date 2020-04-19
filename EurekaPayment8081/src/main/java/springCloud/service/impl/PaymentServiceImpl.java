package springCloud.service.impl;

import com.hxc.springCloud.entity.Payment;
import org.springframework.stereotype.Service;
import springCloud.dao.PaymentDao;
import springCloud.service.PaymentService;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
