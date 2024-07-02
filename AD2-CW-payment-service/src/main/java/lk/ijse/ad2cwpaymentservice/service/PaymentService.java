package lk.ijse.ad2cwpaymentservice.service;

import lk.ijse.ad2cwpaymentservice.dto.PaymentDTO;

public interface PaymentService {

    PaymentDTO savePayment(PaymentDTO paymentDTO);
//    List<PaymentDTO> getAllPayment();
    PaymentDTO getPaymentByPaymentCode(String paymentCode);
//    void updatePayment(PaymentDTO paymentDTO);
//    void deletePayment(String paymentCode);

}
