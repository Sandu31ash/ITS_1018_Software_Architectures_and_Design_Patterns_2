package lk.ijse.ad2cwpaymentservice.controller;

import lk.ijse.ad2cwpaymentservice.dto.PaymentDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/payment")
public class PaymentController {

    @GetMapping("/health")
    public String checkHealth(){
        return "Payment health ok!";
    }

    @PostMapping("save")
    public PaymentDTO savePayment(@RequestBody PaymentDTO payment){
        payment.setPaymentCode(payment.getPaymentCode()+" updated code");
        payment.setDate(payment.getDate());
        payment.setTime(payment.getTime());
        payment.setPrice(payment.getPrice());

        return payment;
    }

}
