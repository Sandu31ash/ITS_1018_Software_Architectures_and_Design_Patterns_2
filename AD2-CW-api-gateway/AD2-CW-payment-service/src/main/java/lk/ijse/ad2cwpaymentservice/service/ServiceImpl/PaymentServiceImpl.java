package lk.ijse.ad2cwpaymentservice.service.ServiceImpl;

import jakarta.transaction.Transactional;
import lk.ijse.ad2cwpaymentservice.dao.PaymentRepo;
import lk.ijse.ad2cwpaymentservice.dto.PaymentDTO;
import lk.ijse.ad2cwpaymentservice.service.PaymentService;
import lk.ijse.ad2cwpaymentservice.util.Mapping;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepo paymentRepo;

    private final Mapping mapping;

    @Override
    public PaymentDTO savePayment(PaymentDTO paymentDTO) {
        return mapping.toPaymentDTO(paymentRepo.save(mapping.toPayment(paymentDTO)));
    }

}
