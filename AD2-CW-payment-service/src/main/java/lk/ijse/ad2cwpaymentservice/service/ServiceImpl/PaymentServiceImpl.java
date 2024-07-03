package lk.ijse.ad2cwpaymentservice.service.ServiceImpl;

import jakarta.transaction.Transactional;
import lk.ijse.ad2cwpaymentservice.controller.PaymentController;
import lk.ijse.ad2cwpaymentservice.dao.PaymentRepo;
import lk.ijse.ad2cwpaymentservice.dto.PaymentDTO;
import lk.ijse.ad2cwpaymentservice.entity.PaymentEntity;
import lk.ijse.ad2cwpaymentservice.service.PaymentService;
import lk.ijse.ad2cwpaymentservice.util.Mapping;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepo paymentRepo;

    private final Mapping mapping;

//    @Autowired
//    private PaymentController paymentController;

    @Override
    public PaymentDTO savePayment(PaymentDTO paymentDTO) {
//        PaymentDTO savedPaymentDTO = mapping.toPaymentDTO(paymentRepo.save(mapping.toPayment(paymentDTO)));
//        paymentController.updateTicketInPaymentClass(savedPaymentDTO.getTicketCode());
//        return savedPaymentDTO;
        return mapping.toPaymentDTO(paymentRepo.save(mapping.toPayment(paymentDTO)));
    }

    @Override
    public PaymentDTO getPaymentByPaymentCode(String paymentCode) {
        return mapping.toPaymentDTO(paymentRepo.getPaymentByPaymentCode(paymentCode));
    }

    @Override
    public List<PaymentDTO> getAllPayment() {
        return mapping.toPaymentDTOList(paymentRepo.findAll());
    }

//    @Override
//    public void updatePayment(PaymentDTO paymentDTO) {
//        PaymentEntity payment = paymentRepo.getPaymentByPaymentCode(paymentDTO.getPaymentCode());
//        payment.setTicketCode(paymentDTO.getTicketCode());
//        payment.setUserId(paymentDTO.getUserId());
//        payment.setVehicleNo(paymentDTO.getVehicleNo());
//        payment.setDate(paymentDTO.getDate());
//        payment.setTime(paymentDTO.getTime());
//        payment.setPayMethod(paymentDTO.getPayMethod());
//        payment.setTicketPrice(paymentDTO.getTicketPrice());
//        paymentRepo.save(payment);
//    }

}
