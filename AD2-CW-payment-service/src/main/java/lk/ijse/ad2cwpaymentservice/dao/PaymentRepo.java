package lk.ijse.ad2cwpaymentservice.dao;

import lk.ijse.ad2cwpaymentservice.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<PaymentEntity,  String> {

    PaymentEntity getPaymentByPaymentCode(String paymentCode);

}
