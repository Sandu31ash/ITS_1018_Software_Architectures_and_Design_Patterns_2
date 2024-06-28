package lk.ijse.ad2cwpaymentservice.util;

import lk.ijse.ad2cwpaymentservice.dto.PaymentDTO;
import lk.ijse.ad2cwpaymentservice.entity.PaymentEntity;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class Mapping {

    private final ModelMapper mapper;

    public PaymentDTO toPaymentDTO(PaymentEntity payment) {
        return mapper.map(payment, PaymentDTO.class);
    }
    public PaymentEntity toPayment(PaymentDTO paymentDTO) {
        return mapper.map(paymentDTO, PaymentEntity.class);
    }
    public List<PaymentDTO> toPaymentDTOList(List<PaymentEntity> payments) {
        return mapper.map(payments, List.class);
    }


}
