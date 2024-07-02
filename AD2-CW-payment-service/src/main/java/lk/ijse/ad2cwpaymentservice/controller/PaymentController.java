package lk.ijse.ad2cwpaymentservice.controller;

import lk.ijse.ad2cwpaymentservice.dto.PaymentDTO;
import lk.ijse.ad2cwpaymentservice.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/payment")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @GetMapping("/health")
    public String checkHealth(){
        return "Payment health ok!";
    }

    @PostMapping("save")
    public PaymentDTO savePayment(@RequestBody PaymentDTO paymentDTO){
//        payment.setPaymentCode(payment.getPaymentCode()+" updated code");
//        payment.setDate(payment.getDate());
//        payment.setTime(payment.getTime());
//        payment.setPrice(payment.getPrice());
//
//        return payment;

        System.out.println(paymentDTO);
            return paymentService.savePayment(paymentDTO);

    }

    @GetMapping("get")
    public ResponseEntity<?> getPaymentByPaymentCode(@RequestHeader String paymentCode){
        PaymentDTO paymentDTO = paymentService.getPaymentByPaymentCode(paymentCode);
        return ResponseEntity.ok(paymentDTO);
    }

//    @PutMapping(value = "/update", consumes = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<?> updatePayment(@RequestBody PaymentDTO paymentDTO) {
//        paymentService.updatePayment(paymentDTO);
//        return ResponseEntity.ok().build();
//    }

}
